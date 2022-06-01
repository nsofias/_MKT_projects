/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SKOPIA;

import diligent_MKT.Ticket_FYROM;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.others.OnTimeDaemon;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailSender_new;

/**
 *
 * @author nsofias
 */
public class ReportsCreator extends OnTimeDaemon {

    ArrayList<Diligent_Daemon> myGroupBy_Daemons;
    private String smtpUser = "", smtpPass = "", smtpServer = "", report_mail_recipients = "", smtpSender = "";

    public ReportsCreator(ArrayList<Diligent_Daemon> myGroupBy_Daemons, String time_for_excecution) {
        super(time_for_excecution);
        this.myGroupBy_Daemons = myGroupBy_Daemons;
    }

    @Override
    public void processDataOnTime() {
        String reports = "01@cpenitas@ote.gr;nsofias@ote.gr;kpanagiotop@ote.gr;ggeorgitse@ote.gr";
        //ArrayList<String> reportsList = new ArrayList();
        try {
            //### REPORTS px. 01@cpenitas@ote.gr,02@cpenitas@ote.gr;nsofias@ote.gr
            //13888.reports = 01@cpenitas@ote.gr;nsofias@ote.gr;kpanagiotop@ote.gr;ggeorgitse@ote.gr           
            Properties properties = new Properties();
            try (FileInputStream myStream = new FileInputStream(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties")) {
                properties.load(myStream);
                smtpSender = properties.getProperty("REPORTS.mailSender");
                smtpUser = properties.getProperty("REPORTS.mailUser");
                smtpPass = properties.getProperty("REPORTS.mailPass");
                smtpServer = properties.getProperty("REPORTS.mailServer");
                report_mail_recipients = properties.getProperty("REPORTS.mail_recipients");
            } catch (Exception e) {
                System.out.println("CCMonitorStatsObjsContainer error: ReportsCreator:" + e.toString());
            }
            System.out.println("sending DiliAgent_Report@" + report_mail_recipients + " via " + smtpServer);
            String body = create_DiliAgent_Report();
            sendReportMail(body, report_mail_recipients, smtpServer, smtpSender, smtpUser, smtpPass);
        } catch (Exception e) {
            System.out.println("ReportsCreator run: " + e.toString());
        } finally {
        }
    }

    public String create_DiliAgent_Report() {
        String str = "";
        try {
            TimeStamp1 fromT = new TimeStamp1();
            System.out.println("fromT1=" + fromT.getNowUnformated());
            fromT.addDays(-1);
            System.out.println("fromT2=" + fromT.getNowUnformated());
            String to = fromT.getNowUnformated().substring(0, 8) + "T235959.000";//20180402T133545.000
            String from = fromT.getNowUnformated().substring(0, 8) + "T000000.000";
            System.out.println("from=" + from + " to=" + to);
            List<nsofiasLib.ote.alarms.Ticket> ticketsList = new ArrayList();
            for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                ticketsList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsAsArrayList());
            }
            try {
                Collections.sort(ticketsList);
            } catch (Exception e) {
            }
            //----------------------------
            str += "<h1> DiligentMKT Statistics of " + fromT.getTodayFormated() + "<h1>";
            System.out.println(str);
            str += "<table width='100%'  border='1'>";
            str += "<tr><th>SR</th><th>Type</th><th>Synopsis</th><th>started</th><th>stopped</th><th>Reported</th><th>criticality</th><th>Disconnected customers</th><th>affected customers</th></tr>";

            for (Object myTicketObj : ticketsList) {
                Ticket_FYROM myTicket = (Ticket_FYROM) myTicketObj;
                if (myTicket.getState().equals(Ticket.STATE_PENDING_TO_OPEN) || myTicket.getState().equals(Ticket.STATE_CANCELED)) {
                    continue;
                }
                if (myTicket.getIncidentStartDate().compareTo(from) > 0 && myTicket.getIncidentStartDate().compareTo(to) < 0) {
                    str += "<tr>";
                    str += "<td nowrap>" + myTicket.getSR() + "</td>";
                    str += "<td nowrap>" + myTicket.getType() + "</td>";
                    str += "<td nowrap>" + myTicket.getSYNOPSIS() + "</td>";
                    str += "<td nowrap>" + new TimeStamp1(myTicket.getIncidentStartDate()).getNowFormated() + "</td>";
                    str += "<td nowrap>" + new TimeStamp1(myTicket.getIncidentStoppedDate()).getNowFormated() + "</td>";
                    str += "<td nowrap>" + new TimeStamp1(myTicket.getIncidentReportedDate()).getNowFormated() + "</td>";
                    str += "<td align='right'>" + myTicket.getCriticalityDesc(myTicket.getCriticality()) + "</td>";
                    str += "<td align='right'>" + myTicket.findLinesDisconnected() + "</td>";
                    str += "<td align='right'>" + myTicket.findLinesAffected() + "</td>";
                    str += "<td align='right'>" + myTicket.findActiveLinesAffected() + "</td>";
                    str += "</tr>";
                }
            }

            str += "</table>";
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println(e.toString());
        }
        return str;
    }

    public void sendReportMail(String report, String recipients, String smtpServer, String smtpSender, String smtpUser, String smtpPass) throws Exception {
        String cc = "nsofias@ote.gr";
        MailSender_new myMailSender = new MailSender_new();
        myMailSender.setServer(smtpServer);
        myMailSender.setUser(smtpUser);
        myMailSender.setPass(smtpPass);
        myMailSender.setRecipient(recipients);
        myMailSender.setSender(smtpSender);
        myMailSender.setCc(cc);
        try {
            myMailSender.setSubject("CCM-Dili@gent report");
            myMailSender.setBodyMessage(report);
            myMailSender.sendMail();
        } catch (Exception e) {
            System.out.println("sendReportMail:" + e.toString() + " error:" + e.toString());
        }
    }

    public static void main(String[] args) {
        try {
            ReportsCreator myReportsCreator = new ReportsCreator(new ArrayList<>(), "023000");
            myReportsCreator.setRunning(true);
            myReportsCreator.setDaemonName("ReportsCreator");
            Thread myReportsCreatorThread = new Thread(myReportsCreator);
            myReportsCreatorThread.start();
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:MonitorServletContextListener: error: " + e.toString() + " error:" + e.toString());
        }
    }

}

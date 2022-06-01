package SKOPIA;

import diligent_MKT.Alarm_FYROM;
import diligent_MKT.RemoveServiceElements_ACTION_Thread;
import diligent_MKT.Ticket_FYROM;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import nsofiasLib.databases.DatabaseLogger;
import nsofiasLib.ote.alarms.Alarm;
import nsofiasLib.ote.alarms.Alarm_Parameters;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.others.Parameters;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.MailSender;

/**
 *
 * @author nsofias
 */
public class TicketsUpdateDaemon extends SimpleDaemon {
    String attachement = "yes";
    TimeStamp1 ticketsUpdateDaemonTimeStamp = new TimeStamp1();
    private boolean running;
    private boolean stopped;
    int sleep;
    Config myConfig;
    private TimeStamp1 myDaemonTimeStamp_cycle;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons;

    public TicketsUpdateDaemon(ArrayList<Diligent_Daemon> myGroupBy_Daemons, Config myConfig, int sleep) {
        super(sleep);
        myDaemonTimeStamp_cycle = new TimeStamp1();
        this.sleep = sleep;
        running = false;
        stopped = false;
        this.myGroupBy_Daemons = myGroupBy_Daemons;
        this.myConfig = myConfig;
    }
    
    

    @Override
    public void run() {
        System.out.println("DSLMON_SKOPIA:Start process myTicketsUpdateDaemonThread @ " + new TimeStamp1().getNowFormated());
        stopped = false;
        //------------------
        while (running == true) {
            try {
                Thread.sleep(sleep);
                //-------------------------------
                Alarm_Parameters myParameters = createAlarmParameters();
                for (Diligent_Daemon myDiligent_Daemon : myGroupBy_Daemons) {
                    int PENDING_STATE_DURATION_MIN = myDiligent_Daemon.getMyAlarmDetector().getParameters().PENDING_STATE_DURATION_MIN,
                            OPEN_STATE_VOLUMN_MIN = myDiligent_Daemon.getMyAlarmDetector().getParameters().OPEN_STATE_VOLUMN_MIN,
                            REPEATED_FAULTS_PERIOD = myDiligent_Daemon.getMyAlarmDetector().getParameters().REPEATED_FAULTS_PERIOD,
                            REPEATED_FAULTS_NUMBER = myDiligent_Daemon.getMyAlarmDetector().getParameters().REPEATED_FAULTS_NUMBER;
                    Boolean OPEN_ENABLED = myDiligent_Daemon.getMyAlarmDetector().getParameters().OPEN_ENABLED;
                    //------------
                    Container myContainer = myDiligent_Daemon.getMyStatsObjContainer();
                    if (myContainer.getCCMonitorStatsObjsContainerSize() >= 1) {
                        List<Ticket_FYROM> ticketList = myContainer.getTicketsAsArrayList();
                        for (Ticket_FYROM myTicket : ticketList) {
                            //----------
                            if (myTicket.isBUSY()) {
                                continue;
                            }
                            //----------------
                            updateAlarmsStatus(myTicket, myContainer, REPEATED_FAULTS_PERIOD, REPEATED_FAULTS_NUMBER, myParameters);
                            updateTicketStatus(myTicket, myParameters);
                            //System.out.println("DSLMON_SKOPIA -> " + myTicket.getCollerationString()+" OpenImediately="+myTicket.isOpenImediately()+" "+myTicket.getState()+" "+OPEN_ENABLED+" "+isReadytoOpen((Ticket_FYROM) myTicket, PENDING_STATE_DURATION_MIN,OPEN_STATE_VOLUMN_MIN, myContainer.getMyClock())+" "+myTicket.subType);
                            if (((myTicket.getState().equals(Ticket.STATE_PENDING_TO_OPEN) || myTicket.getState().equals(Ticket.STATE_OPEN_FAILED)) && myTicket.isOpenImediately())
                                    || (myTicket.getState().equals(Ticket.STATE_PENDING_TO_OPEN) && OPEN_ENABLED && isReadytoOpen((Ticket_FYROM) myTicket, PENDING_STATE_DURATION_MIN, OPEN_STATE_VOLUMN_MIN, myContainer.getMyClock()))) {
                                try {
                                    System.out.println("DSLMON_SKOPIA -> createAlarms: OPEN_ACTION:= " + myTicket.getDesc());
                                    OPEN_ACTION_Thread myDslmonTicketStatusUpdateThread = new OPEN_ACTION_Thread(myTicket, myContainer.getEventsLogArrayList(), myParameters);
                                    new Thread(myDslmonTicketStatusUpdateThread).start();
                                } catch (Exception e) {
                                    System.out.println("DSLMON_SKOPIA -> createAlarms: error: header:= " + e.toString());
                                    e.printStackTrace(System.out);
                                    new MailAlert().sendmailAlert("DSLMON_SKOPIA error:",e);
                                }
                            }
                        }
                    }
                    setMyDaemonTimeStamp_cycle(new TimeStamp1());
                    System.out.println("DSLMON_SKOPIA: --->processData TicketsUpdateDaemon ");
                }
                ticketsUpdateDaemonTimeStamp = new TimeStamp1();
            } catch (Exception ex) {
                System.out.println("DSLMON_SKOPIA: TicketsUpdateDaemon error:" + ex.toString());
                ex.printStackTrace(System.out);
            }
        }
        stopped = true;
        System.out.println("DSLMON_SKOPIA: Stop process TicketsUpdateDaemon @ " + new TimeStamp1().getNowFormated());
    }

    private Alarm_Parameters createAlarmParameters() {
        //----------generic Alarm_Parameters--------
        Alarm_Parameters myParameters = new Alarm_Parameters();
        myParameters.setHttp_proxyHost(myConfig.getHttp_proxyHost());
        myParameters.setHttp_proxyPort(myConfig.getHttp_proxyPort());
        myParameters.setERRORS_sendMailAlert(myConfig.isERRORS_sendMailAlert());
        myParameters.setERRORS_mailSender(myConfig.getERRORS_mailSender());
        myParameters.setERRORS_mailServer(myConfig.getERRORS_mailServer());
        myParameters.setERRORS_mail_cc_recipients(myConfig.getERRORS_mail_cc_recipients());
        myParameters.setERRORS_mail_recipients(myConfig.getERRORS_mail_recipients());
        myParameters.setERRORS_mailUser(myConfig.getERRORS_mailUser());
        myParameters.setERRORS_mailPass(myConfig.getERRORS_mailPass());
        myParameters.setTICKETS_sendMailAlert(myConfig.isTICKETS_sendMailAlert());
        myParameters.setTICKETS_mailSender(myConfig.getTICKETS_mailSender());
        myParameters.setTICKETS_mailServer(myConfig.getTICKETS_mailServer());
        myParameters.setTICKETS_mail_cc_recipients(myConfig.getTICKETS_mail_cc_recipients());
        myParameters.setTICKETS_mail_recipients(myConfig.getTICKETS_mail_recipients());
        myParameters.setTICKETS_mailUser(myConfig.getTICKETS_mailUser());
        myParameters.setTICKETS_mailPass(myConfig.getTICKETS_mailPass());
        return myParameters;
    }

    public boolean isReadytoOpen(Ticket_FYROM myTicket, int PENDING_STATE_DURATION_MIN, int OPEN_STATE_VOLUMN_MIN, String myClock) {
        try {
            long disconnected = myTicket.findLinesDisconnected();
            TimeStamp1 T1 = new TimeStamp1(myTicket.getIncidentStartDate());
            TimeStamp1 now = new TimeStamp1(myClock);
            double elapshedTime = now.minutesDiff(T1);
            /*      System.out.println("DSLMON_SKOPIA -> myTicketsUpdateDaemonThread: ticket header:= " + myTicket.getDesc()+" "+disconnected+" "+elapshedTime+" "+myClock+" "+myTicket.getIncidentStartDate());        
         if ((myTicket.getType().equals(AlarmDetector.TYPE_COPPER) && myTicket.getSubType().equals(AlarmDetector_COPPER.SUBTYPE_COPPER_SLOT)&& myTicket.getElementsList().size()==1)//&& disconnected<100)
         || (myTicket.getType().equals(AlarmDetector.TYPE_GPON) && myTicket.getSubType().equals(AlarmDetector_GPON.SUBTYPE_GPON_SLOT)&& myTicket.getElementsList().size()==1))//&& disconnected<100))
         {
         //System.out.println("DSLMON_SKOPIA -> myTicketsUpdateDaemonThread: ticket header:= " + myTicket.getDesc()+" "+"return false");
         return false;
         } */
            return ((elapshedTime >= myTicket.getWaitTime() && disconnected >= OPEN_STATE_VOLUMN_MIN));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("clock is:"+myClock);
            return false;
        }
    }

    public int getStatus() {
        int status = -1;//unknown
        if (running == true) {
            status = 0;//started
        } else if (running == false && stopped == false) {
            status = 1;//stopping 
        } else if (stopped == true) {
            status = 2;//stopped
        }
        return status;
    }

    private void updateAlarmsStatus(Ticket_FYROM myTicket, Container myContainer, int REPEATED_FAULTS_PERIOD, int REPEATED_FAULTS_NUMBER, Alarm_Parameters myParameters) {
        //ArrayList<Alarm_FYROM> closedAlarms = new ArrayList();
        List<Alarm_FYROM> alarmArrayList = myTicket.getElementsList();
        for (Alarm_FYROM myAlarm : alarmArrayList) {
            if (myAlarm.isStilAlive()) {
                TimeStamp1 now = new TimeStamp1();
                try {
                    //----------- UPDATE REPEATED status  ----------------
                    if (myAlarm.isRepeated()) {
                        TimeStamp1 t1 = new TimeStamp1(myContainer.getMyClock());
                        TimeStamp1 t2 = new TimeStamp1(myContainer.getMyClock());
                        t2.addHours(-REPEATED_FAULTS_PERIOD);
                        String T1 = t1.getNowUnformated();
                        String T2 = t2.getNowUnformated();
                        Counters topScorers = myContainer.getTopScorers_events(T1, T2);
                        String alertOrigin = myAlarm.getNetworkElementName();
                        if (topScorers.getCount(alertOrigin) <= REPEATED_FAULTS_NUMBER) {
                            myAlarm.setRepeated(false);
                        }
                    }
                    //--------------------------------------------------
                    boolean closed;
                    double numberOfActiveUsers = myContainer.getLastCount(myAlarm.getNetworkElementName());
                    //int linesRegistered = myAlarm.findLinesRegistered();
                    closed = ((numberOfActiveUsers > myAlarm.geValueStuck()) && !myAlarm.isRepeated()) || myAlarm.getState().equals(Alarm_FYROM.STATE_PENDING_TO_CLOSE);
                    //============== afer closed is found =========================================================
                    if (closed == true) {
                        myAlarm.setState(Alarm.STATE_CLOSED);
                        myAlarm.setAlarmStop(now.getNowUnformated());
                        //****************************--------------- update (remove) in maximo & CRM  ------------********************
                        if (!myAlarm.getAffServiceID().isEmpty() && myAlarm.getTicketSR() != null) {
                            System.out.println("DSLMON_SKOPIA -> createAlarms: RemoveServiceElements_ACTION_Thread: " + myAlarm.getTicketSR() + "-" + myAlarm.getAffServiceID());
                            RemoveServiceElements_ACTION_Thread myRemoveServiceElements_ACTION_Thread = new RemoveServiceElements_ACTION_Thread(myTicket, myAlarm, myContainer.getEventsLogArrayList(), myParameters);
                            new Thread(myRemoveServiceElements_ACTION_Thread).start();
                        }
                    }
                } catch (Exception e) {
                    myContainer.getEventsLogArrayList().add(0, new TimeStamp1().getNowFormated() + ": Alarm error (" + myAlarm.getTicketId() + "-" + myAlarm.getNetworkElementName() + ")" + e.getMessage());
                    System.out.println("DSLMON_SKOPIA: updateAlarmsStatus error(" + myAlarm.getTicketId() + "-" + myAlarm.getNetworkElementName()+e.toString());
                    e.printStackTrace(System.out);
                }
            }
        }
    }

    private void updateTicketStatus(Ticket_FYROM myTicket, Alarm_Parameters myParameters) {
        if (myTicket.isAllAlarms_CLOSED() && myTicket.isOpen()) {//-------CLOSE TICKET -------------------
            try {
                myTicket.setState(Ticket.STATE_CLOSED);
                //------ SEND INFO CREATE MAIL  ------                                 
                if (myParameters.isTICKETS_sendMailAlert() == true) {
                    try {
                        String subject = "Closed ticket (SR: " + myTicket.getSR() + ")  Synopsis:" + myTicket.getSYNOPSIS();
                        myTicket.sendMailAlert("Diligent",subject, myParameters);
                    } catch (Exception e) {
                        System.out.println("DSLMON_SKOPIA: error in On_CLOSE_ACTION_Thread/sendOpenMailAlert() " + e.toString());
                    }
                }
            } catch (Exception e) {
                System.out.println("DSLMON_SKOPIA: updateTicketsStatus/updateTicket error:"+e.toString());
            }
            myTicket.setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
            DatabaseLogger myDatabaseLogger;
            try {
                String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8", "localhost");
                myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://" + diligent_db + ":3306/dslmon_skopia?user=sa&password=trinitron");
                myDatabaseLogger.connect();
                myTicket.saveToDatabase("dslmon_skopia.tickets", myDatabaseLogger);
                myDatabaseLogger.close();
            } catch (Exception e) {
                System.out.println("DSLMON_SKOPIA: updateTicketsStatus/myDatabaseLogger error:"+e.toString());
            }
        } else if (myTicket.isAllAlarms_CLOSED() && (myTicket.getState().equals(Ticket.STATE_PENDING_TO_OPEN) || myTicket.getState().equals(Ticket.STATE_OPEN_FAILED))) {
            myTicket.setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
            myTicket.setState(Ticket.STATE_CANCELED);
        }

    }

    void sendErrorMailAlert(String body, String mailSender, String mailServer, String mail_recipients, String mail_cc_recipients) {
        System.out.println("DSLMON_SKOPIA: reveal mail Alert");
        String subject = "Error Msg ";
        try {
            MailSender myMailSender = new MailSender();
            myMailSender.setServer(mailServer);
            myMailSender.setSender(mailSender);
            myMailSender.setRecipient(mail_recipients);
            myMailSender.setCc(mail_cc_recipients);
            //
            myMailSender.setSubject(subject);
            myMailSender.setBodyMessage(body);
            //
            myMailSender.sendMail();
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA: errorMailAlert failed!" + e.toString());
        }
    }

    /**
     * @return the running
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * @param running the running to set
     */
    public void setRunning(boolean running) {
        this.running = running;
    }

    /**
     * @return the stopped
     */
    public boolean isStopped() {
        return stopped;
    }

    /**
     * @return the myDaemonTimeStamp_cycle
     */
    public TimeStamp1 getMyDaemonTimeStamp_cycle() {
        return myDaemonTimeStamp_cycle;
    }

    /**
     * @param myDaemonTimeStamp_cycle the myDaemonTimeStamp_cycle to set
     */
    public void setMyDaemonTimeStamp_cycle(TimeStamp1 myDaemonTimeStamp_cycle) {
        this.myDaemonTimeStamp_cycle = myDaemonTimeStamp_cycle;
    }

    public static void main(String args[]) {
        try {
            String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8", "localhost");
            DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://" + diligent_db + ":3306/dslmon_skopia?user=sa&password=trinitron");
            String tablename = "qstatsobjs";
            myDatabaseLogger.connect();
            String mySQL = "SELECT distinct header FROM dslmon.qstatsobjs order by header desc limit 600";
            String header = null;
            try (ResultSet res = myDatabaseLogger.getResults(mySQL)) {
                while (res.next()) {
                    header = res.getString("header");
                }
                System.out.println("DSLMON_SKOPIA:  header @ pos 1008 is:" + header);
            }
            mySQL = "delete from " + tablename + " where header <'" + header + "'";
            System.out.println("DSLMON_SKOPIA:  mySQL = " + mySQL);
            myDatabaseLogger.writeln(mySQL);
            myDatabaseLogger.writeln("optimize table " + tablename);
            myDatabaseLogger.close();
            System.out.println("DSLMON_SKOPIA:  Database optimized!");
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:" + e.toString());
        }

    }
}

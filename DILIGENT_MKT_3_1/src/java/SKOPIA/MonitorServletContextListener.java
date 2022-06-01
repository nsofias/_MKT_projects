/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SKOPIA;

import diligent_MKT.Alarm_FYROM;
import static diligent_MKT.Alarm_FYROM.TYPE_COPPER;
import static diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE;
import static diligent_MKT.Alarm_FYROM.TYPE_GPON;
import static diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE;
import diligent_MKT.PathRetrieverFactory;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.MailAlert;

public class MonitorServletContextListener implements ServletContextListener {

    ArrayList<Diligent_Daemon> myDiligent_Daemons = new ArrayList();
    HealthCheckerDaemon myHealthCheckerDaemon;
    TicketsUpdateDaemon myTicketsUpdateDaemon;
    FourG_backupDaemon myFourG_backupDaemon;
    ReportsCreator myReportsCreator;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Counters browseCounters = new Counters();
        final Config myConfig = new Config();
        try {
            myConfig.load();
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA error: configuration NOT loaded!!!" + e.toString() + " error:" + e.toString());
            return;
        }
        //---------------------------------------------------------------
        try {
            ServletContext myContext = sce.getServletContext();
            myContext.setAttribute("contextTimestamp", new TimeStamp1());
            myContext.setAttribute("browseCounters", browseCounters);
            myContext.setAttribute("myConfig", myConfig);
            //***************************************************************************************************************************              
            Diligent_Daemon myDiligent_Daemon_COPPER = new Diligent_Daemon(TYPE_COPPER, new AlarmDetector_COPPER(myConfig), PathRetrieverFactory.create(Alarm_FYROM.TYPE_COPPER), myConfig, 60000);
            myDiligent_Daemon_COPPER.setRunning(true);
            myDiligent_Daemon_COPPER.setDaemonName(TYPE_COPPER);
            myDiligent_Daemon_COPPER.setDesc(TYPE_COPPER);
            Thread myDiligent_Daemon_COPPERThread = new Thread(myDiligent_Daemon_COPPER);
            myDiligent_Daemon_COPPERThread.setName("myDiligent_Daemon_COPPER");
            myDiligent_Daemon_COPPERThread.start();
            myDiligent_Daemons.add(myDiligent_Daemon_COPPER);
            //            
            Diligent_Daemon myDiligent_Daemon_COPPER_CABLE = new Diligent_Daemon(TYPE_COPPER_CABLE, new AlarmDetector_COPPER_CABLE(myConfig), PathRetrieverFactory.create(Alarm_FYROM.TYPE_COPPER_CABLE), myConfig, 60000);
            myDiligent_Daemon_COPPER_CABLE.setRunning(true);
            myDiligent_Daemon_COPPER_CABLE.setDaemonName(TYPE_COPPER_CABLE);
            myDiligent_Daemon_COPPER_CABLE.setDesc(TYPE_COPPER_CABLE);
            Thread myDiligent_Daemon_COPPERR_CABLEThread = new Thread(myDiligent_Daemon_COPPER_CABLE);
            myDiligent_Daemon_COPPERR_CABLEThread.setName("myDiligent_Daemon_COPPER_CABLE");
            myDiligent_Daemon_COPPERR_CABLEThread.start();
            myDiligent_Daemons.add(myDiligent_Daemon_COPPER_CABLE);
//            
            Diligent_Daemon myDiligent_Daemon_GPON = new Diligent_Daemon(TYPE_GPON, new AlarmDetector_GPON(myConfig), PathRetrieverFactory.create(Alarm_FYROM.TYPE_GPON), myConfig, 60000);
            myDiligent_Daemon_GPON.setRunning(true);
            myDiligent_Daemon_GPON.setDaemonName(TYPE_GPON);
            myDiligent_Daemon_GPON.setDesc(TYPE_GPON);
            Thread myDiligent_Daemon_GPONThread = new Thread(myDiligent_Daemon_GPON);
            myDiligent_Daemon_GPONThread.setName("myDiligent_Daemon_GPON");
            myDiligent_Daemon_GPONThread.start();
            myDiligent_Daemons.add(myDiligent_Daemon_GPON);
//            
            Diligent_Daemon myDiligent_Daemon_GPON_CABLE = new Diligent_Daemon(TYPE_GPON_CABLE, new AlarmDetector_GPON_CABLE(myConfig), PathRetrieverFactory.create(Alarm_FYROM.TYPE_GPON_CABLE), myConfig, 60000);
            myDiligent_Daemon_GPON_CABLE.setRunning(true);
            myDiligent_Daemon_GPON_CABLE.setDaemonName(TYPE_GPON_CABLE);
            myDiligent_Daemon_GPON_CABLE.setDesc(TYPE_GPON_CABLE);
            Thread myDiligent_Daemon_GPON_CABLEThread = new Thread(myDiligent_Daemon_GPON_CABLE);
            myDiligent_Daemon_GPON_CABLEThread.setName("myDiligent_Daemon_GPON_CABLE");
            myDiligent_Daemon_GPON_CABLEThread.start();
            myDiligent_Daemons.add(myDiligent_Daemon_GPON_CABLE);
//------------------------- HealthCheckerDaemon Schedule to run every 900 secs =1 min ------------------------
            myHealthCheckerDaemon = new HealthCheckerDaemon(myDiligent_Daemons, myConfig, 60000);
            myHealthCheckerDaemon.setRunning(true);
            myHealthCheckerDaemon.setDaemonName("HealthCheckerDaemon");
            Thread myHealthCheckerDaemonThread = new Thread(myHealthCheckerDaemon);
            myHealthCheckerDaemonThread.start();
//------------------------- HealthCheckerDaemon Schedule to run every 900 secs =10sec ------------------------
            myTicketsUpdateDaemon = new TicketsUpdateDaemon(myDiligent_Daemons, myConfig, 10000);
            myTicketsUpdateDaemon.setRunning(true);
            Thread myTicketsUpdateDaemonThread = new Thread(myTicketsUpdateDaemon);
            myTicketsUpdateDaemonThread.start();
//------------------------- HealthCheckerDaemon Schedule to run every 900 secs =15 min ------------------------
            myFourG_backupDaemon = new FourG_backupDaemon(myDiligent_Daemon_COPPER.getMyStatsObjContainer(), myConfig, 300000);
            myFourG_backupDaemon.setRunning(true);
            Thread myFourG_backupDaemonThread = new Thread(myFourG_backupDaemon);
            myFourG_backupDaemonThread.start();
            //-------------------------------------------
            myContext.setAttribute("myHealthCheckerDaemon", myHealthCheckerDaemon);
            myContext.setAttribute("myTicketsUpdateDaemon", myTicketsUpdateDaemon);
            myContext.setAttribute("myDiligent_Daemons", myDiligent_Daemons);
            myContext.setAttribute("myFourG_backupDaemon", myFourG_backupDaemon);
            //--------------------------
            try {
                myReportsCreator = new ReportsCreator(new ArrayList<>(), "023000");
                myReportsCreator.setDaemonName("ReportsCreator");
                myReportsCreator.setRunning(true);
                Thread myReportsCreatorThread = new Thread(myReportsCreator);
                //myReportsCreatorThread.start();
            } catch (Exception e) {
                System.out.println("DSLMON_SKOPIA:MonitorServletContextListener: error: " + e.toString() + " error:" + e.toString());
            }
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:MonitorServletContextListener: error: " + e.toString() + " error:" + e.toString());
            new MailAlert().sendmailAlert("DSLMON_SKOPIA MonitorServletContextListener error:", e);
        }
        new MailAlert().sendmailAlert("DSLMON_ΜΚΤ STΑRΤED @ " + new TimeStamp1().getNowFormated(), "", "nsofias@ote.gr");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            System.out.println("DSLMON_SKOPIA:--->Stopping services");
            myHealthCheckerDaemon.setRunning(false);
            //-----
            for (Diligent_Daemon myDiligent_Daemon : myDiligent_Daemons) {
                myDiligent_Daemon.getMyStatsObjContainer().flushToDisk(myDiligent_Daemon.getDesc());
                System.out.println("DSLMON_SKOPIA: Stopped process Diligent_Daemon @ (" + myDiligent_Daemon.getDesc() + ") " + new TimeStamp1().getNowFormated());
                myDiligent_Daemon.setRunning(false);
            }
            myTicketsUpdateDaemon.setRunning(false);
            myFourG_backupDaemon.setRunning(false);
            myReportsCreator.setRunning(false);
            //-----------------------------------------
            int count = 0;
            while (!allStopped() && count++ < 100) {
                Thread.sleep(2000);
            }
            // for extra safety
            if (count == 100) {
                for (Diligent_Daemon myDiligent_Daemon : myDiligent_Daemons) {
                    myDiligent_Daemon.getMyStatsObjContainer().flushToDisk(myDiligent_Daemon.getDesc());
                }
            }
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:error:" + e.toString() + " error:" + e.toString());
        }
        new MailAlert().sendmailAlert("DSLMON_ΜΚΤ STΟPPED @ " + new TimeStamp1().getNowFormated(), "", "nsofias@ote.gr");
    }

    private boolean allStopped() {
        for (Diligent_Daemon myDiligent_Daemon : myDiligent_Daemons) {
            if (!myDiligent_Daemon.isStopped()) {
                System.out.println("DSLMON_SKOPIA:   At least " + myDiligent_Daemon.getDaemonName() + " is still running");
                return false;
            }
        }
        return myHealthCheckerDaemon.isStopped()
                &&myFourG_backupDaemon.isStopped()
                &&myHealthCheckerDaemon.isStopped()
                && myReportsCreator.isStopped();
    }
}

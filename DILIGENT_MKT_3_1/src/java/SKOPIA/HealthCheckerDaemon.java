package SKOPIA;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import nsofiasLib.databases.DatabaseLogger;
import nsofiasLib.others.Parameters;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;

/**
 *
 * @author nsofias
 */
public class HealthCheckerDaemon extends SimpleDaemon {

    private TimeStamp1 healthMonitorTimeStamp;
    String attachement = "yes";
    TimeStamp1 thresholdsCalc_Timestamp;
    Config myConfig;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons;

    public HealthCheckerDaemon(ArrayList<Diligent_Daemon> myGroupBy_Daemons, Config myConfig, int sleep) {
        super(sleep);
        thresholdsCalc_Timestamp = new TimeStamp1();
        this.myConfig = myConfig;
        healthMonitorTimeStamp = new TimeStamp1();
        //ccmAlarmsTimeStamp = new TimeStamp1();
        this.myGroupBy_Daemons = myGroupBy_Daemons;
    }

    @Override
    public void processData() throws Exception {
        TimeStamp1 now = new TimeStamp1();
        if (now.minutesDiff(getHealthMonitorTimeStamp()) > 15) {
            healthMonitorTimeStamp = new TimeStamp1();
            try {
                myConfig.load();
                System.out.println("DSLMON_SKOPIA:healthMonitor myConfig.loaded success");
            } catch (Exception e) {
                new MailAlert().sendmailAlert("DSLMON.myConfig.load() error:", e);
                System.out.println("DSLMON_SKOPIA:healthMonitor/processDataDSLMON.myConfig.load() error:" + e.toString());
            }
            for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                try {
                    TimeStamp1 lastCycleTimeStamp = new TimeStamp1(myGroupBy_Daemon.getLastProccessTime());
                    TimeStamp1 lastDataTimeStamp = new TimeStamp1(myGroupBy_Daemon.getLastSuccessfulProccessTime());
                    double lastCycleTimeStamp_fromNow = now.minutesDiff(lastCycleTimeStamp);
                    double lastDataTimeStamp_fromNow = now.minutesDiff(lastDataTimeStamp);
                    if (lastCycleTimeStamp_fromNow > 30 && myGroupBy_Daemon.isDelayed() == false) {
                        myGroupBy_Daemon.setDelayed(true);
                        new MailAlert().sendmailAlert("DSLMON_SKOPIA:" + myGroupBy_Daemon.getDesc() + " flow(Cycle) is STOPPED for " + lastCycleTimeStamp_fromNow + "minutes", "");
                    }
                    if (lastDataTimeStamp_fromNow > 30 && myGroupBy_Daemon.isDelayed() == false) {
                        myGroupBy_Daemon.setDelayed(true);
                        new MailAlert().sendmailAlert("DSLMON_SKOPIA:" + myGroupBy_Daemon.getDesc() + " flow(Data) is STOPPED for " + lastCycleTimeStamp_fromNow + "minutes", "");
                    }
                    if (lastCycleTimeStamp_fromNow < 30 && lastDataTimeStamp_fromNow < 30 && myGroupBy_Daemon.isDelayed()) {
                        myGroupBy_Daemon.setDelayed(false);
                    }
                } catch (Exception e) {
                    System.out.println("DSLMON_SKOPIA myGroupBy_Daemon timecheck error:" + "DSLMON_SKOPIA " + e.toString());
                    new MailAlert().sendmailAlert("DSLMON_SKOPIA myGroupBy_Daemon time check error:" + "DSLMON_SKOPIA " + e.toString(), e);
                }
            }
        }
        if (now.minutesDiff(thresholdsCalc_Timestamp) > 60) {
            thresholdsCalc_Timestamp = new TimeStamp1();
            double TRIM_AFTER_PERIOD;//days
            Properties properties = new Properties();
            String APPLICATIONS_PATH = System.getenv("APPLICATIONS_PATH");//C:/my files/data/access7
            try (FileInputStream myStream = new FileInputStream(APPLICATIONS_PATH + "/DSLMON_SKOPIA/conf/parameters.properties")) {
                properties.load(new InputStreamReader(myStream, "UTF8"));
                TRIM_AFTER_PERIOD = Integer.parseInt(properties.getProperty("TICKETS.TRIM_AFTER_PERIOD"));//days
            } catch (Exception e) {
                TRIM_AFTER_PERIOD = 7;
            }
            //--------------- calculate_traffic_patern -------------------------------------------
            for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                boolean removeOldmessages = false, removeOldTickets = false;
                try {
                    removeOldmessages = myGroupBy_Daemon.getMyStatsObjContainer().removeOldmessages();
                    removeOldTickets = myGroupBy_Daemon.getMyStatsObjContainer().removeOldTickets(TRIM_AFTER_PERIOD);
                    System.out.println("DSLMON_SKOPIA:HealthCheckerDaemon:removeOldmessages success!!! :" + myGroupBy_Daemon.getDesc());
                } catch (Exception e) {
                    if (removeOldmessages == true) {
                        System.out.println("DSLMON_SKOPIA:HealthCheckerDaemon:removeOldmessages error:" + myGroupBy_Daemon.getDesc() + " " + e.toString());
                    }
                    if (removeOldTickets == true) {
                        System.out.println("DSLMON_SKOPIA:HealthCheckerDaemon:removeOldTickets error:" + myGroupBy_Daemon.getDesc() + " " + e.toString());
                    }
                }
                //--------------- flushToDisk & Indexes -------------------------------------------
                try {
                    myGroupBy_Daemon.getMyStatsObjContainer().flushToDisk(myGroupBy_Daemon.getDesc());
                    System.out.println("DSLMON_SKOPIA flushToDisk ok!" + myGroupBy_Daemon.getDesc() + " ");
                } catch (Exception e) {
                    System.out.println("flushToDisk error:" + "DSLMON_SKOPIA " + e.toString());
                    new MailAlert().sendmailAlert("flushToDisk error:" + "DSLMON_SKOPIA " + e.toString(), e);
                }
                //--------------- flushToDisk & Indexes -------------------------------------------
                try {
                    trimToSizeDatabase(myGroupBy_Daemon.getDesc(), "aggregations");
                    System.out.println("DSLMON_SKOPIA trimToSizeDatabase success!" + myGroupBy_Daemon.getDesc() + " ");
                } catch (Exception e) {
                    System.out.println("flushToDisk error:" + "DSLMON_SKOPIA " + e.toString());
                    new MailAlert().sendmailAlert("flushToDisk error:" + "DSLMON_SKOPIA " + e.toString(), e);
                }
            }
        }
    }

    public void trimToSizeDatabase(String type, String tablename) {//--------------- trimToSize Database -------------------------------------------
        try {
            int KEEP_SHOTS_HISTORY_PERIOD;//hours
            Properties properties = new Properties();
            String APPLICATIONS_PATH = System.getenv("APPLICATIONS_PATH");//C:/my files/data/access7
            try (FileInputStream myStream = new FileInputStream(APPLICATIONS_PATH + "/DSLMON_SKOPIA/conf/parameters.properties")) {
                properties.load(new InputStreamReader(myStream, "UTF8"));
                KEEP_SHOTS_HISTORY_PERIOD = Integer.parseInt(properties.getProperty("KEEP_SHOTS_HISTORY_PERIOD"));//hours
            } catch (Exception e) {
                KEEP_SHOTS_HISTORY_PERIOD = 5;
            }
            String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8", "localhost");
            DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://" + diligent_db + ":3306/dslmon_skopia?user=sa&password=trinitron");
            myDatabaseLogger.connect();
            //myDatabaseLogger.writeln("SET autocommit=0;");
            String mySQL = "SELECT distinct header FROM " + tablename + " WHERE type='" + type + "' order by header";
            String headerStart = "20160701T182500.000";
            String headerStop = headerStart;
            ArrayList<String> headers = new ArrayList();
            try (ResultSet res = myDatabaseLogger.getResults(mySQL)) {
                if (res.next()) {
                    headerStart = res.getString("header");
                    headerStop = res.getString("header");
                    headers.add(headerStart);
                }
                while (res.next()) {
                    headerStop = res.getString("header");
                    headers.add(headerStop);
//                        System.out.println("DSLMON_SKOPIA  header @ pos 50 is:"+header);          
                }
                TimeStamp1 stop = new TimeStamp1(headerStop);
                stop.addHours(-KEEP_SHOTS_HISTORY_PERIOD);
                headerStop = stop.getNowUnformated();
            }
            System.out.println("headerStart=" + headerStart + "  headerStop=" + headerStop);
            //
            for (String myHeader : headers) {
                if (myHeader.compareTo(headerStop) < 0) {
                    String mySQL1 = "delete from " + tablename + " where header ='" + myHeader + "' AND type='" + type + "';";
                    System.out.println("DSLMON_SKOPIA  mySQL1 = " + mySQL1);
                    myDatabaseLogger.writeln(mySQL1);
                }
            }
            //myDatabaseLogger.writeln("COMMIT;");
            myDatabaseLogger.writeln("optimize table " + tablename);
            myDatabaseLogger.close();
            System.out.println("DSLMON_SKOPIA  Database optimized!");
        } catch (Exception e) {
            new MailAlert().sendmailAlert("DSLMON_SKOPIA  Database optimization error: " + e.toString(), e);
            System.out.println("DSLMON_SKOPIA  Database optimization error: " + e.toString());
        }
    }

    /**
     * @return the healthMonitorTimeStamp
     */
    public TimeStamp1 getHealthMonitorTimeStamp() {
        return healthMonitorTimeStamp;
    }

    public static void main(String args[]) {
    }
}

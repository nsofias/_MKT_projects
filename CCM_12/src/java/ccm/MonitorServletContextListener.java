/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import ccm.MKT.Ticket_MKT;
import ccm.OTE.Ticket_OTE;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import nsofiasLib.others.Parameters;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.Counters1;
import oracle.jdbc.pool.OracleDataSource;

public class MonitorServletContextListener implements ServletContextListener {

    Map<String, SimpleDaemon> daemons = new HashMap<>();
    Counters browseCounters = new Counters();
    CCMonitorStatsObjsContainer myContainer;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext myContext = sce.getServletContext();
        myContext.setAttribute("browseCounters", browseCounters);
        try {
            //-------------------load config ---------
            Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");
            //------------------------ AlarmsLoaderDaemon ----------------------------------
            java.lang.reflect.Type myTicketsTypeToken = null;
            //--------------------- load classes ------------------------
            String NetworkResourcesFinder_ClassName = myParameters.getStringValue("NetworkResourcesFinder_ClassName", null);
            NetworkResourcesFinder myNetworkResourcesFinder = (NetworkResourcesFinder) Class.forName(NetworkResourcesFinder_ClassName).newInstance();
            if (myNetworkResourcesFinder == null) {
                System.out.println("CCM12:MonitorServletContextListener loaded myNetworkResourcesFinder failed! ");
                return;
            }
            String CallInfo_factory_ClassName = myParameters.getStringValue("CallInfo_factory_ClassName", null);
            CallInfo_factory myCallInfo_factory = (CallInfo_factory) Class.forName(CallInfo_factory_ClassName).newInstance();
            if (myCallInfo_factory == null) {
                System.out.println("CCM12:MonitorServletContextListener loaded myCallInfo_factory failed! ");
                return;
            }
            String CCMTicketFactoryClass = myParameters.getStringValue("CCMTicketFactory_ClassName", null);
            CCMTicketFactory myCCMTicketFactory = (CCMTicketFactory) Class.forName(CCMTicketFactoryClass).newInstance();
            if (myCCMTicketFactory == null) {
                System.out.println("CCM12:MonitorServletContextListener loaded myCCMTicketFactory failed! ");
                return;
            }
            //------------------load classes end ---------------------------
            Counters1 parent_child_map = new Counters1();
            String[] parent_childs = myParameters.getStringValue("parent_childs", "BRAS,DSLAM;DSLAM,SLOT;DSLAM,CABLE").split(";");
            System.out.println("CCM12:MonitorServletContextListener parent_childs=" + Arrays.asList(parent_childs));
            for (String parent_child : parent_childs) {//BRAS,DSLAM
                String parent = parent_child.split(",")[0];
                String child = parent_child.split(",")[1];
                parent_child_map.updateCounters(parent, child);
                System.out.println("CCM12:MonitorServletContextListener parent_child_map updated with: parent=" + parent + " clild=" + child);
            }
            System.out.println("CCM12:MonitorServletContextListener parent_child_map=" + new Gson().toJson(parent_child_map));
            myContainer = new CCMonitorStatsObjsContainer(myParameters, parent_child_map);
            myContainer.loadFromDisk("CCM");
            myContainer.updateClock();
            myContainer.prepareCurrentObj();
            //--------------------- profiles ----------------                        
            String profile = myParameters.getStringValue("profile", "FILE");
            System.out.println("CCM12:MonitorServletContextListener profile=" + profile);
            if (profile.equals("FILE")) {
                try {
                    CallsLoaderDaemon myCallsLoaderDaemon = null;
                    String file_type = myParameters.getStringValue("FILE.type", "CSV");
                    System.out.println("CCM12:MonitorServletContextListener starting profile=" + profile + " file_type:" + file_type);
                    String csvcols = null;
                    if (file_type.equals("CSV")) {
                        csvcols = myParameters.getStringValue("FILE.csvcols", "1;2;3;5");
                    }
                    String parserDir = myParameters.getStringValue("FILE.parserDir", "/ccm/data/");
                    String parserExt = myParameters.getStringValue("FILE.parserExt", "txt");
                    boolean removeFiles = myParameters.getBooleanValue("FILE.removeFiles", false);
                    myCallsLoaderDaemon = new CallsLoaderDaemon_file(myContainer, myNetworkResourcesFinder, myCallInfo_factory, 10000, 6);
                    myCallsLoaderDaemon.setDaemonName("myCallsLoaderDaemon");
                    ((CallsLoaderDaemon_file) myCallsLoaderDaemon).setParserDir(parserDir);
                    ((CallsLoaderDaemon_file) myCallsLoaderDaemon).setParserExt(parserExt);
                    ((CallsLoaderDaemon_file) myCallsLoaderDaemon).setFile_type(file_type);
                    ((CallsLoaderDaemon_file) myCallsLoaderDaemon).setRemoveFiles(removeFiles);
                    ((CallsLoaderDaemon_file) myCallsLoaderDaemon).setCsvcols(csvcols);
                    start_daemon(myCallsLoaderDaemon);
                    myTicketsTypeToken = new TypeToken<Map<String, Ticket_OTE>>() {
                    }.getType();
                } catch (Exception e) {
                    System.out.println("CCM12:MonitorServletContextListener error " + e.toString());
                    e.printStackTrace(System.out);
                }
            } else if (profile.equals("DATABASE")) {
                String DATABASE_PROFILES = myParameters.getStringValue("DATABASE_PROFILES", "DATABASE");
                String[] databaseProfiles = DATABASE_PROFILES.split(",");
                for (String mydatabase_profile : databaseProfiles) {
                    try {
                        System.out.println("CCM12:MonitorServletContextListener starting profile=" + mydatabase_profile);
                        String connectionURL = myParameters.getStringValue(mydatabase_profile + ".connectionURL", "jdbc:oracle:thin:@//10.232.59.105:1521/startrek");
                        String jdbcDriver = myParameters.getStringValue(mydatabase_profile + ".jdbcDriver", "oracle.jdbc.OracleDriver");
                        String user = myParameters.getStringValue(mydatabase_profile + ".user", "DILIGENT_CRM");
                        String password = myParameters.getStringValue(mydatabase_profile + ".password", "Diligent_2323");
                        String sql = myParameters.getStringValue(mydatabase_profile + ".sql", "");
                        String sqlExecAfter = myParameters.getStringValue(mydatabase_profile + ".sqlExecAfter", "");
                        String tablefields = myParameters.getStringValue(mydatabase_profile + ".tablefields", "startTime;lineId;lineIdInFault;reason");
                        boolean useODS = myParameters.getBooleanValue(mydatabase_profile + ".useODS", true);
                        CallsLoaderDaemon myCallsLoaderDaemon = null;
                        if (useODS) {
                            OracleDataSource ods = new OracleDataSource();
                            ods.setURL(connectionURL);
                            ods.setUser(user);
                            ods.setPassword(password);
                            myCallsLoaderDaemon = new CallsLoaderDaemon_database(myContainer, myNetworkResourcesFinder, myCallInfo_factory, ods, jdbcDriver, 10000, 6);
                        } else {
                            myCallsLoaderDaemon = new CallsLoaderDaemon_database(myContainer, myNetworkResourcesFinder, myCallInfo_factory, connectionURL, jdbcDriver, 10000, 6);
                        }
                        myCallsLoaderDaemon.setDaemonName(mydatabase_profile + "_CallsLoaderDaemon");
                        myCallsLoaderDaemon.setRunning(true);
                        ((CallsLoaderDaemon_database) myCallsLoaderDaemon).setSql(sql);
                        ((CallsLoaderDaemon_database) myCallsLoaderDaemon).setSqlExecAfter(sqlExecAfter);
                        ((CallsLoaderDaemon_database) myCallsLoaderDaemon).setTablefields(tablefields);
                        start_daemon(myCallsLoaderDaemon);
                        myTicketsTypeToken = new TypeToken<Map<String, Ticket_MKT>>() {
                        }.getType();
                    } catch (Exception e) {
                        System.out.println("CCM12:MonitorServletContextListener error " + e.toString());
                        e.printStackTrace(System.out);
                    }
                }
            }
            //-------------------------------------------------------
            AlarmsDetectionListener myAlarmsDetectionListener = new AlarmsDetectionListener(10000, 6);
            myAlarmsDetectionListener.setMyTicketsTypeToken(myTicketsTypeToken);
            myAlarmsDetectionListener.setCCMTicketFactory(myCCMTicketFactory);
            myAlarmsDetectionListener.setDaemonName("alarmsDetectionListener");
            start_daemon(myAlarmsDetectionListener);
            //-----------------------------
            AlarmDetectionDaemon myAlarmDetectionDaemon = new AlarmDetectionDaemon(myContainer, 10000, 6);
            myAlarmDetectionDaemon.setDaemonName("alarmCheckerDaemon");
            myAlarmDetectionDaemon.setMyAlarmsProccessor(myAlarmsDetectionListener);
            start_daemon(myAlarmDetectionDaemon);
            //------------------------------
            CalcTrafficPatternsDaemon myCalcTrafficPatternsDaemon = new CalcTrafficPatternsDaemon(myContainer, 60000, 60);
            myCalcTrafficPatternsDaemon.setDaemonName("calcTrafficPatternsDaemon");
            start_daemon(myCalcTrafficPatternsDaemon);
            //------------------------- HealthCheckerDaemon Schedule to run every 900 secs =15 mins ------------------------                        
            HealthCheckerDaemon myHealthCheckerDaemon = new HealthCheckerDaemon(myContainer, daemons, 60000);
            myHealthCheckerDaemon.setDaemonName("healthCheckerDaemon");
            start_daemon(myHealthCheckerDaemon);
            //-----------------------
            myContext.setAttribute("daemons", daemons);
            myContext.setAttribute("myContainer", myContainer);
            myContext.setAttribute("myAlarmsDetectionListener", myAlarmsDetectionListener);
        } catch (Exception e) {
            System.out.println("CCM12:MonitorServletContextListener/contextInitialized error  (GET REASONS) " + e.toString());
            e.printStackTrace(System.out);
        }
    }

    private void start_daemon(SimpleDaemon myDaemon) {
        try {
            myDaemon.setRunning(true);
            daemons.put(myDaemon.getDaemonName(), myDaemon);
            System.out.println(myDaemon.getDaemonName() + " loaded");
            Thread myAlarmsLoaderDaemonThread = new Thread(myDaemon);
            myAlarmsLoaderDaemonThread.start();
        } catch (Exception e) {
            System.out.println("CCM12:MonitorServletContextListener error for  " + myDaemon.getDaemonName() + ". error: " + e.toString());
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("CCM12:--->terminating daemons");
        for (String key : daemons.keySet()) {
            try {
                SimpleDaemon myDaemon = daemons.get(key);
                myDaemon.setRunning(false);
                System.out.println("CCM12:--->terminating Daemon" + key);
            } catch (Exception e) {
                System.out.println("CCM12: error during termination for: " + key);
            }
        }
        myContainer.flushToDisk("CCM");
        System.out.println("CCM12:CCM12:--->flushed To Disk");
        //
        int count = 0;
        while (!allFinished() && count++ < 10) {
            try {
                System.out.println("CCM12: stopping:" + (10 - count));
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println("CCM12: all processes stoped!");
    }

    private boolean allFinished() {
        for (String key : daemons.keySet()) {
            try {
                SimpleDaemon myDaemon = daemons.get(key);
                if (!myDaemon.isStopped()) {
                    System.out.println("CCM12:--->" + key + " is still running");
                    return false;
                }
            } catch (Exception e) {
                System.out.println("CCM12: error during termination for: " + key);
            }
        }
        return true;
    }
}

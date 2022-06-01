/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.util.*;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;

/**
 *
 * @author nsofias
 */
public class HealthCheckerDaemon extends SimpleDaemon {

    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer;
    private Map<String, SimpleDaemon> daemons = new HashMap<>();
    TimeStamp1 houseKeepingTimeStamp;
    private TimeStamp1 myTimestamp = new TimeStamp1();

    public HealthCheckerDaemon(CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer,Map<String, SimpleDaemon> daemons, int sleep) {
        super(sleep);
        this.daemons = daemons;
        houseKeepingTimeStamp = new TimeStamp1();
        this.myCCMonitorStatsObjsContainer = myCCMonitorStatsObjsContainer;
    }

    @Override
    public void processData() {
        AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) daemons.get("alarmsDetectionListener");
        if (myAlarmsDetectionListener == null) {
            System.out.println("CCM12:HealthCheckerDaemon error (Exception): myAlarmsDetectionListener=null");
        }
        //--------------------------------------------------------------------------
        if ((new TimeStamp1()).minutesDiff(houseKeepingTimeStamp) > 15) {
            houseKeepingTimeStamp = new TimeStamp1();
            //--------------------standard--------------------------------------    
            try {
                int rememberPeriod = myCCMonitorStatsObjsContainer.getMyParameters().getIntValue("rememberPeriod", 5);
                TimeStamp1 myTimeStamp = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());
                myTimeStamp.addDays(-rememberPeriod);
                String myTimeStamp_min = myTimeStamp.getNowUnformated();
                System.out.println("CCM12:HealthCheckerDaemon remove closed alarms older than myTimeStamp_threshold: " + myTimeStamp_min);
                //  ----------------- trim DimensionInstances --------------
                int count = 0;
                for (String key : myCCMonitorStatsObjsContainer.getDimensionInstances().keySet()) {
                    try {
                        if (key.compareTo(myTimeStamp_min) < 0) {
                            //System.out.println("CCM12:HealthCheckerDaemon removing DimensionInstance " + key);
                            myCCMonitorStatsObjsContainer.getDimensionInstances().remove(key);
                            count++;
                        }
                    } catch (Exception e) {
                        System.out.println("CCM12:HealthCheckerDaemon trim DimensionInstances error " + e.toString());
                    }
                }
                System.out.println("CCM12:HealthCheckerDaemon trim DimensionInstances: " + count);
                //  ----------------- trim alarms --------------   
                count = 0;
                for (String key : myCCMonitorStatsObjsContainer.getAlarmArrayList().keySet()) {
                    CCMAlarm myAlarm = myCCMonitorStatsObjsContainer.getAlarmArrayList().get(key);
                    if (!myAlarm.isStilAlive() && myAlarm.getAlarmStop().compareTo(myTimeStamp_min) < 0) {
                        try {
                            System.out.println("CCM12:HealthCheckerDaemon removing alarm " + key);
                            if (myAlarmsDetectionListener != null && myAlarm.getTicketId() != null) {
                                CCMTicket myTicket = myAlarmsDetectionListener.getTicketsMap().get(myAlarm.getTicketId());
                                if (myTicket != null) {
                                    System.out.println("CCM12:HealthCheckerDaemon removing Ticket " + myAlarm.getTicketId());
                                    myAlarmsDetectionListener.getTicketsMap().remove(myAlarm.getTicketId());
                                }
                            }
                            myCCMonitorStatsObjsContainer.getAlarmArrayList().remove(key);
                            count++;

                        } catch (Exception e) {
                            System.out.println("CCM12:HealthCheckerDaemon trim alarms error " + e.toString());
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("CCM12:HealthCheckerDaemon trim alarms: " + count);
            } catch (Exception e) {
                System.out.println("CCM12:HealthCheckerDaemon:trimToSize_List error " + e.toString());
                e.printStackTrace(System.out);
                //new MailAlert().sendmailAlert("trimToSize_List error:" + e.toString(), e);
            }
            //-------------
            try {
                for (String daemonName : daemons.keySet()) {
                    SimpleDaemon mySimpleDaemon = daemons.get(daemonName);
                    TimeStamp1 now = new TimeStamp1();
                    double timeDiff = 0, timeDiff1 = 0;
                    if (mySimpleDaemon.getLastProccessTime() != null) {
                        TimeStamp1 lastProccessTime = new TimeStamp1(mySimpleDaemon.getLastProccessTime());
                        timeDiff = now.minutesDiff(lastProccessTime);
                    } else {
                    }
                    if (mySimpleDaemon.getLastSuccessfulProccessTime() != null) {
                        TimeStamp1 lastSuccessfulProccessTime = new TimeStamp1(mySimpleDaemon.getLastSuccessfulProccessTime());
                        timeDiff1 = now.minutesDiff(lastSuccessfulProccessTime);
                    } else {
                    }
                    if (timeDiff1 > 2 * timeDiff1 || timeDiff > 20) {
                        System.out.println("CCM12:HealthCheckerDaemon:timeDiff1 > 2 * timeDiff1 || timeDiff > 20");
                        //new MailAlert().sendmailAlert("CCM12:HealthCheckerDaemon:timeDiff1 > 2 * timeDiff1 || timeDiff > 20", "");
                    }
                }
            } catch (Exception e) {
                System.out.println("CCM12:HealthCheckerDaemon:daemons check error " + e.toString());
                //new MailAlert().sendmailAlert("CCM12:HealthCheckerDaemon:daemons chech error", e);
                return;
            }
            //--------------------------------------------------------------------------------
            try {
                myCCMonitorStatsObjsContainer.removeOldmessages();
                System.out.println("CCM12:HealthCheckerDaemon:removeOldmessages ok!");
            } catch (Exception e) {
                System.out.println("CCM12:HealthCheckerDaemon:removeOldmessages error:" + e.toString());
                new MailAlert().sendmailAlert("CCM12:HealthCheckerDaemon:removeOldmessages error:" + e.toString(), e);
            }

            //----------------------------
            try {
                TimeStamp1 t1Genesys = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated());
                if ((new TimeStamp1()).minutesDiff(t1Genesys) > 60) {
                    System.out.println("CCM12:HealthCheckerDaemon:DATA INPUT FROM GENESYS DELAY FOUND!!!!!!!");
                    new MailAlert().sendmailAlert("CCM12:HealthCheckerDaemon:DATA INPUT FROM GENESYS DELAY FOUND!!!!!!!", "");
                }
            } catch (Exception e) {
                System.out.println("CCM12:HealthCheckerDaemon:NO CLOCK YET!!!!!!!!");
                new MailAlert().sendmailAlert("CCM12:HealthCheckerDaemon:NO CLOCK YET!!!!!!!!", e);
            }
        }

    }

    /**
     * @return the myTimestamp
     */
    public TimeStamp1 getMyTimestamp() {
        return myTimestamp;
    }

    /**
     * @param myTimestamp the myTimestamp to set
     */
    public void setMyTimestamp(TimeStamp1 myTimestamp) {
        this.myTimestamp = myTimestamp;
    }

    //******************************************************************************
    public static void main(String args[]) {
    }
}

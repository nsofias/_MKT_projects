/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.util.*;
import nsofiasLib.others.Parameters;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters1;
import nsofiasLib.utils.TrafficVolumnPatern;
//import nsofiasLib.utils.MailSender_new;
/**
 *
 * @author nsofias
 */
public class AlarmDetectionDaemon extends SimpleDaemon {

    private AlarmsDetectionListener myAlarmsDetectionListener = null;
    private CCMonitorStatsObjsContainer myStatsObjContainer;
    Map<String, CallInfo> dimensionInstances;
    TimeStamp1 t1, t2, t3, t4;
    int MODE = 0;
    private TimeStamp1 myTimestamp = new TimeStamp1();
    private String lastDataUpdate = "";
    Set<String> overlaps = new HashSet();
    Counters1 parent_childs = new Counters1();

    public AlarmDetectionDaemon(CCMonitorStatsObjsContainer myStatsObjContainer, int sleep, int step) {
        super(sleep, step);
        this.myStatsObjContainer = myStatsObjContainer;
    }

    @Override
    public void processData() {
        ArrayList<CCMAlarm> newAlarms = new ArrayList();
        if (myStatsObjContainer.getMyClock() != null && !myStatsObjContainer.getMyClock().getNowUnformated().equals(lastDataUpdate)) {
            String myClock = myStatsObjContainer.getMyClock().getNowUnformated();
            try {
                lastDataUpdate = myClock;
                System.out.println("CCM12:AlarmCheckerDaemon: Clock: " + myClock + " last update: " + lastDataUpdate);
                //------------     TRAFFIC HISTORY FACTOR CALCULATION--------------------------            
                AggregationsForPeriod myCurrentObject = myStatsObjContainer.getCurrentObject();
                if (myCurrentObject == null) {
                    System.out.println("CCM12:AlarmCheckerDaemon: myCurrentObject is null. I will return now");
                    return;
                }
                //--------- start checking alarms for myCurrentObject ----------------------------------
                String from = myCurrentObject.getFrom();
                String to = myCurrentObject.getTo();
                System.out.println("CCM12:AlarmCheckerDaemon: checking period:" + from + "-" + to);
                //Map<String, Map<String, TrafficVolumnPatern>> paterns = myStatsObjContainer.getPaterns();
                //------------------------------------------------------
                Set<String> keys = myCurrentObject.getAggregationLabels();
                parent_childs.clear();
                overlaps.clear();
                for (String resourceType : keys) {
                    try {
                        System.out.println("CCM12:AlarmCheckerDaemon: check_Resource " + resourceType);
                        Counters1 myResources = myCurrentObject.getCurrentResourceCounters(resourceType);
                        Map<String, TrafficVolumnPatern> resource_traffic_paterns = myStatsObjContainer.getPaternsOfResource(resourceType);
                        if (myResources != null && resource_traffic_paterns != null) {
                            parent_childs.updateCounters(myResources);
                            System.out.println("CCM12:AlarmCheckerDaemon:check_Resources check_Resource (" + resourceType + ") size:" + myResources.size() + " from:" + from + " to:" + to);
                            newAlarms.addAll(check_Resources(myResources, resource_traffic_paterns, from, to));
                        } else {
                            System.out.println("CCM12:AlarmCheckerDaemon:check_Resources NO Resources found for resourceType " + resourceType);
                        }
                    } catch (Exception e) {
                        System.out.println("CCM12:AlarmChecckerDaemon:check_Resources error for " + resourceType + " error:" + e.toString());
                        e.printStackTrace(System.out);
                    }
                }
                System.out.println("CCM12:AlarmCheckerDaemon: lastDataUpdate=" + lastDataUpdate);
                //----------- make actions for new alarms ----------------
                //System.out.println("CCM12:AlarmCheckerDaemon:overlaps=" + new ArrayList(overlaps));
                parent_childs.removeParameter("COUNT");
                Map<String, CCMAlarm> activeAlarms = myStatsObjContainer.getAlarmArrayList_active();
                activeAlarms.keySet().stream().map(key -> activeAlarms.get(key)).forEachOrdered(myAlarm -> {
                    try {
                        overlaps.addAll(findShadow(myAlarm.getAlarmObject(), parent_childs));
                    } catch (Exception e) {
                        System.out.println("CCM12:AlarmChecckerDaemon:overlaps error " + e.toString());
                        e.printStackTrace(System.out);
                    }
                });
                //System.out.println("CCM12:overlaps:" + new ArrayList(overlaps));
                for (CCMAlarm myAlarm : newAlarms) {
                    try {
                        System.out.println("CCM12:AlarmCheckerDaemon:new possible alarm:" + myAlarm.getAlarmObject());
                        if (!overlaps.contains(myAlarm.getAlarmObject())) {
                            //System.out.println("CCM12:AlarmCheckerDaemon:new alarm:" + myAlarm.getAlarmObject());
                            String parent = findParent(myAlarm.getAlarmObject(), parent_childs);
                            myAlarm.setAlarmParent(parent);
                            CCMAlarm myAlarmNew = includeAlarm(myAlarm);
                            if (myAlarmNew != null) {
                                try {
                                    Counters1 myResources = new Counters1();
                                    myResources.updateCounters(myCurrentObject.getCurrentResourceCounters(myAlarmNew.getAlarmType()));
                                    myResources.removeParameter("COUNT");
                                    Map<String, Double> childs_map = myResources.getParametersOflabel(myAlarmNew.getAlarmObject());
                                    if (!childs_map.isEmpty()) {
                                        ArrayList childs = new ArrayList(childs_map.keySet());
                                        myAlarmNew.setDesc("Root trace: " + childs.toString());
                                    } else {
                                        myAlarmNew.setDesc("");
                                    }
                                } catch (Exception e) {
                                }
                                //--------- mail ---------------
                                boolean createEmail = Parameters.loadBooleanValue(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "createEmailForAlarm", "UTF8", false);
                                if (createEmail) {
                                    String subject = "Abnormal condition detected for " + myAlarm.getAlarmType() + " " + myAlarm.getAlarmObject();
                                    new CCMMail(subject, myAlarmNew.toHTML()).send();
                                }
                                //-------------------------
                                if (myAlarmsDetectionListener != null) {
                                    //**************************************** 
                                    myAlarmsDetectionListener.onAlarmStart(myAlarmNew);
                                    //**************************************** 
                                }
                            }
                        } else {
                            System.out.println("CCM12:AlarmCheckerDaemon:new alarm found in overlaps:" + myAlarm.getAlarmObject());
                        }
                    } catch (Exception e) {
                        System.out.println("CCM12:AlarmChecckerDaemon:#1 error " + e.toString());
                        e.printStackTrace();
                    }
                }
                //------------------end --------------------------------------
                System.out.println("CCM12:AlarmCheckerDaemon:Updating Alarms");
                ArrayList<CCMAlarm> recoveredAlarms = updateAlarmsStatus();
                if (myAlarmsDetectionListener != null) {
                    //Το πλήθος κλησεων εχει επανελθει στα φυσιολογικά επιπεδα!";
                    recoveredAlarms.forEach(myAlarm -> {
                        //****************************************
                        myAlarmsDetectionListener.onAlarmEnd(myAlarm);
                        //****************************************
                    });
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
                //new MailAlert().sendmailAlert("CCM12: AlarmCheckerDaemon/processData3 error:", e);
                System.out.println("CCM12:AlarmCheckerDaemon:processData3 error:" + e.toString());
            } finally {
            }
        }
    }

    private String findParent(String alarmElement, Counters1 parent_childs) {
        for (String label : parent_childs.keySet()) {
            Set<String> childsSet = parent_childs.getParametersOflabel(label).keySet();
            if (childsSet.contains(alarmElement)) {
                return label;
            }
        }
        return "";
    }

    private Set findShadow(String label, Counters1 parent_childs) {
        Set<String> shadows = new HashSet();
        Set<String> childs = parent_childs.getParametersOflabel(label).keySet();
        if (childs.isEmpty()) {
            return shadows;
        } else {
            shadows.addAll(childs);
            childs.forEach(l -> {
                shadows.addAll(findShadow(l, parent_childs));
            });
        }
        //System.out.println("CCM12:findShadow of " + label + " :" + new ArrayList(shadows));
        return shadows;
    }

    public ArrayList updateAlarmsStatus() {
        ArrayList recoveredAlarms = new ArrayList();
        for (String key : myStatsObjContainer.getAlarmArrayList().keySet()) {
            CCMAlarm myAlarm = myStatsObjContainer.getAlarmArrayList().get(key);
            try {
                boolean recovered = updateAlarm(myAlarm);
                if (recovered == true) {
                    recoveredAlarms.add(myAlarm);
                    //System.out.println("CCM12:updateAlarmsStatus recovered:" + myAlarm.getAlarmObject());
                }
            } catch (Exception e) {
                System.out.println("CCM12:updateAlarmsStatus_ error:" + e.toString());
                e.printStackTrace();
            }
        }
        //System.out.println("CCM12:recoveredAlarms:" + recoveredAlarms);
        return recoveredAlarms;
    }

    public boolean updateAlarm(CCMAlarm myAlarm) {
        boolean becameInactive = false;
        TimeStamp1 now = myStatsObjContainer.getMyClock();
        if (now.minutesDiff(new TimeStamp1(myAlarm.getAlarmStop())) > 30 || overlaps.contains(myAlarm.getAlarmObject())) {
            if (myAlarm.isStilAlive()) {
                becameInactive = true;
            }
            myAlarm.setStilAlive(false);
        } else {
            myAlarm.setStilAlive(true);
        }
        //----------------        
        if (myAlarm.isStilAlive()) {
            try {
                double total = myStatsObjContainer.getCallersUniqueNumber(myAlarm);
                if (total > myAlarm.getTotalCalls()) {
                    myAlarm.setTotalCalls(total);
                    myAlarm.setAlarmStop(myStatsObjContainer.getMyClock().getNowUnformated());
                    myAlarm.setAlarmReasons(myStatsObjContainer.getReasonsCounters(myAlarm));
                    myAlarmsDetectionListener.onAlarmUpdate(myAlarm);
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
                System.out.println("CCM12:Alarms servlet error:" + e.toString());
            }
        }
        return becameInactive;
    }

    private CCMAlarm includeAlarm(CCMAlarm myAlarm) {
        CCMAlarm myExistingAlarm = findExistingAlarm(myAlarm.getAlarmObject());
        try {
            if (myExistingAlarm == null) {
                System.out.println("CCM12:AlarmCheckerDaemon:New Alarm:" + myAlarm.toString());
                myStatsObjContainer.getAlarmArrayList().put(myAlarm.getAlarmId(), myAlarm);
                updateAlarm(myAlarm);
                return myAlarm;
            } else {//if (alarm exixts )                
                if (myExistingAlarm.isStilAlive()) {
                    System.out.println("CCM12:AlarmCheckerDaemon:Continued Alarm:" + myExistingAlarm.getAlarmId());
                    myExistingAlarm.setAlarmStop(myStatsObjContainer.getMyClock().getNowUnformated());
                    updateAlarm(myExistingAlarm);//just for metrics
                    return null;
                } else {
                    TimeStamp1 now = myStatsObjContainer.getMyClock();
                    TimeStamp1 T2 = new TimeStamp1(myExistingAlarm.getAlarmStop());
                    //System.out.println("CCM12:AlarmCheckerDaemon:found dead Old Alarm" + myExcistingAlarm.toString());
                    if (now.minutesDiff(T2) > 180) {
                        myStatsObjContainer.getAlarmArrayList().put(myAlarm.getAlarmId(), myAlarm);
                        updateAlarm(myAlarm);
                        return myAlarm;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("CCM12:AlarmCheckerDaemon:includeAlarm error:" + e.toString());
        }
        return null;
    }

    private CCMAlarm findExistingAlarm(String alarmElement) {

        ArrayList<String> alarmIds = new ArrayList(myStatsObjContainer.getAlarmArrayList().keySet());
        Collections.sort(alarmIds, Collections.reverseOrder());
        for (String key : alarmIds) {
            CCMAlarm myExistingCCMAlarm = myStatsObjContainer.getAlarmArrayList().get(key);
            if (myExistingCCMAlarm.getAlarmObject().equals(alarmElement)) {
                return myExistingCCMAlarm;
            }
        }
        return null;
    }

    private ArrayList<CCMAlarm> check_Resources(Counters1 myResources, Map<String, TrafficVolumnPatern> traffic_patern, String from, String to) {
        ArrayList<CCMAlarm> newresourceAlarms = new ArrayList();
        String resourceType = myResources.getHeader();
        String myAlertStartTimeStamp = to;
        Set<String> labels = myResources.getCountersLabels();
        for (String label : labels) {
            try {
                double value = myResources.getValue(label, "COUNT");
                //---------- max value ----------------
                double maxValue = value;
                try {
                    maxValue = 1 + Math.ceil(traffic_patern.get(label).getVolumnPatern_max() * myResources.getTotalValueOfParam("COUNT"));
                } catch (Exception e) {
                    //System.out.println("CCM12:AlarmCheckerDaemon:maxValue did not found for:" + myResources.getHeader() + ":" + label);
                }
                //******** just for debugging *********************
                if (label.contains("aiga-asr9ka")) {
                    System.out.println("CCM12:AlarmCheckerDaemon:numberOfChilds for " + label + " value=" + value + " maxValue=" + maxValue);
                }
                //************************ alarms detection *************************************************************************                
                Parameters myParameters = new Parameters(CCMonitorStatsObjsContainer.MAIN_DIRECTORY + "conf/parameters.properties", "UTF8");
                int createAlarmMinCallsDefault = myParameters.getIntValue("createAlarmMinCalls.DEFAULT", 5);
                int minCallsForType = myParameters.getIntValue("createAlarmMinCalls." + resourceType, createAlarmMinCallsDefault);
                boolean allowedToCreate = myParameters.getBooleanValue("createAlarm." + resourceType, false);
                //----
                if (value > maxValue && allowedToCreate && value > minCallsForType) {
                    System.out.println("CCM12:AlarmCheckerDaemon:numberOfChilds for " + label + "  " + myResources.getParametersOflabel(label));
                    //----------------
                    Set childsSet = myResources.getParametersOflabel(label).keySet();
                    int numberOfChilds = 1;
                    try {
                        numberOfChilds = childsSet.size() - 1;
                    } catch (Exception e) {
                        System.out.println("CCM12:AlarmChecckerDaemon:#2 error " + e.toString());
                        e.printStackTrace();
                    }
                    //-----------------------------------                    
                    if (numberOfChilds != 1) {
                        CCMAlarm myAlarm = new CCMAlarm(label, myAlertStartTimeStamp, resourceType);
                        System.out.println("CCM12:AlarmCheckerDaemon: NEW ALARM FOUND!!! (maxValue=" + maxValue + " value=" + value + " label=" + label + ")");
                        myAlarm.setAlertStart(myAlertStartTimeStamp);
                        TimeStamp1 now = myStatsObjContainer.getMyClock();
                        myAlarm.setAlarmStop(now.getNowUnformated());
                        String mostSignificantReason = myStatsObjContainer.findMostSignificantReason(resourceType, label, from, to);
                        myAlarm.setAlertMostSignificantReason(mostSignificantReason);
                        newresourceAlarms.add(myAlarm);
                    }
                }
            } catch (Exception e) {
                System.out.println("CCM12:AlarmCheckerDaemon:check_DSLAM error#:" + e.toString());
            }
        }
        return newresourceAlarms;
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

    /**
     * @param myCCMonitorStatsObjsContainer the myStatsObjContainer to set
     */
    public void setMyCCMonitorStatsObjsContainer(CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer) {
        this.myStatsObjContainer = myCCMonitorStatsObjsContainer;
    }

    /**
     * @param myAlarmsProccessor the myAlarmsProccessor to set
     */
    public void setMyAlarmsProccessor(AlarmsDetectionListener myAlarmsProccessor) {
        this.myAlarmsDetectionListener = myAlarmsProccessor;
    }

    public static void main(String args[]) {
        //int createAlarmMinCalls = Parameters.loadIntValue(CCMonitorStatsObjsContainer.MAIN_DIRECTORY + "conf/parameters.properties", "createAlarmMinCalls", "UTF8", 0);
        try {
            //-------------------load config ---------
            Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");

            Counters1 parent_child_map = new Counters1();
            String[] parent_childs = myParameters.getStringValue("parent_childs", "BRAS,DSLAM;DSLAM,SLOT;DSLAM,CABLE").split(";");
            for (String parent_child : parent_childs) {//BRAS,DSLAM
                String parent = parent_child.split(",")[0];
                String child = parent_child.split(",")[1];
                parent_child_map.updateCounters(parent, child);
            }
            CCMonitorStatsObjsContainer myContainer = new CCMonitorStatsObjsContainer(myParameters, parent_child_map);
            myContainer.loadFromDisk("CCM");
            myContainer.updateClock();
            myContainer.prepareCurrentObj();
            //myContainer.getCurrentObject().display();
            AlarmDetectionDaemon myDaemon = new AlarmDetectionDaemon(myContainer, 10000, 30);
            myDaemon.setDaemonName("myAlarmCheckerDaemon");
            myDaemon.setRunning(true);
            //System.out.println("CCM12:AlarmCheckerDaemon:" + myDaemon.getDaemonName() + " loaded");
        } catch (Exception e) {
            System.out.println("CCM12:AlarmChecckerDaemon:#3 error " + e.toString());
            e.printStackTrace();
        }

    }
}

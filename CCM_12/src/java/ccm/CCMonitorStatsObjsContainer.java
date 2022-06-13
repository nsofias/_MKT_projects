package ccm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import nsofiasLib.fileIO.CSV_LineParser;
import nsofiasLib.fileIO.FileParser2;
import nsofiasLib.others.Parameters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.Counters1;
import nsofiasLib.utils.TrafficVolumnPatern;

public class CCMonitorStatsObjsContainer {

    public static String MAIN_DIRECTORY = System.getenv("APPLICATIONS_PATH") + "/ccm/";
    BufferedWriter outlog;
    //private final List<String> calls = new CopyOnWriteArrayList();
    private final Map<String, CCMAlarm> alarmArrayList = new ConcurrentHashMap();
    private final Map<String, CallInfo> dimensionInstances = new ConcurrentHashMap();
    private int MODE = 0;//0:all 1:Only from genesys
    private int measurePeriod = 40;
    private int rememberPeriod = 4;//days to remember

    //private ArrayList fasmata;
    private final Map<String, Map<String, TrafficVolumnPatern>> paterns = new ConcurrentHashMap<>();
    private List<String> reasons = new CopyOnWriteArrayList();
    private ArrayList commentsLogArrayList = new ArrayList();

    private TimeStamp1 myClock;
    private TimeStamp1 myClockFirstIn;
    //
    private TimeStamp1 myLastCallInputTimeStamp = new TimeStamp1();
    private TimeStamp1 myAlarmCheckerDaemonTimeStamp;
    private TimeStamp1 myHealthCheckerDaemonTimeStamp;
    //--------STANDARD RESOURCES ------------------
    public static final String RESOURCE_TYPE_REASON = "DIMENSSION_REASON";
    public static final String RESOURCE_TYPE_TIME = "DIMENSSION_TIME";
    public static final String RESOURCE_TYPE_NETWORKTYPE = "DIMENSSION_NETWORKTYPE";
    //
    private AggregationsForPeriod currentObject;
    private final Parameters myParameters;
    private Counters1 parent_child_map;

    public CCMonitorStatsObjsContainer(Parameters parameters, Counters1 parent_child_map) throws Exception {
        this.parent_child_map = parent_child_map;
        this.myParameters = parameters;
        MODE = myParameters.getIntValue("MODE", 1);
        measurePeriod = myParameters.getIntValue("measurePeriod", 60);
        rememberPeriod = myParameters.getIntValue("rememberPeriod", 5);
        //==============
        //for MKT: //SERVING_AREA;ATC;DSLAM;OLT;SHELF;SLOT;CABLE;DP;BOX;
        paterns.put(RESOURCE_TYPE_REASON, new HashMap());
    }

    public AggregationsForPeriod getAggregationsForPeriod(String from, String to, boolean unique) throws Exception {
        AggregationsForPeriod myStatsForPeriod = new AggregationsForPeriod(from, to);
        ArrayList lineIdsToRemember = new ArrayList();
        List<String> keys = new ArrayList(getDimensionInstances().keySet());
        Collections.sort(keys, Collections.reverseOrder());
        //Collections.sort(keys,(a,b) ->b.compareTo(a));        
        for (String key : keys) {
            if (key.compareTo(to) <= 0) {
                //System.out.println("CCM12:key: first key " + keys.get(0) + " from=" + from + " to=" + to);
                //System.out.println("CCM12:key: first key " + keys.get(0) + " last key " + key + " Period from=" + from + " to=" + to);
                break;
            }
            String timestamp = key.split("_")[0];// or myCallInfo.getStartTime();            
            String lineId = key.split("_")[1]; // ormyCallInfo.getLineId();
            if (timestamp.compareTo(from) <= 0 && timestamp.compareTo(to) >= 0 && (!unique || !lineIdsToRemember.contains(lineId))) {
                CallInfo myCallInfo = getDimensionInstances().get(key);
                //------------------ TEST ------------------------------------
                //if (timestamp.compareTo(from) <= 0 && timestamp.compareTo(to) >= 0) {
                //System.out.println("CCM12:key:" + key);// + "   ---   " + myCallInfo.toString());
                //}
                //--------------------END TEST -------------------------------------------                
                lineIdsToRemember.add(lineId);
                //System.out.println("CCM12:getAggregations:parent_child_map labels are "+parent_child_map.getLabelsAsList());
                for (String resourceType : myCallInfo.getResources().keySet()) {
                    String resourceUsed = myCallInfo.getResources().get(resourceType);
                    if (resourceUsed != null && !resourceUsed.isEmpty()) {
                        //------child----------------
                        if (parent_child_map.containsLabel(resourceType)) {
                            //System.out.println("CCM12:getAggregationsForPeriod:resourceType to include (childs)="+resourceType);
                            Set<String> childResources = parent_child_map.getParametersOflabel(resourceType).keySet();
                            //System.out.println("**************CCM12:childResources*****************");
                            //System.out.println(new ArrayList(childResources).toString());
                            myStatsForPeriod.include(resourceType, resourceUsed);
                            for (String childResource : childResources) {
                                String child = myCallInfo.getResources().get(childResource);
                                myStatsForPeriod.include(resourceType, resourceUsed, child);
                                //System.out.println("CCM12:getAggregations: childs found for "+resourceType+" child:"+child);
                            }
                        } else {
                            //System.out.println("CCM12:getAggregationsForPeriod:resourceType to include (no childs)="+resourceType);
                            myStatsForPeriod.include(resourceType, resourceUsed);
                            //System.out.println("CCM12:getAggregations: no childs found for "+resourceType);
                        }

                        //System.out.println("CCM12:getAggregationsForPeriod:resourceType="+resourceType+  "   myResource="+myResource);
                    }
                }
            }
        }
        //System.out.println("CCM12:*********test only********************************");
        //myStatsForPeriod.getCurrentResourceCounters("DSLAM").displayCounters();
        //--------------
        Counters1 resourceTypeReasonCounters = aggregateOnReasons("", "", from, to, true);
        myStatsForPeriod.include(RESOURCE_TYPE_REASON, resourceTypeReasonCounters);
        //
        TimeStamp1 t3 = new TimeStamp1(myClock.getNowUnformated());
        t3.addHours(-24);
        String to_back = t3.getNowUnformated();
        Counters1 resourceTypeTimeCounters = aggregateOnTime("", "", from, to_back, true);
        myStatsForPeriod.include(RESOURCE_TYPE_TIME, resourceTypeTimeCounters);
        //System.out.println("CCM12:resourceTypes included:"+new ArrayList(myStatsForPeriod.getAggregationLabels()));
        return myStatsForPeriod;
    }

    public Counters1 aggregateOnResources(String resourceType, String from, String to, boolean unique) throws Exception {
        Counters1 myQStatsObjs = new Counters1(resourceType);
        ArrayList lineIdsToRemember = new ArrayList();
        for (String key : getDimensionInstances().keySet()) {
            CallInfo myCallInfo = getDimensionInstances().get(key);
            String timestamp = myCallInfo.getStartTime();
            String lineId = myCallInfo.getLineId();
            if (timestamp.compareTo(from) <= 0 && timestamp.compareTo(to) >= 0 && (!unique || !lineIdsToRemember.contains(lineId))) {
                lineIdsToRemember.add(myCallInfo.getLineId());
                String label = myCallInfo.getResources().get(resourceType);
                if (label != null && !label.isEmpty()) {
                    //System.out.println("myResource=" + myResource + "  myPstnNumberInfo.getTerminationCode()=" + myPstnNumberInfo.getTerminationCode());
                    if (myCallInfo.getReason() != null) {
                        myQStatsObjs.updateCounters(label);
                    }
                }
            }
        }
        return myQStatsObjs;
    }

    public Counters1 aggregateOnTime(String resourceType, String resource, String from, String to, boolean unique) throws Exception {
        Counters1 myQStatsObjs = new Counters1(RESOURCE_TYPE_TIME);
        ArrayList lineIdsToRemember = new ArrayList();
        for (String key : getDimensionInstances().keySet()) {
            try {
                CallInfo myCallInfo = getDimensionInstances().get(key);
                String timestamp = myCallInfo.getStartTime();
                String lineId = myCallInfo.getLineId();
                String callResource = myCallInfo.getResources().get(resourceType);
                if ((resource == null || resource.isEmpty() || (callResource != null && callResource.equals(resource)))
                        && (timestamp.compareTo(from) <= 0 && timestamp.compareTo(to) >= 0 && (!unique || !lineIdsToRemember.contains(lineId)))) {
                    lineIdsToRemember.add(myCallInfo.getLineId());
                    String label = myCallInfo.getStartTime().substring(0, 13);//20201010T1420 01.000
                    String lastDigit = label.substring(label.length() - 1);
                    if ("0,1,2,3,4".contains(lastDigit)) {
                        lastDigit = "0";
                    } else {
                        lastDigit = "5";
                    }
                    label = label.substring(0, label.length() - 1) + lastDigit;
                    //System.out.println("myResource=" + myResource + "  myPstnNumberInfo.getTerminationCode()=" + myPstnNumberInfo.getTerminationCode());

                    if (resource.isEmpty() || resource == null || (callResource != null && callResource.equals(resource))) {
                        myQStatsObjs.updateCounters(label, "COUNT");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //System.out.println("--------time aggr---------"+new Gson().toJson(myQStatsObjs));
        return myQStatsObjs;
    }

    public Counters1 aggregateOnReasons(String resourceType, String resource, String from, String to, boolean unique) throws Exception {
        Counters1 myQStatsObjs = new Counters1(RESOURCE_TYPE_REASON);
        ArrayList lineIdsToRemember = new ArrayList();
        for (String key : getDimensionInstances().keySet()) {
            try {
                CallInfo myCallInfo = getDimensionInstances().get(key);
                if (myCallInfo.getReason() == null) {
                    myCallInfo.setReason("UNKNOWN");
                }
                String timestamp = myCallInfo.getStartTime();
                String lineId = myCallInfo.getLineId();
                String callResource = myCallInfo.getResources().get(resourceType);
                if ((resource == null || resource.isEmpty() || (callResource != null && callResource.equals(resource)))
                        && (from.isEmpty() || timestamp.compareTo(from) <= 0) && (to.isEmpty() || timestamp.compareTo(to) >= 0)
                        && (!unique || !lineIdsToRemember.contains(lineId))) {
                    lineIdsToRemember.add(myCallInfo.getLineId());
                    if (resource == null || resource.isEmpty() || (callResource != null && callResource.equals(resource))) {
                        myQStatsObjs.updateCounters(myCallInfo.getReason(), "COUNT");
                    }
                }
            } catch (Exception e) {
            }
        }
        return myQStatsObjs;
    }

    public Counters1 getLineIDCalls(String lineID, String from, String to) throws Exception {
        Counters1 myQStatsObjs = new Counters1(RESOURCE_TYPE_TIME);
        for (String key : getDimensionInstances().keySet()) {
            CallInfo myCallInfo = getDimensionInstances().get(key);
            String timestamp = myCallInfo.getStartTime();
            String myLineID = myCallInfo.getLineId();
            if (lineID.equals(myLineID) && timestamp.compareTo(from) <= 0 && timestamp.compareTo(to) >= 0) {
                String label = myCallInfo.getStartTime().substring(0, 13);//20201010T1420 01.000
                String lastDigit = label.substring(label.length() - 1);
                if ("1,2,3,4".contains(lastDigit)) {
                    lastDigit = "0";
                } else {
                    lastDigit = "5";
                }
                label = label.substring(0, label.length() - 1) + lastDigit;
                myQStatsObjs.updateCounters(label, myCallInfo.getReason());
            }
        }
        return myQStatsObjs;
    }

    public Counters1 getReasonsForResource(String resourceType, String resource, String from, String to) throws Exception {
        Counters1 myQStatsObjs = new Counters1(resource);
        ArrayList lineIdsToRemember = new ArrayList();
        for (String key : getDimensionInstances().keySet()) {
            CallInfo myCallInfo = getDimensionInstances().get(key);
            String timestamp = myCallInfo.getStartTime();
            String lineId = myCallInfo.getLineId();
            String label = myCallInfo.getResources().get(resourceType);
            //System.out.println("CCM12:getReasonsForResource:resource:Type"+resourceType + " timestamp="+timestamp+" lineId="+lineId+" myResource="+myResource);
            if (lineId != null
                    && timestamp.compareTo(from) <= 0 && timestamp.compareTo(to) >= 0
                    && label != null && label.equals(resource)
                    && !lineIdsToRemember.contains(lineId)) {
                myQStatsObjs.updateCounters(myCallInfo.getReason());
                lineIdsToRemember.add(myCallInfo.getLineId());
            }
        }
        return myQStatsObjs;
    }

    public String findMostSignificantReason(String resourceType, String label, String from, String to) {
        String mostSignificantReason = "UNKN";
        try {
            Counters1 reasonsCounters = aggregateOnReasons(resourceType, label, from, to, true);
            Counters1 oldReasonsCounters = aggregateOnReasons(resourceType, label, "", "", true);
            double percDiff = 0;
            for (String reason : reasonsCounters.getCountersLabels()) {
                double perc = reasonsCounters.getVerticalParameterPerc(reason, "COUNT");
                double perc_ALL = oldReasonsCounters.getVerticalParameterPerc(reason, "COUNT");
                //System.out.println("CCM12:AlarmCheckerDaemon:getMostSignificantReason perc=" + perc + " perc_ALL=" + perc_ALL);
                if (percDiff <= perc - perc_ALL) {
                    percDiff = perc - perc_ALL;
                    mostSignificantReason = reason;
                }
            }
        } catch (Exception e) {
            System.out.println("CCM12:AlarmCheckerDaemon:getMostSignificantReason error:" + e.toString());
        }
        return mostSignificantReason;
    }

    public Counters1 getLinesForResource(String resourceType, String resource, String from, String to) throws Exception {
        Counters1 a_numbers = new Counters1();
        for (String key : getDimensionInstances().keySet()) {
            CallInfo myCallInfo = getDimensionInstances().get(key);
            String timestamp = myCallInfo.getStartTime();
            String lineId = myCallInfo.getLineId();
            String myResource = myCallInfo.getResources().get(resourceType);
            //System.out.println(resourceType+" "+myResource+" "+timestamp+" "+from+" "+to);
            if (lineId != null
                    && timestamp.compareTo(from) <= 0 && timestamp.compareTo(to) >= 0
                    && (myResource != null && myResource.equals(resource) || resource.isEmpty())) {
                String networkType = myCallInfo.getNetworkType();
                if (networkType == null) {
                    networkType = "-";
                }
                a_numbers.updateCounters(lineId, networkType);
                //System.out.println("found!!!" + resourceType + " " + myResource + " " + timestamp + " " + from + " " + to);
            }
        }
        return a_numbers;
    }

    public Set<String> getCallsForResource(String resourceType, String resource, String from, String to) throws Exception {
        Set<String> calls = new HashSet();
        for (String key : getDimensionInstances().keySet()) {
            CallInfo myCallInfo = getDimensionInstances().get(key);
            String timestamp = myCallInfo.getStartTime();
            String lineId = myCallInfo.getLineId();
            String myResource = myCallInfo.getResources().get(resourceType);
            //System.out.println(resourceType+" "+myResource+" "+timestamp+" "+from+" "+to);
            if (lineId != null
                    && timestamp.compareTo(from) <= 0 && timestamp.compareTo(to) >= 0
                    && (myResource != null && myResource.equals(resource) || resource.isEmpty())) {
                //System.out.println("found!!!" + resourceType + " " + myResource + " " + timestamp + " " + from + " " + to);
                calls.add(lineId + " @ " + new TimeStamp1(timestamp).getNowFormated()+" reason: "+myCallInfo.getReason());
            }
        }
        return calls;
    }

    public Counters getLinesForPeriod(String from, String to) throws Exception {
        Counters a_numbers = new Counters();
        for (String key : getDimensionInstances().keySet()) {
            CallInfo myCallInfo = getDimensionInstances().get(key);
            String timestamp = myCallInfo.getStartTime();
            String lineId = myCallInfo.getLineId();
            if (lineId != null
                    && timestamp.compareTo(from) <= 0 && timestamp.compareTo(to) >= 0) {
                a_numbers.updateCounters(lineId);
            }
        }
        return a_numbers;
    }

    public Counters1 getCallersCounters(CCMAlarm myAlarm) throws Exception {
        return getLinesForResource(myAlarm.getAlarmType(), myAlarm.getAlarmObject(), myAlarm.getAlarmStop(), myAlarm.getAlertStart());
    }

    public Counters1 getCallersCounters(CCMTicket myTicket) throws Exception {
        return getLinesForResource(myTicket.getType(), myTicket.getElementName(), myTicket.getIncidentStoppedDate(), myTicket.getIncidentStartDate());
    }

    public long getCallersUniqueNumber(CCMAlarm myAlarm) throws Exception {
        return getCallersCounters(myAlarm).size();
    }

    public long getCallersTotalNumber(CCMAlarm myAlarm) throws Exception {
        return (long) getCallersCounters(myAlarm).getTotalValue();
    }

    public Counters1 getReasonsCounters(CCMAlarm myAlarm) throws Exception {
        return getReasonsForResource(myAlarm.getAlarmType(), myAlarm.getAlarmObject(), myAlarm.getAlarmStop(), myAlarm.getAlertStart());

    }

    public int size() {
        return getDimensionInstances().size();
    }

    public void removeOldmessages() {
        for (int i = commentsLogArrayList.size() - 1; i >= 0; i--) {
            TimeStamp1 commentsTimeStamp = new TimeStamp1(((String) commentsLogArrayList.get(i)).substring(0, 23));
            TimeStamp1 rightNow = new TimeStamp1();
            if (rightNow.minutesDiff(commentsTimeStamp) > 20) {
                commentsLogArrayList.remove(i);
            }
        }
    }

    //==================================
    public void flushToDisk(String fileName) {
        String CONF_DIR = MAIN_DIRECTORY + "conf/";
        System.out.println("CCM12:flushing To Disk");
        try {
            //======================              
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(CONF_DIR + fileName + ".paterns"), "UTF-8"))) {
                synchronized (paterns) {
                    Gson gson = new GsonBuilder().create();
                    gson.toJson(paterns, writer);
                }
            }
            //==================================               
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(CONF_DIR + fileName + ".data"), "UTF-8"))) {
                synchronized (getDimensionInstances()) {
                    Gson gson = new GsonBuilder().create();
                    gson.toJson(getDimensionInstances(), writer);
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(CONF_DIR + fileName + ".alarms"), "UTF-8"))) {
                Gson gson = new GsonBuilder().create();
                gson.toJson(alarmArrayList, writer);
            }
        } catch (Exception e) {
            System.out.println("CCM12:flushToDisk error:" + e.toString());
        }
    }

    public void loadFromDisk(String fimeName) throws Exception {
        String CONF_DIR = MAIN_DIRECTORY + "conf/";
        CSV_LineParser myLineParser = new CSV_LineParser();
        myLineParser.setKeepResults(true);
        myLineParser.setSplitterStr(";");
        FileParser2 myFileParser = new FileParser2(myLineParser);
        myFileParser.setEncoding("UTF-8");
        //---------------LOAD RegistrationCallInfo-----------------
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(CONF_DIR + fimeName + ".data"), "utf-8"));
            Gson gson = new Gson();
            java.lang.reflect.Type array_type = new TypeToken<Map<String, CallInfo>>() {
            }.getType();
            getDimensionInstances().putAll((Map<String, CallInfo>) gson.fromJson(bufferedReader, array_type));
            System.out.println("CCM12:parsed" + CONF_DIR + fimeName + ".data");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("CCM12:loadFromDisk error: file " + CONF_DIR + fimeName + ".data not found!!!");
        } catch (Exception e) {
            System.out.println("CCM12:loadFromDisk error:" + CONF_DIR + fimeName + ".data Not loaded!!!");
            e.printStackTrace(System.out);
        }

        //---------------LOAD Alarms-----------------
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(CONF_DIR + fimeName + ".alarms"), "utf-8"));
            Gson gson = new Gson();
            java.lang.reflect.Type type = new TypeToken<Map<String, CCMAlarm>>() {
            }.getType();
            alarmArrayList.putAll((Map<String, CCMAlarm>) gson.fromJson(bufferedReader, type));
            System.out.println("CCM12:parsed" + fimeName + ".alarms");
        } catch (Exception e) {
            System.out.println("CCM12:loadFromDisk error:" + CONF_DIR + fimeName + ".alarms Not loaded!!!");
        }

        //---------------LOAD traffic_paterns-----------------
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(CONF_DIR + fimeName + ".paterns"), "utf-8"));
            Gson gson = new Gson();
            java.lang.reflect.Type type = new TypeToken<Map<String, Map<String, TrafficVolumnPatern>>>() {
            }.getType();
            paterns.putAll((Map<String, Map<String, TrafficVolumnPatern>>) gson.fromJson(bufferedReader, type));
            System.out.println("CCM12:parsed" + fimeName + ".paterns");
        } catch (Exception e) {
            System.out.println("CCM12:loadFromDisk error:" + CONF_DIR + fimeName + ".paterns Not loaded!!!");
        }

    }

    /**
     * @return the dimensionInstances
     */
    public Map<String, CallInfo> getDimensionInstances() {
        return dimensionInstances;
    }

    public Map<String, CCMAlarm> getAlarmArrayList() {
        //Collections.sort(alarmArrayList);
        return alarmArrayList;
    }

    public void put(String calmyCallInfoIndex, CallInfo myCallInfo) {
        getDimensionInstances().put(calmyCallInfoIndex, myCallInfo);
        //setMyLastCallInputTimeStamp(new TimeStamp1());
    }

    public boolean isEmpty() {
        return getDimensionInstances().isEmpty();
    }

    public Map<String, CCMAlarm> getAlarmArrayList_active() {
        Map<String, CCMAlarm> alarmArrayList1 = new HashMap();
        alarmArrayList.keySet().forEach(key -> {
            CCMAlarm myAlarm = alarmArrayList.get(key);
            if (myAlarm.isStilAlive()) {
                alarmArrayList1.put(key, myAlarm);
            }
        });
        return alarmArrayList1;
    }

    /*
    public ArrayList getFasmata()
        {
        return fasmata;
        }*/
    public TimeStamp1 getMyClock() {
        TimeStamp1 t1;
        try {
            t1 = new TimeStamp1(myClock.getNowUnformated());
            //t1.addSeconds(600);
        } catch (Exception e) {
            t1 = new TimeStamp1();
        };
        return t1;
    }

    public ArrayList getCommentsLogArrayList() {
        return commentsLogArrayList;
    }

    public void setCommentsLogArrayList(ArrayList commentsLogArrayList) {
        this.commentsLogArrayList = commentsLogArrayList;
    }

    public int getMeasurePeriod() {
        return measurePeriod;
    }

    public void setMyLastCallInputTimeStamp(TimeStamp1 myLastCallInputTimeStamp) {
        this.myLastCallInputTimeStamp = myLastCallInputTimeStamp;
    }

    public void setMyAlarmCheckerDaemonTimeStamp(TimeStamp1 myAlarmCheckerDaemonTimeStamp) {
        this.myAlarmCheckerDaemonTimeStamp = myAlarmCheckerDaemonTimeStamp;
    }

    public void setMyHealthCheckerDaemonTimeStamp(TimeStamp1 myHealthCheckerDaemonTimeStamp) {
        this.myHealthCheckerDaemonTimeStamp = myHealthCheckerDaemonTimeStamp;
    }

    public TimeStamp1 getMyLastCallInputTimeStamp() {
        return myLastCallInputTimeStamp;
    }

    public TimeStamp1 getMyAlarmCheckerDaemonTimeStamp() {
        return myAlarmCheckerDaemonTimeStamp;
    }

    public TimeStamp1 getMyHealthCheckerDaemonTimeStamp() {
        return myHealthCheckerDaemonTimeStamp;
    }

    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------    
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //----------------------- private ------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    //--------------------------------------------------------------
    public void updateClock() {
        System.out.println("CCM12:updateClock. dimensionInstances size:" + getDimensionInstances().size());
        if (getDimensionInstances().isEmpty()) {
            System.out.println("CCM12:updateClock = NULL. No call instances!!!");
            myClock = null;
            return;
        }
        ArrayList<String> instances = new ArrayList(getDimensionInstances().keySet());
        Collections.sort(instances);
        myClockFirstIn = new TimeStamp1(instances.get(0).split("_")[0]);
        myClock = new TimeStamp1(instances.get(instances.size() - 1).split("_")[0]);
        System.out.println("CCM12:myClockFirstIn=" + myClockFirstIn.getNowFormated());
        System.out.println("CCM12:myClock=" + myClock.getNowFormated());
    }

    public void prepareCurrentObj() {
        {
            if (myClock != null) {
                try {
                    System.out.println("CCM12:prepareCurrentObj: Clock: " + myClock.getNowUnformated());
                    System.out.println("CCM12:prepareCurrentObj: measurePeriod: " + measurePeriod);
                    TimeStamp1 t2 = new TimeStamp1(myClock.getNowUnformated());
                    t2.addMinutes(-measurePeriod);
                    String from = myClock.getNowUnformated();
                    String to = t2.getNowUnformated();
                    currentObject = getAggregationsForPeriod(from, to, true);
                    System.out.println("CCM12:currentObject:" + currentObject);
                } catch (Exception e) {
                    e.printStackTrace(System.out);
                    System.out.println("CCM12:getQStatsObjsArrayList error:" + e.toString());
                }
            }
        }
    }

    /**
     * @return the myClockFirstIn
     */
    public TimeStamp1 getMyClockFirstIn() {
        return myClockFirstIn;
    }

    /**
     * @param myClockFirstIn the myClockFirstIn to set
     */
    public void setMyClockFirstIn(TimeStamp1 myClockFirstIn) {
        this.myClockFirstIn = myClockFirstIn;
    }

    /**
     * @return the MODE
     */
    public int getMODE() {
        return MODE;
    }

    public Map<String, Map<String, TrafficVolumnPatern>> getPaterns() {
        return paterns;
    }

    public Map<String, TrafficVolumnPatern> getPaternsOfResource(String resourceType) {
        return getPaterns().get(resourceType);
    }

    public List<String> getReasons() {
        return reasons;
    }

    /**
     * @param reasons the myReasons to set
     */
    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    /**
     * @return the currentObject
     */
    public AggregationsForPeriod getCurrentObject() {
        return currentObject;
    }

    /**
     * @return the myParameters
     */
    public Parameters getMyParameters() {
        return myParameters;
    }

//*********************************************************
    public static void main(String args[]) {
        String fileName = "CCM";
        try {
            Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");
            try {
                Counters1 parent_child_map = new Counters1();
                String[] parent_childs = myParameters.getStringValue("parent_childs", "BRAS,DSLAM;DSLAM,SLOT;DSLAM,CABLE").split(";");
                for (String parent_child : parent_childs) {//BRAS,DSLAM
                    String parent = parent_child.split(",")[0];
                    String child = parent_child.split(",")[1];
                    parent_child_map.updateCounters(parent, child);
                }
                CCMonitorStatsObjsContainer myContainer = new CCMonitorStatsObjsContainer(myParameters, parent_child_map);
                myContainer.loadFromDisk(fileName);
                myContainer.updateClock();
                myContainer.prepareCurrentObj();
                System.out.println("CCM12:AlarmsLoaderDaemon:endProccess finished");
            } catch (Exception e) {
                System.out.println("CCM12:AlarmsLoaderDaemon:endProccess error: " + e.toString());
                e.printStackTrace(System.out);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);

        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import static ccm.CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME;
import java.util.*;
import nsofiasLib.others.Parameters;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.Counters1;
import nsofiasLib.utils.TrafficVolumnPatern;

/**
 *
 * @author nsofias
 */
public class CalcTrafficPatternsDaemon extends SimpleDaemon {

    private CCMonitorStatsObjsContainer myStatsObjContainer;

    public CalcTrafficPatternsDaemon(CCMonitorStatsObjsContainer myStatsObjContainer, int sleep, int step) {
        super(sleep, step);
        this.myStatsObjContainer = myStatsObjContainer;
    }

    @Override
    public void processData() {
        if (myStatsObjContainer.getMyClock() != null && !myStatsObjContainer.isEmpty()) {
            try {
                System.out.println("CCM12:CalcTrafficPatternsDaemon:Now it is time to calculate traffic_paterns");
                calculate_traffic_paterns_new();
            } catch (Exception e) {
                e.printStackTrace(System.out);
                System.out.println("CCM12:CalcTrafficPatterns error " + e.toString());
                //new MailAlert().sendmailAlert("CCM12:CalcTrafficPatternsDaemon:calculate_traffic_patern error:" + e.toString(), e);
            }
            System.out.println("CCM12:CalcTrafficPatternsDaemon:calculate_traffic_patern (ALL) ok!");
            System.out.println("CCM12:CalcTrafficPatternsDaemon:flushToDisk ok!");
            System.out.println("CCM12:CalcTrafficPatternsDaemon:procees END ok");
        }
    }

    /**
     * @param myCCMonitorStatsObjsContainer the myContainer to set
     */
    public void setMyCCMonitorStatsObjsContainer(CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer) {
        this.myStatsObjContainer = myCCMonitorStatsObjsContainer;
    }

    public void calculate_traffic_paterns() {
        try {
            TimeStamp1 clockDate = myStatsObjContainer.getMyClock();
            TimeStamp1 pastlDate = new TimeStamp1(clockDate.getNowUnformated());
            pastlDate.addDays(-5);
            TimeStamp1 firstDate = myStatsObjContainer.getMyClockFirstIn();
            if (firstDate.isAfter(pastlDate)) {
                pastlDate = new TimeStamp1(firstDate.getNowUnformated());
            }
            Map<String, Map<String, TrafficVolumnPatern>> paterns = new HashMap<>();
            if (myStatsObjContainer.getMyClockFirstIn() == null) {
                System.out.println("CCM12:CalcTrafficPatternsDaemon:: MyClockFirstIn == null. I will exit ");
                return;
            }
            AggregationsForPeriod myCurrentObjectAll = myStatsObjContainer.getAggregationsForPeriod(clockDate.getNowUnformated(), pastlDate.getNowUnformated(), true);
            Set<String> rerourceTypes = myCurrentObjectAll.getAggregationLabels();
            Map<String, Counters> variationCounters = new HashMap();
            for (String resourceType : rerourceTypes) {
                if (resourceType.equals(RESOURCE_TYPE_TIME)) {
                    continue;
                }
                if (variationCounters.get(resourceType) == null) {
                    variationCounters.put(resourceType, new Counters());
                    System.out.println("CCM12:CalcTrafficPatternsDaemon:variationCounters resourceType added:" + resourceType);
                }
                System.out.println("CCM12:CalcTrafficPatternsDaemon: preparing rerourceType=" + resourceType);
                Counters1 myQStatsObjsList = myCurrentObjectAll.getCurrentResourceCounters(resourceType).getLabelsPercValues("COUNT");
                for (String objName : myQStatsObjsList.getCountersLabels()) {
                    TrafficVolumnPatern myTrafficPatern = new TrafficVolumnPatern(objName);
                    myTrafficPatern.setVolumnPatern_mean(myQStatsObjsList.getValue(objName));
                    if (paterns.get(resourceType) == null) {
                        paterns.put(resourceType, new HashMap<String, TrafficVolumnPatern>());
                    }
                    paterns.get(resourceType).put(objName, myTrafficPatern);
                }
            }
            TimeStamp1 t1, t2;
            t1 = clockDate;
            t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addMinutes(-myStatsObjContainer.getMeasurePeriod());
            String from = t1.getNowUnformated().substring(0, 13);
            String to = t2.getNowUnformated().substring(0, 13);
            System.out.println("CCM12:CalcTrafficPatternsDaemon: prepared CALCULATING PATERNS for PERIOD:" + from + " to: " + pastlDate.getNowUnformated().substring(0, 13));
            //
            int N = 0;
            while (pastlDate.getNowUnformated().compareTo(to + "00.000") < 0 && this.isRunning()) {
                AggregationsForPeriod myCurrentObjectPeriod = myStatsObjContainer.getAggregationsForPeriod(from, to, true);
                for (String resourceType : rerourceTypes) {
                    if (resourceType.equals(RESOURCE_TYPE_TIME)) {
                        continue;
                    }
                    try {
                        Counters1 myQStatsObjsList_period = myCurrentObjectPeriod.getCurrentResourceCounters(resourceType);
                        if (myQStatsObjsList_period != null) {
                            myQStatsObjsList_period = myQStatsObjsList_period.getLabelsPercValues("COUNT");
                            for (String objName : myQStatsObjsList_period.getCountersLabels()) {
                                double perc_period = myQStatsObjsList_period.getValue(objName);
                                double perc;
                                TrafficVolumnPatern pat = paterns.get(resourceType).get(objName);
                                if (pat != null) {
                                    perc = pat.getVolumnPatern_mean();
                                } else {
                                    perc = 0;
                                }
                                variationCounters.get(resourceType).updateCounters(objName, (perc_period - perc) * (perc_period - perc));
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("CCM12:CalcTrafficPatternsDaemon:calc_traffic_patern: error :" + e.toString());
                        e.printStackTrace();
                    }
                }
                N++;
                t1.addMinutes(-10);   // or -10 for smoother calculation
                t2 = new TimeStamp1(t1.getNowUnformated());
                t2.addMinutes(-myStatsObjContainer.getMeasurePeriod());
                from = t1.getNowUnformated().substring(0, 13);
                to = t2.getNowUnformated().substring(0, 13);
            }
            System.out.println("CCM12:CalcTrafficPatternsDaemon: variationCounters=" + variationCounters.keySet());
            for (String resourceType : rerourceTypes) {
                if (resourceType.equals(RESOURCE_TYPE_TIME)) {
                    continue;
                }
                System.out.println("CCM12:calc_traffic_patern: " + resourceType + " STARTED...");
                for (String key : paterns.get(resourceType).keySet()) {
                    try {
                        TrafficVolumnPatern myTrafficPatern = paterns.get(resourceType).get(key);
                        String paternName = myTrafficPatern.getVolumnPatern_name();
                        myTrafficPatern.setVolumnPatern_max(myTrafficPatern.getVolumnPatern_mean() + 3.5 * Math.sqrt(variationCounters.get(resourceType).getValue(paternName) / N));
                        if (myStatsObjContainer.getPaterns().get(resourceType) == null) {
                            Map myMap = new HashMap<String, TrafficVolumnPatern>();
                            myMap.put(paternName, myTrafficPatern);
                            myStatsObjContainer.getPaterns().put(resourceType, myMap);
                        } else {
                            myStatsObjContainer.getPaterns().get(resourceType).put(paternName, myTrafficPatern);
                        }
                    } catch (Exception e) {
                        System.out.println("CCM12:CalcTrafficPatternsDaemon:CALCULATING PATERNS FOR resourceType:" + resourceType + " error:" + e.toString());
                        e.printStackTrace();
                    }
                }
                System.out.println("CCM12:calc_traffic_patern: " + resourceType + " FINISHED!!!");
            }
            System.out.println("CCM12:calc_traffic_patern FINISHED for all types!!!");
        } catch (Exception e) {
            System.out.println("CCM12:CalcTrafficPatternsDaemon:calc_traffic_patern: error :" + e.toString());
            e.printStackTrace(System.out);
        } finally {
        }
    }

    public void calculate_traffic_paterns_new() {
        try {
            TimeStamp1 clockDate = myStatsObjContainer.getMyClock();
            TimeStamp1 pastlDate = new TimeStamp1(clockDate.getNowUnformated());
            pastlDate.addDays(-5);
            TimeStamp1 firstDate = myStatsObjContainer.getMyClockFirstIn();
            if (firstDate.isAfter(pastlDate)) {
                pastlDate = new TimeStamp1(firstDate.getNowUnformated());
            }
            Map<String, Map<String, TrafficVolumnPatern>> paterns = new HashMap<>();
            if (myStatsObjContainer.getMyClockFirstIn() == null) {
                System.out.println("CCM12:CalcTrafficPatternsDaemon:: MyClockFirstIn == null. I will exit ");
                return;
            }

            TimeStamp1 t1, t2;
            t1 = clockDate;
            t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addMinutes(-myStatsObjContainer.getMeasurePeriod());
            String from = t1.getNowUnformated().substring(0, 13);
            String to = t2.getNowUnformated().substring(0, 13);
            System.out.println("CCM12:CalcTrafficPatternsDaemon: prepared CALCULATING PATERNS for PERIOD:" + from + "  to: " + pastlDate.getNowUnformated().substring(0, 13));
            //
            int N = 0;
            //***************************************************************88
            Map<String, Counters1> aggregations = new HashMap();
            while (pastlDate.getNowUnformated().compareTo(to + "00.000") < 0 && this.isRunning()) {
                AggregationsForPeriod myCurrentObjectPeriod = myStatsObjContainer.getAggregationsForPeriod(from, to, true);
                for (String resourceType : myCurrentObjectPeriod.getAggregationLabels()) {
                    if (resourceType.equals(RESOURCE_TYPE_TIME)) {
                        continue;
                    }
                    try {
                        Counters1 snapshot_period_resourceType = myCurrentObjectPeriod.getCurrentResourceCounters(resourceType);
                        snapshot_period_resourceType = snapshot_period_resourceType.getLabelsPercValues("COUNT");
                        for (String resource : snapshot_period_resourceType.keySet()) {
                            double value = snapshot_period_resourceType.getValue(resource);
                            if (aggregations.get(resourceType) == null) {
                                aggregations.put(resourceType, new Counters1());
                            }
                            aggregations.get(resourceType).updateCounters(from + "-" + to, resource, value);
                        }
                    } catch (Exception e) {
                        System.out.println("CCM12:CalcTrafficPatternsDaemon:calc_traffic_patern: error :" + e.toString());
                        e.printStackTrace();
                    }
                }
                //***************************************************************88
                N++;
                t1.addMinutes(-10);   // or -10 for smoother calculation
                t2 = new TimeStamp1(t1.getNowUnformated());
                t2.addMinutes(-myStatsObjContainer.getMeasurePeriod());
                from = t1.getNowUnformated().substring(0, 13);
                to = t2.getNowUnformated().substring(0, 13);
            }
            for (String resourceType : aggregations.keySet()) {
                Counters1 aggregations_resourceType = aggregations.get(resourceType);
                //////
                //if (resourceType.equals("SERVING_AREA")) {
                //    System.out.println(aggregations_resourceType.toString("xxx", null));
                //}
                ///////
                aggregations_resourceType.updateModel();
                Set<String> resources = aggregations_resourceType.getKnownParameters();
                for (String resource : resources) {
                    double mean = aggregations_resourceType.getModel().get(resource)[0];
                    double max = aggregations_resourceType.getModel().get(resource)[2];
                    TrafficVolumnPatern myTrafficPatern = new TrafficVolumnPatern(resource);
                    myTrafficPatern.setVolumnPatern_mean(mean);
                    myTrafficPatern.setVolumnPatern_max(max);
                    if (myStatsObjContainer.getPaterns().get(resourceType) == null) {
                        myStatsObjContainer.getPaterns().put(resourceType, new HashMap<String, TrafficVolumnPatern>());
                    }
                    myStatsObjContainer.getPaterns().get(resourceType).put(resource, myTrafficPatern);
                    //System.out.println(myTrafficPatern);
                }
            }

            System.out.println("CCM12:calc_traffic_patern FINISHED for all types!!!");
        } catch (Exception e) {
            System.out.println("CCM12:CalcTrafficPatternsDaemon:calc_traffic_patern: error :" + e.toString());
            e.printStackTrace(System.out);
        } finally {
        }
    }

//******************************************************************************
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
                CalcTrafficPatternsDaemon myCalcTrafficPatterns = new CalcTrafficPatternsDaemon(myContainer, 10000, 30);
                myCalcTrafficPatterns.setRunning(true);
                myCalcTrafficPatterns.calculate_traffic_paterns();
            } catch (Exception e) {
                System.out.println("CCM12:AlarmsLoaderDaemon:endProccess error: " + e.toString());
                e.printStackTrace(System.out);
            }
            //------------------------- Mailer Daemon Schedule to run every 60 secs-------------------------------------------   
            /*
            CalcTrafficPatternsDaemon myCalcTrafficPatterns = new CalcTrafficPatternsDaemon(myContainer, 10000, 30);
            myCalcTrafficPatterns.setRunning(true);
            myCalcTrafficPatterns.calculate_traffic_paterns();
            //Thread myCalcTrafficPatternsThread = new Thread(myCalcTrafficPatterns);
            //myCalcTrafficPatternsThread.run();
            myContainer.flushToDisk(fileName);
            //Thread myCalcTrafficPatternsDaemonThread = new Thread(myCalcTrafficPatternsDaemon);
            //myCalcTrafficPatternsDaemonThread.start();*/
        } catch (Exception e) {
            System.out.println("CCM12:CalcTrafficPatterns error#1 " + e.toString());
            e.printStackTrace(System.out);

        }
    }
}

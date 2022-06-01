package SKOPIA;

import diligent_MKT.Alarm_FYROM;
import diligent_MKT.PathsRetriever;
import java.util.List;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.mapper.paths.Paths_1D_decimal;

public class Diligent_Daemon extends SimpleDaemon {
    private String desc;
    private final AlarmDetector myAlarmDetector;
    PathsRetriever myPathsRetriever;
    long linesFound = 0, linesIncluded = 0;
    Config myConfig;

    public Diligent_Daemon(String aggrType, AlarmDetector myAlarmDetector, PathsRetriever myPathsRetriever, Config myConfig, int sleep) throws Exception {
        super(sleep);
        this.myAlarmDetector = myAlarmDetector;
        this.myPathsRetriever = myPathsRetriever;
        //-----------------    
        this.desc = aggrType;
        try {
            myAlarmDetector.getMyContainer().loadFromDisk(aggrType);
        } catch (Exception e) {
            System.out.println("DSLMON_SKOPIA:loadFromDisk failed: Must calculate_traffic_patern..." + e.toString());
            //myStatsObjContainer.calculate_traffic_patern();
        }
        this.myConfig = myConfig;
    }

    public String isLineInMassive(String path) throws Exception {
        List<Alarm_FYROM> myLiveAlarms = this.getMyStatsObjContainer().getAlarmArrayList_stillAlive();
        System.out.println("NewWebServiceFromWSDL:myLiveAlarms.size()=" + myLiveAlarms.size());
        for (Alarm_FYROM myAlarm : myLiveAlarms) {
            System.out.println("NewWebServiceFromWSDL:path:" + path + " <->  Alert:" + myAlarm.getAlertOrigin());
            if (path.contains(myAlarm.getAlarmObject())) {
                return myAlarm.getTicketSR();
            }
        }
        return null;
    }

    @Override
    public void processData() {
        try {
            Paths_1D_decimal newAggregation = myPathsRetriever.retrieveAggr();
            if (newAggregation != null) {
                //------------------------------
                System.out.println("********************* IMS: header: ' (" + desc + ") " + newAggregation.getHeader() + "' size:" + newAggregation.size() + " *************");
                if (newAggregation.size() > 1) {
                    try {
                        getMyStatsObjContainer().prepare(newAggregation);
                        System.out.println("DSLMON_SKOPIA:myStatsObjContainer prepared (" + desc + ") ");
                        //--------------DATABASE---------
                        try {
                            getMyStatsObjContainer().save_lastShot_to_database(desc);
                            System.out.println("DSLMON_SKOPIA: save_lastShot_to_database completed at (" + desc + ") " + new TimeStamp1().getNowFormated());
                        } catch (Exception e) {
                            System.out.println("DSLMON_SKOPIA: save_lastShot_to_database:" + e.toString());
                            e.printStackTrace();
                            //new MailAlert().sendmailAlert("DSLMON_SKOPIA: error:", e);
                        }
                        if (getMyStatsObjContainer().getSize() > 1) {
                            //&&&&&&&&&&&&&&&&&&&&&&&&&&& differentiate &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
                            System.out.println("DSLMON_SKOPIA:(" + this.desc + ") checkForAlarms @" + new TimeStamp1().getNowFormated());
                            long alarmsFound = getMyAlarmDetector().checkForAlarms();
                            System.out.println("DSLMON_SKOPIA: AlarmDetector finished at (" + desc + ") " + new TimeStamp1().getNowFormated() + "Found " + alarmsFound);
                        }
                    } catch (Exception e) {
                        System.out.println("DSLMON_SKOPIA: error  @ stopParser:  (" + desc + ") " + e.toString());
                        //e.printStackTrace(System.out);
                        new MailAlert().sendmailAlert("DSLMON_SKOPIA: error:", e);
                        throw e;
                    }
                    System.out.println("DSLMON_SKOPIA: trimToSize_List ok! (" + desc + ") ");
                }
            }
        } catch (Exception e) {
            //e.printStackTrace(System.out);
            new MailAlert().sendmailAlert("DSLMON_SKOPIA: error:", e);
            System.out.println("DSLMON_SKOPIA: error  Diligent_Daemon/processData: (" + desc + ") " + e.toString());
        }
    }


    /**
     * @return the myStatsObjContainer
     */
    public Container getMyStatsObjContainer() {
        return getMyAlarmDetector().getMyContainer();
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }


    /**
     * @return the myAlarmDetector
     */
    public AlarmDetector getMyAlarmDetector() {
        return myAlarmDetector;
    }
}

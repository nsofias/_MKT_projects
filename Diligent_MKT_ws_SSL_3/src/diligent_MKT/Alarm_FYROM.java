package diligent_MKT;

import diligent_mkt_ws.Alarm_umbrella;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import nsofiasLib.databases.DatabaseLogger;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.MailSender_new;

public class Alarm_FYROM extends nsofiasLib.ote.alarms.Alarm {

    private String SERVING_AREA;
    private String ATC;
    private String DSLAM;
    private String SHELF;
    private String SLOT;
    private String CABLE;
    private String DP;
    private String OLT;
    private String BOX;
    //--------------
    private String DESCRIPTION;
    private String REGION;
    public String corrStr;
    public double valueStuck = 0;
    public String notes;
    public String ERT;
    private long linesDisconnected = 0;
    private long linesRegistered = 0;
    private long linesAffected = 0;
    private long activeLinesAffected = 0;
    private String affectedServicesAsString;
    private transient Counters myServices = new Counters();
    private String whereStr = null;
    private String affServiceID = "";
    private String markCustomersStatus = "";
    private String releaseCustomersStatus = "";
    private String alarmReason = "Massive";//Massive,Maintenance.
    //---------
    private String myBulletinid = "";
    private boolean dyingGasp = false;
    private AlarmOpenningProfile alarmOpenningProfile;
    //-----------
    public static String STATE_PENDING_TO_CLOSE = "PENDING_TO_CLOSE";
    public static String TYPE_COPPER = "TYPE_COPPER";
    public static String TYPE_COPPER_CABLE = "TYPE_COPPER_CABLE";
    public static String TYPE_GPON = "TYPE_GPON";
    public static String TYPE_GPON_CABLE = "TYPE_GPON_CABLE";
    public static String SUBTYPE_COPPER_SERVING_AREA = "COPPER_SERVING_AREA";
    public static String SUBTYPE_COPPER_ATC = "COPPER_ATC";
    public static String SUBTYPE_COPPER_DSLAM = "COPPER_DSLAM";
    public static String SUBTYPE_COPPER_SLOT = "COPPER_SLOT";
    public static String SUBTYPE_COPPER_CABLE_ATC = "COPPER_CABLE_ATC";
    public static String SUBTYPE_COPPER_CABLE_CABLE = "COPPER_CABLE";
    public static String SUBTYPE_COPPER_CABLE_DP = "COPPER_DP";
    public static String SUBTYPE_GPON_OLT = "GPON_OLT";
    public static String SUBTYPE_GPON_SHELF = "GPON_SHELF";
    public static String SUBTYPE_GPON_SLOT = "GPON_SLOT";
    public static String SUBTYPE_GPON_CABLE_ATC = "GPON_CABLE_ATC";
    public static String SUBTYPE_GPON_CABLE = "GPON_CABLE";
    public static String SUBTYPE_GPON_BOX = "GPON_BOX";//DP
    //
    public static int COPPER_PATH_DEPTH_SERVING_AREA = 1;
    public static int COPPER_PATH_DEPTH_ATC = 2;
    public static int COPPER_PATH_DEPTH_DSLAM = 3;
    public static int COPPER_PATH_DEPTH_SLOT = 4;
    public static int COPPER_CABLE_PATH_DEPTH_ATC = 1;
    public static int COPPER_CABLE_PATH_DEPTH_CABLE = 2;
    public static int COPPER_CABLE_PATH_DEPTH_DP = 3;
    public static int GPON_PATH_DEPTH_OLT = 1;//11
    public static int GPON_PATH_DEPTH_SHELF = 2;  //16
    public static int GPON_PATH_DEPTH_SLOT = 3;  //16
    public static int GPON_CABLE_PATH_DEPTH_CABLE_ATC = 1;
    public static int GPON_CABLE_PATH_DEPTH_CABLE = 2;
    public static int GPON_CABLE_PATH_DEPTH_BOX = 3;
    //
    public static String PATH_DELIMETER = ";";

    public Alarm_FYROM(String objName, String objTime) {
       super(objName, objTime);
        //System.out.println("DSLMON_SKOPIA: New alarm created for " + objName + " @" + new TimeStamp1().getNowFormated());
    }

    public String prepareNCDBInfo() {
        System.out.println("getNCInfo...");
        if (this.getAlarmType().equals(TYPE_COPPER)) {
            try {
                String[] elementNameParts = this.getNetworkElementName().split(PATH_DELIMETER);
                if (this.getAlarmSubType().equals(SUBTYPE_COPPER_SERVING_AREA)) {
                    String servicing_area = elementNameParts[COPPER_PATH_DEPTH_SERVING_AREA - 1];
                    whereStr = "SERVING_AREA='" + servicing_area + "'";
                } else if (this.getAlarmSubType().equals(SUBTYPE_COPPER_ATC)) {
                    String servicing_area = elementNameParts[COPPER_PATH_DEPTH_SERVING_AREA - 1];
                    String atc = elementNameParts[COPPER_PATH_DEPTH_ATC - 1];
                    whereStr = "ATC='" + atc + "' AND SERVING_AREA='" + servicing_area + "'";
                } else if (this.getAlarmSubType().equals(SUBTYPE_COPPER_DSLAM)) {
                    String dslam = elementNameParts[COPPER_PATH_DEPTH_DSLAM - 1];
                    whereStr = "DSLAM_NAME = '" + dslam + "'";
                } else if (this.getAlarmSubType().equals(SUBTYPE_COPPER_SLOT)) {//SLOT = DSLAM+":"+reg_[7]+"-"+reg_[8]+ "-"+reg_[9];       RACK, SHELF, SLOT,         
                    String dslam = elementNameParts[COPPER_PATH_DEPTH_DSLAM - 1];
                    String slot = elementNameParts[COPPER_PATH_DEPTH_SLOT - 1];
                    slot = slot.split(":")[1];
                    String rack = slot.split("-")[0];
                    String shelf = slot.split("-")[1];
                    slot = slot.split("-")[2];
                    whereStr = "DSLAM_NAME = '" + dslam + "' and RACK = '" + rack + "' and SHELF = '" + shelf + "' and SLOT = '" + slot + "'";
                }
                this.setWhereStr(whereStr);
                //===========================    
                System.out.println("getNCInfo COPPER");
                if (whereStr != null) {
                    NCDB myNCDB = new NCDB();
                    try {
                        myNCDB.loadDBInfo(whereStr);
                        setActiveLinesAffected(myNCDB.getActiveLines_num());
                        setLinesAffected(myNCDB.getLines_num());
                        setMyServices(myNCDB.getServices());
                        setREGION(myNCDB.getSERVING_AREA());
                    } catch (Exception e) {
                        System.out.println("Alarm_FYROM:myNCDB.loadDBInfo error:" + e.toString());
                        e.printStackTrace(System.out);
                    }
                }
            } catch (Exception e) {
                System.out.println("Alarm_FYROM:prepareNCDBInfo error:" + e.toString());
                e.printStackTrace(System.out);
            }
            return whereStr;
        } else if (this.getAlarmType().equals(TYPE_COPPER_CABLE)) {
            try {
                String[] elementNameParts = this.getNetworkElementName().split(PATH_DELIMETER);
                if (this.getAlarmSubType().equals(SUBTYPE_COPPER_CABLE_ATC)) {
                    String atc = elementNameParts[COPPER_CABLE_PATH_DEPTH_ATC - 1];
                    whereStr = "ATC ='" + atc + "'";
                } else if (this.getAlarmSubType().equals(SUBTYPE_COPPER_CABLE_CABLE)) {
                    String atc = elementNameParts[COPPER_CABLE_PATH_DEPTH_ATC - 1];
                    String cable = elementNameParts[COPPER_CABLE_PATH_DEPTH_CABLE - 1].split("#")[1];
                    whereStr = "ATC ='" + atc + "' AND CABLE='" + cable + "'";
                } else if (this.getAlarmSubType().equals(SUBTYPE_COPPER_CABLE_DP)) {
                    String atc = elementNameParts[COPPER_CABLE_PATH_DEPTH_ATC - 1];
                    String cable = elementNameParts[COPPER_CABLE_PATH_DEPTH_CABLE - 1].split("#")[1];
                    String dp = elementNameParts[COPPER_CABLE_PATH_DEPTH_DP - 1].split("#")[2];
                    whereStr = "ATC ='" + atc + "' AND CABLE='" + cable + "' AND DP = '" + dp + "'";
                }
                this.setWhereStr(whereStr);
                //===========================
                System.out.println("getNCInfo COPPER_CABLE:" + whereStr);
                if (whereStr != null) {
                    NCDB myNCDB = new NCDB();
                    try {
                        myNCDB.loadDBInfo(whereStr);
                        setActiveLinesAffected(myNCDB.getActiveLines_num());
                        setLinesAffected(myNCDB.getLines_num());
                        setMyServices(myNCDB.getServices());
                        setREGION(myNCDB.getSERVING_AREA());
                    } catch (Exception e) {
                        System.out.println("Alarm_FYROM:myNCDB.loadDBInfo error:" + e.toString());
                        e.printStackTrace(System.out);
                    }
                }
            } catch (Exception e) {
                System.out.println("Alarm_FYROM:prepareNCDBInfo error:" + e.toString());
                e.printStackTrace(System.out);
            }
            return whereStr;
        } else if (this.getAlarmType().equals(TYPE_GPON)) {
            try {
                String[] elementNameParts = this.getNetworkElementName().split(PATH_DELIMETER);
                /*
                if (this.getAlarmSubType().equals(SUBTYPE_GPON_ATC))
                    {
                    String atc = elementNameParts[PATH_DEPTH_ATC - 1];
                    whereStr = "ATC = '" + atc + "'";
                    }*/
                if (this.getAlarmSubType().equals(SUBTYPE_GPON_OLT)) {
                    //String atc = elementNameParts[PATH_DEPTH_ATC - 1];    
                    String olt = elementNameParts[GPON_PATH_DEPTH_OLT - 1];
                    //whereStr = "ATC = '" + atc + "' AND DSLAM_NAME = '" + olt + "'";
                    whereStr = "DSLAM_NAME = '" + olt + "'";
                } else if (this.getAlarmSubType().equals(SUBTYPE_GPON_SHELF)) {
//                    String atc = elementNameParts[PATH_DEPTH_ATC - 1];
                    String olt = elementNameParts[GPON_PATH_DEPTH_OLT - 1];
                    String shelf = elementNameParts[GPON_PATH_DEPTH_SHELF - 1];
                    shelf = shelf.split(":")[1];
                    String rack = shelf.split("-")[0];
                    shelf = shelf.split("-")[1];
                    //whereStr = "ATC = '" + atc + "' AND DSLAM_NAME = '" + olt + "' and RACK = '" + rack + "' and SHELF = '" + shelf + "'";
                    whereStr = "DSLAM_NAME = '" + olt + "' and RACK = '" + rack + "' and SHELF = '" + shelf + "'";
                } else if (this.getAlarmSubType().equals(SUBTYPE_GPON_SLOT)) {
                    //String atc = elementNameParts[PATH_DEPTH_ATC - 1];
                    String olt = elementNameParts[GPON_PATH_DEPTH_OLT - 1];
                    String slot = elementNameParts[GPON_PATH_DEPTH_SLOT - 1];
                    slot = slot.split(":")[1];
                    String rack = slot.split("-")[0];
                    String shelf = slot.split("-")[1];
                    slot = slot.split("-")[2];
                    //whereStr = "ATC = '" + atc + "' AND DSLAM_NAME = '" + olt + "' and RACK = '" + rack + "' and SHELF = '" + shelf + "' and SLOT = '" + slot + "'";
                    whereStr = "DSLAM_NAME = '" + olt + "' and RACK = '" + rack + "' and SHELF = '" + shelf + "' and SLOT = '" + slot + "'";
                }
                this.setWhereStr(whereStr);
                //===========================
                System.out.println("getNCInfo GPON");
                if (whereStr != null) {
                    NCDB myNCDB = new NCDB();
                    try {
                        myNCDB.loadDBInfo(whereStr);
                        setActiveLinesAffected(myNCDB.getActiveLines_num());
                        setLinesAffected(myNCDB.getLines_num());
                        setMyServices(myNCDB.getServices());
                        setREGION(myNCDB.getSERVING_AREA());
                    } catch (Exception e) {
                        System.out.println("Alarm_FYROM:myNCDB.loadDBInfo error:" + e.toString());
                        e.printStackTrace(System.out);
                    }
                }
            } catch (Exception e) {
                System.out.println("Alarm_FYROM:prepareNCDBInfo error:" + e.toString());
                e.printStackTrace(System.out);
            }
            return whereStr;
        } else if (this.getAlarmType().equals(TYPE_GPON_CABLE)) {
            try {
                String[] elementNameParts = this.getNetworkElementName().split(PATH_DELIMETER);
                if (this.getAlarmSubType().equals(SUBTYPE_GPON_CABLE_ATC)) {//LLisice#ODCF-18-02-05 (CABLE-BOX)
                    String atc = elementNameParts[GPON_CABLE_PATH_DEPTH_CABLE_ATC - 1];
                    whereStr = "ATC'" + atc + "'";
                }
                if (this.getAlarmSubType().equals(SUBTYPE_GPON_CABLE)) {//LLisice#ODCF-18-02-05 (CABLE-BOX)
                    String cable = elementNameParts[GPON_CABLE_PATH_DEPTH_CABLE - 1];
                    whereStr = "CABLE = '" + cable + "'";
                }
                if (this.getAlarmSubType().equals(SUBTYPE_GPON_BOX)) {//LLisice#ODCF-18-02-05 (CABLE-BOX)
                    String box = elementNameParts[GPON_CABLE_PATH_DEPTH_BOX - 1];
                    whereStr = "DP ='" + box + "'";
                }
                this.setWhereStr(whereStr);
                //===========================
                System.out.println("getNCInfo GPON_CABLE");
                if (whereStr != null) {
                    NCDB myNCDB = new NCDB();
                    try {
                        myNCDB.loadDBInfo(whereStr);
                        setActiveLinesAffected(myNCDB.getActiveLines_num());
                        setLinesAffected(myNCDB.getLines_num());
                        setMyServices(myNCDB.getServices());
                        setREGION(myNCDB.getSERVING_AREA());
                    } catch (Exception e) {
                        System.out.println("Alarm_FYROM:myNCDB.loadDBInfo error:" + e.toString());
                        e.printStackTrace(System.out);
                    }
                }
            } catch (Exception e) {
                System.out.println("Alarm_FYROM:prepareNCDBInfo error:" + e.toString());
                e.printStackTrace(System.out);
            }
            return whereStr;
        }
        return null;
    }

    public ArrayList getCustomersCurrentStatus() {
        PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(this.getAlarmType());
        if (myPatrhsRetriever != null) {
            return myPatrhsRetriever.retrieveLines(this.getObjName());
        }
        return null;
    }

    public boolean checkDying_gasp_state() {
        try {
            if (this.getAlarmType().equals(TYPE_COPPER) && this.getDSLAM() != null) {
                List myLineIDs = this.findLineIDsRegistered();
                int count = Alarm_umbrella.isDying_gasp(myLineIDs);
                double perc = 1.0 * count / myLineIDs.size();
                System.out.println("checkDying_gasp_state:" + TYPE_GPON + ":" + this.getAlertOrigin() + " count:" + count + " myLineIDs.size():" + myLineIDs.size() + " perc=" + perc);
                if (perc >= 0.2) {
                    this.setDyingGasp(true);
                    return true;
                }
            } else if (this.getAlarmType().equals(TYPE_COPPER_CABLE)) {
                List myLineIDs = this.findLineIDsRegistered();
                int count = Alarm_umbrella.isDying_gasp(myLineIDs);
                if (count >= 2) {
                    this.setDyingGasp(true);
                    return true;
                }
            } else if (this.getAlarmType().equals(TYPE_GPON) && this.getOLT() != null) {
                List myLineIDs = this.findLineIDsRegistered();
                int count = Alarm_umbrella.isDying_gasp(myLineIDs);
                double perc = 1.0 * count / myLineIDs.size();
                System.out.println("checkDying_gasp_state:" + TYPE_GPON + ":" + this.getAlertOrigin() + " count:" + count + " myLineIDs.size():" + myLineIDs.size() + " perc=" + perc);
                if (perc > 0.2) {
                    this.setDyingGasp(true);
                    return true;
                }
            } else if (this.getAlarmType().equals(TYPE_GPON_CABLE)) {
                List myLineIDs = this.findLineIDsRegistered();
                int count = Alarm_umbrella.isDying_gasp(myLineIDs);
                if (count >= 2) {
                    this.setDyingGasp(true);
                    return true;
                }
            } else {
                this.setDyingGasp(false);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("isInDying_gasp_state error:" + e.toString());
        }
        this.setDyingGasp(false);
        return false;
    }

    public boolean existsAlarmInNMS() {
        boolean res;
        try {
            if (this.getAlarmType().equals(TYPE_COPPER) && this.getAlarmSubType().equals(SUBTYPE_COPPER_DSLAM)) {
                res = Alarm_umbrella.existsAlarmInNMS(Alarm_umbrella.EQTYPE_DSLAM, this.getDSLAM(), null);
            } else if (this.getAlarmType().equals(TYPE_COPPER) && this.getAlarmSubType().equals(SUBTYPE_COPPER_SLOT)) {
                res = Alarm_umbrella.existsAlarmInNMS(Alarm_umbrella.EQTYPE_DSLAM, this.getDSLAM(), this.getSLOT().split(":")[1]);
            } //
            else if (this.getAlarmType().equals(TYPE_GPON) && this.getAlarmSubType().equals(SUBTYPE_GPON_OLT)) {
                res = Alarm_umbrella.existsAlarmInNMS(Alarm_umbrella.EQTYPE_OLT, this.getOLT(), null);
            } else if (this.getAlarmType().equals(TYPE_GPON) && this.getAlarmSubType().equals(SUBTYPE_GPON_SHELF)) {
                res = Alarm_umbrella.existsAlarmInNMS(Alarm_umbrella.EQTYPE_OLT, this.getOLT(), this.getSHELF());
            } else if (this.getAlarmType().equals(TYPE_GPON) && this.getAlarmSubType().equals(SUBTYPE_GPON_SLOT)) {
                res = Alarm_umbrella.existsAlarmInNMS(Alarm_umbrella.EQTYPE_OLT, this.getOLT(), this.getSLOT().split(":")[1]);
            } else {
                res = false;
            }
            return res;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("existsAlarmInNMS error:" + e.toString());
            return false;
        }
    }

    public int findLinesRegistered() {
        PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(this.getAlarmType());
        if (myPatrhsRetriever != null) {
            return myPatrhsRetriever.retrieveLines(this.getObjName()).size();
        }
        return -1;
    }

    public ArrayList findLineIDsRegistered() {
        PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(this.getAlarmType());
        if (myPatrhsRetriever != null) {
            return myPatrhsRetriever.retrieveLineIDs(this.getObjName());
        }
        return new ArrayList();
    }

    public String toMAILString(MailSender_new myMailSender) {
        String myHtmlTotal = "";
        try {
            String alertOrigin = this.getAlertOrigin();
            myHtmlTotal += "<p>Synopsis:" + this.getDesc() + " AT " + new TimeStamp1(this.getAlertStart()).getNowFormated();
            String myUrl = "http://172.16.167.7:8080/DSLMON_SKOPIA/HistoryServlet?type=" + this.getAlarmType() + "&resource=" + URLEncoder.encode(this.getAlertOrigin(), "UTF-8");
            String aaa = myMailSender.embed(new URL(myUrl), alertOrigin);
            myHtmlTotal += "<p>&nbsp;</p><p>&nbsp;</p><table>";
            myHtmlTotal += "<tr><td><img src=\"cid:" + aaa + "\"></td></tr>";
            myHtmlTotal += "</TABLE>";
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return myHtmlTotal;
    }

    @Override
    public void saveToDatabase(DatabaseLogger myDatabaseLogger) throws Exception {
        String sql = "INSERT INTO `dslmon_skopia`.`alarms`(`objName`,`objTime`,`alertStop`,`alertOrigin`,`alertDesc`,`disConnections`,`SERVING_AREA`,`ATC`,"
                + "`DSLAM`,`SLOT`,`CABLE`,`DP`,`OLT`,`BOX`,`DESCRIPTION`,`REGION`,`corrStr`,`linesDisconnected`,`linesRegistered`,`linesAffected`,`activeLinesAffected`,"
                + "`affServiceID`,`markCustomersStatus`,`releaseCustomersStatus`,`ticketId`,`alarmType`) "
                + "VALUES ("
                + "'" + this.getObjName() + "' , '" + this.getAlarmStart() + "' , '" + this.getAlarmStop() + "' , '" + this.getAlertOrigin() + "' , '" + this.getDESCRIPTION() + "' , '" + this.getLinesDisconnected() + "' , '" + SERVING_AREA + "' , '" + ATC + "' , '" + DSLAM + "' , '" + SLOT + "',"
                + "'" + CABLE + "' , '" + DP + "' , '" + OLT + "' , '" + BOX + "' , '" + DESCRIPTION + "' , '" + REGION + "' , '" + corrStr + "' , " + linesDisconnected + " , " + linesRegistered + " , " + linesAffected + " , " + activeLinesAffected + ","
                + "'" + affServiceID + "' , '" + markCustomersStatus + "' , '" + releaseCustomersStatus + "' , '" + this.getTicketId() + "' , '" + this.getAlarmType() + "');";
        System.out.println("DiligentMKT:save alarm: " + sql);
        myDatabaseLogger.writeln(sql);
    }

    /**
     * @return the alertOrigin
     */
    public String getAlertOrigin() {
        return this.getAlarmObject();
    }

    /**
     * @return the objName
     */
    public String getObjName() {
        return this.getAlarmObject();
    }

    public String getNetworkElementName() {
        return this.getAlarmObject();
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return the ERT
     */
    public String getERT() {
        return ERT;
    }

    /**
     * @param ERT the ERT to set
     */
    public void setERT(String ERT) {
        this.ERT = ERT;
    }

    /**
     * @return the corrStr
     */
    public String getCorrStr() {
        return corrStr;
    }

    /**
     * @param corrStr the corrStr to set
     */
    public void setCorrStr(String corrStr) {
        this.corrStr = corrStr;
    }

    /**
     * @return the sessionsStuck
     */
    public double geValueStuck() {
        return valueStuck;
    }

    /**
     * @param sessionsStuck the sessionsStuck to set
     */
    public void setValueStuck(double sessionsStuck) {
        this.valueStuck = sessionsStuck;
    }

    /**
     * @return the usersDisconnected
     */
    public long getLinesDisconnected() {
        return linesDisconnected;
    }

    /**
     * @param usersDisconnected the usersDisconnected to set
     */
    public void setLinesDisconnected(long usersDisconnected) {
        this.linesDisconnected = usersDisconnected;
    }

    /**
     * @return the linesAffected
     */
    public long getLinesAffected() {
        return linesAffected;
    }

    /**
     * @param linesAffected the linesAffected to set
     */
    public void setLinesAffected(long linesAffected) {
        this.linesAffected = linesAffected;
    }

    /**
     * @return the activeLinesAffected
     */
    public long getActiveLinesAffected() {
        return activeLinesAffected;
    }

    /**
     * @param activeLinesAffected the activeLinesAffected to set
     */
    public void setActiveLinesAffected(long activeLinesAffected) {
        this.activeLinesAffected = activeLinesAffected;
    }

    /**
     * @return the affectedServicesAsString
     */
    public String getAffectedServicesAsString() {
        return affectedServicesAsString;
    }

    /**
     * @param affectedServicesAsString the affectedServicesAsString to set
     */
    public void setAffectedServicesAsString(String affectedServicesAsString) {
        this.affectedServicesAsString = affectedServicesAsString;
    }

    //=================================================================================
    /**
     * @return the whereStr
     */
    public String getWhereStr() {
        return whereStr;
    }

    /**
     * @param whereStr the whereStr to set
     */
    public void setWhereStr(String whereStr) {
        this.whereStr = whereStr;
    }

    /**
     * @return the myServices
     */
    public Counters getMyServices() {
        if (myServices != null) {
            return myServices;
        } else {
            return new Counters();
        }
    }

    /**
     * @param myServices the myServices to set
     */
    public void setMyServices(Counters myServices) {
        this.myServices = myServices;
    }

    /**
     * @return the affServiceID
     */
    public String getAffServiceID() {
        return affServiceID;
    }

    /**
     * @param affServiceID the affServiceID to set
     */
    public void setAffServiceID(String affServiceID) {
        this.affServiceID = affServiceID;
    }

    /**
     * @return the linesRegistered
     */
    public long getLinesRegistered() {
        return linesRegistered;
    }

    /**
     * @param linesRegistered the linesRegistered to set
     */
    public void setLinesRegistered(long linesRegistered) {
        this.linesRegistered = linesRegistered;
    }

    /**
     * @return the DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * @param DESCRIPTION
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     * @return the REGION
     */
    public String getREGION() {
        return REGION;
    }

    /**
     * @param REGION the REGION to set
     */
    public void setREGION(String REGION) {
        this.REGION = REGION;
    }

    /**
     * @return the SERVING_AREA
     */
    public String getSERVING_AREA() {
        return SERVING_AREA;
    }

    /**
     * @param SERVING_AREA the SERVING_AREA to set
     */
    public void setSERVING_AREA(String SERVING_AREA) {
        this.SERVING_AREA = SERVING_AREA;
    }

    /**
     * @return the ATC
     */
    public String getATC() {
        return ATC;
    }

    /**
     * @param ATC the ATC to set
     */
    public void setATC(String ATC) {
        this.ATC = ATC;
    }

    /**
     * @return the DSLAM
     */
    public String getDSLAM() {
        return DSLAM;
    }

    /**
     * @param DSLAM the DSLAM to set
     */
    public void setDSLAM(String DSLAM) {
        this.DSLAM = DSLAM;
    }

    /**
     * @return the SLOT
     */
    public String getSLOT() {
        return SLOT;
    }

    /**
     * @param SLOT the SLOT to set
     */
    public void setSLOT(String SLOT) {
        this.SLOT = SLOT;
    }

    /**
     * @return the CABLE
     */
    public String getCABLE() {
        return CABLE;
    }

    /**
     * @param CABLE the CABLE to set
     */
    public void setCABLE(String CABLE) {
        this.CABLE = CABLE;
    }

    /**
     * @return the DP
     */
    public String getDP() {
        return DP;
    }

    /**
     * @param DP the DP to set
     */
    public void setDP(String DP) {
        this.DP = DP;
    }

    /**
     * @return the OLT
     */
    public String getOLT() {
        return OLT;
    }

    /**
     * @param OLT the OLT to set
     */
    public void setOLT(String OLT) {
        this.OLT = OLT;
    }

    /**
     * @return the BOX
     */
    public String getBOX() {
        return BOX;
    }

    /**
     * @param BOX the BOX to set
     */
    public void setBOX(String BOX) {
        this.BOX = BOX;
    }

    /**
     * @return the markCustomersStatus
     */
    public String getMarkCustomersStatus() {
        return markCustomersStatus;
    }

    /**
     * @param markCustomersStatus the markCustomersStatus to set
     */
    public void setMarkCustomersStatus(String markCustomersStatus) {
        this.markCustomersStatus = markCustomersStatus;
    }

    /**
     * @return the releaseCustomersStatus
     */
    public String getReleaseCustomersStatus() {
        return releaseCustomersStatus;
    }

    /**
     * @param releaseCustomersStatus the releaseCustomersStatus to set
     */
    public void setReleaseCustomersStatus(String releaseCustomersStatus) {
        this.releaseCustomersStatus = releaseCustomersStatus;
    }

    /**
     * @return the alarmReason
     */
    public String getAlarmReason() {
        return alarmReason;
    }

    /**
     * @param alarmReason the alarmReason to set
     */
    public void setAlarmReason(String alarmReason) {
        this.alarmReason = alarmReason;
    }

    /**
     * @return the SHELF
     */
    public String getSHELF() {
        return SHELF;
    }

    /**
     * @param SHELF the SHELF to set
     */
    public void setSHELF(String SHELF) {
        this.SHELF = SHELF;
    }

    /**
     * @return the dyingGasp
     */
    public boolean isDyingGasp() {
        return dyingGasp;
    }

    /**
     * @param dyingGasp the dyingGasp to set
     */
    public void setDyingGasp(boolean dyingGasp) {
        this.dyingGasp = dyingGasp;
    }

    /**
     * @return the myBulletinid
     */
    public String getMyBulletinid() {
        return myBulletinid;
    }

    /**
     * @param myBulletinid the myBulletinid to set
     */
    public void setMyBulletinid(String myBulletinid) {
        this.myBulletinid = myBulletinid;
    }

    /**
     * @return the alarmOpenningProfile
     */
    public AlarmOpenningProfile getAlarmOpenningProfile() {
        return alarmOpenningProfile;
    }

    /**
     * @param alarmOpenningProfile the alarmOpenningProfile to set
     */
    public void setAlarmOpenningProfile(AlarmOpenningProfile alarmOpenningProfile) {
        this.alarmOpenningProfile = alarmOpenningProfile;
    }

}

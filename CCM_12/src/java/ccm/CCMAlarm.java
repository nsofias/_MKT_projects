package ccm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Modifier;
import java.util.Objects;
import nsofiasLib.databases.DatabaseLogger;
import nsofiasLib.utils.Counters1;
import nsofiasLib.utils.JsonToHtmlConverter;

public class CCMAlarm extends nsofiasLib.ote.alarms.Alarm implements Comparable {
    private String alertMostSignificantReason;
    private double totalCalls = 0;
    private transient Counters1 alarmReasons = new Counters1();
    private String weatherInfo="";
    private long affectedCustomers=0;
    //

    private String alarmParent;

    public CCMAlarm(String objName, String objTime, String alarmType) {
        super(objName, objTime, alarmType);
    }

    @Override
    public int compareTo(Object otherAlarmObject) {
        CCMAlarm otherAlarm = (CCMAlarm) otherAlarmObject;
        String myAlarmTimeStamp = this.getAlarmStop();
        String otherAlarmTimeStamp = otherAlarm.getAlarmStop();
        return otherAlarmTimeStamp.compareTo(myAlarmTimeStamp);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (otherObj.getClass().equals(CCMAlarm.class)) {
            CCMAlarm otherAlarm = (CCMAlarm) otherObj;
            return this.getAlarmId().equals(otherAlarm.getAlarmId());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.getAlarmId());
        return hash;
    }

    public String toHTML() {
                String myBodyMessage = "<style>body {\n"
                + "    margin: 20px;\n"
                + "    background-position: top;\n"
                + "    background-repeat: no-repeat;\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 12px;\n"
                + "    color: #480082;\n"
                + "}\n"
                + "\n"
                + "table {      \n"
                + "    font-size: 10px;\n"
                + "    /*background-image: url(diligent_View_front_page.jpg);*/\n"
                + "    background-color: lightgray;\n"
                + "    color: #E10075;\n"
                + "}\n"
                + "th {\n"
                + "    border: 1px solid;\n"
                + "    border-color: whitesmoke; \n"
                + "    background-color: #E10075;\n"
                + "    color: white;\n"
                + "\n"
                + "    padding: 2px;\n"
                + "}\n"
                + "\n"
                + "td {\n"
                + "    border: 1px solid;\n"
                + "    border-color: whitesmoke; \n"
                + "    padding: 2px;\n"
                + "}\n"
                + "body.achtergrond {\n"
                + "\n"
                + "}\n"
                + "\n"
                + "body.corporate {\n"
                + "\n"
                + "}\n"
                + "body.doc {\n"
                + "\n"
                + "}\n"
                + ".font,doctext,TD,P,U,LI,OL,UL,BLOCKQUOTE,U,SUB,SUP {\n"
                + "    font-family: Verdana, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: purple;;\n"
                + "}\n"
                + "\n"
                + "i {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #009900;\n"
                + "    font-style : italic;\n"
                + "}\n"
                + "\n"
                + "B,STRONG {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #E10075;\n"
                + "    font-weight : bold;	\n"
                + "}\n"
                + "\n"
                + "\n"
                + "A, A:hover, A:visited, A:active, A:link {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #009900;\n"
                + "    font-weight : bold;	\n"
                + "}\n"
                + "\n"
                + "A, A:hover  {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #000000;\n"
                + "    font-weight : bold;	\n"
                + "}\n"
                + "\n"
                + "INPUT,SELECT,TEXTAREA {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 14px;\n"
                + "    color: #E10075;\n"
                + "    padding : 1px;\n"
                + "    border-style: double;\n"
                + "    border-color: #002F00;                  \n"
                + "}\n"
                + "SMALL,small {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 10px;\n"
                + "    color: #009900;\n"
                + "}\n"
                + "\n"
                + "H1 {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 24px;\n"
                + "    color: white;\n"
                + "    font-weight : bold;\n"
                + "    background-color: #E10075;	\n"
                + "}\n"
                + "\n"
                + "H2 {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 18px;\n"
                + "    color: white;\n"
                + "    font-weight : bold;\n"
                + "    background-color: #E10075;	\n"
                + "\n"
                + "}\n"
                + "\n"
                + "H3,H4,H5,H6 {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 14px;\n"
                + "    color: #E10075;\n"
                + "    font-weight : bold;\n"
                + "    background-color: #E10075;	\n"
                + "}\n"
                + "\n"
                + ".doctextLblue {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #00b2e6;\n"
                + "}\n"
                + "\n"
                + "/* Link styles */\n"
                + "\n"
                + "\n"
                + ".heading3\n"
                + "{\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 12px;\n"
                + "    font-weight: bold;\n"
                + "    color: #ffffff;\n"
                + "    text-decoration: none;	\n"
                + "}\n"
                + "\n"
                + ".menuitem, a.menuitem {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #009900;\n"
                + "    text-decoration: none;\n"
                + "}\n"
                + "\n"
                + "/* Title headings */\n"
                + ".corporateText{\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #ffffff;\n"
                + "}\n"
                + ".pagetitle {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-weight: bold;\n"
                + "    color: #00b2e6;\n"
                + "    font-size: 14px;\n"
                + "}\n"
                + "\n"
                + ".doctitle {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-weight: bold;\n"
                + "    color: #009900;\n"
                + "    font-size: 11px;\n"
                + "    margin-bottom: 2px;\n"
                + "}\n"
                + "\n"
                + ".headingrightclmn {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-weight: bold;\n"
                + "    font-size: 12px;\n"
                + "    color: #00b2e6;\n"
                + "}\n"
                + "\n"
                + "img {\n"
                + "    /*width: 100%;*/\n"
                + "    object-fit:  contain;\n"
                + "\n"
                + "}\n"
                + "iframe {\n"
                + "    width: 100%;\n"
                + "    height: 90vh;\n"
                + "    background-color: lightgrey;	\n"
                + "}\n"
                + "\n"
                + "\n"
                + ".json_object { \n"
                + "    margin:10px; \n"
                + "    padding-left:10px; \n"
                + "    border-left:1px solid #ccc\n"
                + "}\n"
                + ".json_key { \n"
                + "    font-weight: bold; \n"
                + "}</style>";
        myBodyMessage += new JsonToHtmlConverter().getHtmlData(new Gson().toJson(this));        
        myBodyMessage += "<p><p>Diligent is following the alarm (in the backgroundand) & will open a ticket if necessary.";
        return myBodyMessage;
    }

    //----------------------------
    public String getAlarmId() {
        return this.getAlarmStart() + "@" + this.getAlarmObject();
    }

    @Override
    public String toString() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().create();
        return gson.toJson(this);
    }

    @Override
    public void saveToDatabase(DatabaseLogger myDatabaseLogger) throws Exception{        
        com.google.gson.Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
        String alarmBody = gson.toJson(this);
        String sqlStr;
        try {
            sqlStr = "INSERT INTO CCM.alarms (`alarmId`,`alarmBody`) VALUES ('" + this.getAlarmId() + "', '" + alarmBody + "')";
            //logger.info("ACTOR:" + sqlStr);
            myDatabaseLogger.writeln(sqlStr);
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException exx) {
                sqlStr = "UPDATE  CCM.alarms SET alarmBody='" + alarmBody + "' WHERE alarmId ='" + this.getAlarmId() + "'";
                myDatabaseLogger.writeln(sqlStr);
        } 
    }

    /**
     * @return the alertMostSignificantReason
     */
    public String getAlertMostSignificantReason() {
        return alertMostSignificantReason;
    }

    /**
     * @param alertMostSignificantReason the alertMostSignificantReason to set
     */
    public void setAlertMostSignificantReason(String alertMostSignificantReason) {
        this.alertMostSignificantReason = alertMostSignificantReason;
    }

    /**
     * @return the totalCalls
     */
    public double getTotalCalls() {
        return totalCalls;
    }

    /**
     * @param totalCalls the totalCalls to set
     */
    public void setTotalCalls(double totalCalls) {
        this.totalCalls = totalCalls;
    }

    /**
     * @param reason
     * @return the Calls
     */
    public double getCalls(String reason) {
        return getAlarmReasons().getValue(reason);
    }

    /**
     * @return the alarmReasons
     */
    public Counters1 getAlarmReasons() {
        return alarmReasons;
    }

    /**
     * @param alarmReasons the alarmReasons to set
     */
    public void setAlarmReasons(Counters1 alarmReasons) {
        this.alarmReasons = alarmReasons;
    }

    /**
     * @return the alarmParent
     */
    public String getAlarmParent() {
        return alarmParent;
    }

    /**
     * @param alarmParent the alarmParent to set
     */
    public void setAlarmParent(String alarmParent) {
        this.alarmParent = alarmParent;
    }

    /**
     * @return the weatherInfo
     */
    public String getWeatherInfo() {
        return weatherInfo;
    }

    /**
     * @param weatherInfo the weatherInfo to set
     */
    public void setWeatherInfo(String weatherInfo) {
        this.weatherInfo = weatherInfo;
    }

    /**
     * @return the affectedCustomers
     */
    public long getAffectedCustomers() {
        return affectedCustomers;
    }

    /**
     * @param affectedCustomers the affectedCustomers to set
     */
    public void setAffectedCustomers(long affectedCustomers) {
        this.affectedCustomers = affectedCustomers;
    }
}

package ccm.OTE;

import java.util.Objects;
import nsofiasLib.time.TimeStamp1;

public class DslmonAlarm implements Comparable
    {
    private String ticket_sr="";
    private String objName;    
    private String objTime;
    private int alertType;
    private String alertStart;
    private String alertStop;
    private String alertOrigin; 
    private boolean stilAlive = true;
    private int criticality=0;
    private String alertDesc="-";
    private long disConnections=0;
    //-------
    public static int WARNING=1;
    public static int MAJOR=2;
    public static int CRITICAL=3;
    //
    public static int brasCallsUp=1;    
    public static int dslamCallsUp=2;
    public static int cardCallsUp=3;    

    

    
    public DslmonAlarm()
        {
        }    
    
    public DslmonAlarm(String objName,String objTime)
        {
        this.objName=objName;
        this.objTime=objTime;
        }
    
    @Override
    public int compareTo(Object otherAlarmObject)
        {
        DslmonAlarm otherAlarm = (DslmonAlarm)otherAlarmObject;
        String myAlarmTimeStamp = objTime;
        String otherAlarmTimeStamp = otherAlarm.getObjTime();
        int compRes = otherAlarmTimeStamp.compareTo(myAlarmTimeStamp);
        if (compRes==0)
            {
            myAlarmTimeStamp = this.getAlertStart();
            otherAlarmTimeStamp = otherAlarm.getAlertStart(); 
            compRes = otherAlarmTimeStamp.compareTo(myAlarmTimeStamp);
            }
        return compRes;
        }    
    
    @Override
    public boolean equals(Object otherObj)
        {
        if(!otherObj.getClass().getName().equals("DSLMON.Alarm"))return false;
        DslmonAlarm otherAlarm = (DslmonAlarm)otherObj;
        return (this.objName.equals(otherAlarm.objName) && this.alertStart.equals(otherAlarm.alertStart));
        }  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.objName);
        return hash;
    }
   
    @Override
    public String toString()
        {        
        String str= objName+"\t"+objTime+"\t"+alertType+"\t"+alertStart+"\t"+alertStop+"\t"+alertOrigin+"\t"+stilAlive+"\t"+criticality+"\t"+alertDesc+"\t"+disConnections+"\t"+ticket_sr;
//      String str = "\n"+type+"\t"+objName+"\t"+new TimeStamp1(getAlertStart()).getNowFormated();\\+ "\t"+new TimeStamp1(getAlertStop()).getNowFormated()+"\t"+alertDesc;
/*        
    ticket_sr="NA";
        objName;    
        objTime;
        alertType;
        alertStart;
        alertStop;
        alertOrigin; 
        stilAlive = true;
        criticality=0;
        alertDesc="-";
        disConnections=0;
        */
//        System.out.println("str="+str);
        return str;
        }
    public int getAlertType() {
        return alertType;
    }

    /**
     * @param alertType the alertType to set
     */
    public void setAlertType(int alertType) {
        this.alertType = alertType;
    }

    /**
     * @return the alertStart
     */
    public String getAlertStart() {
        return alertStart;
    }

    /**
     * @param alertStart the alertStart to set
     */
    public void setAlertStart(String alertStart) {
        this.alertStart = alertStart;
    }

    /**
     * @return the alertStop
     */
    public String getAlertStop() {
        return alertStop;
    }

    /**
     * @param alertStop the alertStop to set
     */
    public void setAlertStop(String alertStop) {
        this.alertStop = alertStop;
    }

    /**
     * @return the alertOrigin
     */
    public String getAlertOrigin() {
        return alertOrigin;
    }

    /**
     * @param alertOrigin the alertOrigin to set
     */
    public void setAlertOrigin(String alertOrigin) {
        this.alertOrigin = alertOrigin;
    }

    /**
     * @return the objName
     */
    public String getObjName() {
        return objName;
    }

    /**
     * @param objName the objName to set
     */
    public void setObjName(String objName) {
        this.objName = objName;
    }

    /**
     * @return the objTime
     */
    public String getObjTime() {
        return objTime;
    }

    /**
     * @param objTime the objTime to set
     */
    public void setObjTime(String objTime) {
        this.objTime = objTime;
    }

    /**
     * @return the stilAlive
     */
    public boolean isStilAlive() {
        return stilAlive;
    }

    /**
     * @param stilAlive the stilAlive to set
     */
    public void setStilAlive(boolean stilAlive) {
        this.stilAlive = stilAlive;
    }

    public String getAlertDesc()
        {
        return alertDesc;
        }

    /**
     * @param alertDesc the alertDesc to set
     */
    public void setAlertDesc(String alertDesc)
        {
        this.alertDesc = alertDesc;
        }

    /**
     * @return the critical
     */
    public boolean isCritical()
        {
        return criticality==3;
        }
    /**
     * @return the criticality
     */
    public int getCriticality()
        {
        return criticality;
        }

    /**
     * @param criticality the criticality to set
     */
    public void setCriticality(int criticality)
        {
        this.criticality = criticality;
        }

    public long getDisConnections()
        {
        return disConnections;
        }

    /**
     * @param disConnections the disConnections to set
     */
    public void setDisConnections(long disConnections)
        {
        this.disConnections = disConnections;
        }

    /**
     * @return the ticket_sr
     */
    public String getTicket_sr()
        {
        return ticket_sr;
        }

    /**
     * @param ticket_sr the ticket_sr to set
     */
    public void setTicket_sr(String ticket_sr)
        {
        this.ticket_sr = ticket_sr;
        }
    }        

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius;

/**
 *
 * @author nsofias
 */
public class RadiusSessionRecord implements Comparable
    {
    private final String id;
    private final String timeStamp;
    private final String[] myValues;
    private boolean isLive;

    public RadiusSessionRecord(String id, String timeStamp, String[] myValues)
        {
        this.id = id;
        this.timeStamp = timeStamp;
        this.myValues = myValues;
        }

    @Override
    public int compareTo(Object otherObject)
        {
        RadiusSessionRecord otherRadiusLogRecord = (RadiusSessionRecord) otherObject;
        String myTimeStamp = this.getTimeStamp();
        String otherAlarmTimeStamp = otherRadiusLogRecord.getTimeStamp();
        int compRes = myTimeStamp.compareTo(otherAlarmTimeStamp);
        return compRes;
        }

    @Override
    public String toString()
        {
        String str=id+"\t"+timeStamp+"\t"+isLive+"\t";
        //
        for (String myValue : myValues)
            {
            str+=myValue+"&&";
            }
        str+= str.substring(0,str.length()-2);
        return str;   
        }
    /**
     * @return the id
     */
    public String getId()
        {
        return id;
        }

    /**
     * @return the timeStamp
     */
    public String getTimeStamp()
        {
        return timeStamp;
        }

    /**
     * @return the myValues
     */
    public String[] getMyValues()
        {
        return myValues;
        }
    

    /**
     * @return the isLive
     */
    public boolean isIsLive()
        {
        return isLive;
        }

    /**
     * @param isLive the isLive to set
     */
    public void setIsLive(boolean isLive)
        {
        this.isLive = isLive;
        }    
    }

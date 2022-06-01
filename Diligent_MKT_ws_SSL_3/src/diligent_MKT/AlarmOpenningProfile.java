/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_MKT;

/**
 *
 * @author nsofias
 */
public class AlarmOpenningProfile
    {
    private String alarmOpenningProfile;

    public AlarmOpenningProfile(String alarmOpenningProfile)//"1;Possible Power Outage;0
        {
        this.alarmOpenningProfile = alarmOpenningProfile;
        }

    @Override
    public String toString()
        {
        return alarmOpenningProfile;
        }
    
    public boolean isToOpen()
        {
        System.out.println("alarmOpenningProfile="+getAlarmOpenningProfile());
        try
            {
            if (getAlarmOpenningProfile().split(";")[0].equals("1"))
                {
                return true;
                }
            else
                {
                return false;
                }
            }
        catch (Exception e)
            {
            System.out.println("DSLMON:AlarmOpenningProfile/isToOpen error for " + getAlarmOpenningProfile() + " :" + e.toString());
            }
        return true;
        }

    public String getInfo()
        {
        try
            {
            return getAlarmOpenningProfile().split(";")[1];
            }
        catch (Exception e)
            {
            System.out.println("DSLMON:AlarmOpenningProfile/getInfo error for " + getAlarmOpenningProfile() + " :" + e.toString());
            }
        return "";
        }

    public long minutesToDelay()
        {
        try
            {
            return Long.valueOf(getAlarmOpenningProfile().split(";")[2]);
            }
        catch (Exception e)
            {
            System.out.println("DSLMON:AlarmOpenningProfile/minutesToDelay error for " + getAlarmOpenningProfile() + " :" + e.toString());
            }
        return 0;
        }

    /**
     * @return the alarmOpenningProfile
     */
    public String getAlarmOpenningProfile()
        {
        return alarmOpenningProfile;
        }

    /**
     * @param alarmOpenningProfile the alarmOpenningProfile to set
     */
    public void setAlarmOpenningProfile(String alarmOpenningProfile)
        {
        this.alarmOpenningProfile = alarmOpenningProfile;
        }
    }

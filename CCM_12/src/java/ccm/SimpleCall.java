/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

/**
 *
 * @author nsofias
 */
public class SimpleCall
    {
    private String startTime;
    private String callinguser;
    private String calleduser;
    private String sip_method;
    private String terminationCode;
    private long duration;

    public SimpleCall(String startTime, String callinguser, String calleduser, long duration)
        {
        this.startTime = startTime;
        this.callinguser = callinguser;
        this.calleduser = calleduser;
        this.duration = duration;
        }

    @Override
    public String toString()
        {
        return "SimpleCall{" + "startTime=" + startTime + ", callinguser=" + callinguser + ", calleduser=" + calleduser + ", duration=" + duration + '}';
        }

    
    /**
     * @return the startTime
     */
    public String getStartTime()
        {
        return startTime;
        }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime)
        {
        this.startTime = startTime;
        }

    /**
     * @return the callinguser
     */
    public String getCallinguser()
        {
        return callinguser;
        }

    /**
     * @param callinguser the callinguser to set
     */
    public void setCallinguser(String callinguser)
        {
        this.callinguser = callinguser;
        }

    /**
     * @return the sip_method
     */
    public String getSip_method()
        {
        return sip_method;
        }

    /**
     * @param sip_method the sip_method to set
     */
    public void setSip_method(String sip_method)
        {
        this.sip_method = sip_method;
        }

    /**
     * @return the terminationCode
     */
    public String getTerminationCode()
        {
        return terminationCode;
        }

    /**
     * @param terminationCode the terminationCode to set
     */
    public void setTerminationCode(String terminationCode)
        {
        this.terminationCode = terminationCode;
        }
    /**
     * @return the calleduser
     */
    public String getCalleduser()
        {
        return calleduser;
        }

    /**
     * @param calleduser the calleduser to set
     */
    public void setCalleduser(String calleduser)
        {
        this.calleduser = calleduser;
        }

    /**
     * @return the duration
     */
    public long getDuration()
        {
        return duration;
        }

    /**
     * @param duration the duration to set
     */
    public void setDuration(long duration)
        {
        this.duration = duration;
        }
    
    }

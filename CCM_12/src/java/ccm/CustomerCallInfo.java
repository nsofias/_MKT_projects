/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.util.Objects;

/**
 *
 * @author nsofias
 */
public class CustomerCallInfo
    {
    private String a_number;
    private String[] path;
    /*
    private String brasname="";
    private String dslamcode="";
    private String dslamslot="";
    private String dslamport="";
    */
    private String reason="";
    private String startTime;   
    //
    

    public CustomerCallInfo(String a_number)
        {
        this.a_number = a_number;
        }    
    
    public CustomerCallInfo(String a_number,String reason,String startTime, String[] path)
        {
        this.a_number = a_number;
        this.path = path;
        this.startTime = startTime;
        this.reason = reason;
        }

    @Override
    public String toString()
        {
        return "RegistrationCallInfo{"+ a_number + ":" + path + ":" + reason + ":" + startTime + '}';
        }
    
    public String[] getPath()
        {
        return path ;
        }    

    @Override
    public boolean equals(Object otherObj)
        {
        if (otherObj==null || this==null) return false;
        if(!otherObj.getClass().getName().contains("CC_MONITOR.PstnNumberInfo"))return false;
        CustomerCallInfo otherPSTN = (CustomerCallInfo)otherObj;
        return this.getA_number().equals(otherPSTN.getA_number());
        }

    @Override
    public int hashCode()
        {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.a_number);
        return hash;
        }

    /**
     * @return the a_number
     */
    public String getA_number()
        {
        return a_number;
        }

    /**
     * @param a_number the a_number to set
     */
    public void setA_number(String a_number)
        {
        this.a_number = a_number;
        }
 

    /**
     * @return the terminationCode
     */
    public String getReason()
        {
        return reason;
        }

    /**
     * @param terminationCode the terminationCode to set
     */
    public void setTerminationCode(String terminationCode)
        {
        this.reason = terminationCode;
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
    
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SKOPIA;

import java.util.Objects;
import nsofiasLib.utils.mapper.MappingObj;

/**
 *
 * @author nsofias
 */
public class DslConn implements Comparable, MappingObj
    {

    public String connUser;
    public long duration = -1;
    private String connPath;


    public DslConn(String connUser, String connPath, long duration)//,String connDslam,String connCard)
        {
        this.connUser = connUser;
        this.connPath = connPath;
        this.duration = duration;
        }

    public DslConn(String conn)//,String connDslam,String connCard)
        {
        String connDetails[] = conn.split(";");
        this.connUser = connDetails[0];
        //this.connPath = connDetails[1] + ";" + connDetails[2] + ";" + connDetails[3];
        try
            {
            this.duration = Long.parseLong(connDetails[4]);
            }
        catch (Exception e)
            {
            duration = -1;
            }
        }

    //**********************************
    @Override
    public void update(String DN, MappingObj otherObj)
        {
        }

    @Override
    public Object getObjValue()
        {
        return "";
        }

    @Override
    public String toHTMLString()
        {
        return "";
        }

    @Override
    public String toXMLString()
        {
        return "";
        }

    //----------------------------------------------
    @Override
    public boolean equals(Object otherDslConn)
        {
        if(!otherDslConn.getClass().getName().equals("DSLMON.DslConn"))return false;
        return this.connUser.equals(((DslConn)otherDslConn).connUser);
        }

    @Override
    public int compareTo(Object otherDslConn)
        {        
        return this.connUser.compareTo(((DslConn)otherDslConn).connUser);
        }    
    
    @Override
    public int hashCode()
        {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.connUser);
        return hash;
        }
    /**
     * @return the connUser
     */
    public String getConnUser()
        {
        return connUser;
        }

    /**
     * @param connUser the connUser to set
     */
    public void setConnUser(String connUser)
        {
        this.connUser = connUser;
        }



    @Override
    public String toString()
        {
        return this.getConnUser() + ";" + this.getConnPath() + ";" + this.duration;
        }

    /**
     * @return the duration
     */
    public long getDuration()
        {
        return duration;
        }

    /**
     * @return the connPath
     */
    public String getConnPath()
        {
        return connPath;
        }

    /**
     * @param connPath the connPath to set
     */
    public void setConnPath(String connPath)
        {
        this.connPath = connPath;
        }
    }

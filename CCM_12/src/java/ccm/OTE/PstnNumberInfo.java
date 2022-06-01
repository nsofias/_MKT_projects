/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.OTE;

import java.util.Objects;

/**
 *
 * @author nsofias
 */
public class PstnNumberInfo
    {
    private String a_number;
    private String area="";
    private String cable="";
    private String brasname="";
    private String dslamcode="";
    private String dslamslot="";
    private String dslamport="";
    private String creation_time="";
    //
    

    public PstnNumberInfo(String a_number)
        {
        this.a_number = a_number;
        }    
    
    public PstnNumberInfo(String a_number, String area, String cable, String brasname, String dslamcode, String dslamslot, String dslamport)
        {
        this.a_number = a_number;
        this.area = area;
        this.cable = cable;
        this.brasname = brasname;
        this.dslamcode = dslamcode;
        this.dslamslot = dslamslot;
        this.dslamport = dslamport;
        }

    @Override
    public boolean equals(Object otherObj)
        {
        if (otherObj==null || this==null) return false;
        if(!otherObj.getClass().getName().contains("CC_MONITOR.PstnNumberInfo"))return false;
        PstnNumberInfo otherPSTN = (PstnNumberInfo)otherObj;
        return this.getA_number().equals(otherPSTN.getA_number());
        }

    @Override
    public int hashCode()
        {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.a_number);
        return hash;
        }


    public String getInfo() 
        {
        String res;
        if (area==null)
            return"";
        else if (cable==null)
            res = area;
        else
           res = area+":"+cable;
        return res;
        }
    public String getArea()
        {
        return area;
        }

    /**
     * @param area the area to set
     */
    public void setArea(String area)
        {
        this.area = area;
        }

    /**
     * @return the onu
     */
    public String getCable()
        {
        return cable;
        }


    public void setCable(String cable)
        {
        this.cable = cable;
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
     * @return the brasname
     */
    public String getBrasname()
        {
        return brasname;
        }

    /**
     * @param brasname the brasname to set
     */
    public void setBrasname(String brasname)
        {
        this.brasname = brasname;
        }

    /**
     * @return the dslamcode
     */
    public String getDslamcode()
        {
        return dslamcode;
        }

    /**
     * @param dslamcode the dslamcode to set
     */
    public void setDslamcode(String dslamcode)
        {
        this.dslamcode = dslamcode;
        }

    /**
     * @return the dslamslot
     */
    public String getDslamslot()
        {
        return dslamslot;
        }

    /**
     * @param dslamslot the dslamslot to set
     */
    public void setDslamslot(String dslamslot)
        {
        this.dslamslot = dslamslot;
        }

    /**
     * @return the creation_time
     */
    public String getCreation_time()
        {
        return creation_time;
        }

    /**
     * @param creation_time
     */
    public void setCreation_time(String creation_time)
        {
        this.creation_time = creation_time;
        }
    

    /**
     * @return the dslamport
     */
    public String getDslamport()
        {
        return dslamport;
        }

    /**
     * @param dslamport the dslamport to set
     */
    public void setDslamport(String dslamport)
        {
        this.dslamport = dslamport;
        }    
    }

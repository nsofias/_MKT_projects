/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_mkt_ws;

/**
 *
 * @author nsofias
 */
//[{"HOSTNAME": "CE-OLT-17", "SOURCE_FRIENDLYNAME": null, "SOURCE_OBJECT": "source=CE-OLT-17 location=", "NETIMESTAMP": "2019-12-05 13:39:00", "SEVERITY": "CRITICAL", "PROBABLECAUSE": "Communication with the device failed", "ADDITIONALTEXT": null, "CLEARED_TIME": null}]
public class NmsAlarm
    {
    private String HOSTNAME;
    private String SOURCE_FRIENDLYNAME;
    private String SOURCE_OBJECT;
    private String NETIMESTAMP;
    private String SEVERITY;
    private String PROBABLECAUSE;
    private AdditionalText ADDITIONALTEXT;
    private String CLEARED_TIME;
    
    /**
     * @return the HOSTNAME
     */
    public String getHOSTNAME()
        {
        return HOSTNAME;
        }

    /**
     * @param HOSTNAME the HOSTNAME to set
     */
    public void setHOSTNAME(String HOSTNAME)
        {
        this.HOSTNAME = HOSTNAME;
        }

    /**
     * @return the SOURCE_FRIENDLYNAME
     */
    public String getSOURCE_FRIENDLYNAME()
        {
        return SOURCE_FRIENDLYNAME;
        }

    /**
     * @param SOURCE_FRIENDLYNAME the SOURCE_FRIENDLYNAME to set
     */
    public void setSOURCE_FRIENDLYNAME(String SOURCE_FRIENDLYNAME)
        {
        this.SOURCE_FRIENDLYNAME = SOURCE_FRIENDLYNAME;
        }

    /**
     * @return the SOURCE_OBJECT
     */
    public String getSOURCE_OBJECT()
        {
        return SOURCE_OBJECT;
        }

    /**
     * @param SOURCE_OBJECT the SOURCE_OBJECT to set
     */
    public void setSOURCE_OBJECT(String SOURCE_OBJECT)
        {
        this.SOURCE_OBJECT = SOURCE_OBJECT;
        }

    /**
     * @return the NETIMESTAMP
     */
    public String getNETIMESTAMP()
        {
        return NETIMESTAMP;
        }

    /**
     * @param NETIMESTAMP the NETIMESTAMP to set
     */
    public void setNETIMESTAMP(String NETIMESTAMP)
        {
        this.NETIMESTAMP = NETIMESTAMP;
        }

    /**
     * @return the SEVERITY
     */
    public String getSEVERITY()
        {
        return SEVERITY;
        }

    /**
     * @param SEVERITY the SEVERITY to set
     */
    public void setSEVERITY(String SEVERITY)
        {
        this.SEVERITY = SEVERITY;
        }

    /**
     * @return the PROBABLECAUSE
     */
    public String getPROBABLECAUSE()
        {
        return PROBABLECAUSE;
        }

    /**
     * @param PROBABLECAUSE the PROBABLECAUSE to set
     */
    public void setPROBABLECAUSE(String PROBABLECAUSE)
        {
        this.PROBABLECAUSE = PROBABLECAUSE;
        }

    /**
     * @return the CLEARED_TIME
     */
    public String getCLEARED_TIME()
        {
        return CLEARED_TIME;
        }

    /**
     * @param CLEARED_TIME the CLEARED_TIME to set
     */
    public void setCLEARED_TIME(String CLEARED_TIME)
        {
        this.CLEARED_TIME = CLEARED_TIME;
        }
    /**
     * @return the ADDITIONALTEXT
     */
    public AdditionalText getADDITIONALTEXT()
        {
        return ADDITIONALTEXT;
        }

    /**
     * @param ADDITIONALTEXT the ADDITIONALTEXT to set
     */
    public void setADDITIONALTEXT(AdditionalText ADDITIONALTEXT)
        {
        this.ADDITIONALTEXT = ADDITIONALTEXT;
        }
    }

class AdditionalText
    {
    //{"OLTIP": "172.16.2.150", "Board Name": "H802SCUN", "Board description(only for NMS)": "H802SCUN_0_10"}, 
    String OLTIP;
    //String board_Name;
    //String boardDescription;
    
    }
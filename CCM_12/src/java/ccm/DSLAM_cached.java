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
public class DSLAM_cached {
    private String Anumber;
    private String BrasName="N/A";
    private String BrasPort="N/A";
    private String BrasSlot="N/A";
    private String DslamCode="N/A";
    private String DslamType="N/A";
    private String DslamPort="N/A";
    private String DslamSlot="N/A";        
    private String BrasSubSlot="N/A"; 
    private String ClassOfService="N/A"; 
    private String CpeInformation ="N/A";  
    private String Uid ="N/A"; 
    private String Vci ="N/A"; 
    private String Vpi ="N/A";    

    
    public DSLAM_cached(String Anumber)
        {
        this.Anumber =Anumber;
        }
    
    @Override
    public boolean equals(Object otherObj)
        {
        if (otherObj==null || this==null) return false;
        if(!otherObj.getClass().getName().equals("CC_MONITOR.DSLAM_cached"))return false;
        DSLAM_cached otherDSLAM = (DSLAM_cached)otherObj;
        return this.getAnumber().equals(otherDSLAM.getAnumber());
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.Anumber);
        return hash;
    }

    public String getInfo() 
        {
        String res = BrasName+"("+BrasSlot+"/"+BrasSubSlot+"/"+BrasPort+") Dsl_"+DslamCode+"("+DslamSlot+")";
        return res;
        }    
    
    @Override
    public String toString()
        {
        String res = Anumber+";"+BrasName+";"+BrasSlot+";"+BrasSubSlot+";"+BrasPort+";"+DslamCode+";"+DslamSlot;
        return res;
        }
    
    /**
     * @return the BrasName
     */
    public String getBrasName() {
        return BrasName;
    }

    /**
     * @param BrasName the BrasName to set
     */
    public void setBrasName(String BrasName) {
        this.BrasName = BrasName;
    }

    /**
     * @return the BrasPort
     */
    public String getBrasPort() {
        return BrasPort;
    }

    /**
     * @param BrasPort the BrasPort to set
     */
    public void setBrasPort(String BrasPort) {
        this.BrasPort = BrasPort;
    }

    /**
     * @return the BrasSlot
     */
    public String getBrasSlot() {
        return BrasSlot;
    }

    /**
     * @param BrasSlot the BrasSlot to set
     */
    public void setBrasSlot(String BrasSlot) {
        this.BrasSlot = BrasSlot;
    }

    /**
     * @return the DslamCode
     */
    public String getDslamCode() {
        return DslamCode;
    }

    /**
     * @param DslamCode the DslamCode to set
     */
    public void setDslamCode(String DslamCode) {
        this.DslamCode = DslamCode;
    }

    /**
     * @return the DslamType
     */
    public String getDslamType() {
        return DslamType;
    }

    /**
     * @param DslamType the DslamType to set
     */
    public void setDslamType(String DslamType) {
        this.DslamType = DslamType;
    }

    /**
     * @return the DslamPort
     */
    public String getDslamPort() {
        return DslamPort;
    }

    /**
     * @param DslamPort the DslamPort to set
     */
    public void setDslamPort(String DslamPort) {
        this.DslamPort = DslamPort;
    }

    /**
     * @return the DslamSlot
     */
    public String getDslamSlot() {
        return DslamSlot;
    }

    /**
     * @param DslamSlot the DslamSlot to set
     */
    public void setDslamSlot(String DslamSlot) {
        this.DslamSlot = DslamSlot;
    }

    /**
     * @return the BrasSubSlot
     */
    public String getBrasSubSlot() {
        return BrasSubSlot;
    }

    /**
     * @param BrasSubSlot the BrasSubSlot to set
     */
    public void setBrasSubSlot(String BrasSubSlot) {
        this.BrasSubSlot = BrasSubSlot;
    }

    /**
     * @return the ClassOfService
     */
    public String getClassOfService() {
        return ClassOfService;
    }

    /**
     * @param ClassOfService the ClassOfService to set
     */
    public void setClassOfService(String ClassOfService) {
        this.ClassOfService = ClassOfService;
    }

    /**
     * @return the CpeInformation
     */
    public String getCpeInformation() {
        return CpeInformation;
    }

    /**
     * @param CpeInformation the CpeInformation to set
     */
    public void setCpeInformation(String CpeInformation) {
        this.CpeInformation = CpeInformation;
    }

    /**
     * @return the Uid
     */
    public String getUid() {
        return Uid;
    }

    /**
     * @param Uid the Uid to set
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * @return the Vci
     */
    public String getVci() {
        return Vci;
    }

    /**
     * @param Vci the Vci to set
     */
    public void setVci(String Vci) {
        this.Vci = Vci;
    }

    /**
     * @return the Vpi
     */
    public String getVpi() {
        return Vpi;
    }

    /**
     * @param Vpi the Vpi to set
     */
    public void setVpi(String Vpi) {
        this.Vpi = Vpi;
    }

    /**
     * @return the Anumber
     */
    public String getAnumber() {
        return Anumber;
    }

    /**
     * @param Anumber the Anumber to set
     */
    public void setAnumber(String Anumber) {
        this.Anumber = Anumber;
    }
}

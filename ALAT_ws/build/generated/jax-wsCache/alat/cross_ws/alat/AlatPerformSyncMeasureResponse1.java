
package cross_ws.alat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlatPerformSyncMeasureResponse1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlatPerformSyncMeasureResponse1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LINE_CUSTID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AIF_ADM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AIF_OPER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AIF_LASTCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LINE_OPMODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_ESTIM_LENGTH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_MAX_RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_CRT_RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUC_MAX_RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUC_CRT_RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AM_NOISE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BAD_SPLICE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LOW_FREQ_POWER_NOISE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HIGH_FREQ_POWER_NOISE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_SERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_VERNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_VENDID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RAD_IP_LIST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRF_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRFC_MAX_RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRFC_MIN_RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRFR_MAX_RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRFR_MIN_RATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUC_LOOP_ATTN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUC_ATTN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_BITS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRFC_RATE_MODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRFR_TGT_SNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRFC_TGT_SNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_LOOP_ATTN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_ATTN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUC_BITS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUR_SNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ATUC_SNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OLT_BER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_BERPLR_END_TS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_BERPLR_START_TS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_IF_ADM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_IF_OPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_LASER_BIAS_CURRENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_LASER_TEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_LASER_VOLTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_PLR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_RX_ONU_POWER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLT_TX_POWER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_BERPLR_START_TS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_DN_BER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_DN_PLR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_IF_ADM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_IF_OPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_LASER_BIAS_CURRENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_LASER_TEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_LASER_VOLTAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_RX_POWER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_TX_POWER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_UP_BER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_UP_BIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONU_UP_PLR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OUN_BERPLR_END_TS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FO_AC_OF_USERLINE_TESTING_TR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSULATING_R_OF_USERLINE_TESTING_RG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAPACITANCE_OF_SIGNATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSULATING_R_OF_USERLINE_TESTING_TR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FO_AC_OF_USERLINE_TESTING_TG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FO_DC_OF_USERLINE_TESTING_RG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSULATING_R_OF_USERLINE_TESTING_TG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="C_OF_USERLINE_TESTING_TR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FO_AC_OF_USERLINE_TESTING_RG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FO_DC_OF_USERLINE_TESTING_TG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="C_OF_USERLINE_TESTING_RG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FO_DC_OF_USERLINE_TESTING_TR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="C_OF_USERLINE_TESTING_TG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESISTANCE_OF_RINGER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlatPerformSyncMeasureResponse1", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "linecustid",
    "aifadm",
    "aifoper",
    "aiflastch",
    "lineopmode",
    "aturestimlength",
    "aturmaxrate",
    "aturcrtrate",
    "atucmaxrate",
    "atuccrtrate",
    "amnoise",
    "badsplice",
    "lowfreqpowernoise",
    "highfreqpowernoise",
    "aturserno",
    "aturverno",
    "aturvendid",
    "radiplist",
    "prfname",
    "prfcmaxrate",
    "prfcminrate",
    "prfrmaxrate",
    "prfrminrate",
    "atucloopattn",
    "atucattn",
    "aturbits",
    "prfcratemode",
    "prfrtgtsnr",
    "prfctgtsnr",
    "aturloopattn",
    "aturattn",
    "atucbits",
    "atursnr",
    "atucsnr",
    "oltber",
    "oltberplrendts",
    "oltberplrstartts",
    "oltifadm",
    "oltifoper",
    "oltlaserbiascurrent",
    "oltlasertemp",
    "oltlaservoltage",
    "oltplr",
    "oltrxonupower",
    "olttxpower",
    "onuberplrstartts",
    "onudnber",
    "onudnplr",
    "onuifadm",
    "onuifoper",
    "onulaserbiascurrent",
    "onulasertemp",
    "onulaservoltage",
    "onurxpower",
    "onutxpower",
    "onuupber",
    "onuupbip",
    "onuupplr",
    "ounberplrendts",
    "foacofuserlinetestingtr",
    "insulatingrofuserlinetestingrg",
    "capacitanceofsignature",
    "insulatingrofuserlinetestingtr",
    "foacofuserlinetestingtg",
    "fodcofuserlinetestingrg",
    "insulatingrofuserlinetestingtg",
    "cofuserlinetestingtr",
    "foacofuserlinetestingrg",
    "fodcofuserlinetestingtg",
    "cofuserlinetestingrg",
    "fodcofuserlinetestingtr",
    "cofuserlinetestingtg",
    "resistanceofringer"
})
public class AlatPerformSyncMeasureResponse1 {

    @XmlElement(name = "LINE_CUSTID", required = true)
    protected String linecustid;
    @XmlElement(name = "AIF_ADM", required = true)
    protected String aifadm;
    @XmlElement(name = "AIF_OPER", required = true)
    protected String aifoper;
    @XmlElement(name = "AIF_LASTCH", required = true)
    protected String aiflastch;
    @XmlElement(name = "LINE_OPMODE", required = true)
    protected String lineopmode;
    @XmlElement(name = "ATUR_ESTIM_LENGTH", required = true)
    protected String aturestimlength;
    @XmlElement(name = "ATUR_MAX_RATE", required = true)
    protected String aturmaxrate;
    @XmlElement(name = "ATUR_CRT_RATE", required = true)
    protected String aturcrtrate;
    @XmlElement(name = "ATUC_MAX_RATE", required = true)
    protected String atucmaxrate;
    @XmlElement(name = "ATUC_CRT_RATE", required = true)
    protected String atuccrtrate;
    @XmlElement(name = "AM_NOISE", required = true)
    protected String amnoise;
    @XmlElement(name = "BAD_SPLICE", required = true)
    protected String badsplice;
    @XmlElement(name = "LOW_FREQ_POWER_NOISE", required = true)
    protected String lowfreqpowernoise;
    @XmlElement(name = "HIGH_FREQ_POWER_NOISE", required = true)
    protected String highfreqpowernoise;
    @XmlElement(name = "ATUR_SERNO", required = true)
    protected String aturserno;
    @XmlElement(name = "ATUR_VERNO", required = true)
    protected String aturverno;
    @XmlElement(name = "ATUR_VENDID", required = true)
    protected String aturvendid;
    @XmlElement(name = "RAD_IP_LIST", required = true)
    protected String radiplist;
    @XmlElement(name = "PRF_NAME", required = true)
    protected String prfname;
    @XmlElement(name = "PRFC_MAX_RATE", required = true)
    protected String prfcmaxrate;
    @XmlElement(name = "PRFC_MIN_RATE", required = true)
    protected String prfcminrate;
    @XmlElement(name = "PRFR_MAX_RATE", required = true)
    protected String prfrmaxrate;
    @XmlElement(name = "PRFR_MIN_RATE", required = true)
    protected String prfrminrate;
    @XmlElement(name = "ATUC_LOOP_ATTN", required = true)
    protected String atucloopattn;
    @XmlElement(name = "ATUC_ATTN", required = true)
    protected String atucattn;
    @XmlElement(name = "ATUR_BITS", required = true)
    protected String aturbits;
    @XmlElement(name = "PRFC_RATE_MODE", required = true)
    protected String prfcratemode;
    @XmlElement(name = "PRFR_TGT_SNR", required = true)
    protected String prfrtgtsnr;
    @XmlElement(name = "PRFC_TGT_SNR", required = true)
    protected String prfctgtsnr;
    @XmlElement(name = "ATUR_LOOP_ATTN", required = true)
    protected String aturloopattn;
    @XmlElement(name = "ATUR_ATTN", required = true)
    protected String aturattn;
    @XmlElement(name = "ATUC_BITS", required = true)
    protected String atucbits;
    @XmlElement(name = "ATUR_SNR", required = true)
    protected String atursnr;
    @XmlElement(name = "ATUC_SNR", required = true)
    protected String atucsnr;
    @XmlElement(name = "OLT_BER")
    protected String oltber;
    @XmlElement(name = "OLT_BERPLR_END_TS")
    protected String oltberplrendts;
    @XmlElement(name = "OLT_BERPLR_START_TS")
    protected String oltberplrstartts;
    @XmlElement(name = "OLT_IF_ADM")
    protected String oltifadm;
    @XmlElement(name = "OLT_IF_OPER")
    protected String oltifoper;
    @XmlElement(name = "OLT_LASER_BIAS_CURRENT")
    protected String oltlaserbiascurrent;
    @XmlElement(name = "OLT_LASER_TEMP")
    protected String oltlasertemp;
    @XmlElement(name = "OLT_LASER_VOLTAGE")
    protected String oltlaservoltage;
    @XmlElement(name = "OLT_PLR")
    protected String oltplr;
    @XmlElement(name = "OLT_RX_ONU_POWER")
    protected String oltrxonupower;
    @XmlElement(name = "OLT_TX_POWER")
    protected String olttxpower;
    @XmlElement(name = "ONU_BERPLR_START_TS")
    protected String onuberplrstartts;
    @XmlElement(name = "ONU_DN_BER")
    protected String onudnber;
    @XmlElement(name = "ONU_DN_PLR")
    protected String onudnplr;
    @XmlElement(name = "ONU_IF_ADM")
    protected String onuifadm;
    @XmlElement(name = "ONU_IF_OPER")
    protected String onuifoper;
    @XmlElement(name = "ONU_LASER_BIAS_CURRENT")
    protected String onulaserbiascurrent;
    @XmlElement(name = "ONU_LASER_TEMP")
    protected String onulasertemp;
    @XmlElement(name = "ONU_LASER_VOLTAGE")
    protected String onulaservoltage;
    @XmlElement(name = "ONU_RX_POWER")
    protected String onurxpower;
    @XmlElement(name = "ONU_TX_POWER")
    protected String onutxpower;
    @XmlElement(name = "ONU_UP_BER")
    protected String onuupber;
    @XmlElement(name = "ONU_UP_BIP")
    protected String onuupbip;
    @XmlElement(name = "ONU_UP_PLR")
    protected String onuupplr;
    @XmlElement(name = "OUN_BERPLR_END_TS")
    protected String ounberplrendts;
    @XmlElement(name = "FO_AC_OF_USERLINE_TESTING_TR")
    protected String foacofuserlinetestingtr;
    @XmlElement(name = "INSULATING_R_OF_USERLINE_TESTING_RG")
    protected String insulatingrofuserlinetestingrg;
    @XmlElement(name = "CAPACITANCE_OF_SIGNATURE")
    protected String capacitanceofsignature;
    @XmlElement(name = "INSULATING_R_OF_USERLINE_TESTING_TR")
    protected String insulatingrofuserlinetestingtr;
    @XmlElement(name = "FO_AC_OF_USERLINE_TESTING_TG")
    protected String foacofuserlinetestingtg;
    @XmlElement(name = "FO_DC_OF_USERLINE_TESTING_RG")
    protected String fodcofuserlinetestingrg;
    @XmlElement(name = "INSULATING_R_OF_USERLINE_TESTING_TG")
    protected String insulatingrofuserlinetestingtg;
    @XmlElement(name = "C_OF_USERLINE_TESTING_TR")
    protected String cofuserlinetestingtr;
    @XmlElement(name = "FO_AC_OF_USERLINE_TESTING_RG")
    protected String foacofuserlinetestingrg;
    @XmlElement(name = "FO_DC_OF_USERLINE_TESTING_TG")
    protected String fodcofuserlinetestingtg;
    @XmlElement(name = "C_OF_USERLINE_TESTING_RG")
    protected String cofuserlinetestingrg;
    @XmlElement(name = "FO_DC_OF_USERLINE_TESTING_TR")
    protected String fodcofuserlinetestingtr;
    @XmlElement(name = "C_OF_USERLINE_TESTING_TG")
    protected String cofuserlinetestingtg;
    @XmlElement(name = "RESISTANCE_OF_RINGER")
    protected String resistanceofringer;

    /**
     * Gets the value of the linecustid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINECUSTID() {
        return linecustid;
    }

    /**
     * Sets the value of the linecustid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINECUSTID(String value) {
        this.linecustid = value;
    }

    /**
     * Gets the value of the aifadm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIFADM() {
        return aifadm;
    }

    /**
     * Sets the value of the aifadm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIFADM(String value) {
        this.aifadm = value;
    }

    /**
     * Gets the value of the aifoper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIFOPER() {
        return aifoper;
    }

    /**
     * Sets the value of the aifoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIFOPER(String value) {
        this.aifoper = value;
    }

    /**
     * Gets the value of the aiflastch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIFLASTCH() {
        return aiflastch;
    }

    /**
     * Sets the value of the aiflastch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIFLASTCH(String value) {
        this.aiflastch = value;
    }

    /**
     * Gets the value of the lineopmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEOPMODE() {
        return lineopmode;
    }

    /**
     * Sets the value of the lineopmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEOPMODE(String value) {
        this.lineopmode = value;
    }

    /**
     * Gets the value of the aturestimlength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURESTIMLENGTH() {
        return aturestimlength;
    }

    /**
     * Sets the value of the aturestimlength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURESTIMLENGTH(String value) {
        this.aturestimlength = value;
    }

    /**
     * Gets the value of the aturmaxrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURMAXRATE() {
        return aturmaxrate;
    }

    /**
     * Sets the value of the aturmaxrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURMAXRATE(String value) {
        this.aturmaxrate = value;
    }

    /**
     * Gets the value of the aturcrtrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURCRTRATE() {
        return aturcrtrate;
    }

    /**
     * Sets the value of the aturcrtrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURCRTRATE(String value) {
        this.aturcrtrate = value;
    }

    /**
     * Gets the value of the atucmaxrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATUCMAXRATE() {
        return atucmaxrate;
    }

    /**
     * Sets the value of the atucmaxrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATUCMAXRATE(String value) {
        this.atucmaxrate = value;
    }

    /**
     * Gets the value of the atuccrtrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATUCCRTRATE() {
        return atuccrtrate;
    }

    /**
     * Sets the value of the atuccrtrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATUCCRTRATE(String value) {
        this.atuccrtrate = value;
    }

    /**
     * Gets the value of the amnoise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMNOISE() {
        return amnoise;
    }

    /**
     * Sets the value of the amnoise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMNOISE(String value) {
        this.amnoise = value;
    }

    /**
     * Gets the value of the badsplice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBADSPLICE() {
        return badsplice;
    }

    /**
     * Sets the value of the badsplice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBADSPLICE(String value) {
        this.badsplice = value;
    }

    /**
     * Gets the value of the lowfreqpowernoise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOWFREQPOWERNOISE() {
        return lowfreqpowernoise;
    }

    /**
     * Sets the value of the lowfreqpowernoise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOWFREQPOWERNOISE(String value) {
        this.lowfreqpowernoise = value;
    }

    /**
     * Gets the value of the highfreqpowernoise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIGHFREQPOWERNOISE() {
        return highfreqpowernoise;
    }

    /**
     * Sets the value of the highfreqpowernoise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIGHFREQPOWERNOISE(String value) {
        this.highfreqpowernoise = value;
    }

    /**
     * Gets the value of the aturserno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURSERNO() {
        return aturserno;
    }

    /**
     * Sets the value of the aturserno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURSERNO(String value) {
        this.aturserno = value;
    }

    /**
     * Gets the value of the aturverno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURVERNO() {
        return aturverno;
    }

    /**
     * Sets the value of the aturverno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURVERNO(String value) {
        this.aturverno = value;
    }

    /**
     * Gets the value of the aturvendid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURVENDID() {
        return aturvendid;
    }

    /**
     * Sets the value of the aturvendid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURVENDID(String value) {
        this.aturvendid = value;
    }

    /**
     * Gets the value of the radiplist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRADIPLIST() {
        return radiplist;
    }

    /**
     * Sets the value of the radiplist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRADIPLIST(String value) {
        this.radiplist = value;
    }

    /**
     * Gets the value of the prfname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRFNAME() {
        return prfname;
    }

    /**
     * Sets the value of the prfname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRFNAME(String value) {
        this.prfname = value;
    }

    /**
     * Gets the value of the prfcmaxrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRFCMAXRATE() {
        return prfcmaxrate;
    }

    /**
     * Sets the value of the prfcmaxrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRFCMAXRATE(String value) {
        this.prfcmaxrate = value;
    }

    /**
     * Gets the value of the prfcminrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRFCMINRATE() {
        return prfcminrate;
    }

    /**
     * Sets the value of the prfcminrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRFCMINRATE(String value) {
        this.prfcminrate = value;
    }

    /**
     * Gets the value of the prfrmaxrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRFRMAXRATE() {
        return prfrmaxrate;
    }

    /**
     * Sets the value of the prfrmaxrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRFRMAXRATE(String value) {
        this.prfrmaxrate = value;
    }

    /**
     * Gets the value of the prfrminrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRFRMINRATE() {
        return prfrminrate;
    }

    /**
     * Sets the value of the prfrminrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRFRMINRATE(String value) {
        this.prfrminrate = value;
    }

    /**
     * Gets the value of the atucloopattn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATUCLOOPATTN() {
        return atucloopattn;
    }

    /**
     * Sets the value of the atucloopattn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATUCLOOPATTN(String value) {
        this.atucloopattn = value;
    }

    /**
     * Gets the value of the atucattn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATUCATTN() {
        return atucattn;
    }

    /**
     * Sets the value of the atucattn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATUCATTN(String value) {
        this.atucattn = value;
    }

    /**
     * Gets the value of the aturbits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURBITS() {
        return aturbits;
    }

    /**
     * Sets the value of the aturbits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURBITS(String value) {
        this.aturbits = value;
    }

    /**
     * Gets the value of the prfcratemode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRFCRATEMODE() {
        return prfcratemode;
    }

    /**
     * Sets the value of the prfcratemode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRFCRATEMODE(String value) {
        this.prfcratemode = value;
    }

    /**
     * Gets the value of the prfrtgtsnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRFRTGTSNR() {
        return prfrtgtsnr;
    }

    /**
     * Sets the value of the prfrtgtsnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRFRTGTSNR(String value) {
        this.prfrtgtsnr = value;
    }

    /**
     * Gets the value of the prfctgtsnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRFCTGTSNR() {
        return prfctgtsnr;
    }

    /**
     * Sets the value of the prfctgtsnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRFCTGTSNR(String value) {
        this.prfctgtsnr = value;
    }

    /**
     * Gets the value of the aturloopattn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURLOOPATTN() {
        return aturloopattn;
    }

    /**
     * Sets the value of the aturloopattn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURLOOPATTN(String value) {
        this.aturloopattn = value;
    }

    /**
     * Gets the value of the aturattn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURATTN() {
        return aturattn;
    }

    /**
     * Sets the value of the aturattn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURATTN(String value) {
        this.aturattn = value;
    }

    /**
     * Gets the value of the atucbits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATUCBITS() {
        return atucbits;
    }

    /**
     * Sets the value of the atucbits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATUCBITS(String value) {
        this.atucbits = value;
    }

    /**
     * Gets the value of the atursnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATURSNR() {
        return atursnr;
    }

    /**
     * Sets the value of the atursnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATURSNR(String value) {
        this.atursnr = value;
    }

    /**
     * Gets the value of the atucsnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATUCSNR() {
        return atucsnr;
    }

    /**
     * Sets the value of the atucsnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATUCSNR(String value) {
        this.atucsnr = value;
    }

    /**
     * Gets the value of the oltber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTBER() {
        return oltber;
    }

    /**
     * Sets the value of the oltber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTBER(String value) {
        this.oltber = value;
    }

    /**
     * Gets the value of the oltberplrendts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTBERPLRENDTS() {
        return oltberplrendts;
    }

    /**
     * Sets the value of the oltberplrendts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTBERPLRENDTS(String value) {
        this.oltberplrendts = value;
    }

    /**
     * Gets the value of the oltberplrstartts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTBERPLRSTARTTS() {
        return oltberplrstartts;
    }

    /**
     * Sets the value of the oltberplrstartts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTBERPLRSTARTTS(String value) {
        this.oltberplrstartts = value;
    }

    /**
     * Gets the value of the oltifadm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTIFADM() {
        return oltifadm;
    }

    /**
     * Sets the value of the oltifadm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTIFADM(String value) {
        this.oltifadm = value;
    }

    /**
     * Gets the value of the oltifoper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTIFOPER() {
        return oltifoper;
    }

    /**
     * Sets the value of the oltifoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTIFOPER(String value) {
        this.oltifoper = value;
    }

    /**
     * Gets the value of the oltlaserbiascurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTLASERBIASCURRENT() {
        return oltlaserbiascurrent;
    }

    /**
     * Sets the value of the oltlaserbiascurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTLASERBIASCURRENT(String value) {
        this.oltlaserbiascurrent = value;
    }

    /**
     * Gets the value of the oltlasertemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTLASERTEMP() {
        return oltlasertemp;
    }

    /**
     * Sets the value of the oltlasertemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTLASERTEMP(String value) {
        this.oltlasertemp = value;
    }

    /**
     * Gets the value of the oltlaservoltage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTLASERVOLTAGE() {
        return oltlaservoltage;
    }

    /**
     * Sets the value of the oltlaservoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTLASERVOLTAGE(String value) {
        this.oltlaservoltage = value;
    }

    /**
     * Gets the value of the oltplr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTPLR() {
        return oltplr;
    }

    /**
     * Sets the value of the oltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTPLR(String value) {
        this.oltplr = value;
    }

    /**
     * Gets the value of the oltrxonupower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTRXONUPOWER() {
        return oltrxonupower;
    }

    /**
     * Sets the value of the oltrxonupower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTRXONUPOWER(String value) {
        this.oltrxonupower = value;
    }

    /**
     * Gets the value of the olttxpower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLTTXPOWER() {
        return olttxpower;
    }

    /**
     * Sets the value of the olttxpower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLTTXPOWER(String value) {
        this.olttxpower = value;
    }

    /**
     * Gets the value of the onuberplrstartts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUBERPLRSTARTTS() {
        return onuberplrstartts;
    }

    /**
     * Sets the value of the onuberplrstartts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUBERPLRSTARTTS(String value) {
        this.onuberplrstartts = value;
    }

    /**
     * Gets the value of the onudnber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUDNBER() {
        return onudnber;
    }

    /**
     * Sets the value of the onudnber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUDNBER(String value) {
        this.onudnber = value;
    }

    /**
     * Gets the value of the onudnplr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUDNPLR() {
        return onudnplr;
    }

    /**
     * Sets the value of the onudnplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUDNPLR(String value) {
        this.onudnplr = value;
    }

    /**
     * Gets the value of the onuifadm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUIFADM() {
        return onuifadm;
    }

    /**
     * Sets the value of the onuifadm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUIFADM(String value) {
        this.onuifadm = value;
    }

    /**
     * Gets the value of the onuifoper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUIFOPER() {
        return onuifoper;
    }

    /**
     * Sets the value of the onuifoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUIFOPER(String value) {
        this.onuifoper = value;
    }

    /**
     * Gets the value of the onulaserbiascurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONULASERBIASCURRENT() {
        return onulaserbiascurrent;
    }

    /**
     * Sets the value of the onulaserbiascurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONULASERBIASCURRENT(String value) {
        this.onulaserbiascurrent = value;
    }

    /**
     * Gets the value of the onulasertemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONULASERTEMP() {
        return onulasertemp;
    }

    /**
     * Sets the value of the onulasertemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONULASERTEMP(String value) {
        this.onulasertemp = value;
    }

    /**
     * Gets the value of the onulaservoltage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONULASERVOLTAGE() {
        return onulaservoltage;
    }

    /**
     * Sets the value of the onulaservoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONULASERVOLTAGE(String value) {
        this.onulaservoltage = value;
    }

    /**
     * Gets the value of the onurxpower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONURXPOWER() {
        return onurxpower;
    }

    /**
     * Sets the value of the onurxpower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONURXPOWER(String value) {
        this.onurxpower = value;
    }

    /**
     * Gets the value of the onutxpower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUTXPOWER() {
        return onutxpower;
    }

    /**
     * Sets the value of the onutxpower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUTXPOWER(String value) {
        this.onutxpower = value;
    }

    /**
     * Gets the value of the onuupber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUUPBER() {
        return onuupber;
    }

    /**
     * Sets the value of the onuupber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUUPBER(String value) {
        this.onuupber = value;
    }

    /**
     * Gets the value of the onuupbip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUUPBIP() {
        return onuupbip;
    }

    /**
     * Sets the value of the onuupbip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUUPBIP(String value) {
        this.onuupbip = value;
    }

    /**
     * Gets the value of the onuupplr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONUUPPLR() {
        return onuupplr;
    }

    /**
     * Sets the value of the onuupplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONUUPPLR(String value) {
        this.onuupplr = value;
    }

    /**
     * Gets the value of the ounberplrendts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUNBERPLRENDTS() {
        return ounberplrendts;
    }

    /**
     * Sets the value of the ounberplrendts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUNBERPLRENDTS(String value) {
        this.ounberplrendts = value;
    }

    /**
     * Gets the value of the foacofuserlinetestingtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOACOFUSERLINETESTINGTR() {
        return foacofuserlinetestingtr;
    }

    /**
     * Sets the value of the foacofuserlinetestingtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOACOFUSERLINETESTINGTR(String value) {
        this.foacofuserlinetestingtr = value;
    }

    /**
     * Gets the value of the insulatingrofuserlinetestingrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSULATINGROFUSERLINETESTINGRG() {
        return insulatingrofuserlinetestingrg;
    }

    /**
     * Sets the value of the insulatingrofuserlinetestingrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSULATINGROFUSERLINETESTINGRG(String value) {
        this.insulatingrofuserlinetestingrg = value;
    }

    /**
     * Gets the value of the capacitanceofsignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACITANCEOFSIGNATURE() {
        return capacitanceofsignature;
    }

    /**
     * Sets the value of the capacitanceofsignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACITANCEOFSIGNATURE(String value) {
        this.capacitanceofsignature = value;
    }

    /**
     * Gets the value of the insulatingrofuserlinetestingtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSULATINGROFUSERLINETESTINGTR() {
        return insulatingrofuserlinetestingtr;
    }

    /**
     * Sets the value of the insulatingrofuserlinetestingtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSULATINGROFUSERLINETESTINGTR(String value) {
        this.insulatingrofuserlinetestingtr = value;
    }

    /**
     * Gets the value of the foacofuserlinetestingtg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOACOFUSERLINETESTINGTG() {
        return foacofuserlinetestingtg;
    }

    /**
     * Sets the value of the foacofuserlinetestingtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOACOFUSERLINETESTINGTG(String value) {
        this.foacofuserlinetestingtg = value;
    }

    /**
     * Gets the value of the fodcofuserlinetestingrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFODCOFUSERLINETESTINGRG() {
        return fodcofuserlinetestingrg;
    }

    /**
     * Sets the value of the fodcofuserlinetestingrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFODCOFUSERLINETESTINGRG(String value) {
        this.fodcofuserlinetestingrg = value;
    }

    /**
     * Gets the value of the insulatingrofuserlinetestingtg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSULATINGROFUSERLINETESTINGTG() {
        return insulatingrofuserlinetestingtg;
    }

    /**
     * Sets the value of the insulatingrofuserlinetestingtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSULATINGROFUSERLINETESTINGTG(String value) {
        this.insulatingrofuserlinetestingtg = value;
    }

    /**
     * Gets the value of the cofuserlinetestingtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOFUSERLINETESTINGTR() {
        return cofuserlinetestingtr;
    }

    /**
     * Sets the value of the cofuserlinetestingtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOFUSERLINETESTINGTR(String value) {
        this.cofuserlinetestingtr = value;
    }

    /**
     * Gets the value of the foacofuserlinetestingrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOACOFUSERLINETESTINGRG() {
        return foacofuserlinetestingrg;
    }

    /**
     * Sets the value of the foacofuserlinetestingrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOACOFUSERLINETESTINGRG(String value) {
        this.foacofuserlinetestingrg = value;
    }

    /**
     * Gets the value of the fodcofuserlinetestingtg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFODCOFUSERLINETESTINGTG() {
        return fodcofuserlinetestingtg;
    }

    /**
     * Sets the value of the fodcofuserlinetestingtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFODCOFUSERLINETESTINGTG(String value) {
        this.fodcofuserlinetestingtg = value;
    }

    /**
     * Gets the value of the cofuserlinetestingrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOFUSERLINETESTINGRG() {
        return cofuserlinetestingrg;
    }

    /**
     * Sets the value of the cofuserlinetestingrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOFUSERLINETESTINGRG(String value) {
        this.cofuserlinetestingrg = value;
    }

    /**
     * Gets the value of the fodcofuserlinetestingtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFODCOFUSERLINETESTINGTR() {
        return fodcofuserlinetestingtr;
    }

    /**
     * Sets the value of the fodcofuserlinetestingtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFODCOFUSERLINETESTINGTR(String value) {
        this.fodcofuserlinetestingtr = value;
    }

    /**
     * Gets the value of the cofuserlinetestingtg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOFUSERLINETESTINGTG() {
        return cofuserlinetestingtg;
    }

    /**
     * Sets the value of the cofuserlinetestingtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOFUSERLINETESTINGTG(String value) {
        this.cofuserlinetestingtg = value;
    }

    /**
     * Gets the value of the resistanceofringer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESISTANCEOFRINGER() {
        return resistanceofringer;
    }

    /**
     * Sets the value of the resistanceofringer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESISTANCEOFRINGER(String value) {
        this.resistanceofringer = value;
    }

}

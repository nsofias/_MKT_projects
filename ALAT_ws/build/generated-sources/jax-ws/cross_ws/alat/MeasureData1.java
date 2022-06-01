
package cross_ws.alat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MeasureData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureData1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LINE_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DATE_MEASURE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="UPLOAD_SPEED" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DOWNLOAD_SPEED" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ESTIMATE_LENGTH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureData1", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "lineid",
    "datemeasure",
    "uploadspeed",
    "downloadspeed",
    "estimatelength"
})
public class MeasureData1 {

    @XmlElement(name = "LINE_ID", required = true)
    protected String lineid;
    @XmlElement(name = "DATE_MEASURE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datemeasure;
    @XmlElement(name = "UPLOAD_SPEED", required = true)
    protected String uploadspeed;
    @XmlElement(name = "DOWNLOAD_SPEED", required = true)
    protected String downloadspeed;
    @XmlElement(name = "ESTIMATE_LENGTH", required = true)
    protected String estimatelength;

    /**
     * Gets the value of the lineid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINEID() {
        return lineid;
    }

    /**
     * Sets the value of the lineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINEID(String value) {
        this.lineid = value;
    }

    /**
     * Gets the value of the datemeasure property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEMEASURE() {
        return datemeasure;
    }

    /**
     * Sets the value of the datemeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEMEASURE(XMLGregorianCalendar value) {
        this.datemeasure = value;
    }

    /**
     * Gets the value of the uploadspeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPLOADSPEED() {
        return uploadspeed;
    }

    /**
     * Sets the value of the uploadspeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPLOADSPEED(String value) {
        this.uploadspeed = value;
    }

    /**
     * Gets the value of the downloadspeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOWNLOADSPEED() {
        return downloadspeed;
    }

    /**
     * Sets the value of the downloadspeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOWNLOADSPEED(String value) {
        this.downloadspeed = value;
    }

    /**
     * Gets the value of the estimatelength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTIMATELENGTH() {
        return estimatelength;
    }

    /**
     * Sets the value of the estimatelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTIMATELENGTH(String value) {
        this.estimatelength = value;
    }

}


package cross_ws.alat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlatPerformSeltMeasureResponse1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlatPerformSeltMeasureResponse1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NOISE_UP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NOISE_DN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MRATE_UP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LINE_LENGTH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SATTN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MRATE_DN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlatPerformSeltMeasureResponse1", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "noiseup",
    "noisedn",
    "mrateup",
    "linelength",
    "sattn",
    "mratedn"
})
public class AlatPerformSeltMeasureResponse1 {

    @XmlElement(name = "NOISE_UP", required = true)
    protected String noiseup;
    @XmlElement(name = "NOISE_DN", required = true)
    protected String noisedn;
    @XmlElement(name = "MRATE_UP", required = true)
    protected String mrateup;
    @XmlElement(name = "LINE_LENGTH", required = true)
    protected String linelength;
    @XmlElement(name = "SATTN", required = true)
    protected String sattn;
    @XmlElement(name = "MRATE_DN", required = true)
    protected String mratedn;

    /**
     * Gets the value of the noiseup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOISEUP() {
        return noiseup;
    }

    /**
     * Sets the value of the noiseup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOISEUP(String value) {
        this.noiseup = value;
    }

    /**
     * Gets the value of the noisedn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOISEDN() {
        return noisedn;
    }

    /**
     * Sets the value of the noisedn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOISEDN(String value) {
        this.noisedn = value;
    }

    /**
     * Gets the value of the mrateup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRATEUP() {
        return mrateup;
    }

    /**
     * Sets the value of the mrateup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRATEUP(String value) {
        this.mrateup = value;
    }

    /**
     * Gets the value of the linelength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINELENGTH() {
        return linelength;
    }

    /**
     * Sets the value of the linelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINELENGTH(String value) {
        this.linelength = value;
    }

    /**
     * Gets the value of the sattn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATTN() {
        return sattn;
    }

    /**
     * Sets the value of the sattn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATTN(String value) {
        this.sattn = value;
    }

    /**
     * Gets the value of the mratedn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRATEDN() {
        return mratedn;
    }

    /**
     * Sets the value of the mratedn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRATEDN(String value) {
        this.mratedn = value;
    }

}

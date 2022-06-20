
package diligent_mkt_ws;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AFFECTEDSERVICE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFFECTEDSERVICE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AFFECTEDSERVICEID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CINUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STARTDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ENDDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EQUIPMENTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUMADSL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NUMINTERNET" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NUMIPTV" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NUMOFIMPACTEDCUST" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NUMVOIP" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NUMWLR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="REGION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICEINFAULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SYSSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFFECTEDSERVICE", propOrder = {
    "affectedserviceid",
    "cinum",
    "startdate",
    "enddate",
    "description",
    "equipmenttype",
    "location",
    "numadsl",
    "numinternet",
    "numiptv",
    "numofimpactedcust",
    "numvoip",
    "numwlr",
    "region",
    "serviceinfault",
    "sysstatus"
})
public class AFFECTEDSERVICE {

    @XmlElementRef(name = "AFFECTEDSERVICEID", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> affectedserviceid;
    @XmlElementRef(name = "CINUM", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cinum;
    @XmlElementRef(name = "STARTDATE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startdate;
    @XmlElementRef(name = "ENDDATE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> enddate;
    @XmlElementRef(name = "DESCRIPTION", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EQUIPMENTTYPE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equipmenttype;
    @XmlElementRef(name = "LOCATION", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "NUMADSL", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> numadsl;
    @XmlElementRef(name = "NUMINTERNET", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> numinternet;
    @XmlElementRef(name = "NUMIPTV", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> numiptv;
    @XmlElementRef(name = "NUMOFIMPACTEDCUST", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> numofimpactedcust;
    @XmlElementRef(name = "NUMVOIP", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> numvoip;
    @XmlElementRef(name = "NUMWLR", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> numwlr;
    @XmlElementRef(name = "REGION", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> region;
    @XmlElementRef(name = "SERVICEINFAULT", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceinfault;
    @XmlElementRef(name = "SYSSTATUS", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sysstatus;

    /**
     * Gets the value of the affectedserviceid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getAFFECTEDSERVICEID() {
        return affectedserviceid;
    }

    /**
     * Sets the value of the affectedserviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setAFFECTEDSERVICEID(JAXBElement<BigInteger> value) {
        this.affectedserviceid = value;
    }

    /**
     * Gets the value of the cinum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCINUM() {
        return cinum;
    }

    /**
     * Sets the value of the cinum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCINUM(JAXBElement<String> value) {
        this.cinum = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSTARTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setENDDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIPTION(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the equipmenttype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEQUIPMENTTYPE() {
        return equipmenttype;
    }

    /**
     * Sets the value of the equipmenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEQUIPMENTTYPE(JAXBElement<String> value) {
        this.equipmenttype = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLOCATION(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the numadsl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNUMADSL() {
        return numadsl;
    }

    /**
     * Sets the value of the numadsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNUMADSL(JAXBElement<BigInteger> value) {
        this.numadsl = value;
    }

    /**
     * Gets the value of the numinternet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNUMINTERNET() {
        return numinternet;
    }

    /**
     * Sets the value of the numinternet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNUMINTERNET(JAXBElement<BigInteger> value) {
        this.numinternet = value;
    }

    /**
     * Gets the value of the numiptv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNUMIPTV() {
        return numiptv;
    }

    /**
     * Sets the value of the numiptv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNUMIPTV(JAXBElement<BigInteger> value) {
        this.numiptv = value;
    }

    /**
     * Gets the value of the numofimpactedcust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNUMOFIMPACTEDCUST() {
        return numofimpactedcust;
    }

    /**
     * Sets the value of the numofimpactedcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNUMOFIMPACTEDCUST(JAXBElement<BigInteger> value) {
        this.numofimpactedcust = value;
    }

    /**
     * Gets the value of the numvoip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNUMVOIP() {
        return numvoip;
    }

    /**
     * Sets the value of the numvoip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNUMVOIP(JAXBElement<BigInteger> value) {
        this.numvoip = value;
    }

    /**
     * Gets the value of the numwlr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNUMWLR() {
        return numwlr;
    }

    /**
     * Sets the value of the numwlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNUMWLR(JAXBElement<BigInteger> value) {
        this.numwlr = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREGION() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREGION(JAXBElement<String> value) {
        this.region = value;
    }

    /**
     * Gets the value of the serviceinfault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSERVICEINFAULT() {
        return serviceinfault;
    }

    /**
     * Sets the value of the serviceinfault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSERVICEINFAULT(JAXBElement<String> value) {
        this.serviceinfault = value;
    }

    /**
     * Gets the value of the sysstatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSYSSTATUS() {
        return sysstatus;
    }

    /**
     * Sets the value of the sysstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSYSSTATUS(JAXBElement<String> value) {
        this.sysstatus = value;
    }

}

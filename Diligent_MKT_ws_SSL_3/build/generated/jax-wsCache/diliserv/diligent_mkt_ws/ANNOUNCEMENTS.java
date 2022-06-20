
package diligent_mkt_ws;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ANNOUNCEMENTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ANNOUNCEMENTS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bulletinid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numbus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numresidential" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="postby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cinum_details" type="{diligent.services.all}cinums_details_allArray" minOccurs="0"/&gt;
 *         &lt;element name="cinums" type="{diligent.services.all}cinums_allArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANNOUNCEMENTS", propOrder = {
    "bulletinid",
    "startdate",
    "enddate",
    "description",
    "message",
    "numbus",
    "numresidential",
    "postby",
    "subject",
    "cinumDetails",
    "cinums"
})
public class ANNOUNCEMENTS {

    @XmlElementRef(name = "bulletinid", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bulletinid;
    @XmlElementRef(name = "startdate", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startdate;
    @XmlElementRef(name = "enddate", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> enddate;
    @XmlElementRef(name = "description", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "message", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "numbus", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> numbus;
    @XmlElementRef(name = "numresidential", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> numresidential;
    @XmlElementRef(name = "postby", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postby;
    @XmlElementRef(name = "subject", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject;
    @XmlElementRef(name = "cinum_details", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<CinumsDetailsAllArray> cinumDetails;
    @XmlElementRef(name = "cinums", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<CinumsAllArray> cinums;

    /**
     * Gets the value of the bulletinid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBulletinid() {
        return bulletinid;
    }

    /**
     * Sets the value of the bulletinid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBulletinid(JAXBElement<String> value) {
        this.bulletinid = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartdate() {
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
    public void setStartdate(JAXBElement<XMLGregorianCalendar> value) {
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
    public JAXBElement<XMLGregorianCalendar> getEnddate() {
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
    public void setEnddate(JAXBElement<XMLGregorianCalendar> value) {
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
    public JAXBElement<String> getDescription() {
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
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the numbus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNumbus() {
        return numbus;
    }

    /**
     * Sets the value of the numbus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNumbus(JAXBElement<BigInteger> value) {
        this.numbus = value;
    }

    /**
     * Gets the value of the numresidential property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNumresidential() {
        return numresidential;
    }

    /**
     * Sets the value of the numresidential property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNumresidential(JAXBElement<BigInteger> value) {
        this.numresidential = value;
    }

    /**
     * Gets the value of the postby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostby() {
        return postby;
    }

    /**
     * Sets the value of the postby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostby(JAXBElement<String> value) {
        this.postby = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = value;
    }

    /**
     * Gets the value of the cinumDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CinumsDetailsAllArray }{@code >}
     *     
     */
    public JAXBElement<CinumsDetailsAllArray> getCinumDetails() {
        return cinumDetails;
    }

    /**
     * Sets the value of the cinumDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CinumsDetailsAllArray }{@code >}
     *     
     */
    public void setCinumDetails(JAXBElement<CinumsDetailsAllArray> value) {
        this.cinumDetails = value;
    }

    /**
     * Gets the value of the cinums property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CinumsAllArray }{@code >}
     *     
     */
    public JAXBElement<CinumsAllArray> getCinums() {
        return cinums;
    }

    /**
     * Sets the value of the cinums property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CinumsAllArray }{@code >}
     *     
     */
    public void setCinums(JAXBElement<CinumsAllArray> value) {
        this.cinums = value;
    }

}

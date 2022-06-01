
package customerLineService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CUSTOMERLINEIDObjectType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CUSTOMERLINEIDObjectType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CUSTOMERLINEIDID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ENDTIME" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LINEID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TICKETID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TYPE" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXDateTimeType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="action" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}ProcessingActionType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUSTOMERLINEIDObjectType", propOrder = {
    "customerlineidid",
    "description",
    "endtime",
    "lineid",
    "ticketid",
    "type",
    "changedate"
})
public class CUSTOMERLINEIDObjectType {

    @XmlElementRef(name = "CUSTOMERLINEIDID", namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> customerlineidid;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElementRef(name = "ENDTIME", namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> endtime;
    @XmlElement(name = "LINEID")
    protected MXStringType lineid;
    @XmlElement(name = "TICKETID")
    protected MXStringType ticketid;
    @XmlElement(name = "TYPE")
    protected MXStringType type;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;

    /**
     * Gets the value of the customerlineidid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getCUSTOMERLINEIDID() {
        return customerlineidid;
    }

    /**
     * Sets the value of the customerlineidid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setCUSTOMERLINEIDID(JAXBElement<MXLongType> value) {
        this.customerlineidid = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDESCRIPTION(MXStringType value) {
        this.description = value;
    }

    /**
     * Gets the value of the endtime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getENDTIME() {
        return endtime;
    }

    /**
     * Sets the value of the endtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setENDTIME(JAXBElement<MXDateTimeType> value) {
        this.endtime = value;
    }

    /**
     * Gets the value of the lineid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLINEID() {
        return lineid;
    }

    /**
     * Sets the value of the lineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLINEID(MXStringType value) {
        this.lineid = value;
    }

    /**
     * Gets the value of the ticketid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTICKETID() {
        return ticketid;
    }

    /**
     * Sets the value of the ticketid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTICKETID(MXStringType value) {
        this.ticketid = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTYPE(MXStringType value) {
        this.type = value;
    }

    /**
     * Gets the value of the changedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getCHANGEDATE() {
        return changedate;
    }

    /**
     * Sets the value of the changedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setCHANGEDATE(JAXBElement<MXDateTimeType> value) {
        this.changedate = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingActionType }
     *     
     */
    public ProcessingActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingActionType }
     *     
     */
    public void setAction(ProcessingActionType value) {
        this.action = value;
    }

}

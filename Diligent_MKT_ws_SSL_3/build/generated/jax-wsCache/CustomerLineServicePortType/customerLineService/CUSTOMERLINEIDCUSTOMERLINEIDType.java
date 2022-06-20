
package customerLineService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUSTOMERLINEID_CUSTOMERLINEIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUSTOMERLINEID_CUSTOMERLINEIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MAXINTERRORMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERLINEIDID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ENDTIME" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="LINEID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="TICKETID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}ObjectStructurePropertyGroup"/&gt;
 *       &lt;attribute name="transLanguage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUSTOMERLINEID_CUSTOMERLINEIDType", propOrder = {
    "maxinterrormsg",
    "changedate",
    "customerlineidid",
    "description",
    "endtime",
    "lineid",
    "ticketid",
    "type"
})
public class CUSTOMERLINEIDCUSTOMERLINEIDType {

    @XmlElement(name = "MAXINTERRORMSG")
    protected String maxinterrormsg;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
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
    @XmlAttribute(name = "transLanguage")
    protected String transLanguage;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the maxinterrormsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXINTERRORMSG() {
        return maxinterrormsg;
    }

    /**
     * Sets the value of the maxinterrormsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXINTERRORMSG(String value) {
        this.maxinterrormsg = value;
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
     * Gets the value of the transLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransLanguage() {
        return transLanguage;
    }

    /**
     * Sets the value of the transLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransLanguage(String value) {
        this.transLanguage = value;
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

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the deleteForInsert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteForInsert() {
        return deleteForInsert;
    }

    /**
     * Sets the value of the deleteForInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteForInsert(String value) {
        this.deleteForInsert = value;
    }

}

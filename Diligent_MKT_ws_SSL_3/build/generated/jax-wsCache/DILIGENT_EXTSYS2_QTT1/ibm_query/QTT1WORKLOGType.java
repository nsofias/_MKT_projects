
package ibm_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTT1_WORKLOGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTT1_WORKLOGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION_LONGDESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="LOGTYPE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&gt;
 *         &lt;element name="MODIFYBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="MODIFYDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="WORKLOGID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ibm.com/maximo}ObjectStructurePropertyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTT1_WORKLOGType", propOrder = {
    "createby",
    "createdate",
    "description",
    "descriptionlongdescription",
    "logtype",
    "modifyby",
    "modifydate",
    "orgid",
    "worklogid"
})
public class QTT1WORKLOGType {

    @XmlElement(name = "CREATEBY")
    protected MXStringType createby;
    @XmlElementRef(name = "CREATEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> createdate;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "DESCRIPTION_LONGDESCRIPTION")
    protected MXStringType descriptionlongdescription;
    @XmlElement(name = "LOGTYPE")
    protected MXDomainType logtype;
    @XmlElement(name = "MODIFYBY")
    protected MXStringType modifyby;
    @XmlElementRef(name = "MODIFYDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> modifydate;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElementRef(name = "WORKLOGID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> worklogid;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the createby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCREATEBY() {
        return createby;
    }

    /**
     * Sets the value of the createby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCREATEBY(MXStringType value) {
        this.createby = value;
    }

    /**
     * Gets the value of the createdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getCREATEDATE() {
        return createdate;
    }

    /**
     * Sets the value of the createdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setCREATEDATE(JAXBElement<MXDateTimeType> value) {
        this.createdate = value;
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
     * Gets the value of the descriptionlongdescription property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDESCRIPTIONLONGDESCRIPTION() {
        return descriptionlongdescription;
    }

    /**
     * Sets the value of the descriptionlongdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDESCRIPTIONLONGDESCRIPTION(MXStringType value) {
        this.descriptionlongdescription = value;
    }

    /**
     * Gets the value of the logtype property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getLOGTYPE() {
        return logtype;
    }

    /**
     * Sets the value of the logtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setLOGTYPE(MXDomainType value) {
        this.logtype = value;
    }

    /**
     * Gets the value of the modifyby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getMODIFYBY() {
        return modifyby;
    }

    /**
     * Sets the value of the modifyby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setMODIFYBY(MXStringType value) {
        this.modifyby = value;
    }

    /**
     * Gets the value of the modifydate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getMODIFYDATE() {
        return modifydate;
    }

    /**
     * Sets the value of the modifydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setMODIFYDATE(JAXBElement<MXDateTimeType> value) {
        this.modifydate = value;
    }

    /**
     * Gets the value of the orgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORGID() {
        return orgid;
    }

    /**
     * Sets the value of the orgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORGID(MXStringType value) {
        this.orgid = value;
    }

    /**
     * Gets the value of the worklogid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWORKLOGID() {
        return worklogid;
    }

    /**
     * Sets the value of the worklogid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWORKLOGID(JAXBElement<MXLongType> value) {
        this.worklogid = value;
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

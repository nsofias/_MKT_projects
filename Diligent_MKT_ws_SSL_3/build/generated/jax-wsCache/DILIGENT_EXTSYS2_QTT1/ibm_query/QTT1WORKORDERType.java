
package ibm_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTT1_WORKORDERType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTT1_WORKORDERType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="CANCELREASON" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="LASTREMARK" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="OBJECTTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORDERAIM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PLACEOFFAULT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&gt;
 *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&gt;
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
@XmlType(name = "QTT1_WORKORDERType", propOrder = {
    "actfinish",
    "actstart",
    "cancelreason",
    "createdate",
    "createdby",
    "description",
    "externalrefid",
    "historyflag",
    "lastremark",
    "objecttype",
    "orderaim",
    "origrecordid",
    "owner",
    "placeoffault",
    "regionname",
    "reportdate",
    "siteid",
    "status",
    "statusdate",
    "wonum",
    "workorderid"
})
public class QTT1WORKORDERType {

    @XmlElementRef(name = "ACTFINISH", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actfinish;
    @XmlElementRef(name = "ACTSTART", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actstart;
    @XmlElement(name = "CANCELREASON")
    protected MXStringType cancelreason;
    @XmlElementRef(name = "CREATEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> createdate;
    @XmlElement(name = "CREATEDBY")
    protected MXStringType createdby;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "EXTERNALREFID")
    protected MXStringType externalrefid;
    @XmlElement(name = "HISTORYFLAG")
    protected MXBooleanType historyflag;
    @XmlElement(name = "LASTREMARK")
    protected MXStringType lastremark;
    @XmlElement(name = "OBJECTTYPE")
    protected MXStringType objecttype;
    @XmlElement(name = "ORDERAIM")
    protected MXStringType orderaim;
    @XmlElement(name = "ORIGRECORDID")
    protected MXStringType origrecordid;
    @XmlElement(name = "OWNER")
    protected MXStringType owner;
    @XmlElement(name = "PLACEOFFAULT")
    protected MXStringType placeoffault;
    @XmlElement(name = "REGIONNAME")
    protected MXStringType regionname;
    @XmlElementRef(name = "REPORTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> reportdate;
    @XmlElement(name = "SITEID")
    protected MXStringType siteid;
    @XmlElement(name = "STATUS")
    protected MXDomainType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElement(name = "WONUM")
    protected MXStringType wonum;
    @XmlElementRef(name = "WORKORDERID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> workorderid;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the actfinish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTFINISH() {
        return actfinish;
    }

    /**
     * Sets the value of the actfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTFINISH(JAXBElement<MXDateTimeType> value) {
        this.actfinish = value;
    }

    /**
     * Gets the value of the actstart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTSTART() {
        return actstart;
    }

    /**
     * Sets the value of the actstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTSTART(JAXBElement<MXDateTimeType> value) {
        this.actstart = value;
    }

    /**
     * Gets the value of the cancelreason property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCANCELREASON() {
        return cancelreason;
    }

    /**
     * Sets the value of the cancelreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCANCELREASON(MXStringType value) {
        this.cancelreason = value;
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
     * Gets the value of the createdby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCREATEDBY() {
        return createdby;
    }

    /**
     * Sets the value of the createdby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCREATEDBY(MXStringType value) {
        this.createdby = value;
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
     * Gets the value of the externalrefid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEXTERNALREFID() {
        return externalrefid;
    }

    /**
     * Sets the value of the externalrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEXTERNALREFID(MXStringType value) {
        this.externalrefid = value;
    }

    /**
     * Gets the value of the historyflag property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHISTORYFLAG() {
        return historyflag;
    }

    /**
     * Sets the value of the historyflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHISTORYFLAG(MXBooleanType value) {
        this.historyflag = value;
    }

    /**
     * Gets the value of the lastremark property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLASTREMARK() {
        return lastremark;
    }

    /**
     * Sets the value of the lastremark property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLASTREMARK(MXStringType value) {
        this.lastremark = value;
    }

    /**
     * Gets the value of the objecttype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOBJECTTYPE() {
        return objecttype;
    }

    /**
     * Sets the value of the objecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOBJECTTYPE(MXStringType value) {
        this.objecttype = value;
    }

    /**
     * Gets the value of the orderaim property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORDERAIM() {
        return orderaim;
    }

    /**
     * Sets the value of the orderaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORDERAIM(MXStringType value) {
        this.orderaim = value;
    }

    /**
     * Gets the value of the origrecordid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORIGRECORDID() {
        return origrecordid;
    }

    /**
     * Sets the value of the origrecordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORIGRECORDID(MXStringType value) {
        this.origrecordid = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOWNER() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOWNER(MXStringType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the placeoffault property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLACEOFFAULT() {
        return placeoffault;
    }

    /**
     * Sets the value of the placeoffault property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLACEOFFAULT(MXStringType value) {
        this.placeoffault = value;
    }

    /**
     * Gets the value of the regionname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREGIONNAME() {
        return regionname;
    }

    /**
     * Sets the value of the regionname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREGIONNAME(MXStringType value) {
        this.regionname = value;
    }

    /**
     * Gets the value of the reportdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getREPORTDATE() {
        return reportdate;
    }

    /**
     * Sets the value of the reportdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setREPORTDATE(JAXBElement<MXDateTimeType> value) {
        this.reportdate = value;
    }

    /**
     * Gets the value of the siteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSITEID() {
        return siteid;
    }

    /**
     * Sets the value of the siteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSITEID(MXStringType value) {
        this.siteid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setSTATUS(MXDomainType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getSTATUSDATE() {
        return statusdate;
    }

    /**
     * Sets the value of the statusdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setSTATUSDATE(JAXBElement<MXDateTimeType> value) {
        this.statusdate = value;
    }

    /**
     * Gets the value of the wonum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWONUM() {
        return wonum;
    }

    /**
     * Sets the value of the wonum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWONUM(MXStringType value) {
        this.wonum = value;
    }

    /**
     * Gets the value of the workorderid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWORKORDERID() {
        return workorderid;
    }

    /**
     * Sets the value of the workorderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWORKORDERID(JAXBElement<MXLongType> value) {
        this.workorderid = value;
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

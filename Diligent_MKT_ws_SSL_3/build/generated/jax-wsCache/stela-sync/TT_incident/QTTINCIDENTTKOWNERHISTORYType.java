
package TT_incident;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTTINCIDENT_TKOWNERHISTORYType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTTINCIDENT_TKOWNERHISTORYType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="OWNDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="OWNERCHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="TKOWNERHISTORYID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}ObjectStructurePropertyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTTINCIDENT_TKOWNERHISTORYType", propOrder = {
    "assignedownergroup",
    "orgid",
    "owndate",
    "owner",
    "ownerchangeby",
    "ownergroup",
    "siteid",
    "tkownerhistoryid"
})
public class QTTINCIDENTTKOWNERHISTORYType {

    @XmlElement(name = "ASSIGNEDOWNERGROUP")
    protected MXStringType assignedownergroup;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElementRef(name = "OWNDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> owndate;
    @XmlElement(name = "OWNER")
    protected MXStringType owner;
    @XmlElement(name = "OWNERCHANGEBY")
    protected MXStringType ownerchangeby;
    @XmlElement(name = "OWNERGROUP")
    protected MXStringType ownergroup;
    @XmlElement(name = "SITEID")
    protected MXStringType siteid;
    @XmlElementRef(name = "TKOWNERHISTORYID", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> tkownerhistoryid;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the assignedownergroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSIGNEDOWNERGROUP() {
        return assignedownergroup;
    }

    /**
     * Sets the value of the assignedownergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSIGNEDOWNERGROUP(MXStringType value) {
        this.assignedownergroup = value;
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
     * Gets the value of the owndate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getOWNDATE() {
        return owndate;
    }

    /**
     * Sets the value of the owndate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setOWNDATE(JAXBElement<MXDateTimeType> value) {
        this.owndate = value;
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
     * Gets the value of the ownerchangeby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOWNERCHANGEBY() {
        return ownerchangeby;
    }

    /**
     * Sets the value of the ownerchangeby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOWNERCHANGEBY(MXStringType value) {
        this.ownerchangeby = value;
    }

    /**
     * Gets the value of the ownergroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOWNERGROUP() {
        return ownergroup;
    }

    /**
     * Sets the value of the ownergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOWNERGROUP(MXStringType value) {
        this.ownergroup = value;
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
     * Gets the value of the tkownerhistoryid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getTKOWNERHISTORYID() {
        return tkownerhistoryid;
    }

    /**
     * Sets the value of the tkownerhistoryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setTKOWNERHISTORYID(JAXBElement<MXLongType> value) {
        this.tkownerhistoryid = value;
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

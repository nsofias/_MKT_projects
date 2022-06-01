
package ibm_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QTT1_AFFECTEDSERVICEType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QTT1_AFFECTEDSERVICEType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.ibm.com/maximo}ObjectStructurePropertyGroup"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTT1_AFFECTEDSERVICEType", propOrder = {
    "affectedserviceid",
    "changedate",
    "cinum",
    "deleteflag",
    "description",
    "enddate",
    "equipmenttype",
    "location",
    "numadsl",
    "numinternet",
    "numiptv",
    "numofimpactedcust",
    "numvoip",
    "numwlr",
    "onetmid",
    "region",
    "serviceinfault",
    "startdate",
    "sysstatus"
})
public class QTT1AFFECTEDSERVICEType {

    @XmlElementRef(name = "AFFECTEDSERVICEID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> affectedserviceid;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElement(name = "CINUM")
    protected MXStringType cinum;
    @XmlElement(name = "DELETEFLAG")
    protected MXBooleanType deleteflag;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElementRef(name = "ENDDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> enddate;
    @XmlElement(name = "EQUIPMENTTYPE")
    protected MXStringType equipmenttype;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElementRef(name = "NUMADSL", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> numadsl;
    @XmlElementRef(name = "NUMINTERNET", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> numinternet;
    @XmlElementRef(name = "NUMIPTV", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> numiptv;
    @XmlElementRef(name = "NUMOFIMPACTEDCUST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> numofimpactedcust;
    @XmlElementRef(name = "NUMVOIP", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> numvoip;
    @XmlElementRef(name = "NUMWLR", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> numwlr;
    @XmlElement(name = "ONETMID")
    protected MXStringType onetmid;
    @XmlElement(name = "REGION")
    protected MXStringType region;
    @XmlElement(name = "SERVICEINFAULT")
    protected MXStringType serviceinfault;
    @XmlElementRef(name = "STARTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> startdate;
    @XmlElement(name = "SYSSTATUS")
    protected MXStringType sysstatus;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the affectedserviceid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getAFFECTEDSERVICEID() {
        return affectedserviceid;
    }

    /**
     * Sets the value of the affectedserviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setAFFECTEDSERVICEID(JAXBElement<MXLongType> value) {
        this.affectedserviceid = value;
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
     * Gets the value of the cinum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCINUM() {
        return cinum;
    }

    /**
     * Sets the value of the cinum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCINUM(MXStringType value) {
        this.cinum = value;
    }

    /**
     * Gets the value of the deleteflag property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getDELETEFLAG() {
        return deleteflag;
    }

    /**
     * Sets the value of the deleteflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setDELETEFLAG(MXBooleanType value) {
        this.deleteflag = value;
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
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setENDDATE(JAXBElement<MXDateTimeType> value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the equipmenttype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEQUIPMENTTYPE() {
        return equipmenttype;
    }

    /**
     * Sets the value of the equipmenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEQUIPMENTTYPE(MXStringType value) {
        this.equipmenttype = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLOCATION(MXStringType value) {
        this.location = value;
    }

    /**
     * Gets the value of the numadsl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getNUMADSL() {
        return numadsl;
    }

    /**
     * Sets the value of the numadsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setNUMADSL(JAXBElement<MXLongType> value) {
        this.numadsl = value;
    }

    /**
     * Gets the value of the numinternet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getNUMINTERNET() {
        return numinternet;
    }

    /**
     * Sets the value of the numinternet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setNUMINTERNET(JAXBElement<MXLongType> value) {
        this.numinternet = value;
    }

    /**
     * Gets the value of the numiptv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getNUMIPTV() {
        return numiptv;
    }

    /**
     * Sets the value of the numiptv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setNUMIPTV(JAXBElement<MXLongType> value) {
        this.numiptv = value;
    }

    /**
     * Gets the value of the numofimpactedcust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getNUMOFIMPACTEDCUST() {
        return numofimpactedcust;
    }

    /**
     * Sets the value of the numofimpactedcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setNUMOFIMPACTEDCUST(JAXBElement<MXLongType> value) {
        this.numofimpactedcust = value;
    }

    /**
     * Gets the value of the numvoip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getNUMVOIP() {
        return numvoip;
    }

    /**
     * Sets the value of the numvoip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setNUMVOIP(JAXBElement<MXLongType> value) {
        this.numvoip = value;
    }

    /**
     * Gets the value of the numwlr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getNUMWLR() {
        return numwlr;
    }

    /**
     * Sets the value of the numwlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setNUMWLR(JAXBElement<MXLongType> value) {
        this.numwlr = value;
    }

    /**
     * Gets the value of the onetmid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getONETMID() {
        return onetmid;
    }

    /**
     * Sets the value of the onetmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setONETMID(MXStringType value) {
        this.onetmid = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREGION() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREGION(MXStringType value) {
        this.region = value;
    }

    /**
     * Gets the value of the serviceinfault property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSERVICEINFAULT() {
        return serviceinfault;
    }

    /**
     * Sets the value of the serviceinfault property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSERVICEINFAULT(MXStringType value) {
        this.serviceinfault = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setSTARTDATE(JAXBElement<MXDateTimeType> value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the sysstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSYSSTATUS() {
        return sysstatus;
    }

    /**
     * Sets the value of the sysstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSYSSTATUS(MXStringType value) {
        this.sysstatus = value;
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


package ibm_query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QTT1_INCIDENTType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QTT1_INCIDENTType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MAXINTERRORMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTUALCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTUALFINISH" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTUALSTART" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CABLEGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CENTRALA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DESCRIPTION_LONGDESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DEVICENAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EXTERNALSYSTEM" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAULTCAUSE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAULTLOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GLOBALTICKETID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IMPACT" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IMSMIGRATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INDICATEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INTERNALPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ISGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KABEL" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KATEGORIJA" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LINEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LINISKAOPREMA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MESTOPOVREDE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMBEROFAFFECTEDCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGINATEDCOMPANY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGINATEDDEVICE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PAKET" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PRECKAID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REASON" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RELATEDTOGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RESOLVEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RESOLVER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ROOTCAUSE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SERVICESINFAULT" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SLATIPSERVIS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOLUTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGETCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGETFINISH" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TIPPREKIN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TKTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="URGENCY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WAYOFREPAIR" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOCATALOG" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKAROUND" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKAROUNDDESC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKLOG" type="{http://www.ibm.com/maximo}QTT1_WORKLOGType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKORDER" type="{http://www.ibm.com/maximo}QTT1_WORKORDERType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTEDSERVICE" type="{http://www.ibm.com/maximo}QTT1_AFFECTEDSERVICEType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.ibm.com/maximo}ObjectStructurePropertyGroup"/&amp;gt;
 *       &amp;lt;attribute name="transLanguage" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTT1_INCIDENTType", propOrder = {
    "maxinterrormsg",
    "actualcontactdate",
    "actualfinish",
    "actualstart",
    "adjustedtargetcontacttime",
    "adjustedtargetresolutiontime",
    "affecteddate",
    "assignedownergroup",
    "cablegroup",
    "centrala",
    "cinum",
    "_class",
    "classificationid",
    "classstructureid",
    "description",
    "descriptionlongdescription",
    "devicename",
    "externalsystem",
    "faultcause",
    "faultlocation",
    "globalticketid",
    "historyflag",
    "impact",
    "imsmigration",
    "indicatedpriority",
    "internalpriority",
    "isglobal",
    "kabel",
    "kategorija",
    "lineid",
    "liniskaoprema",
    "location",
    "mestopovrede",
    "numberofaffectedcustomers",
    "originatedcompany",
    "originateddevice",
    "owner",
    "ownergroup",
    "paket",
    "preckaid",
    "reason",
    "regionname",
    "relatedtoglobal",
    "reportdate",
    "reportedby",
    "reportedpriority",
    "resolvedby",
    "resolver",
    "rootcause",
    "servicesinfault",
    "slatipservis",
    "solution",
    "status",
    "statusdate",
    "targetcontactdate",
    "targetfinish",
    "ticketid",
    "ticketuid",
    "tipprekin",
    "tktype",
    "urgency",
    "wayofrepair",
    "wocatalog",
    "workaround",
    "workarounddesc",
    "worklog",
    "workorder",
    "affectedservice"
})
public class QTT1INCIDENTType {

    @XmlElement(name = "MAXINTERRORMSG")
    protected String maxinterrormsg;
    @XmlElementRef(name = "ACTUALCONTACTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actualcontactdate;
    @XmlElementRef(name = "ACTUALFINISH", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actualfinish;
    @XmlElementRef(name = "ACTUALSTART", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actualstart;
    @XmlElementRef(name = "ADJUSTEDTARGETCONTACTTIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> adjustedtargetcontacttime;
    @XmlElementRef(name = "ADJUSTEDTARGETRESOLUTIONTIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> adjustedtargetresolutiontime;
    @XmlElementRef(name = "AFFECTEDDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> affecteddate;
    @XmlElement(name = "ASSIGNEDOWNERGROUP")
    protected MXStringType assignedownergroup;
    @XmlElement(name = "CABLEGROUP")
    protected MXStringType cablegroup;
    @XmlElement(name = "CENTRALA")
    protected MXStringType centrala;
    @XmlElement(name = "CINUM")
    protected MXStringType cinum;
    @XmlElement(name = "CLASS")
    protected MXDomainType _class;
    @XmlElement(name = "CLASSIFICATIONID")
    protected MXStringType classificationid;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "DESCRIPTION_LONGDESCRIPTION")
    protected MXStringType descriptionlongdescription;
    @XmlElement(name = "DEVICENAME")
    protected MXStringType devicename;
    @XmlElement(name = "EXTERNALSYSTEM")
    protected MXDomainType externalsystem;
    @XmlElementRef(name = "FAULTCAUSE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> faultcause;
    @XmlElement(name = "FAULTLOCATION")
    protected MXStringType faultlocation;
    @XmlElement(name = "GLOBALTICKETID")
    protected MXStringType globalticketid;
    @XmlElement(name = "HISTORYFLAG")
    protected MXBooleanType historyflag;
    @XmlElementRef(name = "IMPACT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> impact;
    @XmlElement(name = "IMSMIGRATION")
    protected MXStringType imsmigration;
    @XmlElementRef(name = "INDICATEDPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> indicatedpriority;
    @XmlElementRef(name = "INTERNALPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> internalpriority;
    @XmlElement(name = "ISGLOBAL")
    protected MXBooleanType isglobal;
    @XmlElement(name = "KABEL")
    protected MXStringType kabel;
    @XmlElementRef(name = "KATEGORIJA", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> kategorija;
    @XmlElement(name = "LINEID")
    protected MXStringType lineid;
    @XmlElement(name = "LINISKAOPREMA")
    protected MXStringType liniskaoprema;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElement(name = "MESTOPOVREDE")
    protected MXStringType mestopovrede;
    @XmlElementRef(name = "NUMBEROFAFFECTEDCUSTOMERS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> numberofaffectedcustomers;
    @XmlElement(name = "ORIGINATEDCOMPANY")
    protected MXStringType originatedcompany;
    @XmlElement(name = "ORIGINATEDDEVICE")
    protected MXStringType originateddevice;
    @XmlElement(name = "OWNER")
    protected MXStringType owner;
    @XmlElement(name = "OWNERGROUP")
    protected MXStringType ownergroup;
    @XmlElement(name = "PAKET")
    protected MXStringType paket;
    @XmlElement(name = "PRECKAID")
    protected MXStringType preckaid;
    @XmlElement(name = "REASON")
    protected MXStringType reason;
    @XmlElement(name = "REGIONNAME")
    protected MXStringType regionname;
    @XmlElement(name = "RELATEDTOGLOBAL")
    protected MXBooleanType relatedtoglobal;
    @XmlElementRef(name = "REPORTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> reportdate;
    @XmlElement(name = "REPORTEDBY")
    protected MXStringType reportedby;
    @XmlElementRef(name = "REPORTEDPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> reportedpriority;
    @XmlElement(name = "RESOLVEDBY")
    protected MXStringType resolvedby;
    @XmlElement(name = "RESOLVER")
    protected MXStringType resolver;
    @XmlElementRef(name = "ROOTCAUSE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> rootcause;
    @XmlElementRef(name = "SERVICESINFAULT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> servicesinfault;
    @XmlElement(name = "SLATIPSERVIS")
    protected MXStringType slatipservis;
    @XmlElement(name = "SOLUTION")
    protected MXStringType solution;
    @XmlElement(name = "STATUS")
    protected MXDomainType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElementRef(name = "TARGETCONTACTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targetcontactdate;
    @XmlElementRef(name = "TARGETFINISH", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targetfinish;
    @XmlElement(name = "TICKETID")
    protected MXStringType ticketid;
    @XmlElementRef(name = "TICKETUID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> ticketuid;
    @XmlElement(name = "TIPPREKIN")
    protected MXStringType tipprekin;
    @XmlElement(name = "TKTYPE")
    protected MXStringType tktype;
    @XmlElementRef(name = "URGENCY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> urgency;
    @XmlElementRef(name = "WAYOFREPAIR", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> wayofrepair;
    @XmlElement(name = "WOCATALOG")
    protected MXStringType wocatalog;
    @XmlElement(name = "WORKAROUND")
    protected MXBooleanType workaround;
    @XmlElement(name = "WORKAROUNDDESC")
    protected MXStringType workarounddesc;
    @XmlElement(name = "WORKLOG")
    protected List<QTT1WORKLOGType> worklog;
    @XmlElement(name = "WORKORDER")
    protected List<QTT1WORKORDERType> workorder;
    @XmlElement(name = "AFFECTEDSERVICE")
    protected List<QTT1AFFECTEDSERVICEType> affectedservice;
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
     * Gets the value of the actualcontactdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTUALCONTACTDATE() {
        return actualcontactdate;
    }

    /**
     * Sets the value of the actualcontactdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTUALCONTACTDATE(JAXBElement<MXDateTimeType> value) {
        this.actualcontactdate = value;
    }

    /**
     * Gets the value of the actualfinish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTUALFINISH() {
        return actualfinish;
    }

    /**
     * Sets the value of the actualfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTUALFINISH(JAXBElement<MXDateTimeType> value) {
        this.actualfinish = value;
    }

    /**
     * Gets the value of the actualstart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTUALSTART() {
        return actualstart;
    }

    /**
     * Sets the value of the actualstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTUALSTART(JAXBElement<MXDateTimeType> value) {
        this.actualstart = value;
    }

    /**
     * Gets the value of the adjustedtargetcontacttime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getADJUSTEDTARGETCONTACTTIME() {
        return adjustedtargetcontacttime;
    }

    /**
     * Sets the value of the adjustedtargetcontacttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setADJUSTEDTARGETCONTACTTIME(JAXBElement<MXDateTimeType> value) {
        this.adjustedtargetcontacttime = value;
    }

    /**
     * Gets the value of the adjustedtargetresolutiontime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getADJUSTEDTARGETRESOLUTIONTIME() {
        return adjustedtargetresolutiontime;
    }

    /**
     * Sets the value of the adjustedtargetresolutiontime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setADJUSTEDTARGETRESOLUTIONTIME(JAXBElement<MXDateTimeType> value) {
        this.adjustedtargetresolutiontime = value;
    }

    /**
     * Gets the value of the affecteddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getAFFECTEDDATE() {
        return affecteddate;
    }

    /**
     * Sets the value of the affecteddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setAFFECTEDDATE(JAXBElement<MXDateTimeType> value) {
        this.affecteddate = value;
    }

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
     * Gets the value of the cablegroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCABLEGROUP() {
        return cablegroup;
    }

    /**
     * Sets the value of the cablegroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCABLEGROUP(MXStringType value) {
        this.cablegroup = value;
    }

    /**
     * Gets the value of the centrala property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCENTRALA() {
        return centrala;
    }

    /**
     * Sets the value of the centrala property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCENTRALA(MXStringType value) {
        this.centrala = value;
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
     * Gets the value of the class property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getCLASS() {
        return _class;
    }

    /**
     * Sets the value of the class property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setCLASS(MXDomainType value) {
        this._class = value;
    }

    /**
     * Gets the value of the classificationid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCLASSIFICATIONID() {
        return classificationid;
    }

    /**
     * Sets the value of the classificationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCLASSIFICATIONID(MXStringType value) {
        this.classificationid = value;
    }

    /**
     * Gets the value of the classstructureid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCLASSSTRUCTUREID() {
        return classstructureid;
    }

    /**
     * Sets the value of the classstructureid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCLASSSTRUCTUREID(MXStringType value) {
        this.classstructureid = value;
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
     * Gets the value of the devicename property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDEVICENAME() {
        return devicename;
    }

    /**
     * Sets the value of the devicename property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDEVICENAME(MXStringType value) {
        this.devicename = value;
    }

    /**
     * Gets the value of the externalsystem property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getEXTERNALSYSTEM() {
        return externalsystem;
    }

    /**
     * Sets the value of the externalsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setEXTERNALSYSTEM(MXDomainType value) {
        this.externalsystem = value;
    }

    /**
     * Gets the value of the faultcause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getFAULTCAUSE() {
        return faultcause;
    }

    /**
     * Sets the value of the faultcause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setFAULTCAUSE(JAXBElement<MXLongType> value) {
        this.faultcause = value;
    }

    /**
     * Gets the value of the faultlocation property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFAULTLOCATION() {
        return faultlocation;
    }

    /**
     * Sets the value of the faultlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFAULTLOCATION(MXStringType value) {
        this.faultlocation = value;
    }

    /**
     * Gets the value of the globalticketid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getGLOBALTICKETID() {
        return globalticketid;
    }

    /**
     * Sets the value of the globalticketid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setGLOBALTICKETID(MXStringType value) {
        this.globalticketid = value;
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
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getIMPACT() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setIMPACT(JAXBElement<MXLongType> value) {
        this.impact = value;
    }

    /**
     * Gets the value of the imsmigration property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getIMSMIGRATION() {
        return imsmigration;
    }

    /**
     * Sets the value of the imsmigration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setIMSMIGRATION(MXStringType value) {
        this.imsmigration = value;
    }

    /**
     * Gets the value of the indicatedpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINDICATEDPRIORITY() {
        return indicatedpriority;
    }

    /**
     * Sets the value of the indicatedpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINDICATEDPRIORITY(JAXBElement<MXLongType> value) {
        this.indicatedpriority = value;
    }

    /**
     * Gets the value of the internalpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINTERNALPRIORITY() {
        return internalpriority;
    }

    /**
     * Sets the value of the internalpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINTERNALPRIORITY(JAXBElement<MXLongType> value) {
        this.internalpriority = value;
    }

    /**
     * Gets the value of the isglobal property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISGLOBAL() {
        return isglobal;
    }

    /**
     * Sets the value of the isglobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISGLOBAL(MXBooleanType value) {
        this.isglobal = value;
    }

    /**
     * Gets the value of the kabel property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getKABEL() {
        return kabel;
    }

    /**
     * Sets the value of the kabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setKABEL(MXStringType value) {
        this.kabel = value;
    }

    /**
     * Gets the value of the kategorija property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getKATEGORIJA() {
        return kategorija;
    }

    /**
     * Sets the value of the kategorija property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setKATEGORIJA(JAXBElement<MXLongType> value) {
        this.kategorija = value;
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
     * Gets the value of the liniskaoprema property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLINISKAOPREMA() {
        return liniskaoprema;
    }

    /**
     * Sets the value of the liniskaoprema property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLINISKAOPREMA(MXStringType value) {
        this.liniskaoprema = value;
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
     * Gets the value of the mestopovrede property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getMESTOPOVREDE() {
        return mestopovrede;
    }

    /**
     * Sets the value of the mestopovrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setMESTOPOVREDE(MXStringType value) {
        this.mestopovrede = value;
    }

    /**
     * Gets the value of the numberofaffectedcustomers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getNUMBEROFAFFECTEDCUSTOMERS() {
        return numberofaffectedcustomers;
    }

    /**
     * Sets the value of the numberofaffectedcustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setNUMBEROFAFFECTEDCUSTOMERS(JAXBElement<MXLongType> value) {
        this.numberofaffectedcustomers = value;
    }

    /**
     * Gets the value of the originatedcompany property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORIGINATEDCOMPANY() {
        return originatedcompany;
    }

    /**
     * Sets the value of the originatedcompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORIGINATEDCOMPANY(MXStringType value) {
        this.originatedcompany = value;
    }

    /**
     * Gets the value of the originateddevice property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORIGINATEDDEVICE() {
        return originateddevice;
    }

    /**
     * Sets the value of the originateddevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORIGINATEDDEVICE(MXStringType value) {
        this.originateddevice = value;
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
     * Gets the value of the paket property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPAKET() {
        return paket;
    }

    /**
     * Sets the value of the paket property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPAKET(MXStringType value) {
        this.paket = value;
    }

    /**
     * Gets the value of the preckaid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPRECKAID() {
        return preckaid;
    }

    /**
     * Sets the value of the preckaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPRECKAID(MXStringType value) {
        this.preckaid = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREASON() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREASON(MXStringType value) {
        this.reason = value;
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
     * Gets the value of the relatedtoglobal property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getRELATEDTOGLOBAL() {
        return relatedtoglobal;
    }

    /**
     * Sets the value of the relatedtoglobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setRELATEDTOGLOBAL(MXBooleanType value) {
        this.relatedtoglobal = value;
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
     * Gets the value of the reportedby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREPORTEDBY() {
        return reportedby;
    }

    /**
     * Sets the value of the reportedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREPORTEDBY(MXStringType value) {
        this.reportedby = value;
    }

    /**
     * Gets the value of the reportedpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getREPORTEDPRIORITY() {
        return reportedpriority;
    }

    /**
     * Sets the value of the reportedpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setREPORTEDPRIORITY(JAXBElement<MXLongType> value) {
        this.reportedpriority = value;
    }

    /**
     * Gets the value of the resolvedby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRESOLVEDBY() {
        return resolvedby;
    }

    /**
     * Sets the value of the resolvedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRESOLVEDBY(MXStringType value) {
        this.resolvedby = value;
    }

    /**
     * Gets the value of the resolver property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRESOLVER() {
        return resolver;
    }

    /**
     * Sets the value of the resolver property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRESOLVER(MXStringType value) {
        this.resolver = value;
    }

    /**
     * Gets the value of the rootcause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getROOTCAUSE() {
        return rootcause;
    }

    /**
     * Sets the value of the rootcause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setROOTCAUSE(JAXBElement<MXLongType> value) {
        this.rootcause = value;
    }

    /**
     * Gets the value of the servicesinfault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getSERVICESINFAULT() {
        return servicesinfault;
    }

    /**
     * Sets the value of the servicesinfault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setSERVICESINFAULT(JAXBElement<MXLongType> value) {
        this.servicesinfault = value;
    }

    /**
     * Gets the value of the slatipservis property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSLATIPSERVIS() {
        return slatipservis;
    }

    /**
     * Sets the value of the slatipservis property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSLATIPSERVIS(MXStringType value) {
        this.slatipservis = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSOLUTION() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSOLUTION(MXStringType value) {
        this.solution = value;
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
     * Gets the value of the targetcontactdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTARGETCONTACTDATE() {
        return targetcontactdate;
    }

    /**
     * Sets the value of the targetcontactdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTARGETCONTACTDATE(JAXBElement<MXDateTimeType> value) {
        this.targetcontactdate = value;
    }

    /**
     * Gets the value of the targetfinish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTARGETFINISH() {
        return targetfinish;
    }

    /**
     * Sets the value of the targetfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTARGETFINISH(JAXBElement<MXDateTimeType> value) {
        this.targetfinish = value;
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
     * Gets the value of the ticketuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getTICKETUID() {
        return ticketuid;
    }

    /**
     * Sets the value of the ticketuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setTICKETUID(JAXBElement<MXLongType> value) {
        this.ticketuid = value;
    }

    /**
     * Gets the value of the tipprekin property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTIPPREKIN() {
        return tipprekin;
    }

    /**
     * Sets the value of the tipprekin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTIPPREKIN(MXStringType value) {
        this.tipprekin = value;
    }

    /**
     * Gets the value of the tktype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTKTYPE() {
        return tktype;
    }

    /**
     * Sets the value of the tktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTKTYPE(MXStringType value) {
        this.tktype = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getURGENCY() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setURGENCY(JAXBElement<MXLongType> value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the wayofrepair property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWAYOFREPAIR() {
        return wayofrepair;
    }

    /**
     * Sets the value of the wayofrepair property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWAYOFREPAIR(JAXBElement<MXLongType> value) {
        this.wayofrepair = value;
    }

    /**
     * Gets the value of the wocatalog property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOCATALOG() {
        return wocatalog;
    }

    /**
     * Sets the value of the wocatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOCATALOG(MXStringType value) {
        this.wocatalog = value;
    }

    /**
     * Gets the value of the workaround property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getWORKAROUND() {
        return workaround;
    }

    /**
     * Sets the value of the workaround property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setWORKAROUND(MXBooleanType value) {
        this.workaround = value;
    }

    /**
     * Gets the value of the workarounddesc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORKAROUNDDESC() {
        return workarounddesc;
    }

    /**
     * Sets the value of the workarounddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORKAROUNDDESC(MXStringType value) {
        this.workarounddesc = value;
    }

    /**
     * Gets the value of the worklog property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the worklog property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWORKLOG().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link QTT1WORKLOGType }
     * 
     * 
     */
    public List<QTT1WORKLOGType> getWORKLOG() {
        if (worklog == null) {
            worklog = new ArrayList<QTT1WORKLOGType>();
        }
        return this.worklog;
    }

    /**
     * Gets the value of the workorder property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the workorder property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWORKORDER().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link QTT1WORKORDERType }
     * 
     * 
     */
    public List<QTT1WORKORDERType> getWORKORDER() {
        if (workorder == null) {
            workorder = new ArrayList<QTT1WORKORDERType>();
        }
        return this.workorder;
    }

    /**
     * Gets the value of the affectedservice property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the affectedservice property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAFFECTEDSERVICE().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link QTT1AFFECTEDSERVICEType }
     * 
     * 
     */
    public List<QTT1AFFECTEDSERVICEType> getAFFECTEDSERVICE() {
        if (affectedservice == null) {
            affectedservice = new ArrayList<QTT1AFFECTEDSERVICEType>();
        }
        return this.affectedservice;
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

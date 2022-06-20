
package diligent_mkt_ws;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for INCIDENT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="INCIDENT"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ACTUALCONTACTDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTUALFINISH" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTEDDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CABLEGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CENTRALA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CINUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASSIFICATIONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASSSTRUCTUREID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DESCRIPTION_LONGDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DEVICENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EXTERNALSYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAULTCAUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAULTLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HISTORYFLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IMPACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INDICATEDPRIORITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INTERNALPRIORITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ISGLOBAL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KATEGORIJA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LINEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LINISKAOPREMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMBEROFAFFECTEDCUSTOMERS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGINATEDCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGINATEDDEVICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OWNER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OWNERGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PAKET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PRECKAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REGIONNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RELATEDTOGLOBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTEDBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTEDPRIORITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RESOLVEDBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RESOLVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ROOTCAUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SERVICESINFAULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SLATIPSERVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOLUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STATUSDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGETCONTACTDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGETFINISH" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TICKETID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TICKETUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TIPPREKIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="URGENCY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WAYOFREPAIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOCATALOG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKAROUND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKAROUNDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTED_SERVICE" type="{diligent.services.all}AFFECTEDSERVICEArray" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCIDENT", propOrder = {
    "actualcontactdate",
    "actualfinish",
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
    "historyflag",
    "impact",
    "indicatedpriority",
    "internalpriority",
    "isglobal",
    "kabel",
    "kategorija",
    "lineid",
    "liniskaoprema",
    "location",
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
    "affectedservice"
})
public class INCIDENT {

    @XmlElementRef(name = "ACTUALCONTACTDATE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualcontactdate;
    @XmlElementRef(name = "ACTUALFINISH", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualfinish;
    @XmlElementRef(name = "AFFECTEDDATE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> affecteddate;
    @XmlElementRef(name = "ASSIGNEDOWNERGROUP", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assignedownergroup;
    @XmlElementRef(name = "CABLEGROUP", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cablegroup;
    @XmlElementRef(name = "CENTRALA", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> centrala;
    @XmlElementRef(name = "CINUM", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cinum;
    @XmlElementRef(name = "CLASS", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> _class;
    @XmlElementRef(name = "CLASSIFICATIONID", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classificationid;
    @XmlElementRef(name = "CLASSSTRUCTUREID", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classstructureid;
    @XmlElementRef(name = "DESCRIPTION", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DESCRIPTION_LONGDESCRIPTION", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionlongdescription;
    @XmlElementRef(name = "DEVICENAME", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> devicename;
    @XmlElementRef(name = "EXTERNALSYSTEM", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalsystem;
    @XmlElementRef(name = "FAULTCAUSE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faultcause;
    @XmlElementRef(name = "FAULTLOCATION", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faultlocation;
    @XmlElementRef(name = "HISTORYFLAG", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> historyflag;
    @XmlElementRef(name = "IMPACT", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> impact;
    @XmlElementRef(name = "INDICATEDPRIORITY", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicatedpriority;
    @XmlElementRef(name = "INTERNALPRIORITY", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> internalpriority;
    @XmlElementRef(name = "ISGLOBAL", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isglobal;
    @XmlElementRef(name = "KABEL", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kabel;
    @XmlElementRef(name = "KATEGORIJA", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kategorija;
    @XmlElementRef(name = "LINEID", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineid;
    @XmlElementRef(name = "LINISKAOPREMA", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> liniskaoprema;
    @XmlElementRef(name = "LOCATION", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "NUMBEROFAFFECTEDCUSTOMERS", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberofaffectedcustomers;
    @XmlElementRef(name = "ORIGINATEDCOMPANY", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originatedcompany;
    @XmlElementRef(name = "ORIGINATEDDEVICE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originateddevice;
    @XmlElementRef(name = "OWNER", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> owner;
    @XmlElementRef(name = "OWNERGROUP", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownergroup;
    @XmlElementRef(name = "PAKET", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paket;
    @XmlElementRef(name = "PRECKAID", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preckaid;
    @XmlElementRef(name = "REASON", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reason;
    @XmlElementRef(name = "REGIONNAME", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regionname;
    @XmlElementRef(name = "RELATEDTOGLOBAL", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relatedtoglobal;
    @XmlElementRef(name = "REPORTDATE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reportdate;
    @XmlElementRef(name = "REPORTEDBY", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportedby;
    @XmlElementRef(name = "REPORTEDPRIORITY", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportedpriority;
    @XmlElementRef(name = "RESOLVEDBY", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resolvedby;
    @XmlElementRef(name = "RESOLVER", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resolver;
    @XmlElementRef(name = "ROOTCAUSE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rootcause;
    @XmlElementRef(name = "SERVICESINFAULT", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> servicesinfault;
    @XmlElementRef(name = "SLATIPSERVIS", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> slatipservis;
    @XmlElementRef(name = "SOLUTION", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> solution;
    @XmlElementRef(name = "STATUS", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "STATUSDATE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> statusdate;
    @XmlElementRef(name = "TARGETCONTACTDATE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> targetcontactdate;
    @XmlElementRef(name = "TARGETFINISH", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> targetfinish;
    @XmlElementRef(name = "TICKETID", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketid;
    @XmlElementRef(name = "TICKETUID", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketuid;
    @XmlElementRef(name = "TIPPREKIN", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipprekin;
    @XmlElementRef(name = "TKTYPE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tktype;
    @XmlElementRef(name = "URGENCY", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> urgency;
    @XmlElementRef(name = "WAYOFREPAIR", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wayofrepair;
    @XmlElementRef(name = "WOCATALOG", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wocatalog;
    @XmlElementRef(name = "WORKAROUND", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> workaround;
    @XmlElementRef(name = "WORKAROUNDDESC", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workarounddesc;
    @XmlElementRef(name = "AFFECTED_SERVICE", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<AFFECTEDSERVICEArray> affectedservice;

    /**
     * Gets the value of the actualcontactdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getACTUALCONTACTDATE() {
        return actualcontactdate;
    }

    /**
     * Sets the value of the actualcontactdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setACTUALCONTACTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.actualcontactdate = value;
    }

    /**
     * Gets the value of the actualfinish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getACTUALFINISH() {
        return actualfinish;
    }

    /**
     * Sets the value of the actualfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setACTUALFINISH(JAXBElement<XMLGregorianCalendar> value) {
        this.actualfinish = value;
    }

    /**
     * Gets the value of the affecteddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAFFECTEDDATE() {
        return affecteddate;
    }

    /**
     * Sets the value of the affecteddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAFFECTEDDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.affecteddate = value;
    }

    /**
     * Gets the value of the assignedownergroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASSIGNEDOWNERGROUP() {
        return assignedownergroup;
    }

    /**
     * Sets the value of the assignedownergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASSIGNEDOWNERGROUP(JAXBElement<String> value) {
        this.assignedownergroup = value;
    }

    /**
     * Gets the value of the cablegroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCABLEGROUP() {
        return cablegroup;
    }

    /**
     * Sets the value of the cablegroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCABLEGROUP(JAXBElement<String> value) {
        this.cablegroup = value;
    }

    /**
     * Gets the value of the centrala property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCENTRALA() {
        return centrala;
    }

    /**
     * Sets the value of the centrala property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCENTRALA(JAXBElement<String> value) {
        this.centrala = value;
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
     * Gets the value of the class property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLASS() {
        return _class;
    }

    /**
     * Sets the value of the class property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLASS(JAXBElement<String> value) {
        this._class = value;
    }

    /**
     * Gets the value of the classificationid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLASSIFICATIONID() {
        return classificationid;
    }

    /**
     * Sets the value of the classificationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLASSIFICATIONID(JAXBElement<String> value) {
        this.classificationid = value;
    }

    /**
     * Gets the value of the classstructureid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLASSSTRUCTUREID() {
        return classstructureid;
    }

    /**
     * Sets the value of the classstructureid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLASSSTRUCTUREID(JAXBElement<String> value) {
        this.classstructureid = value;
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
     * Gets the value of the descriptionlongdescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDESCRIPTIONLONGDESCRIPTION() {
        return descriptionlongdescription;
    }

    /**
     * Sets the value of the descriptionlongdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDESCRIPTIONLONGDESCRIPTION(JAXBElement<String> value) {
        this.descriptionlongdescription = value;
    }

    /**
     * Gets the value of the devicename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEVICENAME() {
        return devicename;
    }

    /**
     * Sets the value of the devicename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEVICENAME(JAXBElement<String> value) {
        this.devicename = value;
    }

    /**
     * Gets the value of the externalsystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXTERNALSYSTEM() {
        return externalsystem;
    }

    /**
     * Sets the value of the externalsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXTERNALSYSTEM(JAXBElement<String> value) {
        this.externalsystem = value;
    }

    /**
     * Gets the value of the faultcause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFAULTCAUSE() {
        return faultcause;
    }

    /**
     * Sets the value of the faultcause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFAULTCAUSE(JAXBElement<String> value) {
        this.faultcause = value;
    }

    /**
     * Gets the value of the faultlocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFAULTLOCATION() {
        return faultlocation;
    }

    /**
     * Sets the value of the faultlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFAULTLOCATION(JAXBElement<String> value) {
        this.faultlocation = value;
    }

    /**
     * Gets the value of the historyflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHISTORYFLAG() {
        return historyflag;
    }

    /**
     * Sets the value of the historyflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHISTORYFLAG(JAXBElement<Boolean> value) {
        this.historyflag = value;
    }

    /**
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIMPACT() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIMPACT(JAXBElement<String> value) {
        this.impact = value;
    }

    /**
     * Gets the value of the indicatedpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINDICATEDPRIORITY() {
        return indicatedpriority;
    }

    /**
     * Sets the value of the indicatedpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINDICATEDPRIORITY(JAXBElement<String> value) {
        this.indicatedpriority = value;
    }

    /**
     * Gets the value of the internalpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINTERNALPRIORITY() {
        return internalpriority;
    }

    /**
     * Sets the value of the internalpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINTERNALPRIORITY(JAXBElement<String> value) {
        this.internalpriority = value;
    }

    /**
     * Gets the value of the isglobal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getISGLOBAL() {
        return isglobal;
    }

    /**
     * Sets the value of the isglobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setISGLOBAL(JAXBElement<Boolean> value) {
        this.isglobal = value;
    }

    /**
     * Gets the value of the kabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKABEL() {
        return kabel;
    }

    /**
     * Sets the value of the kabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKABEL(JAXBElement<String> value) {
        this.kabel = value;
    }

    /**
     * Gets the value of the kategorija property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKATEGORIJA() {
        return kategorija;
    }

    /**
     * Sets the value of the kategorija property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKATEGORIJA(JAXBElement<String> value) {
        this.kategorija = value;
    }

    /**
     * Gets the value of the lineid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLINEID() {
        return lineid;
    }

    /**
     * Sets the value of the lineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLINEID(JAXBElement<String> value) {
        this.lineid = value;
    }

    /**
     * Gets the value of the liniskaoprema property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLINISKAOPREMA() {
        return liniskaoprema;
    }

    /**
     * Sets the value of the liniskaoprema property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLINISKAOPREMA(JAXBElement<String> value) {
        this.liniskaoprema = value;
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
     * Gets the value of the numberofaffectedcustomers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNUMBEROFAFFECTEDCUSTOMERS() {
        return numberofaffectedcustomers;
    }

    /**
     * Sets the value of the numberofaffectedcustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNUMBEROFAFFECTEDCUSTOMERS(JAXBElement<String> value) {
        this.numberofaffectedcustomers = value;
    }

    /**
     * Gets the value of the originatedcompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORIGINATEDCOMPANY() {
        return originatedcompany;
    }

    /**
     * Sets the value of the originatedcompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORIGINATEDCOMPANY(JAXBElement<String> value) {
        this.originatedcompany = value;
    }

    /**
     * Gets the value of the originateddevice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getORIGINATEDDEVICE() {
        return originateddevice;
    }

    /**
     * Sets the value of the originateddevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setORIGINATEDDEVICE(JAXBElement<String> value) {
        this.originateddevice = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOWNER() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOWNER(JAXBElement<String> value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownergroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOWNERGROUP() {
        return ownergroup;
    }

    /**
     * Sets the value of the ownergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOWNERGROUP(JAXBElement<String> value) {
        this.ownergroup = value;
    }

    /**
     * Gets the value of the paket property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAKET() {
        return paket;
    }

    /**
     * Sets the value of the paket property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAKET(JAXBElement<String> value) {
        this.paket = value;
    }

    /**
     * Gets the value of the preckaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRECKAID() {
        return preckaid;
    }

    /**
     * Sets the value of the preckaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRECKAID(JAXBElement<String> value) {
        this.preckaid = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREASON() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREASON(JAXBElement<String> value) {
        this.reason = value;
    }

    /**
     * Gets the value of the regionname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREGIONNAME() {
        return regionname;
    }

    /**
     * Sets the value of the regionname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREGIONNAME(JAXBElement<String> value) {
        this.regionname = value;
    }

    /**
     * Gets the value of the relatedtoglobal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRELATEDTOGLOBAL() {
        return relatedtoglobal;
    }

    /**
     * Sets the value of the relatedtoglobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRELATEDTOGLOBAL(JAXBElement<String> value) {
        this.relatedtoglobal = value;
    }

    /**
     * Gets the value of the reportdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getREPORTDATE() {
        return reportdate;
    }

    /**
     * Sets the value of the reportdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setREPORTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.reportdate = value;
    }

    /**
     * Gets the value of the reportedby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREPORTEDBY() {
        return reportedby;
    }

    /**
     * Sets the value of the reportedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREPORTEDBY(JAXBElement<String> value) {
        this.reportedby = value;
    }

    /**
     * Gets the value of the reportedpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREPORTEDPRIORITY() {
        return reportedpriority;
    }

    /**
     * Sets the value of the reportedpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREPORTEDPRIORITY(JAXBElement<String> value) {
        this.reportedpriority = value;
    }

    /**
     * Gets the value of the resolvedby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESOLVEDBY() {
        return resolvedby;
    }

    /**
     * Sets the value of the resolvedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESOLVEDBY(JAXBElement<String> value) {
        this.resolvedby = value;
    }

    /**
     * Gets the value of the resolver property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESOLVER() {
        return resolver;
    }

    /**
     * Sets the value of the resolver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESOLVER(JAXBElement<String> value) {
        this.resolver = value;
    }

    /**
     * Gets the value of the rootcause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getROOTCAUSE() {
        return rootcause;
    }

    /**
     * Sets the value of the rootcause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setROOTCAUSE(JAXBElement<String> value) {
        this.rootcause = value;
    }

    /**
     * Gets the value of the servicesinfault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSERVICESINFAULT() {
        return servicesinfault;
    }

    /**
     * Sets the value of the servicesinfault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSERVICESINFAULT(JAXBElement<String> value) {
        this.servicesinfault = value;
    }

    /**
     * Gets the value of the slatipservis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSLATIPSERVIS() {
        return slatipservis;
    }

    /**
     * Sets the value of the slatipservis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSLATIPSERVIS(JAXBElement<String> value) {
        this.slatipservis = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSOLUTION() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSOLUTION(JAXBElement<String> value) {
        this.solution = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUS(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSTATUSDATE() {
        return statusdate;
    }

    /**
     * Sets the value of the statusdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSTATUSDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.statusdate = value;
    }

    /**
     * Gets the value of the targetcontactdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTARGETCONTACTDATE() {
        return targetcontactdate;
    }

    /**
     * Sets the value of the targetcontactdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTARGETCONTACTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.targetcontactdate = value;
    }

    /**
     * Gets the value of the targetfinish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTARGETFINISH() {
        return targetfinish;
    }

    /**
     * Sets the value of the targetfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTARGETFINISH(JAXBElement<XMLGregorianCalendar> value) {
        this.targetfinish = value;
    }

    /**
     * Gets the value of the ticketid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTICKETID() {
        return ticketid;
    }

    /**
     * Sets the value of the ticketid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTICKETID(JAXBElement<String> value) {
        this.ticketid = value;
    }

    /**
     * Gets the value of the ticketuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTICKETUID() {
        return ticketuid;
    }

    /**
     * Sets the value of the ticketuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTICKETUID(JAXBElement<String> value) {
        this.ticketuid = value;
    }

    /**
     * Gets the value of the tipprekin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTIPPREKIN() {
        return tipprekin;
    }

    /**
     * Sets the value of the tipprekin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTIPPREKIN(JAXBElement<String> value) {
        this.tipprekin = value;
    }

    /**
     * Gets the value of the tktype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTKTYPE() {
        return tktype;
    }

    /**
     * Sets the value of the tktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTKTYPE(JAXBElement<String> value) {
        this.tktype = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getURGENCY() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setURGENCY(JAXBElement<BigInteger> value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the wayofrepair property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWAYOFREPAIR() {
        return wayofrepair;
    }

    /**
     * Sets the value of the wayofrepair property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWAYOFREPAIR(JAXBElement<String> value) {
        this.wayofrepair = value;
    }

    /**
     * Gets the value of the wocatalog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWOCATALOG() {
        return wocatalog;
    }

    /**
     * Sets the value of the wocatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWOCATALOG(JAXBElement<String> value) {
        this.wocatalog = value;
    }

    /**
     * Gets the value of the workaround property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWORKAROUND() {
        return workaround;
    }

    /**
     * Sets the value of the workaround property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWORKAROUND(JAXBElement<Boolean> value) {
        this.workaround = value;
    }

    /**
     * Gets the value of the workarounddesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWORKAROUNDDESC() {
        return workarounddesc;
    }

    /**
     * Sets the value of the workarounddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWORKAROUNDDESC(JAXBElement<String> value) {
        this.workarounddesc = value;
    }

    /**
     * Gets the value of the affectedservice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AFFECTEDSERVICEArray }{@code >}
     *     
     */
    public JAXBElement<AFFECTEDSERVICEArray> getAFFECTEDSERVICE() {
        return affectedservice;
    }

    /**
     * Sets the value of the affectedservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AFFECTEDSERVICEArray }{@code >}
     *     
     */
    public void setAFFECTEDSERVICE(JAXBElement<AFFECTEDSERVICEArray> value) {
        this.affectedservice = value;
    }

}

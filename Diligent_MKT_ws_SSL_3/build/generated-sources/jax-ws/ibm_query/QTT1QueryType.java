
package ibm_query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QTT1QueryType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QTT1QueryType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="WHERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INCIDENT" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="ACTUALCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ACTUALFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ACTUALSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="AFFECTEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CABLEGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CENTRALA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DEVICENAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="EXTERNALSYSTEM" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="FAULTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="FAULTLOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="GLOBALTICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="IMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="IMSMIGRATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="INDICATEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="INTERNALPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ISGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="KABEL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="KATEGORIJA" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="LINEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="LINISKAOPREMA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="MESTOPOVREDE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="NUMBEROFAFFECTEDCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ORIGINATEDCOMPANY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ORIGINATEDDEVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PAKET" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PRECKAID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="RELATEDTOGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REPORTEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="RESOLVEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="RESOLVER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ROOTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SERVICESINFAULT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SLATIPSERVIS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SOLUTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TARGETCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TARGETFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TIPPREKIN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TKTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="URGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="WAYOFREPAIR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="WOCATALOG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="WORKAROUND" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="WORKAROUNDDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="WORKLOG" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="LOGTYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="MODIFYBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="MODIFYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="WORKLOGID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                           &amp;lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="WORKORDER" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="CANCELREASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="LASTREMARK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="OBJECTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="ORDERAIM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="PLACEOFFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                           &amp;lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="AFFECTEDSERVICE" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                           &amp;lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.ibm.com/maximo}QueryClausePropertyGroup"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTT1QueryType", propOrder = {
    "where",
    "incident"
})
public class QTT1QueryType {

    @XmlElement(name = "WHERE")
    protected String where;
    @XmlElement(name = "INCIDENT")
    protected QTT1QueryType.INCIDENT incident;
    @XmlAttribute(name = "orderby")
    protected String orderby;
    @XmlAttribute(name = "operandMode")
    protected OperandModeType operandMode;

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHERE() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHERE(String value) {
        this.where = value;
    }

    /**
     * Gets the value of the incident property.
     * 
     * @return
     *     possible object is
     *     {@link QTT1QueryType.INCIDENT }
     *     
     */
    public QTT1QueryType.INCIDENT getINCIDENT() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTT1QueryType.INCIDENT }
     *     
     */
    public void setINCIDENT(QTT1QueryType.INCIDENT value) {
        this.incident = value;
    }

    /**
     * Gets the value of the orderby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderby() {
        return orderby;
    }

    /**
     * Sets the value of the orderby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderby(String value) {
        this.orderby = value;
    }

    /**
     * Gets the value of the operandMode property.
     * 
     * @return
     *     possible object is
     *     {@link OperandModeType }
     *     
     */
    public OperandModeType getOperandMode() {
        if (operandMode == null) {
            return OperandModeType.AND;
        } else {
            return operandMode;
        }
    }

    /**
     * Sets the value of the operandMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperandModeType }
     *     
     */
    public void setOperandMode(OperandModeType value) {
        this.operandMode = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="ACTUALCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ACTUALFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ACTUALSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="AFFECTEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CABLEGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CENTRALA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DEVICENAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="EXTERNALSYSTEM" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="FAULTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="FAULTLOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="GLOBALTICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="IMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="IMSMIGRATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="INDICATEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="INTERNALPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ISGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="KABEL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="KATEGORIJA" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="LINEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="LINISKAOPREMA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="MESTOPOVREDE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="NUMBEROFAFFECTEDCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ORIGINATEDCOMPANY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ORIGINATEDDEVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PAKET" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PRECKAID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="RELATEDTOGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REPORTEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="RESOLVEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="RESOLVER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ROOTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SERVICESINFAULT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SLATIPSERVIS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SOLUTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TARGETCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TARGETFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TIPPREKIN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TKTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="URGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="WAYOFREPAIR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="WOCATALOG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="WORKAROUND" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="WORKAROUNDDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="WORKLOG" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="LOGTYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="MODIFYBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="MODIFYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="WORKLOGID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                 &amp;lt;/sequence&amp;gt;
     *                 &amp;lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
     *               &amp;lt;/restriction&amp;gt;
     *             &amp;lt;/complexContent&amp;gt;
     *           &amp;lt;/complexType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="WORKORDER" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="CANCELREASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="LASTREMARK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="OBJECTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="ORDERAIM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="PLACEOFFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                 &amp;lt;/sequence&amp;gt;
     *                 &amp;lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
     *               &amp;lt;/restriction&amp;gt;
     *             &amp;lt;/complexContent&amp;gt;
     *           &amp;lt;/complexType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *         &amp;lt;element name="AFFECTEDSERVICE" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                 &amp;lt;/sequence&amp;gt;
     *                 &amp;lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
     *               &amp;lt;/restriction&amp;gt;
     *             &amp;lt;/complexContent&amp;gt;
     *           &amp;lt;/complexType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
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
    public static class INCIDENT {

        @XmlElement(name = "ACTUALCONTACTDATE", nillable = true)
        protected List<MXDateTimeQueryType> actualcontactdate;
        @XmlElement(name = "ACTUALFINISH", nillable = true)
        protected List<MXDateTimeQueryType> actualfinish;
        @XmlElement(name = "ACTUALSTART", nillable = true)
        protected List<MXDateTimeQueryType> actualstart;
        @XmlElement(name = "ADJUSTEDTARGETCONTACTTIME", nillable = true)
        protected List<MXDateTimeQueryType> adjustedtargetcontacttime;
        @XmlElement(name = "ADJUSTEDTARGETRESOLUTIONTIME", nillable = true)
        protected List<MXDateTimeQueryType> adjustedtargetresolutiontime;
        @XmlElement(name = "AFFECTEDDATE", nillable = true)
        protected List<MXDateTimeQueryType> affecteddate;
        @XmlElement(name = "ASSIGNEDOWNERGROUP")
        protected List<MXStringQueryType> assignedownergroup;
        @XmlElement(name = "CABLEGROUP")
        protected List<MXStringQueryType> cablegroup;
        @XmlElement(name = "CENTRALA")
        protected List<MXStringQueryType> centrala;
        @XmlElement(name = "CINUM")
        protected List<MXStringQueryType> cinum;
        @XmlElement(name = "CLASS")
        protected List<MXDomainQueryType> _class;
        @XmlElement(name = "CLASSIFICATIONID")
        protected List<MXStringQueryType> classificationid;
        @XmlElement(name = "CLASSSTRUCTUREID")
        protected List<MXStringQueryType> classstructureid;
        @XmlElement(name = "DESCRIPTION")
        protected List<MXStringQueryType> description;
        @XmlElement(name = "DEVICENAME")
        protected List<MXStringQueryType> devicename;
        @XmlElement(name = "EXTERNALSYSTEM")
        protected List<MXDomainQueryType> externalsystem;
        @XmlElement(name = "FAULTCAUSE", nillable = true)
        protected List<MXLongQueryType> faultcause;
        @XmlElement(name = "FAULTLOCATION")
        protected List<MXStringQueryType> faultlocation;
        @XmlElement(name = "GLOBALTICKETID")
        protected List<MXStringQueryType> globalticketid;
        @XmlElement(name = "HISTORYFLAG")
        protected List<MXBooleanQueryType> historyflag;
        @XmlElement(name = "IMPACT", nillable = true)
        protected List<MXLongQueryType> impact;
        @XmlElement(name = "IMSMIGRATION")
        protected List<MXStringQueryType> imsmigration;
        @XmlElement(name = "INDICATEDPRIORITY", nillable = true)
        protected List<MXLongQueryType> indicatedpriority;
        @XmlElement(name = "INTERNALPRIORITY", nillable = true)
        protected List<MXLongQueryType> internalpriority;
        @XmlElement(name = "ISGLOBAL")
        protected List<MXBooleanQueryType> isglobal;
        @XmlElement(name = "KABEL")
        protected List<MXStringQueryType> kabel;
        @XmlElement(name = "KATEGORIJA", nillable = true)
        protected List<MXLongQueryType> kategorija;
        @XmlElement(name = "LINEID")
        protected List<MXStringQueryType> lineid;
        @XmlElement(name = "LINISKAOPREMA")
        protected List<MXStringQueryType> liniskaoprema;
        @XmlElement(name = "LOCATION")
        protected List<MXStringQueryType> location;
        @XmlElement(name = "MESTOPOVREDE")
        protected List<MXStringQueryType> mestopovrede;
        @XmlElement(name = "NUMBEROFAFFECTEDCUSTOMERS", nillable = true)
        protected List<MXLongQueryType> numberofaffectedcustomers;
        @XmlElement(name = "ORIGINATEDCOMPANY")
        protected List<MXStringQueryType> originatedcompany;
        @XmlElement(name = "ORIGINATEDDEVICE")
        protected List<MXStringQueryType> originateddevice;
        @XmlElement(name = "OWNER")
        protected List<MXStringQueryType> owner;
        @XmlElement(name = "OWNERGROUP")
        protected List<MXStringQueryType> ownergroup;
        @XmlElement(name = "PAKET")
        protected List<MXStringQueryType> paket;
        @XmlElement(name = "PRECKAID")
        protected List<MXStringQueryType> preckaid;
        @XmlElement(name = "REASON")
        protected List<MXStringQueryType> reason;
        @XmlElement(name = "REGIONNAME")
        protected List<MXStringQueryType> regionname;
        @XmlElement(name = "RELATEDTOGLOBAL")
        protected List<MXBooleanQueryType> relatedtoglobal;
        @XmlElement(name = "REPORTDATE", nillable = true)
        protected List<MXDateTimeQueryType> reportdate;
        @XmlElement(name = "REPORTEDBY")
        protected List<MXStringQueryType> reportedby;
        @XmlElement(name = "REPORTEDPRIORITY", nillable = true)
        protected List<MXLongQueryType> reportedpriority;
        @XmlElement(name = "RESOLVEDBY")
        protected List<MXStringQueryType> resolvedby;
        @XmlElement(name = "RESOLVER")
        protected List<MXStringQueryType> resolver;
        @XmlElement(name = "ROOTCAUSE", nillable = true)
        protected List<MXLongQueryType> rootcause;
        @XmlElement(name = "SERVICESINFAULT", nillable = true)
        protected List<MXLongQueryType> servicesinfault;
        @XmlElement(name = "SLATIPSERVIS")
        protected List<MXStringQueryType> slatipservis;
        @XmlElement(name = "SOLUTION")
        protected List<MXStringQueryType> solution;
        @XmlElement(name = "STATUS")
        protected List<MXDomainQueryType> status;
        @XmlElement(name = "STATUSDATE", nillable = true)
        protected List<MXDateTimeQueryType> statusdate;
        @XmlElement(name = "TARGETCONTACTDATE", nillable = true)
        protected List<MXDateTimeQueryType> targetcontactdate;
        @XmlElement(name = "TARGETFINISH", nillable = true)
        protected List<MXDateTimeQueryType> targetfinish;
        @XmlElement(name = "TICKETID")
        protected List<MXStringQueryType> ticketid;
        @XmlElement(name = "TICKETUID", nillable = true)
        protected List<MXLongQueryType> ticketuid;
        @XmlElement(name = "TIPPREKIN")
        protected List<MXStringQueryType> tipprekin;
        @XmlElement(name = "TKTYPE")
        protected List<MXStringQueryType> tktype;
        @XmlElement(name = "URGENCY", nillable = true)
        protected List<MXLongQueryType> urgency;
        @XmlElement(name = "WAYOFREPAIR", nillable = true)
        protected List<MXLongQueryType> wayofrepair;
        @XmlElement(name = "WOCATALOG")
        protected List<MXStringQueryType> wocatalog;
        @XmlElement(name = "WORKAROUND")
        protected List<MXBooleanQueryType> workaround;
        @XmlElement(name = "WORKAROUNDDESC")
        protected List<MXStringQueryType> workarounddesc;
        @XmlElement(name = "WORKLOG")
        protected QTT1QueryType.INCIDENT.WORKLOG worklog;
        @XmlElement(name = "WORKORDER")
        protected QTT1QueryType.INCIDENT.WORKORDER workorder;
        @XmlElement(name = "AFFECTEDSERVICE")
        protected QTT1QueryType.INCIDENT.AFFECTEDSERVICE affectedservice;

        /**
         * Gets the value of the actualcontactdate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the actualcontactdate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getACTUALCONTACTDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getACTUALCONTACTDATE() {
            if (actualcontactdate == null) {
                actualcontactdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.actualcontactdate;
        }

        /**
         * Gets the value of the actualfinish property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the actualfinish property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getACTUALFINISH().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getACTUALFINISH() {
            if (actualfinish == null) {
                actualfinish = new ArrayList<MXDateTimeQueryType>();
            }
            return this.actualfinish;
        }

        /**
         * Gets the value of the actualstart property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the actualstart property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getACTUALSTART().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getACTUALSTART() {
            if (actualstart == null) {
                actualstart = new ArrayList<MXDateTimeQueryType>();
            }
            return this.actualstart;
        }

        /**
         * Gets the value of the adjustedtargetcontacttime property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the adjustedtargetcontacttime property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getADJUSTEDTARGETCONTACTTIME().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getADJUSTEDTARGETCONTACTTIME() {
            if (adjustedtargetcontacttime == null) {
                adjustedtargetcontacttime = new ArrayList<MXDateTimeQueryType>();
            }
            return this.adjustedtargetcontacttime;
        }

        /**
         * Gets the value of the adjustedtargetresolutiontime property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the adjustedtargetresolutiontime property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getADJUSTEDTARGETRESOLUTIONTIME().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getADJUSTEDTARGETRESOLUTIONTIME() {
            if (adjustedtargetresolutiontime == null) {
                adjustedtargetresolutiontime = new ArrayList<MXDateTimeQueryType>();
            }
            return this.adjustedtargetresolutiontime;
        }

        /**
         * Gets the value of the affecteddate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the affecteddate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getAFFECTEDDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getAFFECTEDDATE() {
            if (affecteddate == null) {
                affecteddate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.affecteddate;
        }

        /**
         * Gets the value of the assignedownergroup property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the assignedownergroup property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getASSIGNEDOWNERGROUP().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getASSIGNEDOWNERGROUP() {
            if (assignedownergroup == null) {
                assignedownergroup = new ArrayList<MXStringQueryType>();
            }
            return this.assignedownergroup;
        }

        /**
         * Gets the value of the cablegroup property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the cablegroup property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCABLEGROUP().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCABLEGROUP() {
            if (cablegroup == null) {
                cablegroup = new ArrayList<MXStringQueryType>();
            }
            return this.cablegroup;
        }

        /**
         * Gets the value of the centrala property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the centrala property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCENTRALA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCENTRALA() {
            if (centrala == null) {
                centrala = new ArrayList<MXStringQueryType>();
            }
            return this.centrala;
        }

        /**
         * Gets the value of the cinum property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the cinum property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCINUM().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCINUM() {
            if (cinum == null) {
                cinum = new ArrayList<MXStringQueryType>();
            }
            return this.cinum;
        }

        /**
         * Gets the value of the class property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the class property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCLASS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getCLASS() {
            if (_class == null) {
                _class = new ArrayList<MXDomainQueryType>();
            }
            return this._class;
        }

        /**
         * Gets the value of the classificationid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the classificationid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCLASSIFICATIONID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCLASSIFICATIONID() {
            if (classificationid == null) {
                classificationid = new ArrayList<MXStringQueryType>();
            }
            return this.classificationid;
        }

        /**
         * Gets the value of the classstructureid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the classstructureid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCLASSSTRUCTUREID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCLASSSTRUCTUREID() {
            if (classstructureid == null) {
                classstructureid = new ArrayList<MXStringQueryType>();
            }
            return this.classstructureid;
        }

        /**
         * Gets the value of the description property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the description property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDESCRIPTION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDESCRIPTION() {
            if (description == null) {
                description = new ArrayList<MXStringQueryType>();
            }
            return this.description;
        }

        /**
         * Gets the value of the devicename property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the devicename property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDEVICENAME().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDEVICENAME() {
            if (devicename == null) {
                devicename = new ArrayList<MXStringQueryType>();
            }
            return this.devicename;
        }

        /**
         * Gets the value of the externalsystem property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the externalsystem property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getEXTERNALSYSTEM().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getEXTERNALSYSTEM() {
            if (externalsystem == null) {
                externalsystem = new ArrayList<MXDomainQueryType>();
            }
            return this.externalsystem;
        }

        /**
         * Gets the value of the faultcause property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the faultcause property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getFAULTCAUSE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getFAULTCAUSE() {
            if (faultcause == null) {
                faultcause = new ArrayList<MXLongQueryType>();
            }
            return this.faultcause;
        }

        /**
         * Gets the value of the faultlocation property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the faultlocation property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getFAULTLOCATION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getFAULTLOCATION() {
            if (faultlocation == null) {
                faultlocation = new ArrayList<MXStringQueryType>();
            }
            return this.faultlocation;
        }

        /**
         * Gets the value of the globalticketid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the globalticketid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getGLOBALTICKETID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getGLOBALTICKETID() {
            if (globalticketid == null) {
                globalticketid = new ArrayList<MXStringQueryType>();
            }
            return this.globalticketid;
        }

        /**
         * Gets the value of the historyflag property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the historyflag property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getHISTORYFLAG().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getHISTORYFLAG() {
            if (historyflag == null) {
                historyflag = new ArrayList<MXBooleanQueryType>();
            }
            return this.historyflag;
        }

        /**
         * Gets the value of the impact property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the impact property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getIMPACT().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getIMPACT() {
            if (impact == null) {
                impact = new ArrayList<MXLongQueryType>();
            }
            return this.impact;
        }

        /**
         * Gets the value of the imsmigration property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the imsmigration property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getIMSMIGRATION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getIMSMIGRATION() {
            if (imsmigration == null) {
                imsmigration = new ArrayList<MXStringQueryType>();
            }
            return this.imsmigration;
        }

        /**
         * Gets the value of the indicatedpriority property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the indicatedpriority property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getINDICATEDPRIORITY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINDICATEDPRIORITY() {
            if (indicatedpriority == null) {
                indicatedpriority = new ArrayList<MXLongQueryType>();
            }
            return this.indicatedpriority;
        }

        /**
         * Gets the value of the internalpriority property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the internalpriority property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getINTERNALPRIORITY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINTERNALPRIORITY() {
            if (internalpriority == null) {
                internalpriority = new ArrayList<MXLongQueryType>();
            }
            return this.internalpriority;
        }

        /**
         * Gets the value of the isglobal property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the isglobal property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getISGLOBAL().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getISGLOBAL() {
            if (isglobal == null) {
                isglobal = new ArrayList<MXBooleanQueryType>();
            }
            return this.isglobal;
        }

        /**
         * Gets the value of the kabel property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the kabel property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getKABEL().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getKABEL() {
            if (kabel == null) {
                kabel = new ArrayList<MXStringQueryType>();
            }
            return this.kabel;
        }

        /**
         * Gets the value of the kategorija property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the kategorija property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getKATEGORIJA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getKATEGORIJA() {
            if (kategorija == null) {
                kategorija = new ArrayList<MXLongQueryType>();
            }
            return this.kategorija;
        }

        /**
         * Gets the value of the lineid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the lineid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getLINEID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLINEID() {
            if (lineid == null) {
                lineid = new ArrayList<MXStringQueryType>();
            }
            return this.lineid;
        }

        /**
         * Gets the value of the liniskaoprema property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the liniskaoprema property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getLINISKAOPREMA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLINISKAOPREMA() {
            if (liniskaoprema == null) {
                liniskaoprema = new ArrayList<MXStringQueryType>();
            }
            return this.liniskaoprema;
        }

        /**
         * Gets the value of the location property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the location property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getLOCATION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLOCATION() {
            if (location == null) {
                location = new ArrayList<MXStringQueryType>();
            }
            return this.location;
        }

        /**
         * Gets the value of the mestopovrede property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the mestopovrede property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getMESTOPOVREDE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getMESTOPOVREDE() {
            if (mestopovrede == null) {
                mestopovrede = new ArrayList<MXStringQueryType>();
            }
            return this.mestopovrede;
        }

        /**
         * Gets the value of the numberofaffectedcustomers property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numberofaffectedcustomers property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getNUMBEROFAFFECTEDCUSTOMERS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getNUMBEROFAFFECTEDCUSTOMERS() {
            if (numberofaffectedcustomers == null) {
                numberofaffectedcustomers = new ArrayList<MXLongQueryType>();
            }
            return this.numberofaffectedcustomers;
        }

        /**
         * Gets the value of the originatedcompany property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the originatedcompany property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getORIGINATEDCOMPANY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getORIGINATEDCOMPANY() {
            if (originatedcompany == null) {
                originatedcompany = new ArrayList<MXStringQueryType>();
            }
            return this.originatedcompany;
        }

        /**
         * Gets the value of the originateddevice property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the originateddevice property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getORIGINATEDDEVICE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getORIGINATEDDEVICE() {
            if (originateddevice == null) {
                originateddevice = new ArrayList<MXStringQueryType>();
            }
            return this.originateddevice;
        }

        /**
         * Gets the value of the owner property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the owner property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getOWNER().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getOWNER() {
            if (owner == null) {
                owner = new ArrayList<MXStringQueryType>();
            }
            return this.owner;
        }

        /**
         * Gets the value of the ownergroup property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ownergroup property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getOWNERGROUP().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getOWNERGROUP() {
            if (ownergroup == null) {
                ownergroup = new ArrayList<MXStringQueryType>();
            }
            return this.ownergroup;
        }

        /**
         * Gets the value of the paket property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the paket property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPAKET().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPAKET() {
            if (paket == null) {
                paket = new ArrayList<MXStringQueryType>();
            }
            return this.paket;
        }

        /**
         * Gets the value of the preckaid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the preckaid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPRECKAID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPRECKAID() {
            if (preckaid == null) {
                preckaid = new ArrayList<MXStringQueryType>();
            }
            return this.preckaid;
        }

        /**
         * Gets the value of the reason property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the reason property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getREASON().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREASON() {
            if (reason == null) {
                reason = new ArrayList<MXStringQueryType>();
            }
            return this.reason;
        }

        /**
         * Gets the value of the regionname property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the regionname property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getREGIONNAME().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREGIONNAME() {
            if (regionname == null) {
                regionname = new ArrayList<MXStringQueryType>();
            }
            return this.regionname;
        }

        /**
         * Gets the value of the relatedtoglobal property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the relatedtoglobal property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getRELATEDTOGLOBAL().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getRELATEDTOGLOBAL() {
            if (relatedtoglobal == null) {
                relatedtoglobal = new ArrayList<MXBooleanQueryType>();
            }
            return this.relatedtoglobal;
        }

        /**
         * Gets the value of the reportdate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the reportdate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getREPORTDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getREPORTDATE() {
            if (reportdate == null) {
                reportdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.reportdate;
        }

        /**
         * Gets the value of the reportedby property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the reportedby property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getREPORTEDBY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREPORTEDBY() {
            if (reportedby == null) {
                reportedby = new ArrayList<MXStringQueryType>();
            }
            return this.reportedby;
        }

        /**
         * Gets the value of the reportedpriority property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the reportedpriority property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getREPORTEDPRIORITY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getREPORTEDPRIORITY() {
            if (reportedpriority == null) {
                reportedpriority = new ArrayList<MXLongQueryType>();
            }
            return this.reportedpriority;
        }

        /**
         * Gets the value of the resolvedby property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the resolvedby property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getRESOLVEDBY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getRESOLVEDBY() {
            if (resolvedby == null) {
                resolvedby = new ArrayList<MXStringQueryType>();
            }
            return this.resolvedby;
        }

        /**
         * Gets the value of the resolver property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the resolver property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getRESOLVER().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getRESOLVER() {
            if (resolver == null) {
                resolver = new ArrayList<MXStringQueryType>();
            }
            return this.resolver;
        }

        /**
         * Gets the value of the rootcause property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rootcause property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getROOTCAUSE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getROOTCAUSE() {
            if (rootcause == null) {
                rootcause = new ArrayList<MXLongQueryType>();
            }
            return this.rootcause;
        }

        /**
         * Gets the value of the servicesinfault property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the servicesinfault property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSERVICESINFAULT().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getSERVICESINFAULT() {
            if (servicesinfault == null) {
                servicesinfault = new ArrayList<MXLongQueryType>();
            }
            return this.servicesinfault;
        }

        /**
         * Gets the value of the slatipservis property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the slatipservis property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSLATIPSERVIS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSLATIPSERVIS() {
            if (slatipservis == null) {
                slatipservis = new ArrayList<MXStringQueryType>();
            }
            return this.slatipservis;
        }

        /**
         * Gets the value of the solution property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the solution property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSOLUTION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSOLUTION() {
            if (solution == null) {
                solution = new ArrayList<MXStringQueryType>();
            }
            return this.solution;
        }

        /**
         * Gets the value of the status property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the status property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSTATUS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getSTATUS() {
            if (status == null) {
                status = new ArrayList<MXDomainQueryType>();
            }
            return this.status;
        }

        /**
         * Gets the value of the statusdate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the statusdate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSTATUSDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getSTATUSDATE() {
            if (statusdate == null) {
                statusdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.statusdate;
        }

        /**
         * Gets the value of the targetcontactdate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the targetcontactdate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTARGETCONTACTDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getTARGETCONTACTDATE() {
            if (targetcontactdate == null) {
                targetcontactdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.targetcontactdate;
        }

        /**
         * Gets the value of the targetfinish property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the targetfinish property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTARGETFINISH().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getTARGETFINISH() {
            if (targetfinish == null) {
                targetfinish = new ArrayList<MXDateTimeQueryType>();
            }
            return this.targetfinish;
        }

        /**
         * Gets the value of the ticketid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ticketid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTICKETID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTICKETID() {
            if (ticketid == null) {
                ticketid = new ArrayList<MXStringQueryType>();
            }
            return this.ticketid;
        }

        /**
         * Gets the value of the ticketuid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ticketuid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTICKETUID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getTICKETUID() {
            if (ticketuid == null) {
                ticketuid = new ArrayList<MXLongQueryType>();
            }
            return this.ticketuid;
        }

        /**
         * Gets the value of the tipprekin property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tipprekin property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTIPPREKIN().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTIPPREKIN() {
            if (tipprekin == null) {
                tipprekin = new ArrayList<MXStringQueryType>();
            }
            return this.tipprekin;
        }

        /**
         * Gets the value of the tktype property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tktype property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTKTYPE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTKTYPE() {
            if (tktype == null) {
                tktype = new ArrayList<MXStringQueryType>();
            }
            return this.tktype;
        }

        /**
         * Gets the value of the urgency property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the urgency property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getURGENCY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getURGENCY() {
            if (urgency == null) {
                urgency = new ArrayList<MXLongQueryType>();
            }
            return this.urgency;
        }

        /**
         * Gets the value of the wayofrepair property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the wayofrepair property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getWAYOFREPAIR().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getWAYOFREPAIR() {
            if (wayofrepair == null) {
                wayofrepair = new ArrayList<MXLongQueryType>();
            }
            return this.wayofrepair;
        }

        /**
         * Gets the value of the wocatalog property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the wocatalog property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getWOCATALOG().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWOCATALOG() {
            if (wocatalog == null) {
                wocatalog = new ArrayList<MXStringQueryType>();
            }
            return this.wocatalog;
        }

        /**
         * Gets the value of the workaround property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the workaround property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getWORKAROUND().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getWORKAROUND() {
            if (workaround == null) {
                workaround = new ArrayList<MXBooleanQueryType>();
            }
            return this.workaround;
        }

        /**
         * Gets the value of the workarounddesc property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the workarounddesc property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getWORKAROUNDDESC().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getWORKAROUNDDESC() {
            if (workarounddesc == null) {
                workarounddesc = new ArrayList<MXStringQueryType>();
            }
            return this.workarounddesc;
        }

        /**
         * Gets the value of the worklog property.
         * 
         * @return
         *     possible object is
         *     {@link QTT1QueryType.INCIDENT.WORKLOG }
         *     
         */
        public QTT1QueryType.INCIDENT.WORKLOG getWORKLOG() {
            return worklog;
        }

        /**
         * Sets the value of the worklog property.
         * 
         * @param value
         *     allowed object is
         *     {@link QTT1QueryType.INCIDENT.WORKLOG }
         *     
         */
        public void setWORKLOG(QTT1QueryType.INCIDENT.WORKLOG value) {
            this.worklog = value;
        }

        /**
         * Gets the value of the workorder property.
         * 
         * @return
         *     possible object is
         *     {@link QTT1QueryType.INCIDENT.WORKORDER }
         *     
         */
        public QTT1QueryType.INCIDENT.WORKORDER getWORKORDER() {
            return workorder;
        }

        /**
         * Sets the value of the workorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link QTT1QueryType.INCIDENT.WORKORDER }
         *     
         */
        public void setWORKORDER(QTT1QueryType.INCIDENT.WORKORDER value) {
            this.workorder = value;
        }

        /**
         * Gets the value of the affectedservice property.
         * 
         * @return
         *     possible object is
         *     {@link QTT1QueryType.INCIDENT.AFFECTEDSERVICE }
         *     
         */
        public QTT1QueryType.INCIDENT.AFFECTEDSERVICE getAFFECTEDSERVICE() {
            return affectedservice;
        }

        /**
         * Sets the value of the affectedservice property.
         * 
         * @param value
         *     allowed object is
         *     {@link QTT1QueryType.INCIDENT.AFFECTEDSERVICE }
         *     
         */
        public void setAFFECTEDSERVICE(QTT1QueryType.INCIDENT.AFFECTEDSERVICE value) {
            this.affectedservice = value;
        }


        /**
         * &lt;p&gt;Java class for anonymous complex type.
         * 
         * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
         * 
         * &lt;pre&gt;
         * &amp;lt;complexType&amp;gt;
         *   &amp;lt;complexContent&amp;gt;
         *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *       &amp;lt;sequence&amp;gt;
         *         &amp;lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *       &amp;lt;/sequence&amp;gt;
         *       &amp;lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
         *     &amp;lt;/restriction&amp;gt;
         *   &amp;lt;/complexContent&amp;gt;
         * &amp;lt;/complexType&amp;gt;
         * &lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
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
        public static class AFFECTEDSERVICE {

            @XmlElement(name = "AFFECTEDSERVICEID", nillable = true)
            protected List<MXLongQueryType> affectedserviceid;
            @XmlElement(name = "CHANGEDATE", nillable = true)
            protected List<MXDateTimeQueryType> changedate;
            @XmlElement(name = "CINUM")
            protected List<MXStringQueryType> cinum;
            @XmlElement(name = "DELETEFLAG")
            protected List<MXBooleanQueryType> deleteflag;
            @XmlElement(name = "DESCRIPTION")
            protected List<MXStringQueryType> description;
            @XmlElement(name = "ENDDATE", nillable = true)
            protected List<MXDateTimeQueryType> enddate;
            @XmlElement(name = "EQUIPMENTTYPE")
            protected List<MXStringQueryType> equipmenttype;
            @XmlElement(name = "LOCATION")
            protected List<MXStringQueryType> location;
            @XmlElement(name = "NUMADSL", nillable = true)
            protected List<MXLongQueryType> numadsl;
            @XmlElement(name = "NUMINTERNET", nillable = true)
            protected List<MXLongQueryType> numinternet;
            @XmlElement(name = "NUMIPTV", nillable = true)
            protected List<MXLongQueryType> numiptv;
            @XmlElement(name = "NUMOFIMPACTEDCUST", nillable = true)
            protected List<MXLongQueryType> numofimpactedcust;
            @XmlElement(name = "NUMVOIP", nillable = true)
            protected List<MXLongQueryType> numvoip;
            @XmlElement(name = "NUMWLR", nillable = true)
            protected List<MXLongQueryType> numwlr;
            @XmlElement(name = "ONETMID")
            protected List<MXStringQueryType> onetmid;
            @XmlElement(name = "REGION")
            protected List<MXStringQueryType> region;
            @XmlElement(name = "SERVICEINFAULT")
            protected List<MXStringQueryType> serviceinfault;
            @XmlElement(name = "STARTDATE", nillable = true)
            protected List<MXDateTimeQueryType> startdate;
            @XmlElement(name = "SYSSTATUS")
            protected List<MXStringQueryType> sysstatus;
            @XmlAttribute(name = "filter")
            protected Boolean filter;

            /**
             * Gets the value of the affectedserviceid property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the affectedserviceid property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getAFFECTEDSERVICEID().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getAFFECTEDSERVICEID() {
                if (affectedserviceid == null) {
                    affectedserviceid = new ArrayList<MXLongQueryType>();
                }
                return this.affectedserviceid;
            }

            /**
             * Gets the value of the changedate property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the changedate property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getCHANGEDATE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getCHANGEDATE() {
                if (changedate == null) {
                    changedate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.changedate;
            }

            /**
             * Gets the value of the cinum property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the cinum property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getCINUM().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getCINUM() {
                if (cinum == null) {
                    cinum = new ArrayList<MXStringQueryType>();
                }
                return this.cinum;
            }

            /**
             * Gets the value of the deleteflag property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the deleteflag property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getDELETEFLAG().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getDELETEFLAG() {
                if (deleteflag == null) {
                    deleteflag = new ArrayList<MXBooleanQueryType>();
                }
                return this.deleteflag;
            }

            /**
             * Gets the value of the description property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the description property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getDESCRIPTION().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getDESCRIPTION() {
                if (description == null) {
                    description = new ArrayList<MXStringQueryType>();
                }
                return this.description;
            }

            /**
             * Gets the value of the enddate property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the enddate property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getENDDATE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getENDDATE() {
                if (enddate == null) {
                    enddate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.enddate;
            }

            /**
             * Gets the value of the equipmenttype property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the equipmenttype property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getEQUIPMENTTYPE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getEQUIPMENTTYPE() {
                if (equipmenttype == null) {
                    equipmenttype = new ArrayList<MXStringQueryType>();
                }
                return this.equipmenttype;
            }

            /**
             * Gets the value of the location property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the location property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getLOCATION().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getLOCATION() {
                if (location == null) {
                    location = new ArrayList<MXStringQueryType>();
                }
                return this.location;
            }

            /**
             * Gets the value of the numadsl property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numadsl property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getNUMADSL().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getNUMADSL() {
                if (numadsl == null) {
                    numadsl = new ArrayList<MXLongQueryType>();
                }
                return this.numadsl;
            }

            /**
             * Gets the value of the numinternet property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numinternet property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getNUMINTERNET().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getNUMINTERNET() {
                if (numinternet == null) {
                    numinternet = new ArrayList<MXLongQueryType>();
                }
                return this.numinternet;
            }

            /**
             * Gets the value of the numiptv property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numiptv property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getNUMIPTV().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getNUMIPTV() {
                if (numiptv == null) {
                    numiptv = new ArrayList<MXLongQueryType>();
                }
                return this.numiptv;
            }

            /**
             * Gets the value of the numofimpactedcust property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numofimpactedcust property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getNUMOFIMPACTEDCUST().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getNUMOFIMPACTEDCUST() {
                if (numofimpactedcust == null) {
                    numofimpactedcust = new ArrayList<MXLongQueryType>();
                }
                return this.numofimpactedcust;
            }

            /**
             * Gets the value of the numvoip property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numvoip property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getNUMVOIP().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getNUMVOIP() {
                if (numvoip == null) {
                    numvoip = new ArrayList<MXLongQueryType>();
                }
                return this.numvoip;
            }

            /**
             * Gets the value of the numwlr property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numwlr property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getNUMWLR().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getNUMWLR() {
                if (numwlr == null) {
                    numwlr = new ArrayList<MXLongQueryType>();
                }
                return this.numwlr;
            }

            /**
             * Gets the value of the onetmid property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the onetmid property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getONETMID().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getONETMID() {
                if (onetmid == null) {
                    onetmid = new ArrayList<MXStringQueryType>();
                }
                return this.onetmid;
            }

            /**
             * Gets the value of the region property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the region property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getREGION().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getREGION() {
                if (region == null) {
                    region = new ArrayList<MXStringQueryType>();
                }
                return this.region;
            }

            /**
             * Gets the value of the serviceinfault property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the serviceinfault property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getSERVICEINFAULT().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getSERVICEINFAULT() {
                if (serviceinfault == null) {
                    serviceinfault = new ArrayList<MXStringQueryType>();
                }
                return this.serviceinfault;
            }

            /**
             * Gets the value of the startdate property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the startdate property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getSTARTDATE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getSTARTDATE() {
                if (startdate == null) {
                    startdate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.startdate;
            }

            /**
             * Gets the value of the sysstatus property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sysstatus property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getSYSSTATUS().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getSYSSTATUS() {
                if (sysstatus == null) {
                    sysstatus = new ArrayList<MXStringQueryType>();
                }
                return this.sysstatus;
            }

            /**
             * Gets the value of the filter property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFilter() {
                return filter;
            }

            /**
             * Sets the value of the filter property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFilter(Boolean value) {
                this.filter = value;
            }

        }


        /**
         * &lt;p&gt;Java class for anonymous complex type.
         * 
         * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
         * 
         * &lt;pre&gt;
         * &amp;lt;complexType&amp;gt;
         *   &amp;lt;complexContent&amp;gt;
         *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *       &amp;lt;sequence&amp;gt;
         *         &amp;lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="LOGTYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="MODIFYBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="MODIFYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="WORKLOGID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *       &amp;lt;/sequence&amp;gt;
         *       &amp;lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
         *     &amp;lt;/restriction&amp;gt;
         *   &amp;lt;/complexContent&amp;gt;
         * &amp;lt;/complexType&amp;gt;
         * &lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "createby",
            "createdate",
            "description",
            "logtype",
            "modifyby",
            "modifydate",
            "orgid",
            "worklogid"
        })
        public static class WORKLOG {

            @XmlElement(name = "CREATEBY")
            protected List<MXStringQueryType> createby;
            @XmlElement(name = "CREATEDATE", nillable = true)
            protected List<MXDateTimeQueryType> createdate;
            @XmlElement(name = "DESCRIPTION")
            protected List<MXStringQueryType> description;
            @XmlElement(name = "LOGTYPE")
            protected List<MXDomainQueryType> logtype;
            @XmlElement(name = "MODIFYBY")
            protected List<MXStringQueryType> modifyby;
            @XmlElement(name = "MODIFYDATE", nillable = true)
            protected List<MXDateTimeQueryType> modifydate;
            @XmlElement(name = "ORGID")
            protected List<MXStringQueryType> orgid;
            @XmlElement(name = "WORKLOGID", nillable = true)
            protected List<MXLongQueryType> worklogid;
            @XmlAttribute(name = "filter")
            protected Boolean filter;

            /**
             * Gets the value of the createby property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the createby property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getCREATEBY().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getCREATEBY() {
                if (createby == null) {
                    createby = new ArrayList<MXStringQueryType>();
                }
                return this.createby;
            }

            /**
             * Gets the value of the createdate property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the createdate property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getCREATEDATE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getCREATEDATE() {
                if (createdate == null) {
                    createdate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.createdate;
            }

            /**
             * Gets the value of the description property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the description property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getDESCRIPTION().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getDESCRIPTION() {
                if (description == null) {
                    description = new ArrayList<MXStringQueryType>();
                }
                return this.description;
            }

            /**
             * Gets the value of the logtype property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the logtype property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getLOGTYPE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDomainQueryType }
             * 
             * 
             */
            public List<MXDomainQueryType> getLOGTYPE() {
                if (logtype == null) {
                    logtype = new ArrayList<MXDomainQueryType>();
                }
                return this.logtype;
            }

            /**
             * Gets the value of the modifyby property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the modifyby property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getMODIFYBY().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getMODIFYBY() {
                if (modifyby == null) {
                    modifyby = new ArrayList<MXStringQueryType>();
                }
                return this.modifyby;
            }

            /**
             * Gets the value of the modifydate property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the modifydate property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getMODIFYDATE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getMODIFYDATE() {
                if (modifydate == null) {
                    modifydate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.modifydate;
            }

            /**
             * Gets the value of the orgid property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the orgid property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getORGID().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getORGID() {
                if (orgid == null) {
                    orgid = new ArrayList<MXStringQueryType>();
                }
                return this.orgid;
            }

            /**
             * Gets the value of the worklogid property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the worklogid property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getWORKLOGID().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getWORKLOGID() {
                if (worklogid == null) {
                    worklogid = new ArrayList<MXLongQueryType>();
                }
                return this.worklogid;
            }

            /**
             * Gets the value of the filter property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFilter() {
                return filter;
            }

            /**
             * Sets the value of the filter property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFilter(Boolean value) {
                this.filter = value;
            }

        }


        /**
         * &lt;p&gt;Java class for anonymous complex type.
         * 
         * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
         * 
         * &lt;pre&gt;
         * &amp;lt;complexType&amp;gt;
         *   &amp;lt;complexContent&amp;gt;
         *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *       &amp;lt;sequence&amp;gt;
         *         &amp;lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="CANCELREASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="LASTREMARK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="OBJECTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="ORDERAIM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="PLACEOFFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *       &amp;lt;/sequence&amp;gt;
         *       &amp;lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
         *     &amp;lt;/restriction&amp;gt;
         *   &amp;lt;/complexContent&amp;gt;
         * &amp;lt;/complexType&amp;gt;
         * &lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
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
        public static class WORKORDER {

            @XmlElement(name = "ACTFINISH", nillable = true)
            protected List<MXDateTimeQueryType> actfinish;
            @XmlElement(name = "ACTSTART", nillable = true)
            protected List<MXDateTimeQueryType> actstart;
            @XmlElement(name = "CANCELREASON")
            protected List<MXStringQueryType> cancelreason;
            @XmlElement(name = "CREATEDATE", nillable = true)
            protected List<MXDateTimeQueryType> createdate;
            @XmlElement(name = "CREATEDBY")
            protected List<MXStringQueryType> createdby;
            @XmlElement(name = "DESCRIPTION")
            protected List<MXStringQueryType> description;
            @XmlElement(name = "EXTERNALREFID")
            protected List<MXStringQueryType> externalrefid;
            @XmlElement(name = "HISTORYFLAG")
            protected List<MXBooleanQueryType> historyflag;
            @XmlElement(name = "LASTREMARK")
            protected List<MXStringQueryType> lastremark;
            @XmlElement(name = "OBJECTTYPE")
            protected List<MXStringQueryType> objecttype;
            @XmlElement(name = "ORDERAIM")
            protected List<MXStringQueryType> orderaim;
            @XmlElement(name = "ORIGRECORDID")
            protected List<MXStringQueryType> origrecordid;
            @XmlElement(name = "OWNER")
            protected List<MXStringQueryType> owner;
            @XmlElement(name = "PLACEOFFAULT")
            protected List<MXStringQueryType> placeoffault;
            @XmlElement(name = "REGIONNAME")
            protected List<MXStringQueryType> regionname;
            @XmlElement(name = "REPORTDATE", nillable = true)
            protected List<MXDateTimeQueryType> reportdate;
            @XmlElement(name = "SITEID")
            protected List<MXStringQueryType> siteid;
            @XmlElement(name = "STATUS")
            protected List<MXDomainQueryType> status;
            @XmlElement(name = "STATUSDATE", nillable = true)
            protected List<MXDateTimeQueryType> statusdate;
            @XmlElement(name = "WONUM")
            protected List<MXStringQueryType> wonum;
            @XmlElement(name = "WORKORDERID", nillable = true)
            protected List<MXLongQueryType> workorderid;
            @XmlAttribute(name = "filter")
            protected Boolean filter;

            /**
             * Gets the value of the actfinish property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the actfinish property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getACTFINISH().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getACTFINISH() {
                if (actfinish == null) {
                    actfinish = new ArrayList<MXDateTimeQueryType>();
                }
                return this.actfinish;
            }

            /**
             * Gets the value of the actstart property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the actstart property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getACTSTART().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getACTSTART() {
                if (actstart == null) {
                    actstart = new ArrayList<MXDateTimeQueryType>();
                }
                return this.actstart;
            }

            /**
             * Gets the value of the cancelreason property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the cancelreason property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getCANCELREASON().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getCANCELREASON() {
                if (cancelreason == null) {
                    cancelreason = new ArrayList<MXStringQueryType>();
                }
                return this.cancelreason;
            }

            /**
             * Gets the value of the createdate property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the createdate property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getCREATEDATE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getCREATEDATE() {
                if (createdate == null) {
                    createdate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.createdate;
            }

            /**
             * Gets the value of the createdby property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the createdby property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getCREATEDBY().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getCREATEDBY() {
                if (createdby == null) {
                    createdby = new ArrayList<MXStringQueryType>();
                }
                return this.createdby;
            }

            /**
             * Gets the value of the description property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the description property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getDESCRIPTION().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getDESCRIPTION() {
                if (description == null) {
                    description = new ArrayList<MXStringQueryType>();
                }
                return this.description;
            }

            /**
             * Gets the value of the externalrefid property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the externalrefid property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getEXTERNALREFID().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getEXTERNALREFID() {
                if (externalrefid == null) {
                    externalrefid = new ArrayList<MXStringQueryType>();
                }
                return this.externalrefid;
            }

            /**
             * Gets the value of the historyflag property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the historyflag property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getHISTORYFLAG().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getHISTORYFLAG() {
                if (historyflag == null) {
                    historyflag = new ArrayList<MXBooleanQueryType>();
                }
                return this.historyflag;
            }

            /**
             * Gets the value of the lastremark property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the lastremark property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getLASTREMARK().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getLASTREMARK() {
                if (lastremark == null) {
                    lastremark = new ArrayList<MXStringQueryType>();
                }
                return this.lastremark;
            }

            /**
             * Gets the value of the objecttype property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the objecttype property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getOBJECTTYPE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getOBJECTTYPE() {
                if (objecttype == null) {
                    objecttype = new ArrayList<MXStringQueryType>();
                }
                return this.objecttype;
            }

            /**
             * Gets the value of the orderaim property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the orderaim property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getORDERAIM().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getORDERAIM() {
                if (orderaim == null) {
                    orderaim = new ArrayList<MXStringQueryType>();
                }
                return this.orderaim;
            }

            /**
             * Gets the value of the origrecordid property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the origrecordid property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getORIGRECORDID().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getORIGRECORDID() {
                if (origrecordid == null) {
                    origrecordid = new ArrayList<MXStringQueryType>();
                }
                return this.origrecordid;
            }

            /**
             * Gets the value of the owner property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the owner property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getOWNER().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getOWNER() {
                if (owner == null) {
                    owner = new ArrayList<MXStringQueryType>();
                }
                return this.owner;
            }

            /**
             * Gets the value of the placeoffault property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the placeoffault property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getPLACEOFFAULT().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPLACEOFFAULT() {
                if (placeoffault == null) {
                    placeoffault = new ArrayList<MXStringQueryType>();
                }
                return this.placeoffault;
            }

            /**
             * Gets the value of the regionname property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the regionname property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getREGIONNAME().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getREGIONNAME() {
                if (regionname == null) {
                    regionname = new ArrayList<MXStringQueryType>();
                }
                return this.regionname;
            }

            /**
             * Gets the value of the reportdate property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the reportdate property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getREPORTDATE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getREPORTDATE() {
                if (reportdate == null) {
                    reportdate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.reportdate;
            }

            /**
             * Gets the value of the siteid property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the siteid property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getSITEID().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getSITEID() {
                if (siteid == null) {
                    siteid = new ArrayList<MXStringQueryType>();
                }
                return this.siteid;
            }

            /**
             * Gets the value of the status property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the status property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getSTATUS().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDomainQueryType }
             * 
             * 
             */
            public List<MXDomainQueryType> getSTATUS() {
                if (status == null) {
                    status = new ArrayList<MXDomainQueryType>();
                }
                return this.status;
            }

            /**
             * Gets the value of the statusdate property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the statusdate property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getSTATUSDATE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getSTATUSDATE() {
                if (statusdate == null) {
                    statusdate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.statusdate;
            }

            /**
             * Gets the value of the wonum property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the wonum property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getWONUM().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWONUM() {
                if (wonum == null) {
                    wonum = new ArrayList<MXStringQueryType>();
                }
                return this.wonum;
            }

            /**
             * Gets the value of the workorderid property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the workorderid property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getWORKORDERID().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getWORKORDERID() {
                if (workorderid == null) {
                    workorderid = new ArrayList<MXLongQueryType>();
                }
                return this.workorderid;
            }

            /**
             * Gets the value of the filter property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFilter() {
                return filter;
            }

            /**
             * Sets the value of the filter property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFilter(Boolean value) {
                this.filter = value;
            }

        }

    }

}

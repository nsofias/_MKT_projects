
package ibm_query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTT1QueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTT1QueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WHERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INCIDENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ACTUALCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CABLEGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CENTRALA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DEVICENAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALSYSTEM" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FAULTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FAULTLOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="GLOBALTICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="IMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="IMSMIGRATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INDICATEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INTERNALPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ISGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="KABEL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="KATEGORIJA" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LINEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LINISKAOPREMA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="MESTOPOVREDE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBEROFAFFECTEDCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGINATEDCOMPANY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGINATEDDEVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PAKET" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PRECKAID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RELATEDTOGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RESOLVEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RESOLVER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ROOTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SERVICESINFAULT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SLATIPSERVIS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SOLUTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TIPPREKIN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TKTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="URGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WAYOFREPAIR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WOCATALOG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WORKAROUND" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WORKAROUNDDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WORKLOG" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="LOGTYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="MODIFYBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="MODIFYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="WORKLOGID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WORKORDER" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="CANCELREASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="LASTREMARK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="OBJECTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ORDERAIM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="PLACEOFFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AFFECTEDSERVICE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ibm.com/maximo}QueryClausePropertyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ACTUALCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CABLEGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CENTRALA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DEVICENAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALSYSTEM" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FAULTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FAULTLOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="GLOBALTICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IMSMIGRATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INDICATEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INTERNALPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ISGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="KABEL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="KATEGORIJA" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LINEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LINISKAOPREMA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="MESTOPOVREDE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMBEROFAFFECTEDCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ORIGINATEDCOMPANY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ORIGINATEDDEVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PAKET" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PRECKAID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RELATEDTOGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RESOLVEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RESOLVER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ROOTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SERVICESINFAULT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SLATIPSERVIS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SOLUTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TARGETCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TARGETFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TIPPREKIN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TKTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="URGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WAYOFREPAIR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WOCATALOG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WORKAROUND" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WORKAROUNDDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WORKLOG" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LOGTYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="MODIFYBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="MODIFYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="WORKLOGID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WORKORDER" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="CANCELREASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LASTREMARK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="OBJECTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ORDERAIM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="PLACEOFFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AFFECTEDSERVICE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actualcontactdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTUALCONTACTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actualfinish property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTUALFINISH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actualstart property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTUALSTART().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adjustedtargetcontacttime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADJUSTEDTARGETCONTACTTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adjustedtargetresolutiontime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADJUSTEDTARGETRESOLUTIONTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affecteddate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAFFECTEDDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignedownergroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSIGNEDOWNERGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cablegroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCABLEGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the centrala property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCENTRALA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cinum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCINUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the class property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLASS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classificationid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLASSIFICATIONID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classstructureid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLASSSTRUCTUREID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDESCRIPTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the devicename property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDEVICENAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalsystem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXTERNALSYSTEM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the faultcause property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFAULTCAUSE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the faultlocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFAULTLOCATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the globalticketid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLOBALTICKETID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the historyflag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHISTORYFLAG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the impact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIMPACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the imsmigration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIMSMIGRATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the indicatedpriority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINDICATEDPRIORITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the internalpriority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINTERNALPRIORITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the isglobal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getISGLOBAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kabel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKABEL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kategorija property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKATEGORIJA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the liniskaoprema property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLINISKAOPREMA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOCATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mestopovrede property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMESTOPOVREDE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numberofaffectedcustomers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNUMBEROFAFFECTEDCUSTOMERS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originatedcompany property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORIGINATEDCOMPANY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originateddevice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORIGINATEDDEVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the owner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOWNER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ownergroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOWNERGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paket property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPAKET().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preckaid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRECKAID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREASON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the regionname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREGIONNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedtoglobal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRELATEDTOGLOBAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPORTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportedby property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPORTEDBY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportedpriority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPORTEDPRIORITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resolvedby property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRESOLVEDBY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resolver property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRESOLVER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rootcause property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROOTCAUSE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servicesinfault property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSERVICESINFAULT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the slatipservis property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSLATIPSERVIS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the solution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOLUTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the status property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statusdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTATUSDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetcontactdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTARGETCONTACTDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetfinish property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTARGETFINISH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTICKETID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketuid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTICKETUID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tipprekin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTIPPREKIN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tktype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTKTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the urgency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getURGENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wayofrepair property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWAYOFREPAIR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wocatalog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWOCATALOG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workaround property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORKAROUND().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workarounddesc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWORKAROUNDDESC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="DELETEFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ENDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="EQUIPMENTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="NUMADSL" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="NUMINTERNET" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="NUMIPTV" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="NUMOFIMPACTEDCUST" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="NUMVOIP" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="NUMWLR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ONETMID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="REGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="SERVICEINFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="STARTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="SYSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the affectedserviceid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAFFECTEDSERVICEID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the changedate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCHANGEDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cinum property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCINUM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the deleteflag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDELETEFLAG().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the description property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDESCRIPTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the enddate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getENDDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the equipmenttype property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEQUIPMENTTYPE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the location property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLOCATION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numadsl property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNUMADSL().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numinternet property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNUMINTERNET().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numiptv property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNUMIPTV().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numofimpactedcust property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNUMOFIMPACTEDCUST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numvoip property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNUMVOIP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numwlr property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNUMWLR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the onetmid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getONETMID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the region property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getREGION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceinfault property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSERVICEINFAULT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the startdate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSTARTDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sysstatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSYSSTATUS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CREATEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LOGTYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="MODIFYBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="MODIFYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="WORKLOGID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the createby property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCREATEBY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the createdate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCREATEDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the description property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDESCRIPTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the logtype property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLOGTYPE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the modifyby property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMODIFYBY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the modifydate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMODIFYDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the orgid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getORGID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the worklogid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWORKLOGID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ACTFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ACTSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="CANCELREASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="CREATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="EXTERNALREFID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="LASTREMARK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="OBJECTTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ORDERAIM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="PLACEOFFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="WONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="WORKORDERID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the actfinish property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getACTFINISH().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the actstart property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getACTSTART().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cancelreason property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCANCELREASON().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the createdate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCREATEDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the createdby property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCREATEDBY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the description property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDESCRIPTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the externalrefid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEXTERNALREFID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the historyflag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHISTORYFLAG().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lastremark property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLASTREMARK().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the objecttype property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOBJECTTYPE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the orderaim property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getORDERAIM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the origrecordid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getORIGRECORDID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the owner property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOWNER().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the placeoffault property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPLACEOFFAULT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the regionname property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getREGIONNAME().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reportdate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getREPORTDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the siteid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSITEID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the status property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSTATUS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the statusdate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSTATUSDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wonum property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWONUM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the workorderid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWORKORDERID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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

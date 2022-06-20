
package TT_incident;

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
 * <p>Java class for TTINCIDENT_INCIDENTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTINCIDENT_INCIDENTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MAXINTERRORMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADRESAIZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ADRESAKORISNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="AFFECTEDDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="AFFECTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="AFFECTEDPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="AFFECTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ASSETORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ASSETSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CENTRALA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CENTRALAPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CLASSIFICATIONID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CONTACTEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CONTACTPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CONTACTPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CORRELATIONATTRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CREATEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CREATEWOMULTI" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CREATIONDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMERVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="DATE1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="DATE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION_LONGDESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="DESCSRVID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="DOMEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="DSLAMPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNALRECID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNALSYSTEM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="EXTSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="FR1CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="FR2CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="GLOBALTICKETCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="GLOBALTICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="HASACTIVITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="HASLD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="HASSOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="HASSUPPORTCONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="HGWTIP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="IMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="INDICATEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="INHERITSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="INT1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="INT2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="INT3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="INTERNALPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="ISGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="ISKNOWNERROR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="ISKNOWNERRORDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="IZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="KABEL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="KATEGORIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="LANGCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="LINISKAOPREMA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="MESTOPOVREDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="MOZEOPTIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="NOTEOPEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="OLA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="OPERATORNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORIGRECORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="ORIGRECSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="OUTAGEDURATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&gt;
 *         &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PAKET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PARICA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="PMCOMRESOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="POZICIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PRESPOJBROJ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PRESPOJLINIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="RAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="REBRO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="RELATEDTOGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="REPORTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="REPORTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="REPORTEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="ROOTCUSTOMERREF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="SEARCHSOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="SELFSERVSOLACCESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="SERIALNUMBERHGW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="SERIALNUMBERSTB" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="SITEVISIT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="SOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="SOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="STRING1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="STRING2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="STRING3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="TARGETCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="TARGETFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="TARGETSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="TECHNICIANNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="TEMPLATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="TEMPLATEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="TICKETUID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="TIPDSLAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="TIPPRETPLATNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="URGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&gt;
 *         &lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&gt;
 *         &lt;element name="VIRTUALENV" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&gt;
 *         &lt;element name="WORKLOG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}TTINCIDENT_WORKLOGType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}ObjectStructurePropertyGroup"/&gt;
 *       &lt;attribute name="transLanguage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTINCIDENT_INCIDENTType", propOrder = {
    "maxinterrormsg",
    "adresaizvod",
    "adresakorisnika",
    "affecteddate",
    "affectedemail",
    "affectedperson",
    "affectedphone",
    "assetnum",
    "assetorgid",
    "assetsiteid",
    "assignedownergroup",
    "centrala",
    "centralaport",
    "changeby",
    "cinum",
    "_class",
    "classificationid",
    "classstructureid",
    "commodity",
    "commoditygroup",
    "contactemail",
    "contactperson",
    "contactphone",
    "correlationattrs",
    "createdby",
    "createwomulti",
    "creationdate",
    "customerid",
    "customername",
    "customervalue",
    "date1",
    "date2",
    "description",
    "descriptionlongdescription",
    "descsrvid",
    "domen",
    "dslamport",
    "externalrecid",
    "externalsystem",
    "externalsystemticketid",
    "extsysid",
    "failurecode",
    "faulttype",
    "fr1CODE",
    "fr2CODE",
    "globalticketclass",
    "globalticketid",
    "hasactivity",
    "hasld",
    "hassolution",
    "hassupportcontract",
    "hgwtip",
    "historyflag",
    "impact",
    "indicatedpriority",
    "inheritstatus",
    "int1",
    "int2",
    "int3",
    "internalpriority",
    "isglobal",
    "isknownerror",
    "isknownerrordate",
    "izvod",
    "kabel",
    "kategorija",
    "langcode",
    "lineid",
    "liniskaoprema",
    "location",
    "mestopovrede",
    "mozeoptika",
    "noteopen",
    "ola",
    "operatorname",
    "orgid",
    "origrecordclass",
    "origrecordid",
    "origrecorgid",
    "origrecsiteid",
    "outageduration",
    "owner",
    "ownergroup",
    "paket",
    "parica",
    "pluspaddressline2",
    "pluspaddressline3",
    "pluspaddrischanged",
    "plusptimezone",
    "pmcomimpact",
    "pmcomresolution",
    "pmcomtype",
    "pmcomurgency",
    "pozicija",
    "preckaid",
    "prespojbroj",
    "prespojlinija",
    "problemcode",
    "ram",
    "rebro",
    "region",
    "relatedtoglobal",
    "reportdate",
    "reportedby",
    "reportedemail",
    "reportedphone",
    "reportedpriority",
    "rootcustomerref",
    "searchsource",
    "selfservsolaccess",
    "serialnumberhgw",
    "serialnumberstb",
    "servicesinfault",
    "siteid",
    "sitevisit",
    "solution",
    "source",
    "status",
    "statusdate",
    "string1",
    "string2",
    "string3",
    "supervisor",
    "targetcontactdate",
    "targetdesc",
    "targetfinish",
    "targetstart",
    "technicianname",
    "template",
    "templateid",
    "ticketid",
    "ticketuid",
    "tipdslam",
    "tippretplatnika",
    "urgency",
    "vendor",
    "virtualenv",
    "worklog"
})
public class TTINCIDENTINCIDENTType {

    @XmlElement(name = "MAXINTERRORMSG")
    protected String maxinterrormsg;
    @XmlElement(name = "ADRESAIZVOD")
    protected MXStringType adresaizvod;
    @XmlElement(name = "ADRESAKORISNIKA")
    protected MXStringType adresakorisnika;
    @XmlElementRef(name = "AFFECTEDDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> affecteddate;
    @XmlElement(name = "AFFECTEDEMAIL")
    protected MXStringType affectedemail;
    @XmlElement(name = "AFFECTEDPERSON")
    protected MXStringType affectedperson;
    @XmlElement(name = "AFFECTEDPHONE")
    protected MXStringType affectedphone;
    @XmlElement(name = "ASSETNUM")
    protected MXStringType assetnum;
    @XmlElement(name = "ASSETORGID")
    protected MXStringType assetorgid;
    @XmlElement(name = "ASSETSITEID")
    protected MXStringType assetsiteid;
    @XmlElement(name = "ASSIGNEDOWNERGROUP")
    protected MXStringType assignedownergroup;
    @XmlElement(name = "CENTRALA")
    protected MXStringType centrala;
    @XmlElement(name = "CENTRALAPORT")
    protected MXStringType centralaport;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElement(name = "CINUM")
    protected MXStringType cinum;
    @XmlElement(name = "CLASS")
    protected MXStringType _class;
    @XmlElement(name = "CLASSIFICATIONID")
    protected MXStringType classificationid;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElement(name = "COMMODITY")
    protected MXStringType commodity;
    @XmlElement(name = "COMMODITYGROUP")
    protected MXStringType commoditygroup;
    @XmlElement(name = "CONTACTEMAIL")
    protected MXStringType contactemail;
    @XmlElement(name = "CONTACTPERSON")
    protected MXStringType contactperson;
    @XmlElement(name = "CONTACTPHONE")
    protected MXStringType contactphone;
    @XmlElement(name = "CORRELATIONATTRS")
    protected MXStringType correlationattrs;
    @XmlElement(name = "CREATEDBY")
    protected MXStringType createdby;
    @XmlElement(name = "CREATEWOMULTI")
    protected MXStringType createwomulti;
    @XmlElementRef(name = "CREATIONDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> creationdate;
    @XmlElement(name = "CUSTOMERID")
    protected MXStringType customerid;
    @XmlElement(name = "CUSTOMERNAME")
    protected MXStringType customername;
    @XmlElementRef(name = "CUSTOMERVALUE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> customervalue;
    @XmlElementRef(name = "DATE1", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> date1;
    @XmlElementRef(name = "DATE2", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> date2;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "DESCRIPTION_LONGDESCRIPTION")
    protected MXStringType descriptionlongdescription;
    @XmlElement(name = "DESCSRVID")
    protected MXStringType descsrvid;
    @XmlElement(name = "DOMEN")
    protected MXStringType domen;
    @XmlElement(name = "DSLAMPORT")
    protected MXStringType dslamport;
    @XmlElement(name = "EXTERNALRECID")
    protected MXStringType externalrecid;
    @XmlElement(name = "EXTERNALSYSTEM")
    protected MXStringType externalsystem;
    @XmlElement(name = "EXTERNALSYSTEM_TICKETID")
    protected MXStringType externalsystemticketid;
    @XmlElement(name = "EXTSYSID")
    protected MXStringType extsysid;
    @XmlElement(name = "FAILURECODE")
    protected MXStringType failurecode;
    @XmlElementRef(name = "FAULTTYPE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> faulttype;
    @XmlElement(name = "FR1CODE")
    protected MXStringType fr1CODE;
    @XmlElement(name = "FR2CODE")
    protected MXStringType fr2CODE;
    @XmlElement(name = "GLOBALTICKETCLASS")
    protected MXStringType globalticketclass;
    @XmlElement(name = "GLOBALTICKETID")
    protected MXStringType globalticketid;
    @XmlElement(name = "HASACTIVITY")
    protected MXBooleanType hasactivity;
    @XmlElement(name = "HASLD")
    protected MXBooleanType hasld;
    @XmlElement(name = "HASSOLUTION")
    protected MXBooleanType hassolution;
    @XmlElement(name = "HASSUPPORTCONTRACT")
    protected MXBooleanType hassupportcontract;
    @XmlElement(name = "HGWTIP")
    protected MXStringType hgwtip;
    @XmlElement(name = "HISTORYFLAG")
    protected MXBooleanType historyflag;
    @XmlElementRef(name = "IMPACT", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> impact;
    @XmlElementRef(name = "INDICATEDPRIORITY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> indicatedpriority;
    @XmlElement(name = "INHERITSTATUS")
    protected MXBooleanType inheritstatus;
    @XmlElementRef(name = "INT1", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int1;
    @XmlElementRef(name = "INT2", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int2;
    @XmlElementRef(name = "INT3", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int3;
    @XmlElementRef(name = "INTERNALPRIORITY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> internalpriority;
    @XmlElement(name = "ISGLOBAL")
    protected MXBooleanType isglobal;
    @XmlElement(name = "ISKNOWNERROR")
    protected MXBooleanType isknownerror;
    @XmlElementRef(name = "ISKNOWNERRORDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> isknownerrordate;
    @XmlElement(name = "IZVOD")
    protected MXStringType izvod;
    @XmlElement(name = "KABEL")
    protected MXStringType kabel;
    @XmlElementRef(name = "KATEGORIJA", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> kategorija;
    @XmlElement(name = "LANGCODE")
    protected MXStringType langcode;
    @XmlElement(name = "LINEID")
    protected MXStringType lineid;
    @XmlElement(name = "LINISKAOPREMA")
    protected MXStringType liniskaoprema;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElement(name = "MESTOPOVREDE")
    protected MXStringType mestopovrede;
    @XmlElement(name = "MOZEOPTIKA")
    protected MXBooleanType mozeoptika;
    @XmlElement(name = "NOTEOPEN")
    protected MXStringType noteopen;
    @XmlElement(name = "OLA")
    protected MXBooleanType ola;
    @XmlElement(name = "OPERATORNAME")
    protected MXStringType operatorname;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "ORIGRECORDCLASS")
    protected MXStringType origrecordclass;
    @XmlElement(name = "ORIGRECORDID")
    protected MXStringType origrecordid;
    @XmlElement(name = "ORIGRECORGID")
    protected MXStringType origrecorgid;
    @XmlElement(name = "ORIGRECSITEID")
    protected MXStringType origrecsiteid;
    @XmlElementRef(name = "OUTAGEDURATION", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> outageduration;
    @XmlElement(name = "OWNER")
    protected MXStringType owner;
    @XmlElement(name = "OWNERGROUP")
    protected MXStringType ownergroup;
    @XmlElement(name = "PAKET")
    protected MXStringType paket;
    @XmlElement(name = "PARICA")
    protected MXStringType parica;
    @XmlElement(name = "PLUSPADDRESSLINE2")
    protected MXStringType pluspaddressline2;
    @XmlElement(name = "PLUSPADDRESSLINE3")
    protected MXStringType pluspaddressline3;
    @XmlElement(name = "PLUSPADDRISCHANGED")
    protected MXBooleanType pluspaddrischanged;
    @XmlElement(name = "PLUSPTIMEZONE")
    protected MXStringType plusptimezone;
    @XmlElementRef(name = "PMCOMIMPACT", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmcomimpact;
    @XmlElement(name = "PMCOMRESOLUTION")
    protected MXStringType pmcomresolution;
    @XmlElement(name = "PMCOMTYPE")
    protected MXStringType pmcomtype;
    @XmlElementRef(name = "PMCOMURGENCY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmcomurgency;
    @XmlElement(name = "POZICIJA")
    protected MXStringType pozicija;
    @XmlElement(name = "PRECKAID")
    protected MXStringType preckaid;
    @XmlElement(name = "PRESPOJBROJ")
    protected MXStringType prespojbroj;
    @XmlElement(name = "PRESPOJLINIJA")
    protected MXStringType prespojlinija;
    @XmlElement(name = "PROBLEMCODE")
    protected MXStringType problemcode;
    @XmlElement(name = "RAM")
    protected MXStringType ram;
    @XmlElement(name = "REBRO")
    protected MXStringType rebro;
    @XmlElementRef(name = "REGION", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> region;
    @XmlElement(name = "RELATEDTOGLOBAL")
    protected MXBooleanType relatedtoglobal;
    @XmlElementRef(name = "REPORTDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> reportdate;
    @XmlElement(name = "REPORTEDBY")
    protected MXStringType reportedby;
    @XmlElement(name = "REPORTEDEMAIL")
    protected MXStringType reportedemail;
    @XmlElement(name = "REPORTEDPHONE")
    protected MXStringType reportedphone;
    @XmlElementRef(name = "REPORTEDPRIORITY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> reportedpriority;
    @XmlElement(name = "ROOTCUSTOMERREF")
    protected MXStringType rootcustomerref;
    @XmlElement(name = "SEARCHSOURCE")
    protected MXStringType searchsource;
    @XmlElement(name = "SELFSERVSOLACCESS")
    protected MXBooleanType selfservsolaccess;
    @XmlElement(name = "SERIALNUMBERHGW")
    protected MXStringType serialnumberhgw;
    @XmlElement(name = "SERIALNUMBERSTB")
    protected MXStringType serialnumberstb;
    @XmlElementRef(name = "SERVICESINFAULT", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> servicesinfault;
    @XmlElement(name = "SITEID")
    protected MXStringType siteid;
    @XmlElement(name = "SITEVISIT")
    protected MXBooleanType sitevisit;
    @XmlElement(name = "SOLUTION")
    protected MXStringType solution;
    @XmlElement(name = "SOURCE")
    protected MXStringType source;
    @XmlElement(name = "STATUS")
    protected MXStringType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElement(name = "STRING1")
    protected MXStringType string1;
    @XmlElement(name = "STRING2")
    protected MXStringType string2;
    @XmlElement(name = "STRING3")
    protected MXStringType string3;
    @XmlElement(name = "SUPERVISOR")
    protected MXStringType supervisor;
    @XmlElementRef(name = "TARGETCONTACTDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targetcontactdate;
    @XmlElement(name = "TARGETDESC")
    protected MXStringType targetdesc;
    @XmlElementRef(name = "TARGETFINISH", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targetfinish;
    @XmlElementRef(name = "TARGETSTART", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targetstart;
    @XmlElement(name = "TECHNICIANNAME")
    protected MXStringType technicianname;
    @XmlElement(name = "TEMPLATE")
    protected MXBooleanType template;
    @XmlElement(name = "TEMPLATEID")
    protected MXStringType templateid;
    @XmlElement(name = "TICKETID")
    protected MXStringType ticketid;
    @XmlElementRef(name = "TICKETUID", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> ticketuid;
    @XmlElement(name = "TIPDSLAM")
    protected MXStringType tipdslam;
    @XmlElement(name = "TIPPRETPLATNIKA")
    protected MXStringType tippretplatnika;
    @XmlElementRef(name = "URGENCY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> urgency;
    @XmlElement(name = "VENDOR")
    protected MXStringType vendor;
    @XmlElement(name = "VIRTUALENV")
    protected MXBooleanType virtualenv;
    @XmlElement(name = "WORKLOG")
    protected List<TTINCIDENTWORKLOGType> worklog;
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
     * Gets the value of the adresaizvod property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getADRESAIZVOD() {
        return adresaizvod;
    }

    /**
     * Sets the value of the adresaizvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setADRESAIZVOD(MXStringType value) {
        this.adresaizvod = value;
    }

    /**
     * Gets the value of the adresakorisnika property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getADRESAKORISNIKA() {
        return adresakorisnika;
    }

    /**
     * Sets the value of the adresakorisnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setADRESAKORISNIKA(MXStringType value) {
        this.adresakorisnika = value;
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
     * Gets the value of the affectedemail property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAFFECTEDEMAIL() {
        return affectedemail;
    }

    /**
     * Sets the value of the affectedemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAFFECTEDEMAIL(MXStringType value) {
        this.affectedemail = value;
    }

    /**
     * Gets the value of the affectedperson property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAFFECTEDPERSON() {
        return affectedperson;
    }

    /**
     * Sets the value of the affectedperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAFFECTEDPERSON(MXStringType value) {
        this.affectedperson = value;
    }

    /**
     * Gets the value of the affectedphone property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAFFECTEDPHONE() {
        return affectedphone;
    }

    /**
     * Sets the value of the affectedphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAFFECTEDPHONE(MXStringType value) {
        this.affectedphone = value;
    }

    /**
     * Gets the value of the assetnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSETNUM() {
        return assetnum;
    }

    /**
     * Sets the value of the assetnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSETNUM(MXStringType value) {
        this.assetnum = value;
    }

    /**
     * Gets the value of the assetorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSETORGID() {
        return assetorgid;
    }

    /**
     * Sets the value of the assetorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSETORGID(MXStringType value) {
        this.assetorgid = value;
    }

    /**
     * Gets the value of the assetsiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getASSETSITEID() {
        return assetsiteid;
    }

    /**
     * Sets the value of the assetsiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setASSETSITEID(MXStringType value) {
        this.assetsiteid = value;
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
     * Gets the value of the centralaport property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCENTRALAPORT() {
        return centralaport;
    }

    /**
     * Sets the value of the centralaport property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCENTRALAPORT(MXStringType value) {
        this.centralaport = value;
    }

    /**
     * Gets the value of the changeby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCHANGEBY() {
        return changeby;
    }

    /**
     * Sets the value of the changeby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCHANGEBY(MXStringType value) {
        this.changeby = value;
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
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCLASS() {
        return _class;
    }

    /**
     * Sets the value of the class property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCLASS(MXStringType value) {
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
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCOMMODITY() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCOMMODITY(MXStringType value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the commoditygroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCOMMODITYGROUP() {
        return commoditygroup;
    }

    /**
     * Sets the value of the commoditygroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCOMMODITYGROUP(MXStringType value) {
        this.commoditygroup = value;
    }

    /**
     * Gets the value of the contactemail property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCONTACTEMAIL() {
        return contactemail;
    }

    /**
     * Sets the value of the contactemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCONTACTEMAIL(MXStringType value) {
        this.contactemail = value;
    }

    /**
     * Gets the value of the contactperson property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCONTACTPERSON() {
        return contactperson;
    }

    /**
     * Sets the value of the contactperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCONTACTPERSON(MXStringType value) {
        this.contactperson = value;
    }

    /**
     * Gets the value of the contactphone property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCONTACTPHONE() {
        return contactphone;
    }

    /**
     * Sets the value of the contactphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCONTACTPHONE(MXStringType value) {
        this.contactphone = value;
    }

    /**
     * Gets the value of the correlationattrs property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCORRELATIONATTRS() {
        return correlationattrs;
    }

    /**
     * Sets the value of the correlationattrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCORRELATIONATTRS(MXStringType value) {
        this.correlationattrs = value;
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
     * Gets the value of the createwomulti property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCREATEWOMULTI() {
        return createwomulti;
    }

    /**
     * Sets the value of the createwomulti property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCREATEWOMULTI(MXStringType value) {
        this.createwomulti = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setCREATIONDATE(JAXBElement<MXDateTimeType> value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the customerid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCUSTOMERID() {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCUSTOMERID(MXStringType value) {
        this.customerid = value;
    }

    /**
     * Gets the value of the customername property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCUSTOMERNAME() {
        return customername;
    }

    /**
     * Sets the value of the customername property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCUSTOMERNAME(MXStringType value) {
        this.customername = value;
    }

    /**
     * Gets the value of the customervalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getCUSTOMERVALUE() {
        return customervalue;
    }

    /**
     * Sets the value of the customervalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setCUSTOMERVALUE(JAXBElement<MXLongType> value) {
        this.customervalue = value;
    }

    /**
     * Gets the value of the date1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getDATE1() {
        return date1;
    }

    /**
     * Sets the value of the date1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setDATE1(JAXBElement<MXDateTimeType> value) {
        this.date1 = value;
    }

    /**
     * Gets the value of the date2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getDATE2() {
        return date2;
    }

    /**
     * Sets the value of the date2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setDATE2(JAXBElement<MXDateTimeType> value) {
        this.date2 = value;
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
     * Gets the value of the descsrvid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDESCSRVID() {
        return descsrvid;
    }

    /**
     * Sets the value of the descsrvid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDESCSRVID(MXStringType value) {
        this.descsrvid = value;
    }

    /**
     * Gets the value of the domen property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDOMEN() {
        return domen;
    }

    /**
     * Sets the value of the domen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDOMEN(MXStringType value) {
        this.domen = value;
    }

    /**
     * Gets the value of the dslamport property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDSLAMPORT() {
        return dslamport;
    }

    /**
     * Sets the value of the dslamport property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDSLAMPORT(MXStringType value) {
        this.dslamport = value;
    }

    /**
     * Gets the value of the externalrecid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEXTERNALRECID() {
        return externalrecid;
    }

    /**
     * Sets the value of the externalrecid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEXTERNALRECID(MXStringType value) {
        this.externalrecid = value;
    }

    /**
     * Gets the value of the externalsystem property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEXTERNALSYSTEM() {
        return externalsystem;
    }

    /**
     * Sets the value of the externalsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEXTERNALSYSTEM(MXStringType value) {
        this.externalsystem = value;
    }

    /**
     * Gets the value of the externalsystemticketid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEXTERNALSYSTEMTICKETID() {
        return externalsystemticketid;
    }

    /**
     * Sets the value of the externalsystemticketid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEXTERNALSYSTEMTICKETID(MXStringType value) {
        this.externalsystemticketid = value;
    }

    /**
     * Gets the value of the extsysid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEXTSYSID() {
        return extsysid;
    }

    /**
     * Sets the value of the extsysid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEXTSYSID(MXStringType value) {
        this.extsysid = value;
    }

    /**
     * Gets the value of the failurecode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFAILURECODE() {
        return failurecode;
    }

    /**
     * Sets the value of the failurecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFAILURECODE(MXStringType value) {
        this.failurecode = value;
    }

    /**
     * Gets the value of the faulttype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getFAULTTYPE() {
        return faulttype;
    }

    /**
     * Sets the value of the faulttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setFAULTTYPE(JAXBElement<MXLongType> value) {
        this.faulttype = value;
    }

    /**
     * Gets the value of the fr1CODE property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFR1CODE() {
        return fr1CODE;
    }

    /**
     * Sets the value of the fr1CODE property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFR1CODE(MXStringType value) {
        this.fr1CODE = value;
    }

    /**
     * Gets the value of the fr2CODE property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFR2CODE() {
        return fr2CODE;
    }

    /**
     * Sets the value of the fr2CODE property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFR2CODE(MXStringType value) {
        this.fr2CODE = value;
    }

    /**
     * Gets the value of the globalticketclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getGLOBALTICKETCLASS() {
        return globalticketclass;
    }

    /**
     * Sets the value of the globalticketclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setGLOBALTICKETCLASS(MXStringType value) {
        this.globalticketclass = value;
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
     * Gets the value of the hasactivity property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHASACTIVITY() {
        return hasactivity;
    }

    /**
     * Sets the value of the hasactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHASACTIVITY(MXBooleanType value) {
        this.hasactivity = value;
    }

    /**
     * Gets the value of the hasld property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHASLD() {
        return hasld;
    }

    /**
     * Sets the value of the hasld property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHASLD(MXBooleanType value) {
        this.hasld = value;
    }

    /**
     * Gets the value of the hassolution property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHASSOLUTION() {
        return hassolution;
    }

    /**
     * Sets the value of the hassolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHASSOLUTION(MXBooleanType value) {
        this.hassolution = value;
    }

    /**
     * Gets the value of the hassupportcontract property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHASSUPPORTCONTRACT() {
        return hassupportcontract;
    }

    /**
     * Sets the value of the hassupportcontract property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHASSUPPORTCONTRACT(MXBooleanType value) {
        this.hassupportcontract = value;
    }

    /**
     * Gets the value of the hgwtip property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getHGWTIP() {
        return hgwtip;
    }

    /**
     * Sets the value of the hgwtip property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setHGWTIP(MXStringType value) {
        this.hgwtip = value;
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
     * Gets the value of the inheritstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getINHERITSTATUS() {
        return inheritstatus;
    }

    /**
     * Sets the value of the inheritstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setINHERITSTATUS(MXBooleanType value) {
        this.inheritstatus = value;
    }

    /**
     * Gets the value of the int1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINT1() {
        return int1;
    }

    /**
     * Sets the value of the int1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINT1(JAXBElement<MXLongType> value) {
        this.int1 = value;
    }

    /**
     * Gets the value of the int2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINT2() {
        return int2;
    }

    /**
     * Sets the value of the int2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINT2(JAXBElement<MXLongType> value) {
        this.int2 = value;
    }

    /**
     * Gets the value of the int3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINT3() {
        return int3;
    }

    /**
     * Sets the value of the int3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINT3(JAXBElement<MXLongType> value) {
        this.int3 = value;
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
     * Gets the value of the isknownerror property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISKNOWNERROR() {
        return isknownerror;
    }

    /**
     * Sets the value of the isknownerror property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISKNOWNERROR(MXBooleanType value) {
        this.isknownerror = value;
    }

    /**
     * Gets the value of the isknownerrordate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getISKNOWNERRORDATE() {
        return isknownerrordate;
    }

    /**
     * Sets the value of the isknownerrordate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setISKNOWNERRORDATE(JAXBElement<MXDateTimeType> value) {
        this.isknownerrordate = value;
    }

    /**
     * Gets the value of the izvod property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getIZVOD() {
        return izvod;
    }

    /**
     * Sets the value of the izvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setIZVOD(MXStringType value) {
        this.izvod = value;
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
     * Gets the value of the langcode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLANGCODE() {
        return langcode;
    }

    /**
     * Sets the value of the langcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLANGCODE(MXStringType value) {
        this.langcode = value;
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
     * Gets the value of the mozeoptika property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getMOZEOPTIKA() {
        return mozeoptika;
    }

    /**
     * Sets the value of the mozeoptika property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setMOZEOPTIKA(MXBooleanType value) {
        this.mozeoptika = value;
    }

    /**
     * Gets the value of the noteopen property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getNOTEOPEN() {
        return noteopen;
    }

    /**
     * Sets the value of the noteopen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setNOTEOPEN(MXStringType value) {
        this.noteopen = value;
    }

    /**
     * Gets the value of the ola property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getOLA() {
        return ola;
    }

    /**
     * Sets the value of the ola property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setOLA(MXBooleanType value) {
        this.ola = value;
    }

    /**
     * Gets the value of the operatorname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOPERATORNAME() {
        return operatorname;
    }

    /**
     * Sets the value of the operatorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOPERATORNAME(MXStringType value) {
        this.operatorname = value;
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
     * Gets the value of the origrecordclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORIGRECORDCLASS() {
        return origrecordclass;
    }

    /**
     * Sets the value of the origrecordclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORIGRECORDCLASS(MXStringType value) {
        this.origrecordclass = value;
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
     * Gets the value of the origrecorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORIGRECORGID() {
        return origrecorgid;
    }

    /**
     * Sets the value of the origrecorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORIGRECORGID(MXStringType value) {
        this.origrecorgid = value;
    }

    /**
     * Gets the value of the origrecsiteid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getORIGRECSITEID() {
        return origrecsiteid;
    }

    /**
     * Sets the value of the origrecsiteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setORIGRECSITEID(MXStringType value) {
        this.origrecsiteid = value;
    }

    /**
     * Gets the value of the outageduration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getOUTAGEDURATION() {
        return outageduration;
    }

    /**
     * Sets the value of the outageduration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setOUTAGEDURATION(JAXBElement<MXDoubleType> value) {
        this.outageduration = value;
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
     * Gets the value of the parica property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPARICA() {
        return parica;
    }

    /**
     * Sets the value of the parica property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPARICA(MXStringType value) {
        this.parica = value;
    }

    /**
     * Gets the value of the pluspaddressline2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPADDRESSLINE2() {
        return pluspaddressline2;
    }

    /**
     * Sets the value of the pluspaddressline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPADDRESSLINE2(MXStringType value) {
        this.pluspaddressline2 = value;
    }

    /**
     * Gets the value of the pluspaddressline3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPADDRESSLINE3() {
        return pluspaddressline3;
    }

    /**
     * Sets the value of the pluspaddressline3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPADDRESSLINE3(MXStringType value) {
        this.pluspaddressline3 = value;
    }

    /**
     * Gets the value of the pluspaddrischanged property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSPADDRISCHANGED() {
        return pluspaddrischanged;
    }

    /**
     * Sets the value of the pluspaddrischanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSPADDRISCHANGED(MXBooleanType value) {
        this.pluspaddrischanged = value;
    }

    /**
     * Gets the value of the plusptimezone property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPTIMEZONE() {
        return plusptimezone;
    }

    /**
     * Sets the value of the plusptimezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPTIMEZONE(MXStringType value) {
        this.plusptimezone = value;
    }

    /**
     * Gets the value of the pmcomimpact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCOMIMPACT() {
        return pmcomimpact;
    }

    /**
     * Sets the value of the pmcomimpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCOMIMPACT(JAXBElement<MXLongType> value) {
        this.pmcomimpact = value;
    }

    /**
     * Gets the value of the pmcomresolution property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOMRESOLUTION() {
        return pmcomresolution;
    }

    /**
     * Sets the value of the pmcomresolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOMRESOLUTION(MXStringType value) {
        this.pmcomresolution = value;
    }

    /**
     * Gets the value of the pmcomtype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOMTYPE() {
        return pmcomtype;
    }

    /**
     * Sets the value of the pmcomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOMTYPE(MXStringType value) {
        this.pmcomtype = value;
    }

    /**
     * Gets the value of the pmcomurgency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMCOMURGENCY() {
        return pmcomurgency;
    }

    /**
     * Sets the value of the pmcomurgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMCOMURGENCY(JAXBElement<MXLongType> value) {
        this.pmcomurgency = value;
    }

    /**
     * Gets the value of the pozicija property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPOZICIJA() {
        return pozicija;
    }

    /**
     * Sets the value of the pozicija property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPOZICIJA(MXStringType value) {
        this.pozicija = value;
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
     * Gets the value of the prespojbroj property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPRESPOJBROJ() {
        return prespojbroj;
    }

    /**
     * Sets the value of the prespojbroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPRESPOJBROJ(MXStringType value) {
        this.prespojbroj = value;
    }

    /**
     * Gets the value of the prespojlinija property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPRESPOJLINIJA() {
        return prespojlinija;
    }

    /**
     * Sets the value of the prespojlinija property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPRESPOJLINIJA(MXStringType value) {
        this.prespojlinija = value;
    }

    /**
     * Gets the value of the problemcode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPROBLEMCODE() {
        return problemcode;
    }

    /**
     * Sets the value of the problemcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPROBLEMCODE(MXStringType value) {
        this.problemcode = value;
    }

    /**
     * Gets the value of the ram property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRAM() {
        return ram;
    }

    /**
     * Sets the value of the ram property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRAM(MXStringType value) {
        this.ram = value;
    }

    /**
     * Gets the value of the rebro property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREBRO() {
        return rebro;
    }

    /**
     * Sets the value of the rebro property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREBRO(MXStringType value) {
        this.rebro = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getREGION() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setREGION(JAXBElement<MXLongType> value) {
        this.region = value;
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
     * Gets the value of the reportedemail property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREPORTEDEMAIL() {
        return reportedemail;
    }

    /**
     * Sets the value of the reportedemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREPORTEDEMAIL(MXStringType value) {
        this.reportedemail = value;
    }

    /**
     * Gets the value of the reportedphone property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREPORTEDPHONE() {
        return reportedphone;
    }

    /**
     * Sets the value of the reportedphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREPORTEDPHONE(MXStringType value) {
        this.reportedphone = value;
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
     * Gets the value of the rootcustomerref property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getROOTCUSTOMERREF() {
        return rootcustomerref;
    }

    /**
     * Sets the value of the rootcustomerref property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setROOTCUSTOMERREF(MXStringType value) {
        this.rootcustomerref = value;
    }

    /**
     * Gets the value of the searchsource property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSEARCHSOURCE() {
        return searchsource;
    }

    /**
     * Sets the value of the searchsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSEARCHSOURCE(MXStringType value) {
        this.searchsource = value;
    }

    /**
     * Gets the value of the selfservsolaccess property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSELFSERVSOLACCESS() {
        return selfservsolaccess;
    }

    /**
     * Sets the value of the selfservsolaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSELFSERVSOLACCESS(MXBooleanType value) {
        this.selfservsolaccess = value;
    }

    /**
     * Gets the value of the serialnumberhgw property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSERIALNUMBERHGW() {
        return serialnumberhgw;
    }

    /**
     * Sets the value of the serialnumberhgw property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSERIALNUMBERHGW(MXStringType value) {
        this.serialnumberhgw = value;
    }

    /**
     * Gets the value of the serialnumberstb property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSERIALNUMBERSTB() {
        return serialnumberstb;
    }

    /**
     * Sets the value of the serialnumberstb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSERIALNUMBERSTB(MXStringType value) {
        this.serialnumberstb = value;
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
     * Gets the value of the sitevisit property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSITEVISIT() {
        return sitevisit;
    }

    /**
     * Sets the value of the sitevisit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSITEVISIT(MXBooleanType value) {
        this.sitevisit = value;
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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSOURCE(MXStringType value) {
        this.source = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTATUS(MXStringType value) {
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
     * Gets the value of the string1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTRING1() {
        return string1;
    }

    /**
     * Sets the value of the string1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTRING1(MXStringType value) {
        this.string1 = value;
    }

    /**
     * Gets the value of the string2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTRING2() {
        return string2;
    }

    /**
     * Sets the value of the string2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTRING2(MXStringType value) {
        this.string2 = value;
    }

    /**
     * Gets the value of the string3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTRING3() {
        return string3;
    }

    /**
     * Sets the value of the string3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTRING3(MXStringType value) {
        this.string3 = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSUPERVISOR() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSUPERVISOR(MXStringType value) {
        this.supervisor = value;
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
     * Gets the value of the targetdesc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTARGETDESC() {
        return targetdesc;
    }

    /**
     * Sets the value of the targetdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTARGETDESC(MXStringType value) {
        this.targetdesc = value;
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
     * Gets the value of the targetstart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTARGETSTART() {
        return targetstart;
    }

    /**
     * Sets the value of the targetstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTARGETSTART(JAXBElement<MXDateTimeType> value) {
        this.targetstart = value;
    }

    /**
     * Gets the value of the technicianname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTECHNICIANNAME() {
        return technicianname;
    }

    /**
     * Sets the value of the technicianname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTECHNICIANNAME(MXStringType value) {
        this.technicianname = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getTEMPLATE() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setTEMPLATE(MXBooleanType value) {
        this.template = value;
    }

    /**
     * Gets the value of the templateid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTEMPLATEID() {
        return templateid;
    }

    /**
     * Sets the value of the templateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTEMPLATEID(MXStringType value) {
        this.templateid = value;
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
     * Gets the value of the tipdslam property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTIPDSLAM() {
        return tipdslam;
    }

    /**
     * Sets the value of the tipdslam property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTIPDSLAM(MXStringType value) {
        this.tipdslam = value;
    }

    /**
     * Gets the value of the tippretplatnika property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTIPPRETPLATNIKA() {
        return tippretplatnika;
    }

    /**
     * Sets the value of the tippretplatnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTIPPRETPLATNIKA(MXStringType value) {
        this.tippretplatnika = value;
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
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getVENDOR() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setVENDOR(MXStringType value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the virtualenv property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getVIRTUALENV() {
        return virtualenv;
    }

    /**
     * Sets the value of the virtualenv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setVIRTUALENV(MXBooleanType value) {
        this.virtualenv = value;
    }

    /**
     * Gets the value of the worklog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the worklog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWORKLOG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTINCIDENTWORKLOGType }
     * 
     * 
     */
    public List<TTINCIDENTWORKLOGType> getWORKLOG() {
        if (worklog == null) {
            worklog = new ArrayList<TTINCIDENTWORKLOGType>();
        }
        return this.worklog;
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

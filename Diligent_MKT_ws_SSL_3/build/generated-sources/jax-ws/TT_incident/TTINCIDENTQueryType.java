
package TT_incident;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TTINCIDENTQueryType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TTINCIDENTQueryType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="WHERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INCIDENT" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="ADRESAIZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ADRESAKORISNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="AFFECTEDDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="AFFECTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="AFFECTEDPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="AFFECTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ASSETORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ASSETSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CENTRALA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CENTRALAPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CLASSIFICATIONID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CONTACTEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CONTACTPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CONTACTPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CORRELATIONATTRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CREATEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CREATEWOMULTI" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CREATIONDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CUSTOMERNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="CUSTOMERVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DATE1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DATE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DESCSRVID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DOMEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="DSLAMPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="EXTERNALRECID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="EXTERNALSYSTEM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="EXTSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="FR1CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="FR2CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="GLOBALTICKETCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="GLOBALTICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="HASACTIVITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="HASLD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="HASSOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="HASSUPPORTCONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="HGWTIP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="IMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="INDICATEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="INHERITSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="INT1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="INT2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="INT3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="INTERNALPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ISGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ISKNOWNERROR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ISKNOWNERRORDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="IZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="KABEL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="KATEGORIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="LANGCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="LINISKAOPREMA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="MESTOPOVREDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="MOZEOPTIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="NOTEOPEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="OLA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="OPERATORNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ORIGRECORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ORIGRECSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="OUTAGEDURATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PAKET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PARICA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PMCOMRESOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="POZICIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PRESPOJBROJ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PRESPOJLINIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="RAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REBRO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="RELATEDTOGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REPORTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REPORTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="REPORTEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="ROOTCUSTOMERREF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SEARCHSOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SELFSERVSOLACCESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SERIALNUMBERHGW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SERIALNUMBERSTB" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SITEVISIT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="STRING1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="STRING2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="STRING3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TARGETCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TARGETFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TARGETSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TECHNICIANNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TEMPLATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TEMPLATEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TICKETUID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TIPDSLAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="TIPPRETPLATNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="URGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="VIRTUALENV" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="WORKLOG" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="CLIENTVIEWABLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="CREATEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="CREATEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="LOGTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="MODIFYBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="MODIFYDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="RECORDKEY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                             &amp;lt;element name="WORKLOGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
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
 *       &amp;lt;attGroup ref="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}QueryClausePropertyGroup"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTINCIDENTQueryType", propOrder = {
    "where",
    "incident"
})
public class TTINCIDENTQueryType {

    @XmlElement(name = "WHERE")
    protected String where;
    @XmlElement(name = "INCIDENT")
    protected TTINCIDENTQueryType.INCIDENT incident;
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
     *     {@link TTINCIDENTQueryType.INCIDENT }
     *     
     */
    public TTINCIDENTQueryType.INCIDENT getINCIDENT() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTINCIDENTQueryType.INCIDENT }
     *     
     */
    public void setINCIDENT(TTINCIDENTQueryType.INCIDENT value) {
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
     *         &amp;lt;element name="ADRESAIZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ADRESAKORISNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="AFFECTEDDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="AFFECTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="AFFECTEDPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="AFFECTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ASSETORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ASSETSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CENTRALA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CENTRALAPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CLASSIFICATIONID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CONTACTEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CONTACTPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CONTACTPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CORRELATIONATTRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CREATEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CREATEWOMULTI" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CREATIONDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CUSTOMERNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="CUSTOMERVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DATE1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DATE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DESCSRVID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DOMEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="DSLAMPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="EXTERNALRECID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="EXTERNALSYSTEM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="EXTSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="FR1CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="FR2CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="GLOBALTICKETCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="GLOBALTICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="HASACTIVITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="HASLD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="HASSOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="HASSUPPORTCONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="HGWTIP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="IMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="INDICATEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="INHERITSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="INT1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="INT2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="INT3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="INTERNALPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ISGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ISKNOWNERROR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ISKNOWNERRORDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="IZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="KABEL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="KATEGORIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="LANGCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="LINISKAOPREMA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="MESTOPOVREDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="MOZEOPTIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="NOTEOPEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="OLA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="OPERATORNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ORIGRECORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ORIGRECSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="OUTAGEDURATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PAKET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PARICA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PMCOMRESOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="POZICIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PRESPOJBROJ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PRESPOJLINIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="RAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REBRO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="RELATEDTOGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REPORTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REPORTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="REPORTEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="ROOTCUSTOMERREF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SEARCHSOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SELFSERVSOLACCESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SERIALNUMBERHGW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SERIALNUMBERSTB" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SITEVISIT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="STRING1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="STRING2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="STRING3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TARGETCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TARGETFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TARGETSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TECHNICIANNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TEMPLATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TEMPLATEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TICKETUID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TIPDSLAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="TIPPRETPLATNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="URGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="VIRTUALENV" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="WORKLOG" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;element name="CLIENTVIEWABLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="CREATEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="CREATEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="LOGTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="MODIFYBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="MODIFYDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="RECORDKEY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                   &amp;lt;element name="WORKLOGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
     *                 &amp;lt;/sequence&amp;gt;
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
    public static class INCIDENT {

        @XmlElement(name = "ADRESAIZVOD")
        protected List<MXStringQueryType> adresaizvod;
        @XmlElement(name = "ADRESAKORISNIKA")
        protected List<MXStringQueryType> adresakorisnika;
        @XmlElement(name = "AFFECTEDDATE", nillable = true)
        protected List<MXDateTimeQueryType> affecteddate;
        @XmlElement(name = "AFFECTEDEMAIL")
        protected List<MXStringQueryType> affectedemail;
        @XmlElement(name = "AFFECTEDPERSON")
        protected List<MXStringQueryType> affectedperson;
        @XmlElement(name = "AFFECTEDPHONE")
        protected List<MXStringQueryType> affectedphone;
        @XmlElement(name = "ASSETNUM")
        protected List<MXStringQueryType> assetnum;
        @XmlElement(name = "ASSETORGID")
        protected List<MXStringQueryType> assetorgid;
        @XmlElement(name = "ASSETSITEID")
        protected List<MXStringQueryType> assetsiteid;
        @XmlElement(name = "ASSIGNEDOWNERGROUP")
        protected List<MXStringQueryType> assignedownergroup;
        @XmlElement(name = "CENTRALA")
        protected List<MXStringQueryType> centrala;
        @XmlElement(name = "CENTRALAPORT")
        protected List<MXStringQueryType> centralaport;
        @XmlElement(name = "CHANGEBY")
        protected List<MXStringQueryType> changeby;
        @XmlElement(name = "CINUM")
        protected List<MXStringQueryType> cinum;
        @XmlElement(name = "CLASS")
        protected List<MXStringQueryType> _class;
        @XmlElement(name = "CLASSIFICATIONID")
        protected List<MXStringQueryType> classificationid;
        @XmlElement(name = "CLASSSTRUCTUREID")
        protected List<MXStringQueryType> classstructureid;
        @XmlElement(name = "COMMODITY")
        protected List<MXStringQueryType> commodity;
        @XmlElement(name = "COMMODITYGROUP")
        protected List<MXStringQueryType> commoditygroup;
        @XmlElement(name = "CONTACTEMAIL")
        protected List<MXStringQueryType> contactemail;
        @XmlElement(name = "CONTACTPERSON")
        protected List<MXStringQueryType> contactperson;
        @XmlElement(name = "CONTACTPHONE")
        protected List<MXStringQueryType> contactphone;
        @XmlElement(name = "CORRELATIONATTRS")
        protected List<MXStringQueryType> correlationattrs;
        @XmlElement(name = "CREATEDBY")
        protected List<MXStringQueryType> createdby;
        @XmlElement(name = "CREATEWOMULTI")
        protected List<MXStringQueryType> createwomulti;
        @XmlElement(name = "CREATIONDATE", nillable = true)
        protected List<MXDateTimeQueryType> creationdate;
        @XmlElement(name = "CUSTOMERID")
        protected List<MXStringQueryType> customerid;
        @XmlElement(name = "CUSTOMERNAME")
        protected List<MXStringQueryType> customername;
        @XmlElement(name = "CUSTOMERVALUE", nillable = true)
        protected List<MXLongQueryType> customervalue;
        @XmlElement(name = "DATE1", nillable = true)
        protected List<MXDateTimeQueryType> date1;
        @XmlElement(name = "DATE2", nillable = true)
        protected List<MXDateTimeQueryType> date2;
        @XmlElement(name = "DESCRIPTION")
        protected List<MXStringQueryType> description;
        @XmlElement(name = "DESCSRVID")
        protected List<MXStringQueryType> descsrvid;
        @XmlElement(name = "DOMEN")
        protected List<MXStringQueryType> domen;
        @XmlElement(name = "DSLAMPORT")
        protected List<MXStringQueryType> dslamport;
        @XmlElement(name = "EXTERNALRECID")
        protected List<MXStringQueryType> externalrecid;
        @XmlElement(name = "EXTERNALSYSTEM")
        protected List<MXStringQueryType> externalsystem;
        @XmlElement(name = "EXTERNALSYSTEM_TICKETID")
        protected List<MXStringQueryType> externalsystemticketid;
        @XmlElement(name = "EXTSYSID")
        protected List<MXStringQueryType> extsysid;
        @XmlElement(name = "FAILURECODE")
        protected List<MXStringQueryType> failurecode;
        @XmlElement(name = "FAULTTYPE", nillable = true)
        protected List<MXLongQueryType> faulttype;
        @XmlElement(name = "FR1CODE")
        protected List<MXStringQueryType> fr1CODE;
        @XmlElement(name = "FR2CODE")
        protected List<MXStringQueryType> fr2CODE;
        @XmlElement(name = "GLOBALTICKETCLASS")
        protected List<MXStringQueryType> globalticketclass;
        @XmlElement(name = "GLOBALTICKETID")
        protected List<MXStringQueryType> globalticketid;
        @XmlElement(name = "HASACTIVITY")
        protected List<MXBooleanQueryType> hasactivity;
        @XmlElement(name = "HASLD")
        protected List<MXBooleanQueryType> hasld;
        @XmlElement(name = "HASSOLUTION")
        protected List<MXBooleanQueryType> hassolution;
        @XmlElement(name = "HASSUPPORTCONTRACT")
        protected List<MXBooleanQueryType> hassupportcontract;
        @XmlElement(name = "HGWTIP")
        protected List<MXStringQueryType> hgwtip;
        @XmlElement(name = "HISTORYFLAG")
        protected List<MXBooleanQueryType> historyflag;
        @XmlElement(name = "IMPACT", nillable = true)
        protected List<MXLongQueryType> impact;
        @XmlElement(name = "INDICATEDPRIORITY", nillable = true)
        protected List<MXLongQueryType> indicatedpriority;
        @XmlElement(name = "INHERITSTATUS")
        protected List<MXBooleanQueryType> inheritstatus;
        @XmlElement(name = "INT1", nillable = true)
        protected List<MXLongQueryType> int1;
        @XmlElement(name = "INT2", nillable = true)
        protected List<MXLongQueryType> int2;
        @XmlElement(name = "INT3", nillable = true)
        protected List<MXLongQueryType> int3;
        @XmlElement(name = "INTERNALPRIORITY", nillable = true)
        protected List<MXLongQueryType> internalpriority;
        @XmlElement(name = "ISGLOBAL")
        protected List<MXBooleanQueryType> isglobal;
        @XmlElement(name = "ISKNOWNERROR")
        protected List<MXBooleanQueryType> isknownerror;
        @XmlElement(name = "ISKNOWNERRORDATE", nillable = true)
        protected List<MXDateTimeQueryType> isknownerrordate;
        @XmlElement(name = "IZVOD")
        protected List<MXStringQueryType> izvod;
        @XmlElement(name = "KABEL")
        protected List<MXStringQueryType> kabel;
        @XmlElement(name = "KATEGORIJA", nillable = true)
        protected List<MXLongQueryType> kategorija;
        @XmlElement(name = "LANGCODE")
        protected List<MXStringQueryType> langcode;
        @XmlElement(name = "LINEID")
        protected List<MXStringQueryType> lineid;
        @XmlElement(name = "LINISKAOPREMA")
        protected List<MXStringQueryType> liniskaoprema;
        @XmlElement(name = "LOCATION")
        protected List<MXStringQueryType> location;
        @XmlElement(name = "MESTOPOVREDE")
        protected List<MXStringQueryType> mestopovrede;
        @XmlElement(name = "MOZEOPTIKA")
        protected List<MXBooleanQueryType> mozeoptika;
        @XmlElement(name = "NOTEOPEN")
        protected List<MXStringQueryType> noteopen;
        @XmlElement(name = "OLA")
        protected List<MXBooleanQueryType> ola;
        @XmlElement(name = "OPERATORNAME")
        protected List<MXStringQueryType> operatorname;
        @XmlElement(name = "ORGID")
        protected List<MXStringQueryType> orgid;
        @XmlElement(name = "ORIGRECORDCLASS")
        protected List<MXStringQueryType> origrecordclass;
        @XmlElement(name = "ORIGRECORDID")
        protected List<MXStringQueryType> origrecordid;
        @XmlElement(name = "ORIGRECORGID")
        protected List<MXStringQueryType> origrecorgid;
        @XmlElement(name = "ORIGRECSITEID")
        protected List<MXStringQueryType> origrecsiteid;
        @XmlElement(name = "OUTAGEDURATION", nillable = true)
        protected List<MXDoubleQueryType> outageduration;
        @XmlElement(name = "OWNER")
        protected List<MXStringQueryType> owner;
        @XmlElement(name = "OWNERGROUP")
        protected List<MXStringQueryType> ownergroup;
        @XmlElement(name = "PAKET")
        protected List<MXStringQueryType> paket;
        @XmlElement(name = "PARICA")
        protected List<MXStringQueryType> parica;
        @XmlElement(name = "PLUSPADDRESSLINE2")
        protected List<MXStringQueryType> pluspaddressline2;
        @XmlElement(name = "PLUSPADDRESSLINE3")
        protected List<MXStringQueryType> pluspaddressline3;
        @XmlElement(name = "PLUSPADDRISCHANGED")
        protected List<MXBooleanQueryType> pluspaddrischanged;
        @XmlElement(name = "PLUSPTIMEZONE")
        protected List<MXStringQueryType> plusptimezone;
        @XmlElement(name = "PMCOMIMPACT", nillable = true)
        protected List<MXLongQueryType> pmcomimpact;
        @XmlElement(name = "PMCOMRESOLUTION")
        protected List<MXStringQueryType> pmcomresolution;
        @XmlElement(name = "PMCOMTYPE")
        protected List<MXStringQueryType> pmcomtype;
        @XmlElement(name = "PMCOMURGENCY", nillable = true)
        protected List<MXLongQueryType> pmcomurgency;
        @XmlElement(name = "POZICIJA")
        protected List<MXStringQueryType> pozicija;
        @XmlElement(name = "PRECKAID")
        protected List<MXStringQueryType> preckaid;
        @XmlElement(name = "PRESPOJBROJ")
        protected List<MXStringQueryType> prespojbroj;
        @XmlElement(name = "PRESPOJLINIJA")
        protected List<MXStringQueryType> prespojlinija;
        @XmlElement(name = "PROBLEMCODE")
        protected List<MXStringQueryType> problemcode;
        @XmlElement(name = "RAM")
        protected List<MXStringQueryType> ram;
        @XmlElement(name = "REBRO")
        protected List<MXStringQueryType> rebro;
        @XmlElement(name = "REGION", nillable = true)
        protected List<MXLongQueryType> region;
        @XmlElement(name = "RELATEDTOGLOBAL")
        protected List<MXBooleanQueryType> relatedtoglobal;
        @XmlElement(name = "REPORTDATE", nillable = true)
        protected List<MXDateTimeQueryType> reportdate;
        @XmlElement(name = "REPORTEDBY")
        protected List<MXStringQueryType> reportedby;
        @XmlElement(name = "REPORTEDEMAIL")
        protected List<MXStringQueryType> reportedemail;
        @XmlElement(name = "REPORTEDPHONE")
        protected List<MXStringQueryType> reportedphone;
        @XmlElement(name = "REPORTEDPRIORITY", nillable = true)
        protected List<MXLongQueryType> reportedpriority;
        @XmlElement(name = "ROOTCUSTOMERREF")
        protected List<MXStringQueryType> rootcustomerref;
        @XmlElement(name = "SEARCHSOURCE")
        protected List<MXStringQueryType> searchsource;
        @XmlElement(name = "SELFSERVSOLACCESS")
        protected List<MXBooleanQueryType> selfservsolaccess;
        @XmlElement(name = "SERIALNUMBERHGW")
        protected List<MXStringQueryType> serialnumberhgw;
        @XmlElement(name = "SERIALNUMBERSTB")
        protected List<MXStringQueryType> serialnumberstb;
        @XmlElement(name = "SERVICESINFAULT", nillable = true)
        protected List<MXLongQueryType> servicesinfault;
        @XmlElement(name = "SITEID")
        protected List<MXStringQueryType> siteid;
        @XmlElement(name = "SITEVISIT")
        protected List<MXBooleanQueryType> sitevisit;
        @XmlElement(name = "SOLUTION")
        protected List<MXStringQueryType> solution;
        @XmlElement(name = "SOURCE")
        protected List<MXStringQueryType> source;
        @XmlElement(name = "STATUS")
        protected List<MXStringQueryType> status;
        @XmlElement(name = "STATUSDATE", nillable = true)
        protected List<MXDateTimeQueryType> statusdate;
        @XmlElement(name = "STRING1")
        protected List<MXStringQueryType> string1;
        @XmlElement(name = "STRING2")
        protected List<MXStringQueryType> string2;
        @XmlElement(name = "STRING3")
        protected List<MXStringQueryType> string3;
        @XmlElement(name = "SUPERVISOR")
        protected List<MXStringQueryType> supervisor;
        @XmlElement(name = "TARGETCONTACTDATE", nillable = true)
        protected List<MXDateTimeQueryType> targetcontactdate;
        @XmlElement(name = "TARGETDESC")
        protected List<MXStringQueryType> targetdesc;
        @XmlElement(name = "TARGETFINISH", nillable = true)
        protected List<MXDateTimeQueryType> targetfinish;
        @XmlElement(name = "TARGETSTART", nillable = true)
        protected List<MXDateTimeQueryType> targetstart;
        @XmlElement(name = "TECHNICIANNAME")
        protected List<MXStringQueryType> technicianname;
        @XmlElement(name = "TEMPLATE")
        protected List<MXBooleanQueryType> template;
        @XmlElement(name = "TEMPLATEID")
        protected List<MXStringQueryType> templateid;
        @XmlElement(name = "TICKETID")
        protected List<MXStringQueryType> ticketid;
        @XmlElement(name = "TICKETUID", nillable = true)
        protected List<MXLongQueryType> ticketuid;
        @XmlElement(name = "TIPDSLAM")
        protected List<MXStringQueryType> tipdslam;
        @XmlElement(name = "TIPPRETPLATNIKA")
        protected List<MXStringQueryType> tippretplatnika;
        @XmlElement(name = "URGENCY", nillable = true)
        protected List<MXLongQueryType> urgency;
        @XmlElement(name = "VENDOR")
        protected List<MXStringQueryType> vendor;
        @XmlElement(name = "VIRTUALENV")
        protected List<MXBooleanQueryType> virtualenv;
        @XmlElement(name = "WORKLOG")
        protected TTINCIDENTQueryType.INCIDENT.WORKLOG worklog;

        /**
         * Gets the value of the adresaizvod property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the adresaizvod property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getADRESAIZVOD().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getADRESAIZVOD() {
            if (adresaizvod == null) {
                adresaizvod = new ArrayList<MXStringQueryType>();
            }
            return this.adresaizvod;
        }

        /**
         * Gets the value of the adresakorisnika property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the adresakorisnika property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getADRESAKORISNIKA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getADRESAKORISNIKA() {
            if (adresakorisnika == null) {
                adresakorisnika = new ArrayList<MXStringQueryType>();
            }
            return this.adresakorisnika;
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
         * Gets the value of the affectedemail property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the affectedemail property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getAFFECTEDEMAIL().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getAFFECTEDEMAIL() {
            if (affectedemail == null) {
                affectedemail = new ArrayList<MXStringQueryType>();
            }
            return this.affectedemail;
        }

        /**
         * Gets the value of the affectedperson property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the affectedperson property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getAFFECTEDPERSON().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getAFFECTEDPERSON() {
            if (affectedperson == null) {
                affectedperson = new ArrayList<MXStringQueryType>();
            }
            return this.affectedperson;
        }

        /**
         * Gets the value of the affectedphone property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the affectedphone property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getAFFECTEDPHONE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getAFFECTEDPHONE() {
            if (affectedphone == null) {
                affectedphone = new ArrayList<MXStringQueryType>();
            }
            return this.affectedphone;
        }

        /**
         * Gets the value of the assetnum property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the assetnum property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getASSETNUM().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getASSETNUM() {
            if (assetnum == null) {
                assetnum = new ArrayList<MXStringQueryType>();
            }
            return this.assetnum;
        }

        /**
         * Gets the value of the assetorgid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the assetorgid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getASSETORGID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getASSETORGID() {
            if (assetorgid == null) {
                assetorgid = new ArrayList<MXStringQueryType>();
            }
            return this.assetorgid;
        }

        /**
         * Gets the value of the assetsiteid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the assetsiteid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getASSETSITEID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getASSETSITEID() {
            if (assetsiteid == null) {
                assetsiteid = new ArrayList<MXStringQueryType>();
            }
            return this.assetsiteid;
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
         * Gets the value of the centralaport property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the centralaport property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCENTRALAPORT().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCENTRALAPORT() {
            if (centralaport == null) {
                centralaport = new ArrayList<MXStringQueryType>();
            }
            return this.centralaport;
        }

        /**
         * Gets the value of the changeby property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the changeby property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCHANGEBY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCHANGEBY() {
            if (changeby == null) {
                changeby = new ArrayList<MXStringQueryType>();
            }
            return this.changeby;
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
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCLASS() {
            if (_class == null) {
                _class = new ArrayList<MXStringQueryType>();
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
         * Gets the value of the commodity property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the commodity property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCOMMODITY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCOMMODITY() {
            if (commodity == null) {
                commodity = new ArrayList<MXStringQueryType>();
            }
            return this.commodity;
        }

        /**
         * Gets the value of the commoditygroup property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the commoditygroup property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCOMMODITYGROUP().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCOMMODITYGROUP() {
            if (commoditygroup == null) {
                commoditygroup = new ArrayList<MXStringQueryType>();
            }
            return this.commoditygroup;
        }

        /**
         * Gets the value of the contactemail property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the contactemail property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCONTACTEMAIL().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCONTACTEMAIL() {
            if (contactemail == null) {
                contactemail = new ArrayList<MXStringQueryType>();
            }
            return this.contactemail;
        }

        /**
         * Gets the value of the contactperson property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the contactperson property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCONTACTPERSON().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCONTACTPERSON() {
            if (contactperson == null) {
                contactperson = new ArrayList<MXStringQueryType>();
            }
            return this.contactperson;
        }

        /**
         * Gets the value of the contactphone property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the contactphone property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCONTACTPHONE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCONTACTPHONE() {
            if (contactphone == null) {
                contactphone = new ArrayList<MXStringQueryType>();
            }
            return this.contactphone;
        }

        /**
         * Gets the value of the correlationattrs property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the correlationattrs property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCORRELATIONATTRS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCORRELATIONATTRS() {
            if (correlationattrs == null) {
                correlationattrs = new ArrayList<MXStringQueryType>();
            }
            return this.correlationattrs;
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
         * Gets the value of the createwomulti property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the createwomulti property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCREATEWOMULTI().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCREATEWOMULTI() {
            if (createwomulti == null) {
                createwomulti = new ArrayList<MXStringQueryType>();
            }
            return this.createwomulti;
        }

        /**
         * Gets the value of the creationdate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the creationdate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCREATIONDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getCREATIONDATE() {
            if (creationdate == null) {
                creationdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.creationdate;
        }

        /**
         * Gets the value of the customerid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the customerid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCUSTOMERID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCUSTOMERID() {
            if (customerid == null) {
                customerid = new ArrayList<MXStringQueryType>();
            }
            return this.customerid;
        }

        /**
         * Gets the value of the customername property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the customername property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCUSTOMERNAME().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCUSTOMERNAME() {
            if (customername == null) {
                customername = new ArrayList<MXStringQueryType>();
            }
            return this.customername;
        }

        /**
         * Gets the value of the customervalue property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the customervalue property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getCUSTOMERVALUE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getCUSTOMERVALUE() {
            if (customervalue == null) {
                customervalue = new ArrayList<MXLongQueryType>();
            }
            return this.customervalue;
        }

        /**
         * Gets the value of the date1 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the date1 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDATE1().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getDATE1() {
            if (date1 == null) {
                date1 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.date1;
        }

        /**
         * Gets the value of the date2 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the date2 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDATE2().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getDATE2() {
            if (date2 == null) {
                date2 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.date2;
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
         * Gets the value of the descsrvid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the descsrvid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDESCSRVID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDESCSRVID() {
            if (descsrvid == null) {
                descsrvid = new ArrayList<MXStringQueryType>();
            }
            return this.descsrvid;
        }

        /**
         * Gets the value of the domen property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the domen property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDOMEN().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDOMEN() {
            if (domen == null) {
                domen = new ArrayList<MXStringQueryType>();
            }
            return this.domen;
        }

        /**
         * Gets the value of the dslamport property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dslamport property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDSLAMPORT().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDSLAMPORT() {
            if (dslamport == null) {
                dslamport = new ArrayList<MXStringQueryType>();
            }
            return this.dslamport;
        }

        /**
         * Gets the value of the externalrecid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the externalrecid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getEXTERNALRECID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getEXTERNALRECID() {
            if (externalrecid == null) {
                externalrecid = new ArrayList<MXStringQueryType>();
            }
            return this.externalrecid;
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
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getEXTERNALSYSTEM() {
            if (externalsystem == null) {
                externalsystem = new ArrayList<MXStringQueryType>();
            }
            return this.externalsystem;
        }

        /**
         * Gets the value of the externalsystemticketid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the externalsystemticketid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getEXTERNALSYSTEMTICKETID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getEXTERNALSYSTEMTICKETID() {
            if (externalsystemticketid == null) {
                externalsystemticketid = new ArrayList<MXStringQueryType>();
            }
            return this.externalsystemticketid;
        }

        /**
         * Gets the value of the extsysid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the extsysid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getEXTSYSID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getEXTSYSID() {
            if (extsysid == null) {
                extsysid = new ArrayList<MXStringQueryType>();
            }
            return this.extsysid;
        }

        /**
         * Gets the value of the failurecode property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the failurecode property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getFAILURECODE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getFAILURECODE() {
            if (failurecode == null) {
                failurecode = new ArrayList<MXStringQueryType>();
            }
            return this.failurecode;
        }

        /**
         * Gets the value of the faulttype property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the faulttype property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getFAULTTYPE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getFAULTTYPE() {
            if (faulttype == null) {
                faulttype = new ArrayList<MXLongQueryType>();
            }
            return this.faulttype;
        }

        /**
         * Gets the value of the fr1CODE property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the fr1CODE property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getFR1CODE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getFR1CODE() {
            if (fr1CODE == null) {
                fr1CODE = new ArrayList<MXStringQueryType>();
            }
            return this.fr1CODE;
        }

        /**
         * Gets the value of the fr2CODE property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the fr2CODE property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getFR2CODE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getFR2CODE() {
            if (fr2CODE == null) {
                fr2CODE = new ArrayList<MXStringQueryType>();
            }
            return this.fr2CODE;
        }

        /**
         * Gets the value of the globalticketclass property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the globalticketclass property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getGLOBALTICKETCLASS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getGLOBALTICKETCLASS() {
            if (globalticketclass == null) {
                globalticketclass = new ArrayList<MXStringQueryType>();
            }
            return this.globalticketclass;
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
         * Gets the value of the hasactivity property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the hasactivity property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getHASACTIVITY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getHASACTIVITY() {
            if (hasactivity == null) {
                hasactivity = new ArrayList<MXBooleanQueryType>();
            }
            return this.hasactivity;
        }

        /**
         * Gets the value of the hasld property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the hasld property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getHASLD().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getHASLD() {
            if (hasld == null) {
                hasld = new ArrayList<MXBooleanQueryType>();
            }
            return this.hasld;
        }

        /**
         * Gets the value of the hassolution property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the hassolution property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getHASSOLUTION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getHASSOLUTION() {
            if (hassolution == null) {
                hassolution = new ArrayList<MXBooleanQueryType>();
            }
            return this.hassolution;
        }

        /**
         * Gets the value of the hassupportcontract property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the hassupportcontract property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getHASSUPPORTCONTRACT().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getHASSUPPORTCONTRACT() {
            if (hassupportcontract == null) {
                hassupportcontract = new ArrayList<MXBooleanQueryType>();
            }
            return this.hassupportcontract;
        }

        /**
         * Gets the value of the hgwtip property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the hgwtip property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getHGWTIP().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getHGWTIP() {
            if (hgwtip == null) {
                hgwtip = new ArrayList<MXStringQueryType>();
            }
            return this.hgwtip;
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
         * Gets the value of the inheritstatus property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the inheritstatus property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getINHERITSTATUS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getINHERITSTATUS() {
            if (inheritstatus == null) {
                inheritstatus = new ArrayList<MXBooleanQueryType>();
            }
            return this.inheritstatus;
        }

        /**
         * Gets the value of the int1 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the int1 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getINT1().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINT1() {
            if (int1 == null) {
                int1 = new ArrayList<MXLongQueryType>();
            }
            return this.int1;
        }

        /**
         * Gets the value of the int2 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the int2 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getINT2().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINT2() {
            if (int2 == null) {
                int2 = new ArrayList<MXLongQueryType>();
            }
            return this.int2;
        }

        /**
         * Gets the value of the int3 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the int3 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getINT3().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINT3() {
            if (int3 == null) {
                int3 = new ArrayList<MXLongQueryType>();
            }
            return this.int3;
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
         * Gets the value of the isknownerror property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the isknownerror property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getISKNOWNERROR().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getISKNOWNERROR() {
            if (isknownerror == null) {
                isknownerror = new ArrayList<MXBooleanQueryType>();
            }
            return this.isknownerror;
        }

        /**
         * Gets the value of the isknownerrordate property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the isknownerrordate property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getISKNOWNERRORDATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getISKNOWNERRORDATE() {
            if (isknownerrordate == null) {
                isknownerrordate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.isknownerrordate;
        }

        /**
         * Gets the value of the izvod property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the izvod property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getIZVOD().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getIZVOD() {
            if (izvod == null) {
                izvod = new ArrayList<MXStringQueryType>();
            }
            return this.izvod;
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
         * Gets the value of the langcode property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the langcode property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getLANGCODE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLANGCODE() {
            if (langcode == null) {
                langcode = new ArrayList<MXStringQueryType>();
            }
            return this.langcode;
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
         * Gets the value of the mozeoptika property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the mozeoptika property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getMOZEOPTIKA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getMOZEOPTIKA() {
            if (mozeoptika == null) {
                mozeoptika = new ArrayList<MXBooleanQueryType>();
            }
            return this.mozeoptika;
        }

        /**
         * Gets the value of the noteopen property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the noteopen property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getNOTEOPEN().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getNOTEOPEN() {
            if (noteopen == null) {
                noteopen = new ArrayList<MXStringQueryType>();
            }
            return this.noteopen;
        }

        /**
         * Gets the value of the ola property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ola property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getOLA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getOLA() {
            if (ola == null) {
                ola = new ArrayList<MXBooleanQueryType>();
            }
            return this.ola;
        }

        /**
         * Gets the value of the operatorname property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the operatorname property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getOPERATORNAME().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getOPERATORNAME() {
            if (operatorname == null) {
                operatorname = new ArrayList<MXStringQueryType>();
            }
            return this.operatorname;
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
         * Gets the value of the origrecordclass property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the origrecordclass property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getORIGRECORDCLASS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getORIGRECORDCLASS() {
            if (origrecordclass == null) {
                origrecordclass = new ArrayList<MXStringQueryType>();
            }
            return this.origrecordclass;
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
         * Gets the value of the origrecorgid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the origrecorgid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getORIGRECORGID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getORIGRECORGID() {
            if (origrecorgid == null) {
                origrecorgid = new ArrayList<MXStringQueryType>();
            }
            return this.origrecorgid;
        }

        /**
         * Gets the value of the origrecsiteid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the origrecsiteid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getORIGRECSITEID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getORIGRECSITEID() {
            if (origrecsiteid == null) {
                origrecsiteid = new ArrayList<MXStringQueryType>();
            }
            return this.origrecsiteid;
        }

        /**
         * Gets the value of the outageduration property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the outageduration property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getOUTAGEDURATION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getOUTAGEDURATION() {
            if (outageduration == null) {
                outageduration = new ArrayList<MXDoubleQueryType>();
            }
            return this.outageduration;
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
         * Gets the value of the parica property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the parica property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPARICA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPARICA() {
            if (parica == null) {
                parica = new ArrayList<MXStringQueryType>();
            }
            return this.parica;
        }

        /**
         * Gets the value of the pluspaddressline2 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pluspaddressline2 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPLUSPADDRESSLINE2().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPADDRESSLINE2() {
            if (pluspaddressline2 == null) {
                pluspaddressline2 = new ArrayList<MXStringQueryType>();
            }
            return this.pluspaddressline2;
        }

        /**
         * Gets the value of the pluspaddressline3 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pluspaddressline3 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPLUSPADDRESSLINE3().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPADDRESSLINE3() {
            if (pluspaddressline3 == null) {
                pluspaddressline3 = new ArrayList<MXStringQueryType>();
            }
            return this.pluspaddressline3;
        }

        /**
         * Gets the value of the pluspaddrischanged property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pluspaddrischanged property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPLUSPADDRISCHANGED().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPLUSPADDRISCHANGED() {
            if (pluspaddrischanged == null) {
                pluspaddrischanged = new ArrayList<MXBooleanQueryType>();
            }
            return this.pluspaddrischanged;
        }

        /**
         * Gets the value of the plusptimezone property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the plusptimezone property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPLUSPTIMEZONE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPTIMEZONE() {
            if (plusptimezone == null) {
                plusptimezone = new ArrayList<MXStringQueryType>();
            }
            return this.plusptimezone;
        }

        /**
         * Gets the value of the pmcomimpact property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pmcomimpact property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPMCOMIMPACT().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMCOMIMPACT() {
            if (pmcomimpact == null) {
                pmcomimpact = new ArrayList<MXLongQueryType>();
            }
            return this.pmcomimpact;
        }

        /**
         * Gets the value of the pmcomresolution property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pmcomresolution property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPMCOMRESOLUTION().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCOMRESOLUTION() {
            if (pmcomresolution == null) {
                pmcomresolution = new ArrayList<MXStringQueryType>();
            }
            return this.pmcomresolution;
        }

        /**
         * Gets the value of the pmcomtype property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pmcomtype property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPMCOMTYPE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCOMTYPE() {
            if (pmcomtype == null) {
                pmcomtype = new ArrayList<MXStringQueryType>();
            }
            return this.pmcomtype;
        }

        /**
         * Gets the value of the pmcomurgency property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pmcomurgency property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPMCOMURGENCY().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMCOMURGENCY() {
            if (pmcomurgency == null) {
                pmcomurgency = new ArrayList<MXLongQueryType>();
            }
            return this.pmcomurgency;
        }

        /**
         * Gets the value of the pozicija property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pozicija property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPOZICIJA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPOZICIJA() {
            if (pozicija == null) {
                pozicija = new ArrayList<MXStringQueryType>();
            }
            return this.pozicija;
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
         * Gets the value of the prespojbroj property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the prespojbroj property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPRESPOJBROJ().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPRESPOJBROJ() {
            if (prespojbroj == null) {
                prespojbroj = new ArrayList<MXStringQueryType>();
            }
            return this.prespojbroj;
        }

        /**
         * Gets the value of the prespojlinija property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the prespojlinija property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPRESPOJLINIJA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPRESPOJLINIJA() {
            if (prespojlinija == null) {
                prespojlinija = new ArrayList<MXStringQueryType>();
            }
            return this.prespojlinija;
        }

        /**
         * Gets the value of the problemcode property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the problemcode property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPROBLEMCODE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPROBLEMCODE() {
            if (problemcode == null) {
                problemcode = new ArrayList<MXStringQueryType>();
            }
            return this.problemcode;
        }

        /**
         * Gets the value of the ram property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ram property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getRAM().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getRAM() {
            if (ram == null) {
                ram = new ArrayList<MXStringQueryType>();
            }
            return this.ram;
        }

        /**
         * Gets the value of the rebro property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rebro property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getREBRO().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREBRO() {
            if (rebro == null) {
                rebro = new ArrayList<MXStringQueryType>();
            }
            return this.rebro;
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
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getREGION() {
            if (region == null) {
                region = new ArrayList<MXLongQueryType>();
            }
            return this.region;
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
         * Gets the value of the reportedemail property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the reportedemail property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getREPORTEDEMAIL().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREPORTEDEMAIL() {
            if (reportedemail == null) {
                reportedemail = new ArrayList<MXStringQueryType>();
            }
            return this.reportedemail;
        }

        /**
         * Gets the value of the reportedphone property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the reportedphone property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getREPORTEDPHONE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREPORTEDPHONE() {
            if (reportedphone == null) {
                reportedphone = new ArrayList<MXStringQueryType>();
            }
            return this.reportedphone;
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
         * Gets the value of the rootcustomerref property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rootcustomerref property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getROOTCUSTOMERREF().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getROOTCUSTOMERREF() {
            if (rootcustomerref == null) {
                rootcustomerref = new ArrayList<MXStringQueryType>();
            }
            return this.rootcustomerref;
        }

        /**
         * Gets the value of the searchsource property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the searchsource property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSEARCHSOURCE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSEARCHSOURCE() {
            if (searchsource == null) {
                searchsource = new ArrayList<MXStringQueryType>();
            }
            return this.searchsource;
        }

        /**
         * Gets the value of the selfservsolaccess property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the selfservsolaccess property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSELFSERVSOLACCESS().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getSELFSERVSOLACCESS() {
            if (selfservsolaccess == null) {
                selfservsolaccess = new ArrayList<MXBooleanQueryType>();
            }
            return this.selfservsolaccess;
        }

        /**
         * Gets the value of the serialnumberhgw property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the serialnumberhgw property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSERIALNUMBERHGW().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSERIALNUMBERHGW() {
            if (serialnumberhgw == null) {
                serialnumberhgw = new ArrayList<MXStringQueryType>();
            }
            return this.serialnumberhgw;
        }

        /**
         * Gets the value of the serialnumberstb property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the serialnumberstb property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSERIALNUMBERSTB().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSERIALNUMBERSTB() {
            if (serialnumberstb == null) {
                serialnumberstb = new ArrayList<MXStringQueryType>();
            }
            return this.serialnumberstb;
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
         * Gets the value of the sitevisit property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sitevisit property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSITEVISIT().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getSITEVISIT() {
            if (sitevisit == null) {
                sitevisit = new ArrayList<MXBooleanQueryType>();
            }
            return this.sitevisit;
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
         * Gets the value of the source property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the source property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSOURCE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSOURCE() {
            if (source == null) {
                source = new ArrayList<MXStringQueryType>();
            }
            return this.source;
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
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSTATUS() {
            if (status == null) {
                status = new ArrayList<MXStringQueryType>();
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
         * Gets the value of the string1 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the string1 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSTRING1().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSTRING1() {
            if (string1 == null) {
                string1 = new ArrayList<MXStringQueryType>();
            }
            return this.string1;
        }

        /**
         * Gets the value of the string2 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the string2 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSTRING2().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSTRING2() {
            if (string2 == null) {
                string2 = new ArrayList<MXStringQueryType>();
            }
            return this.string2;
        }

        /**
         * Gets the value of the string3 property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the string3 property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSTRING3().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSTRING3() {
            if (string3 == null) {
                string3 = new ArrayList<MXStringQueryType>();
            }
            return this.string3;
        }

        /**
         * Gets the value of the supervisor property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the supervisor property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSUPERVISOR().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSUPERVISOR() {
            if (supervisor == null) {
                supervisor = new ArrayList<MXStringQueryType>();
            }
            return this.supervisor;
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
         * Gets the value of the targetdesc property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the targetdesc property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTARGETDESC().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTARGETDESC() {
            if (targetdesc == null) {
                targetdesc = new ArrayList<MXStringQueryType>();
            }
            return this.targetdesc;
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
         * Gets the value of the targetstart property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the targetstart property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTARGETSTART().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getTARGETSTART() {
            if (targetstart == null) {
                targetstart = new ArrayList<MXDateTimeQueryType>();
            }
            return this.targetstart;
        }

        /**
         * Gets the value of the technicianname property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the technicianname property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTECHNICIANNAME().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTECHNICIANNAME() {
            if (technicianname == null) {
                technicianname = new ArrayList<MXStringQueryType>();
            }
            return this.technicianname;
        }

        /**
         * Gets the value of the template property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the template property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTEMPLATE().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getTEMPLATE() {
            if (template == null) {
                template = new ArrayList<MXBooleanQueryType>();
            }
            return this.template;
        }

        /**
         * Gets the value of the templateid property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the templateid property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTEMPLATEID().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTEMPLATEID() {
            if (templateid == null) {
                templateid = new ArrayList<MXStringQueryType>();
            }
            return this.templateid;
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
         * Gets the value of the tipdslam property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tipdslam property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTIPDSLAM().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTIPDSLAM() {
            if (tipdslam == null) {
                tipdslam = new ArrayList<MXStringQueryType>();
            }
            return this.tipdslam;
        }

        /**
         * Gets the value of the tippretplatnika property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tippretplatnika property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTIPPRETPLATNIKA().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTIPPRETPLATNIKA() {
            if (tippretplatnika == null) {
                tippretplatnika = new ArrayList<MXStringQueryType>();
            }
            return this.tippretplatnika;
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
         * Gets the value of the vendor property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the vendor property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getVENDOR().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getVENDOR() {
            if (vendor == null) {
                vendor = new ArrayList<MXStringQueryType>();
            }
            return this.vendor;
        }

        /**
         * Gets the value of the virtualenv property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the virtualenv property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getVIRTUALENV().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getVIRTUALENV() {
            if (virtualenv == null) {
                virtualenv = new ArrayList<MXBooleanQueryType>();
            }
            return this.virtualenv;
        }

        /**
         * Gets the value of the worklog property.
         * 
         * @return
         *     possible object is
         *     {@link TTINCIDENTQueryType.INCIDENT.WORKLOG }
         *     
         */
        public TTINCIDENTQueryType.INCIDENT.WORKLOG getWORKLOG() {
            return worklog;
        }

        /**
         * Sets the value of the worklog property.
         * 
         * @param value
         *     allowed object is
         *     {@link TTINCIDENTQueryType.INCIDENT.WORKLOG }
         *     
         */
        public void setWORKLOG(TTINCIDENTQueryType.INCIDENT.WORKLOG value) {
            this.worklog = value;
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
         *         &amp;lt;element name="CLIENTVIEWABLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="CREATEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="CREATEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="LOGTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="MODIFYBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="MODIFYDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="RECORDKEY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
         *         &amp;lt;element name="WORKLOGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&amp;gt;
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
            "clientviewable",
            "createby",
            "createdate",
            "description",
            "logtype",
            "modifyby",
            "modifydate",
            "orgid",
            "recordkey",
            "siteid",
            "worklogid"
        })
        public static class WORKLOG {

            @XmlElement(name = "CLIENTVIEWABLE")
            protected List<MXBooleanQueryType> clientviewable;
            @XmlElement(name = "CREATEBY")
            protected List<MXStringQueryType> createby;
            @XmlElement(name = "CREATEDATE", nillable = true)
            protected List<MXDateTimeQueryType> createdate;
            @XmlElement(name = "DESCRIPTION")
            protected List<MXStringQueryType> description;
            @XmlElement(name = "LOGTYPE")
            protected List<MXStringQueryType> logtype;
            @XmlElement(name = "MODIFYBY")
            protected List<MXStringQueryType> modifyby;
            @XmlElement(name = "MODIFYDATE", nillable = true)
            protected List<MXDateTimeQueryType> modifydate;
            @XmlElement(name = "ORGID")
            protected List<MXStringQueryType> orgid;
            @XmlElement(name = "RECORDKEY")
            protected List<MXStringQueryType> recordkey;
            @XmlElement(name = "SITEID")
            protected List<MXStringQueryType> siteid;
            @XmlElement(name = "WORKLOGID", nillable = true)
            protected List<MXLongQueryType> worklogid;

            /**
             * Gets the value of the clientviewable property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the clientviewable property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getCLIENTVIEWABLE().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getCLIENTVIEWABLE() {
                if (clientviewable == null) {
                    clientviewable = new ArrayList<MXBooleanQueryType>();
                }
                return this.clientviewable;
            }

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
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getLOGTYPE() {
                if (logtype == null) {
                    logtype = new ArrayList<MXStringQueryType>();
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
             * Gets the value of the recordkey property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the recordkey property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getRECORDKEY().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getRECORDKEY() {
                if (recordkey == null) {
                    recordkey = new ArrayList<MXStringQueryType>();
                }
                return this.recordkey;
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

        }

    }

}


package TT_incident;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INCIDENTMboQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INCIDENTMboQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WHERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INCIDENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INTERNALPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="IMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="URGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ISGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="RELATEDTOGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="GLOBALTICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="GLOBALTICKETCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALRECID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SITEVISIT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="GLACCOUNT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXGLAccountQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INHERITSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ISKNOWNERROR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TEMPLATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HASACTIVITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ASSETSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TEMPLATEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ISKNOWNERRORDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="FR1CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="FR2CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TICKETUID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ASSETORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="LANGCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HASLD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CREATEWOMULTI" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SELFSERVSOLACCESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HASSOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CALCCALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPQUOTETYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPQUOTEDPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPAGREEMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCUSTOMER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCOSTCENTER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCUSTCHACCT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRNUMBER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRDIRPRFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRSTREET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRSTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRDIRSFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRUNITNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTREETADDRESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPREGIONDISTR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCOUNTY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTATEPROVINCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPOSTALCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCOUNTRY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPDIRECTIONS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPLATITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPLONGITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPREFPOINT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPGEOCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPRESPONSEPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPREVNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPRICESCHED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCUSTPONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPMAXPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPBILLBATCH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPBBLINENUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPOREQ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCALCCALNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMRESOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SEARCHSOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INDICATEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALSYSTEM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DESCSRVID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CREATEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CREATIONDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="VIRTUALENV" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OUTAGEDURATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSIFICATIONID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCCRID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCITEMNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCOFFSUMMARY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCQUANTITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACCUMULATEDHOLDTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETRESPONSETIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CORRELATIONATTRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMERNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="KATEGORIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADRESAKORISNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OPERATORNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMERVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OLA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="NOTEOPEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACTPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACTPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACTEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ROOTCUSTOMERREF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TECHNICIANNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HASSUPPORTCONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DOMEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DSLAMPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SERIALNUMBERSTB" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HGWTIP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="LINISKAOPREMA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADRESAIZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SERIALNUMBERHGW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PAKET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CENTRALA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="KABEL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="IZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PARICA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="RAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REBRO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="POZICIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CENTRALAPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PRESPOJBROJ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PRESPOJLINIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TIPDSLAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="MOZEOPTIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STRING1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STRING2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STRING3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INT1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INT2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INT3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DATE1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DATE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="EXTSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}QueryClausePropertyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCIDENTMboQueryType", propOrder = {
    "where",
    "incident"
})
public class INCIDENTMboQueryType {

    @XmlElement(name = "WHERE")
    protected String where;
    @XmlElement(name = "INCIDENT")
    protected INCIDENTMboQueryType.INCIDENT incident;
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
     *     {@link INCIDENTMboQueryType.INCIDENT }
     *     
     */
    public INCIDENTMboQueryType.INCIDENT getINCIDENT() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link INCIDENTMboQueryType.INCIDENT }
     *     
     */
    public void setINCIDENT(INCIDENTMboQueryType.INCIDENT value) {
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
     *         &lt;element name="TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INTERNALPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="IMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="URGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ISGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="RELATEDTOGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="GLOBALTICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="GLOBALTICKETCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALRECID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SITEVISIT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="GLACCOUNT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXGLAccountQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INHERITSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ISKNOWNERROR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TARGETSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TARGETFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TEMPLATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HASACTIVITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ASSETSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TEMPLATEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ISKNOWNERRORDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TARGETCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="FR1CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="FR2CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TICKETUID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ASSETORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="LANGCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HASLD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CREATEWOMULTI" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SELFSERVSOLACCESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HASSOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CALCCALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPQUOTETYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPQUOTEDPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPAGREEMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCUSTOMER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCOSTCENTER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCUSTCHACCT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRNUMBER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRDIRPRFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRSTREET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRSTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRDIRSFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRUNITNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTREETADDRESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPREGIONDISTR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCOUNTY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTATEPROVINCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPOSTALCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCOUNTRY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPDIRECTIONS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPLATITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPLONGITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPREFPOINT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPGEOCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPRESPONSEPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPREVNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPRICESCHED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCUSTPONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPMAXPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPBILLBATCH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPBBLINENUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPOREQ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCALCCALNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMRESOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SEARCHSOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INDICATEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALSYSTEM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DESCSRVID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CREATEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CREATIONDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="VIRTUALENV" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OUTAGEDURATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CLASSIFICATIONID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMSCCRID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMSCITEMNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMSCOFFSUMMARY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMSCQUANTITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACCUMULATEDHOLDTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETRESPONSETIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CORRELATIONATTRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMERNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="KATEGORIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADRESAKORISNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OPERATORNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMERVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OLA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="NOTEOPEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CONTACTPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CONTACTPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CONTACTEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ROOTCUSTOMERREF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TECHNICIANNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HASSUPPORTCONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DOMEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DSLAMPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SERIALNUMBERSTB" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HGWTIP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="LINISKAOPREMA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADRESAIZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SERIALNUMBERHGW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PAKET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CENTRALA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="KABEL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="IZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PARICA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="RAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REBRO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="POZICIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CENTRALAPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PRESPOJBROJ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PRESPOJLINIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TIPDSLAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="MOZEOPTIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STRING1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STRING2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STRING3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INT1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INT2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INT3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DATE1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DATE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="EXTSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
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
        "ticketid",
        "_class",
        "description",
        "status",
        "statusdate",
        "reportedpriority",
        "internalpriority",
        "impact",
        "urgency",
        "reportedby",
        "reportdate",
        "affectedperson",
        "affecteddate",
        "source",
        "supervisor",
        "owner",
        "ownergroup",
        "isglobal",
        "relatedtoglobal",
        "globalticketid",
        "globalticketclass",
        "externalrecid",
        "sitevisit",
        "origrecordid",
        "origrecordclass",
        "glaccount",
        "commoditygroup",
        "commodity",
        "inheritstatus",
        "isknownerror",
        "targetstart",
        "targetfinish",
        "actualstart",
        "actualfinish",
        "origrecsiteid",
        "origrecorgid",
        "siteid",
        "orgid",
        "changedate",
        "changeby",
        "historyflag",
        "template",
        "hasactivity",
        "failurecode",
        "problemcode",
        "actlabhrs",
        "actlabcost",
        "affectedphone",
        "reportedphone",
        "affectedemail",
        "reportedemail",
        "assetsiteid",
        "templateid",
        "vendor",
        "assetnum",
        "location",
        "classstructureid",
        "isknownerrordate",
        "targetcontactdate",
        "actualcontactdate",
        "fr1CODE",
        "fr2CODE",
        "ticketuid",
        "solution",
        "assetorgid",
        "langcode",
        "hasld",
        "cinum",
        "createwomulti",
        "targetdesc",
        "selfservsolaccess",
        "hassolution",
        "calcorgid",
        "calccalendar",
        "calcshift",
        "pluspquotetype",
        "pluspquotedprice",
        "pluspagreement",
        "pluspcustomer",
        "pluspcostcenter",
        "pluspcustchacct",
        "pluspstaddrnumber",
        "pluspstaddrdirprfx",
        "pluspstaddrstreet",
        "pluspstaddrsttype",
        "pluspstaddrdirsfx",
        "pluspstaddrunitnum",
        "pluspstreetaddress",
        "pluspaddressline2",
        "pluspaddressline3",
        "pluspcity",
        "pluspregiondistr",
        "pluspcounty",
        "pluspstateprovince",
        "plusppostalcode",
        "pluspcountry",
        "pluspdirections",
        "plusptimezone",
        "plusplatitude",
        "plusplongitude",
        "plusprefpoint",
        "pluspgeocode",
        "pluspresponseplan",
        "plusprevnum",
        "plusppricesched",
        "pluspcustponum",
        "pluspmaxprice",
        "pluspbillbatch",
        "pluspbblinenum",
        "pluspaddrischanged",
        "pluspporeq",
        "pluspcalcorgid",
        "pluspcalccalnum",
        "pluspcalcshift",
        "pmcomtype",
        "pmcomresolution",
        "pmcomimpact",
        "pmcomurgency",
        "searchsource",
        "indicatedpriority",
        "externalsystemticketid",
        "externalsystem",
        "descsrvid",
        "createdby",
        "creationdate",
        "virtualenv",
        "outageduration",
        "classificationid",
        "pmsccrid",
        "pmscitemnum",
        "pmscoffsummary",
        "pmscquantity",
        "assignedownergroup",
        "accumulatedholdtime",
        "adjustedtargetcontacttime",
        "adjustedtargetresponsetime",
        "adjustedtargetresolutiontime",
        "correlationattrs",
        "faulttype",
        "customername",
        "customerid",
        "kategorija",
        "region",
        "adresakorisnika",
        "operatorname",
        "customervalue",
        "ola",
        "noteopen",
        "contactphone",
        "contactperson",
        "contactemail",
        "lineid",
        "rootcustomerref",
        "technicianname",
        "hassupportcontract",
        "servicesinfault",
        "preckaid",
        "domen",
        "dslamport",
        "serialnumberstb",
        "hgwtip",
        "liniskaoprema",
        "adresaizvod",
        "serialnumberhgw",
        "paket",
        "centrala",
        "kabel",
        "izvod",
        "parica",
        "ram",
        "rebro",
        "pozicija",
        "centralaport",
        "prespojbroj",
        "prespojlinija",
        "tipdslam",
        "mozeoptika",
        "string1",
        "string2",
        "string3",
        "int1",
        "int2",
        "int3",
        "date1",
        "date2",
        "extsysid"
    })
    public static class INCIDENT {

        @XmlElement(name = "TICKETID")
        protected List<MXStringQueryType> ticketid;
        @XmlElement(name = "CLASS")
        protected List<MXStringQueryType> _class;
        @XmlElement(name = "DESCRIPTION")
        protected List<MXStringQueryType> description;
        @XmlElement(name = "STATUS")
        protected List<MXStringQueryType> status;
        @XmlElement(name = "STATUSDATE", nillable = true)
        protected List<MXDateTimeQueryType> statusdate;
        @XmlElement(name = "REPORTEDPRIORITY", nillable = true)
        protected List<MXLongQueryType> reportedpriority;
        @XmlElement(name = "INTERNALPRIORITY", nillable = true)
        protected List<MXLongQueryType> internalpriority;
        @XmlElement(name = "IMPACT", nillable = true)
        protected List<MXLongQueryType> impact;
        @XmlElement(name = "URGENCY", nillable = true)
        protected List<MXLongQueryType> urgency;
        @XmlElement(name = "REPORTEDBY")
        protected List<MXStringQueryType> reportedby;
        @XmlElement(name = "REPORTDATE", nillable = true)
        protected List<MXDateTimeQueryType> reportdate;
        @XmlElement(name = "AFFECTEDPERSON")
        protected List<MXStringQueryType> affectedperson;
        @XmlElement(name = "AFFECTEDDATE", nillable = true)
        protected List<MXDateTimeQueryType> affecteddate;
        @XmlElement(name = "SOURCE")
        protected List<MXStringQueryType> source;
        @XmlElement(name = "SUPERVISOR")
        protected List<MXStringQueryType> supervisor;
        @XmlElement(name = "OWNER")
        protected List<MXStringQueryType> owner;
        @XmlElement(name = "OWNERGROUP")
        protected List<MXStringQueryType> ownergroup;
        @XmlElement(name = "ISGLOBAL")
        protected List<MXBooleanQueryType> isglobal;
        @XmlElement(name = "RELATEDTOGLOBAL")
        protected List<MXBooleanQueryType> relatedtoglobal;
        @XmlElement(name = "GLOBALTICKETID")
        protected List<MXStringQueryType> globalticketid;
        @XmlElement(name = "GLOBALTICKETCLASS")
        protected List<MXStringQueryType> globalticketclass;
        @XmlElement(name = "EXTERNALRECID")
        protected List<MXStringQueryType> externalrecid;
        @XmlElement(name = "SITEVISIT")
        protected List<MXBooleanQueryType> sitevisit;
        @XmlElement(name = "ORIGRECORDID")
        protected List<MXStringQueryType> origrecordid;
        @XmlElement(name = "ORIGRECORDCLASS")
        protected List<MXStringQueryType> origrecordclass;
        @XmlElement(name = "GLACCOUNT")
        protected List<MXGLAccountQueryType> glaccount;
        @XmlElement(name = "COMMODITYGROUP")
        protected List<MXStringQueryType> commoditygroup;
        @XmlElement(name = "COMMODITY")
        protected List<MXStringQueryType> commodity;
        @XmlElement(name = "INHERITSTATUS")
        protected List<MXBooleanQueryType> inheritstatus;
        @XmlElement(name = "ISKNOWNERROR")
        protected List<MXBooleanQueryType> isknownerror;
        @XmlElement(name = "TARGETSTART", nillable = true)
        protected List<MXDateTimeQueryType> targetstart;
        @XmlElement(name = "TARGETFINISH", nillable = true)
        protected List<MXDateTimeQueryType> targetfinish;
        @XmlElement(name = "ACTUALSTART", nillable = true)
        protected List<MXDateTimeQueryType> actualstart;
        @XmlElement(name = "ACTUALFINISH", nillable = true)
        protected List<MXDateTimeQueryType> actualfinish;
        @XmlElement(name = "ORIGRECSITEID")
        protected List<MXStringQueryType> origrecsiteid;
        @XmlElement(name = "ORIGRECORGID")
        protected List<MXStringQueryType> origrecorgid;
        @XmlElement(name = "SITEID")
        protected List<MXStringQueryType> siteid;
        @XmlElement(name = "ORGID")
        protected List<MXStringQueryType> orgid;
        @XmlElement(name = "CHANGEDATE", nillable = true)
        protected List<MXDateTimeQueryType> changedate;
        @XmlElement(name = "CHANGEBY")
        protected List<MXStringQueryType> changeby;
        @XmlElement(name = "HISTORYFLAG")
        protected List<MXBooleanQueryType> historyflag;
        @XmlElement(name = "TEMPLATE")
        protected List<MXBooleanQueryType> template;
        @XmlElement(name = "HASACTIVITY")
        protected List<MXBooleanQueryType> hasactivity;
        @XmlElement(name = "FAILURECODE")
        protected List<MXStringQueryType> failurecode;
        @XmlElement(name = "PROBLEMCODE")
        protected List<MXStringQueryType> problemcode;
        @XmlElement(name = "ACTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> actlabhrs;
        @XmlElement(name = "ACTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> actlabcost;
        @XmlElement(name = "AFFECTEDPHONE")
        protected List<MXStringQueryType> affectedphone;
        @XmlElement(name = "REPORTEDPHONE")
        protected List<MXStringQueryType> reportedphone;
        @XmlElement(name = "AFFECTEDEMAIL")
        protected List<MXStringQueryType> affectedemail;
        @XmlElement(name = "REPORTEDEMAIL")
        protected List<MXStringQueryType> reportedemail;
        @XmlElement(name = "ASSETSITEID")
        protected List<MXStringQueryType> assetsiteid;
        @XmlElement(name = "TEMPLATEID")
        protected List<MXStringQueryType> templateid;
        @XmlElement(name = "VENDOR")
        protected List<MXStringQueryType> vendor;
        @XmlElement(name = "ASSETNUM")
        protected List<MXStringQueryType> assetnum;
        @XmlElement(name = "LOCATION")
        protected List<MXStringQueryType> location;
        @XmlElement(name = "CLASSSTRUCTUREID")
        protected List<MXStringQueryType> classstructureid;
        @XmlElement(name = "ISKNOWNERRORDATE", nillable = true)
        protected List<MXDateTimeQueryType> isknownerrordate;
        @XmlElement(name = "TARGETCONTACTDATE", nillable = true)
        protected List<MXDateTimeQueryType> targetcontactdate;
        @XmlElement(name = "ACTUALCONTACTDATE", nillable = true)
        protected List<MXDateTimeQueryType> actualcontactdate;
        @XmlElement(name = "FR1CODE")
        protected List<MXStringQueryType> fr1CODE;
        @XmlElement(name = "FR2CODE")
        protected List<MXStringQueryType> fr2CODE;
        @XmlElement(name = "TICKETUID", nillable = true)
        protected List<MXLongQueryType> ticketuid;
        @XmlElement(name = "SOLUTION")
        protected List<MXStringQueryType> solution;
        @XmlElement(name = "ASSETORGID")
        protected List<MXStringQueryType> assetorgid;
        @XmlElement(name = "LANGCODE")
        protected List<MXStringQueryType> langcode;
        @XmlElement(name = "HASLD")
        protected List<MXBooleanQueryType> hasld;
        @XmlElement(name = "CINUM")
        protected List<MXStringQueryType> cinum;
        @XmlElement(name = "CREATEWOMULTI")
        protected List<MXStringQueryType> createwomulti;
        @XmlElement(name = "TARGETDESC")
        protected List<MXStringQueryType> targetdesc;
        @XmlElement(name = "SELFSERVSOLACCESS")
        protected List<MXBooleanQueryType> selfservsolaccess;
        @XmlElement(name = "HASSOLUTION")
        protected List<MXBooleanQueryType> hassolution;
        @XmlElement(name = "CALCORGID")
        protected List<MXStringQueryType> calcorgid;
        @XmlElement(name = "CALCCALENDAR")
        protected List<MXStringQueryType> calccalendar;
        @XmlElement(name = "CALCSHIFT")
        protected List<MXStringQueryType> calcshift;
        @XmlElement(name = "PLUSPQUOTETYPE")
        protected List<MXStringQueryType> pluspquotetype;
        @XmlElement(name = "PLUSPQUOTEDPRICE", nillable = true)
        protected List<MXDoubleQueryType> pluspquotedprice;
        @XmlElement(name = "PLUSPAGREEMENT")
        protected List<MXStringQueryType> pluspagreement;
        @XmlElement(name = "PLUSPCUSTOMER")
        protected List<MXStringQueryType> pluspcustomer;
        @XmlElement(name = "PLUSPCOSTCENTER")
        protected List<MXStringQueryType> pluspcostcenter;
        @XmlElement(name = "PLUSPCUSTCHACCT")
        protected List<MXStringQueryType> pluspcustchacct;
        @XmlElement(name = "PLUSPSTADDRNUMBER")
        protected List<MXStringQueryType> pluspstaddrnumber;
        @XmlElement(name = "PLUSPSTADDRDIRPRFX")
        protected List<MXStringQueryType> pluspstaddrdirprfx;
        @XmlElement(name = "PLUSPSTADDRSTREET")
        protected List<MXStringQueryType> pluspstaddrstreet;
        @XmlElement(name = "PLUSPSTADDRSTTYPE")
        protected List<MXStringQueryType> pluspstaddrsttype;
        @XmlElement(name = "PLUSPSTADDRDIRSFX")
        protected List<MXStringQueryType> pluspstaddrdirsfx;
        @XmlElement(name = "PLUSPSTADDRUNITNUM")
        protected List<MXStringQueryType> pluspstaddrunitnum;
        @XmlElement(name = "PLUSPSTREETADDRESS")
        protected List<MXStringQueryType> pluspstreetaddress;
        @XmlElement(name = "PLUSPADDRESSLINE2")
        protected List<MXStringQueryType> pluspaddressline2;
        @XmlElement(name = "PLUSPADDRESSLINE3")
        protected List<MXStringQueryType> pluspaddressline3;
        @XmlElement(name = "PLUSPCITY")
        protected List<MXStringQueryType> pluspcity;
        @XmlElement(name = "PLUSPREGIONDISTR")
        protected List<MXStringQueryType> pluspregiondistr;
        @XmlElement(name = "PLUSPCOUNTY")
        protected List<MXStringQueryType> pluspcounty;
        @XmlElement(name = "PLUSPSTATEPROVINCE")
        protected List<MXStringQueryType> pluspstateprovince;
        @XmlElement(name = "PLUSPPOSTALCODE")
        protected List<MXStringQueryType> plusppostalcode;
        @XmlElement(name = "PLUSPCOUNTRY")
        protected List<MXStringQueryType> pluspcountry;
        @XmlElement(name = "PLUSPDIRECTIONS")
        protected List<MXStringQueryType> pluspdirections;
        @XmlElement(name = "PLUSPTIMEZONE")
        protected List<MXStringQueryType> plusptimezone;
        @XmlElement(name = "PLUSPLATITUDE", nillable = true)
        protected List<MXDoubleQueryType> plusplatitude;
        @XmlElement(name = "PLUSPLONGITUDE", nillable = true)
        protected List<MXDoubleQueryType> plusplongitude;
        @XmlElement(name = "PLUSPREFPOINT")
        protected List<MXStringQueryType> plusprefpoint;
        @XmlElement(name = "PLUSPGEOCODE")
        protected List<MXStringQueryType> pluspgeocode;
        @XmlElement(name = "PLUSPRESPONSEPLAN")
        protected List<MXStringQueryType> pluspresponseplan;
        @XmlElement(name = "PLUSPREVNUM", nillable = true)
        protected List<MXLongQueryType> plusprevnum;
        @XmlElement(name = "PLUSPPRICESCHED")
        protected List<MXStringQueryType> plusppricesched;
        @XmlElement(name = "PLUSPCUSTPONUM")
        protected List<MXStringQueryType> pluspcustponum;
        @XmlElement(name = "PLUSPMAXPRICE", nillable = true)
        protected List<MXDoubleQueryType> pluspmaxprice;
        @XmlElement(name = "PLUSPBILLBATCH")
        protected List<MXStringQueryType> pluspbillbatch;
        @XmlElement(name = "PLUSPBBLINENUM", nillable = true)
        protected List<MXLongQueryType> pluspbblinenum;
        @XmlElement(name = "PLUSPADDRISCHANGED")
        protected List<MXBooleanQueryType> pluspaddrischanged;
        @XmlElement(name = "PLUSPPOREQ")
        protected List<MXBooleanQueryType> pluspporeq;
        @XmlElement(name = "PLUSPCALCORGID")
        protected List<MXStringQueryType> pluspcalcorgid;
        @XmlElement(name = "PLUSPCALCCALNUM")
        protected List<MXStringQueryType> pluspcalccalnum;
        @XmlElement(name = "PLUSPCALCSHIFT")
        protected List<MXStringQueryType> pluspcalcshift;
        @XmlElement(name = "PMCOMTYPE")
        protected List<MXStringQueryType> pmcomtype;
        @XmlElement(name = "PMCOMRESOLUTION")
        protected List<MXStringQueryType> pmcomresolution;
        @XmlElement(name = "PMCOMIMPACT", nillable = true)
        protected List<MXLongQueryType> pmcomimpact;
        @XmlElement(name = "PMCOMURGENCY", nillable = true)
        protected List<MXLongQueryType> pmcomurgency;
        @XmlElement(name = "SEARCHSOURCE")
        protected List<MXStringQueryType> searchsource;
        @XmlElement(name = "INDICATEDPRIORITY", nillable = true)
        protected List<MXLongQueryType> indicatedpriority;
        @XmlElement(name = "EXTERNALSYSTEM_TICKETID")
        protected List<MXStringQueryType> externalsystemticketid;
        @XmlElement(name = "EXTERNALSYSTEM")
        protected List<MXStringQueryType> externalsystem;
        @XmlElement(name = "DESCSRVID")
        protected List<MXStringQueryType> descsrvid;
        @XmlElement(name = "CREATEDBY")
        protected List<MXStringQueryType> createdby;
        @XmlElement(name = "CREATIONDATE", nillable = true)
        protected List<MXDateTimeQueryType> creationdate;
        @XmlElement(name = "VIRTUALENV")
        protected List<MXBooleanQueryType> virtualenv;
        @XmlElement(name = "OUTAGEDURATION", nillable = true)
        protected List<MXDoubleQueryType> outageduration;
        @XmlElement(name = "CLASSIFICATIONID")
        protected List<MXStringQueryType> classificationid;
        @XmlElement(name = "PMSCCRID")
        protected List<MXStringQueryType> pmsccrid;
        @XmlElement(name = "PMSCITEMNUM")
        protected List<MXStringQueryType> pmscitemnum;
        @XmlElement(name = "PMSCOFFSUMMARY")
        protected List<MXStringQueryType> pmscoffsummary;
        @XmlElement(name = "PMSCQUANTITY", nillable = true)
        protected List<MXLongQueryType> pmscquantity;
        @XmlElement(name = "ASSIGNEDOWNERGROUP")
        protected List<MXStringQueryType> assignedownergroup;
        @XmlElement(name = "ACCUMULATEDHOLDTIME", nillable = true)
        protected List<MXDoubleQueryType> accumulatedholdtime;
        @XmlElement(name = "ADJUSTEDTARGETCONTACTTIME", nillable = true)
        protected List<MXDateTimeQueryType> adjustedtargetcontacttime;
        @XmlElement(name = "ADJUSTEDTARGETRESPONSETIME", nillable = true)
        protected List<MXDateTimeQueryType> adjustedtargetresponsetime;
        @XmlElement(name = "ADJUSTEDTARGETRESOLUTIONTIME", nillable = true)
        protected List<MXDateTimeQueryType> adjustedtargetresolutiontime;
        @XmlElement(name = "CORRELATIONATTRS")
        protected List<MXStringQueryType> correlationattrs;
        @XmlElement(name = "FAULTTYPE", nillable = true)
        protected List<MXLongQueryType> faulttype;
        @XmlElement(name = "CUSTOMERNAME")
        protected List<MXStringQueryType> customername;
        @XmlElement(name = "CUSTOMERID")
        protected List<MXStringQueryType> customerid;
        @XmlElement(name = "KATEGORIJA", nillable = true)
        protected List<MXLongQueryType> kategorija;
        @XmlElement(name = "REGION", nillable = true)
        protected List<MXLongQueryType> region;
        @XmlElement(name = "ADRESAKORISNIKA")
        protected List<MXStringQueryType> adresakorisnika;
        @XmlElement(name = "OPERATORNAME")
        protected List<MXStringQueryType> operatorname;
        @XmlElement(name = "CUSTOMERVALUE", nillable = true)
        protected List<MXLongQueryType> customervalue;
        @XmlElement(name = "OLA")
        protected List<MXBooleanQueryType> ola;
        @XmlElement(name = "NOTEOPEN")
        protected List<MXStringQueryType> noteopen;
        @XmlElement(name = "CONTACTPHONE")
        protected List<MXStringQueryType> contactphone;
        @XmlElement(name = "CONTACTPERSON")
        protected List<MXStringQueryType> contactperson;
        @XmlElement(name = "CONTACTEMAIL")
        protected List<MXStringQueryType> contactemail;
        @XmlElement(name = "LINEID")
        protected List<MXStringQueryType> lineid;
        @XmlElement(name = "ROOTCUSTOMERREF")
        protected List<MXStringQueryType> rootcustomerref;
        @XmlElement(name = "TECHNICIANNAME")
        protected List<MXStringQueryType> technicianname;
        @XmlElement(name = "HASSUPPORTCONTRACT")
        protected List<MXBooleanQueryType> hassupportcontract;
        @XmlElement(name = "SERVICESINFAULT", nillable = true)
        protected List<MXLongQueryType> servicesinfault;
        @XmlElement(name = "PRECKAID")
        protected List<MXStringQueryType> preckaid;
        @XmlElement(name = "DOMEN")
        protected List<MXStringQueryType> domen;
        @XmlElement(name = "DSLAMPORT")
        protected List<MXStringQueryType> dslamport;
        @XmlElement(name = "SERIALNUMBERSTB")
        protected List<MXStringQueryType> serialnumberstb;
        @XmlElement(name = "HGWTIP")
        protected List<MXStringQueryType> hgwtip;
        @XmlElement(name = "LINISKAOPREMA")
        protected List<MXStringQueryType> liniskaoprema;
        @XmlElement(name = "ADRESAIZVOD")
        protected List<MXStringQueryType> adresaizvod;
        @XmlElement(name = "SERIALNUMBERHGW")
        protected List<MXStringQueryType> serialnumberhgw;
        @XmlElement(name = "PAKET")
        protected List<MXStringQueryType> paket;
        @XmlElement(name = "CENTRALA")
        protected List<MXStringQueryType> centrala;
        @XmlElement(name = "KABEL")
        protected List<MXStringQueryType> kabel;
        @XmlElement(name = "IZVOD")
        protected List<MXStringQueryType> izvod;
        @XmlElement(name = "PARICA")
        protected List<MXStringQueryType> parica;
        @XmlElement(name = "RAM")
        protected List<MXStringQueryType> ram;
        @XmlElement(name = "REBRO")
        protected List<MXStringQueryType> rebro;
        @XmlElement(name = "POZICIJA")
        protected List<MXStringQueryType> pozicija;
        @XmlElement(name = "CENTRALAPORT")
        protected List<MXStringQueryType> centralaport;
        @XmlElement(name = "PRESPOJBROJ")
        protected List<MXStringQueryType> prespojbroj;
        @XmlElement(name = "PRESPOJLINIJA")
        protected List<MXStringQueryType> prespojlinija;
        @XmlElement(name = "TIPDSLAM")
        protected List<MXStringQueryType> tipdslam;
        @XmlElement(name = "MOZEOPTIKA")
        protected List<MXBooleanQueryType> mozeoptika;
        @XmlElement(name = "STRING1")
        protected List<MXStringQueryType> string1;
        @XmlElement(name = "STRING2")
        protected List<MXStringQueryType> string2;
        @XmlElement(name = "STRING3")
        protected List<MXStringQueryType> string3;
        @XmlElement(name = "INT1", nillable = true)
        protected List<MXLongQueryType> int1;
        @XmlElement(name = "INT2", nillable = true)
        protected List<MXLongQueryType> int2;
        @XmlElement(name = "INT3", nillable = true)
        protected List<MXLongQueryType> int3;
        @XmlElement(name = "DATE1", nillable = true)
        protected List<MXDateTimeQueryType> date1;
        @XmlElement(name = "DATE2", nillable = true)
        protected List<MXDateTimeQueryType> date2;
        @XmlElement(name = "EXTSYSID")
        protected List<MXStringQueryType> extsysid;

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
         * Gets the value of the affectedperson property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedperson property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAFFECTEDPERSON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the source property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the source property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOURCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the supervisor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supervisor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUPERVISOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the globalticketclass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the globalticketclass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLOBALTICKETCLASS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the externalrecid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalrecid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXTERNALRECID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the sitevisit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sitevisit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSITEVISIT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the origrecordclass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the origrecordclass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORIGRECORDCLASS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the glaccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the glaccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLACCOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXGLAccountQueryType }
         * 
         * 
         */
        public List<MXGLAccountQueryType> getGLACCOUNT() {
            if (glaccount == null) {
                glaccount = new ArrayList<MXGLAccountQueryType>();
            }
            return this.glaccount;
        }

        /**
         * Gets the value of the commoditygroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commoditygroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMMODITYGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the commodity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commodity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOMMODITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the inheritstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inheritstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINHERITSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the isknownerror property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the isknownerror property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getISKNOWNERROR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the targetstart property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetstart property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTARGETSTART().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the origrecsiteid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the origrecsiteid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORIGRECSITEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the origrecorgid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the origrecorgid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORIGRECORGID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the changeby property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the changeby property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHANGEBY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the template property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the template property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTEMPLATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the hasactivity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hasactivity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHASACTIVITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the failurecode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the failurecode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFAILURECODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the problemcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the problemcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPROBLEMCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the actlabhrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actlabhrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTLABHRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTLABHRS() {
            if (actlabhrs == null) {
                actlabhrs = new ArrayList<MXDoubleQueryType>();
            }
            return this.actlabhrs;
        }

        /**
         * Gets the value of the actlabcost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actlabcost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACTLABCOST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACTLABCOST() {
            if (actlabcost == null) {
                actlabcost = new ArrayList<MXDoubleQueryType>();
            }
            return this.actlabcost;
        }

        /**
         * Gets the value of the affectedphone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedphone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAFFECTEDPHONE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the reportedphone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportedphone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPORTEDPHONE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the affectedemail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedemail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAFFECTEDEMAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the reportedemail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportedemail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPORTEDEMAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the assetsiteid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetsiteid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSETSITEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the templateid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the templateid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTEMPLATEID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the vendor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVENDOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the assetnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSETNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the isknownerrordate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the isknownerrordate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getISKNOWNERRORDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the fr1CODE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fr1CODE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFR1CODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fr2CODE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFR2CODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the assetorgid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetorgid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSETORGID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the langcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the langcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLANGCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the hasld property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hasld property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHASLD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the createwomulti property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the createwomulti property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCREATEWOMULTI().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the targetdesc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetdesc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTARGETDESC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the selfservsolaccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selfservsolaccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSELFSERVSOLACCESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the hassolution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hassolution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHASSOLUTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the calcorgid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calcorgid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCALCORGID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCALCORGID() {
            if (calcorgid == null) {
                calcorgid = new ArrayList<MXStringQueryType>();
            }
            return this.calcorgid;
        }

        /**
         * Gets the value of the calccalendar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calccalendar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCALCCALENDAR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCALCCALENDAR() {
            if (calccalendar == null) {
                calccalendar = new ArrayList<MXStringQueryType>();
            }
            return this.calccalendar;
        }

        /**
         * Gets the value of the calcshift property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calcshift property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCALCSHIFT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCALCSHIFT() {
            if (calcshift == null) {
                calcshift = new ArrayList<MXStringQueryType>();
            }
            return this.calcshift;
        }

        /**
         * Gets the value of the pluspquotetype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspquotetype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPQUOTETYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPQUOTETYPE() {
            if (pluspquotetype == null) {
                pluspquotetype = new ArrayList<MXStringQueryType>();
            }
            return this.pluspquotetype;
        }

        /**
         * Gets the value of the pluspquotedprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspquotedprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPQUOTEDPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPLUSPQUOTEDPRICE() {
            if (pluspquotedprice == null) {
                pluspquotedprice = new ArrayList<MXDoubleQueryType>();
            }
            return this.pluspquotedprice;
        }

        /**
         * Gets the value of the pluspagreement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspagreement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPAGREEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPAGREEMENT() {
            if (pluspagreement == null) {
                pluspagreement = new ArrayList<MXStringQueryType>();
            }
            return this.pluspagreement;
        }

        /**
         * Gets the value of the pluspcustomer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcustomer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCUSTOMER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCUSTOMER() {
            if (pluspcustomer == null) {
                pluspcustomer = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcustomer;
        }

        /**
         * Gets the value of the pluspcostcenter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcostcenter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCOSTCENTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCOSTCENTER() {
            if (pluspcostcenter == null) {
                pluspcostcenter = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcostcenter;
        }

        /**
         * Gets the value of the pluspcustchacct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcustchacct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCUSTCHACCT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCUSTCHACCT() {
            if (pluspcustchacct == null) {
                pluspcustchacct = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcustchacct;
        }

        /**
         * Gets the value of the pluspstaddrnumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspstaddrnumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPSTADDRNUMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPSTADDRNUMBER() {
            if (pluspstaddrnumber == null) {
                pluspstaddrnumber = new ArrayList<MXStringQueryType>();
            }
            return this.pluspstaddrnumber;
        }

        /**
         * Gets the value of the pluspstaddrdirprfx property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspstaddrdirprfx property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPSTADDRDIRPRFX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPSTADDRDIRPRFX() {
            if (pluspstaddrdirprfx == null) {
                pluspstaddrdirprfx = new ArrayList<MXStringQueryType>();
            }
            return this.pluspstaddrdirprfx;
        }

        /**
         * Gets the value of the pluspstaddrstreet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspstaddrstreet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPSTADDRSTREET().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPSTADDRSTREET() {
            if (pluspstaddrstreet == null) {
                pluspstaddrstreet = new ArrayList<MXStringQueryType>();
            }
            return this.pluspstaddrstreet;
        }

        /**
         * Gets the value of the pluspstaddrsttype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspstaddrsttype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPSTADDRSTTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPSTADDRSTTYPE() {
            if (pluspstaddrsttype == null) {
                pluspstaddrsttype = new ArrayList<MXStringQueryType>();
            }
            return this.pluspstaddrsttype;
        }

        /**
         * Gets the value of the pluspstaddrdirsfx property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspstaddrdirsfx property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPSTADDRDIRSFX().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPSTADDRDIRSFX() {
            if (pluspstaddrdirsfx == null) {
                pluspstaddrdirsfx = new ArrayList<MXStringQueryType>();
            }
            return this.pluspstaddrdirsfx;
        }

        /**
         * Gets the value of the pluspstaddrunitnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspstaddrunitnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPSTADDRUNITNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPSTADDRUNITNUM() {
            if (pluspstaddrunitnum == null) {
                pluspstaddrunitnum = new ArrayList<MXStringQueryType>();
            }
            return this.pluspstaddrunitnum;
        }

        /**
         * Gets the value of the pluspstreetaddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspstreetaddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPSTREETADDRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPSTREETADDRESS() {
            if (pluspstreetaddress == null) {
                pluspstreetaddress = new ArrayList<MXStringQueryType>();
            }
            return this.pluspstreetaddress;
        }

        /**
         * Gets the value of the pluspaddressline2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspaddressline2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPADDRESSLINE2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspaddressline3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPADDRESSLINE3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the pluspcity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCITY() {
            if (pluspcity == null) {
                pluspcity = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcity;
        }

        /**
         * Gets the value of the pluspregiondistr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspregiondistr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPREGIONDISTR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPREGIONDISTR() {
            if (pluspregiondistr == null) {
                pluspregiondistr = new ArrayList<MXStringQueryType>();
            }
            return this.pluspregiondistr;
        }

        /**
         * Gets the value of the pluspcounty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcounty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCOUNTY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCOUNTY() {
            if (pluspcounty == null) {
                pluspcounty = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcounty;
        }

        /**
         * Gets the value of the pluspstateprovince property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspstateprovince property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPSTATEPROVINCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPSTATEPROVINCE() {
            if (pluspstateprovince == null) {
                pluspstateprovince = new ArrayList<MXStringQueryType>();
            }
            return this.pluspstateprovince;
        }

        /**
         * Gets the value of the plusppostalcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusppostalcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPPOSTALCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPPOSTALCODE() {
            if (plusppostalcode == null) {
                plusppostalcode = new ArrayList<MXStringQueryType>();
            }
            return this.plusppostalcode;
        }

        /**
         * Gets the value of the pluspcountry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcountry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCOUNTRY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCOUNTRY() {
            if (pluspcountry == null) {
                pluspcountry = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcountry;
        }

        /**
         * Gets the value of the pluspdirections property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspdirections property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPDIRECTIONS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPDIRECTIONS() {
            if (pluspdirections == null) {
                pluspdirections = new ArrayList<MXStringQueryType>();
            }
            return this.pluspdirections;
        }

        /**
         * Gets the value of the plusptimezone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusptimezone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPTIMEZONE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the plusplatitude property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusplatitude property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPLATITUDE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPLUSPLATITUDE() {
            if (plusplatitude == null) {
                plusplatitude = new ArrayList<MXDoubleQueryType>();
            }
            return this.plusplatitude;
        }

        /**
         * Gets the value of the plusplongitude property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusplongitude property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPLONGITUDE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPLUSPLONGITUDE() {
            if (plusplongitude == null) {
                plusplongitude = new ArrayList<MXDoubleQueryType>();
            }
            return this.plusplongitude;
        }

        /**
         * Gets the value of the plusprefpoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusprefpoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPREFPOINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPREFPOINT() {
            if (plusprefpoint == null) {
                plusprefpoint = new ArrayList<MXStringQueryType>();
            }
            return this.plusprefpoint;
        }

        /**
         * Gets the value of the pluspgeocode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspgeocode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPGEOCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPGEOCODE() {
            if (pluspgeocode == null) {
                pluspgeocode = new ArrayList<MXStringQueryType>();
            }
            return this.pluspgeocode;
        }

        /**
         * Gets the value of the pluspresponseplan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspresponseplan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPRESPONSEPLAN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPRESPONSEPLAN() {
            if (pluspresponseplan == null) {
                pluspresponseplan = new ArrayList<MXStringQueryType>();
            }
            return this.pluspresponseplan;
        }

        /**
         * Gets the value of the plusprevnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusprevnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPREVNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPLUSPREVNUM() {
            if (plusprevnum == null) {
                plusprevnum = new ArrayList<MXLongQueryType>();
            }
            return this.plusprevnum;
        }

        /**
         * Gets the value of the plusppricesched property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusppricesched property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPPRICESCHED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPPRICESCHED() {
            if (plusppricesched == null) {
                plusppricesched = new ArrayList<MXStringQueryType>();
            }
            return this.plusppricesched;
        }

        /**
         * Gets the value of the pluspcustponum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcustponum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCUSTPONUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCUSTPONUM() {
            if (pluspcustponum == null) {
                pluspcustponum = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcustponum;
        }

        /**
         * Gets the value of the pluspmaxprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspmaxprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPMAXPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPLUSPMAXPRICE() {
            if (pluspmaxprice == null) {
                pluspmaxprice = new ArrayList<MXDoubleQueryType>();
            }
            return this.pluspmaxprice;
        }

        /**
         * Gets the value of the pluspbillbatch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspbillbatch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPBILLBATCH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPBILLBATCH() {
            if (pluspbillbatch == null) {
                pluspbillbatch = new ArrayList<MXStringQueryType>();
            }
            return this.pluspbillbatch;
        }

        /**
         * Gets the value of the pluspbblinenum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspbblinenum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPBBLINENUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPLUSPBBLINENUM() {
            if (pluspbblinenum == null) {
                pluspbblinenum = new ArrayList<MXLongQueryType>();
            }
            return this.pluspbblinenum;
        }

        /**
         * Gets the value of the pluspaddrischanged property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspaddrischanged property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPADDRISCHANGED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the pluspporeq property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspporeq property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPPOREQ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPLUSPPOREQ() {
            if (pluspporeq == null) {
                pluspporeq = new ArrayList<MXBooleanQueryType>();
            }
            return this.pluspporeq;
        }

        /**
         * Gets the value of the pluspcalcorgid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcalcorgid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCALCORGID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCALCORGID() {
            if (pluspcalcorgid == null) {
                pluspcalcorgid = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcalcorgid;
        }

        /**
         * Gets the value of the pluspcalccalnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcalccalnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCALCCALNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCALCCALNUM() {
            if (pluspcalccalnum == null) {
                pluspcalccalnum = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcalccalnum;
        }

        /**
         * Gets the value of the pluspcalcshift property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspcalcshift property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPCALCSHIFT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPCALCSHIFT() {
            if (pluspcalcshift == null) {
                pluspcalcshift = new ArrayList<MXStringQueryType>();
            }
            return this.pluspcalcshift;
        }

        /**
         * Gets the value of the pmcomtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcomtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the pmcomresolution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcomresolution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMRESOLUTION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the pmcomimpact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcomimpact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMIMPACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the pmcomurgency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcomurgency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOMURGENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the searchsource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchsource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSEARCHSOURCE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the externalsystemticketid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalsystemticketid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXTERNALSYSTEMTICKETID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the descsrvid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descsrvid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDESCSRVID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the creationdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creationdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCREATIONDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the virtualenv property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the virtualenv property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVIRTUALENV().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the outageduration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outageduration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOUTAGEDURATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the pmsccrid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmsccrid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCCRID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMSCCRID() {
            if (pmsccrid == null) {
                pmsccrid = new ArrayList<MXStringQueryType>();
            }
            return this.pmsccrid;
        }

        /**
         * Gets the value of the pmscitemnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmscitemnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCITEMNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMSCITEMNUM() {
            if (pmscitemnum == null) {
                pmscitemnum = new ArrayList<MXStringQueryType>();
            }
            return this.pmscitemnum;
        }

        /**
         * Gets the value of the pmscoffsummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmscoffsummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCOFFSUMMARY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMSCOFFSUMMARY() {
            if (pmscoffsummary == null) {
                pmscoffsummary = new ArrayList<MXStringQueryType>();
            }
            return this.pmscoffsummary;
        }

        /**
         * Gets the value of the pmscquantity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmscquantity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCQUANTITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMSCQUANTITY() {
            if (pmscquantity == null) {
                pmscquantity = new ArrayList<MXLongQueryType>();
            }
            return this.pmscquantity;
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
         * Gets the value of the accumulatedholdtime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accumulatedholdtime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACCUMULATEDHOLDTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getACCUMULATEDHOLDTIME() {
            if (accumulatedholdtime == null) {
                accumulatedholdtime = new ArrayList<MXDoubleQueryType>();
            }
            return this.accumulatedholdtime;
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
         * Gets the value of the adjustedtargetresponsetime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adjustedtargetresponsetime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADJUSTEDTARGETRESPONSETIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getADJUSTEDTARGETRESPONSETIME() {
            if (adjustedtargetresponsetime == null) {
                adjustedtargetresponsetime = new ArrayList<MXDateTimeQueryType>();
            }
            return this.adjustedtargetresponsetime;
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
         * Gets the value of the correlationattrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the correlationattrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCORRELATIONATTRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the faulttype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the faulttype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFAULTTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the customername property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customername property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCUSTOMERNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the customerid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCUSTOMERID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the adresakorisnika property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adresakorisnika property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADRESAKORISNIKA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the operatorname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operatorname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOPERATORNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the customervalue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customervalue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCUSTOMERVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the ola property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ola property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOLA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the noteopen property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the noteopen property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNOTEOPEN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the contactphone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactphone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTACTPHONE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the contactperson property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactperson property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTACTPERSON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the contactemail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactemail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTACTEMAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the rootcustomerref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rootcustomerref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getROOTCUSTOMERREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the technicianname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the technicianname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTECHNICIANNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the hassupportcontract property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hassupportcontract property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHASSUPPORTCONTRACT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the domen property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the domen property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDOMEN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dslamport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDSLAMPORT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the serialnumberstb property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serialnumberstb property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSERIALNUMBERSTB().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the hgwtip property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hgwtip property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHGWTIP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the adresaizvod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the adresaizvod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADRESAIZVOD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the serialnumberhgw property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serialnumberhgw property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSERIALNUMBERHGW().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the izvod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the izvod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIZVOD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the parica property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parica property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARICA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the ram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRAM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rebro property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREBRO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the pozicija property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pozicija property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOZICIJA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the centralaport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the centralaport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCENTRALAPORT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the prespojbroj property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prespojbroj property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRESPOJBROJ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prespojlinija property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRESPOJLINIJA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the tipdslam property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tipdslam property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTIPDSLAM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the mozeoptika property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mozeoptika property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMOZEOPTIKA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the string1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the string1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTRING1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the string2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTRING2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the string3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTRING3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the int1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINT1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINT2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINT3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the date1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the date1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATE1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the date2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATE2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the extsysid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extsysid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXTSYSID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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

    }

}

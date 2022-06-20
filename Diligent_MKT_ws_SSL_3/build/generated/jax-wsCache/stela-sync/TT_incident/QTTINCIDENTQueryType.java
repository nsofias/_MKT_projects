
package TT_incident;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTTINCIDENTQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTTINCIDENTQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WHERE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INCIDENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ACCUMULATEDHOLDTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETRESPONSETIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADRESAIZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ADRESAKORISNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ASSETORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ASSETSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CALCCALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CENTRALA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CENTRALAPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSIFICATIONID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACTEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACTPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACTPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CORRELATIONATTRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CREATEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CREATEWOMULTI" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CREATIONDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMERNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMERVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DATE1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DATE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DESCSRVID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DOMEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="DSLAMPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALRECID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALSYSTEM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="EXTSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="FR1CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="FR2CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="GLACCOUNT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXGLAccountQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="GLOBALTICKETCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="GLOBALTICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HASACTIVITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HASSOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HASSUPPORTCONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HGWTIP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="IMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INDICATEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INHERITSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INT1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INT2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INT3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="INTERNALPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ISGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ISKNOWNERROR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ISKNOWNERRORDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="IZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="KABEL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="KATEGORIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="LINISKAOPREMA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="MOZEOPTIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="NOTEOPEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OLA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OPERATORNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OUTAGEDURATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PAKET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PARICA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPAGREEMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPBBLINENUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPBILLBATCH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCALCCALNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCOSTCENTER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCOUNTRY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCOUNTY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCUSTCHACCT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCUSTOMER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCUSTPONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPDIRECTIONS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPGEOCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPLATITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPLONGITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPMAXPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPOREQ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPOSTALCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPRICESCHED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPQUOTEDPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPQUOTETYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPREFPOINT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPREGIONDISTR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPRESPONSEPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPREVNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRDIRPRFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRDIRSFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRNUMBER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRSTREET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRSTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTADDRUNITNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTATEPROVINCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPSTREETADDRESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMRESOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCCRID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCITEMNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCOFFSUMMARY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCQUANTITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="POZICIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PRESPOJBROJ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PRESPOJLINIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="RAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REBRO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="RELATEDTOGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="ROOTCUSTOMERREF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SEARCHSOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SELFSERVSOLACCESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SERIALNUMBERHGW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SERIALNUMBERSTB" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SITEVISIT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STRING1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STRING2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="STRING3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TECHNICIANNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TEMPLATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TEMPLATEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TICKETUID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="TIPDSLAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="URGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="VIRTUALENV" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                   &lt;element name="WORKLOG" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CLIENTVIEWABLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CREATEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CREATEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="LOGTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="MODIFYBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="MODIFYDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="RECORDKEY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WORKLOGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TKSTATUS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="MEMO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="STATUSTRACKING" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="TKSTATUSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WORKORDER" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ACTFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ACTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ACTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ACTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ACTSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ACTSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ACTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ASSETLOCPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="BACKOUTPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CALCCALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CALCPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CHARGESTORE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CREWID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="DISABLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="DOWNTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ENVIRONMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTATAPPRLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTATAPPRLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTATAPPRMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTATAPPRSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTATAPPRTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTDUR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ESTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="EXTERNALREFID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="FAILDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="FINCNTRLID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="FIRSTAPPRSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="FLOWACTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="FLOWACTIONASSIST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="FLOWCONTROLLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="GENERATEDFORPO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="GENFORPOLINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="GLACCOUNT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXGLAccountQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="HASCHILDREN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="HASFOLLOWUPWORK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="INSPECTOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="INTERRUPTIBLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ISTASK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="JOBTASKID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="JPNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="JUSTIFYPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="LAUNCHENTRYNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="LEAD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="MEASUREDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="MEASUREMENTVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="NEWCHILDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OBSERVATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ONBEHALFOF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OUTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OUTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OUTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OWNERSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PARENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PARENTCHGSSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PERSONGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPAGREEMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPALLOWQUOTE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPBBLINENUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPBILLBATCH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPBILLBATCHID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPBILLSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCALCCALNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCOSTCENTER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCOUNTRY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCOUNTY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCUSTCHACCT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCUSTOMER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPCUSTPONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPDIRECTIONS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPGEOCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPLATDIRECTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPLATITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPLINESTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPLONGDIRECTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPLONGITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPMAXPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPORIGQPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPORIGQTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPPOREQ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPPOSTALCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPPRICESCHED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPQUOTEDPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPQUOTETYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPREFPOINT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPREGIONDISTR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPRESPONSEPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPREVNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPSTADDRDIRPRFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPSTADDRDIRSFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPSTADDRNUMBER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPSTADDRSTREET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPSTADDRSTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPSTADDRUNITNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPSTATEPROVINCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPSTREETADDRESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMCOMBPELACTNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMCOMBPELENABLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMCOMBPELINPROG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMCOMSTATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMDUEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMEXTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMNEXTDUEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PMNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="POINTNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="REASONFORCHANGE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="REMDUR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="RESPONDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="RISK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ROUTE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ROUTESTOPID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SCHEDFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SCHEDSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SENDERSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SOURCESYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SUSPENDFLOW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="TARGCOMPDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="TARGSTARTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="TASKID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="VERIFICATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WHOMISCHANGEFOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOACCEPTSCHARGES" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ10" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ11" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ12" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ13" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ14" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOEQ9" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOISSWAP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJO1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJO2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJO3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJO4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJO5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJO6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJO7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJO8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJP1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJP2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJP3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJP4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOJP5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOL1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOL2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOL3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOL4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLABLNK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO10" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOLO9" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WORKLOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WORKORDERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WORKTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WORTS1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WORTS2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WORTS3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WORTS4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WORTS5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="WOSEQUENCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TKOWNERHISTORY" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OWNDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OWNERCHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                             &lt;element name="TKOWNERHISTORYID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
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
 *       &lt;attGroup ref="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}QueryClausePropertyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTTINCIDENTQueryType", propOrder = {
    "where",
    "incident"
})
public class QTTINCIDENTQueryType {

    @XmlElement(name = "WHERE")
    protected String where;
    @XmlElement(name = "INCIDENT")
    protected QTTINCIDENTQueryType.INCIDENT incident;
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
     *     {@link QTTINCIDENTQueryType.INCIDENT }
     *     
     */
    public QTTINCIDENTQueryType.INCIDENT getINCIDENT() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTTINCIDENTQueryType.INCIDENT }
     *     
     */
    public void setINCIDENT(QTTINCIDENTQueryType.INCIDENT value) {
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
     *         &lt;element name="ACCUMULATEDHOLDTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETRESPONSETIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADRESAIZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ADRESAKORISNIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ASSETORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ASSETSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CALCCALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CENTRALA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CENTRALAPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CLASSIFICATIONID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CONTACTEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CONTACTPERSON" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CONTACTPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CORRELATIONATTRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CREATEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CREATEWOMULTI" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CREATIONDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMERNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMERVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DATE1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DATE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DESCSRVID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DOMEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="DSLAMPORT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALRECID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALSYSTEM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="EXTSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="FR1CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="FR2CODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="GLACCOUNT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXGLAccountQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="GLOBALTICKETCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="GLOBALTICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HASACTIVITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HASSOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HASSUPPORTCONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HGWTIP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="IMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INDICATEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INHERITSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INT1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INT2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INT3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="INTERNALPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ISGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ISKNOWNERROR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ISKNOWNERRORDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="IZVOD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="KABEL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="KATEGORIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="LINISKAOPREMA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="MOZEOPTIKA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="NOTEOPEN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OLA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OPERATORNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECSITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OUTAGEDURATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PAKET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PARICA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPAGREEMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPBBLINENUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPBILLBATCH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCALCCALNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCOSTCENTER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCOUNTRY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCOUNTY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCUSTCHACCT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCUSTOMER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCUSTPONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPDIRECTIONS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPGEOCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPLATITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPLONGITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPMAXPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPOREQ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPOSTALCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPRICESCHED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPQUOTEDPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPQUOTETYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPREFPOINT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPREGIONDISTR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPRESPONSEPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPREVNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRDIRPRFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRDIRSFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRNUMBER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRSTREET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRSTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTADDRUNITNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTATEPROVINCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPSTREETADDRESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMRESOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMSCCRID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMSCITEMNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMSCOFFSUMMARY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PMSCQUANTITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="POZICIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PRESPOJBROJ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PRESPOJLINIJA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="RAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REBRO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="RELATEDTOGLOBAL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDEMAIL" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDPHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="ROOTCUSTOMERREF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SEARCHSOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SELFSERVSOLACCESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SERIALNUMBERHGW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SERIALNUMBERSTB" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SITEVISIT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SOLUTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SOURCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STRING1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STRING2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="STRING3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TARGETCONTACTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TARGETFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TARGETSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TECHNICIANNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TEMPLATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TEMPLATEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TICKETUID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="TIPDSLAM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="URGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="VIRTUALENV" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *         &lt;element name="WORKLOG" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CLIENTVIEWABLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CREATEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CREATEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="LOGTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="MODIFYBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="MODIFYDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="RECORDKEY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WORKLOGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TKSTATUS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="MEMO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="STATUSTRACKING" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="TKSTATUSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WORKORDER" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ACTFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ACTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ACTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ACTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ACTSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ACTSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ACTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ASSETLOCPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="BACKOUTPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CALCCALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CALCPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CHARGESTORE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CREWID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="DISABLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="DOWNTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ENVIRONMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTATAPPRLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTATAPPRLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTATAPPRMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTATAPPRSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTATAPPRTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTDUR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ESTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="EXTERNALREFID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="FAILDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="FINCNTRLID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="FIRSTAPPRSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="FLOWACTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="FLOWACTIONASSIST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="FLOWCONTROLLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="GENERATEDFORPO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="GENFORPOLINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="GLACCOUNT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXGLAccountQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="HASCHILDREN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="HASFOLLOWUPWORK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="INSPECTOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="INTERRUPTIBLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ISTASK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="JOBTASKID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="JPNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="JUSTIFYPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="LAUNCHENTRYNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="LEAD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="MEASUREDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="MEASUREMENTVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="NEWCHILDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OBSERVATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ONBEHALFOF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OUTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OUTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OUTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OWNERSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PARENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PARENTCHGSSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PERSONGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPAGREEMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPALLOWQUOTE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPBBLINENUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPBILLBATCH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPBILLBATCHID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPBILLSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCALCCALNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCOSTCENTER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCOUNTRY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCOUNTY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCUSTCHACCT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCUSTOMER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPCUSTPONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPDIRECTIONS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPGEOCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPLATDIRECTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPLATITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPLINESTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPLONGDIRECTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPLONGITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPMAXPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPORIGQPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPORIGQTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPPOREQ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPPOSTALCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPPRICESCHED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPQUOTEDPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPQUOTETYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPREFPOINT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPREGIONDISTR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPRESPONSEPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPREVNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPSTADDRDIRPRFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPSTADDRDIRSFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPSTADDRNUMBER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPSTADDRSTREET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPSTADDRSTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPSTADDRUNITNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPSTATEPROVINCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPSTREETADDRESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMCOMBPELACTNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMCOMBPELENABLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMCOMBPELINPROG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMCOMSTATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMDUEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMEXTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMNEXTDUEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PMNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="POINTNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="REASONFORCHANGE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="REMDUR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="RESPONDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="RISK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ROUTE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ROUTESTOPID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SCHEDFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SCHEDSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SENDERSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SOURCESYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SUSPENDFLOW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="TARGCOMPDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="TARGSTARTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="TASKID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="VERIFICATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WHOMISCHANGEFOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOACCEPTSCHARGES" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ10" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ11" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ12" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ13" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ14" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOEQ9" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOISSWAP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJO1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJO2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJO3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJO4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJO5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJO6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJO7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJO8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJP1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJP2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJP3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJP4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOJP5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOL1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOL2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOL3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOL4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLABLNK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO10" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOLO9" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WORKLOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WORKORDERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WORKTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WORTS1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WORTS2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WORTS3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WORTS4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WORTS5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="WOSEQUENCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TKOWNERHISTORY" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OWNDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OWNERCHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                   &lt;element name="TKOWNERHISTORYID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
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
        "accumulatedholdtime",
        "actlabcost",
        "actlabhrs",
        "actualcontactdate",
        "actualfinish",
        "actualstart",
        "adjustedtargetcontacttime",
        "adjustedtargetresolutiontime",
        "adjustedtargetresponsetime",
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
        "calccalendar",
        "calcorgid",
        "calcshift",
        "centrala",
        "centralaport",
        "changeby",
        "changedate",
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
        "glaccount",
        "globalticketclass",
        "globalticketid",
        "hasactivity",
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
        "lineid",
        "liniskaoprema",
        "location",
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
        "pluspagreement",
        "pluspbblinenum",
        "pluspbillbatch",
        "pluspcalccalnum",
        "pluspcalcorgid",
        "pluspcalcshift",
        "pluspcity",
        "pluspcostcenter",
        "pluspcountry",
        "pluspcounty",
        "pluspcustchacct",
        "pluspcustomer",
        "pluspcustponum",
        "pluspdirections",
        "pluspgeocode",
        "plusplatitude",
        "plusplongitude",
        "pluspmaxprice",
        "pluspporeq",
        "plusppostalcode",
        "plusppricesched",
        "pluspquotedprice",
        "pluspquotetype",
        "plusprefpoint",
        "pluspregiondistr",
        "pluspresponseplan",
        "plusprevnum",
        "pluspstaddrdirprfx",
        "pluspstaddrdirsfx",
        "pluspstaddrnumber",
        "pluspstaddrstreet",
        "pluspstaddrsttype",
        "pluspstaddrunitnum",
        "pluspstateprovince",
        "pluspstreetaddress",
        "plusptimezone",
        "pmcomimpact",
        "pmcomresolution",
        "pmcomtype",
        "pmcomurgency",
        "pmsccrid",
        "pmscitemnum",
        "pmscoffsummary",
        "pmscquantity",
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
        "urgency",
        "vendor",
        "virtualenv",
        "worklog",
        "tkstatus",
        "workorder",
        "tkownerhistory"
    })
    public static class INCIDENT {

        @XmlElement(name = "ACCUMULATEDHOLDTIME", nillable = true)
        protected List<MXDoubleQueryType> accumulatedholdtime;
        @XmlElement(name = "ACTLABCOST", nillable = true)
        protected List<MXDoubleQueryType> actlabcost;
        @XmlElement(name = "ACTLABHRS", nillable = true)
        protected List<MXDoubleQueryType> actlabhrs;
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
        @XmlElement(name = "ADJUSTEDTARGETRESPONSETIME", nillable = true)
        protected List<MXDateTimeQueryType> adjustedtargetresponsetime;
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
        @XmlElement(name = "CALCCALENDAR")
        protected List<MXStringQueryType> calccalendar;
        @XmlElement(name = "CALCORGID")
        protected List<MXStringQueryType> calcorgid;
        @XmlElement(name = "CALCSHIFT")
        protected List<MXStringQueryType> calcshift;
        @XmlElement(name = "CENTRALA")
        protected List<MXStringQueryType> centrala;
        @XmlElement(name = "CENTRALAPORT")
        protected List<MXStringQueryType> centralaport;
        @XmlElement(name = "CHANGEBY")
        protected List<MXStringQueryType> changeby;
        @XmlElement(name = "CHANGEDATE", nillable = true)
        protected List<MXDateTimeQueryType> changedate;
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
        @XmlElement(name = "GLACCOUNT")
        protected List<MXGLAccountQueryType> glaccount;
        @XmlElement(name = "GLOBALTICKETCLASS")
        protected List<MXStringQueryType> globalticketclass;
        @XmlElement(name = "GLOBALTICKETID")
        protected List<MXStringQueryType> globalticketid;
        @XmlElement(name = "HASACTIVITY")
        protected List<MXBooleanQueryType> hasactivity;
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
        @XmlElement(name = "LINEID")
        protected List<MXStringQueryType> lineid;
        @XmlElement(name = "LINISKAOPREMA")
        protected List<MXStringQueryType> liniskaoprema;
        @XmlElement(name = "LOCATION")
        protected List<MXStringQueryType> location;
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
        @XmlElement(name = "PLUSPAGREEMENT")
        protected List<MXStringQueryType> pluspagreement;
        @XmlElement(name = "PLUSPBBLINENUM", nillable = true)
        protected List<MXLongQueryType> pluspbblinenum;
        @XmlElement(name = "PLUSPBILLBATCH")
        protected List<MXStringQueryType> pluspbillbatch;
        @XmlElement(name = "PLUSPCALCCALNUM")
        protected List<MXStringQueryType> pluspcalccalnum;
        @XmlElement(name = "PLUSPCALCORGID")
        protected List<MXStringQueryType> pluspcalcorgid;
        @XmlElement(name = "PLUSPCALCSHIFT")
        protected List<MXStringQueryType> pluspcalcshift;
        @XmlElement(name = "PLUSPCITY")
        protected List<MXStringQueryType> pluspcity;
        @XmlElement(name = "PLUSPCOSTCENTER")
        protected List<MXStringQueryType> pluspcostcenter;
        @XmlElement(name = "PLUSPCOUNTRY")
        protected List<MXStringQueryType> pluspcountry;
        @XmlElement(name = "PLUSPCOUNTY")
        protected List<MXStringQueryType> pluspcounty;
        @XmlElement(name = "PLUSPCUSTCHACCT")
        protected List<MXStringQueryType> pluspcustchacct;
        @XmlElement(name = "PLUSPCUSTOMER")
        protected List<MXStringQueryType> pluspcustomer;
        @XmlElement(name = "PLUSPCUSTPONUM")
        protected List<MXStringQueryType> pluspcustponum;
        @XmlElement(name = "PLUSPDIRECTIONS")
        protected List<MXStringQueryType> pluspdirections;
        @XmlElement(name = "PLUSPGEOCODE")
        protected List<MXStringQueryType> pluspgeocode;
        @XmlElement(name = "PLUSPLATITUDE", nillable = true)
        protected List<MXDoubleQueryType> plusplatitude;
        @XmlElement(name = "PLUSPLONGITUDE", nillable = true)
        protected List<MXDoubleQueryType> plusplongitude;
        @XmlElement(name = "PLUSPMAXPRICE", nillable = true)
        protected List<MXDoubleQueryType> pluspmaxprice;
        @XmlElement(name = "PLUSPPOREQ")
        protected List<MXBooleanQueryType> pluspporeq;
        @XmlElement(name = "PLUSPPOSTALCODE")
        protected List<MXStringQueryType> plusppostalcode;
        @XmlElement(name = "PLUSPPRICESCHED")
        protected List<MXStringQueryType> plusppricesched;
        @XmlElement(name = "PLUSPQUOTEDPRICE", nillable = true)
        protected List<MXDoubleQueryType> pluspquotedprice;
        @XmlElement(name = "PLUSPQUOTETYPE")
        protected List<MXStringQueryType> pluspquotetype;
        @XmlElement(name = "PLUSPREFPOINT")
        protected List<MXStringQueryType> plusprefpoint;
        @XmlElement(name = "PLUSPREGIONDISTR")
        protected List<MXStringQueryType> pluspregiondistr;
        @XmlElement(name = "PLUSPRESPONSEPLAN")
        protected List<MXStringQueryType> pluspresponseplan;
        @XmlElement(name = "PLUSPREVNUM", nillable = true)
        protected List<MXLongQueryType> plusprevnum;
        @XmlElement(name = "PLUSPSTADDRDIRPRFX")
        protected List<MXStringQueryType> pluspstaddrdirprfx;
        @XmlElement(name = "PLUSPSTADDRDIRSFX")
        protected List<MXStringQueryType> pluspstaddrdirsfx;
        @XmlElement(name = "PLUSPSTADDRNUMBER")
        protected List<MXStringQueryType> pluspstaddrnumber;
        @XmlElement(name = "PLUSPSTADDRSTREET")
        protected List<MXStringQueryType> pluspstaddrstreet;
        @XmlElement(name = "PLUSPSTADDRSTTYPE")
        protected List<MXStringQueryType> pluspstaddrsttype;
        @XmlElement(name = "PLUSPSTADDRUNITNUM")
        protected List<MXStringQueryType> pluspstaddrunitnum;
        @XmlElement(name = "PLUSPSTATEPROVINCE")
        protected List<MXStringQueryType> pluspstateprovince;
        @XmlElement(name = "PLUSPSTREETADDRESS")
        protected List<MXStringQueryType> pluspstreetaddress;
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
        @XmlElement(name = "PMSCCRID")
        protected List<MXStringQueryType> pmsccrid;
        @XmlElement(name = "PMSCITEMNUM")
        protected List<MXStringQueryType> pmscitemnum;
        @XmlElement(name = "PMSCOFFSUMMARY")
        protected List<MXStringQueryType> pmscoffsummary;
        @XmlElement(name = "PMSCQUANTITY", nillable = true)
        protected List<MXLongQueryType> pmscquantity;
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
        @XmlElement(name = "URGENCY", nillable = true)
        protected List<MXLongQueryType> urgency;
        @XmlElement(name = "VENDOR")
        protected List<MXStringQueryType> vendor;
        @XmlElement(name = "VIRTUALENV")
        protected List<MXBooleanQueryType> virtualenv;
        @XmlElement(name = "WORKLOG")
        protected QTTINCIDENTQueryType.INCIDENT.WORKLOG worklog;
        @XmlElement(name = "TKSTATUS")
        protected QTTINCIDENTQueryType.INCIDENT.TKSTATUS tkstatus;
        @XmlElement(name = "WORKORDER")
        protected QTTINCIDENTQueryType.INCIDENT.WORKORDER workorder;
        @XmlElement(name = "TKOWNERHISTORY")
        protected QTTINCIDENTQueryType.INCIDENT.TKOWNERHISTORY tkownerhistory;

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
         * Gets the value of the worklog property.
         * 
         * @return
         *     possible object is
         *     {@link QTTINCIDENTQueryType.INCIDENT.WORKLOG }
         *     
         */
        public QTTINCIDENTQueryType.INCIDENT.WORKLOG getWORKLOG() {
            return worklog;
        }

        /**
         * Sets the value of the worklog property.
         * 
         * @param value
         *     allowed object is
         *     {@link QTTINCIDENTQueryType.INCIDENT.WORKLOG }
         *     
         */
        public void setWORKLOG(QTTINCIDENTQueryType.INCIDENT.WORKLOG value) {
            this.worklog = value;
        }

        /**
         * Gets the value of the tkstatus property.
         * 
         * @return
         *     possible object is
         *     {@link QTTINCIDENTQueryType.INCIDENT.TKSTATUS }
         *     
         */
        public QTTINCIDENTQueryType.INCIDENT.TKSTATUS getTKSTATUS() {
            return tkstatus;
        }

        /**
         * Sets the value of the tkstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link QTTINCIDENTQueryType.INCIDENT.TKSTATUS }
         *     
         */
        public void setTKSTATUS(QTTINCIDENTQueryType.INCIDENT.TKSTATUS value) {
            this.tkstatus = value;
        }

        /**
         * Gets the value of the workorder property.
         * 
         * @return
         *     possible object is
         *     {@link QTTINCIDENTQueryType.INCIDENT.WORKORDER }
         *     
         */
        public QTTINCIDENTQueryType.INCIDENT.WORKORDER getWORKORDER() {
            return workorder;
        }

        /**
         * Sets the value of the workorder property.
         * 
         * @param value
         *     allowed object is
         *     {@link QTTINCIDENTQueryType.INCIDENT.WORKORDER }
         *     
         */
        public void setWORKORDER(QTTINCIDENTQueryType.INCIDENT.WORKORDER value) {
            this.workorder = value;
        }

        /**
         * Gets the value of the tkownerhistory property.
         * 
         * @return
         *     possible object is
         *     {@link QTTINCIDENTQueryType.INCIDENT.TKOWNERHISTORY }
         *     
         */
        public QTTINCIDENTQueryType.INCIDENT.TKOWNERHISTORY getTKOWNERHISTORY() {
            return tkownerhistory;
        }

        /**
         * Sets the value of the tkownerhistory property.
         * 
         * @param value
         *     allowed object is
         *     {@link QTTINCIDENTQueryType.INCIDENT.TKOWNERHISTORY }
         *     
         */
        public void setTKOWNERHISTORY(QTTINCIDENTQueryType.INCIDENT.TKOWNERHISTORY value) {
            this.tkownerhistory = value;
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
         *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OWNDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OWNERCHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="TKOWNERHISTORYID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
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
            "assignedownergroup",
            "orgid",
            "owndate",
            "owner",
            "ownerchangeby",
            "ownergroup",
            "siteid",
            "tkownerhistoryid"
        })
        public static class TKOWNERHISTORY {

            @XmlElement(name = "ASSIGNEDOWNERGROUP")
            protected List<MXStringQueryType> assignedownergroup;
            @XmlElement(name = "ORGID")
            protected List<MXStringQueryType> orgid;
            @XmlElement(name = "OWNDATE", nillable = true)
            protected List<MXDateTimeQueryType> owndate;
            @XmlElement(name = "OWNER")
            protected List<MXStringQueryType> owner;
            @XmlElement(name = "OWNERCHANGEBY")
            protected List<MXStringQueryType> ownerchangeby;
            @XmlElement(name = "OWNERGROUP")
            protected List<MXStringQueryType> ownergroup;
            @XmlElement(name = "SITEID")
            protected List<MXStringQueryType> siteid;
            @XmlElement(name = "TKOWNERHISTORYID", nillable = true)
            protected List<MXLongQueryType> tkownerhistoryid;

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
             * Gets the value of the owndate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the owndate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOWNDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getOWNDATE() {
                if (owndate == null) {
                    owndate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.owndate;
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
             * Gets the value of the ownerchangeby property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ownerchangeby property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOWNERCHANGEBY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getOWNERCHANGEBY() {
                if (ownerchangeby == null) {
                    ownerchangeby = new ArrayList<MXStringQueryType>();
                }
                return this.ownerchangeby;
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
             * Gets the value of the tkownerhistoryid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tkownerhistoryid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTKOWNERHISTORYID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getTKOWNERHISTORYID() {
                if (tkownerhistoryid == null) {
                    tkownerhistoryid = new ArrayList<MXLongQueryType>();
                }
                return this.tkownerhistoryid;
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
         *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="MEMO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="STATUSTRACKING" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="TKSTATUSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
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
            "assignedownergroup",
            "changeby",
            "changedate",
            "memo",
            "orgid",
            "owner",
            "ownergroup",
            "siteid",
            "status",
            "statustracking",
            "tkstatusid"
        })
        public static class TKSTATUS {

            @XmlElement(name = "ASSIGNEDOWNERGROUP")
            protected List<MXStringQueryType> assignedownergroup;
            @XmlElement(name = "CHANGEBY")
            protected List<MXStringQueryType> changeby;
            @XmlElement(name = "CHANGEDATE", nillable = true)
            protected List<MXDateTimeQueryType> changedate;
            @XmlElement(name = "MEMO")
            protected List<MXStringQueryType> memo;
            @XmlElement(name = "ORGID")
            protected List<MXStringQueryType> orgid;
            @XmlElement(name = "OWNER")
            protected List<MXStringQueryType> owner;
            @XmlElement(name = "OWNERGROUP")
            protected List<MXStringQueryType> ownergroup;
            @XmlElement(name = "SITEID")
            protected List<MXStringQueryType> siteid;
            @XmlElement(name = "STATUS")
            protected List<MXStringQueryType> status;
            @XmlElement(name = "STATUSTRACKING")
            protected List<MXStringQueryType> statustracking;
            @XmlElement(name = "TKSTATUSID", nillable = true)
            protected List<MXLongQueryType> tkstatusid;

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
             * Gets the value of the memo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the memo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMEMO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getMEMO() {
                if (memo == null) {
                    memo = new ArrayList<MXStringQueryType>();
                }
                return this.memo;
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
             * Gets the value of the statustracking property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the statustracking property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSTATUSTRACKING().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getSTATUSTRACKING() {
                if (statustracking == null) {
                    statustracking = new ArrayList<MXStringQueryType>();
                }
                return this.statustracking;
            }

            /**
             * Gets the value of the tkstatusid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tkstatusid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTKSTATUSID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getTKSTATUSID() {
                if (tkstatusid == null) {
                    tkstatusid = new ArrayList<MXLongQueryType>();
                }
                return this.tkstatusid;
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
         *         &lt;element name="CLIENTVIEWABLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CREATEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CREATEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="LOGTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="MODIFYBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="MODIFYDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="RECORDKEY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WORKLOGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the clientviewable property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCLIENTVIEWABLE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
             * Gets the value of the recordkey property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the recordkey property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRECORDKEY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
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
         *         &lt;element name="ACTFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ACTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ACTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ACTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ACTSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ACTSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ACTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ASSETLOCPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="BACKOUTPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CALCCALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CALCPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CHARGESTORE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CREWID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="DISABLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="DOWNTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ENVIRONMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTATAPPRLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTATAPPRLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTATAPPRMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTATAPPRSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTATAPPRTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTDUR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ESTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="EXTERNALREFID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="FAILDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="FINCNTRLID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="FIRSTAPPRSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="FLOWACTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="FLOWACTIONASSIST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="FLOWCONTROLLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="GENERATEDFORPO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="GENFORPOLINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="GLACCOUNT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXGLAccountQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="HASCHILDREN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="HASFOLLOWUPWORK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="INSPECTOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="INTERRUPTIBLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ISTASK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="JOBTASKID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="JPNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="JUSTIFYPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="LAUNCHENTRYNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="LEAD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="MEASUREDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="MEASUREMENTVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="NEWCHILDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OBSERVATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ONBEHALFOF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OUTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OUTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OUTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="OWNERSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PARENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PARENTCHGSSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PERSONGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPAGREEMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPALLOWQUOTE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPBBLINENUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPBILLBATCH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPBILLBATCHID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPBILLSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCALCCALNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCOSTCENTER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCOUNTRY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCOUNTY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCUSTCHACCT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCUSTOMER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPCUSTPONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPDIRECTIONS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPGEOCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPLATDIRECTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPLATITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPLINESTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPLONGDIRECTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPLONGITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPMAXPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPORIGQPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPORIGQTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPPOREQ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPPOSTALCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPPRICESCHED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPQUOTEDPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPQUOTETYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPREFPOINT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPREGIONDISTR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPRESPONSEPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPREVNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPSTADDRDIRPRFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPSTADDRDIRSFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPSTADDRNUMBER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPSTADDRSTREET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPSTADDRSTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPSTADDRUNITNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPSTATEPROVINCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPSTREETADDRESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMCOMBPELACTNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMCOMBPELENABLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMCOMBPELINPROG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMCOMSTATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMDUEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMEXTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMNEXTDUEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PMNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="POINTNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="REASONFORCHANGE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="REMDUR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="RESPONDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="RISK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ROUTE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="ROUTESTOPID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SCHEDFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SCHEDSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SENDERSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SOURCESYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="SUSPENDFLOW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="TARGCOMPDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="TARGSTARTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="TASKID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="VERIFICATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WHOMISCHANGEFOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOACCEPTSCHARGES" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ10" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ11" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ12" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ13" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ14" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOEQ9" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOISSWAP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJO1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJO2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJO3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJO4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJO5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJO6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJO7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJO8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJP1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJP2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJP3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJP4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOJP5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOL1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOL2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOL3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOL4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLABLNK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO10" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOLO9" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WORKLOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WORKORDERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WORKTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WORTS1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WORTS2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WORTS3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WORTS4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WORTS5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleQueryType" maxOccurs="2" minOccurs="0"/&gt;
         *         &lt;element name="WOSEQUENCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongQueryType" maxOccurs="2" minOccurs="0"/&gt;
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
            "actfinish",
            "actlabcost",
            "actlabhrs",
            "actmatcost",
            "actservcost",
            "actstart",
            "acttoolcost",
            "assetlocpriority",
            "assetnum",
            "backoutplan",
            "calccalendar",
            "calcorgid",
            "calcpriority",
            "calcshift",
            "calendar",
            "changeby",
            "changedate",
            "chargestore",
            "cinum",
            "classstructureid",
            "commodity",
            "commoditygroup",
            "contract",
            "crewid",
            "customerid",
            "description",
            "disabled",
            "downtime",
            "environment",
            "estatapprlabcost",
            "estatapprlabhrs",
            "estatapprmatcost",
            "estatapprservcost",
            "estatapprtoolcost",
            "estdur",
            "estlabcost",
            "estlabhrs",
            "estmatcost",
            "estservcost",
            "esttoolcost",
            "externalrefid",
            "faildate",
            "failurecode",
            "faulttype",
            "fincntrlid",
            "firstapprstatus",
            "flowaction",
            "flowactionassist",
            "flowcontrolled",
            "generatedforpo",
            "genforpolineid",
            "glaccount",
            "haschildren",
            "hasfollowupwork",
            "historyflag",
            "inspector",
            "interruptible",
            "istask",
            "jobtaskid",
            "jpnum",
            "justifypriority",
            "launchentryname",
            "lead",
            "lineid",
            "location",
            "measuredate",
            "measurementvalue",
            "newchildclass",
            "observation",
            "onbehalfof",
            "orgid",
            "origrecordclass",
            "origrecordid",
            "outlabcost",
            "outmatcost",
            "outtoolcost",
            "owner",
            "ownergroup",
            "ownersysid",
            "parent",
            "parentchgsstatus",
            "persongroup",
            "phone",
            "pluspaddressline2",
            "pluspaddressline3",
            "pluspaddrischanged",
            "pluspagreement",
            "pluspallowquote",
            "pluspbblinenum",
            "pluspbillbatch",
            "pluspbillbatchid",
            "pluspbillstatus",
            "pluspcalccalnum",
            "pluspcalcorgid",
            "pluspcalcshift",
            "pluspcity",
            "pluspcostcenter",
            "pluspcountry",
            "pluspcounty",
            "pluspcustchacct",
            "pluspcustomer",
            "pluspcustponum",
            "pluspdirections",
            "pluspgeocode",
            "plusplatdirection",
            "plusplatitude",
            "plusplinestatus",
            "plusplongdirection",
            "plusplongitude",
            "pluspmaxprice",
            "plusporigqprice",
            "plusporigqtype",
            "pluspporeq",
            "plusppostalcode",
            "plusppricesched",
            "pluspquotedprice",
            "pluspquotetype",
            "plusprefpoint",
            "pluspregiondistr",
            "pluspresponseplan",
            "plusprevnum",
            "pluspstaddrdirprfx",
            "pluspstaddrdirsfx",
            "pluspstaddrnumber",
            "pluspstaddrstreet",
            "pluspstaddrsttype",
            "pluspstaddrunitnum",
            "pluspstateprovince",
            "pluspstreetaddress",
            "plusptimezone",
            "pmcombpelactname",
            "pmcombpelenabled",
            "pmcombpelinprog",
            "pmcomimpact",
            "pmcomstate",
            "pmcomtype",
            "pmcomurgency",
            "pmduedate",
            "pmextdate",
            "pmnextduedate",
            "pmnum",
            "pointnum",
            "preckaid",
            "problemcode",
            "reasonforchange",
            "region",
            "remdur",
            "reportdate",
            "reportedby",
            "respondby",
            "risk",
            "route",
            "routestopid",
            "schedfinish",
            "schedstart",
            "sendersysid",
            "servicesinfault",
            "siteid",
            "sourcesysid",
            "status",
            "statusdate",
            "supervisor",
            "suspendflow",
            "targcompdate",
            "targetdesc",
            "targstartdate",
            "taskid",
            "vendor",
            "verification",
            "whomischangefor",
            "woacceptscharges",
            "woclass",
            "woeq1",
            "woeq10",
            "woeq11",
            "woeq12",
            "woeq13",
            "woeq14",
            "woeq2",
            "woeq3",
            "woeq4",
            "woeq5",
            "woeq6",
            "woeq7",
            "woeq8",
            "woeq9",
            "wogroup",
            "woisswap",
            "wojo1",
            "wojo2",
            "wojo3",
            "wojo4",
            "wojo5",
            "wojo6",
            "wojo7",
            "wojo8",
            "wojp1",
            "wojp2",
            "wojp3",
            "wojp4",
            "wojp5",
            "wol1",
            "wol2",
            "wol3",
            "wol4",
            "wolablnk",
            "wolo1",
            "wolo10",
            "wolo2",
            "wolo3",
            "wolo4",
            "wolo5",
            "wolo6",
            "wolo7",
            "wolo8",
            "wolo9",
            "wonum",
            "wopriority",
            "worklocation",
            "workorderid",
            "worktype",
            "worts1",
            "worts2",
            "worts3",
            "worts4",
            "worts5",
            "wosequence"
        })
        public static class WORKORDER {

            @XmlElement(name = "ACTFINISH", nillable = true)
            protected List<MXDateTimeQueryType> actfinish;
            @XmlElement(name = "ACTLABCOST", nillable = true)
            protected List<MXDoubleQueryType> actlabcost;
            @XmlElement(name = "ACTLABHRS", nillable = true)
            protected List<MXDoubleQueryType> actlabhrs;
            @XmlElement(name = "ACTMATCOST", nillable = true)
            protected List<MXDoubleQueryType> actmatcost;
            @XmlElement(name = "ACTSERVCOST", nillable = true)
            protected List<MXDoubleQueryType> actservcost;
            @XmlElement(name = "ACTSTART", nillable = true)
            protected List<MXDateTimeQueryType> actstart;
            @XmlElement(name = "ACTTOOLCOST", nillable = true)
            protected List<MXDoubleQueryType> acttoolcost;
            @XmlElement(name = "ASSETLOCPRIORITY", nillable = true)
            protected List<MXLongQueryType> assetlocpriority;
            @XmlElement(name = "ASSETNUM")
            protected List<MXStringQueryType> assetnum;
            @XmlElement(name = "BACKOUTPLAN")
            protected List<MXStringQueryType> backoutplan;
            @XmlElement(name = "CALCCALENDAR")
            protected List<MXStringQueryType> calccalendar;
            @XmlElement(name = "CALCORGID")
            protected List<MXStringQueryType> calcorgid;
            @XmlElement(name = "CALCPRIORITY", nillable = true)
            protected List<MXLongQueryType> calcpriority;
            @XmlElement(name = "CALCSHIFT")
            protected List<MXStringQueryType> calcshift;
            @XmlElement(name = "CALENDAR")
            protected List<MXStringQueryType> calendar;
            @XmlElement(name = "CHANGEBY")
            protected List<MXStringQueryType> changeby;
            @XmlElement(name = "CHANGEDATE", nillable = true)
            protected List<MXDateTimeQueryType> changedate;
            @XmlElement(name = "CHARGESTORE")
            protected List<MXBooleanQueryType> chargestore;
            @XmlElement(name = "CINUM")
            protected List<MXStringQueryType> cinum;
            @XmlElement(name = "CLASSSTRUCTUREID")
            protected List<MXStringQueryType> classstructureid;
            @XmlElement(name = "COMMODITY")
            protected List<MXStringQueryType> commodity;
            @XmlElement(name = "COMMODITYGROUP")
            protected List<MXStringQueryType> commoditygroup;
            @XmlElement(name = "CONTRACT")
            protected List<MXStringQueryType> contract;
            @XmlElement(name = "CREWID")
            protected List<MXStringQueryType> crewid;
            @XmlElement(name = "CUSTOMERID")
            protected List<MXStringQueryType> customerid;
            @XmlElement(name = "DESCRIPTION")
            protected List<MXStringQueryType> description;
            @XmlElement(name = "DISABLED")
            protected List<MXBooleanQueryType> disabled;
            @XmlElement(name = "DOWNTIME")
            protected List<MXBooleanQueryType> downtime;
            @XmlElement(name = "ENVIRONMENT")
            protected List<MXStringQueryType> environment;
            @XmlElement(name = "ESTATAPPRLABCOST", nillable = true)
            protected List<MXDoubleQueryType> estatapprlabcost;
            @XmlElement(name = "ESTATAPPRLABHRS", nillable = true)
            protected List<MXDoubleQueryType> estatapprlabhrs;
            @XmlElement(name = "ESTATAPPRMATCOST", nillable = true)
            protected List<MXDoubleQueryType> estatapprmatcost;
            @XmlElement(name = "ESTATAPPRSERVCOST", nillable = true)
            protected List<MXDoubleQueryType> estatapprservcost;
            @XmlElement(name = "ESTATAPPRTOOLCOST", nillable = true)
            protected List<MXDoubleQueryType> estatapprtoolcost;
            @XmlElement(name = "ESTDUR", nillable = true)
            protected List<MXDoubleQueryType> estdur;
            @XmlElement(name = "ESTLABCOST", nillable = true)
            protected List<MXDoubleQueryType> estlabcost;
            @XmlElement(name = "ESTLABHRS", nillable = true)
            protected List<MXDoubleQueryType> estlabhrs;
            @XmlElement(name = "ESTMATCOST", nillable = true)
            protected List<MXDoubleQueryType> estmatcost;
            @XmlElement(name = "ESTSERVCOST", nillable = true)
            protected List<MXDoubleQueryType> estservcost;
            @XmlElement(name = "ESTTOOLCOST", nillable = true)
            protected List<MXDoubleQueryType> esttoolcost;
            @XmlElement(name = "EXTERNALREFID")
            protected List<MXStringQueryType> externalrefid;
            @XmlElement(name = "FAILDATE", nillable = true)
            protected List<MXDateTimeQueryType> faildate;
            @XmlElement(name = "FAILURECODE")
            protected List<MXStringQueryType> failurecode;
            @XmlElement(name = "FAULTTYPE", nillable = true)
            protected List<MXLongQueryType> faulttype;
            @XmlElement(name = "FINCNTRLID")
            protected List<MXStringQueryType> fincntrlid;
            @XmlElement(name = "FIRSTAPPRSTATUS")
            protected List<MXStringQueryType> firstapprstatus;
            @XmlElement(name = "FLOWACTION")
            protected List<MXStringQueryType> flowaction;
            @XmlElement(name = "FLOWACTIONASSIST")
            protected List<MXBooleanQueryType> flowactionassist;
            @XmlElement(name = "FLOWCONTROLLED")
            protected List<MXBooleanQueryType> flowcontrolled;
            @XmlElement(name = "GENERATEDFORPO")
            protected List<MXStringQueryType> generatedforpo;
            @XmlElement(name = "GENFORPOLINEID", nillable = true)
            protected List<MXLongQueryType> genforpolineid;
            @XmlElement(name = "GLACCOUNT")
            protected List<MXGLAccountQueryType> glaccount;
            @XmlElement(name = "HASCHILDREN")
            protected List<MXBooleanQueryType> haschildren;
            @XmlElement(name = "HASFOLLOWUPWORK")
            protected List<MXBooleanQueryType> hasfollowupwork;
            @XmlElement(name = "HISTORYFLAG")
            protected List<MXBooleanQueryType> historyflag;
            @XmlElement(name = "INSPECTOR")
            protected List<MXStringQueryType> inspector;
            @XmlElement(name = "INTERRUPTIBLE")
            protected List<MXBooleanQueryType> interruptible;
            @XmlElement(name = "ISTASK")
            protected List<MXBooleanQueryType> istask;
            @XmlElement(name = "JOBTASKID", nillable = true)
            protected List<MXLongQueryType> jobtaskid;
            @XmlElement(name = "JPNUM")
            protected List<MXStringQueryType> jpnum;
            @XmlElement(name = "JUSTIFYPRIORITY")
            protected List<MXStringQueryType> justifypriority;
            @XmlElement(name = "LAUNCHENTRYNAME")
            protected List<MXStringQueryType> launchentryname;
            @XmlElement(name = "LEAD")
            protected List<MXStringQueryType> lead;
            @XmlElement(name = "LINEID")
            protected List<MXStringQueryType> lineid;
            @XmlElement(name = "LOCATION")
            protected List<MXStringQueryType> location;
            @XmlElement(name = "MEASUREDATE", nillable = true)
            protected List<MXDateTimeQueryType> measuredate;
            @XmlElement(name = "MEASUREMENTVALUE", nillable = true)
            protected List<MXDoubleQueryType> measurementvalue;
            @XmlElement(name = "NEWCHILDCLASS")
            protected List<MXStringQueryType> newchildclass;
            @XmlElement(name = "OBSERVATION")
            protected List<MXStringQueryType> observation;
            @XmlElement(name = "ONBEHALFOF")
            protected List<MXStringQueryType> onbehalfof;
            @XmlElement(name = "ORGID")
            protected List<MXStringQueryType> orgid;
            @XmlElement(name = "ORIGRECORDCLASS")
            protected List<MXStringQueryType> origrecordclass;
            @XmlElement(name = "ORIGRECORDID")
            protected List<MXStringQueryType> origrecordid;
            @XmlElement(name = "OUTLABCOST", nillable = true)
            protected List<MXDoubleQueryType> outlabcost;
            @XmlElement(name = "OUTMATCOST", nillable = true)
            protected List<MXDoubleQueryType> outmatcost;
            @XmlElement(name = "OUTTOOLCOST", nillable = true)
            protected List<MXDoubleQueryType> outtoolcost;
            @XmlElement(name = "OWNER")
            protected List<MXStringQueryType> owner;
            @XmlElement(name = "OWNERGROUP")
            protected List<MXStringQueryType> ownergroup;
            @XmlElement(name = "OWNERSYSID")
            protected List<MXStringQueryType> ownersysid;
            @XmlElement(name = "PARENT")
            protected List<MXStringQueryType> parent;
            @XmlElement(name = "PARENTCHGSSTATUS")
            protected List<MXBooleanQueryType> parentchgsstatus;
            @XmlElement(name = "PERSONGROUP")
            protected List<MXStringQueryType> persongroup;
            @XmlElement(name = "PHONE")
            protected List<MXStringQueryType> phone;
            @XmlElement(name = "PLUSPADDRESSLINE2")
            protected List<MXStringQueryType> pluspaddressline2;
            @XmlElement(name = "PLUSPADDRESSLINE3")
            protected List<MXStringQueryType> pluspaddressline3;
            @XmlElement(name = "PLUSPADDRISCHANGED")
            protected List<MXBooleanQueryType> pluspaddrischanged;
            @XmlElement(name = "PLUSPAGREEMENT")
            protected List<MXStringQueryType> pluspagreement;
            @XmlElement(name = "PLUSPALLOWQUOTE")
            protected List<MXBooleanQueryType> pluspallowquote;
            @XmlElement(name = "PLUSPBBLINENUM", nillable = true)
            protected List<MXLongQueryType> pluspbblinenum;
            @XmlElement(name = "PLUSPBILLBATCH")
            protected List<MXStringQueryType> pluspbillbatch;
            @XmlElement(name = "PLUSPBILLBATCHID", nillable = true)
            protected List<MXLongQueryType> pluspbillbatchid;
            @XmlElement(name = "PLUSPBILLSTATUS")
            protected List<MXStringQueryType> pluspbillstatus;
            @XmlElement(name = "PLUSPCALCCALNUM")
            protected List<MXStringQueryType> pluspcalccalnum;
            @XmlElement(name = "PLUSPCALCORGID")
            protected List<MXStringQueryType> pluspcalcorgid;
            @XmlElement(name = "PLUSPCALCSHIFT")
            protected List<MXStringQueryType> pluspcalcshift;
            @XmlElement(name = "PLUSPCITY")
            protected List<MXStringQueryType> pluspcity;
            @XmlElement(name = "PLUSPCOSTCENTER")
            protected List<MXStringQueryType> pluspcostcenter;
            @XmlElement(name = "PLUSPCOUNTRY")
            protected List<MXStringQueryType> pluspcountry;
            @XmlElement(name = "PLUSPCOUNTY")
            protected List<MXStringQueryType> pluspcounty;
            @XmlElement(name = "PLUSPCUSTCHACCT")
            protected List<MXStringQueryType> pluspcustchacct;
            @XmlElement(name = "PLUSPCUSTOMER")
            protected List<MXStringQueryType> pluspcustomer;
            @XmlElement(name = "PLUSPCUSTPONUM")
            protected List<MXStringQueryType> pluspcustponum;
            @XmlElement(name = "PLUSPDIRECTIONS")
            protected List<MXStringQueryType> pluspdirections;
            @XmlElement(name = "PLUSPGEOCODE")
            protected List<MXStringQueryType> pluspgeocode;
            @XmlElement(name = "PLUSPLATDIRECTION")
            protected List<MXStringQueryType> plusplatdirection;
            @XmlElement(name = "PLUSPLATITUDE", nillable = true)
            protected List<MXDoubleQueryType> plusplatitude;
            @XmlElement(name = "PLUSPLINESTATUS")
            protected List<MXStringQueryType> plusplinestatus;
            @XmlElement(name = "PLUSPLONGDIRECTION")
            protected List<MXStringQueryType> plusplongdirection;
            @XmlElement(name = "PLUSPLONGITUDE", nillable = true)
            protected List<MXDoubleQueryType> plusplongitude;
            @XmlElement(name = "PLUSPMAXPRICE", nillable = true)
            protected List<MXDoubleQueryType> pluspmaxprice;
            @XmlElement(name = "PLUSPORIGQPRICE", nillable = true)
            protected List<MXDoubleQueryType> plusporigqprice;
            @XmlElement(name = "PLUSPORIGQTYPE")
            protected List<MXStringQueryType> plusporigqtype;
            @XmlElement(name = "PLUSPPOREQ")
            protected List<MXBooleanQueryType> pluspporeq;
            @XmlElement(name = "PLUSPPOSTALCODE")
            protected List<MXStringQueryType> plusppostalcode;
            @XmlElement(name = "PLUSPPRICESCHED")
            protected List<MXStringQueryType> plusppricesched;
            @XmlElement(name = "PLUSPQUOTEDPRICE", nillable = true)
            protected List<MXDoubleQueryType> pluspquotedprice;
            @XmlElement(name = "PLUSPQUOTETYPE")
            protected List<MXStringQueryType> pluspquotetype;
            @XmlElement(name = "PLUSPREFPOINT")
            protected List<MXStringQueryType> plusprefpoint;
            @XmlElement(name = "PLUSPREGIONDISTR")
            protected List<MXStringQueryType> pluspregiondistr;
            @XmlElement(name = "PLUSPRESPONSEPLAN")
            protected List<MXStringQueryType> pluspresponseplan;
            @XmlElement(name = "PLUSPREVNUM", nillable = true)
            protected List<MXLongQueryType> plusprevnum;
            @XmlElement(name = "PLUSPSTADDRDIRPRFX")
            protected List<MXStringQueryType> pluspstaddrdirprfx;
            @XmlElement(name = "PLUSPSTADDRDIRSFX")
            protected List<MXStringQueryType> pluspstaddrdirsfx;
            @XmlElement(name = "PLUSPSTADDRNUMBER")
            protected List<MXStringQueryType> pluspstaddrnumber;
            @XmlElement(name = "PLUSPSTADDRSTREET")
            protected List<MXStringQueryType> pluspstaddrstreet;
            @XmlElement(name = "PLUSPSTADDRSTTYPE")
            protected List<MXStringQueryType> pluspstaddrsttype;
            @XmlElement(name = "PLUSPSTADDRUNITNUM")
            protected List<MXStringQueryType> pluspstaddrunitnum;
            @XmlElement(name = "PLUSPSTATEPROVINCE")
            protected List<MXStringQueryType> pluspstateprovince;
            @XmlElement(name = "PLUSPSTREETADDRESS")
            protected List<MXStringQueryType> pluspstreetaddress;
            @XmlElement(name = "PLUSPTIMEZONE")
            protected List<MXStringQueryType> plusptimezone;
            @XmlElement(name = "PMCOMBPELACTNAME")
            protected List<MXStringQueryType> pmcombpelactname;
            @XmlElement(name = "PMCOMBPELENABLED")
            protected List<MXBooleanQueryType> pmcombpelenabled;
            @XmlElement(name = "PMCOMBPELINPROG")
            protected List<MXBooleanQueryType> pmcombpelinprog;
            @XmlElement(name = "PMCOMIMPACT", nillable = true)
            protected List<MXLongQueryType> pmcomimpact;
            @XmlElement(name = "PMCOMSTATE")
            protected List<MXStringQueryType> pmcomstate;
            @XmlElement(name = "PMCOMTYPE")
            protected List<MXStringQueryType> pmcomtype;
            @XmlElement(name = "PMCOMURGENCY", nillable = true)
            protected List<MXLongQueryType> pmcomurgency;
            @XmlElement(name = "PMDUEDATE", nillable = true)
            protected List<MXDateTimeQueryType> pmduedate;
            @XmlElement(name = "PMEXTDATE", nillable = true)
            protected List<MXDateTimeQueryType> pmextdate;
            @XmlElement(name = "PMNEXTDUEDATE", nillable = true)
            protected List<MXDateTimeQueryType> pmnextduedate;
            @XmlElement(name = "PMNUM")
            protected List<MXStringQueryType> pmnum;
            @XmlElement(name = "POINTNUM")
            protected List<MXStringQueryType> pointnum;
            @XmlElement(name = "PRECKAID")
            protected List<MXStringQueryType> preckaid;
            @XmlElement(name = "PROBLEMCODE")
            protected List<MXStringQueryType> problemcode;
            @XmlElement(name = "REASONFORCHANGE")
            protected List<MXStringQueryType> reasonforchange;
            @XmlElement(name = "REGION", nillable = true)
            protected List<MXLongQueryType> region;
            @XmlElement(name = "REMDUR", nillable = true)
            protected List<MXDoubleQueryType> remdur;
            @XmlElement(name = "REPORTDATE", nillable = true)
            protected List<MXDateTimeQueryType> reportdate;
            @XmlElement(name = "REPORTEDBY")
            protected List<MXStringQueryType> reportedby;
            @XmlElement(name = "RESPONDBY", nillable = true)
            protected List<MXDateTimeQueryType> respondby;
            @XmlElement(name = "RISK")
            protected List<MXStringQueryType> risk;
            @XmlElement(name = "ROUTE")
            protected List<MXStringQueryType> route;
            @XmlElement(name = "ROUTESTOPID", nillable = true)
            protected List<MXLongQueryType> routestopid;
            @XmlElement(name = "SCHEDFINISH", nillable = true)
            protected List<MXDateTimeQueryType> schedfinish;
            @XmlElement(name = "SCHEDSTART", nillable = true)
            protected List<MXDateTimeQueryType> schedstart;
            @XmlElement(name = "SENDERSYSID")
            protected List<MXStringQueryType> sendersysid;
            @XmlElement(name = "SERVICESINFAULT", nillable = true)
            protected List<MXLongQueryType> servicesinfault;
            @XmlElement(name = "SITEID")
            protected List<MXStringQueryType> siteid;
            @XmlElement(name = "SOURCESYSID")
            protected List<MXStringQueryType> sourcesysid;
            @XmlElement(name = "STATUS")
            protected List<MXStringQueryType> status;
            @XmlElement(name = "STATUSDATE", nillable = true)
            protected List<MXDateTimeQueryType> statusdate;
            @XmlElement(name = "SUPERVISOR")
            protected List<MXStringQueryType> supervisor;
            @XmlElement(name = "SUSPENDFLOW")
            protected List<MXBooleanQueryType> suspendflow;
            @XmlElement(name = "TARGCOMPDATE", nillable = true)
            protected List<MXDateTimeQueryType> targcompdate;
            @XmlElement(name = "TARGETDESC")
            protected List<MXStringQueryType> targetdesc;
            @XmlElement(name = "TARGSTARTDATE", nillable = true)
            protected List<MXDateTimeQueryType> targstartdate;
            @XmlElement(name = "TASKID", nillable = true)
            protected List<MXLongQueryType> taskid;
            @XmlElement(name = "VENDOR")
            protected List<MXStringQueryType> vendor;
            @XmlElement(name = "VERIFICATION")
            protected List<MXStringQueryType> verification;
            @XmlElement(name = "WHOMISCHANGEFOR")
            protected List<MXStringQueryType> whomischangefor;
            @XmlElement(name = "WOACCEPTSCHARGES")
            protected List<MXBooleanQueryType> woacceptscharges;
            @XmlElement(name = "WOCLASS")
            protected List<MXStringQueryType> woclass;
            @XmlElement(name = "WOEQ1")
            protected List<MXStringQueryType> woeq1;
            @XmlElement(name = "WOEQ10")
            protected List<MXStringQueryType> woeq10;
            @XmlElement(name = "WOEQ11")
            protected List<MXStringQueryType> woeq11;
            @XmlElement(name = "WOEQ12", nillable = true)
            protected List<MXDoubleQueryType> woeq12;
            @XmlElement(name = "WOEQ13", nillable = true)
            protected List<MXDateTimeQueryType> woeq13;
            @XmlElement(name = "WOEQ14", nillable = true)
            protected List<MXDoubleQueryType> woeq14;
            @XmlElement(name = "WOEQ2")
            protected List<MXStringQueryType> woeq2;
            @XmlElement(name = "WOEQ3")
            protected List<MXStringQueryType> woeq3;
            @XmlElement(name = "WOEQ4")
            protected List<MXStringQueryType> woeq4;
            @XmlElement(name = "WOEQ5", nillable = true)
            protected List<MXDoubleQueryType> woeq5;
            @XmlElement(name = "WOEQ6", nillable = true)
            protected List<MXDateTimeQueryType> woeq6;
            @XmlElement(name = "WOEQ7", nillable = true)
            protected List<MXDoubleQueryType> woeq7;
            @XmlElement(name = "WOEQ8")
            protected List<MXStringQueryType> woeq8;
            @XmlElement(name = "WOEQ9")
            protected List<MXStringQueryType> woeq9;
            @XmlElement(name = "WOGROUP")
            protected List<MXStringQueryType> wogroup;
            @XmlElement(name = "WOISSWAP")
            protected List<MXBooleanQueryType> woisswap;
            @XmlElement(name = "WOJO1")
            protected List<MXStringQueryType> wojo1;
            @XmlElement(name = "WOJO2")
            protected List<MXStringQueryType> wojo2;
            @XmlElement(name = "WOJO3")
            protected List<MXStringQueryType> wojo3;
            @XmlElement(name = "WOJO4", nillable = true)
            protected List<MXDoubleQueryType> wojo4;
            @XmlElement(name = "WOJO5")
            protected List<MXStringQueryType> wojo5;
            @XmlElement(name = "WOJO6")
            protected List<MXStringQueryType> wojo6;
            @XmlElement(name = "WOJO7")
            protected List<MXStringQueryType> wojo7;
            @XmlElement(name = "WOJO8")
            protected List<MXStringQueryType> wojo8;
            @XmlElement(name = "WOJP1")
            protected List<MXStringQueryType> wojp1;
            @XmlElement(name = "WOJP2")
            protected List<MXStringQueryType> wojp2;
            @XmlElement(name = "WOJP3")
            protected List<MXStringQueryType> wojp3;
            @XmlElement(name = "WOJP4", nillable = true)
            protected List<MXDoubleQueryType> wojp4;
            @XmlElement(name = "WOJP5", nillable = true)
            protected List<MXDateTimeQueryType> wojp5;
            @XmlElement(name = "WOL1")
            protected List<MXStringQueryType> wol1;
            @XmlElement(name = "WOL2")
            protected List<MXStringQueryType> wol2;
            @XmlElement(name = "WOL3", nillable = true)
            protected List<MXDoubleQueryType> wol3;
            @XmlElement(name = "WOL4", nillable = true)
            protected List<MXDateTimeQueryType> wol4;
            @XmlElement(name = "WOLABLNK")
            protected List<MXStringQueryType> wolablnk;
            @XmlElement(name = "WOLO1")
            protected List<MXStringQueryType> wolo1;
            @XmlElement(name = "WOLO10", nillable = true)
            protected List<MXLongQueryType> wolo10;
            @XmlElement(name = "WOLO2")
            protected List<MXStringQueryType> wolo2;
            @XmlElement(name = "WOLO3")
            protected List<MXStringQueryType> wolo3;
            @XmlElement(name = "WOLO4")
            protected List<MXStringQueryType> wolo4;
            @XmlElement(name = "WOLO5")
            protected List<MXStringQueryType> wolo5;
            @XmlElement(name = "WOLO6", nillable = true)
            protected List<MXDoubleQueryType> wolo6;
            @XmlElement(name = "WOLO7", nillable = true)
            protected List<MXDateTimeQueryType> wolo7;
            @XmlElement(name = "WOLO8", nillable = true)
            protected List<MXDoubleQueryType> wolo8;
            @XmlElement(name = "WOLO9")
            protected List<MXStringQueryType> wolo9;
            @XmlElement(name = "WONUM")
            protected List<MXStringQueryType> wonum;
            @XmlElement(name = "WOPRIORITY", nillable = true)
            protected List<MXLongQueryType> wopriority;
            @XmlElement(name = "WORKLOCATION")
            protected List<MXStringQueryType> worklocation;
            @XmlElement(name = "WORKORDERID", nillable = true)
            protected List<MXLongQueryType> workorderid;
            @XmlElement(name = "WORKTYPE")
            protected List<MXStringQueryType> worktype;
            @XmlElement(name = "WORTS1")
            protected List<MXStringQueryType> worts1;
            @XmlElement(name = "WORTS2")
            protected List<MXStringQueryType> worts2;
            @XmlElement(name = "WORTS3")
            protected List<MXStringQueryType> worts3;
            @XmlElement(name = "WORTS4", nillable = true)
            protected List<MXDateTimeQueryType> worts4;
            @XmlElement(name = "WORTS5", nillable = true)
            protected List<MXDoubleQueryType> worts5;
            @XmlElement(name = "WOSEQUENCE", nillable = true)
            protected List<MXLongQueryType> wosequence;

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
             * Gets the value of the actmatcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the actmatcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getACTMATCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getACTMATCOST() {
                if (actmatcost == null) {
                    actmatcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.actmatcost;
            }

            /**
             * Gets the value of the actservcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the actservcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getACTSERVCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getACTSERVCOST() {
                if (actservcost == null) {
                    actservcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.actservcost;
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
             * Gets the value of the acttoolcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the acttoolcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getACTTOOLCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getACTTOOLCOST() {
                if (acttoolcost == null) {
                    acttoolcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.acttoolcost;
            }

            /**
             * Gets the value of the assetlocpriority property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the assetlocpriority property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getASSETLOCPRIORITY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getASSETLOCPRIORITY() {
                if (assetlocpriority == null) {
                    assetlocpriority = new ArrayList<MXLongQueryType>();
                }
                return this.assetlocpriority;
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
             * Gets the value of the backoutplan property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the backoutplan property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBACKOUTPLAN().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getBACKOUTPLAN() {
                if (backoutplan == null) {
                    backoutplan = new ArrayList<MXStringQueryType>();
                }
                return this.backoutplan;
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
             * Gets the value of the calcpriority property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the calcpriority property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCALCPRIORITY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getCALCPRIORITY() {
                if (calcpriority == null) {
                    calcpriority = new ArrayList<MXLongQueryType>();
                }
                return this.calcpriority;
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
             * Gets the value of the calendar property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the calendar property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCALENDAR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getCALENDAR() {
                if (calendar == null) {
                    calendar = new ArrayList<MXStringQueryType>();
                }
                return this.calendar;
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
             * Gets the value of the chargestore property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the chargestore property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCHARGESTORE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getCHARGESTORE() {
                if (chargestore == null) {
                    chargestore = new ArrayList<MXBooleanQueryType>();
                }
                return this.chargestore;
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
             * Gets the value of the contract property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contract property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCONTRACT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getCONTRACT() {
                if (contract == null) {
                    contract = new ArrayList<MXStringQueryType>();
                }
                return this.contract;
            }

            /**
             * Gets the value of the crewid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the crewid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCREWID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getCREWID() {
                if (crewid == null) {
                    crewid = new ArrayList<MXStringQueryType>();
                }
                return this.crewid;
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
             * Gets the value of the disabled property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the disabled property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDISABLED().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getDISABLED() {
                if (disabled == null) {
                    disabled = new ArrayList<MXBooleanQueryType>();
                }
                return this.disabled;
            }

            /**
             * Gets the value of the downtime property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the downtime property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDOWNTIME().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getDOWNTIME() {
                if (downtime == null) {
                    downtime = new ArrayList<MXBooleanQueryType>();
                }
                return this.downtime;
            }

            /**
             * Gets the value of the environment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the environment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getENVIRONMENT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getENVIRONMENT() {
                if (environment == null) {
                    environment = new ArrayList<MXStringQueryType>();
                }
                return this.environment;
            }

            /**
             * Gets the value of the estatapprlabcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estatapprlabcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTATAPPRLABCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTATAPPRLABCOST() {
                if (estatapprlabcost == null) {
                    estatapprlabcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.estatapprlabcost;
            }

            /**
             * Gets the value of the estatapprlabhrs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estatapprlabhrs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTATAPPRLABHRS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTATAPPRLABHRS() {
                if (estatapprlabhrs == null) {
                    estatapprlabhrs = new ArrayList<MXDoubleQueryType>();
                }
                return this.estatapprlabhrs;
            }

            /**
             * Gets the value of the estatapprmatcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estatapprmatcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTATAPPRMATCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTATAPPRMATCOST() {
                if (estatapprmatcost == null) {
                    estatapprmatcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.estatapprmatcost;
            }

            /**
             * Gets the value of the estatapprservcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estatapprservcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTATAPPRSERVCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTATAPPRSERVCOST() {
                if (estatapprservcost == null) {
                    estatapprservcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.estatapprservcost;
            }

            /**
             * Gets the value of the estatapprtoolcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estatapprtoolcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTATAPPRTOOLCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTATAPPRTOOLCOST() {
                if (estatapprtoolcost == null) {
                    estatapprtoolcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.estatapprtoolcost;
            }

            /**
             * Gets the value of the estdur property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estdur property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTDUR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTDUR() {
                if (estdur == null) {
                    estdur = new ArrayList<MXDoubleQueryType>();
                }
                return this.estdur;
            }

            /**
             * Gets the value of the estlabcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estlabcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTLABCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTLABCOST() {
                if (estlabcost == null) {
                    estlabcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.estlabcost;
            }

            /**
             * Gets the value of the estlabhrs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estlabhrs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTLABHRS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTLABHRS() {
                if (estlabhrs == null) {
                    estlabhrs = new ArrayList<MXDoubleQueryType>();
                }
                return this.estlabhrs;
            }

            /**
             * Gets the value of the estmatcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estmatcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTMATCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTMATCOST() {
                if (estmatcost == null) {
                    estmatcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.estmatcost;
            }

            /**
             * Gets the value of the estservcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the estservcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTSERVCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTSERVCOST() {
                if (estservcost == null) {
                    estservcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.estservcost;
            }

            /**
             * Gets the value of the esttoolcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the esttoolcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getESTTOOLCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getESTTOOLCOST() {
                if (esttoolcost == null) {
                    esttoolcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.esttoolcost;
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
             * Gets the value of the faildate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the faildate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFAILDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getFAILDATE() {
                if (faildate == null) {
                    faildate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.faildate;
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
             * Gets the value of the fincntrlid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fincntrlid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFINCNTRLID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getFINCNTRLID() {
                if (fincntrlid == null) {
                    fincntrlid = new ArrayList<MXStringQueryType>();
                }
                return this.fincntrlid;
            }

            /**
             * Gets the value of the firstapprstatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the firstapprstatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFIRSTAPPRSTATUS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getFIRSTAPPRSTATUS() {
                if (firstapprstatus == null) {
                    firstapprstatus = new ArrayList<MXStringQueryType>();
                }
                return this.firstapprstatus;
            }

            /**
             * Gets the value of the flowaction property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flowaction property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFLOWACTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getFLOWACTION() {
                if (flowaction == null) {
                    flowaction = new ArrayList<MXStringQueryType>();
                }
                return this.flowaction;
            }

            /**
             * Gets the value of the flowactionassist property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flowactionassist property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFLOWACTIONASSIST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getFLOWACTIONASSIST() {
                if (flowactionassist == null) {
                    flowactionassist = new ArrayList<MXBooleanQueryType>();
                }
                return this.flowactionassist;
            }

            /**
             * Gets the value of the flowcontrolled property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flowcontrolled property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFLOWCONTROLLED().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getFLOWCONTROLLED() {
                if (flowcontrolled == null) {
                    flowcontrolled = new ArrayList<MXBooleanQueryType>();
                }
                return this.flowcontrolled;
            }

            /**
             * Gets the value of the generatedforpo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the generatedforpo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGENERATEDFORPO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getGENERATEDFORPO() {
                if (generatedforpo == null) {
                    generatedforpo = new ArrayList<MXStringQueryType>();
                }
                return this.generatedforpo;
            }

            /**
             * Gets the value of the genforpolineid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the genforpolineid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGENFORPOLINEID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getGENFORPOLINEID() {
                if (genforpolineid == null) {
                    genforpolineid = new ArrayList<MXLongQueryType>();
                }
                return this.genforpolineid;
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
             * Gets the value of the haschildren property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the haschildren property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHASCHILDREN().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getHASCHILDREN() {
                if (haschildren == null) {
                    haschildren = new ArrayList<MXBooleanQueryType>();
                }
                return this.haschildren;
            }

            /**
             * Gets the value of the hasfollowupwork property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hasfollowupwork property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHASFOLLOWUPWORK().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getHASFOLLOWUPWORK() {
                if (hasfollowupwork == null) {
                    hasfollowupwork = new ArrayList<MXBooleanQueryType>();
                }
                return this.hasfollowupwork;
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
             * Gets the value of the inspector property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the inspector property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getINSPECTOR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getINSPECTOR() {
                if (inspector == null) {
                    inspector = new ArrayList<MXStringQueryType>();
                }
                return this.inspector;
            }

            /**
             * Gets the value of the interruptible property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the interruptible property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getINTERRUPTIBLE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getINTERRUPTIBLE() {
                if (interruptible == null) {
                    interruptible = new ArrayList<MXBooleanQueryType>();
                }
                return this.interruptible;
            }

            /**
             * Gets the value of the istask property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the istask property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getISTASK().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getISTASK() {
                if (istask == null) {
                    istask = new ArrayList<MXBooleanQueryType>();
                }
                return this.istask;
            }

            /**
             * Gets the value of the jobtaskid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the jobtaskid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getJOBTASKID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getJOBTASKID() {
                if (jobtaskid == null) {
                    jobtaskid = new ArrayList<MXLongQueryType>();
                }
                return this.jobtaskid;
            }

            /**
             * Gets the value of the jpnum property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the jpnum property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getJPNUM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getJPNUM() {
                if (jpnum == null) {
                    jpnum = new ArrayList<MXStringQueryType>();
                }
                return this.jpnum;
            }

            /**
             * Gets the value of the justifypriority property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the justifypriority property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getJUSTIFYPRIORITY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getJUSTIFYPRIORITY() {
                if (justifypriority == null) {
                    justifypriority = new ArrayList<MXStringQueryType>();
                }
                return this.justifypriority;
            }

            /**
             * Gets the value of the launchentryname property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the launchentryname property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLAUNCHENTRYNAME().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getLAUNCHENTRYNAME() {
                if (launchentryname == null) {
                    launchentryname = new ArrayList<MXStringQueryType>();
                }
                return this.launchentryname;
            }

            /**
             * Gets the value of the lead property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lead property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLEAD().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getLEAD() {
                if (lead == null) {
                    lead = new ArrayList<MXStringQueryType>();
                }
                return this.lead;
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
             * Gets the value of the measuredate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the measuredate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMEASUREDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getMEASUREDATE() {
                if (measuredate == null) {
                    measuredate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.measuredate;
            }

            /**
             * Gets the value of the measurementvalue property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the measurementvalue property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMEASUREMENTVALUE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getMEASUREMENTVALUE() {
                if (measurementvalue == null) {
                    measurementvalue = new ArrayList<MXDoubleQueryType>();
                }
                return this.measurementvalue;
            }

            /**
             * Gets the value of the newchildclass property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the newchildclass property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNEWCHILDCLASS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getNEWCHILDCLASS() {
                if (newchildclass == null) {
                    newchildclass = new ArrayList<MXStringQueryType>();
                }
                return this.newchildclass;
            }

            /**
             * Gets the value of the observation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the observation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOBSERVATION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getOBSERVATION() {
                if (observation == null) {
                    observation = new ArrayList<MXStringQueryType>();
                }
                return this.observation;
            }

            /**
             * Gets the value of the onbehalfof property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the onbehalfof property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getONBEHALFOF().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getONBEHALFOF() {
                if (onbehalfof == null) {
                    onbehalfof = new ArrayList<MXStringQueryType>();
                }
                return this.onbehalfof;
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
             * Gets the value of the outlabcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the outlabcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOUTLABCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getOUTLABCOST() {
                if (outlabcost == null) {
                    outlabcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.outlabcost;
            }

            /**
             * Gets the value of the outmatcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the outmatcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOUTMATCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getOUTMATCOST() {
                if (outmatcost == null) {
                    outmatcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.outmatcost;
            }

            /**
             * Gets the value of the outtoolcost property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the outtoolcost property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOUTTOOLCOST().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getOUTTOOLCOST() {
                if (outtoolcost == null) {
                    outtoolcost = new ArrayList<MXDoubleQueryType>();
                }
                return this.outtoolcost;
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
             * Gets the value of the ownersysid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ownersysid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOWNERSYSID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getOWNERSYSID() {
                if (ownersysid == null) {
                    ownersysid = new ArrayList<MXStringQueryType>();
                }
                return this.ownersysid;
            }

            /**
             * Gets the value of the parent property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parent property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARENT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPARENT() {
                if (parent == null) {
                    parent = new ArrayList<MXStringQueryType>();
                }
                return this.parent;
            }

            /**
             * Gets the value of the parentchgsstatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parentchgsstatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARENTCHGSSTATUS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getPARENTCHGSSTATUS() {
                if (parentchgsstatus == null) {
                    parentchgsstatus = new ArrayList<MXBooleanQueryType>();
                }
                return this.parentchgsstatus;
            }

            /**
             * Gets the value of the persongroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the persongroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPERSONGROUP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPERSONGROUP() {
                if (persongroup == null) {
                    persongroup = new ArrayList<MXStringQueryType>();
                }
                return this.persongroup;
            }

            /**
             * Gets the value of the phone property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the phone property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPHONE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPHONE() {
                if (phone == null) {
                    phone = new ArrayList<MXStringQueryType>();
                }
                return this.phone;
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
             * Gets the value of the pluspallowquote property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pluspallowquote property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPLUSPALLOWQUOTE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getPLUSPALLOWQUOTE() {
                if (pluspallowquote == null) {
                    pluspallowquote = new ArrayList<MXBooleanQueryType>();
                }
                return this.pluspallowquote;
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
             * Gets the value of the pluspbillbatchid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pluspbillbatchid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPLUSPBILLBATCHID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getPLUSPBILLBATCHID() {
                if (pluspbillbatchid == null) {
                    pluspbillbatchid = new ArrayList<MXLongQueryType>();
                }
                return this.pluspbillbatchid;
            }

            /**
             * Gets the value of the pluspbillstatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pluspbillstatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPLUSPBILLSTATUS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPLUSPBILLSTATUS() {
                if (pluspbillstatus == null) {
                    pluspbillstatus = new ArrayList<MXStringQueryType>();
                }
                return this.pluspbillstatus;
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
             * Gets the value of the plusplatdirection property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the plusplatdirection property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPLUSPLATDIRECTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPLUSPLATDIRECTION() {
                if (plusplatdirection == null) {
                    plusplatdirection = new ArrayList<MXStringQueryType>();
                }
                return this.plusplatdirection;
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
             * Gets the value of the plusplinestatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the plusplinestatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPLUSPLINESTATUS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPLUSPLINESTATUS() {
                if (plusplinestatus == null) {
                    plusplinestatus = new ArrayList<MXStringQueryType>();
                }
                return this.plusplinestatus;
            }

            /**
             * Gets the value of the plusplongdirection property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the plusplongdirection property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPLUSPLONGDIRECTION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPLUSPLONGDIRECTION() {
                if (plusplongdirection == null) {
                    plusplongdirection = new ArrayList<MXStringQueryType>();
                }
                return this.plusplongdirection;
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
             * Gets the value of the plusporigqprice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the plusporigqprice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPLUSPORIGQPRICE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getPLUSPORIGQPRICE() {
                if (plusporigqprice == null) {
                    plusporigqprice = new ArrayList<MXDoubleQueryType>();
                }
                return this.plusporigqprice;
            }

            /**
             * Gets the value of the plusporigqtype property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the plusporigqtype property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPLUSPORIGQTYPE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPLUSPORIGQTYPE() {
                if (plusporigqtype == null) {
                    plusporigqtype = new ArrayList<MXStringQueryType>();
                }
                return this.plusporigqtype;
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
             * Gets the value of the pmcombpelactname property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pmcombpelactname property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPMCOMBPELACTNAME().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPMCOMBPELACTNAME() {
                if (pmcombpelactname == null) {
                    pmcombpelactname = new ArrayList<MXStringQueryType>();
                }
                return this.pmcombpelactname;
            }

            /**
             * Gets the value of the pmcombpelenabled property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pmcombpelenabled property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPMCOMBPELENABLED().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getPMCOMBPELENABLED() {
                if (pmcombpelenabled == null) {
                    pmcombpelenabled = new ArrayList<MXBooleanQueryType>();
                }
                return this.pmcombpelenabled;
            }

            /**
             * Gets the value of the pmcombpelinprog property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pmcombpelinprog property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPMCOMBPELINPROG().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getPMCOMBPELINPROG() {
                if (pmcombpelinprog == null) {
                    pmcombpelinprog = new ArrayList<MXBooleanQueryType>();
                }
                return this.pmcombpelinprog;
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
             * Gets the value of the pmcomstate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pmcomstate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPMCOMSTATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPMCOMSTATE() {
                if (pmcomstate == null) {
                    pmcomstate = new ArrayList<MXStringQueryType>();
                }
                return this.pmcomstate;
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
             * Gets the value of the pmduedate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pmduedate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPMDUEDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getPMDUEDATE() {
                if (pmduedate == null) {
                    pmduedate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.pmduedate;
            }

            /**
             * Gets the value of the pmextdate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pmextdate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPMEXTDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getPMEXTDATE() {
                if (pmextdate == null) {
                    pmextdate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.pmextdate;
            }

            /**
             * Gets the value of the pmnextduedate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pmnextduedate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPMNEXTDUEDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getPMNEXTDUEDATE() {
                if (pmnextduedate == null) {
                    pmnextduedate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.pmnextduedate;
            }

            /**
             * Gets the value of the pmnum property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pmnum property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPMNUM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPMNUM() {
                if (pmnum == null) {
                    pmnum = new ArrayList<MXStringQueryType>();
                }
                return this.pmnum;
            }

            /**
             * Gets the value of the pointnum property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pointnum property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPOINTNUM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getPOINTNUM() {
                if (pointnum == null) {
                    pointnum = new ArrayList<MXStringQueryType>();
                }
                return this.pointnum;
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
             * Gets the value of the reasonforchange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reasonforchange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getREASONFORCHANGE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getREASONFORCHANGE() {
                if (reasonforchange == null) {
                    reasonforchange = new ArrayList<MXStringQueryType>();
                }
                return this.reasonforchange;
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
             * Gets the value of the remdur property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remdur property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getREMDUR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getREMDUR() {
                if (remdur == null) {
                    remdur = new ArrayList<MXDoubleQueryType>();
                }
                return this.remdur;
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
             * Gets the value of the respondby property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the respondby property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRESPONDBY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getRESPONDBY() {
                if (respondby == null) {
                    respondby = new ArrayList<MXDateTimeQueryType>();
                }
                return this.respondby;
            }

            /**
             * Gets the value of the risk property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the risk property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRISK().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getRISK() {
                if (risk == null) {
                    risk = new ArrayList<MXStringQueryType>();
                }
                return this.risk;
            }

            /**
             * Gets the value of the route property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the route property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getROUTE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getROUTE() {
                if (route == null) {
                    route = new ArrayList<MXStringQueryType>();
                }
                return this.route;
            }

            /**
             * Gets the value of the routestopid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the routestopid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getROUTESTOPID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getROUTESTOPID() {
                if (routestopid == null) {
                    routestopid = new ArrayList<MXLongQueryType>();
                }
                return this.routestopid;
            }

            /**
             * Gets the value of the schedfinish property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the schedfinish property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSCHEDFINISH().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getSCHEDFINISH() {
                if (schedfinish == null) {
                    schedfinish = new ArrayList<MXDateTimeQueryType>();
                }
                return this.schedfinish;
            }

            /**
             * Gets the value of the schedstart property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the schedstart property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSCHEDSTART().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getSCHEDSTART() {
                if (schedstart == null) {
                    schedstart = new ArrayList<MXDateTimeQueryType>();
                }
                return this.schedstart;
            }

            /**
             * Gets the value of the sendersysid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sendersysid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSENDERSYSID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getSENDERSYSID() {
                if (sendersysid == null) {
                    sendersysid = new ArrayList<MXStringQueryType>();
                }
                return this.sendersysid;
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
             * Gets the value of the sourcesysid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sourcesysid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSOURCESYSID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getSOURCESYSID() {
                if (sourcesysid == null) {
                    sourcesysid = new ArrayList<MXStringQueryType>();
                }
                return this.sourcesysid;
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
             * Gets the value of the suspendflow property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the suspendflow property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSUSPENDFLOW().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getSUSPENDFLOW() {
                if (suspendflow == null) {
                    suspendflow = new ArrayList<MXBooleanQueryType>();
                }
                return this.suspendflow;
            }

            /**
             * Gets the value of the targcompdate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the targcompdate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTARGCOMPDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getTARGCOMPDATE() {
                if (targcompdate == null) {
                    targcompdate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.targcompdate;
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
             * Gets the value of the targstartdate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the targstartdate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTARGSTARTDATE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getTARGSTARTDATE() {
                if (targstartdate == null) {
                    targstartdate = new ArrayList<MXDateTimeQueryType>();
                }
                return this.targstartdate;
            }

            /**
             * Gets the value of the taskid property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taskid property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTASKID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getTASKID() {
                if (taskid == null) {
                    taskid = new ArrayList<MXLongQueryType>();
                }
                return this.taskid;
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
             * Gets the value of the verification property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the verification property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVERIFICATION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getVERIFICATION() {
                if (verification == null) {
                    verification = new ArrayList<MXStringQueryType>();
                }
                return this.verification;
            }

            /**
             * Gets the value of the whomischangefor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the whomischangefor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWHOMISCHANGEFOR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWHOMISCHANGEFOR() {
                if (whomischangefor == null) {
                    whomischangefor = new ArrayList<MXStringQueryType>();
                }
                return this.whomischangefor;
            }

            /**
             * Gets the value of the woacceptscharges property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woacceptscharges property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOACCEPTSCHARGES().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getWOACCEPTSCHARGES() {
                if (woacceptscharges == null) {
                    woacceptscharges = new ArrayList<MXBooleanQueryType>();
                }
                return this.woacceptscharges;
            }

            /**
             * Gets the value of the woclass property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woclass property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOCLASS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOCLASS() {
                if (woclass == null) {
                    woclass = new ArrayList<MXStringQueryType>();
                }
                return this.woclass;
            }

            /**
             * Gets the value of the woeq1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOEQ1() {
                if (woeq1 == null) {
                    woeq1 = new ArrayList<MXStringQueryType>();
                }
                return this.woeq1;
            }

            /**
             * Gets the value of the woeq10 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq10 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ10().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOEQ10() {
                if (woeq10 == null) {
                    woeq10 = new ArrayList<MXStringQueryType>();
                }
                return this.woeq10;
            }

            /**
             * Gets the value of the woeq11 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq11 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ11().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOEQ11() {
                if (woeq11 == null) {
                    woeq11 = new ArrayList<MXStringQueryType>();
                }
                return this.woeq11;
            }

            /**
             * Gets the value of the woeq12 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq12 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ12().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWOEQ12() {
                if (woeq12 == null) {
                    woeq12 = new ArrayList<MXDoubleQueryType>();
                }
                return this.woeq12;
            }

            /**
             * Gets the value of the woeq13 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq13 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ13().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getWOEQ13() {
                if (woeq13 == null) {
                    woeq13 = new ArrayList<MXDateTimeQueryType>();
                }
                return this.woeq13;
            }

            /**
             * Gets the value of the woeq14 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq14 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ14().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWOEQ14() {
                if (woeq14 == null) {
                    woeq14 = new ArrayList<MXDoubleQueryType>();
                }
                return this.woeq14;
            }

            /**
             * Gets the value of the woeq2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOEQ2() {
                if (woeq2 == null) {
                    woeq2 = new ArrayList<MXStringQueryType>();
                }
                return this.woeq2;
            }

            /**
             * Gets the value of the woeq3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOEQ3() {
                if (woeq3 == null) {
                    woeq3 = new ArrayList<MXStringQueryType>();
                }
                return this.woeq3;
            }

            /**
             * Gets the value of the woeq4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOEQ4() {
                if (woeq4 == null) {
                    woeq4 = new ArrayList<MXStringQueryType>();
                }
                return this.woeq4;
            }

            /**
             * Gets the value of the woeq5 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq5 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ5().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWOEQ5() {
                if (woeq5 == null) {
                    woeq5 = new ArrayList<MXDoubleQueryType>();
                }
                return this.woeq5;
            }

            /**
             * Gets the value of the woeq6 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq6 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ6().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getWOEQ6() {
                if (woeq6 == null) {
                    woeq6 = new ArrayList<MXDateTimeQueryType>();
                }
                return this.woeq6;
            }

            /**
             * Gets the value of the woeq7 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq7 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ7().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWOEQ7() {
                if (woeq7 == null) {
                    woeq7 = new ArrayList<MXDoubleQueryType>();
                }
                return this.woeq7;
            }

            /**
             * Gets the value of the woeq8 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq8 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ8().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOEQ8() {
                if (woeq8 == null) {
                    woeq8 = new ArrayList<MXStringQueryType>();
                }
                return this.woeq8;
            }

            /**
             * Gets the value of the woeq9 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woeq9 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOEQ9().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOEQ9() {
                if (woeq9 == null) {
                    woeq9 = new ArrayList<MXStringQueryType>();
                }
                return this.woeq9;
            }

            /**
             * Gets the value of the wogroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wogroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOGROUP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOGROUP() {
                if (wogroup == null) {
                    wogroup = new ArrayList<MXStringQueryType>();
                }
                return this.wogroup;
            }

            /**
             * Gets the value of the woisswap property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the woisswap property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOISSWAP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXBooleanQueryType }
             * 
             * 
             */
            public List<MXBooleanQueryType> getWOISSWAP() {
                if (woisswap == null) {
                    woisswap = new ArrayList<MXBooleanQueryType>();
                }
                return this.woisswap;
            }

            /**
             * Gets the value of the wojo1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojo1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJO1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJO1() {
                if (wojo1 == null) {
                    wojo1 = new ArrayList<MXStringQueryType>();
                }
                return this.wojo1;
            }

            /**
             * Gets the value of the wojo2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojo2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJO2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJO2() {
                if (wojo2 == null) {
                    wojo2 = new ArrayList<MXStringQueryType>();
                }
                return this.wojo2;
            }

            /**
             * Gets the value of the wojo3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojo3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJO3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJO3() {
                if (wojo3 == null) {
                    wojo3 = new ArrayList<MXStringQueryType>();
                }
                return this.wojo3;
            }

            /**
             * Gets the value of the wojo4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojo4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJO4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWOJO4() {
                if (wojo4 == null) {
                    wojo4 = new ArrayList<MXDoubleQueryType>();
                }
                return this.wojo4;
            }

            /**
             * Gets the value of the wojo5 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojo5 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJO5().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJO5() {
                if (wojo5 == null) {
                    wojo5 = new ArrayList<MXStringQueryType>();
                }
                return this.wojo5;
            }

            /**
             * Gets the value of the wojo6 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojo6 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJO6().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJO6() {
                if (wojo6 == null) {
                    wojo6 = new ArrayList<MXStringQueryType>();
                }
                return this.wojo6;
            }

            /**
             * Gets the value of the wojo7 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojo7 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJO7().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJO7() {
                if (wojo7 == null) {
                    wojo7 = new ArrayList<MXStringQueryType>();
                }
                return this.wojo7;
            }

            /**
             * Gets the value of the wojo8 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojo8 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJO8().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJO8() {
                if (wojo8 == null) {
                    wojo8 = new ArrayList<MXStringQueryType>();
                }
                return this.wojo8;
            }

            /**
             * Gets the value of the wojp1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojp1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJP1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJP1() {
                if (wojp1 == null) {
                    wojp1 = new ArrayList<MXStringQueryType>();
                }
                return this.wojp1;
            }

            /**
             * Gets the value of the wojp2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojp2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJP2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJP2() {
                if (wojp2 == null) {
                    wojp2 = new ArrayList<MXStringQueryType>();
                }
                return this.wojp2;
            }

            /**
             * Gets the value of the wojp3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojp3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJP3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOJP3() {
                if (wojp3 == null) {
                    wojp3 = new ArrayList<MXStringQueryType>();
                }
                return this.wojp3;
            }

            /**
             * Gets the value of the wojp4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojp4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJP4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWOJP4() {
                if (wojp4 == null) {
                    wojp4 = new ArrayList<MXDoubleQueryType>();
                }
                return this.wojp4;
            }

            /**
             * Gets the value of the wojp5 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wojp5 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOJP5().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getWOJP5() {
                if (wojp5 == null) {
                    wojp5 = new ArrayList<MXDateTimeQueryType>();
                }
                return this.wojp5;
            }

            /**
             * Gets the value of the wol1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wol1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOL1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOL1() {
                if (wol1 == null) {
                    wol1 = new ArrayList<MXStringQueryType>();
                }
                return this.wol1;
            }

            /**
             * Gets the value of the wol2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wol2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOL2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOL2() {
                if (wol2 == null) {
                    wol2 = new ArrayList<MXStringQueryType>();
                }
                return this.wol2;
            }

            /**
             * Gets the value of the wol3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wol3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOL3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWOL3() {
                if (wol3 == null) {
                    wol3 = new ArrayList<MXDoubleQueryType>();
                }
                return this.wol3;
            }

            /**
             * Gets the value of the wol4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wol4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOL4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getWOL4() {
                if (wol4 == null) {
                    wol4 = new ArrayList<MXDateTimeQueryType>();
                }
                return this.wol4;
            }

            /**
             * Gets the value of the wolablnk property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolablnk property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLABLNK().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOLABLNK() {
                if (wolablnk == null) {
                    wolablnk = new ArrayList<MXStringQueryType>();
                }
                return this.wolablnk;
            }

            /**
             * Gets the value of the wolo1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOLO1() {
                if (wolo1 == null) {
                    wolo1 = new ArrayList<MXStringQueryType>();
                }
                return this.wolo1;
            }

            /**
             * Gets the value of the wolo10 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo10 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO10().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getWOLO10() {
                if (wolo10 == null) {
                    wolo10 = new ArrayList<MXLongQueryType>();
                }
                return this.wolo10;
            }

            /**
             * Gets the value of the wolo2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOLO2() {
                if (wolo2 == null) {
                    wolo2 = new ArrayList<MXStringQueryType>();
                }
                return this.wolo2;
            }

            /**
             * Gets the value of the wolo3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOLO3() {
                if (wolo3 == null) {
                    wolo3 = new ArrayList<MXStringQueryType>();
                }
                return this.wolo3;
            }

            /**
             * Gets the value of the wolo4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOLO4() {
                if (wolo4 == null) {
                    wolo4 = new ArrayList<MXStringQueryType>();
                }
                return this.wolo4;
            }

            /**
             * Gets the value of the wolo5 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo5 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO5().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOLO5() {
                if (wolo5 == null) {
                    wolo5 = new ArrayList<MXStringQueryType>();
                }
                return this.wolo5;
            }

            /**
             * Gets the value of the wolo6 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo6 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO6().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWOLO6() {
                if (wolo6 == null) {
                    wolo6 = new ArrayList<MXDoubleQueryType>();
                }
                return this.wolo6;
            }

            /**
             * Gets the value of the wolo7 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo7 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO7().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getWOLO7() {
                if (wolo7 == null) {
                    wolo7 = new ArrayList<MXDateTimeQueryType>();
                }
                return this.wolo7;
            }

            /**
             * Gets the value of the wolo8 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo8 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO8().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWOLO8() {
                if (wolo8 == null) {
                    wolo8 = new ArrayList<MXDoubleQueryType>();
                }
                return this.wolo8;
            }

            /**
             * Gets the value of the wolo9 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wolo9 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOLO9().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWOLO9() {
                if (wolo9 == null) {
                    wolo9 = new ArrayList<MXStringQueryType>();
                }
                return this.wolo9;
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
             * Gets the value of the wopriority property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wopriority property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOPRIORITY().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getWOPRIORITY() {
                if (wopriority == null) {
                    wopriority = new ArrayList<MXLongQueryType>();
                }
                return this.wopriority;
            }

            /**
             * Gets the value of the worklocation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the worklocation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWORKLOCATION().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWORKLOCATION() {
                if (worklocation == null) {
                    worklocation = new ArrayList<MXStringQueryType>();
                }
                return this.worklocation;
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
             * Gets the value of the worktype property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the worktype property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWORKTYPE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWORKTYPE() {
                if (worktype == null) {
                    worktype = new ArrayList<MXStringQueryType>();
                }
                return this.worktype;
            }

            /**
             * Gets the value of the worts1 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the worts1 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWORTS1().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWORTS1() {
                if (worts1 == null) {
                    worts1 = new ArrayList<MXStringQueryType>();
                }
                return this.worts1;
            }

            /**
             * Gets the value of the worts2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the worts2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWORTS2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWORTS2() {
                if (worts2 == null) {
                    worts2 = new ArrayList<MXStringQueryType>();
                }
                return this.worts2;
            }

            /**
             * Gets the value of the worts3 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the worts3 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWORTS3().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXStringQueryType }
             * 
             * 
             */
            public List<MXStringQueryType> getWORTS3() {
                if (worts3 == null) {
                    worts3 = new ArrayList<MXStringQueryType>();
                }
                return this.worts3;
            }

            /**
             * Gets the value of the worts4 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the worts4 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWORTS4().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDateTimeQueryType }
             * 
             * 
             */
            public List<MXDateTimeQueryType> getWORTS4() {
                if (worts4 == null) {
                    worts4 = new ArrayList<MXDateTimeQueryType>();
                }
                return this.worts4;
            }

            /**
             * Gets the value of the worts5 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the worts5 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWORTS5().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXDoubleQueryType }
             * 
             * 
             */
            public List<MXDoubleQueryType> getWORTS5() {
                if (worts5 == null) {
                    worts5 = new ArrayList<MXDoubleQueryType>();
                }
                return this.worts5;
            }

            /**
             * Gets the value of the wosequence property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the wosequence property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWOSEQUENCE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MXLongQueryType }
             * 
             * 
             */
            public List<MXLongQueryType> getWOSEQUENCE() {
                if (wosequence == null) {
                    wosequence = new ArrayList<MXLongQueryType>();
                }
                return this.wosequence;
            }

        }

    }

}

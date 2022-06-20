
package ibm_query;

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
 *                   &lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INTERNALPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="IMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="URGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDPERSON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SOURCE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SUPERVISOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ISGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RELATEDTOGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="GLOBALTICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="GLOBALTICKETCLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALRECID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SITEVISIT" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECORDCLASS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="GLACCOUNT" type="{http://www.ibm.com/maximo}MXGLAccountQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="COMMODITYGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="COMMODITY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INHERITSTATUS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ISKNOWNERROR" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECSITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGRECORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TEMPLATE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="HASACTIVITY" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FAILURECODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PROBLEMCODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ACTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ACTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDEMAIL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPORTEDEMAIL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ASSETSITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TEMPLATEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="VENDOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ASSETNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ISKNOWNERRORDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ACTUALCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FR1CODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FR2CODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SOLUTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ASSETORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LANGCODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="HASLD" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CREATEWOMULTI" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TARGETDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SELFSERVSOLACCESS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="HASSOLUTION" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CALCORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CALCCALENDAR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CALCSHIFT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPQUOTETYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPQUOTEDPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPAGREEMENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCUSTOMER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCOSTCENTER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCUSTCHACCT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPRESPONSEPLAN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPREVNUM" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPRICESCHED" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCUSTPONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPMAXPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPBILLBATCH" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPBBLINENUM" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPOREQ" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCALCORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCALCCALNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPCALCSHIFT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMRESOLUTION" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMIMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOMURGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INDICATEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="EXTERNALSYSTEM" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DESCSRVID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CREATIONDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="VIRTUALENV" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OUTAGEDURATION" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCCRID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCITEMNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCOFFSUMMARY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCQUANTITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ACCUMULATEDHOLDTIME" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETRESPONSETIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CORRELATIONATTRS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FAULTTYPE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMERNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMERID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="KATEGORIJA" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REGION" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ADRESAKORISNIKA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OPERATORNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMERVALUE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OLA" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NOTEOPEN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACTPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACTPERSON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CONTACTEMAIL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LINEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ROOTCUSTOMERREF" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TECHNICIANNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="HASSUPPORTCONTRACT" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SERVICESINFAULT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PRECKAID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DOMEN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DSLAMPORT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SERIALNUMBERSTB" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="HGWTIP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LINISKAOPREMA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ADRESAIZVOD" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SERIALNUMBERHGW" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PAKET" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="KABEL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="IZVOD" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PARICA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RAM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REBRO" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="POZICIJA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CENTRALAPORT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PRESPOJBROJ" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PRESPOJLINIJA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TIPDSLAM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="MOZEOPTIKA" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STRING1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STRING2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STRING3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INT1" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INT2" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INT3" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DATE1" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DATE2" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="EXTSYSID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TIPPRETPLATNIKA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="HNMOUTPUT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ALATOUTPUT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPEATED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ATURBITS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ATUCBITS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SLATIPSERVIS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AFFECTEDSERVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGINATEDCOMPANY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="MESTOPOVREDE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RESOLVEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FAULTLOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ALTCONTACTPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TKTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SMSPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="IMPACTEDREGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SMSGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STRING4" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ATRIBUT1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PREVIOUSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="BACKUP" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TRANSMISSIONPATH" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NEXTDEVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ORIGINATEDDEVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="IMSMIGRATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CABLEGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="VOZDUSNAMREZA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CABLETYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OKNOBROJ" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TIPOVINACEVKE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SMS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBEROFAFFECTEDCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBEROFAFFECTEDKEYCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PROBABLECAUSE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WITHOUTINT" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="POWER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AGGREGATE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TRANSMISSION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CONTROLLER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SMSTYPE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="SMSPREVIEW" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DEVICENAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RESOLVER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WOCATALOG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CENTRALA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LOGCREATE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LOGDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LOGINCTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="LOGLONG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DIAGINVOKE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DIAGRESULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DIAGTEMPRESULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CHECK1" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CHECK2" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CHECK3" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DATE3" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="DATE4" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INT4" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INT5" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INT6" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STRING5" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STRING6" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="STRING7" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REASONT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TYPEOFFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="TIPPREKIN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ONCALLFIRSTROTASSNPERSON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ONCALLSTARTTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ONCALLAUTOASSIGN" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ONCALLREASSIGNTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ONCALLOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REPLACEDOWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOSOLAPPLIEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOSOLAPPLIEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOSOLFEEDBACK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMCOSOLSTATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCITEMSETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCTMPLID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCINVALID" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCRECURRINGPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCONETIMEPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCTOTALRECURRINGPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCTOTALONETIMEPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PMSCCURRENCY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RBA_RC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="CREATEPROBLEMDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="RESOLUTIONPROBLEM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WORKAROUND" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WAYOFREPAIR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PRRELATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="REASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="KNOWNERROR" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="WORKAROUNDDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INT8" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="INT9" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="FAULTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ROOTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPOOLNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPOOLITEMNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPPOOLITEMSETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPTARGDELIVERYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PLUSPACTDELIVERYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *         &lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INTERNALPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="URGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDPERSON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SOURCE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SUPERVISOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ISGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RELATEDTOGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="GLOBALTICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="GLOBALTICKETCLASS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALRECID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SITEVISIT" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECORDCLASS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="GLACCOUNT" type="{http://www.ibm.com/maximo}MXGLAccountQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="COMMODITYGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="COMMODITY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INHERITSTATUS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ISKNOWNERROR" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TARGETSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TARGETFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALSTART" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALFINISH" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECSITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ORIGRECORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TEMPLATE" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="HASACTIVITY" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FAILURECODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PROBLEMCODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ACTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ACTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDEMAIL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPORTEDEMAIL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ASSETSITEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TEMPLATEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="VENDOR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ASSETNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ISKNOWNERRORDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TARGETCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ACTUALCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FR1CODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FR2CODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SOLUTION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ASSETORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LANGCODE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="HASLD" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CREATEWOMULTI" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TARGETDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SELFSERVSOLACCESS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="HASSOLUTION" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CALCORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CALCCALENDAR" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CALCSHIFT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPQUOTETYPE" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPQUOTEDPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPAGREEMENT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCUSTOMER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCOSTCENTER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCUSTCHACCT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPRESPONSEPLAN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPREVNUM" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPRICESCHED" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCUSTPONUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPMAXPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPBILLBATCH" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPBBLINENUM" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPOREQ" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCALCORGID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCALCCALNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPCALCSHIFT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMRESOLUTION" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMIMPACT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMCOMURGENCY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INDICATEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="EXTERNALSYSTEM" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DESCSRVID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CREATIONDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="VIRTUALENV" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OUTAGEDURATION" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCCRID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCITEMNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCOFFSUMMARY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCQUANTITY" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ACCUMULATEDHOLDTIME" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETRESPONSETIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CORRELATIONATTRS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FAULTTYPE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMERNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMERID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="KATEGORIJA" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REGION" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ADRESAKORISNIKA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OPERATORNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMERVALUE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OLA" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NOTEOPEN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CONTACTPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CONTACTPERSON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CONTACTEMAIL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LINEID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ROOTCUSTOMERREF" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TECHNICIANNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="HASSUPPORTCONTRACT" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SERVICESINFAULT" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PRECKAID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DOMEN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DSLAMPORT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SERIALNUMBERSTB" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="HGWTIP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LINISKAOPREMA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ADRESAIZVOD" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SERIALNUMBERHGW" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PAKET" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="KABEL" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IZVOD" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PARICA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RAM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REBRO" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="POZICIJA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CENTRALAPORT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PRESPOJBROJ" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PRESPOJLINIJA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TIPDSLAM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="MOZEOPTIKA" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STRING1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STRING2" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STRING3" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INT1" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INT2" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INT3" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DATE1" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DATE2" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="EXTSYSID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TIPPRETPLATNIKA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="HNMOUTPUT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ALATOUTPUT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPEATED" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ATURBITS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ATUCBITS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SLATIPSERVIS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AFFECTEDSERVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ORIGINATEDCOMPANY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="MESTOPOVREDE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RESOLVEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FAULTLOCATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ALTCONTACTPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TKTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SMSPHONE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IMPACTEDREGION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SMSGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STRING4" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ATRIBUT1" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PREVIOUSSTATUS" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="BACKUP" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TRANSMISSIONPATH" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NEXTDEVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ORIGINATEDDEVICE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="IMSMIGRATION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CABLEGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="VOZDUSNAMREZA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CABLETYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OKNOBROJ" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TIPOVINACEVKE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SMS" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMBEROFAFFECTEDCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="NUMBEROFAFFECTEDKEYCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PROBABLECAUSE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WITHOUTINT" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="POWER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AGGREGATE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TRANSMISSION" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CONTROLLER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SMSTYPE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="SMSPREVIEW" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DEVICENAME" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RESOLVER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WOCATALOG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CENTRALA" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LOGCREATE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LOGDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LOGINCTYPE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="LOGLONG" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DIAGINVOKE" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DIAGRESULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DIAGTEMPRESULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CHECK1" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CHECK2" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CHECK3" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DATE3" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="DATE4" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INT4" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INT5" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INT6" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STRING5" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STRING6" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="STRING7" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REASONT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TYPEOFFAULT" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="TIPPREKIN" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ONCALLFIRSTROTASSNPERSON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ONCALLSTARTTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ONCALLAUTOASSIGN" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ONCALLREASSIGNTIME" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ONCALLOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REPLACEDOWNER" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMCOSOLAPPLIEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMCOSOLAPPLIEDBY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMCOSOLFEEDBACK" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMCOSOLSTATUS" type="{http://www.ibm.com/maximo}MXDomainQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCITEMSETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCTMPLID" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCINVALID" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCRECURRINGPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCONETIMEPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCTOTALRECURRINGPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCTOTALONETIMEPRICE" type="{http://www.ibm.com/maximo}MXDoubleQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PMSCCURRENCY" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RBA_RC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="CREATEPROBLEMDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="RESOLUTIONPROBLEM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WORKAROUND" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WAYOFREPAIR" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PRRELATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="REASON" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="KNOWNERROR" type="{http://www.ibm.com/maximo}MXBooleanQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="WORKAROUNDDESC" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INT8" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="INT9" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="FAULTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ROOTCAUSE" type="{http://www.ibm.com/maximo}MXLongQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPOOLNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPOOLITEMNUM" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPPOOLITEMSETID" type="{http://www.ibm.com/maximo}MXStringQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPTARGDELIVERYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PLUSPACTDELIVERYDATE" type="{http://www.ibm.com/maximo}MXDateTimeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "pluspresponseplan",
        "plusprevnum",
        "plusppricesched",
        "pluspcustponum",
        "pluspmaxprice",
        "pluspbillbatch",
        "pluspbblinenum",
        "pluspporeq",
        "pluspcalcorgid",
        "pluspcalccalnum",
        "pluspcalcshift",
        "pmcomtype",
        "pmcomresolution",
        "pmcomimpact",
        "pmcomurgency",
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
        "extsysid",
        "tippretplatnika",
        "hnmoutput",
        "alatoutput",
        "repeated",
        "aturbits",
        "atucbits",
        "slatipservis",
        "os",
        "regionname",
        "affectedservice",
        "originatedcompany",
        "mestopovrede",
        "resolvedby",
        "faultlocation",
        "altcontactphone",
        "te",
        "tktype",
        "smsphone",
        "impactedregion",
        "smsgroup",
        "string4",
        "atribut1",
        "previousstatus",
        "backup",
        "transmissionpath",
        "nextdevice",
        "originateddevice",
        "imsmigration",
        "cablegroup",
        "vozdusnamreza",
        "cabletype",
        "oknobroj",
        "tipovinacevke",
        "sms",
        "numberofaffectedcustomers",
        "numberofaffectedkeycustomers",
        "probablecause",
        "withoutint",
        "power",
        "aggregate",
        "transmission",
        "controller",
        "type",
        "smstype",
        "smspreview",
        "devicename",
        "resolver",
        "wocatalog",
        "centrala",
        "logcreate",
        "logdesc",
        "loginctype",
        "loglong",
        "diaginvoke",
        "diagresult",
        "diagtempresult",
        "check1",
        "check2",
        "check3",
        "date3",
        "date4",
        "int4",
        "int5",
        "int6",
        "string5",
        "string6",
        "string7",
        "reasont",
        "typeoffault",
        "tipprekin",
        "oncallfirstrotassnperson",
        "oncallstarttime",
        "oncallautoassign",
        "oncallreassigntime",
        "oncallownergroup",
        "replacedowner",
        "pmcosolapplieddate",
        "pmcosolappliedby",
        "pmcosolfeedback",
        "pmcosolstatus",
        "pmscitemsetid",
        "pmsctmplid",
        "pmscinvalid",
        "pmscrecurringprice",
        "pmsconetimeprice",
        "pmsctotalrecurringprice",
        "pmsctotalonetimeprice",
        "pmsccurrency",
        "rbarc",
        "createproblemdate",
        "resolutionproblem",
        "workaround",
        "wayofrepair",
        "prrelatedate",
        "reason",
        "knownerror",
        "workarounddesc",
        "int8",
        "int9",
        "faultcause",
        "rootcause",
        "plusppoolnum",
        "plusppoolitemnum",
        "plusppoolitemsetid",
        "plusptargdeliverydate",
        "pluspactdeliverydate"
    })
    public static class INCIDENT {

        @XmlElement(name = "TICKETID")
        protected List<MXStringQueryType> ticketid;
        @XmlElement(name = "CLASS")
        protected List<MXDomainQueryType> _class;
        @XmlElement(name = "DESCRIPTION")
        protected List<MXStringQueryType> description;
        @XmlElement(name = "STATUS")
        protected List<MXDomainQueryType> status;
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
        protected List<MXDomainQueryType> globalticketclass;
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
        protected List<MXDomainQueryType> createwomulti;
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
        protected List<MXDomainQueryType> pluspquotetype;
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
        protected List<MXDomainQueryType> pmcomresolution;
        @XmlElement(name = "PMCOMIMPACT", nillable = true)
        protected List<MXLongQueryType> pmcomimpact;
        @XmlElement(name = "PMCOMURGENCY", nillable = true)
        protected List<MXLongQueryType> pmcomurgency;
        @XmlElement(name = "INDICATEDPRIORITY", nillable = true)
        protected List<MXLongQueryType> indicatedpriority;
        @XmlElement(name = "EXTERNALSYSTEM_TICKETID")
        protected List<MXStringQueryType> externalsystemticketid;
        @XmlElement(name = "EXTERNALSYSTEM")
        protected List<MXDomainQueryType> externalsystem;
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
        @XmlElement(name = "TIPPRETPLATNIKA")
        protected List<MXStringQueryType> tippretplatnika;
        @XmlElement(name = "HNMOUTPUT")
        protected List<MXStringQueryType> hnmoutput;
        @XmlElement(name = "ALATOUTPUT")
        protected List<MXStringQueryType> alatoutput;
        @XmlElement(name = "REPEATED")
        protected List<MXBooleanQueryType> repeated;
        @XmlElement(name = "ATURBITS")
        protected List<MXStringQueryType> aturbits;
        @XmlElement(name = "ATUCBITS")
        protected List<MXStringQueryType> atucbits;
        @XmlElement(name = "SLATIPSERVIS")
        protected List<MXStringQueryType> slatipservis;
        @XmlElement(name = "OS")
        protected List<MXBooleanQueryType> os;
        @XmlElement(name = "REGIONNAME")
        protected List<MXStringQueryType> regionname;
        @XmlElement(name = "AFFECTEDSERVICE")
        protected List<MXStringQueryType> affectedservice;
        @XmlElement(name = "ORIGINATEDCOMPANY")
        protected List<MXStringQueryType> originatedcompany;
        @XmlElement(name = "MESTOPOVREDE")
        protected List<MXStringQueryType> mestopovrede;
        @XmlElement(name = "RESOLVEDBY")
        protected List<MXStringQueryType> resolvedby;
        @XmlElement(name = "FAULTLOCATION")
        protected List<MXStringQueryType> faultlocation;
        @XmlElement(name = "ALTCONTACTPHONE")
        protected List<MXStringQueryType> altcontactphone;
        @XmlElement(name = "TE")
        protected List<MXStringQueryType> te;
        @XmlElement(name = "TKTYPE")
        protected List<MXStringQueryType> tktype;
        @XmlElement(name = "SMSPHONE")
        protected List<MXStringQueryType> smsphone;
        @XmlElement(name = "IMPACTEDREGION")
        protected List<MXStringQueryType> impactedregion;
        @XmlElement(name = "SMSGROUP")
        protected List<MXStringQueryType> smsgroup;
        @XmlElement(name = "STRING4")
        protected List<MXStringQueryType> string4;
        @XmlElement(name = "ATRIBUT1")
        protected List<MXStringQueryType> atribut1;
        @XmlElement(name = "PREVIOUSSTATUS")
        protected List<MXStringQueryType> previousstatus;
        @XmlElement(name = "BACKUP")
        protected List<MXBooleanQueryType> backup;
        @XmlElement(name = "TRANSMISSIONPATH")
        protected List<MXStringQueryType> transmissionpath;
        @XmlElement(name = "NEXTDEVICE")
        protected List<MXStringQueryType> nextdevice;
        @XmlElement(name = "ORIGINATEDDEVICE")
        protected List<MXStringQueryType> originateddevice;
        @XmlElement(name = "IMSMIGRATION")
        protected List<MXStringQueryType> imsmigration;
        @XmlElement(name = "CABLEGROUP")
        protected List<MXStringQueryType> cablegroup;
        @XmlElement(name = "VOZDUSNAMREZA")
        protected List<MXStringQueryType> vozdusnamreza;
        @XmlElement(name = "CABLETYPE")
        protected List<MXStringQueryType> cabletype;
        @XmlElement(name = "OKNOBROJ")
        protected List<MXStringQueryType> oknobroj;
        @XmlElement(name = "TIPOVINACEVKE")
        protected List<MXStringQueryType> tipovinacevke;
        @XmlElement(name = "SMS")
        protected List<MXBooleanQueryType> sms;
        @XmlElement(name = "NUMBEROFAFFECTEDCUSTOMERS", nillable = true)
        protected List<MXLongQueryType> numberofaffectedcustomers;
        @XmlElement(name = "NUMBEROFAFFECTEDKEYCUSTOMERS", nillable = true)
        protected List<MXLongQueryType> numberofaffectedkeycustomers;
        @XmlElement(name = "PROBABLECAUSE")
        protected List<MXStringQueryType> probablecause;
        @XmlElement(name = "WITHOUTINT")
        protected List<MXBooleanQueryType> withoutint;
        @XmlElement(name = "POWER")
        protected List<MXStringQueryType> power;
        @XmlElement(name = "AGGREGATE")
        protected List<MXStringQueryType> aggregate;
        @XmlElement(name = "TRANSMISSION")
        protected List<MXStringQueryType> transmission;
        @XmlElement(name = "CONTROLLER")
        protected List<MXStringQueryType> controller;
        @XmlElement(name = "TYPE")
        protected List<MXStringQueryType> type;
        @XmlElement(name = "SMSTYPE", nillable = true)
        protected List<MXLongQueryType> smstype;
        @XmlElement(name = "SMSPREVIEW")
        protected List<MXStringQueryType> smspreview;
        @XmlElement(name = "DEVICENAME")
        protected List<MXStringQueryType> devicename;
        @XmlElement(name = "RESOLVER")
        protected List<MXStringQueryType> resolver;
        @XmlElement(name = "WOCATALOG")
        protected List<MXStringQueryType> wocatalog;
        @XmlElement(name = "CENTRALA")
        protected List<MXStringQueryType> centrala;
        @XmlElement(name = "LOGCREATE")
        protected List<MXStringQueryType> logcreate;
        @XmlElement(name = "LOGDESC")
        protected List<MXStringQueryType> logdesc;
        @XmlElement(name = "LOGINCTYPE")
        protected List<MXStringQueryType> loginctype;
        @XmlElement(name = "LOGLONG")
        protected List<MXStringQueryType> loglong;
        @XmlElement(name = "DIAGINVOKE")
        protected List<MXStringQueryType> diaginvoke;
        @XmlElement(name = "DIAGRESULT")
        protected List<MXStringQueryType> diagresult;
        @XmlElement(name = "DIAGTEMPRESULT")
        protected List<MXStringQueryType> diagtempresult;
        @XmlElement(name = "CHECK1")
        protected List<MXBooleanQueryType> check1;
        @XmlElement(name = "CHECK2")
        protected List<MXBooleanQueryType> check2;
        @XmlElement(name = "CHECK3")
        protected List<MXBooleanQueryType> check3;
        @XmlElement(name = "DATE3", nillable = true)
        protected List<MXDateTimeQueryType> date3;
        @XmlElement(name = "DATE4", nillable = true)
        protected List<MXDateTimeQueryType> date4;
        @XmlElement(name = "INT4", nillable = true)
        protected List<MXLongQueryType> int4;
        @XmlElement(name = "INT5", nillable = true)
        protected List<MXLongQueryType> int5;
        @XmlElement(name = "INT6", nillable = true)
        protected List<MXLongQueryType> int6;
        @XmlElement(name = "STRING5")
        protected List<MXStringQueryType> string5;
        @XmlElement(name = "STRING6")
        protected List<MXStringQueryType> string6;
        @XmlElement(name = "STRING7")
        protected List<MXStringQueryType> string7;
        @XmlElement(name = "REASONT")
        protected List<MXStringQueryType> reasont;
        @XmlElement(name = "TYPEOFFAULT")
        protected List<MXStringQueryType> typeoffault;
        @XmlElement(name = "TIPPREKIN")
        protected List<MXStringQueryType> tipprekin;
        @XmlElement(name = "ONCALLFIRSTROTASSNPERSON")
        protected List<MXStringQueryType> oncallfirstrotassnperson;
        @XmlElement(name = "ONCALLSTARTTIME", nillable = true)
        protected List<MXDateTimeQueryType> oncallstarttime;
        @XmlElement(name = "ONCALLAUTOASSIGN")
        protected List<MXBooleanQueryType> oncallautoassign;
        @XmlElement(name = "ONCALLREASSIGNTIME", nillable = true)
        protected List<MXDateTimeQueryType> oncallreassigntime;
        @XmlElement(name = "ONCALLOWNERGROUP")
        protected List<MXStringQueryType> oncallownergroup;
        @XmlElement(name = "REPLACEDOWNER")
        protected List<MXStringQueryType> replacedowner;
        @XmlElement(name = "PMCOSOLAPPLIEDDATE", nillable = true)
        protected List<MXDateTimeQueryType> pmcosolapplieddate;
        @XmlElement(name = "PMCOSOLAPPLIEDBY")
        protected List<MXStringQueryType> pmcosolappliedby;
        @XmlElement(name = "PMCOSOLFEEDBACK")
        protected List<MXStringQueryType> pmcosolfeedback;
        @XmlElement(name = "PMCOSOLSTATUS")
        protected List<MXDomainQueryType> pmcosolstatus;
        @XmlElement(name = "PMSCITEMSETID")
        protected List<MXStringQueryType> pmscitemsetid;
        @XmlElement(name = "PMSCTMPLID", nillable = true)
        protected List<MXLongQueryType> pmsctmplid;
        @XmlElement(name = "PMSCINVALID")
        protected List<MXBooleanQueryType> pmscinvalid;
        @XmlElement(name = "PMSCRECURRINGPRICE", nillable = true)
        protected List<MXDoubleQueryType> pmscrecurringprice;
        @XmlElement(name = "PMSCONETIMEPRICE", nillable = true)
        protected List<MXDoubleQueryType> pmsconetimeprice;
        @XmlElement(name = "PMSCTOTALRECURRINGPRICE", nillable = true)
        protected List<MXDoubleQueryType> pmsctotalrecurringprice;
        @XmlElement(name = "PMSCTOTALONETIMEPRICE", nillable = true)
        protected List<MXDoubleQueryType> pmsctotalonetimeprice;
        @XmlElement(name = "PMSCCURRENCY")
        protected List<MXStringQueryType> pmsccurrency;
        @XmlElement(name = "RBA_RC")
        protected List<MXStringQueryType> rbarc;
        @XmlElement(name = "CREATEPROBLEMDATE", nillable = true)
        protected List<MXDateTimeQueryType> createproblemdate;
        @XmlElement(name = "RESOLUTIONPROBLEM")
        protected List<MXStringQueryType> resolutionproblem;
        @XmlElement(name = "WORKAROUND")
        protected List<MXBooleanQueryType> workaround;
        @XmlElement(name = "WAYOFREPAIR", nillable = true)
        protected List<MXLongQueryType> wayofrepair;
        @XmlElement(name = "PRRELATEDATE", nillable = true)
        protected List<MXDateTimeQueryType> prrelatedate;
        @XmlElement(name = "REASON")
        protected List<MXStringQueryType> reason;
        @XmlElement(name = "KNOWNERROR")
        protected List<MXBooleanQueryType> knownerror;
        @XmlElement(name = "WORKAROUNDDESC")
        protected List<MXStringQueryType> workarounddesc;
        @XmlElement(name = "INT8", nillable = true)
        protected List<MXLongQueryType> int8;
        @XmlElement(name = "INT9", nillable = true)
        protected List<MXLongQueryType> int9;
        @XmlElement(name = "FAULTCAUSE", nillable = true)
        protected List<MXLongQueryType> faultcause;
        @XmlElement(name = "ROOTCAUSE", nillable = true)
        protected List<MXLongQueryType> rootcause;
        @XmlElement(name = "PLUSPPOOLNUM")
        protected List<MXStringQueryType> plusppoolnum;
        @XmlElement(name = "PLUSPPOOLITEMNUM")
        protected List<MXStringQueryType> plusppoolitemnum;
        @XmlElement(name = "PLUSPPOOLITEMSETID")
        protected List<MXStringQueryType> plusppoolitemsetid;
        @XmlElement(name = "PLUSPTARGDELIVERYDATE", nillable = true)
        protected List<MXDateTimeQueryType> plusptargdeliverydate;
        @XmlElement(name = "PLUSPACTDELIVERYDATE", nillable = true)
        protected List<MXDateTimeQueryType> pluspactdeliverydate;

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
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getGLOBALTICKETCLASS() {
            if (globalticketclass == null) {
                globalticketclass = new ArrayList<MXDomainQueryType>();
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
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getCREATEWOMULTI() {
            if (createwomulti == null) {
                createwomulti = new ArrayList<MXDomainQueryType>();
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
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getPLUSPQUOTETYPE() {
            if (pluspquotetype == null) {
                pluspquotetype = new ArrayList<MXDomainQueryType>();
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
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getPMCOMRESOLUTION() {
            if (pmcomresolution == null) {
                pmcomresolution = new ArrayList<MXDomainQueryType>();
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

        /**
         * Gets the value of the tippretplatnika property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tippretplatnika property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTIPPRETPLATNIKA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * Gets the value of the hnmoutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hnmoutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHNMOUTPUT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getHNMOUTPUT() {
            if (hnmoutput == null) {
                hnmoutput = new ArrayList<MXStringQueryType>();
            }
            return this.hnmoutput;
        }

        /**
         * Gets the value of the alatoutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alatoutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getALATOUTPUT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getALATOUTPUT() {
            if (alatoutput == null) {
                alatoutput = new ArrayList<MXStringQueryType>();
            }
            return this.alatoutput;
        }

        /**
         * Gets the value of the repeated property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the repeated property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPEATED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getREPEATED() {
            if (repeated == null) {
                repeated = new ArrayList<MXBooleanQueryType>();
            }
            return this.repeated;
        }

        /**
         * Gets the value of the aturbits property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aturbits property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getATURBITS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getATURBITS() {
            if (aturbits == null) {
                aturbits = new ArrayList<MXStringQueryType>();
            }
            return this.aturbits;
        }

        /**
         * Gets the value of the atucbits property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the atucbits property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getATUCBITS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getATUCBITS() {
            if (atucbits == null) {
                atucbits = new ArrayList<MXStringQueryType>();
            }
            return this.atucbits;
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
         * Gets the value of the os property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the os property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getOS() {
            if (os == null) {
                os = new ArrayList<MXBooleanQueryType>();
            }
            return this.os;
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
         * Gets the value of the affectedservice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedservice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAFFECTEDSERVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getAFFECTEDSERVICE() {
            if (affectedservice == null) {
                affectedservice = new ArrayList<MXStringQueryType>();
            }
            return this.affectedservice;
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
         * Gets the value of the altcontactphone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the altcontactphone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getALTCONTACTPHONE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getALTCONTACTPHONE() {
            if (altcontactphone == null) {
                altcontactphone = new ArrayList<MXStringQueryType>();
            }
            return this.altcontactphone;
        }

        /**
         * Gets the value of the te property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the te property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTE() {
            if (te == null) {
                te = new ArrayList<MXStringQueryType>();
            }
            return this.te;
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
         * Gets the value of the smsphone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the smsphone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSMSPHONE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSMSPHONE() {
            if (smsphone == null) {
                smsphone = new ArrayList<MXStringQueryType>();
            }
            return this.smsphone;
        }

        /**
         * Gets the value of the impactedregion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the impactedregion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIMPACTEDREGION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getIMPACTEDREGION() {
            if (impactedregion == null) {
                impactedregion = new ArrayList<MXStringQueryType>();
            }
            return this.impactedregion;
        }

        /**
         * Gets the value of the smsgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the smsgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSMSGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSMSGROUP() {
            if (smsgroup == null) {
                smsgroup = new ArrayList<MXStringQueryType>();
            }
            return this.smsgroup;
        }

        /**
         * Gets the value of the string4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the string4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTRING4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSTRING4() {
            if (string4 == null) {
                string4 = new ArrayList<MXStringQueryType>();
            }
            return this.string4;
        }

        /**
         * Gets the value of the atribut1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the atribut1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getATRIBUT1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getATRIBUT1() {
            if (atribut1 == null) {
                atribut1 = new ArrayList<MXStringQueryType>();
            }
            return this.atribut1;
        }

        /**
         * Gets the value of the previousstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPREVIOUSSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPREVIOUSSTATUS() {
            if (previousstatus == null) {
                previousstatus = new ArrayList<MXStringQueryType>();
            }
            return this.previousstatus;
        }

        /**
         * Gets the value of the backup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the backup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBACKUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getBACKUP() {
            if (backup == null) {
                backup = new ArrayList<MXBooleanQueryType>();
            }
            return this.backup;
        }

        /**
         * Gets the value of the transmissionpath property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transmissionpath property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRANSMISSIONPATH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTRANSMISSIONPATH() {
            if (transmissionpath == null) {
                transmissionpath = new ArrayList<MXStringQueryType>();
            }
            return this.transmissionpath;
        }

        /**
         * Gets the value of the nextdevice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nextdevice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNEXTDEVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getNEXTDEVICE() {
            if (nextdevice == null) {
                nextdevice = new ArrayList<MXStringQueryType>();
            }
            return this.nextdevice;
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
         * Gets the value of the vozdusnamreza property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vozdusnamreza property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVOZDUSNAMREZA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getVOZDUSNAMREZA() {
            if (vozdusnamreza == null) {
                vozdusnamreza = new ArrayList<MXStringQueryType>();
            }
            return this.vozdusnamreza;
        }

        /**
         * Gets the value of the cabletype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabletype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCABLETYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCABLETYPE() {
            if (cabletype == null) {
                cabletype = new ArrayList<MXStringQueryType>();
            }
            return this.cabletype;
        }

        /**
         * Gets the value of the oknobroj property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oknobroj property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOKNOBROJ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getOKNOBROJ() {
            if (oknobroj == null) {
                oknobroj = new ArrayList<MXStringQueryType>();
            }
            return this.oknobroj;
        }

        /**
         * Gets the value of the tipovinacevke property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tipovinacevke property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTIPOVINACEVKE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTIPOVINACEVKE() {
            if (tipovinacevke == null) {
                tipovinacevke = new ArrayList<MXStringQueryType>();
            }
            return this.tipovinacevke;
        }

        /**
         * Gets the value of the sms property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sms property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSMS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getSMS() {
            if (sms == null) {
                sms = new ArrayList<MXBooleanQueryType>();
            }
            return this.sms;
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
         * Gets the value of the numberofaffectedkeycustomers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numberofaffectedkeycustomers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNUMBEROFAFFECTEDKEYCUSTOMERS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getNUMBEROFAFFECTEDKEYCUSTOMERS() {
            if (numberofaffectedkeycustomers == null) {
                numberofaffectedkeycustomers = new ArrayList<MXLongQueryType>();
            }
            return this.numberofaffectedkeycustomers;
        }

        /**
         * Gets the value of the probablecause property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the probablecause property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPROBABLECAUSE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPROBABLECAUSE() {
            if (probablecause == null) {
                probablecause = new ArrayList<MXStringQueryType>();
            }
            return this.probablecause;
        }

        /**
         * Gets the value of the withoutint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the withoutint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWITHOUTINT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getWITHOUTINT() {
            if (withoutint == null) {
                withoutint = new ArrayList<MXBooleanQueryType>();
            }
            return this.withoutint;
        }

        /**
         * Gets the value of the power property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the power property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOWER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPOWER() {
            if (power == null) {
                power = new ArrayList<MXStringQueryType>();
            }
            return this.power;
        }

        /**
         * Gets the value of the aggregate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aggregate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAGGREGATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getAGGREGATE() {
            if (aggregate == null) {
                aggregate = new ArrayList<MXStringQueryType>();
            }
            return this.aggregate;
        }

        /**
         * Gets the value of the transmission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transmission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRANSMISSION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTRANSMISSION() {
            if (transmission == null) {
                transmission = new ArrayList<MXStringQueryType>();
            }
            return this.transmission;
        }

        /**
         * Gets the value of the controller property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the controller property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCONTROLLER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getCONTROLLER() {
            if (controller == null) {
                controller = new ArrayList<MXStringQueryType>();
            }
            return this.controller;
        }

        /**
         * Gets the value of the type property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the type property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTYPE() {
            if (type == null) {
                type = new ArrayList<MXStringQueryType>();
            }
            return this.type;
        }

        /**
         * Gets the value of the smstype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the smstype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSMSTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getSMSTYPE() {
            if (smstype == null) {
                smstype = new ArrayList<MXLongQueryType>();
            }
            return this.smstype;
        }

        /**
         * Gets the value of the smspreview property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the smspreview property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSMSPREVIEW().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSMSPREVIEW() {
            if (smspreview == null) {
                smspreview = new ArrayList<MXStringQueryType>();
            }
            return this.smspreview;
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
         * Gets the value of the logcreate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the logcreate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOGCREATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLOGCREATE() {
            if (logcreate == null) {
                logcreate = new ArrayList<MXStringQueryType>();
            }
            return this.logcreate;
        }

        /**
         * Gets the value of the logdesc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the logdesc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOGDESC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLOGDESC() {
            if (logdesc == null) {
                logdesc = new ArrayList<MXStringQueryType>();
            }
            return this.logdesc;
        }

        /**
         * Gets the value of the loginctype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loginctype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOGINCTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLOGINCTYPE() {
            if (loginctype == null) {
                loginctype = new ArrayList<MXStringQueryType>();
            }
            return this.loginctype;
        }

        /**
         * Gets the value of the loglong property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loglong property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOGLONG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getLOGLONG() {
            if (loglong == null) {
                loglong = new ArrayList<MXStringQueryType>();
            }
            return this.loglong;
        }

        /**
         * Gets the value of the diaginvoke property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diaginvoke property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGINVOKE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDIAGINVOKE() {
            if (diaginvoke == null) {
                diaginvoke = new ArrayList<MXStringQueryType>();
            }
            return this.diaginvoke;
        }

        /**
         * Gets the value of the diagresult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagresult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGRESULT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDIAGRESULT() {
            if (diagresult == null) {
                diagresult = new ArrayList<MXStringQueryType>();
            }
            return this.diagresult;
        }

        /**
         * Gets the value of the diagtempresult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diagtempresult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIAGTEMPRESULT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getDIAGTEMPRESULT() {
            if (diagtempresult == null) {
                diagtempresult = new ArrayList<MXStringQueryType>();
            }
            return this.diagtempresult;
        }

        /**
         * Gets the value of the check1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the check1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHECK1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getCHECK1() {
            if (check1 == null) {
                check1 = new ArrayList<MXBooleanQueryType>();
            }
            return this.check1;
        }

        /**
         * Gets the value of the check2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the check2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHECK2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getCHECK2() {
            if (check2 == null) {
                check2 = new ArrayList<MXBooleanQueryType>();
            }
            return this.check2;
        }

        /**
         * Gets the value of the check3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the check3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCHECK3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getCHECK3() {
            if (check3 == null) {
                check3 = new ArrayList<MXBooleanQueryType>();
            }
            return this.check3;
        }

        /**
         * Gets the value of the date3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the date3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATE3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getDATE3() {
            if (date3 == null) {
                date3 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.date3;
        }

        /**
         * Gets the value of the date4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the date4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATE4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getDATE4() {
            if (date4 == null) {
                date4 = new ArrayList<MXDateTimeQueryType>();
            }
            return this.date4;
        }

        /**
         * Gets the value of the int4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINT4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINT4() {
            if (int4 == null) {
                int4 = new ArrayList<MXLongQueryType>();
            }
            return this.int4;
        }

        /**
         * Gets the value of the int5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINT5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINT5() {
            if (int5 == null) {
                int5 = new ArrayList<MXLongQueryType>();
            }
            return this.int5;
        }

        /**
         * Gets the value of the int6 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int6 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINT6().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINT6() {
            if (int6 == null) {
                int6 = new ArrayList<MXLongQueryType>();
            }
            return this.int6;
        }

        /**
         * Gets the value of the string5 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the string5 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTRING5().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSTRING5() {
            if (string5 == null) {
                string5 = new ArrayList<MXStringQueryType>();
            }
            return this.string5;
        }

        /**
         * Gets the value of the string6 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the string6 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTRING6().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSTRING6() {
            if (string6 == null) {
                string6 = new ArrayList<MXStringQueryType>();
            }
            return this.string6;
        }

        /**
         * Gets the value of the string7 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the string7 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTRING7().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getSTRING7() {
            if (string7 == null) {
                string7 = new ArrayList<MXStringQueryType>();
            }
            return this.string7;
        }

        /**
         * Gets the value of the reasont property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reasont property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREASONT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREASONT() {
            if (reasont == null) {
                reasont = new ArrayList<MXStringQueryType>();
            }
            return this.reasont;
        }

        /**
         * Gets the value of the typeoffault property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the typeoffault property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTYPEOFFAULT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getTYPEOFFAULT() {
            if (typeoffault == null) {
                typeoffault = new ArrayList<MXStringQueryType>();
            }
            return this.typeoffault;
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
         * Gets the value of the oncallfirstrotassnperson property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oncallfirstrotassnperson property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getONCALLFIRSTROTASSNPERSON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getONCALLFIRSTROTASSNPERSON() {
            if (oncallfirstrotassnperson == null) {
                oncallfirstrotassnperson = new ArrayList<MXStringQueryType>();
            }
            return this.oncallfirstrotassnperson;
        }

        /**
         * Gets the value of the oncallstarttime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oncallstarttime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getONCALLSTARTTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getONCALLSTARTTIME() {
            if (oncallstarttime == null) {
                oncallstarttime = new ArrayList<MXDateTimeQueryType>();
            }
            return this.oncallstarttime;
        }

        /**
         * Gets the value of the oncallautoassign property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oncallautoassign property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getONCALLAUTOASSIGN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getONCALLAUTOASSIGN() {
            if (oncallautoassign == null) {
                oncallautoassign = new ArrayList<MXBooleanQueryType>();
            }
            return this.oncallautoassign;
        }

        /**
         * Gets the value of the oncallreassigntime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oncallreassigntime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getONCALLREASSIGNTIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getONCALLREASSIGNTIME() {
            if (oncallreassigntime == null) {
                oncallreassigntime = new ArrayList<MXDateTimeQueryType>();
            }
            return this.oncallreassigntime;
        }

        /**
         * Gets the value of the oncallownergroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oncallownergroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getONCALLOWNERGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getONCALLOWNERGROUP() {
            if (oncallownergroup == null) {
                oncallownergroup = new ArrayList<MXStringQueryType>();
            }
            return this.oncallownergroup;
        }

        /**
         * Gets the value of the replacedowner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the replacedowner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREPLACEDOWNER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getREPLACEDOWNER() {
            if (replacedowner == null) {
                replacedowner = new ArrayList<MXStringQueryType>();
            }
            return this.replacedowner;
        }

        /**
         * Gets the value of the pmcosolapplieddate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcosolapplieddate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOSOLAPPLIEDDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPMCOSOLAPPLIEDDATE() {
            if (pmcosolapplieddate == null) {
                pmcosolapplieddate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pmcosolapplieddate;
        }

        /**
         * Gets the value of the pmcosolappliedby property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcosolappliedby property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOSOLAPPLIEDBY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCOSOLAPPLIEDBY() {
            if (pmcosolappliedby == null) {
                pmcosolappliedby = new ArrayList<MXStringQueryType>();
            }
            return this.pmcosolappliedby;
        }

        /**
         * Gets the value of the pmcosolfeedback property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcosolfeedback property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOSOLFEEDBACK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMCOSOLFEEDBACK() {
            if (pmcosolfeedback == null) {
                pmcosolfeedback = new ArrayList<MXStringQueryType>();
            }
            return this.pmcosolfeedback;
        }

        /**
         * Gets the value of the pmcosolstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmcosolstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMCOSOLSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDomainQueryType }
         * 
         * 
         */
        public List<MXDomainQueryType> getPMCOSOLSTATUS() {
            if (pmcosolstatus == null) {
                pmcosolstatus = new ArrayList<MXDomainQueryType>();
            }
            return this.pmcosolstatus;
        }

        /**
         * Gets the value of the pmscitemsetid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmscitemsetid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCITEMSETID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMSCITEMSETID() {
            if (pmscitemsetid == null) {
                pmscitemsetid = new ArrayList<MXStringQueryType>();
            }
            return this.pmscitemsetid;
        }

        /**
         * Gets the value of the pmsctmplid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmsctmplid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCTMPLID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getPMSCTMPLID() {
            if (pmsctmplid == null) {
                pmsctmplid = new ArrayList<MXLongQueryType>();
            }
            return this.pmsctmplid;
        }

        /**
         * Gets the value of the pmscinvalid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmscinvalid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCINVALID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getPMSCINVALID() {
            if (pmscinvalid == null) {
                pmscinvalid = new ArrayList<MXBooleanQueryType>();
            }
            return this.pmscinvalid;
        }

        /**
         * Gets the value of the pmscrecurringprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmscrecurringprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCRECURRINGPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMSCRECURRINGPRICE() {
            if (pmscrecurringprice == null) {
                pmscrecurringprice = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmscrecurringprice;
        }

        /**
         * Gets the value of the pmsconetimeprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmsconetimeprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCONETIMEPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMSCONETIMEPRICE() {
            if (pmsconetimeprice == null) {
                pmsconetimeprice = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmsconetimeprice;
        }

        /**
         * Gets the value of the pmsctotalrecurringprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmsctotalrecurringprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCTOTALRECURRINGPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMSCTOTALRECURRINGPRICE() {
            if (pmsctotalrecurringprice == null) {
                pmsctotalrecurringprice = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmsctotalrecurringprice;
        }

        /**
         * Gets the value of the pmsctotalonetimeprice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmsctotalonetimeprice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCTOTALONETIMEPRICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDoubleQueryType }
         * 
         * 
         */
        public List<MXDoubleQueryType> getPMSCTOTALONETIMEPRICE() {
            if (pmsctotalonetimeprice == null) {
                pmsctotalonetimeprice = new ArrayList<MXDoubleQueryType>();
            }
            return this.pmsctotalonetimeprice;
        }

        /**
         * Gets the value of the pmsccurrency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pmsccurrency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPMSCCURRENCY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPMSCCURRENCY() {
            if (pmsccurrency == null) {
                pmsccurrency = new ArrayList<MXStringQueryType>();
            }
            return this.pmsccurrency;
        }

        /**
         * Gets the value of the rbarc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rbarc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRBARC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getRBARC() {
            if (rbarc == null) {
                rbarc = new ArrayList<MXStringQueryType>();
            }
            return this.rbarc;
        }

        /**
         * Gets the value of the createproblemdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the createproblemdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCREATEPROBLEMDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getCREATEPROBLEMDATE() {
            if (createproblemdate == null) {
                createproblemdate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.createproblemdate;
        }

        /**
         * Gets the value of the resolutionproblem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resolutionproblem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRESOLUTIONPROBLEM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getRESOLUTIONPROBLEM() {
            if (resolutionproblem == null) {
                resolutionproblem = new ArrayList<MXStringQueryType>();
            }
            return this.resolutionproblem;
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
         * Gets the value of the prrelatedate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prrelatedate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRRELATEDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPRRELATEDATE() {
            if (prrelatedate == null) {
                prrelatedate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.prrelatedate;
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
         * Gets the value of the knownerror property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the knownerror property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKNOWNERROR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXBooleanQueryType }
         * 
         * 
         */
        public List<MXBooleanQueryType> getKNOWNERROR() {
            if (knownerror == null) {
                knownerror = new ArrayList<MXBooleanQueryType>();
            }
            return this.knownerror;
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
         * Gets the value of the int8 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int8 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINT8().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINT8() {
            if (int8 == null) {
                int8 = new ArrayList<MXLongQueryType>();
            }
            return this.int8;
        }

        /**
         * Gets the value of the int9 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int9 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINT9().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXLongQueryType }
         * 
         * 
         */
        public List<MXLongQueryType> getINT9() {
            if (int9 == null) {
                int9 = new ArrayList<MXLongQueryType>();
            }
            return this.int9;
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
         * Gets the value of the plusppoolnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusppoolnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPPOOLNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPPOOLNUM() {
            if (plusppoolnum == null) {
                plusppoolnum = new ArrayList<MXStringQueryType>();
            }
            return this.plusppoolnum;
        }

        /**
         * Gets the value of the plusppoolitemnum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusppoolitemnum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPPOOLITEMNUM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPPOOLITEMNUM() {
            if (plusppoolitemnum == null) {
                plusppoolitemnum = new ArrayList<MXStringQueryType>();
            }
            return this.plusppoolitemnum;
        }

        /**
         * Gets the value of the plusppoolitemsetid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusppoolitemsetid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPPOOLITEMSETID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXStringQueryType }
         * 
         * 
         */
        public List<MXStringQueryType> getPLUSPPOOLITEMSETID() {
            if (plusppoolitemsetid == null) {
                plusppoolitemsetid = new ArrayList<MXStringQueryType>();
            }
            return this.plusppoolitemsetid;
        }

        /**
         * Gets the value of the plusptargdeliverydate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plusptargdeliverydate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPTARGDELIVERYDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPLUSPTARGDELIVERYDATE() {
            if (plusptargdeliverydate == null) {
                plusptargdeliverydate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.plusptargdeliverydate;
        }

        /**
         * Gets the value of the pluspactdeliverydate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluspactdeliverydate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLUSPACTDELIVERYDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MXDateTimeQueryType }
         * 
         * 
         */
        public List<MXDateTimeQueryType> getPLUSPACTDELIVERYDATE() {
            if (pluspactdeliverydate == null) {
                pluspactdeliverydate = new ArrayList<MXDateTimeQueryType>();
            }
            return this.pluspactdeliverydate;
        }

    }

}


package ibm_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for INCIDENTObjectType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="INCIDENTObjectType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DESCRIPTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STATUSDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INTERNALPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IMPACT" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="URGENCY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTEDPERSON" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOURCE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SUPERVISOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OWNER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OWNERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ISGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RELATEDTOGLOBAL" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GLOBALTICKETID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GLOBALTICKETCLASS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EXTERNALRECID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SITEVISIT" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGRECORDID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGRECORDCLASS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GLACCOUNT" type="{http://www.ibm.com/maximo}MXGLAccountType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="COMMODITYGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="COMMODITY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INHERITSTATUS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ISKNOWNERROR" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGETSTART" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGETFINISH" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTUALSTART" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTUALFINISH" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGRECSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGRECORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHANGEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHANGEBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HISTORYFLAG" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TEMPLATE" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HASACTIVITY" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAILURECODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PROBLEMCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTLABHRS" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTLABCOST" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTEDPHONE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTEDPHONE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTEDEMAIL" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTEDEMAIL" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ASSETSITEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TEMPLATEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VENDOR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ASSETNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASSSTRUCTUREID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ISKNOWNERRORDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGETCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTUALCONTACTDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FR1CODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FR2CODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOLUTION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ASSETORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LANGCODE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HASLD" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CINUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CREATEWOMULTI" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGETDESC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SELFSERVSOLACCESS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HASSOLUTION" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CALCORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CALCCALENDAR" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CALCSHIFT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPQUOTETYPE" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPQUOTEDPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPAGREEMENT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCUSTOMER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCOSTCENTER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCUSTCHACCT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPRESPONSEPLAN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPREVNUM" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPPRICESCHED" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCUSTPONUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPMAXPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPBILLBATCH" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPBBLINENUM" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPPOREQ" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCALCORGID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCALCCALNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCALCSHIFT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMRESOLUTION" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMIMPACT" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMURGENCY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INDICATEDPRIORITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EXTERNALSYSTEM_TICKETID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EXTERNALSYSTEM" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DESCSRVID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CREATEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CREATIONDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VIRTUALENV" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OUTAGEDURATION" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASSIFICATIONID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCCRID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCITEMNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCOFFSUMMARY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCQUANTITY" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ASSIGNEDOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACCUMULATEDHOLDTIME" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ADJUSTEDTARGETCONTACTTIME" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ADJUSTEDTARGETRESPONSETIME" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ADJUSTEDTARGETRESOLUTIONTIME" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CORRELATIONATTRS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAULTTYPE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CUSTOMERNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CUSTOMERID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KATEGORIJA" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REGION" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ADRESAKORISNIKA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OPERATORNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CUSTOMERVALUE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OLA" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NOTEOPEN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CONTACTPHONE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CONTACTPERSON" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CONTACTEMAIL" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LINEID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ROOTCUSTOMERREF" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TECHNICIANNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HASSUPPORTCONTRACT" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SERVICESINFAULT" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PRECKAID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DOMEN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DSLAMPORT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SERIALNUMBERSTB" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HGWTIP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LINISKAOPREMA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ADRESAIZVOD" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SERIALNUMBERHGW" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PAKET" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KABEL" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IZVOD" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PARICA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RAM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REBRO" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="POZICIJA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CENTRALAPORT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PRESPOJBROJ" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PRESPOJLINIJA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TIPDSLAM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MOZEOPTIKA" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STRING1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STRING2" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STRING3" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INT1" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INT2" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INT3" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DATE1" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DATE2" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EXTSYSID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TIPPRETPLATNIKA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HNMOUTPUT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ALATOUTPUT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPEATED" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ATURBITS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ATUCBITS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SLATIPSERVIS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REGIONNAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AFFECTEDSERVICE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGINATEDCOMPANY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MESTOPOVREDE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RESOLVEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAULTLOCATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ALTCONTACTPHONE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TKTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SMSPHONE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IMPACTEDREGION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SMSGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STRING4" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ATRIBUT1" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PREVIOUSSTATUS" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BACKUP" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TRANSMISSIONPATH" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NEXTDEVICE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGINATEDDEVICE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IMSMIGRATION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CABLEGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VOZDUSNAMREZA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CABLETYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OKNOBROJ" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TIPOVINACEVKE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SMS" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMBEROFAFFECTEDCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NUMBEROFAFFECTEDKEYCUSTOMERS" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PROBABLECAUSE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WITHOUTINT" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="POWER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AGGREGATE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TRANSMISSION" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CONTROLLER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SMSTYPE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SMSPREVIEW" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DEVICENAME" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RESOLVER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOCATALOG" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CENTRALA" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LOGCREATE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LOGDESC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LOGINCTYPE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LOGLONG" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DIAGINVOKE" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DIAGRESULT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DIAGTEMPRESULT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHECK1" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHECK2" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHECK3" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DATE3" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DATE4" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INT4" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INT5" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INT6" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STRING5" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STRING6" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STRING7" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REASONT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TYPEOFFAULT" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TIPPREKIN" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ONCALLFIRSTROTASSNPERSON" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ONCALLSTARTTIME" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ONCALLAUTOASSIGN" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ONCALLREASSIGNTIME" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ONCALLOWNERGROUP" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPLACEDOWNER" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOSOLAPPLIEDDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOSOLAPPLIEDBY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOSOLFEEDBACK" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOSOLSTATUS" type="{http://www.ibm.com/maximo}MXDomainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCITEMSETID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCTMPLID" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCINVALID" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCRECURRINGPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCONETIMEPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCTOTALRECURRINGPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCTOTALONETIMEPRICE" type="{http://www.ibm.com/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMSCCURRENCY" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RBA_RC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CREATEPROBLEMDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RESOLUTIONPROBLEM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKAROUND" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WAYOFREPAIR" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PRRELATEDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REASON" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KNOWNERROR" type="{http://www.ibm.com/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKAROUNDDESC" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INT8" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INT9" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAULTCAUSE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ROOTCAUSE" type="{http://www.ibm.com/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPPOOLNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPPOOLITEMNUM" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPPOOLITEMSETID" type="{http://www.ibm.com/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPTARGDELIVERYDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPACTDELIVERYDATE" type="{http://www.ibm.com/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="action" type="{http://www.ibm.com/maximo}ProcessingActionType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCIDENTObjectType", propOrder = {
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
public class INCIDENTObjectType {

    @XmlElement(name = "TICKETID")
    protected MXStringType ticketid;
    @XmlElement(name = "CLASS")
    protected MXDomainType _class;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "STATUS")
    protected MXDomainType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElementRef(name = "REPORTEDPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> reportedpriority;
    @XmlElementRef(name = "INTERNALPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> internalpriority;
    @XmlElementRef(name = "IMPACT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> impact;
    @XmlElementRef(name = "URGENCY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> urgency;
    @XmlElement(name = "REPORTEDBY")
    protected MXStringType reportedby;
    @XmlElementRef(name = "REPORTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> reportdate;
    @XmlElement(name = "AFFECTEDPERSON")
    protected MXStringType affectedperson;
    @XmlElementRef(name = "AFFECTEDDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> affecteddate;
    @XmlElement(name = "SOURCE")
    protected MXStringType source;
    @XmlElement(name = "SUPERVISOR")
    protected MXStringType supervisor;
    @XmlElement(name = "OWNER")
    protected MXStringType owner;
    @XmlElement(name = "OWNERGROUP")
    protected MXStringType ownergroup;
    @XmlElement(name = "ISGLOBAL")
    protected MXBooleanType isglobal;
    @XmlElement(name = "RELATEDTOGLOBAL")
    protected MXBooleanType relatedtoglobal;
    @XmlElement(name = "GLOBALTICKETID")
    protected MXStringType globalticketid;
    @XmlElement(name = "GLOBALTICKETCLASS")
    protected MXDomainType globalticketclass;
    @XmlElement(name = "EXTERNALRECID")
    protected MXStringType externalrecid;
    @XmlElement(name = "SITEVISIT")
    protected MXBooleanType sitevisit;
    @XmlElement(name = "ORIGRECORDID")
    protected MXStringType origrecordid;
    @XmlElement(name = "ORIGRECORDCLASS")
    protected MXStringType origrecordclass;
    @XmlElement(name = "GLACCOUNT")
    protected MXGLAccountType glaccount;
    @XmlElement(name = "COMMODITYGROUP")
    protected MXStringType commoditygroup;
    @XmlElement(name = "COMMODITY")
    protected MXStringType commodity;
    @XmlElement(name = "INHERITSTATUS")
    protected MXBooleanType inheritstatus;
    @XmlElement(name = "ISKNOWNERROR")
    protected MXBooleanType isknownerror;
    @XmlElementRef(name = "TARGETSTART", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targetstart;
    @XmlElementRef(name = "TARGETFINISH", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targetfinish;
    @XmlElementRef(name = "ACTUALSTART", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actualstart;
    @XmlElementRef(name = "ACTUALFINISH", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actualfinish;
    @XmlElement(name = "ORIGRECSITEID")
    protected MXStringType origrecsiteid;
    @XmlElement(name = "ORIGRECORGID")
    protected MXStringType origrecorgid;
    @XmlElement(name = "SITEID")
    protected MXStringType siteid;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElement(name = "HISTORYFLAG")
    protected MXBooleanType historyflag;
    @XmlElement(name = "TEMPLATE")
    protected MXBooleanType template;
    @XmlElement(name = "HASACTIVITY")
    protected MXBooleanType hasactivity;
    @XmlElement(name = "FAILURECODE")
    protected MXStringType failurecode;
    @XmlElement(name = "PROBLEMCODE")
    protected MXStringType problemcode;
    @XmlElementRef(name = "ACTLABHRS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actlabhrs;
    @XmlElementRef(name = "ACTLABCOST", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actlabcost;
    @XmlElement(name = "AFFECTEDPHONE")
    protected MXStringType affectedphone;
    @XmlElement(name = "REPORTEDPHONE")
    protected MXStringType reportedphone;
    @XmlElement(name = "AFFECTEDEMAIL")
    protected MXStringType affectedemail;
    @XmlElement(name = "REPORTEDEMAIL")
    protected MXStringType reportedemail;
    @XmlElement(name = "ASSETSITEID")
    protected MXStringType assetsiteid;
    @XmlElement(name = "TEMPLATEID")
    protected MXStringType templateid;
    @XmlElement(name = "VENDOR")
    protected MXStringType vendor;
    @XmlElement(name = "ASSETNUM")
    protected MXStringType assetnum;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElementRef(name = "ISKNOWNERRORDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> isknownerrordate;
    @XmlElementRef(name = "TARGETCONTACTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targetcontactdate;
    @XmlElementRef(name = "ACTUALCONTACTDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actualcontactdate;
    @XmlElement(name = "FR1CODE")
    protected MXStringType fr1CODE;
    @XmlElement(name = "FR2CODE")
    protected MXStringType fr2CODE;
    @XmlElementRef(name = "TICKETUID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> ticketuid;
    @XmlElement(name = "SOLUTION")
    protected MXStringType solution;
    @XmlElement(name = "ASSETORGID")
    protected MXStringType assetorgid;
    @XmlElement(name = "LANGCODE")
    protected MXStringType langcode;
    @XmlElement(name = "HASLD")
    protected MXBooleanType hasld;
    @XmlElement(name = "CINUM")
    protected MXStringType cinum;
    @XmlElement(name = "CREATEWOMULTI")
    protected MXDomainType createwomulti;
    @XmlElement(name = "TARGETDESC")
    protected MXStringType targetdesc;
    @XmlElement(name = "SELFSERVSOLACCESS")
    protected MXBooleanType selfservsolaccess;
    @XmlElement(name = "HASSOLUTION")
    protected MXBooleanType hassolution;
    @XmlElement(name = "CALCORGID")
    protected MXStringType calcorgid;
    @XmlElement(name = "CALCCALENDAR")
    protected MXStringType calccalendar;
    @XmlElement(name = "CALCSHIFT")
    protected MXStringType calcshift;
    @XmlElement(name = "PLUSPQUOTETYPE")
    protected MXDomainType pluspquotetype;
    @XmlElementRef(name = "PLUSPQUOTEDPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pluspquotedprice;
    @XmlElement(name = "PLUSPAGREEMENT")
    protected MXStringType pluspagreement;
    @XmlElement(name = "PLUSPCUSTOMER")
    protected MXStringType pluspcustomer;
    @XmlElement(name = "PLUSPCOSTCENTER")
    protected MXStringType pluspcostcenter;
    @XmlElement(name = "PLUSPCUSTCHACCT")
    protected MXStringType pluspcustchacct;
    @XmlElement(name = "PLUSPRESPONSEPLAN")
    protected MXStringType pluspresponseplan;
    @XmlElementRef(name = "PLUSPREVNUM", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> plusprevnum;
    @XmlElement(name = "PLUSPPRICESCHED")
    protected MXStringType plusppricesched;
    @XmlElement(name = "PLUSPCUSTPONUM")
    protected MXStringType pluspcustponum;
    @XmlElementRef(name = "PLUSPMAXPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pluspmaxprice;
    @XmlElement(name = "PLUSPBILLBATCH")
    protected MXStringType pluspbillbatch;
    @XmlElementRef(name = "PLUSPBBLINENUM", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pluspbblinenum;
    @XmlElement(name = "PLUSPPOREQ")
    protected MXBooleanType pluspporeq;
    @XmlElement(name = "PLUSPCALCORGID")
    protected MXStringType pluspcalcorgid;
    @XmlElement(name = "PLUSPCALCCALNUM")
    protected MXStringType pluspcalccalnum;
    @XmlElement(name = "PLUSPCALCSHIFT")
    protected MXStringType pluspcalcshift;
    @XmlElement(name = "PMCOMTYPE")
    protected MXStringType pmcomtype;
    @XmlElement(name = "PMCOMRESOLUTION")
    protected MXDomainType pmcomresolution;
    @XmlElementRef(name = "PMCOMIMPACT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmcomimpact;
    @XmlElementRef(name = "PMCOMURGENCY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmcomurgency;
    @XmlElementRef(name = "INDICATEDPRIORITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> indicatedpriority;
    @XmlElement(name = "EXTERNALSYSTEM_TICKETID")
    protected MXStringType externalsystemticketid;
    @XmlElement(name = "EXTERNALSYSTEM")
    protected MXDomainType externalsystem;
    @XmlElement(name = "DESCSRVID")
    protected MXStringType descsrvid;
    @XmlElement(name = "CREATEDBY")
    protected MXStringType createdby;
    @XmlElementRef(name = "CREATIONDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> creationdate;
    @XmlElement(name = "VIRTUALENV")
    protected MXBooleanType virtualenv;
    @XmlElementRef(name = "OUTAGEDURATION", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> outageduration;
    @XmlElement(name = "CLASSIFICATIONID")
    protected MXStringType classificationid;
    @XmlElement(name = "PMSCCRID")
    protected MXStringType pmsccrid;
    @XmlElement(name = "PMSCITEMNUM")
    protected MXStringType pmscitemnum;
    @XmlElement(name = "PMSCOFFSUMMARY")
    protected MXStringType pmscoffsummary;
    @XmlElementRef(name = "PMSCQUANTITY", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmscquantity;
    @XmlElement(name = "ASSIGNEDOWNERGROUP")
    protected MXStringType assignedownergroup;
    @XmlElementRef(name = "ACCUMULATEDHOLDTIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> accumulatedholdtime;
    @XmlElementRef(name = "ADJUSTEDTARGETCONTACTTIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> adjustedtargetcontacttime;
    @XmlElementRef(name = "ADJUSTEDTARGETRESPONSETIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> adjustedtargetresponsetime;
    @XmlElementRef(name = "ADJUSTEDTARGETRESOLUTIONTIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> adjustedtargetresolutiontime;
    @XmlElement(name = "CORRELATIONATTRS")
    protected MXStringType correlationattrs;
    @XmlElementRef(name = "FAULTTYPE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> faulttype;
    @XmlElement(name = "CUSTOMERNAME")
    protected MXStringType customername;
    @XmlElement(name = "CUSTOMERID")
    protected MXStringType customerid;
    @XmlElementRef(name = "KATEGORIJA", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> kategorija;
    @XmlElementRef(name = "REGION", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> region;
    @XmlElement(name = "ADRESAKORISNIKA")
    protected MXStringType adresakorisnika;
    @XmlElement(name = "OPERATORNAME")
    protected MXStringType operatorname;
    @XmlElementRef(name = "CUSTOMERVALUE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> customervalue;
    @XmlElement(name = "OLA")
    protected MXBooleanType ola;
    @XmlElement(name = "NOTEOPEN")
    protected MXStringType noteopen;
    @XmlElement(name = "CONTACTPHONE")
    protected MXStringType contactphone;
    @XmlElement(name = "CONTACTPERSON")
    protected MXStringType contactperson;
    @XmlElement(name = "CONTACTEMAIL")
    protected MXStringType contactemail;
    @XmlElement(name = "LINEID")
    protected MXStringType lineid;
    @XmlElement(name = "ROOTCUSTOMERREF")
    protected MXStringType rootcustomerref;
    @XmlElement(name = "TECHNICIANNAME")
    protected MXStringType technicianname;
    @XmlElement(name = "HASSUPPORTCONTRACT")
    protected MXBooleanType hassupportcontract;
    @XmlElementRef(name = "SERVICESINFAULT", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> servicesinfault;
    @XmlElement(name = "PRECKAID")
    protected MXStringType preckaid;
    @XmlElement(name = "DOMEN")
    protected MXStringType domen;
    @XmlElement(name = "DSLAMPORT")
    protected MXStringType dslamport;
    @XmlElement(name = "SERIALNUMBERSTB")
    protected MXStringType serialnumberstb;
    @XmlElement(name = "HGWTIP")
    protected MXStringType hgwtip;
    @XmlElement(name = "LINISKAOPREMA")
    protected MXStringType liniskaoprema;
    @XmlElement(name = "ADRESAIZVOD")
    protected MXStringType adresaizvod;
    @XmlElement(name = "SERIALNUMBERHGW")
    protected MXStringType serialnumberhgw;
    @XmlElement(name = "PAKET")
    protected MXStringType paket;
    @XmlElement(name = "KABEL")
    protected MXStringType kabel;
    @XmlElement(name = "IZVOD")
    protected MXStringType izvod;
    @XmlElement(name = "PARICA")
    protected MXStringType parica;
    @XmlElement(name = "RAM")
    protected MXStringType ram;
    @XmlElement(name = "REBRO")
    protected MXStringType rebro;
    @XmlElement(name = "POZICIJA")
    protected MXStringType pozicija;
    @XmlElement(name = "CENTRALAPORT")
    protected MXStringType centralaport;
    @XmlElement(name = "PRESPOJBROJ")
    protected MXStringType prespojbroj;
    @XmlElement(name = "PRESPOJLINIJA")
    protected MXStringType prespojlinija;
    @XmlElement(name = "TIPDSLAM")
    protected MXStringType tipdslam;
    @XmlElement(name = "MOZEOPTIKA")
    protected MXBooleanType mozeoptika;
    @XmlElement(name = "STRING1")
    protected MXStringType string1;
    @XmlElement(name = "STRING2")
    protected MXStringType string2;
    @XmlElement(name = "STRING3")
    protected MXStringType string3;
    @XmlElementRef(name = "INT1", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int1;
    @XmlElementRef(name = "INT2", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int2;
    @XmlElementRef(name = "INT3", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int3;
    @XmlElementRef(name = "DATE1", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> date1;
    @XmlElementRef(name = "DATE2", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> date2;
    @XmlElement(name = "EXTSYSID")
    protected MXStringType extsysid;
    @XmlElement(name = "TIPPRETPLATNIKA")
    protected MXStringType tippretplatnika;
    @XmlElement(name = "HNMOUTPUT")
    protected MXStringType hnmoutput;
    @XmlElement(name = "ALATOUTPUT")
    protected MXStringType alatoutput;
    @XmlElement(name = "REPEATED")
    protected MXBooleanType repeated;
    @XmlElement(name = "ATURBITS")
    protected MXStringType aturbits;
    @XmlElement(name = "ATUCBITS")
    protected MXStringType atucbits;
    @XmlElement(name = "SLATIPSERVIS")
    protected MXStringType slatipservis;
    @XmlElement(name = "OS")
    protected MXBooleanType os;
    @XmlElement(name = "REGIONNAME")
    protected MXStringType regionname;
    @XmlElement(name = "AFFECTEDSERVICE")
    protected MXStringType affectedservice;
    @XmlElement(name = "ORIGINATEDCOMPANY")
    protected MXStringType originatedcompany;
    @XmlElement(name = "MESTOPOVREDE")
    protected MXStringType mestopovrede;
    @XmlElement(name = "RESOLVEDBY")
    protected MXStringType resolvedby;
    @XmlElement(name = "FAULTLOCATION")
    protected MXStringType faultlocation;
    @XmlElement(name = "ALTCONTACTPHONE")
    protected MXStringType altcontactphone;
    @XmlElement(name = "TE")
    protected MXStringType te;
    @XmlElement(name = "TKTYPE")
    protected MXStringType tktype;
    @XmlElement(name = "SMSPHONE")
    protected MXStringType smsphone;
    @XmlElement(name = "IMPACTEDREGION")
    protected MXStringType impactedregion;
    @XmlElement(name = "SMSGROUP")
    protected MXStringType smsgroup;
    @XmlElement(name = "STRING4")
    protected MXStringType string4;
    @XmlElement(name = "ATRIBUT1")
    protected MXStringType atribut1;
    @XmlElement(name = "PREVIOUSSTATUS")
    protected MXStringType previousstatus;
    @XmlElement(name = "BACKUP")
    protected MXBooleanType backup;
    @XmlElement(name = "TRANSMISSIONPATH")
    protected MXStringType transmissionpath;
    @XmlElement(name = "NEXTDEVICE")
    protected MXStringType nextdevice;
    @XmlElement(name = "ORIGINATEDDEVICE")
    protected MXStringType originateddevice;
    @XmlElement(name = "IMSMIGRATION")
    protected MXStringType imsmigration;
    @XmlElement(name = "CABLEGROUP")
    protected MXStringType cablegroup;
    @XmlElement(name = "VOZDUSNAMREZA")
    protected MXStringType vozdusnamreza;
    @XmlElement(name = "CABLETYPE")
    protected MXStringType cabletype;
    @XmlElement(name = "OKNOBROJ")
    protected MXStringType oknobroj;
    @XmlElement(name = "TIPOVINACEVKE")
    protected MXStringType tipovinacevke;
    @XmlElement(name = "SMS")
    protected MXBooleanType sms;
    @XmlElementRef(name = "NUMBEROFAFFECTEDCUSTOMERS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> numberofaffectedcustomers;
    @XmlElementRef(name = "NUMBEROFAFFECTEDKEYCUSTOMERS", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> numberofaffectedkeycustomers;
    @XmlElement(name = "PROBABLECAUSE")
    protected MXStringType probablecause;
    @XmlElement(name = "WITHOUTINT")
    protected MXBooleanType withoutint;
    @XmlElement(name = "POWER")
    protected MXStringType power;
    @XmlElement(name = "AGGREGATE")
    protected MXStringType aggregate;
    @XmlElement(name = "TRANSMISSION")
    protected MXStringType transmission;
    @XmlElement(name = "CONTROLLER")
    protected MXStringType controller;
    @XmlElement(name = "TYPE")
    protected MXStringType type;
    @XmlElementRef(name = "SMSTYPE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> smstype;
    @XmlElement(name = "SMSPREVIEW")
    protected MXStringType smspreview;
    @XmlElement(name = "DEVICENAME")
    protected MXStringType devicename;
    @XmlElement(name = "RESOLVER")
    protected MXStringType resolver;
    @XmlElement(name = "WOCATALOG")
    protected MXStringType wocatalog;
    @XmlElement(name = "CENTRALA")
    protected MXStringType centrala;
    @XmlElement(name = "LOGCREATE")
    protected MXStringType logcreate;
    @XmlElement(name = "LOGDESC")
    protected MXStringType logdesc;
    @XmlElement(name = "LOGINCTYPE")
    protected MXStringType loginctype;
    @XmlElement(name = "LOGLONG")
    protected MXStringType loglong;
    @XmlElement(name = "DIAGINVOKE")
    protected MXStringType diaginvoke;
    @XmlElement(name = "DIAGRESULT")
    protected MXStringType diagresult;
    @XmlElement(name = "DIAGTEMPRESULT")
    protected MXStringType diagtempresult;
    @XmlElement(name = "CHECK1")
    protected MXBooleanType check1;
    @XmlElement(name = "CHECK2")
    protected MXBooleanType check2;
    @XmlElement(name = "CHECK3")
    protected MXBooleanType check3;
    @XmlElementRef(name = "DATE3", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> date3;
    @XmlElementRef(name = "DATE4", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> date4;
    @XmlElementRef(name = "INT4", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int4;
    @XmlElementRef(name = "INT5", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int5;
    @XmlElementRef(name = "INT6", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int6;
    @XmlElement(name = "STRING5")
    protected MXStringType string5;
    @XmlElement(name = "STRING6")
    protected MXStringType string6;
    @XmlElement(name = "STRING7")
    protected MXStringType string7;
    @XmlElement(name = "REASONT")
    protected MXStringType reasont;
    @XmlElement(name = "TYPEOFFAULT")
    protected MXStringType typeoffault;
    @XmlElement(name = "TIPPREKIN")
    protected MXStringType tipprekin;
    @XmlElement(name = "ONCALLFIRSTROTASSNPERSON")
    protected MXStringType oncallfirstrotassnperson;
    @XmlElementRef(name = "ONCALLSTARTTIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> oncallstarttime;
    @XmlElement(name = "ONCALLAUTOASSIGN")
    protected MXBooleanType oncallautoassign;
    @XmlElementRef(name = "ONCALLREASSIGNTIME", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> oncallreassigntime;
    @XmlElement(name = "ONCALLOWNERGROUP")
    protected MXStringType oncallownergroup;
    @XmlElement(name = "REPLACEDOWNER")
    protected MXStringType replacedowner;
    @XmlElementRef(name = "PMCOSOLAPPLIEDDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmcosolapplieddate;
    @XmlElement(name = "PMCOSOLAPPLIEDBY")
    protected MXStringType pmcosolappliedby;
    @XmlElement(name = "PMCOSOLFEEDBACK")
    protected MXStringType pmcosolfeedback;
    @XmlElement(name = "PMCOSOLSTATUS")
    protected MXDomainType pmcosolstatus;
    @XmlElement(name = "PMSCITEMSETID")
    protected MXStringType pmscitemsetid;
    @XmlElementRef(name = "PMSCTMPLID", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmsctmplid;
    @XmlElement(name = "PMSCINVALID")
    protected MXBooleanType pmscinvalid;
    @XmlElementRef(name = "PMSCRECURRINGPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmscrecurringprice;
    @XmlElementRef(name = "PMSCONETIMEPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmsconetimeprice;
    @XmlElementRef(name = "PMSCTOTALRECURRINGPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmsctotalrecurringprice;
    @XmlElementRef(name = "PMSCTOTALONETIMEPRICE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pmsctotalonetimeprice;
    @XmlElement(name = "PMSCCURRENCY")
    protected MXStringType pmsccurrency;
    @XmlElement(name = "RBA_RC")
    protected MXStringType rbarc;
    @XmlElementRef(name = "CREATEPROBLEMDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> createproblemdate;
    @XmlElement(name = "RESOLUTIONPROBLEM")
    protected MXStringType resolutionproblem;
    @XmlElement(name = "WORKAROUND")
    protected MXBooleanType workaround;
    @XmlElementRef(name = "WAYOFREPAIR", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> wayofrepair;
    @XmlElementRef(name = "PRRELATEDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> prrelatedate;
    @XmlElement(name = "REASON")
    protected MXStringType reason;
    @XmlElement(name = "KNOWNERROR")
    protected MXBooleanType knownerror;
    @XmlElement(name = "WORKAROUNDDESC")
    protected MXStringType workarounddesc;
    @XmlElementRef(name = "INT8", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int8;
    @XmlElementRef(name = "INT9", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> int9;
    @XmlElementRef(name = "FAULTCAUSE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> faultcause;
    @XmlElementRef(name = "ROOTCAUSE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> rootcause;
    @XmlElement(name = "PLUSPPOOLNUM")
    protected MXStringType plusppoolnum;
    @XmlElement(name = "PLUSPPOOLITEMNUM")
    protected MXStringType plusppoolitemnum;
    @XmlElement(name = "PLUSPPOOLITEMSETID")
    protected MXStringType plusppoolitemsetid;
    @XmlElementRef(name = "PLUSPTARGDELIVERYDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> plusptargdeliverydate;
    @XmlElementRef(name = "PLUSPACTDELIVERYDATE", namespace = "http://www.ibm.com/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pluspactdeliverydate;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;

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
     * Gets the value of the globalticketclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getGLOBALTICKETCLASS() {
        return globalticketclass;
    }

    /**
     * Sets the value of the globalticketclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setGLOBALTICKETCLASS(MXDomainType value) {
        this.globalticketclass = value;
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
     * Gets the value of the glaccount property.
     * 
     * @return
     *     possible object is
     *     {@link MXGLAccountType }
     *     
     */
    public MXGLAccountType getGLACCOUNT() {
        return glaccount;
    }

    /**
     * Sets the value of the glaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXGLAccountType }
     *     
     */
    public void setGLACCOUNT(MXGLAccountType value) {
        this.glaccount = value;
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
     * Gets the value of the actlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTLABHRS() {
        return actlabhrs;
    }

    /**
     * Sets the value of the actlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTLABHRS(JAXBElement<MXDoubleType> value) {
        this.actlabhrs = value;
    }

    /**
     * Gets the value of the actlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTLABCOST() {
        return actlabcost;
    }

    /**
     * Sets the value of the actlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTLABCOST(JAXBElement<MXDoubleType> value) {
        this.actlabcost = value;
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
     * Gets the value of the createwomulti property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getCREATEWOMULTI() {
        return createwomulti;
    }

    /**
     * Sets the value of the createwomulti property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setCREATEWOMULTI(MXDomainType value) {
        this.createwomulti = value;
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
     * Gets the value of the calcorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALCORGID() {
        return calcorgid;
    }

    /**
     * Sets the value of the calcorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALCORGID(MXStringType value) {
        this.calcorgid = value;
    }

    /**
     * Gets the value of the calccalendar property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALCCALENDAR() {
        return calccalendar;
    }

    /**
     * Sets the value of the calccalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALCCALENDAR(MXStringType value) {
        this.calccalendar = value;
    }

    /**
     * Gets the value of the calcshift property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALCSHIFT() {
        return calcshift;
    }

    /**
     * Sets the value of the calcshift property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALCSHIFT(MXStringType value) {
        this.calcshift = value;
    }

    /**
     * Gets the value of the pluspquotetype property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPLUSPQUOTETYPE() {
        return pluspquotetype;
    }

    /**
     * Sets the value of the pluspquotetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPLUSPQUOTETYPE(MXDomainType value) {
        this.pluspquotetype = value;
    }

    /**
     * Gets the value of the pluspquotedprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPLUSPQUOTEDPRICE() {
        return pluspquotedprice;
    }

    /**
     * Sets the value of the pluspquotedprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPLUSPQUOTEDPRICE(JAXBElement<MXDoubleType> value) {
        this.pluspquotedprice = value;
    }

    /**
     * Gets the value of the pluspagreement property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPAGREEMENT() {
        return pluspagreement;
    }

    /**
     * Sets the value of the pluspagreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPAGREEMENT(MXStringType value) {
        this.pluspagreement = value;
    }

    /**
     * Gets the value of the pluspcustomer property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCUSTOMER() {
        return pluspcustomer;
    }

    /**
     * Sets the value of the pluspcustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCUSTOMER(MXStringType value) {
        this.pluspcustomer = value;
    }

    /**
     * Gets the value of the pluspcostcenter property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCOSTCENTER() {
        return pluspcostcenter;
    }

    /**
     * Sets the value of the pluspcostcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCOSTCENTER(MXStringType value) {
        this.pluspcostcenter = value;
    }

    /**
     * Gets the value of the pluspcustchacct property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCUSTCHACCT() {
        return pluspcustchacct;
    }

    /**
     * Sets the value of the pluspcustchacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCUSTCHACCT(MXStringType value) {
        this.pluspcustchacct = value;
    }

    /**
     * Gets the value of the pluspresponseplan property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPRESPONSEPLAN() {
        return pluspresponseplan;
    }

    /**
     * Sets the value of the pluspresponseplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPRESPONSEPLAN(MXStringType value) {
        this.pluspresponseplan = value;
    }

    /**
     * Gets the value of the plusprevnum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPLUSPREVNUM() {
        return plusprevnum;
    }

    /**
     * Sets the value of the plusprevnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPLUSPREVNUM(JAXBElement<MXLongType> value) {
        this.plusprevnum = value;
    }

    /**
     * Gets the value of the plusppricesched property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPPRICESCHED() {
        return plusppricesched;
    }

    /**
     * Sets the value of the plusppricesched property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPPRICESCHED(MXStringType value) {
        this.plusppricesched = value;
    }

    /**
     * Gets the value of the pluspcustponum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCUSTPONUM() {
        return pluspcustponum;
    }

    /**
     * Sets the value of the pluspcustponum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCUSTPONUM(MXStringType value) {
        this.pluspcustponum = value;
    }

    /**
     * Gets the value of the pluspmaxprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPLUSPMAXPRICE() {
        return pluspmaxprice;
    }

    /**
     * Sets the value of the pluspmaxprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPLUSPMAXPRICE(JAXBElement<MXDoubleType> value) {
        this.pluspmaxprice = value;
    }

    /**
     * Gets the value of the pluspbillbatch property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPBILLBATCH() {
        return pluspbillbatch;
    }

    /**
     * Sets the value of the pluspbillbatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPBILLBATCH(MXStringType value) {
        this.pluspbillbatch = value;
    }

    /**
     * Gets the value of the pluspbblinenum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPLUSPBBLINENUM() {
        return pluspbblinenum;
    }

    /**
     * Sets the value of the pluspbblinenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPLUSPBBLINENUM(JAXBElement<MXLongType> value) {
        this.pluspbblinenum = value;
    }

    /**
     * Gets the value of the pluspporeq property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSPPOREQ() {
        return pluspporeq;
    }

    /**
     * Sets the value of the pluspporeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSPPOREQ(MXBooleanType value) {
        this.pluspporeq = value;
    }

    /**
     * Gets the value of the pluspcalcorgid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCALCORGID() {
        return pluspcalcorgid;
    }

    /**
     * Sets the value of the pluspcalcorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCALCORGID(MXStringType value) {
        this.pluspcalcorgid = value;
    }

    /**
     * Gets the value of the pluspcalccalnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCALCCALNUM() {
        return pluspcalccalnum;
    }

    /**
     * Sets the value of the pluspcalccalnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCALCCALNUM(MXStringType value) {
        this.pluspcalccalnum = value;
    }

    /**
     * Gets the value of the pluspcalcshift property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCALCSHIFT() {
        return pluspcalcshift;
    }

    /**
     * Sets the value of the pluspcalcshift property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCALCSHIFT(MXStringType value) {
        this.pluspcalcshift = value;
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
     * Gets the value of the pmcomresolution property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPMCOMRESOLUTION() {
        return pmcomresolution;
    }

    /**
     * Sets the value of the pmcomresolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPMCOMRESOLUTION(MXDomainType value) {
        this.pmcomresolution = value;
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
     * Gets the value of the pmsccrid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMSCCRID() {
        return pmsccrid;
    }

    /**
     * Sets the value of the pmsccrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMSCCRID(MXStringType value) {
        this.pmsccrid = value;
    }

    /**
     * Gets the value of the pmscitemnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMSCITEMNUM() {
        return pmscitemnum;
    }

    /**
     * Sets the value of the pmscitemnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMSCITEMNUM(MXStringType value) {
        this.pmscitemnum = value;
    }

    /**
     * Gets the value of the pmscoffsummary property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMSCOFFSUMMARY() {
        return pmscoffsummary;
    }

    /**
     * Sets the value of the pmscoffsummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMSCOFFSUMMARY(MXStringType value) {
        this.pmscoffsummary = value;
    }

    /**
     * Gets the value of the pmscquantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMSCQUANTITY() {
        return pmscquantity;
    }

    /**
     * Sets the value of the pmscquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMSCQUANTITY(JAXBElement<MXLongType> value) {
        this.pmscquantity = value;
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
     * Gets the value of the accumulatedholdtime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACCUMULATEDHOLDTIME() {
        return accumulatedholdtime;
    }

    /**
     * Sets the value of the accumulatedholdtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACCUMULATEDHOLDTIME(JAXBElement<MXDoubleType> value) {
        this.accumulatedholdtime = value;
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
     * Gets the value of the adjustedtargetresponsetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getADJUSTEDTARGETRESPONSETIME() {
        return adjustedtargetresponsetime;
    }

    /**
     * Sets the value of the adjustedtargetresponsetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setADJUSTEDTARGETRESPONSETIME(JAXBElement<MXDateTimeType> value) {
        this.adjustedtargetresponsetime = value;
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
     * Gets the value of the hnmoutput property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getHNMOUTPUT() {
        return hnmoutput;
    }

    /**
     * Sets the value of the hnmoutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setHNMOUTPUT(MXStringType value) {
        this.hnmoutput = value;
    }

    /**
     * Gets the value of the alatoutput property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getALATOUTPUT() {
        return alatoutput;
    }

    /**
     * Sets the value of the alatoutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setALATOUTPUT(MXStringType value) {
        this.alatoutput = value;
    }

    /**
     * Gets the value of the repeated property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getREPEATED() {
        return repeated;
    }

    /**
     * Sets the value of the repeated property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setREPEATED(MXBooleanType value) {
        this.repeated = value;
    }

    /**
     * Gets the value of the aturbits property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getATURBITS() {
        return aturbits;
    }

    /**
     * Sets the value of the aturbits property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setATURBITS(MXStringType value) {
        this.aturbits = value;
    }

    /**
     * Gets the value of the atucbits property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getATUCBITS() {
        return atucbits;
    }

    /**
     * Sets the value of the atucbits property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setATUCBITS(MXStringType value) {
        this.atucbits = value;
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
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getOS() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setOS(MXBooleanType value) {
        this.os = value;
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
     * Gets the value of the affectedservice property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAFFECTEDSERVICE() {
        return affectedservice;
    }

    /**
     * Sets the value of the affectedservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAFFECTEDSERVICE(MXStringType value) {
        this.affectedservice = value;
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
     * Gets the value of the altcontactphone property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getALTCONTACTPHONE() {
        return altcontactphone;
    }

    /**
     * Sets the value of the altcontactphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setALTCONTACTPHONE(MXStringType value) {
        this.altcontactphone = value;
    }

    /**
     * Gets the value of the te property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTE() {
        return te;
    }

    /**
     * Sets the value of the te property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTE(MXStringType value) {
        this.te = value;
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
     * Gets the value of the smsphone property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSMSPHONE() {
        return smsphone;
    }

    /**
     * Sets the value of the smsphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSMSPHONE(MXStringType value) {
        this.smsphone = value;
    }

    /**
     * Gets the value of the impactedregion property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getIMPACTEDREGION() {
        return impactedregion;
    }

    /**
     * Sets the value of the impactedregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setIMPACTEDREGION(MXStringType value) {
        this.impactedregion = value;
    }

    /**
     * Gets the value of the smsgroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSMSGROUP() {
        return smsgroup;
    }

    /**
     * Sets the value of the smsgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSMSGROUP(MXStringType value) {
        this.smsgroup = value;
    }

    /**
     * Gets the value of the string4 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTRING4() {
        return string4;
    }

    /**
     * Sets the value of the string4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTRING4(MXStringType value) {
        this.string4 = value;
    }

    /**
     * Gets the value of the atribut1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getATRIBUT1() {
        return atribut1;
    }

    /**
     * Sets the value of the atribut1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setATRIBUT1(MXStringType value) {
        this.atribut1 = value;
    }

    /**
     * Gets the value of the previousstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPREVIOUSSTATUS() {
        return previousstatus;
    }

    /**
     * Sets the value of the previousstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPREVIOUSSTATUS(MXStringType value) {
        this.previousstatus = value;
    }

    /**
     * Gets the value of the backup property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getBACKUP() {
        return backup;
    }

    /**
     * Sets the value of the backup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setBACKUP(MXBooleanType value) {
        this.backup = value;
    }

    /**
     * Gets the value of the transmissionpath property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTRANSMISSIONPATH() {
        return transmissionpath;
    }

    /**
     * Sets the value of the transmissionpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTRANSMISSIONPATH(MXStringType value) {
        this.transmissionpath = value;
    }

    /**
     * Gets the value of the nextdevice property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getNEXTDEVICE() {
        return nextdevice;
    }

    /**
     * Sets the value of the nextdevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setNEXTDEVICE(MXStringType value) {
        this.nextdevice = value;
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
     * Gets the value of the vozdusnamreza property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getVOZDUSNAMREZA() {
        return vozdusnamreza;
    }

    /**
     * Sets the value of the vozdusnamreza property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setVOZDUSNAMREZA(MXStringType value) {
        this.vozdusnamreza = value;
    }

    /**
     * Gets the value of the cabletype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCABLETYPE() {
        return cabletype;
    }

    /**
     * Sets the value of the cabletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCABLETYPE(MXStringType value) {
        this.cabletype = value;
    }

    /**
     * Gets the value of the oknobroj property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOKNOBROJ() {
        return oknobroj;
    }

    /**
     * Sets the value of the oknobroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOKNOBROJ(MXStringType value) {
        this.oknobroj = value;
    }

    /**
     * Gets the value of the tipovinacevke property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTIPOVINACEVKE() {
        return tipovinacevke;
    }

    /**
     * Sets the value of the tipovinacevke property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTIPOVINACEVKE(MXStringType value) {
        this.tipovinacevke = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSMS() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSMS(MXBooleanType value) {
        this.sms = value;
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
     * Gets the value of the numberofaffectedkeycustomers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getNUMBEROFAFFECTEDKEYCUSTOMERS() {
        return numberofaffectedkeycustomers;
    }

    /**
     * Sets the value of the numberofaffectedkeycustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setNUMBEROFAFFECTEDKEYCUSTOMERS(JAXBElement<MXLongType> value) {
        this.numberofaffectedkeycustomers = value;
    }

    /**
     * Gets the value of the probablecause property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPROBABLECAUSE() {
        return probablecause;
    }

    /**
     * Sets the value of the probablecause property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPROBABLECAUSE(MXStringType value) {
        this.probablecause = value;
    }

    /**
     * Gets the value of the withoutint property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getWITHOUTINT() {
        return withoutint;
    }

    /**
     * Sets the value of the withoutint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setWITHOUTINT(MXBooleanType value) {
        this.withoutint = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPOWER() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPOWER(MXStringType value) {
        this.power = value;
    }

    /**
     * Gets the value of the aggregate property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getAGGREGATE() {
        return aggregate;
    }

    /**
     * Sets the value of the aggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setAGGREGATE(MXStringType value) {
        this.aggregate = value;
    }

    /**
     * Gets the value of the transmission property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTRANSMISSION() {
        return transmission;
    }

    /**
     * Sets the value of the transmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTRANSMISSION(MXStringType value) {
        this.transmission = value;
    }

    /**
     * Gets the value of the controller property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCONTROLLER() {
        return controller;
    }

    /**
     * Sets the value of the controller property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCONTROLLER(MXStringType value) {
        this.controller = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTYPE(MXStringType value) {
        this.type = value;
    }

    /**
     * Gets the value of the smstype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getSMSTYPE() {
        return smstype;
    }

    /**
     * Sets the value of the smstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setSMSTYPE(JAXBElement<MXLongType> value) {
        this.smstype = value;
    }

    /**
     * Gets the value of the smspreview property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSMSPREVIEW() {
        return smspreview;
    }

    /**
     * Sets the value of the smspreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSMSPREVIEW(MXStringType value) {
        this.smspreview = value;
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
     * Gets the value of the logcreate property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLOGCREATE() {
        return logcreate;
    }

    /**
     * Sets the value of the logcreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLOGCREATE(MXStringType value) {
        this.logcreate = value;
    }

    /**
     * Gets the value of the logdesc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLOGDESC() {
        return logdesc;
    }

    /**
     * Sets the value of the logdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLOGDESC(MXStringType value) {
        this.logdesc = value;
    }

    /**
     * Gets the value of the loginctype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLOGINCTYPE() {
        return loginctype;
    }

    /**
     * Sets the value of the loginctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLOGINCTYPE(MXStringType value) {
        this.loginctype = value;
    }

    /**
     * Gets the value of the loglong property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLOGLONG() {
        return loglong;
    }

    /**
     * Sets the value of the loglong property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLOGLONG(MXStringType value) {
        this.loglong = value;
    }

    /**
     * Gets the value of the diaginvoke property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDIAGINVOKE() {
        return diaginvoke;
    }

    /**
     * Sets the value of the diaginvoke property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDIAGINVOKE(MXStringType value) {
        this.diaginvoke = value;
    }

    /**
     * Gets the value of the diagresult property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDIAGRESULT() {
        return diagresult;
    }

    /**
     * Sets the value of the diagresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDIAGRESULT(MXStringType value) {
        this.diagresult = value;
    }

    /**
     * Gets the value of the diagtempresult property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getDIAGTEMPRESULT() {
        return diagtempresult;
    }

    /**
     * Sets the value of the diagtempresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setDIAGTEMPRESULT(MXStringType value) {
        this.diagtempresult = value;
    }

    /**
     * Gets the value of the check1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getCHECK1() {
        return check1;
    }

    /**
     * Sets the value of the check1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setCHECK1(MXBooleanType value) {
        this.check1 = value;
    }

    /**
     * Gets the value of the check2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getCHECK2() {
        return check2;
    }

    /**
     * Sets the value of the check2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setCHECK2(MXBooleanType value) {
        this.check2 = value;
    }

    /**
     * Gets the value of the check3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getCHECK3() {
        return check3;
    }

    /**
     * Sets the value of the check3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setCHECK3(MXBooleanType value) {
        this.check3 = value;
    }

    /**
     * Gets the value of the date3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getDATE3() {
        return date3;
    }

    /**
     * Sets the value of the date3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setDATE3(JAXBElement<MXDateTimeType> value) {
        this.date3 = value;
    }

    /**
     * Gets the value of the date4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getDATE4() {
        return date4;
    }

    /**
     * Sets the value of the date4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setDATE4(JAXBElement<MXDateTimeType> value) {
        this.date4 = value;
    }

    /**
     * Gets the value of the int4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINT4() {
        return int4;
    }

    /**
     * Sets the value of the int4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINT4(JAXBElement<MXLongType> value) {
        this.int4 = value;
    }

    /**
     * Gets the value of the int5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINT5() {
        return int5;
    }

    /**
     * Sets the value of the int5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINT5(JAXBElement<MXLongType> value) {
        this.int5 = value;
    }

    /**
     * Gets the value of the int6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINT6() {
        return int6;
    }

    /**
     * Sets the value of the int6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINT6(JAXBElement<MXLongType> value) {
        this.int6 = value;
    }

    /**
     * Gets the value of the string5 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTRING5() {
        return string5;
    }

    /**
     * Sets the value of the string5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTRING5(MXStringType value) {
        this.string5 = value;
    }

    /**
     * Gets the value of the string6 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTRING6() {
        return string6;
    }

    /**
     * Sets the value of the string6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTRING6(MXStringType value) {
        this.string6 = value;
    }

    /**
     * Gets the value of the string7 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSTRING7() {
        return string7;
    }

    /**
     * Sets the value of the string7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSTRING7(MXStringType value) {
        this.string7 = value;
    }

    /**
     * Gets the value of the reasont property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREASONT() {
        return reasont;
    }

    /**
     * Sets the value of the reasont property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREASONT(MXStringType value) {
        this.reasont = value;
    }

    /**
     * Gets the value of the typeoffault property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTYPEOFFAULT() {
        return typeoffault;
    }

    /**
     * Sets the value of the typeoffault property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTYPEOFFAULT(MXStringType value) {
        this.typeoffault = value;
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
     * Gets the value of the oncallfirstrotassnperson property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getONCALLFIRSTROTASSNPERSON() {
        return oncallfirstrotassnperson;
    }

    /**
     * Sets the value of the oncallfirstrotassnperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setONCALLFIRSTROTASSNPERSON(MXStringType value) {
        this.oncallfirstrotassnperson = value;
    }

    /**
     * Gets the value of the oncallstarttime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getONCALLSTARTTIME() {
        return oncallstarttime;
    }

    /**
     * Sets the value of the oncallstarttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setONCALLSTARTTIME(JAXBElement<MXDateTimeType> value) {
        this.oncallstarttime = value;
    }

    /**
     * Gets the value of the oncallautoassign property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getONCALLAUTOASSIGN() {
        return oncallautoassign;
    }

    /**
     * Sets the value of the oncallautoassign property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setONCALLAUTOASSIGN(MXBooleanType value) {
        this.oncallautoassign = value;
    }

    /**
     * Gets the value of the oncallreassigntime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getONCALLREASSIGNTIME() {
        return oncallreassigntime;
    }

    /**
     * Sets the value of the oncallreassigntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setONCALLREASSIGNTIME(JAXBElement<MXDateTimeType> value) {
        this.oncallreassigntime = value;
    }

    /**
     * Gets the value of the oncallownergroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getONCALLOWNERGROUP() {
        return oncallownergroup;
    }

    /**
     * Sets the value of the oncallownergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setONCALLOWNERGROUP(MXStringType value) {
        this.oncallownergroup = value;
    }

    /**
     * Gets the value of the replacedowner property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREPLACEDOWNER() {
        return replacedowner;
    }

    /**
     * Sets the value of the replacedowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREPLACEDOWNER(MXStringType value) {
        this.replacedowner = value;
    }

    /**
     * Gets the value of the pmcosolapplieddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMCOSOLAPPLIEDDATE() {
        return pmcosolapplieddate;
    }

    /**
     * Sets the value of the pmcosolapplieddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMCOSOLAPPLIEDDATE(JAXBElement<MXDateTimeType> value) {
        this.pmcosolapplieddate = value;
    }

    /**
     * Gets the value of the pmcosolappliedby property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOSOLAPPLIEDBY() {
        return pmcosolappliedby;
    }

    /**
     * Sets the value of the pmcosolappliedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOSOLAPPLIEDBY(MXStringType value) {
        this.pmcosolappliedby = value;
    }

    /**
     * Gets the value of the pmcosolfeedback property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOSOLFEEDBACK() {
        return pmcosolfeedback;
    }

    /**
     * Sets the value of the pmcosolfeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOSOLFEEDBACK(MXStringType value) {
        this.pmcosolfeedback = value;
    }

    /**
     * Gets the value of the pmcosolstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getPMCOSOLSTATUS() {
        return pmcosolstatus;
    }

    /**
     * Sets the value of the pmcosolstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setPMCOSOLSTATUS(MXDomainType value) {
        this.pmcosolstatus = value;
    }

    /**
     * Gets the value of the pmscitemsetid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMSCITEMSETID() {
        return pmscitemsetid;
    }

    /**
     * Sets the value of the pmscitemsetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMSCITEMSETID(MXStringType value) {
        this.pmscitemsetid = value;
    }

    /**
     * Gets the value of the pmsctmplid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPMSCTMPLID() {
        return pmsctmplid;
    }

    /**
     * Sets the value of the pmsctmplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPMSCTMPLID(JAXBElement<MXLongType> value) {
        this.pmsctmplid = value;
    }

    /**
     * Gets the value of the pmscinvalid property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMSCINVALID() {
        return pmscinvalid;
    }

    /**
     * Sets the value of the pmscinvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMSCINVALID(MXBooleanType value) {
        this.pmscinvalid = value;
    }

    /**
     * Gets the value of the pmscrecurringprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMSCRECURRINGPRICE() {
        return pmscrecurringprice;
    }

    /**
     * Sets the value of the pmscrecurringprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMSCRECURRINGPRICE(JAXBElement<MXDoubleType> value) {
        this.pmscrecurringprice = value;
    }

    /**
     * Gets the value of the pmsconetimeprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMSCONETIMEPRICE() {
        return pmsconetimeprice;
    }

    /**
     * Sets the value of the pmsconetimeprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMSCONETIMEPRICE(JAXBElement<MXDoubleType> value) {
        this.pmsconetimeprice = value;
    }

    /**
     * Gets the value of the pmsctotalrecurringprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMSCTOTALRECURRINGPRICE() {
        return pmsctotalrecurringprice;
    }

    /**
     * Sets the value of the pmsctotalrecurringprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMSCTOTALRECURRINGPRICE(JAXBElement<MXDoubleType> value) {
        this.pmsctotalrecurringprice = value;
    }

    /**
     * Gets the value of the pmsctotalonetimeprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPMSCTOTALONETIMEPRICE() {
        return pmsctotalonetimeprice;
    }

    /**
     * Sets the value of the pmsctotalonetimeprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPMSCTOTALONETIMEPRICE(JAXBElement<MXDoubleType> value) {
        this.pmsctotalonetimeprice = value;
    }

    /**
     * Gets the value of the pmsccurrency property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMSCCURRENCY() {
        return pmsccurrency;
    }

    /**
     * Sets the value of the pmsccurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMSCCURRENCY(MXStringType value) {
        this.pmsccurrency = value;
    }

    /**
     * Gets the value of the rbarc property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRBARC() {
        return rbarc;
    }

    /**
     * Sets the value of the rbarc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRBARC(MXStringType value) {
        this.rbarc = value;
    }

    /**
     * Gets the value of the createproblemdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getCREATEPROBLEMDATE() {
        return createproblemdate;
    }

    /**
     * Sets the value of the createproblemdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setCREATEPROBLEMDATE(JAXBElement<MXDateTimeType> value) {
        this.createproblemdate = value;
    }

    /**
     * Gets the value of the resolutionproblem property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRESOLUTIONPROBLEM() {
        return resolutionproblem;
    }

    /**
     * Sets the value of the resolutionproblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRESOLUTIONPROBLEM(MXStringType value) {
        this.resolutionproblem = value;
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
     * Gets the value of the prrelatedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPRRELATEDATE() {
        return prrelatedate;
    }

    /**
     * Sets the value of the prrelatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPRRELATEDATE(JAXBElement<MXDateTimeType> value) {
        this.prrelatedate = value;
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
     * Gets the value of the knownerror property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getKNOWNERROR() {
        return knownerror;
    }

    /**
     * Sets the value of the knownerror property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setKNOWNERROR(MXBooleanType value) {
        this.knownerror = value;
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
     * Gets the value of the int8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINT8() {
        return int8;
    }

    /**
     * Sets the value of the int8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINT8(JAXBElement<MXLongType> value) {
        this.int8 = value;
    }

    /**
     * Gets the value of the int9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getINT9() {
        return int9;
    }

    /**
     * Sets the value of the int9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setINT9(JAXBElement<MXLongType> value) {
        this.int9 = value;
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
     * Gets the value of the plusppoolnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPPOOLNUM() {
        return plusppoolnum;
    }

    /**
     * Sets the value of the plusppoolnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPPOOLNUM(MXStringType value) {
        this.plusppoolnum = value;
    }

    /**
     * Gets the value of the plusppoolitemnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPPOOLITEMNUM() {
        return plusppoolitemnum;
    }

    /**
     * Sets the value of the plusppoolitemnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPPOOLITEMNUM(MXStringType value) {
        this.plusppoolitemnum = value;
    }

    /**
     * Gets the value of the plusppoolitemsetid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPPOOLITEMSETID() {
        return plusppoolitemsetid;
    }

    /**
     * Sets the value of the plusppoolitemsetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPPOOLITEMSETID(MXStringType value) {
        this.plusppoolitemsetid = value;
    }

    /**
     * Gets the value of the plusptargdeliverydate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPLUSPTARGDELIVERYDATE() {
        return plusptargdeliverydate;
    }

    /**
     * Sets the value of the plusptargdeliverydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPLUSPTARGDELIVERYDATE(JAXBElement<MXDateTimeType> value) {
        this.plusptargdeliverydate = value;
    }

    /**
     * Gets the value of the pluspactdeliverydate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPLUSPACTDELIVERYDATE() {
        return pluspactdeliverydate;
    }

    /**
     * Sets the value of the pluspactdeliverydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPLUSPACTDELIVERYDATE(JAXBElement<MXDateTimeType> value) {
        this.pluspactdeliverydate = value;
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

}

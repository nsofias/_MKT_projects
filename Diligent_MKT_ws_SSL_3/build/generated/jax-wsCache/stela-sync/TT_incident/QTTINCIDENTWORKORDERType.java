
package TT_incident;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QTTINCIDENT_WORKORDERType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QTTINCIDENT_WORKORDERType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ACTFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ACTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ASSETLOCPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ASSETNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BACKOUTPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CALCCALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CALCPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CALENDAR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHANGEBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHANGEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CHARGESTORE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CINUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CLASSSTRUCTUREID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="COMMODITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="COMMODITYGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CONTRACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CREWID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CUSTOMERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DESCRIPTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DISABLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DOWNTIME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ENVIRONMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTATAPPRLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTATAPPRLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTATAPPRMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTATAPPRSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTATAPPRTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTDUR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTLABHRS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTSERVCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ESTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EXTERNALREFID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAILDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAILURECODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAULTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FINCNTRLID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FIRSTAPPRSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FLOWACTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FLOWACTIONASSIST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FLOWCONTROLLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GENERATEDFORPO" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GENFORPOLINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GLACCOUNT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXGLAccountType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HASCHILDREN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HASFOLLOWUPWORK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HISTORYFLAG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INSPECTOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="INTERRUPTIBLE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ISTASK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="JOBTASKID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="JPNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="JUSTIFYPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LAUNCHENTRYNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LEAD" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LINEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MEASUREDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MEASUREMENTVALUE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NEWCHILDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OBSERVATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ONBEHALFOF" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGRECORDCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ORIGRECORDID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OUTLABCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OUTMATCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OUTTOOLCOST" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OWNER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OWNERGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OWNERSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PARENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PARENTCHGSSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PERSONGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PHONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPADDRESSLINE2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPADDRESSLINE3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPADDRISCHANGED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPAGREEMENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPALLOWQUOTE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPBBLINENUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPBILLBATCH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPBILLBATCHID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPBILLSTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCALCCALNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCALCORGID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCALCSHIFT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCOSTCENTER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCOUNTRY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCOUNTY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCUSTCHACCT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCUSTOMER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPCUSTPONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPDIRECTIONS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPGEOCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPLATDIRECTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPLATITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPLINESTATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPLONGDIRECTION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPLONGITUDE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPMAXPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPORIGQPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPORIGQTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPPOREQ" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPPOSTALCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPPRICESCHED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPQUOTEDPRICE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPQUOTETYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPREFPOINT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPREGIONDISTR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPRESPONSEPLAN" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPREVNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPSTADDRDIRPRFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPSTADDRDIRSFX" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPSTADDRNUMBER" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPSTADDRSTREET" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPSTADDRSTTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPSTADDRUNITNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPSTATEPROVINCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPSTREETADDRESS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PLUSPTIMEZONE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMBPELACTNAME" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMBPELENABLED" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMBPELINPROG" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMIMPACT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMSTATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMCOMURGENCY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMDUEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMEXTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMNEXTDUEDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PMNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="POINTNUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PRECKAID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PROBLEMCODE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REASONFORCHANGE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REGION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REMDUR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="REPORTEDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RESPONDBY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RISK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ROUTE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ROUTESTOPID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SCHEDFINISH" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SCHEDSTART" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SENDERSYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SERVICESINFAULT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SITEID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOURCESYSID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STATUS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="STATUSDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SUPERVISOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SUSPENDFLOW" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGCOMPDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGETDESC" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TARGSTARTDATE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TASKID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VENDOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VERIFICATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WHOMISCHANGEFOR" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOACCEPTSCHARGES" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOCLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ10" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ11" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ12" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ13" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ14" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOEQ9" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOGROUP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOISSWAP" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXBooleanType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJO1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJO2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJO3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJO4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJO5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJO6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJO7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJO8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJP1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJP2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJP3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJP4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOJP5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOL1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOL2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOL3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOL4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLABLNK" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO10" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO6" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO7" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO8" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOLO9" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WONUM" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOPRIORITY" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKLOCATION" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKORDERID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORKTYPE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORTS1" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORTS2" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORTS3" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORTS4" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDateTimeType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WORTS5" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXDoubleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WOSEQUENCE" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attGroup ref="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}ObjectStructurePropertyGroup"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTTINCIDENT_WORKORDERType", propOrder = {
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
public class QTTINCIDENTWORKORDERType {

    @XmlElementRef(name = "ACTFINISH", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actfinish;
    @XmlElementRef(name = "ACTLABCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actlabcost;
    @XmlElementRef(name = "ACTLABHRS", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actlabhrs;
    @XmlElementRef(name = "ACTMATCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actmatcost;
    @XmlElementRef(name = "ACTSERVCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> actservcost;
    @XmlElementRef(name = "ACTSTART", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> actstart;
    @XmlElementRef(name = "ACTTOOLCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> acttoolcost;
    @XmlElementRef(name = "ASSETLOCPRIORITY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> assetlocpriority;
    @XmlElement(name = "ASSETNUM")
    protected MXStringType assetnum;
    @XmlElement(name = "BACKOUTPLAN")
    protected MXStringType backoutplan;
    @XmlElement(name = "CALCCALENDAR")
    protected MXStringType calccalendar;
    @XmlElement(name = "CALCORGID")
    protected MXStringType calcorgid;
    @XmlElementRef(name = "CALCPRIORITY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> calcpriority;
    @XmlElement(name = "CALCSHIFT")
    protected MXStringType calcshift;
    @XmlElement(name = "CALENDAR")
    protected MXStringType calendar;
    @XmlElement(name = "CHANGEBY")
    protected MXStringType changeby;
    @XmlElementRef(name = "CHANGEDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> changedate;
    @XmlElement(name = "CHARGESTORE")
    protected MXBooleanType chargestore;
    @XmlElement(name = "CINUM")
    protected MXStringType cinum;
    @XmlElement(name = "CLASSSTRUCTUREID")
    protected MXStringType classstructureid;
    @XmlElement(name = "COMMODITY")
    protected MXStringType commodity;
    @XmlElement(name = "COMMODITYGROUP")
    protected MXStringType commoditygroup;
    @XmlElement(name = "CONTRACT")
    protected MXStringType contract;
    @XmlElement(name = "CREWID")
    protected MXStringType crewid;
    @XmlElement(name = "CUSTOMERID")
    protected MXStringType customerid;
    @XmlElement(name = "DESCRIPTION")
    protected MXStringType description;
    @XmlElement(name = "DISABLED")
    protected MXBooleanType disabled;
    @XmlElement(name = "DOWNTIME")
    protected MXBooleanType downtime;
    @XmlElement(name = "ENVIRONMENT")
    protected MXStringType environment;
    @XmlElementRef(name = "ESTATAPPRLABCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprlabcost;
    @XmlElementRef(name = "ESTATAPPRLABHRS", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprlabhrs;
    @XmlElementRef(name = "ESTATAPPRMATCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprmatcost;
    @XmlElementRef(name = "ESTATAPPRSERVCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprservcost;
    @XmlElementRef(name = "ESTATAPPRTOOLCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estatapprtoolcost;
    @XmlElementRef(name = "ESTDUR", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estdur;
    @XmlElementRef(name = "ESTLABCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estlabcost;
    @XmlElementRef(name = "ESTLABHRS", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estlabhrs;
    @XmlElementRef(name = "ESTMATCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estmatcost;
    @XmlElementRef(name = "ESTSERVCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> estservcost;
    @XmlElementRef(name = "ESTTOOLCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> esttoolcost;
    @XmlElement(name = "EXTERNALREFID")
    protected MXStringType externalrefid;
    @XmlElementRef(name = "FAILDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> faildate;
    @XmlElement(name = "FAILURECODE")
    protected MXStringType failurecode;
    @XmlElementRef(name = "FAULTTYPE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> faulttype;
    @XmlElement(name = "FINCNTRLID")
    protected MXStringType fincntrlid;
    @XmlElement(name = "FIRSTAPPRSTATUS")
    protected MXStringType firstapprstatus;
    @XmlElement(name = "FLOWACTION")
    protected MXStringType flowaction;
    @XmlElement(name = "FLOWACTIONASSIST")
    protected MXBooleanType flowactionassist;
    @XmlElement(name = "FLOWCONTROLLED")
    protected MXBooleanType flowcontrolled;
    @XmlElement(name = "GENERATEDFORPO")
    protected MXStringType generatedforpo;
    @XmlElementRef(name = "GENFORPOLINEID", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> genforpolineid;
    @XmlElement(name = "GLACCOUNT")
    protected MXGLAccountType glaccount;
    @XmlElement(name = "HASCHILDREN")
    protected MXBooleanType haschildren;
    @XmlElement(name = "HASFOLLOWUPWORK")
    protected MXBooleanType hasfollowupwork;
    @XmlElement(name = "HISTORYFLAG")
    protected MXBooleanType historyflag;
    @XmlElement(name = "INSPECTOR")
    protected MXStringType inspector;
    @XmlElement(name = "INTERRUPTIBLE")
    protected MXBooleanType interruptible;
    @XmlElement(name = "ISTASK")
    protected MXBooleanType istask;
    @XmlElementRef(name = "JOBTASKID", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> jobtaskid;
    @XmlElement(name = "JPNUM")
    protected MXStringType jpnum;
    @XmlElement(name = "JUSTIFYPRIORITY")
    protected MXStringType justifypriority;
    @XmlElement(name = "LAUNCHENTRYNAME")
    protected MXStringType launchentryname;
    @XmlElement(name = "LEAD")
    protected MXStringType lead;
    @XmlElement(name = "LINEID")
    protected MXStringType lineid;
    @XmlElement(name = "LOCATION")
    protected MXStringType location;
    @XmlElementRef(name = "MEASUREDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> measuredate;
    @XmlElementRef(name = "MEASUREMENTVALUE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> measurementvalue;
    @XmlElement(name = "NEWCHILDCLASS")
    protected MXStringType newchildclass;
    @XmlElement(name = "OBSERVATION")
    protected MXStringType observation;
    @XmlElement(name = "ONBEHALFOF")
    protected MXStringType onbehalfof;
    @XmlElement(name = "ORGID")
    protected MXStringType orgid;
    @XmlElement(name = "ORIGRECORDCLASS")
    protected MXStringType origrecordclass;
    @XmlElement(name = "ORIGRECORDID")
    protected MXStringType origrecordid;
    @XmlElementRef(name = "OUTLABCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> outlabcost;
    @XmlElementRef(name = "OUTMATCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> outmatcost;
    @XmlElementRef(name = "OUTTOOLCOST", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> outtoolcost;
    @XmlElement(name = "OWNER")
    protected MXStringType owner;
    @XmlElement(name = "OWNERGROUP")
    protected MXStringType ownergroup;
    @XmlElement(name = "OWNERSYSID")
    protected MXStringType ownersysid;
    @XmlElement(name = "PARENT")
    protected MXStringType parent;
    @XmlElement(name = "PARENTCHGSSTATUS")
    protected MXBooleanType parentchgsstatus;
    @XmlElement(name = "PERSONGROUP")
    protected MXStringType persongroup;
    @XmlElement(name = "PHONE")
    protected MXStringType phone;
    @XmlElement(name = "PLUSPADDRESSLINE2")
    protected MXStringType pluspaddressline2;
    @XmlElement(name = "PLUSPADDRESSLINE3")
    protected MXStringType pluspaddressline3;
    @XmlElement(name = "PLUSPADDRISCHANGED")
    protected MXBooleanType pluspaddrischanged;
    @XmlElement(name = "PLUSPAGREEMENT")
    protected MXStringType pluspagreement;
    @XmlElement(name = "PLUSPALLOWQUOTE")
    protected MXBooleanType pluspallowquote;
    @XmlElementRef(name = "PLUSPBBLINENUM", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pluspbblinenum;
    @XmlElement(name = "PLUSPBILLBATCH")
    protected MXStringType pluspbillbatch;
    @XmlElementRef(name = "PLUSPBILLBATCHID", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pluspbillbatchid;
    @XmlElement(name = "PLUSPBILLSTATUS")
    protected MXStringType pluspbillstatus;
    @XmlElement(name = "PLUSPCALCCALNUM")
    protected MXStringType pluspcalccalnum;
    @XmlElement(name = "PLUSPCALCORGID")
    protected MXStringType pluspcalcorgid;
    @XmlElement(name = "PLUSPCALCSHIFT")
    protected MXStringType pluspcalcshift;
    @XmlElement(name = "PLUSPCITY")
    protected MXStringType pluspcity;
    @XmlElement(name = "PLUSPCOSTCENTER")
    protected MXStringType pluspcostcenter;
    @XmlElement(name = "PLUSPCOUNTRY")
    protected MXStringType pluspcountry;
    @XmlElement(name = "PLUSPCOUNTY")
    protected MXStringType pluspcounty;
    @XmlElement(name = "PLUSPCUSTCHACCT")
    protected MXStringType pluspcustchacct;
    @XmlElement(name = "PLUSPCUSTOMER")
    protected MXStringType pluspcustomer;
    @XmlElement(name = "PLUSPCUSTPONUM")
    protected MXStringType pluspcustponum;
    @XmlElement(name = "PLUSPDIRECTIONS")
    protected MXStringType pluspdirections;
    @XmlElement(name = "PLUSPGEOCODE")
    protected MXStringType pluspgeocode;
    @XmlElement(name = "PLUSPLATDIRECTION")
    protected MXStringType plusplatdirection;
    @XmlElementRef(name = "PLUSPLATITUDE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> plusplatitude;
    @XmlElement(name = "PLUSPLINESTATUS")
    protected MXStringType plusplinestatus;
    @XmlElement(name = "PLUSPLONGDIRECTION")
    protected MXStringType plusplongdirection;
    @XmlElementRef(name = "PLUSPLONGITUDE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> plusplongitude;
    @XmlElementRef(name = "PLUSPMAXPRICE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pluspmaxprice;
    @XmlElementRef(name = "PLUSPORIGQPRICE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> plusporigqprice;
    @XmlElement(name = "PLUSPORIGQTYPE")
    protected MXStringType plusporigqtype;
    @XmlElement(name = "PLUSPPOREQ")
    protected MXBooleanType pluspporeq;
    @XmlElement(name = "PLUSPPOSTALCODE")
    protected MXStringType plusppostalcode;
    @XmlElement(name = "PLUSPPRICESCHED")
    protected MXStringType plusppricesched;
    @XmlElementRef(name = "PLUSPQUOTEDPRICE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> pluspquotedprice;
    @XmlElement(name = "PLUSPQUOTETYPE")
    protected MXStringType pluspquotetype;
    @XmlElement(name = "PLUSPREFPOINT")
    protected MXStringType plusprefpoint;
    @XmlElement(name = "PLUSPREGIONDISTR")
    protected MXStringType pluspregiondistr;
    @XmlElement(name = "PLUSPRESPONSEPLAN")
    protected MXStringType pluspresponseplan;
    @XmlElementRef(name = "PLUSPREVNUM", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> plusprevnum;
    @XmlElement(name = "PLUSPSTADDRDIRPRFX")
    protected MXStringType pluspstaddrdirprfx;
    @XmlElement(name = "PLUSPSTADDRDIRSFX")
    protected MXStringType pluspstaddrdirsfx;
    @XmlElement(name = "PLUSPSTADDRNUMBER")
    protected MXStringType pluspstaddrnumber;
    @XmlElement(name = "PLUSPSTADDRSTREET")
    protected MXStringType pluspstaddrstreet;
    @XmlElement(name = "PLUSPSTADDRSTTYPE")
    protected MXStringType pluspstaddrsttype;
    @XmlElement(name = "PLUSPSTADDRUNITNUM")
    protected MXStringType pluspstaddrunitnum;
    @XmlElement(name = "PLUSPSTATEPROVINCE")
    protected MXStringType pluspstateprovince;
    @XmlElement(name = "PLUSPSTREETADDRESS")
    protected MXStringType pluspstreetaddress;
    @XmlElement(name = "PLUSPTIMEZONE")
    protected MXStringType plusptimezone;
    @XmlElement(name = "PMCOMBPELACTNAME")
    protected MXStringType pmcombpelactname;
    @XmlElement(name = "PMCOMBPELENABLED")
    protected MXBooleanType pmcombpelenabled;
    @XmlElement(name = "PMCOMBPELINPROG")
    protected MXBooleanType pmcombpelinprog;
    @XmlElementRef(name = "PMCOMIMPACT", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmcomimpact;
    @XmlElement(name = "PMCOMSTATE")
    protected MXStringType pmcomstate;
    @XmlElement(name = "PMCOMTYPE")
    protected MXStringType pmcomtype;
    @XmlElementRef(name = "PMCOMURGENCY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> pmcomurgency;
    @XmlElementRef(name = "PMDUEDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmduedate;
    @XmlElementRef(name = "PMEXTDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmextdate;
    @XmlElementRef(name = "PMNEXTDUEDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> pmnextduedate;
    @XmlElement(name = "PMNUM")
    protected MXStringType pmnum;
    @XmlElement(name = "POINTNUM")
    protected MXStringType pointnum;
    @XmlElement(name = "PRECKAID")
    protected MXStringType preckaid;
    @XmlElement(name = "PROBLEMCODE")
    protected MXStringType problemcode;
    @XmlElement(name = "REASONFORCHANGE")
    protected MXStringType reasonforchange;
    @XmlElementRef(name = "REGION", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> region;
    @XmlElementRef(name = "REMDUR", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> remdur;
    @XmlElementRef(name = "REPORTDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> reportdate;
    @XmlElement(name = "REPORTEDBY")
    protected MXStringType reportedby;
    @XmlElementRef(name = "RESPONDBY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> respondby;
    @XmlElement(name = "RISK")
    protected MXStringType risk;
    @XmlElement(name = "ROUTE")
    protected MXStringType route;
    @XmlElementRef(name = "ROUTESTOPID", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> routestopid;
    @XmlElementRef(name = "SCHEDFINISH", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> schedfinish;
    @XmlElementRef(name = "SCHEDSTART", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> schedstart;
    @XmlElement(name = "SENDERSYSID")
    protected MXStringType sendersysid;
    @XmlElementRef(name = "SERVICESINFAULT", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> servicesinfault;
    @XmlElement(name = "SITEID")
    protected MXStringType siteid;
    @XmlElement(name = "SOURCESYSID")
    protected MXStringType sourcesysid;
    @XmlElement(name = "STATUS")
    protected MXStringType status;
    @XmlElementRef(name = "STATUSDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> statusdate;
    @XmlElement(name = "SUPERVISOR")
    protected MXStringType supervisor;
    @XmlElement(name = "SUSPENDFLOW")
    protected MXBooleanType suspendflow;
    @XmlElementRef(name = "TARGCOMPDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targcompdate;
    @XmlElement(name = "TARGETDESC")
    protected MXStringType targetdesc;
    @XmlElementRef(name = "TARGSTARTDATE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> targstartdate;
    @XmlElementRef(name = "TASKID", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> taskid;
    @XmlElement(name = "VENDOR")
    protected MXStringType vendor;
    @XmlElement(name = "VERIFICATION")
    protected MXStringType verification;
    @XmlElement(name = "WHOMISCHANGEFOR")
    protected MXStringType whomischangefor;
    @XmlElement(name = "WOACCEPTSCHARGES")
    protected MXBooleanType woacceptscharges;
    @XmlElement(name = "WOCLASS")
    protected MXStringType woclass;
    @XmlElement(name = "WOEQ1")
    protected MXStringType woeq1;
    @XmlElement(name = "WOEQ10")
    protected MXStringType woeq10;
    @XmlElement(name = "WOEQ11")
    protected MXStringType woeq11;
    @XmlElementRef(name = "WOEQ12", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> woeq12;
    @XmlElementRef(name = "WOEQ13", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> woeq13;
    @XmlElementRef(name = "WOEQ14", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> woeq14;
    @XmlElement(name = "WOEQ2")
    protected MXStringType woeq2;
    @XmlElement(name = "WOEQ3")
    protected MXStringType woeq3;
    @XmlElement(name = "WOEQ4")
    protected MXStringType woeq4;
    @XmlElementRef(name = "WOEQ5", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> woeq5;
    @XmlElementRef(name = "WOEQ6", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> woeq6;
    @XmlElementRef(name = "WOEQ7", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> woeq7;
    @XmlElement(name = "WOEQ8")
    protected MXStringType woeq8;
    @XmlElement(name = "WOEQ9")
    protected MXStringType woeq9;
    @XmlElement(name = "WOGROUP")
    protected MXStringType wogroup;
    @XmlElement(name = "WOISSWAP")
    protected MXBooleanType woisswap;
    @XmlElement(name = "WOJO1")
    protected MXStringType wojo1;
    @XmlElement(name = "WOJO2")
    protected MXStringType wojo2;
    @XmlElement(name = "WOJO3")
    protected MXStringType wojo3;
    @XmlElementRef(name = "WOJO4", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wojo4;
    @XmlElement(name = "WOJO5")
    protected MXStringType wojo5;
    @XmlElement(name = "WOJO6")
    protected MXStringType wojo6;
    @XmlElement(name = "WOJO7")
    protected MXStringType wojo7;
    @XmlElement(name = "WOJO8")
    protected MXStringType wojo8;
    @XmlElement(name = "WOJP1")
    protected MXStringType wojp1;
    @XmlElement(name = "WOJP2")
    protected MXStringType wojp2;
    @XmlElement(name = "WOJP3")
    protected MXStringType wojp3;
    @XmlElementRef(name = "WOJP4", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wojp4;
    @XmlElementRef(name = "WOJP5", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> wojp5;
    @XmlElement(name = "WOL1")
    protected MXStringType wol1;
    @XmlElement(name = "WOL2")
    protected MXStringType wol2;
    @XmlElementRef(name = "WOL3", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wol3;
    @XmlElementRef(name = "WOL4", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> wol4;
    @XmlElement(name = "WOLABLNK")
    protected MXStringType wolablnk;
    @XmlElement(name = "WOLO1")
    protected MXStringType wolo1;
    @XmlElementRef(name = "WOLO10", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> wolo10;
    @XmlElement(name = "WOLO2")
    protected MXStringType wolo2;
    @XmlElement(name = "WOLO3")
    protected MXStringType wolo3;
    @XmlElement(name = "WOLO4")
    protected MXStringType wolo4;
    @XmlElement(name = "WOLO5")
    protected MXStringType wolo5;
    @XmlElementRef(name = "WOLO6", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wolo6;
    @XmlElementRef(name = "WOLO7", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> wolo7;
    @XmlElementRef(name = "WOLO8", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> wolo8;
    @XmlElement(name = "WOLO9")
    protected MXStringType wolo9;
    @XmlElement(name = "WONUM")
    protected MXStringType wonum;
    @XmlElementRef(name = "WOPRIORITY", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> wopriority;
    @XmlElement(name = "WORKLOCATION")
    protected MXStringType worklocation;
    @XmlElementRef(name = "WORKORDERID", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> workorderid;
    @XmlElement(name = "WORKTYPE")
    protected MXStringType worktype;
    @XmlElement(name = "WORTS1")
    protected MXStringType worts1;
    @XmlElement(name = "WORTS2")
    protected MXStringType worts2;
    @XmlElement(name = "WORTS3")
    protected MXStringType worts3;
    @XmlElementRef(name = "WORTS4", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDateTimeType> worts4;
    @XmlElementRef(name = "WORTS5", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXDoubleType> worts5;
    @XmlElementRef(name = "WOSEQUENCE", namespace = "http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", type = JAXBElement.class, required = false)
    protected JAXBElement<MXLongType> wosequence;
    @XmlAttribute(name = "action")
    protected ProcessingActionType action;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "deleteForInsert")
    protected String deleteForInsert;

    /**
     * Gets the value of the actfinish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTFINISH() {
        return actfinish;
    }

    /**
     * Sets the value of the actfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTFINISH(JAXBElement<MXDateTimeType> value) {
        this.actfinish = value;
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
     * Gets the value of the actmatcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTMATCOST() {
        return actmatcost;
    }

    /**
     * Sets the value of the actmatcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTMATCOST(JAXBElement<MXDoubleType> value) {
        this.actmatcost = value;
    }

    /**
     * Gets the value of the actservcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTSERVCOST() {
        return actservcost;
    }

    /**
     * Sets the value of the actservcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTSERVCOST(JAXBElement<MXDoubleType> value) {
        this.actservcost = value;
    }

    /**
     * Gets the value of the actstart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getACTSTART() {
        return actstart;
    }

    /**
     * Sets the value of the actstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setACTSTART(JAXBElement<MXDateTimeType> value) {
        this.actstart = value;
    }

    /**
     * Gets the value of the acttoolcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getACTTOOLCOST() {
        return acttoolcost;
    }

    /**
     * Sets the value of the acttoolcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setACTTOOLCOST(JAXBElement<MXDoubleType> value) {
        this.acttoolcost = value;
    }

    /**
     * Gets the value of the assetlocpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getASSETLOCPRIORITY() {
        return assetlocpriority;
    }

    /**
     * Sets the value of the assetlocpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setASSETLOCPRIORITY(JAXBElement<MXLongType> value) {
        this.assetlocpriority = value;
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
     * Gets the value of the backoutplan property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getBACKOUTPLAN() {
        return backoutplan;
    }

    /**
     * Sets the value of the backoutplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setBACKOUTPLAN(MXStringType value) {
        this.backoutplan = value;
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
     * Gets the value of the calcpriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getCALCPRIORITY() {
        return calcpriority;
    }

    /**
     * Sets the value of the calcpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setCALCPRIORITY(JAXBElement<MXLongType> value) {
        this.calcpriority = value;
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
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCALENDAR() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCALENDAR(MXStringType value) {
        this.calendar = value;
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
     * Gets the value of the chargestore property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getCHARGESTORE() {
        return chargestore;
    }

    /**
     * Sets the value of the chargestore property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setCHARGESTORE(MXBooleanType value) {
        this.chargestore = value;
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
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCONTRACT() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCONTRACT(MXStringType value) {
        this.contract = value;
    }

    /**
     * Gets the value of the crewid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getCREWID() {
        return crewid;
    }

    /**
     * Sets the value of the crewid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setCREWID(MXStringType value) {
        this.crewid = value;
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
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getDISABLED() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setDISABLED(MXBooleanType value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the downtime property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getDOWNTIME() {
        return downtime;
    }

    /**
     * Sets the value of the downtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setDOWNTIME(MXBooleanType value) {
        this.downtime = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getENVIRONMENT() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setENVIRONMENT(MXStringType value) {
        this.environment = value;
    }

    /**
     * Gets the value of the estatapprlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRLABCOST() {
        return estatapprlabcost;
    }

    /**
     * Sets the value of the estatapprlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRLABCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprlabcost = value;
    }

    /**
     * Gets the value of the estatapprlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRLABHRS() {
        return estatapprlabhrs;
    }

    /**
     * Sets the value of the estatapprlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRLABHRS(JAXBElement<MXDoubleType> value) {
        this.estatapprlabhrs = value;
    }

    /**
     * Gets the value of the estatapprmatcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRMATCOST() {
        return estatapprmatcost;
    }

    /**
     * Sets the value of the estatapprmatcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRMATCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprmatcost = value;
    }

    /**
     * Gets the value of the estatapprservcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRSERVCOST() {
        return estatapprservcost;
    }

    /**
     * Sets the value of the estatapprservcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRSERVCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprservcost = value;
    }

    /**
     * Gets the value of the estatapprtoolcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTATAPPRTOOLCOST() {
        return estatapprtoolcost;
    }

    /**
     * Sets the value of the estatapprtoolcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTATAPPRTOOLCOST(JAXBElement<MXDoubleType> value) {
        this.estatapprtoolcost = value;
    }

    /**
     * Gets the value of the estdur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTDUR() {
        return estdur;
    }

    /**
     * Sets the value of the estdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTDUR(JAXBElement<MXDoubleType> value) {
        this.estdur = value;
    }

    /**
     * Gets the value of the estlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTLABCOST() {
        return estlabcost;
    }

    /**
     * Sets the value of the estlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTLABCOST(JAXBElement<MXDoubleType> value) {
        this.estlabcost = value;
    }

    /**
     * Gets the value of the estlabhrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTLABHRS() {
        return estlabhrs;
    }

    /**
     * Sets the value of the estlabhrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTLABHRS(JAXBElement<MXDoubleType> value) {
        this.estlabhrs = value;
    }

    /**
     * Gets the value of the estmatcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTMATCOST() {
        return estmatcost;
    }

    /**
     * Sets the value of the estmatcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTMATCOST(JAXBElement<MXDoubleType> value) {
        this.estmatcost = value;
    }

    /**
     * Gets the value of the estservcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTSERVCOST() {
        return estservcost;
    }

    /**
     * Sets the value of the estservcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTSERVCOST(JAXBElement<MXDoubleType> value) {
        this.estservcost = value;
    }

    /**
     * Gets the value of the esttoolcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getESTTOOLCOST() {
        return esttoolcost;
    }

    /**
     * Sets the value of the esttoolcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setESTTOOLCOST(JAXBElement<MXDoubleType> value) {
        this.esttoolcost = value;
    }

    /**
     * Gets the value of the externalrefid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getEXTERNALREFID() {
        return externalrefid;
    }

    /**
     * Sets the value of the externalrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setEXTERNALREFID(MXStringType value) {
        this.externalrefid = value;
    }

    /**
     * Gets the value of the faildate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getFAILDATE() {
        return faildate;
    }

    /**
     * Sets the value of the faildate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setFAILDATE(JAXBElement<MXDateTimeType> value) {
        this.faildate = value;
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
     * Gets the value of the fincntrlid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFINCNTRLID() {
        return fincntrlid;
    }

    /**
     * Sets the value of the fincntrlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFINCNTRLID(MXStringType value) {
        this.fincntrlid = value;
    }

    /**
     * Gets the value of the firstapprstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFIRSTAPPRSTATUS() {
        return firstapprstatus;
    }

    /**
     * Sets the value of the firstapprstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFIRSTAPPRSTATUS(MXStringType value) {
        this.firstapprstatus = value;
    }

    /**
     * Gets the value of the flowaction property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getFLOWACTION() {
        return flowaction;
    }

    /**
     * Sets the value of the flowaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setFLOWACTION(MXStringType value) {
        this.flowaction = value;
    }

    /**
     * Gets the value of the flowactionassist property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getFLOWACTIONASSIST() {
        return flowactionassist;
    }

    /**
     * Sets the value of the flowactionassist property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setFLOWACTIONASSIST(MXBooleanType value) {
        this.flowactionassist = value;
    }

    /**
     * Gets the value of the flowcontrolled property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getFLOWCONTROLLED() {
        return flowcontrolled;
    }

    /**
     * Sets the value of the flowcontrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setFLOWCONTROLLED(MXBooleanType value) {
        this.flowcontrolled = value;
    }

    /**
     * Gets the value of the generatedforpo property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getGENERATEDFORPO() {
        return generatedforpo;
    }

    /**
     * Sets the value of the generatedforpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setGENERATEDFORPO(MXStringType value) {
        this.generatedforpo = value;
    }

    /**
     * Gets the value of the genforpolineid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getGENFORPOLINEID() {
        return genforpolineid;
    }

    /**
     * Sets the value of the genforpolineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setGENFORPOLINEID(JAXBElement<MXLongType> value) {
        this.genforpolineid = value;
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
     * Gets the value of the haschildren property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHASCHILDREN() {
        return haschildren;
    }

    /**
     * Sets the value of the haschildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHASCHILDREN(MXBooleanType value) {
        this.haschildren = value;
    }

    /**
     * Gets the value of the hasfollowupwork property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getHASFOLLOWUPWORK() {
        return hasfollowupwork;
    }

    /**
     * Sets the value of the hasfollowupwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setHASFOLLOWUPWORK(MXBooleanType value) {
        this.hasfollowupwork = value;
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
     * Gets the value of the inspector property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getINSPECTOR() {
        return inspector;
    }

    /**
     * Sets the value of the inspector property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setINSPECTOR(MXStringType value) {
        this.inspector = value;
    }

    /**
     * Gets the value of the interruptible property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getINTERRUPTIBLE() {
        return interruptible;
    }

    /**
     * Sets the value of the interruptible property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setINTERRUPTIBLE(MXBooleanType value) {
        this.interruptible = value;
    }

    /**
     * Gets the value of the istask property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getISTASK() {
        return istask;
    }

    /**
     * Sets the value of the istask property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setISTASK(MXBooleanType value) {
        this.istask = value;
    }

    /**
     * Gets the value of the jobtaskid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getJOBTASKID() {
        return jobtaskid;
    }

    /**
     * Sets the value of the jobtaskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setJOBTASKID(JAXBElement<MXLongType> value) {
        this.jobtaskid = value;
    }

    /**
     * Gets the value of the jpnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getJPNUM() {
        return jpnum;
    }

    /**
     * Sets the value of the jpnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setJPNUM(MXStringType value) {
        this.jpnum = value;
    }

    /**
     * Gets the value of the justifypriority property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getJUSTIFYPRIORITY() {
        return justifypriority;
    }

    /**
     * Sets the value of the justifypriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setJUSTIFYPRIORITY(MXStringType value) {
        this.justifypriority = value;
    }

    /**
     * Gets the value of the launchentryname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLAUNCHENTRYNAME() {
        return launchentryname;
    }

    /**
     * Sets the value of the launchentryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLAUNCHENTRYNAME(MXStringType value) {
        this.launchentryname = value;
    }

    /**
     * Gets the value of the lead property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getLEAD() {
        return lead;
    }

    /**
     * Sets the value of the lead property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setLEAD(MXStringType value) {
        this.lead = value;
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
     * Gets the value of the measuredate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getMEASUREDATE() {
        return measuredate;
    }

    /**
     * Sets the value of the measuredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setMEASUREDATE(JAXBElement<MXDateTimeType> value) {
        this.measuredate = value;
    }

    /**
     * Gets the value of the measurementvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getMEASUREMENTVALUE() {
        return measurementvalue;
    }

    /**
     * Sets the value of the measurementvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setMEASUREMENTVALUE(JAXBElement<MXDoubleType> value) {
        this.measurementvalue = value;
    }

    /**
     * Gets the value of the newchildclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getNEWCHILDCLASS() {
        return newchildclass;
    }

    /**
     * Sets the value of the newchildclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setNEWCHILDCLASS(MXStringType value) {
        this.newchildclass = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOBSERVATION() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOBSERVATION(MXStringType value) {
        this.observation = value;
    }

    /**
     * Gets the value of the onbehalfof property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getONBEHALFOF() {
        return onbehalfof;
    }

    /**
     * Sets the value of the onbehalfof property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setONBEHALFOF(MXStringType value) {
        this.onbehalfof = value;
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
     * Gets the value of the outlabcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getOUTLABCOST() {
        return outlabcost;
    }

    /**
     * Sets the value of the outlabcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setOUTLABCOST(JAXBElement<MXDoubleType> value) {
        this.outlabcost = value;
    }

    /**
     * Gets the value of the outmatcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getOUTMATCOST() {
        return outmatcost;
    }

    /**
     * Sets the value of the outmatcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setOUTMATCOST(JAXBElement<MXDoubleType> value) {
        this.outmatcost = value;
    }

    /**
     * Gets the value of the outtoolcost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getOUTTOOLCOST() {
        return outtoolcost;
    }

    /**
     * Sets the value of the outtoolcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setOUTTOOLCOST(JAXBElement<MXDoubleType> value) {
        this.outtoolcost = value;
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
     * Gets the value of the ownersysid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getOWNERSYSID() {
        return ownersysid;
    }

    /**
     * Sets the value of the ownersysid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setOWNERSYSID(MXStringType value) {
        this.ownersysid = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPARENT() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPARENT(MXStringType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the parentchgsstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPARENTCHGSSTATUS() {
        return parentchgsstatus;
    }

    /**
     * Sets the value of the parentchgsstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPARENTCHGSSTATUS(MXBooleanType value) {
        this.parentchgsstatus = value;
    }

    /**
     * Gets the value of the persongroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPERSONGROUP() {
        return persongroup;
    }

    /**
     * Sets the value of the persongroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPERSONGROUP(MXStringType value) {
        this.persongroup = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPHONE() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPHONE(MXStringType value) {
        this.phone = value;
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
     * Gets the value of the pluspallowquote property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPLUSPALLOWQUOTE() {
        return pluspallowquote;
    }

    /**
     * Sets the value of the pluspallowquote property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPLUSPALLOWQUOTE(MXBooleanType value) {
        this.pluspallowquote = value;
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
     * Gets the value of the pluspbillbatchid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getPLUSPBILLBATCHID() {
        return pluspbillbatchid;
    }

    /**
     * Sets the value of the pluspbillbatchid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setPLUSPBILLBATCHID(JAXBElement<MXLongType> value) {
        this.pluspbillbatchid = value;
    }

    /**
     * Gets the value of the pluspbillstatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPBILLSTATUS() {
        return pluspbillstatus;
    }

    /**
     * Sets the value of the pluspbillstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPBILLSTATUS(MXStringType value) {
        this.pluspbillstatus = value;
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
     * Gets the value of the pluspcity property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCITY() {
        return pluspcity;
    }

    /**
     * Sets the value of the pluspcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCITY(MXStringType value) {
        this.pluspcity = value;
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
     * Gets the value of the pluspcountry property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCOUNTRY() {
        return pluspcountry;
    }

    /**
     * Sets the value of the pluspcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCOUNTRY(MXStringType value) {
        this.pluspcountry = value;
    }

    /**
     * Gets the value of the pluspcounty property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPCOUNTY() {
        return pluspcounty;
    }

    /**
     * Sets the value of the pluspcounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPCOUNTY(MXStringType value) {
        this.pluspcounty = value;
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
     * Gets the value of the pluspdirections property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPDIRECTIONS() {
        return pluspdirections;
    }

    /**
     * Sets the value of the pluspdirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPDIRECTIONS(MXStringType value) {
        this.pluspdirections = value;
    }

    /**
     * Gets the value of the pluspgeocode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPGEOCODE() {
        return pluspgeocode;
    }

    /**
     * Sets the value of the pluspgeocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPGEOCODE(MXStringType value) {
        this.pluspgeocode = value;
    }

    /**
     * Gets the value of the plusplatdirection property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPLATDIRECTION() {
        return plusplatdirection;
    }

    /**
     * Sets the value of the plusplatdirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPLATDIRECTION(MXStringType value) {
        this.plusplatdirection = value;
    }

    /**
     * Gets the value of the plusplatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPLUSPLATITUDE() {
        return plusplatitude;
    }

    /**
     * Sets the value of the plusplatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPLUSPLATITUDE(JAXBElement<MXDoubleType> value) {
        this.plusplatitude = value;
    }

    /**
     * Gets the value of the plusplinestatus property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPLINESTATUS() {
        return plusplinestatus;
    }

    /**
     * Sets the value of the plusplinestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPLINESTATUS(MXStringType value) {
        this.plusplinestatus = value;
    }

    /**
     * Gets the value of the plusplongdirection property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPLONGDIRECTION() {
        return plusplongdirection;
    }

    /**
     * Sets the value of the plusplongdirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPLONGDIRECTION(MXStringType value) {
        this.plusplongdirection = value;
    }

    /**
     * Gets the value of the plusplongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPLUSPLONGITUDE() {
        return plusplongitude;
    }

    /**
     * Sets the value of the plusplongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPLUSPLONGITUDE(JAXBElement<MXDoubleType> value) {
        this.plusplongitude = value;
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
     * Gets the value of the plusporigqprice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getPLUSPORIGQPRICE() {
        return plusporigqprice;
    }

    /**
     * Sets the value of the plusporigqprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setPLUSPORIGQPRICE(JAXBElement<MXDoubleType> value) {
        this.plusporigqprice = value;
    }

    /**
     * Gets the value of the plusporigqtype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPORIGQTYPE() {
        return plusporigqtype;
    }

    /**
     * Sets the value of the plusporigqtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPORIGQTYPE(MXStringType value) {
        this.plusporigqtype = value;
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
     * Gets the value of the plusppostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPPOSTALCODE() {
        return plusppostalcode;
    }

    /**
     * Sets the value of the plusppostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPPOSTALCODE(MXStringType value) {
        this.plusppostalcode = value;
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
     * Gets the value of the pluspquotetype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPQUOTETYPE() {
        return pluspquotetype;
    }

    /**
     * Sets the value of the pluspquotetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPQUOTETYPE(MXStringType value) {
        this.pluspquotetype = value;
    }

    /**
     * Gets the value of the plusprefpoint property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPREFPOINT() {
        return plusprefpoint;
    }

    /**
     * Sets the value of the plusprefpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPREFPOINT(MXStringType value) {
        this.plusprefpoint = value;
    }

    /**
     * Gets the value of the pluspregiondistr property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPREGIONDISTR() {
        return pluspregiondistr;
    }

    /**
     * Sets the value of the pluspregiondistr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPREGIONDISTR(MXStringType value) {
        this.pluspregiondistr = value;
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
     * Gets the value of the pluspstaddrdirprfx property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPSTADDRDIRPRFX() {
        return pluspstaddrdirprfx;
    }

    /**
     * Sets the value of the pluspstaddrdirprfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPSTADDRDIRPRFX(MXStringType value) {
        this.pluspstaddrdirprfx = value;
    }

    /**
     * Gets the value of the pluspstaddrdirsfx property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPSTADDRDIRSFX() {
        return pluspstaddrdirsfx;
    }

    /**
     * Sets the value of the pluspstaddrdirsfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPSTADDRDIRSFX(MXStringType value) {
        this.pluspstaddrdirsfx = value;
    }

    /**
     * Gets the value of the pluspstaddrnumber property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPSTADDRNUMBER() {
        return pluspstaddrnumber;
    }

    /**
     * Sets the value of the pluspstaddrnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPSTADDRNUMBER(MXStringType value) {
        this.pluspstaddrnumber = value;
    }

    /**
     * Gets the value of the pluspstaddrstreet property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPSTADDRSTREET() {
        return pluspstaddrstreet;
    }

    /**
     * Sets the value of the pluspstaddrstreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPSTADDRSTREET(MXStringType value) {
        this.pluspstaddrstreet = value;
    }

    /**
     * Gets the value of the pluspstaddrsttype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPSTADDRSTTYPE() {
        return pluspstaddrsttype;
    }

    /**
     * Sets the value of the pluspstaddrsttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPSTADDRSTTYPE(MXStringType value) {
        this.pluspstaddrsttype = value;
    }

    /**
     * Gets the value of the pluspstaddrunitnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPSTADDRUNITNUM() {
        return pluspstaddrunitnum;
    }

    /**
     * Sets the value of the pluspstaddrunitnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPSTADDRUNITNUM(MXStringType value) {
        this.pluspstaddrunitnum = value;
    }

    /**
     * Gets the value of the pluspstateprovince property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPSTATEPROVINCE() {
        return pluspstateprovince;
    }

    /**
     * Sets the value of the pluspstateprovince property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPSTATEPROVINCE(MXStringType value) {
        this.pluspstateprovince = value;
    }

    /**
     * Gets the value of the pluspstreetaddress property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPLUSPSTREETADDRESS() {
        return pluspstreetaddress;
    }

    /**
     * Sets the value of the pluspstreetaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPLUSPSTREETADDRESS(MXStringType value) {
        this.pluspstreetaddress = value;
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
     * Gets the value of the pmcombpelactname property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOMBPELACTNAME() {
        return pmcombpelactname;
    }

    /**
     * Sets the value of the pmcombpelactname property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOMBPELACTNAME(MXStringType value) {
        this.pmcombpelactname = value;
    }

    /**
     * Gets the value of the pmcombpelenabled property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMCOMBPELENABLED() {
        return pmcombpelenabled;
    }

    /**
     * Sets the value of the pmcombpelenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMCOMBPELENABLED(MXBooleanType value) {
        this.pmcombpelenabled = value;
    }

    /**
     * Gets the value of the pmcombpelinprog property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getPMCOMBPELINPROG() {
        return pmcombpelinprog;
    }

    /**
     * Sets the value of the pmcombpelinprog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setPMCOMBPELINPROG(MXBooleanType value) {
        this.pmcombpelinprog = value;
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
     * Gets the value of the pmcomstate property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMCOMSTATE() {
        return pmcomstate;
    }

    /**
     * Sets the value of the pmcomstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMCOMSTATE(MXStringType value) {
        this.pmcomstate = value;
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
     * Gets the value of the pmduedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMDUEDATE() {
        return pmduedate;
    }

    /**
     * Sets the value of the pmduedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMDUEDATE(JAXBElement<MXDateTimeType> value) {
        this.pmduedate = value;
    }

    /**
     * Gets the value of the pmextdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMEXTDATE() {
        return pmextdate;
    }

    /**
     * Sets the value of the pmextdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMEXTDATE(JAXBElement<MXDateTimeType> value) {
        this.pmextdate = value;
    }

    /**
     * Gets the value of the pmnextduedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getPMNEXTDUEDATE() {
        return pmnextduedate;
    }

    /**
     * Sets the value of the pmnextduedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setPMNEXTDUEDATE(JAXBElement<MXDateTimeType> value) {
        this.pmnextduedate = value;
    }

    /**
     * Gets the value of the pmnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPMNUM() {
        return pmnum;
    }

    /**
     * Sets the value of the pmnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPMNUM(MXStringType value) {
        this.pmnum = value;
    }

    /**
     * Gets the value of the pointnum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getPOINTNUM() {
        return pointnum;
    }

    /**
     * Sets the value of the pointnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setPOINTNUM(MXStringType value) {
        this.pointnum = value;
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
     * Gets the value of the reasonforchange property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getREASONFORCHANGE() {
        return reasonforchange;
    }

    /**
     * Sets the value of the reasonforchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setREASONFORCHANGE(MXStringType value) {
        this.reasonforchange = value;
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
     * Gets the value of the remdur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getREMDUR() {
        return remdur;
    }

    /**
     * Sets the value of the remdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setREMDUR(JAXBElement<MXDoubleType> value) {
        this.remdur = value;
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
     * Gets the value of the respondby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getRESPONDBY() {
        return respondby;
    }

    /**
     * Sets the value of the respondby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setRESPONDBY(JAXBElement<MXDateTimeType> value) {
        this.respondby = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getRISK() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setRISK(MXStringType value) {
        this.risk = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getROUTE() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setROUTE(MXStringType value) {
        this.route = value;
    }

    /**
     * Gets the value of the routestopid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getROUTESTOPID() {
        return routestopid;
    }

    /**
     * Sets the value of the routestopid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setROUTESTOPID(JAXBElement<MXLongType> value) {
        this.routestopid = value;
    }

    /**
     * Gets the value of the schedfinish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getSCHEDFINISH() {
        return schedfinish;
    }

    /**
     * Sets the value of the schedfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setSCHEDFINISH(JAXBElement<MXDateTimeType> value) {
        this.schedfinish = value;
    }

    /**
     * Gets the value of the schedstart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getSCHEDSTART() {
        return schedstart;
    }

    /**
     * Sets the value of the schedstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setSCHEDSTART(JAXBElement<MXDateTimeType> value) {
        this.schedstart = value;
    }

    /**
     * Gets the value of the sendersysid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSENDERSYSID() {
        return sendersysid;
    }

    /**
     * Sets the value of the sendersysid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSENDERSYSID(MXStringType value) {
        this.sendersysid = value;
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
     * Gets the value of the sourcesysid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getSOURCESYSID() {
        return sourcesysid;
    }

    /**
     * Sets the value of the sourcesysid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setSOURCESYSID(MXStringType value) {
        this.sourcesysid = value;
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
     * Gets the value of the suspendflow property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getSUSPENDFLOW() {
        return suspendflow;
    }

    /**
     * Sets the value of the suspendflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setSUSPENDFLOW(MXBooleanType value) {
        this.suspendflow = value;
    }

    /**
     * Gets the value of the targcompdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTARGCOMPDATE() {
        return targcompdate;
    }

    /**
     * Sets the value of the targcompdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTARGCOMPDATE(JAXBElement<MXDateTimeType> value) {
        this.targcompdate = value;
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
     * Gets the value of the targstartdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getTARGSTARTDATE() {
        return targstartdate;
    }

    /**
     * Sets the value of the targstartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setTARGSTARTDATE(JAXBElement<MXDateTimeType> value) {
        this.targstartdate = value;
    }

    /**
     * Gets the value of the taskid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getTASKID() {
        return taskid;
    }

    /**
     * Sets the value of the taskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setTASKID(JAXBElement<MXLongType> value) {
        this.taskid = value;
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
     * Gets the value of the verification property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getVERIFICATION() {
        return verification;
    }

    /**
     * Sets the value of the verification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setVERIFICATION(MXStringType value) {
        this.verification = value;
    }

    /**
     * Gets the value of the whomischangefor property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWHOMISCHANGEFOR() {
        return whomischangefor;
    }

    /**
     * Sets the value of the whomischangefor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWHOMISCHANGEFOR(MXStringType value) {
        this.whomischangefor = value;
    }

    /**
     * Gets the value of the woacceptscharges property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getWOACCEPTSCHARGES() {
        return woacceptscharges;
    }

    /**
     * Sets the value of the woacceptscharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setWOACCEPTSCHARGES(MXBooleanType value) {
        this.woacceptscharges = value;
    }

    /**
     * Gets the value of the woclass property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOCLASS() {
        return woclass;
    }

    /**
     * Sets the value of the woclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOCLASS(MXStringType value) {
        this.woclass = value;
    }

    /**
     * Gets the value of the woeq1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ1() {
        return woeq1;
    }

    /**
     * Sets the value of the woeq1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ1(MXStringType value) {
        this.woeq1 = value;
    }

    /**
     * Gets the value of the woeq10 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ10() {
        return woeq10;
    }

    /**
     * Sets the value of the woeq10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ10(MXStringType value) {
        this.woeq10 = value;
    }

    /**
     * Gets the value of the woeq11 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ11() {
        return woeq11;
    }

    /**
     * Sets the value of the woeq11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ11(MXStringType value) {
        this.woeq11 = value;
    }

    /**
     * Gets the value of the woeq12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOEQ12() {
        return woeq12;
    }

    /**
     * Sets the value of the woeq12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOEQ12(JAXBElement<MXDoubleType> value) {
        this.woeq12 = value;
    }

    /**
     * Gets the value of the woeq13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOEQ13() {
        return woeq13;
    }

    /**
     * Sets the value of the woeq13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOEQ13(JAXBElement<MXDateTimeType> value) {
        this.woeq13 = value;
    }

    /**
     * Gets the value of the woeq14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOEQ14() {
        return woeq14;
    }

    /**
     * Sets the value of the woeq14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOEQ14(JAXBElement<MXDoubleType> value) {
        this.woeq14 = value;
    }

    /**
     * Gets the value of the woeq2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ2() {
        return woeq2;
    }

    /**
     * Sets the value of the woeq2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ2(MXStringType value) {
        this.woeq2 = value;
    }

    /**
     * Gets the value of the woeq3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ3() {
        return woeq3;
    }

    /**
     * Sets the value of the woeq3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ3(MXStringType value) {
        this.woeq3 = value;
    }

    /**
     * Gets the value of the woeq4 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ4() {
        return woeq4;
    }

    /**
     * Sets the value of the woeq4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ4(MXStringType value) {
        this.woeq4 = value;
    }

    /**
     * Gets the value of the woeq5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOEQ5() {
        return woeq5;
    }

    /**
     * Sets the value of the woeq5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOEQ5(JAXBElement<MXDoubleType> value) {
        this.woeq5 = value;
    }

    /**
     * Gets the value of the woeq6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOEQ6() {
        return woeq6;
    }

    /**
     * Sets the value of the woeq6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOEQ6(JAXBElement<MXDateTimeType> value) {
        this.woeq6 = value;
    }

    /**
     * Gets the value of the woeq7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOEQ7() {
        return woeq7;
    }

    /**
     * Sets the value of the woeq7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOEQ7(JAXBElement<MXDoubleType> value) {
        this.woeq7 = value;
    }

    /**
     * Gets the value of the woeq8 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ8() {
        return woeq8;
    }

    /**
     * Sets the value of the woeq8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ8(MXStringType value) {
        this.woeq8 = value;
    }

    /**
     * Gets the value of the woeq9 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOEQ9() {
        return woeq9;
    }

    /**
     * Sets the value of the woeq9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOEQ9(MXStringType value) {
        this.woeq9 = value;
    }

    /**
     * Gets the value of the wogroup property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOGROUP() {
        return wogroup;
    }

    /**
     * Sets the value of the wogroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOGROUP(MXStringType value) {
        this.wogroup = value;
    }

    /**
     * Gets the value of the woisswap property.
     * 
     * @return
     *     possible object is
     *     {@link MXBooleanType }
     *     
     */
    public MXBooleanType getWOISSWAP() {
        return woisswap;
    }

    /**
     * Sets the value of the woisswap property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXBooleanType }
     *     
     */
    public void setWOISSWAP(MXBooleanType value) {
        this.woisswap = value;
    }

    /**
     * Gets the value of the wojo1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO1() {
        return wojo1;
    }

    /**
     * Sets the value of the wojo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO1(MXStringType value) {
        this.wojo1 = value;
    }

    /**
     * Gets the value of the wojo2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO2() {
        return wojo2;
    }

    /**
     * Sets the value of the wojo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO2(MXStringType value) {
        this.wojo2 = value;
    }

    /**
     * Gets the value of the wojo3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO3() {
        return wojo3;
    }

    /**
     * Sets the value of the wojo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO3(MXStringType value) {
        this.wojo3 = value;
    }

    /**
     * Gets the value of the wojo4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOJO4() {
        return wojo4;
    }

    /**
     * Sets the value of the wojo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOJO4(JAXBElement<MXDoubleType> value) {
        this.wojo4 = value;
    }

    /**
     * Gets the value of the wojo5 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO5() {
        return wojo5;
    }

    /**
     * Sets the value of the wojo5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO5(MXStringType value) {
        this.wojo5 = value;
    }

    /**
     * Gets the value of the wojo6 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO6() {
        return wojo6;
    }

    /**
     * Sets the value of the wojo6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO6(MXStringType value) {
        this.wojo6 = value;
    }

    /**
     * Gets the value of the wojo7 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO7() {
        return wojo7;
    }

    /**
     * Sets the value of the wojo7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO7(MXStringType value) {
        this.wojo7 = value;
    }

    /**
     * Gets the value of the wojo8 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJO8() {
        return wojo8;
    }

    /**
     * Sets the value of the wojo8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJO8(MXStringType value) {
        this.wojo8 = value;
    }

    /**
     * Gets the value of the wojp1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJP1() {
        return wojp1;
    }

    /**
     * Sets the value of the wojp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJP1(MXStringType value) {
        this.wojp1 = value;
    }

    /**
     * Gets the value of the wojp2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJP2() {
        return wojp2;
    }

    /**
     * Sets the value of the wojp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJP2(MXStringType value) {
        this.wojp2 = value;
    }

    /**
     * Gets the value of the wojp3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOJP3() {
        return wojp3;
    }

    /**
     * Sets the value of the wojp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOJP3(MXStringType value) {
        this.wojp3 = value;
    }

    /**
     * Gets the value of the wojp4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOJP4() {
        return wojp4;
    }

    /**
     * Sets the value of the wojp4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOJP4(JAXBElement<MXDoubleType> value) {
        this.wojp4 = value;
    }

    /**
     * Gets the value of the wojp5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOJP5() {
        return wojp5;
    }

    /**
     * Sets the value of the wojp5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOJP5(JAXBElement<MXDateTimeType> value) {
        this.wojp5 = value;
    }

    /**
     * Gets the value of the wol1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOL1() {
        return wol1;
    }

    /**
     * Sets the value of the wol1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOL1(MXStringType value) {
        this.wol1 = value;
    }

    /**
     * Gets the value of the wol2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOL2() {
        return wol2;
    }

    /**
     * Sets the value of the wol2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOL2(MXStringType value) {
        this.wol2 = value;
    }

    /**
     * Gets the value of the wol3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOL3() {
        return wol3;
    }

    /**
     * Sets the value of the wol3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOL3(JAXBElement<MXDoubleType> value) {
        this.wol3 = value;
    }

    /**
     * Gets the value of the wol4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOL4() {
        return wol4;
    }

    /**
     * Sets the value of the wol4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOL4(JAXBElement<MXDateTimeType> value) {
        this.wol4 = value;
    }

    /**
     * Gets the value of the wolablnk property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLABLNK() {
        return wolablnk;
    }

    /**
     * Sets the value of the wolablnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLABLNK(MXStringType value) {
        this.wolablnk = value;
    }

    /**
     * Gets the value of the wolo1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO1() {
        return wolo1;
    }

    /**
     * Sets the value of the wolo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO1(MXStringType value) {
        this.wolo1 = value;
    }

    /**
     * Gets the value of the wolo10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWOLO10() {
        return wolo10;
    }

    /**
     * Sets the value of the wolo10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWOLO10(JAXBElement<MXLongType> value) {
        this.wolo10 = value;
    }

    /**
     * Gets the value of the wolo2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO2() {
        return wolo2;
    }

    /**
     * Sets the value of the wolo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO2(MXStringType value) {
        this.wolo2 = value;
    }

    /**
     * Gets the value of the wolo3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO3() {
        return wolo3;
    }

    /**
     * Sets the value of the wolo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO3(MXStringType value) {
        this.wolo3 = value;
    }

    /**
     * Gets the value of the wolo4 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO4() {
        return wolo4;
    }

    /**
     * Sets the value of the wolo4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO4(MXStringType value) {
        this.wolo4 = value;
    }

    /**
     * Gets the value of the wolo5 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO5() {
        return wolo5;
    }

    /**
     * Sets the value of the wolo5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO5(MXStringType value) {
        this.wolo5 = value;
    }

    /**
     * Gets the value of the wolo6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOLO6() {
        return wolo6;
    }

    /**
     * Sets the value of the wolo6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOLO6(JAXBElement<MXDoubleType> value) {
        this.wolo6 = value;
    }

    /**
     * Gets the value of the wolo7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWOLO7() {
        return wolo7;
    }

    /**
     * Sets the value of the wolo7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWOLO7(JAXBElement<MXDateTimeType> value) {
        this.wolo7 = value;
    }

    /**
     * Gets the value of the wolo8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWOLO8() {
        return wolo8;
    }

    /**
     * Sets the value of the wolo8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWOLO8(JAXBElement<MXDoubleType> value) {
        this.wolo8 = value;
    }

    /**
     * Gets the value of the wolo9 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWOLO9() {
        return wolo9;
    }

    /**
     * Sets the value of the wolo9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWOLO9(MXStringType value) {
        this.wolo9 = value;
    }

    /**
     * Gets the value of the wonum property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWONUM() {
        return wonum;
    }

    /**
     * Sets the value of the wonum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWONUM(MXStringType value) {
        this.wonum = value;
    }

    /**
     * Gets the value of the wopriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWOPRIORITY() {
        return wopriority;
    }

    /**
     * Sets the value of the wopriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWOPRIORITY(JAXBElement<MXLongType> value) {
        this.wopriority = value;
    }

    /**
     * Gets the value of the worklocation property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORKLOCATION() {
        return worklocation;
    }

    /**
     * Sets the value of the worklocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORKLOCATION(MXStringType value) {
        this.worklocation = value;
    }

    /**
     * Gets the value of the workorderid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWORKORDERID() {
        return workorderid;
    }

    /**
     * Sets the value of the workorderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWORKORDERID(JAXBElement<MXLongType> value) {
        this.workorderid = value;
    }

    /**
     * Gets the value of the worktype property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORKTYPE() {
        return worktype;
    }

    /**
     * Sets the value of the worktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORKTYPE(MXStringType value) {
        this.worktype = value;
    }

    /**
     * Gets the value of the worts1 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORTS1() {
        return worts1;
    }

    /**
     * Sets the value of the worts1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORTS1(MXStringType value) {
        this.worts1 = value;
    }

    /**
     * Gets the value of the worts2 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORTS2() {
        return worts2;
    }

    /**
     * Sets the value of the worts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORTS2(MXStringType value) {
        this.worts2 = value;
    }

    /**
     * Gets the value of the worts3 property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getWORTS3() {
        return worts3;
    }

    /**
     * Sets the value of the worts3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setWORTS3(MXStringType value) {
        this.worts3 = value;
    }

    /**
     * Gets the value of the worts4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public JAXBElement<MXDateTimeType> getWORTS4() {
        return worts4;
    }

    /**
     * Sets the value of the worts4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     *     
     */
    public void setWORTS4(JAXBElement<MXDateTimeType> value) {
        this.worts4 = value;
    }

    /**
     * Gets the value of the worts5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public JAXBElement<MXDoubleType> getWORTS5() {
        return worts5;
    }

    /**
     * Sets the value of the worts5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXDoubleType }{@code >}
     *     
     */
    public void setWORTS5(JAXBElement<MXDoubleType> value) {
        this.worts5 = value;
    }

    /**
     * Gets the value of the wosequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public JAXBElement<MXLongType> getWOSEQUENCE() {
        return wosequence;
    }

    /**
     * Sets the value of the wosequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     *     
     */
    public void setWOSEQUENCE(JAXBElement<MXLongType> value) {
        this.wosequence = value;
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

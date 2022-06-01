/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diligent_mkt_ws;

import affected_services.AFFECTEDSERVICEAFFECTEDSERVICEType;
import affected_services.AFFECTEDSERVICESetType;
import affected_services.SyncAFFECTEDSERVICEResponseType;
import affected_services.SyncAFFECTEDSERVICEType;
import ibm_query.OperandModeType;
import ibm_query.QTT1INCIDENTType;
import ibm_query.QTT1QueryType;
import ibm_query.QueryQTT1ResponseType;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;

//import mk.telekom.it.oss.tt.services.stela_sync.TechnicalExceptionMessage;
/**
 *
 * @author nsofias
 */
public class Diligent_connector {

    public static String createIncident(String myDesc, String myDescLong, String device, String parent, String timestamp, int faultType, int impact, String myCorrelationId) {
        setSystemProperties();
        javax.xml.ws.Holder<TT_incident.EIMessageContext2> eiMessageContextHolder = new javax.xml.ws.Holder<>();
        javax.xml.ws.Holder<TT_incident.StelaSyncSynchResponse> myResponseHolder = new javax.xml.ws.Holder<>();
        //------------
        TT_incident.EIMessageContext2 eiMessageContext = new TT_incident.EIMessageContext2();
        eiMessageContext.setTarget("stela-sync");
        //eiMessageContext.setSender("mk.telekom.system.architecture.Diligent:TroubleTicket");
        eiMessageContext.setCorrelationId(myCorrelationId);
        eiMessageContextHolder.value = eiMessageContext;
        //-----------
        TT_incident.StelaSyncSynchRequest data = new TT_incident.StelaSyncSynchRequest();
        TT_incident.TTINCIDENTINCIDENTType myTTINCIDENTINCIDENTType = new TT_incident.TTINCIDENTINCIDENTType();
        //----AFFECTEDDATE------
        TimeStamp1 myTimeStamp = new TimeStamp1(timestamp);

        XMLGregorianCalendar myTimeDate = null;
        try {
            GregorianCalendar gregory = new GregorianCalendar();
            gregory.setTimeInMillis(myTimeStamp.getTimeInMillis());
            XMLGregorianCalendar myXMLGregorianCalendarStartDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
            myXMLGregorianCalendarStartDate.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
            myXMLGregorianCalendarStartDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
            myTimeDate = myXMLGregorianCalendarStartDate;
        } catch (DatatypeConfigurationException e) {
            new MailAlert().sendmailAlert("MY_Siebel_PROXY_SERVER error:", e);
            e.printStackTrace(System.out);
        }

        //----OPERATORNAME-----
        TT_incident.MXStringType OPERATORNAME = new TT_incident.MXStringType();
        OPERATORNAME.setValue("DILIGENT");
        myTTINCIDENTINCIDENTType.setOPERATORNAME(OPERATORNAME);//'DILIGENT'
        //----ORGID-----
        TT_incident.MXStringType ORGID = new TT_incident.MXStringType();
        ORGID.setValue("T_MKD");
        myTTINCIDENTINCIDENTType.setORGID(ORGID);// 'T_MKD'
        //----DESCRIPTION-----
        TT_incident.MXStringType DESCRIPTION = new TT_incident.MXStringType();
        DESCRIPTION.setValue(myDesc);
        myTTINCIDENTINCIDENTType.setDESCRIPTION(DESCRIPTION);
        //----DESCRIPTIONLONGDESCRIPTION-----
        TT_incident.MXStringType DESCRIPTIONLONGDESCRIPTION = new TT_incident.MXStringType();
        DESCRIPTIONLONGDESCRIPTION.setValue(myDescLong);
        myTTINCIDENTINCIDENTType.setDESCRIPTIONLONGDESCRIPTION(DESCRIPTIONLONGDESCRIPTION);
        //----SITEID-----
        TT_incident.MXStringType SITEID = new TT_incident.MXStringType();
        myTTINCIDENTINCIDENTType.setSITEID(SITEID);//'NMC_SCOPJE'
        //----URGENCY-----
        TT_incident.MXLongType URGENCY = new TT_incident.MXLongType();
        URGENCY.setValue(3);
        JAXBElement<TT_incident.MXLongType> myJAXBElement_URGENCY = new JAXBElement(new QName("http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", "URGENCY"), TT_incident.MXLongType.class, URGENCY);
        myTTINCIDENTINCIDENTType.setURGENCY(myJAXBElement_URGENCY);//3
        //-------------------------
        TT_incident.MXDateTimeType AFFECTEDDATE = new TT_incident.MXDateTimeType();
        AFFECTEDDATE.setValue(myTimeDate);
        JAXBElement<TT_incident.MXDateTimeType> myJAXBElement_AFFECTEDDATE = new JAXBElement(new QName("http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", "AFFECTEDDATE"), TT_incident.MXDateTimeType.class, AFFECTEDDATE);
        myTTINCIDENTINCIDENTType.setAFFECTEDDATE(myJAXBElement_AFFECTEDDATE);
        //----EXTSYSID-----
        TT_incident.MXStringType EXTSYSID = new TT_incident.MXStringType();
        EXTSYSID.setValue("DILIGENT");
        myTTINCIDENTINCIDENTType.setEXTSYSID(EXTSYSID);
        //----FAULTTYPE----------
        TT_incident.MXLongType FAULTTYPE = new TT_incident.MXLongType();
        FAULTTYPE.setValue(faultType);
        JAXBElement<TT_incident.MXLongType> myJAXBElement_FAULTTYPE = new JAXBElement(new QName("http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", "FAULTTYPE"), TT_incident.MXLongType.class, FAULTTYPE);
        myTTINCIDENTINCIDENTType.setFAULTTYPE(myJAXBElement_FAULTTYPE);
        //----IMPACT----------
        TT_incident.MXLongType IMPACT = new TT_incident.MXLongType();
        IMPACT.setValue(impact);
        JAXBElement<TT_incident.MXLongType> myJAXBElement_IMPACT = new JAXBElement(new QName("http://oss.it.telekom.mk/TroubleTicket/ibm/maximo", "IMPACT"), TT_incident.MXLongType.class, IMPACT);
        myTTINCIDENTINCIDENTType.setIMPACT(myJAXBElement_IMPACT);
        //----DEVICE-----
        TT_incident.MXStringType STRING2 = new TT_incident.MXStringType();
        STRING2.setValue(device);
        myTTINCIDENTINCIDENTType.setSTRING2(STRING2);
        //----LINISKAOPREMA-----
        TT_incident.MXStringType LINISKAOPREMA = new TT_incident.MXStringType();
        LINISKAOPREMA.setValue(parent);
        myTTINCIDENTINCIDENTType.setLINISKAOPREMA(LINISKAOPREMA);
        myTTINCIDENTINCIDENTType.setCREATIONDATE(null);
        //====================================
        TT_incident.SyncTTINCIDENTType mySyncTTINCIDENTType = new TT_incident.SyncTTINCIDENTType();
        TT_incident.TTINCIDENTSetType myTTINCIDENTSetType = new TT_incident.TTINCIDENTSetType();
        myTTINCIDENTSetType.getINCIDENT().add(myTTINCIDENTINCIDENTType);
        mySyncTTINCIDENTType.setTTINCIDENTSet(myTTINCIDENTSetType);
        //mySyncTTINCIDENTType.setCreationDateTime(myTimeDate);
        data.setSyncSTELLA(mySyncTTINCIDENTType);
        //
        TT_incident.StelaSyncSynchResponse myResponse = new TT_incident.StelaSyncSynchResponse();
        myResponseHolder.value = myResponse;
        try {
            //***********************************************************
            TT_incident.StelaSyncService service = new TT_incident.StelaSyncService();
            TT_incident.StelaSync port = service.getStelaSync();
            port.syncTTINCIDENT(eiMessageContextHolder, data, myResponseHolder);
            //*********************************************
            TT_incident.StelaSyncSynchResponse myResponse1 = myResponseHolder.value;
            return myResponse1.getSyncSTELLAResponse().getTTINCIDENTSet().getINCIDENT().get(0).getTICKETID().getValue();
        } catch (TT_incident.TechnicalExceptionMessage e) {
            e.printStackTrace(System.out);
            System.out.println("createIncident error:" + e.getFaultInfo().getDescription().get(0).getValue());
        }
        return null;
    }

    public static SyncAFFECTEDSERVICEResponseType appendToIncident(String ticketId, String startDate, String endDate, String cinum, String description, String region, String serviveInFault, long internet, long iptv, long voip, long adsl, long wlr, long impact) throws Exception {
        setSystemProperties();
        SyncAFFECTEDSERVICEType parameters = new SyncAFFECTEDSERVICEType();
        AFFECTEDSERVICEAFFECTEDSERVICEType myElement = new AFFECTEDSERVICEAFFECTEDSERVICEType();
        AFFECTEDSERVICESetType mySyncAFFECTEDSERVICEType = new AFFECTEDSERVICESetType();
        mySyncAFFECTEDSERVICEType.getAFFECTEDSERVICE().add(myElement);
        parameters.setAFFECTEDSERVICESet(mySyncAFFECTEDSERVICEType);
        //-------   STARTDATE -------------
        try {
            TimeStamp1 myTimeStamp1 = new TimeStamp1(startDate);
            affected_services.MXDateTimeType STARTDATE = new affected_services.MXDateTimeType();
            XMLGregorianCalendar myTimeDate;
            GregorianCalendar gregory = new GregorianCalendar();
            gregory.setTimeInMillis(myTimeStamp1.getTimeInMillis());
            XMLGregorianCalendar myXMLGregorianCalendarStartDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
            myXMLGregorianCalendarStartDate.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
            myXMLGregorianCalendarStartDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
            myTimeDate = myXMLGregorianCalendarStartDate;
            STARTDATE.setValue(myTimeDate);
            JAXBElement<affected_services.MXDateTimeType> myJAXBElement_STARTDATE = new JAXBElement(new QName("http://www.ibm.com/maximo", "STARTDATE"), affected_services.MXDateTimeType.class, STARTDATE);
            myElement.setSTARTDATE(myJAXBElement_STARTDATE);
        } catch (Exception e) {
            new MailAlert().sendmailAlert("MY_Siebel_PROXY_SERVER error:", e);
            e.printStackTrace(System.out);
        }
        //---------- DESCRIPTION -------------------
        affected_services.MXStringType DESCRIPTION = new affected_services.MXStringType();
        DESCRIPTION.setValue(description);
        myElement.setDESCRIPTION(DESCRIPTION);
        //---------- CINUM -------------------
        affected_services.MXStringType CINUM = new affected_services.MXStringType();
        CINUM.setValue(cinum);
        myElement.setCINUM(CINUM);
        //----- REGION ------------------------
        affected_services.MXStringType REGION = new affected_services.MXStringType();
        REGION.setValue(region);
        myElement.setREGION(REGION);
        //----------- SERVICEINFAULT ----------------
        affected_services.MXStringType SERVICEINFAULT = new affected_services.MXStringType();
        SERVICEINFAULT.setValue(serviveInFault);
        myElement.setSERVICEINFAULT(SERVICEINFAULT);

        //-   SYSSTATUS
        affected_services.MXStringType SYSSTATUS = new affected_services.MXStringType();
        SYSSTATUS.setValue("Active");
        myElement.setSYSSTATUS(SYSSTATUS);
        //-  NUMINTERNET
        affected_services.MXLongType NUMINTERNET = new affected_services.MXLongType();
        NUMINTERNET.setValue(internet);
        JAXBElement<affected_services.MXLongType> myJAXBElement_NUMINTERNET = new JAXBElement(new QName("http://www.ibm.com/maximo", "NUMINTERNET"), affected_services.MXLongType.class, NUMINTERNET);
        myElement.setNUMINTERNET(myJAXBElement_NUMINTERNET);
        //-  NUMIPTV
        affected_services.MXLongType NUMIPTV = new affected_services.MXLongType();
        NUMIPTV.setValue(iptv);
        JAXBElement<affected_services.MXLongType> myJAXBElement_NUMIPTV = new JAXBElement(new QName("http://www.ibm.com/maximo", "NUMIPTV"), affected_services.MXLongType.class, NUMIPTV);
        myElement.setNUMIPTV(myJAXBElement_NUMIPTV);
        //-  NUMVOIP
        affected_services.MXLongType NUMVOIP = new affected_services.MXLongType();
        NUMVOIP.setValue(voip);
        JAXBElement<affected_services.MXLongType> myJAXBElement_NUMVOIP = new JAXBElement(new QName("http://www.ibm.com/maximo", "NUMVOIP"), affected_services.MXLongType.class, NUMVOIP);
        myElement.setNUMVOIP(myJAXBElement_NUMVOIP);
        //-  NUMOFIMPACTEDCUST
        affected_services.MXLongType NUMOFIMPACTEDCUST = new affected_services.MXLongType();
        NUMOFIMPACTEDCUST.setValue(impact);
        JAXBElement<affected_services.MXLongType> myJAXBElement_NUMOFIMPACTEDCUST = new JAXBElement(new QName("http://www.ibm.com/maximo", "NUMOFIMPACTEDCUST"), affected_services.MXLongType.class, NUMOFIMPACTEDCUST);
        myElement.setNUMOFIMPACTEDCUST(myJAXBElement_NUMOFIMPACTEDCUST);
        //-  NUMADSL
        affected_services.MXLongType NUMADSL = new affected_services.MXLongType();
        NUMADSL.setValue(adsl);
        JAXBElement<affected_services.MXLongType> myJAXBElement_NUMADSL = new JAXBElement(new QName("http://www.ibm.com/maximo", "NUMADSL"), affected_services.MXLongType.class, NUMADSL);
        myElement.setNUMADSL(myJAXBElement_NUMADSL);
        //-  NUMWLR
        affected_services.MXLongType NUMWLR = new affected_services.MXLongType();
        NUMWLR.setValue(wlr);
        JAXBElement<affected_services.MXLongType> myJAXBElement_NUMWLR = new JAXBElement(new QName("http://www.ibm.com/maximo", "NUMWLR"), affected_services.MXLongType.class, NUMWLR);
        myElement.setNUMWLR(myJAXBElement_NUMWLR);
        //-   TICKETID
        affected_services.MXStringType TICKETID = new affected_services.MXStringType();
        TICKETID.setValue(ticketId);
        myElement.setTICKETID(TICKETID);
        //------------------------ syncAFFECTEDSERVICE ----------------------------------------------------------
        affected_services.EXTSYS2AFFECTEDSERVICE service = new affected_services.EXTSYS2AFFECTEDSERVICE();
        affected_services.EXTSYS2AFFECTEDSERVICEPortType port = service.getEXTSYS2AFFECTEDSERVICESOAP11Port();

        //((BindingProvider) port).getRequestContext().put(JAXWSProperties.WSENDPOINT, "https://10.232.58.147/mk.telekom.system.architecture.Diligent.ManageServices.AFFECTEDSERVICEPortType");
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://10.232.58.147/mk.telekom.system.architecture.Diligent.ManageServices.AFFECTEDSERVICEPortType");
        return port.syncAFFECTEDSERVICE(parameters);
    }

    public static SyncAFFECTEDSERVICEResponseType updateIncident(String ticketId, String endDate, String affServiceID) throws Exception {
        System.out.println("updateIncident: endDate=" + endDate + " for ticket" + ticketId + " affServiceID" + affServiceID);
        setSystemProperties();
        SyncAFFECTEDSERVICEType parameters = new SyncAFFECTEDSERVICEType();
        AFFECTEDSERVICEAFFECTEDSERVICEType myElement = new AFFECTEDSERVICEAFFECTEDSERVICEType();
        AFFECTEDSERVICESetType mySyncAFFECTEDSERVICEType = new AFFECTEDSERVICESetType();
        mySyncAFFECTEDSERVICEType.getAFFECTEDSERVICE().add(myElement);
        //------------  affServiceID ----
        long affServiceID_l = Long.parseLong(affServiceID);
        affected_services.MXLongType AFFECTEDSERVICEID = new affected_services.MXLongType();
        AFFECTEDSERVICEID.setValue(affServiceID_l);
        JAXBElement<affected_services.MXLongType> myJAXBElement_AFFECTEDSERVICEID = new JAXBElement(new QName("http://www.ibm.com/maximo", "AFFECTEDSERVICEID"), affected_services.MXLongType.class, AFFECTEDSERVICEID);
        myElement.setAFFECTEDSERVICEID(myJAXBElement_AFFECTEDSERVICEID);
        //-----------
        parameters.setAFFECTEDSERVICESet(mySyncAFFECTEDSERVICEType);
        //-   ENDDATE           
        try {
            TimeStamp1 myTimeStamp1 = new TimeStamp1(endDate);
            affected_services.MXDateTimeType ENDDATE = new affected_services.MXDateTimeType();
            XMLGregorianCalendar myTimeDate;
            GregorianCalendar gregory = new GregorianCalendar();
            gregory.setTimeInMillis(myTimeStamp1.getTimeInMillis());
            XMLGregorianCalendar myXMLGregorianCalendarStartDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
            myXMLGregorianCalendarStartDate.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
            myXMLGregorianCalendarStartDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
            myTimeDate = myXMLGregorianCalendarStartDate;
            ENDDATE.setValue(myTimeDate);
            JAXBElement<affected_services.MXDateTimeType> myJAXBElement_ENDDATE = new JAXBElement(new QName("http://www.ibm.com/maximo", "ENDDATE"), affected_services.MXDateTimeType.class, ENDDATE);
            myElement.setENDDATE(myJAXBElement_ENDDATE);
        } catch (Exception e) {
            new MailAlert().sendmailAlert("updateIncident:myElement.setENDDATE error:", e);
            e.printStackTrace(System.out);
        }
        //-   SYSSTATUS
        affected_services.MXStringType SYSSTATUS = new affected_services.MXStringType();
        SYSSTATUS.setValue("Update");
        myElement.setSYSSTATUS(SYSSTATUS);
        //-   ONETMID
        /*
        affected_services.MXStringType ONETMID = new affected_services.MXStringType();
        ONETMID.setValue("");
        myElement.setONETMID(ONETMID);*/
        //-   TICKETID
        affected_services.MXStringType TICKETID = new affected_services.MXStringType();
        TICKETID.setValue(ticketId);
        myElement.setTICKETID(TICKETID);
        //------------------------ syncAFFECTEDSERVICE ----------------------------------------------------------        
        affected_services.EXTSYS2AFFECTEDSERVICE service = new affected_services.EXTSYS2AFFECTEDSERVICE();
        affected_services.EXTSYS2AFFECTEDSERVICEPortType port = service.getEXTSYS2AFFECTEDSERVICESOAP11Port();
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://10.232.58.147/mk.telekom.system.architecture.Diligent.ManageServices.AFFECTEDSERVICEPortType");
        return port.syncAFFECTEDSERVICE(parameters);
    }

    //javax.xml.ws.Holder<crm.EIMessageContext2> eiMessageContext, crm.MarkAffectedType data, javax.xml.ws.Holder<crm.MarkAffectedResponseType> data0
    public static int markAffected(String myCorrelationId, String SR, ArrayList<String> lineIDs, String description, String alarmReason) throws Exception {
        setSystemProperties();
        crm.EIMessageContext2 myEIMessageContext = new crm.EIMessageContext2();
        javax.xml.ws.Holder<crm.EIMessageContext2> eiMessageContextHolder = new javax.xml.ws.Holder<>();
        eiMessageContextHolder.value = myEIMessageContext;
        myEIMessageContext.setCorrelationId(myCorrelationId);
        //
        crm.MarkAffectedType data = new crm.MarkAffectedType();
        if (SR != null && SR.length() > 3) {
            SR = SR.substring(3);
            data.setGroupingTicketIncidentID(Integer.valueOf(SR));
        }

        crm.MainProductsbyLineID myMainProductsbyLineID = new crm.MainProductsbyLineID();
        myMainProductsbyLineID.getVALUE().addAll(lineIDs);
        data.setAffectedMainProductsbyLineID(myMainProductsbyLineID);
        // -------------- at the moment use always massive----------
        //data.setDefectiveType(alarmReason);//Massive,Maintenance,Null
        data.setDefectiveType("Massive");
        data.setDescription(description);
        //------
        crm.MarkAffectedResponseType myMarkAffectedResponseType = new crm.MarkAffectedResponseType();
        javax.xml.ws.Holder<crm.MarkAffectedResponseType> myMarkAffectedResponseTypeHolder = new javax.xml.ws.Holder<>();
        myMarkAffectedResponseTypeHolder.value = myMarkAffectedResponseType;
        //---------
        crm.CRMDiligentPortTypeService service = new crm.CRMDiligentPortTypeService();
        crm.CRMDiligentPortType port = service.getCRMDiligentPortType();
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://10.232.58.147/mk.telekom.system.architecture.Diligent.CRM.CRMDiligentPortType");
        port.markAffected(eiMessageContextHolder, data, myMarkAffectedResponseTypeHolder);
        //-------------------------
        crm.MarkAffectedResponseType myResponse = myMarkAffectedResponseTypeHolder.value;
        System.out.println("markAffected:" + myResponse.getTransactionID());
        return myResponse.getTransactionID();
    }

    //javax.xml.ws.Holder<crm.EIMessageContext2> eiMessageContext, crm.ReleaseAffectedType data, javax.xml.ws.Holder<crm.ReleaseAffectedResponseType> data0
    public static int releaseAffected(String myCorrelationId, String SR, ArrayList<String> lineIDs) throws Exception {
        setSystemProperties();
        crm.EIMessageContext2 myEIMessageContext = new crm.EIMessageContext2();
        javax.xml.ws.Holder<crm.EIMessageContext2> eiMessageContextHolder = new javax.xml.ws.Holder<>();
        eiMessageContextHolder.value = myEIMessageContext;
        myEIMessageContext.setCorrelationId(myCorrelationId);
        //
        crm.ReleaseAffectedType data = new crm.ReleaseAffectedType();
        if (SR != null && SR.length() > 3) {
            SR = SR.substring(3);
            data.setGroupingTicketIncidentID(Integer.valueOf(SR));
        }
        crm.MainProductsbyLineID myMainProductsbyLineID = new crm.MainProductsbyLineID();
        myMainProductsbyLineID.getVALUE().addAll(lineIDs);
        data.setAffectedMainProductsbyLineID(myMainProductsbyLineID);
        //------
        crm.ReleaseAffectedResponseType myReleaseAffectedResponseType = new crm.ReleaseAffectedResponseType();
        javax.xml.ws.Holder<crm.ReleaseAffectedResponseType> myReleaseAffectedResponseTypeHolder = new javax.xml.ws.Holder<>();
        myReleaseAffectedResponseTypeHolder.value = myReleaseAffectedResponseType;
        //------------------------------
        crm.CRMDiligentPortTypeService service = new crm.CRMDiligentPortTypeService();
        crm.CRMDiligentPortType port = service.getCRMDiligentPortType();
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://10.232.58.147/mk.telekom.system.architecture.Diligent.CRM.CRMDiligentPortType");
        port.releaseAffected(eiMessageContextHolder, data, myReleaseAffectedResponseTypeHolder);
        //------------------------------------
        crm.ReleaseAffectedResponseType myResponse = myReleaseAffectedResponseTypeHolder.value;
        System.out.println("releaseAffected:" + myResponse.getTransactionID());
        return myResponse.getTransactionID();
    }

    public static String syncCUSTOMERLINEID(String ticketId, String endDate, ArrayList<String> lineIDs) throws customerLineService.TechnicalExceptionMessage {
        setSystemProperties();
        //-   ENDDATE   
        JAXBElement<customerLineService.MXDateTimeType> myJAXBElement_ENDDATE = null;
        try {
            TimeStamp1 myTimeStamp1 = new TimeStamp1(endDate);
            customerLineService.MXDateTimeType ENDDATE = new customerLineService.MXDateTimeType();
            XMLGregorianCalendar myTimeDate;
            GregorianCalendar gregory = new GregorianCalendar();
            gregory.setTimeInMillis(myTimeStamp1.getTimeInMillis());
            XMLGregorianCalendar myXMLGregorianCalendarStartDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
            myXMLGregorianCalendarStartDate.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
            myXMLGregorianCalendarStartDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
            myTimeDate = myXMLGregorianCalendarStartDate;
            ENDDATE.setValue(myTimeDate);
            myJAXBElement_ENDDATE = new JAXBElement(new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "ENDDATE"), customerLineService.MXDateTimeType.class, ENDDATE);
        } catch (DatatypeConfigurationException e) {
            new MailAlert().sendmailAlert("updateIncident:myElement.setENDDATE error:", e);
            e.printStackTrace(System.out);
        }
        customerLineService.EIMessageContext2 myEIMessageContext = new customerLineService.EIMessageContext2();
        javax.xml.ws.Holder<customerLineService.EIMessageContext2> myMessageContextHolder = new javax.xml.ws.Holder<>();
        myEIMessageContext.setCorrelationId(ticketId);
        myMessageContextHolder.value = myEIMessageContext;
        //--------------------------
        customerLineService.SyncCUSTOMERLINEIDType data = new customerLineService.SyncCUSTOMERLINEIDType();
        customerLineService.CUSTOMERLINEIDSetType mySyncCUSTOMERLINEIDType = new customerLineService.CUSTOMERLINEIDSetType();
        for (String line : lineIDs) {
            customerLineService.CUSTOMERLINEIDCUSTOMERLINEIDType myCUSTOMERLINEIDCUSTOMERLINEIDType = new customerLineService.CUSTOMERLINEIDCUSTOMERLINEIDType();
            customerLineService.MXStringType LINEID = new customerLineService.MXStringType();
            LINEID.setValue(line);
            myCUSTOMERLINEIDCUSTOMERLINEIDType.setLINEID(LINEID);
            customerLineService.MXStringType TICKETID = new customerLineService.MXStringType();
            TICKETID.setValue(ticketId);
            myCUSTOMERLINEIDCUSTOMERLINEIDType.setTICKETID(TICKETID);
            myCUSTOMERLINEIDCUSTOMERLINEIDType.setENDTIME(myJAXBElement_ENDDATE);
            mySyncCUSTOMERLINEIDType.getCUSTOMERLINEID().add(myCUSTOMERLINEIDCUSTOMERLINEIDType);
        }
        data.setCUSTOMERLINEIDSet(mySyncCUSTOMERLINEIDType);
        //--------------------------
        customerLineService.SyncCUSTOMERLINEIDResponseType myResponse = new customerLineService.SyncCUSTOMERLINEIDResponseType();
        javax.xml.ws.Holder<customerLineService.SyncCUSTOMERLINEIDResponseType> myResponseHolder = new javax.xml.ws.Holder<>();
        myResponseHolder.value = myResponse;
        //--------------------------
        customerLineService.CustomerLineServicePortTypeService service = new customerLineService.CustomerLineServicePortTypeService();
        customerLineService.CustomerLineServicePortType port = service.getCustomerLineServicePortType();
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://10.232.58.147/mk.telekom.system.architecture.Diligent.TroubleTicket.CustomerLineServicePortType");
        port.syncCUSTOMERLINEID(myMessageContextHolder, data, myResponseHolder);
        String res = myResponseHolder.value.getMessageID();
        System.out.println("syncCUSTOMERLINEID:" + res);
        return res;
    }

    public static String getExternalIncident(String affService) throws Exception {
        setSystemProperties();
        ibm_query.QueryQTT1Type parameters = new ibm_query.QueryQTT1Type();
        QTT1QueryType myQTT1QueryType = new QTT1QueryType();
        myQTT1QueryType.setOperandMode(OperandModeType.AND);
        //myQTT1QueryType.setWHERE("historyflag=0 and cinum='" + cinum + "'");
        myQTT1QueryType.setWHERE("historyflag=0 and ACTUALFINISH is null and (exists (select 1 from affectedservice where cinum=upper('" + affService + "') and enddate is null and affectedservice.ticketid=incident.ticketid) )");
        parameters.setQTT1Query(myQTT1QueryType);
        ibm_query.EXTSYS2QTT1 service = new ibm_query.EXTSYS2QTT1();
        ibm_query.EXTSYS2QTT1PortType port = service.getEXTSYS2QTT1SOAP11Port();
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://10.232.58.147/mk.telekom.system.architecture.Diligent.TroubleTicket.QTT1DiligentPortType");
        QueryQTT1ResponseType myQueryQTT1ResponseType = port.queryQTT1(parameters);
        for (QTT1INCIDENTType myQTT1INCIDENTType : myQueryQTT1ResponseType.getQTT1Set().getINCIDENT()) {
            if (myQTT1INCIDENTType.getDESCRIPTION() != null) {
                System.out.println("DESCRIPTION = " + myQTT1INCIDENTType.getDESCRIPTION().getValue());//ОТСТРАНЕТА ПРЕЧКА=closed, ТЕКОВНА ПРЕЧКА – НОВА=open          
            }            //DESCRIPTION = Diligent - RSU(S) alarm
            if (myQTT1INCIDENTType.getTICKETID() != null) {
                System.out.println("getTICKETID = " + myQTT1INCIDENTType.getTICKETID().getValue());
            }
            if (myQTT1INCIDENTType.getDESCRIPTION() != null && !myQTT1INCIDENTType.getDESCRIPTION().getValue().contains("Diligent")) {
                return myQTT1INCIDENTType.getTICKETID().getValue();
            }
        }
        return null;
    }
    
    public static String getAlreadyOpenIncident(String affService) throws Exception {
        setSystemProperties();
        ibm_query.QueryQTT1Type parameters = new ibm_query.QueryQTT1Type();
        QTT1QueryType myQTT1QueryType = new QTT1QueryType();
        myQTT1QueryType.setOperandMode(OperandModeType.AND);
        //myQTT1QueryType.setWHERE("historyflag=0 and cinum='" + cinum + "'");
        myQTT1QueryType.setWHERE("historyflag=0 and ACTUALFINISH is null and (exists (select 1 from affectedservice where cinum=upper('" + affService + "') and enddate is null and affectedservice.ticketid=incident.ticketid) )");
        parameters.setQTT1Query(myQTT1QueryType);
        ibm_query.EXTSYS2QTT1 service = new ibm_query.EXTSYS2QTT1();
        ibm_query.EXTSYS2QTT1PortType port = service.getEXTSYS2QTT1SOAP11Port();
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://10.232.58.147/mk.telekom.system.architecture.Diligent.TroubleTicket.QTT1DiligentPortType");
        QueryQTT1ResponseType myQueryQTT1ResponseType = port.queryQTT1(parameters);
        for (QTT1INCIDENTType myQTT1INCIDENTType : myQueryQTT1ResponseType.getQTT1Set().getINCIDENT()) {
            if (myQTT1INCIDENTType.getDESCRIPTION() != null) {
                System.out.println("DESCRIPTION = " + myQTT1INCIDENTType.getDESCRIPTION().getValue());//ОТСТРАНЕТА ПРЕЧКА=closed, ТЕКОВНА ПРЕЧКА – НОВА=open          
            }            //DESCRIPTION = Diligent - RSU(S) alarm
            if (myQTT1INCIDENTType.getTICKETID() != null) {
                System.out.println("getTICKETID = " + myQTT1INCIDENTType.getTICKETID().getValue());
            }
            if (myQTT1INCIDENTType.getDESCRIPTION() != null) {
                return myQTT1INCIDENTType.getTICKETID().getValue();
            }
        }
        return null;
    }    

//*****************************************************
    public static String bulletinSearch(String cinum) {
        try {
            System.out.println("bulletinSearch:cinum to find = " + cinum);
            setSystemProperties();
            diligent_mkt_ws.DiligentService service = new diligent_mkt_ws.DiligentService();
            diligent_mkt_ws.Application port = service.getApplication();
            Map<String, Object> reqContext = ((BindingProvider) port).getRequestContext();
            reqContext.put(BindingProvider.USERNAME_PROPERTY, "diligent");
            reqContext.put(BindingProvider.PASSWORD_PROPERTY, "Tril1g3nt");
            ANNOUNCEMENTSALL myANNOUNCEMENTSALL = port.bulletinSearch(null);
            List<diligent_mkt_ws.ANNOUNCEMENTS> myANNOUNCEMENTS = myANNOUNCEMENTSALL.getRECORDS().getValue().getANNOUNCEMENTS();
            System.out.println("bulletinSearch:cinum list size for " + cinum + " is " + myANNOUNCEMENTS.size());
            for (diligent_mkt_ws.ANNOUNCEMENTS myANNOUNCEMENT : myANNOUNCEMENTS) {
                CinumsAllArray myCinumsAllArray = myANNOUNCEMENT.getCinums().getValue();
                List<CinumsAll> myCinumsAll = myCinumsAllArray.getCinumsAll();
                for (CinumsAll myCinum : myCinumsAll) {
                    try {
                        String cinum_found = myCinum.getCinum().getValue();
                        if (cinum.toUpperCase().contains(cinum_found.toUpperCase())) {
                            System.out.println("bulletinSearch:cinum_found = " + cinum_found);
                            return myANNOUNCEMENT.getBulletinid().getValue();
                        }
                    } catch (Exception e) {
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("bulletinSearch error: = " + e.toString() + " for cinum:" + cinum);
            new MailAlert().sendmailAlert("bulletinSearch error for cinum:" + cinum, e);
            e.printStackTrace(System.out);
        }
        return null;
    }

    private static void setSystemProperties() {
        String certificates_dir = System.getenv("APPLICATIONS_PATH") + "/certificates/";
        System.setProperty("javax.net.ssl.trustStore", certificates_dir + "diligent-prod-keystore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.setProperty("javax.net.ssl.keyStore", certificates_dir + "diligent-prod-keystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
        System.setProperty("http.proxyHost", "");
        System.setProperty("https.proxyHost", "");
        System.setProperty("http.proxyPort", "");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//SKOPJE : CENTAR : CENTAR16 : 11

        String timestamp = new TimeStamp1().getNowUnformated();
        try {
            //String myDesc = "Anomaly:SIGNATURE_1 - DSLAM SLOT(S) alarm";
            //String myDescLong = "CE-OLT-20:0-7-13";
            //String device = "CE-OLT-20";
            //String slotDevice = "CE-OLT-20:0-7-13";
            //String res = createIncident( myDesc,  myDescLong,  device, slotDevice, "20220317T101010.000", 36, 3, "xxxxx");
            //System.out.println("res="+res);
            System.out.println("ExternalIncident=" + Diligent_connector.getAlreadyOpenIncident("OS_Veles_Ivankovci"));

            //String res = syncCUSTOMERLINEID("INCMYTEST", "20191108T101010.000", activelinesArray);
            //System.out.println("res = " + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

/*
    
    private static QueryQTT1ResponseType queryQTT1_By_incident(String incID) {
        setSystemProperties();
        ibm_query.QueryQTT1Type parameters = new ibm_query.QueryQTT1Type();
        QTT1QueryType myQTT1QueryType = new QTT1QueryType();
        myQTT1QueryType.setOperandMode(OperandModeType.AND);
        myQTT1QueryType.setWHERE("historyflag=0 and ticketid='" + incID + "'");
        parameters.setQTT1Query(myQTT1QueryType);
        ibm_query.EXTSYS2QTT1 service = new ibm_query.EXTSYS2QTT1();
        ibm_query.EXTSYS2QTT1PortType port = service.getEXTSYS2QTT1SOAP11Port();
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://10.232.58.147/mk.telekom.system.architecture.Diligent.TroubleTicket.QTT1DiligentPortType");
        return port.queryQTT1(parameters);
    }
    
    private static QueryBULLETINBOARDResponseType queryBULLETINBOARD()
        {
        setSystemProperties();
        String myCINUM = "OS_STRUMICA_DOBROSINCI";
//------------------------------        
        bulleting.QueryBULLETINBOARDType parameters = new bulleting.QueryBULLETINBOARDType();
        BULLETINBOARDQueryType myBULLETINBOARDQuery = new BULLETINBOARDQueryType();
        myBULLETINBOARDQuery.setWHERE("historyflag=0 and cinum='BOGDANCI_1'");//historyflag=0 and cinum='BOGDANCI_1'
        parameters.setBULLETINBOARDQuery(myBULLETINBOARDQuery);
        //-----------
        bulleting.EXTSYS2BULLETINBOARD service = new bulleting.EXTSYS2BULLETINBOARD();
        bulleting.EXTSYS2BULLETINBOARDPortType port = service.getEXTSYS2BULLETINBOARDSOAP11Port();
        QueryBULLETINBOARDResponseType response = port.queryBULLETINBOARD(parameters);
        //------
        System.out.println("MessageID = " + response.getMessageID());
        for (BULLETINBOARDBULLETINBOARDType myBULLETINBOARD : response.getBULLETINBOARDSet().getBULLETINBOARD())
            {
            System.out.println("MESSAGE = " + myBULLETINBOARD.getMESSAGE().getValue());
            }
        return port.queryBULLETINBOARD(parameters);
        }*/

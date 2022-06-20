/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svt_mkt_ws;

import SVT_MKT_ws1.TechnicalExceptionMessage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import nsofiasLib.others.Helpme;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.URLContextReader_object;

/**
 *
 * @author nsofias
 */
public class SVT_MKT_ws {

    /*
SERVICE_POINT
myORDER_ID
PRODUCT_ID
PROD_NAME
DATE_MODIFIED
DONE
CUSTOMER_ID
ORDER_LINE_TYPE
CUSTOMER_CONTACT
REMARK
    MSISDN
     */
    public static String createCustomerIssue(String myCUSTOMER_ID, String myPRODUCT_ID, String myORDER_ID, String myORDER_LINE_TYPE, String myCUSTOMER_CONTACT, String myREMARK, String MSISDN) throws Exception {
        String INCIDENTID = hasCustomerIndividualFault(MSISDN);
        if (INCIDENTID == null) {
            svt_mkt_ws.EIMessageContext2 myContext = new svt_mkt_ws.EIMessageContext2();
            myContext.setTarget("IDiligentWS");
            myContext.setSender("sndr:mk.telekom.system.architecture.Diligent:CRM");
            myContext.setCorrelationId(new TimeStamp1().getNowUnformated());
            //
            javax.xml.ws.Holder<svt_mkt_ws.EIMessageContext2> eiMessageContextHolder = new javax.xml.ws.Holder<>();
            eiMessageContextHolder.value = myContext;
            //**************************************
            svt_mkt_ws.CreateCustomerIssueRequestData createCustomerIssueRequestData = new svt_mkt_ws.CreateCustomerIssueRequestData();
            CustomerIssueModel myCustomerIssueModel = new CustomerIssueModel();
            //myCustomerIssueModel.setId("");
            myCustomerIssueModel.setName("IVR PRECKA - " + MSISDN);
            myCustomerIssueModel.setCreatedBy("5d73ed41-7af5-5cc0-b2b2-5d0b2f49e9eb");
            myCustomerIssueModel.setDescription(myREMARK);
            myCustomerIssueModel.setDeleted(0);
            myCustomerIssueModel.setFaultType("1");
            myCustomerIssueModel.setCustomerId(myCUSTOMER_ID);
            myCustomerIssueModel.setProductId(myPRODUCT_ID);
            myCustomerIssueModel.setReason("Проблем после ново барање - автоматска дијагностика");
            /*
            if (myCUSTOMER_CONTACT != null)
                {
                myCustomerIssueModel.setContactPhone(myCUSTOMER_CONTACT);
                }
            else*/
            {
                myCustomerIssueModel.setContactPhone("38970000000");//DUMMY number 
            }
            myCustomerIssueModel.setSendSms("1");
            myCustomerIssueModel.setStatus("1");
            //myCustomerIssueModel.setReason("");
            myCustomerIssueModel.setServiceInFault("20");
            myCustomerIssueModel.setOperatorId("diligent@telekom.mk");
            createCustomerIssueRequestData.setCustomerIssueModel(myCustomerIssueModel);
            //---- date entered -------
            TimeStamp1 myTimeStamp = new TimeStamp1();
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
            myCustomerIssueModel.setDateEntered(myTimeDate);
            //--------
            svt_mkt_ws.CreateCustomerIssueResponseData myResponseData = new svt_mkt_ws.CreateCustomerIssueResponseData();
            javax.xml.ws.Holder<svt_mkt_ws.CreateCustomerIssueResponseData> createCustomerIssueResponseDataHolder = new javax.xml.ws.Holder<>();
            createCustomerIssueResponseDataHolder.value = myResponseData;
            //
            svt_mkt_ws.IDiligentWSService service = new svt_mkt_ws.IDiligentWSService();
            svt_mkt_ws.IDiligentWS port = service.getIDiligentWS();
            System.setProperty("http.proxyHost", "");
            System.setProperty("http.proxyPort", "");
            port.createCustomerIssue(eiMessageContextHolder, createCustomerIssueRequestData, createCustomerIssueResponseDataHolder);
            //
            return createCustomerIssueResponseDataHolder.value.getValidationModel().getResponseReason();
        } else {
            return "INCIDENT_FOUND:" + INCIDENTID + " found for this customer";
        }
    }

    private static String hasCustomerIndividualFault(String MSISDN) throws TechnicalExceptionMessage {
        javax.xml.ws.Holder<SVT_MKT_ws1.EIMessageContext2> eiMessageContext = new javax.xml.ws.Holder<>();
        SVT_MKT_ws1.EIMessageContext2 myEIMessageContext2 = new SVT_MKT_ws1.EIMessageContext2();
        myEIMessageContext2.setTarget("IDiligentWS");
        myEIMessageContext2.setSender("sndr:mk.telekom.system.architecture.Diligent:CRM");
        myEIMessageContext2.setCorrelationId(new TimeStamp1().getNowUnformated());
        eiMessageContext.value = myEIMessageContext2;
        //
        SVT_MKT_ws1.HasCustomerIndividualFaultType data = new SVT_MKT_ws1.HasCustomerIndividualFaultType();
        data.setMSISDN(MSISDN);
        javax.xml.ws.Holder<SVT_MKT_ws1.HasCustomerIndividualFaultResponseType> data0 = new javax.xml.ws.Holder<>();
        SVT_MKT_ws1.HasCustomerIndividualFaultResponseType myHasCustomerIndividualFaultResponseType = new SVT_MKT_ws1.HasCustomerIndividualFaultResponseType();
        data0.value = myHasCustomerIndividualFaultResponseType;
        //-----------------
        SVT_MKT_ws1.CRMDiligentPortTypeService service = new SVT_MKT_ws1.CRMDiligentPortTypeService();
        SVT_MKT_ws1.CRMDiligentPortType port = service.getCRMDiligentPortType();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        port.hasCustomerIndividualFault(eiMessageContext, data, data0);
        String INCIDENTID = data0.value.getINCIDENTID();
        String REASONCODE = data0.value.getREASONCODE();
        System.out.println(" INCIDENTID=:" + INCIDENTID + " REASONCODE=:" + REASONCODE);
        return INCIDENTID;
    }

    /*
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:diag="http://servicediagnostictool.telekom.mk/service/diagnostic" xmlns:dat="http://messaging.ei.tmobile.net/datatypes" xmlns:diag1="http://servicediagnostictool.telekom.mk/datatypes/diagnostic">
   <soapenv:Header/>
   <soapenv:Body>
      <diag:CheckLineService>
         <diag:eiMessageContext>
            <!--Optional:-->
            <dat:target>DiagnosticServicePortType</dat:target>
              <dat:timeLeft>60000</dat:timeLeft>
            <dat:sender>mk.telekom.system.architecture.Diligent:Diagnostic</dat:sender>
            <dat:correlationId>corr_123456</dat:correlationId>
         </diag:eiMessageContext>
         <diag:data>
            <!--Optional:-->
            <diag1:LineID>LINIJA_XXXXXX</diag1:LineID>
         </diag:data>
      </diag:CheckLineService>
   </soapenv:Body>
</soapenv:Envelope>
     */
    public static String checkLineService(String lineId) throws svt_tool.TechnicalExceptionMessage {
        setSystemProperties();
        javax.xml.ws.Holder<svt_tool.EIMessageContext2> eiMessageContext = new javax.xml.ws.Holder<>();
        svt_tool.EIMessageContext2 myEIMessageContext2 = new svt_tool.EIMessageContext2();
        myEIMessageContext2.setCorrelationId(new TimeStamp1().getNowUnformated());
        myEIMessageContext2.setTimeLeft(60000L);
        myEIMessageContext2.setSender("mk.telekom.system.architecture.Diligent:Diagnostic");
        myEIMessageContext2.setTarget("DiagnosticServicePortType");
        eiMessageContext.value = myEIMessageContext2;
        //
        svt_tool.CheckLineServiceRequest data = new svt_tool.CheckLineServiceRequest();
        data.setLineID(lineId);
        //
        javax.xml.ws.Holder<svt_tool.CheckLineServiceResponse> data0 = new javax.xml.ws.Holder<>();
        //data0.value = new svt_tool.CheckLineServiceResponse();
        //
        svt_tool.DiagnosticServicePortTypeService service = new svt_tool.DiagnosticServicePortTypeService();
        svt_tool.DiagnosticServicePortType port = service.getDiagnosticServicePortType();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        port.checkLineService(eiMessageContext, data, data0);
        String transportStatus = data0.value.getTransport();
        String serviveStatus = data0.value.getStatus();
        String transportDescription = "-";
        String serviceDescription = "-";
        try {
            transportDescription = data0.value.getTransportDescription();
        } catch (Exception e) {
        }
        try {
            serviceDescription = data0.value.getServiceDiagnosticData().get(0).getDiagnosticData().get(0).getValue();
        } catch (Exception e) {
        }
        return transportStatus + ":" + serviveStatus + ":" + transportDescription + ":" + serviceDescription;
    }

    public static String checkLineService_prod(String lineId) throws svt_mkt_tool_prod.TechnicalExceptionMessage {
        setSystemProperties();
        javax.xml.ws.Holder<svt_mkt_tool_prod.EIMessageContext2> eiMessageContext = new javax.xml.ws.Holder<>();
        svt_mkt_tool_prod.EIMessageContext2 myEIMessageContext2 = new svt_mkt_tool_prod.EIMessageContext2();
        myEIMessageContext2.setCorrelationId(new TimeStamp1().getNowUnformated());
        myEIMessageContext2.setTimeLeft(60000L);
        myEIMessageContext2.setSender("mk.telekom.system.architecture.Diligent:Diagnostic");
        myEIMessageContext2.setTarget("DiagnosticServicePortType");
        eiMessageContext.value = myEIMessageContext2;
        //
        svt_mkt_tool_prod.CheckLineServiceRequest data = new svt_mkt_tool_prod.CheckLineServiceRequest();
        data.setLineID(lineId);
        //
        javax.xml.ws.Holder<svt_mkt_tool_prod.CheckLineServiceResponse> data0 = new javax.xml.ws.Holder<>();
        data0.value = new svt_mkt_tool_prod.CheckLineServiceResponse();
        //
        svt_mkt_tool_prod.DiagnosticServicePortTypeService service = new svt_mkt_tool_prod.DiagnosticServicePortTypeService();
        svt_mkt_tool_prod.DiagnosticServicePortType port = service.getDiagnosticServicePortType();
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        port.checkLineService(eiMessageContext, data, data0);
        String transportStatus = data0.value.getTransport();
        String serviveStatus = data0.value.getStatus();
        String transportDescription = "-";
        String serviceDescription = "-";
        try {
            transportDescription = data0.value.getTransportDescription();
        } catch (Exception e) {
        }
        try {
            serviceDescription = data0.value.getServiceDiagnosticData().get(0).getDiagnosticData().get(0).getValue();
        } catch (Exception e) {
        }
        return transportStatus + ":" + serviveStatus + ":" + transportDescription + ":" + serviceDescription;
    }

    public static String createTestCustomerIssue() throws Exception {
        String INCIDENTID = hasCustomerIndividualFault("38922628408");
        if (INCIDENTID == null) {
            svt_mkt_ws.EIMessageContext2 myContext = new svt_mkt_ws.EIMessageContext2();
            myContext.setTarget("IDiligentWS");
            myContext.setSender("sndr:mk.telekom.system.architecture.Diligent:CRM");
            myContext.setCorrelationId(new TimeStamp1().getNowUnformated());
            //
            javax.xml.ws.Holder<svt_mkt_ws.EIMessageContext2> eiMessageContextHolder = new javax.xml.ws.Holder<>();
            eiMessageContextHolder.value = myContext;
            //**************************************
            svt_mkt_ws.CreateCustomerIssueRequestData createCustomerIssueRequestData = new svt_mkt_ws.CreateCustomerIssueRequestData();
            CustomerIssueModel myCustomerIssueModel = new CustomerIssueModel();
            //myCustomerIssueModel.setId("");
            myCustomerIssueModel.setName("IVR PRECKA - 38922650370");
            myCustomerIssueModel.setCreatedBy("5d73ed41-7af5-5cc0-b2b2-5d0b2f49e9eb");
            myCustomerIssueModel.setDescription("14445906-Activation");
            myCustomerIssueModel.setDeleted(0);
            myCustomerIssueModel.setFaultType("1");
            myCustomerIssueModel.setCustomerId("8a8d363c-bbc9-c6c4-68c2-5fbe7cd9b08a");
            myCustomerIssueModel.setProductId("9df12aef-5978-737b-db7c-6a3f0c6abb1c");
            myCustomerIssueModel.setReason("Проблем после ново барање - автоматска дијагностика");
            myCustomerIssueModel.setContactPhone("38970000000");//DUMMY number 
            myCustomerIssueModel.setSendSms("1");
            myCustomerIssueModel.setStatus("1");
            //myCustomerIssueModel.setReason("");
            myCustomerIssueModel.setServiceInFault("20");
            myCustomerIssueModel.setOperatorId("diligent@telekom.mk");
            createCustomerIssueRequestData.setCustomerIssueModel(myCustomerIssueModel);
            //---- date entered -------
            TimeStamp1 myTimeStamp = new TimeStamp1();
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
            myCustomerIssueModel.setDateEntered(myTimeDate);
            //--------
            svt_mkt_ws.CreateCustomerIssueResponseData myResponseData = new svt_mkt_ws.CreateCustomerIssueResponseData();
            javax.xml.ws.Holder<svt_mkt_ws.CreateCustomerIssueResponseData> createCustomerIssueResponseDataHolder = new javax.xml.ws.Holder<>();
            createCustomerIssueResponseDataHolder.value = myResponseData;
            //
            svt_mkt_ws.IDiligentWSService service = new svt_mkt_ws.IDiligentWSService();
            svt_mkt_ws.IDiligentWS port = service.getIDiligentWS();
            System.setProperty("http.proxyHost", "");
            System.setProperty("http.proxyPort", "");
            port.createCustomerIssue(eiMessageContextHolder, createCustomerIssueRequestData, createCustomerIssueResponseDataHolder);
            //
            return createCustomerIssueResponseDataHolder.value.getValidationModel().getResponseReason();
        } else {
            return "INCIDENT_FOUND:" + INCIDENTID;
        }
    }

    private static void setSystemProperties() {
        /*
        System.setProperty("javax.net.ssl.trustStore", "C:/my Files/data/certificates/diligent-prod-keystore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.setProperty("javax.net.ssl.keyStore", "C:/my Files/data/certificates/diligent-prod-keystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
         */
        //****************************************************

        System.setProperty("javax.net.ssl.trustStore", "/home/diligent/data/certificates/diligent-prod-keystore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.setProperty("javax.net.ssl.keyStore", "/home/diligent/data/certificates/diligent-prod-keystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
    }

    /**
     * @param lineId
     * @return
     * @throws java.net.MalformedURLException
     *
     */
    public static String checkLineServiceNEW_SVT(String lineId) throws MalformedURLException, Exception {
        setSystemProperties();        
        //
        SVTTest mySVTTest = new SVTTest();
        mySVTTest.setState("New");
        mySVTTest.setStartDateTime(new TimeStamp1().getNowUnformated_elegant() + ".00Z");
        mySVTTest.setDescription("Diligent tests");
        ServiceTestCharacteristic myServiceTestCharacteristic = new ServiceTestCharacteristic();
        myServiceTestCharacteristic.setName("CHECK_ALL_SERVICES_BY_LINE_ID");
        myServiceTestCharacteristic.setValue(lineId);
        mySVTTest.setMyServiceTestCharacteristic(new ServiceTestCharacteristic[]{myServiceTestCharacteristic});
        URL myURL = new URL("https://10.85.0.13/service-test-management/tmf-api/serviceTestManagement/serviceTest");
        //10.232.61.30:8080,10.232.61.35
        Gson gson = new GsonBuilder().create();
        System.out.println("mySVTTest=" + gson.toJson(mySVTTest));
        return Helpme.postObjToUrlAsJson(myURL, mySVTTest);
    }

    public static void main(String[] args) {
        try {
            //System.out.println(SVT_MKT_ws.createTestCustomerIssue());
            System.out.println(checkLineServiceNEW_SVT("F2005565"));
            //System.out.println(hasCustomerIndividualFault("38923085407"));
            //System.out.println("status="+checkLineService("L2108563"));
        } catch (Exception e) {
            System.out.println("error:" + e.toString());
            e.printStackTrace(System.out);
        }
    }

    /*
    private static void checkLineService_1(javax.xml.ws.Holder<svt_tool.EIMessageContext2> eiMessageContext, svt_tool.CheckLineServiceRequest data, javax.xml.ws.Holder<svt_tool.CheckLineServiceResponse> data0) throws svt_tool.TechnicalExceptionMessage {
        svt_tool.DiagnosticServicePortTypeService service = new svt_tool.DiagnosticServicePortTypeService();
        svt_tool.DiagnosticServicePortType port = service.getDiagnosticServicePortType();
        port.checkLineService(eiMessageContext, data, data0);
    }
     */
}

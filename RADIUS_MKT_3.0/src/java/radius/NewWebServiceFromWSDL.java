/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius;

//import diligent_mkt_ws.Alarm_umbrella;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import mk.telekom.it.crm.diligent.datatypes.diligent.LineMetric;
import mk.telekom.it.crm.diligent.datatypes.diligent.MassiveFault;
import mk.telekom.it.crm.diligent.services.diligent.TechnicalExceptionMessage;
import nsofiasLib.fileIO.FileLogger;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.URLContextReader_object;

/**
 *
 * @author stb
 */
@WebService(serviceName = "DiligentCRM", portName = "DiligentPort", endpointInterface = "mk.telekom.it.crm.diligent.services.diligent.DiligentPortType", targetNamespace = "http://crm.it.telekom.mk/diligent/services/Diligent", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/DILIGENT.wsdl")
public class NewWebServiceFromWSDL {

    public static String TYPE_COPPER = "TYPE_COPPER";
    public static String TYPE_COPPER_CABLE = "TYPE_COPPER_CABLE";
    public static String TYPE_GPON = "TYPE_GPON";
    public static String TYPE_GPON_CABLE = "TYPE_GPON_CABLE";
    public static String PATH_DELIMETER = ";";    
    FileLogger myFileLogger;

    @Resource
    private WebServiceContext context;

    public void checkMassiveFaultByLine(javax.xml.ws.Holder<net.tmobile.ei.messaging.datatypes.EIMessageContext2> eiMessageContext, mk.telekom.it.crm.diligent.datatypes.diligent.CheckMassiveFaultByLine data, javax.xml.ws.Holder<mk.telekom.it.crm.diligent.datatypes.diligent.CheckMassiveFaultByLineOutput> data0) throws TechnicalExceptionMessage {
        String lineId = data.getLineID();
        String res = checkIfMassive(lineId);
        //--------
        mk.telekom.it.crm.diligent.datatypes.diligent.CheckMassiveFaultByLineOutput output = new mk.telekom.it.crm.diligent.datatypes.diligent.CheckMassiveFaultByLineOutput();
        MassiveFault myMassiveFault = new MassiveFault();
        myMassiveFault.setName("INCIDENT_ID");
        myMassiveFault.setValue(res);
        output.getMassiveFault().add(myMassiveFault);
        data0.value = output;
    }

    public void getLineMetrics(javax.xml.ws.Holder<net.tmobile.ei.messaging.datatypes.EIMessageContext2> eiMessageContext, mk.telekom.it.crm.diligent.datatypes.diligent.GetLineMetrics data, javax.xml.ws.Holder<mk.telekom.it.crm.diligent.datatypes.diligent.GetLineMetricsOutput> data0) throws TechnicalExceptionMessage {
        ServletContext myContext = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
        RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");
        String lineId = data.getLineID();
        //---------------
        String lastStopEvent = "N/A";
        List<String> stopEvents = new ArrayList<>();
        //-----------------------------------------
        String numberOf12H_disconnections_ = "N/A";
        String state = "N/A";
        String isDyingGasp_ = "N/A";
        try {
            TimeStamp1 after = new TimeStamp1();
            after.addHours(-12);
            String after_ = after.getNowUnformated();
            Set<String> disconns = myContainer.getStopEvents().get(lineId);
            int numberOf12H_disconnections = 0;
            if (disconns != null && !disconns.isEmpty()) {
                for (String disconnEvent : disconns) {
                    stopEvents.add(disconnEvent);
                    if (disconnEvent.compareTo(after_) > 0) {
                        numberOf12H_disconnections++;
                    }
                }
                Collections.sort(stopEvents);
                if (!stopEvents.isEmpty()) {
                    lastStopEvent = stopEvents.get(stopEvents.size() - 1);
                }
            }
            numberOf12H_disconnections_ = String.valueOf(numberOf12H_disconnections);
            //-------state-----
            String values[] = myContainer.getEventsContainer().get(lineId).getMyValues();
            state = values[myContainer.getState_column()];
            //-------dyingGasp-----
            /*
            List myLineIDs = new ArrayList();
            myLineIDs.add(lineId);
            int count = Alarm_umbrella.isDying_gasp(myLineIDs);
            boolean isDyingGasp = (count == 1);
            isDyingGasp_ = String.valueOf(isDyingGasp);
            System.out.println("NewWebServiceFromWSDL:" + stopEvents.size() + ";" + lastStopEvent + ";" + state + ";" + isDyingGasp);
            */
        } catch (Exception e) {
            System.out.println("NewWebServiceFromWSDL:" + e.toString());
        }
        //*************************************************************************************************
        mk.telekom.it.crm.diligent.datatypes.diligent.GetLineMetricsOutput myOutput = new mk.telekom.it.crm.diligent.datatypes.diligent.GetLineMetricsOutput();
        LineMetric lmetr_disconnections = new LineMetric();
        lmetr_disconnections.setName("disconnections");
        lmetr_disconnections.setValue(String.valueOf(numberOf12H_disconnections_));
        myOutput.getLineMetric().add(lmetr_disconnections);
        //-----------------
        LineMetric lmetr_state = new LineMetric();
        lmetr_state.setName("state");
        lmetr_state.setValue(state);
        myOutput.getLineMetric().add(lmetr_state);
        //-----------------
        LineMetric lmetr_lastStopEvent = new LineMetric();
        lmetr_lastStopEvent.setName("lastStopTimestamp");
        lmetr_lastStopEvent.setValue(lastStopEvent);
        myOutput.getLineMetric().add(lmetr_lastStopEvent);
        //-----------------
        LineMetric lmetr_isDyingGasp = new LineMetric();
        lmetr_isDyingGasp.setName("isDyingGasp");
        lmetr_isDyingGasp.setValue(String.valueOf(isDyingGasp_));
        myOutput.getLineMetric().add(lmetr_isDyingGasp);
        //--------
        data0.value = myOutput;
    }

    private String checkIfMassive(String lineId) {
        try {
            //**********   
            String now = new TimeStamp1().getNowUnformated();            
            CallInfo myCallInfo;
            //**************
            ServletContext myContext = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
            RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");
            RadiusSessionRecord myRadiusRecord = myContainer.getEventsContainer().get(lineId);
            if (myRadiusRecord==null)
            {
                System.out.println("NewWebServiceFromWSDL:LINE_NOT_FOUND:" + lineId);
                return ("LINE_NOT_FOUND");
            }
            String[] myValues = myRadiusRecord.getMyValues();
            String cardTechnology = myValues[5];
            System.out.println("NewWebServiceFromWSDL:cardTechnology:" + cardTechnology);
            ArrayList<String[]> paths = new ArrayList();
            //--------- COPPER  --------------
            if (!cardTechnology.equals("GPON")) {
                myCallInfo = new CallInfo(lineId, now, "COPPER", "UNKN_REASON");
                try {
                    String SERVING_AREA = myValues[18];
                    String ATC = myValues[11];
                    String DSLAM = myValues[15];
                    String SLOT = DSLAM + ":" + myValues[7] + "-" + myValues[8] + "-" + myValues[9];
                    String path = SERVING_AREA + PATH_DELIMETER + ATC + PATH_DELIMETER + DSLAM + PATH_DELIMETER + SLOT;
                    paths.add(new String[]{
                        path, TYPE_COPPER
                    });
                    //**************
                    //SERVING_AREA;ATC;DSLAM;OLT;SHELF;SLOT;CABLE;DP;BOX;
                    myCallInfo.getResources().put("SERVING_AREA", SERVING_AREA);
                    myCallInfo.getResources().put("ATC", ATC);
                    myCallInfo.getResources().put("DSLAM", DSLAM);
                    myCallInfo.getResources().put("SLOT", SLOT);
                    //**************
                    System.out.println("NewWebServiceFromWSDL:path added:" + path);
                } catch (Exception e) {
                    System.out.println("NewWebServiceFromWSDL:" + e.toString());
                }
                //--------- COPPER CABLE  --------------
                try {
                    String ATC = myValues[11];
                    String CABLE = ATC + "#" + myValues[12];
                    String DP = CABLE + "#" + myValues[13];
                    String path = ATC + PATH_DELIMETER + CABLE + PATH_DELIMETER + DP;
                    paths.add(new String[]{
                        path, TYPE_COPPER_CABLE
                    });
                    //*******************
                    myCallInfo.getResources().put("CABLE", CABLE);
                    myCallInfo.getResources().put("DP", DP);
                    //*******************
                    System.out.println("NewWebServiceFromWSDL:path added:" + path);
                } catch (Exception e) {
                    System.out.println("NewWebServiceFromWSDL:4 " + e.toString());
                }
                //-------- GPON ---------------
            } else {
                myCallInfo = new CallInfo(lineId, now, "GPON", "UNKN_REASON");
                try {
                    String OLT = myValues[15];
                    String SHELF = OLT + ":" + myValues[7] + "-" + myValues[8];
                    String SLOT = OLT + ":" + myValues[7] + "-" + myValues[8] + "-" + myValues[9];
                    String path = OLT + PATH_DELIMETER + SHELF + PATH_DELIMETER + SLOT;
                    paths.add(new String[]{
                        path, TYPE_GPON
                    });
                    //**************
                    myCallInfo.getResources().put("OLT", OLT);
                    myCallInfo.getResources().put("SHELF", SHELF);
                    myCallInfo.getResources().put("SLOT", SLOT);
                    //**************                    
                    System.out.println("NewWebServiceFromWSDL:path added:" + path);
                } catch (Exception e) {
                    System.out.println("NewWebServiceFromWSDL:3 " + e.toString());
                }
                //-------- GPON CABLE ---------------
                try {
                    String ATC = myValues[11];
                    String CABLE = myValues[12];
                    String DP = myValues[13];////LLisice#ODCF-18-02-05 CABLE-BOX                    
                    String path = ATC + PATH_DELIMETER + CABLE + PATH_DELIMETER + DP;
                    paths.add(new String[]{
                        path, TYPE_GPON_CABLE
                    });
                    //**************
                    myCallInfo.getResources().put("ATC", ATC);
                    myCallInfo.getResources().put("CABLE", CABLE);
                    myCallInfo.getResources().put("BOX", DP);
                    //**************                        
                    System.out.println("NewWebServiceFromWSDL:path added:" + path);
                } catch (Exception e) {
                    System.out.println("NewWebServiceFromWSDL:2  " + e.toString());
                }
            }
            //----------- CCM OUTPUT ---------------------------- 
            try{
                if (myFileLogger==null)
                    {
                    myFileLogger = new FileLogger(System.getenv("APPLICATIONS_PATH") + "/myCCM.log");
                    }
                myFileLogger.writeln(myCallInfo.toString());
            }catch(Exception e){}
            System.out.println("NewWebServiceFromWSDL:new CCM CALL :" + myCallInfo.toString());
            //-------------------------------------        
            try {
                URLContextReader_object myUrlReader = new URLContextReader_object();
                for (String[] path : paths) {
                    String url = "http://10.232.63.13:8080/DILIGENT_MKT/inMassive.jsp" + "?path=" + URLEncoder.encode(path[0], "UTF-8") + "&type=" + path[1];
                    System.out.println("NewWebServiceFromWSDL:url:" + url);
                    String res = (String) myUrlReader.getUrlContext(url, 120000, 120000).get(0);
                    System.out.println("NewWebServiceFromWSDL:checkIfMassive returned:" + res);
                    if (!res.contains("NOT_FOUND")) {
                        return res;
                    }
                }
                return ("NO_MASSIVE_FOUND");
            } catch (Exception e) {
                System.out.println("NewWebServiceFromWSDL:1 " + e.toString());
            }
        } catch (Exception e) {
            System.out.println("NewWebServiceFromWSDL:0 " + e.toString());
            return ("NO_MASSIVE_FOUND");
        }
        System.out.println("NewWebServiceFromWSDL:-1 ");
        return ("NO_MASSIVE_FOUND");
    }

}

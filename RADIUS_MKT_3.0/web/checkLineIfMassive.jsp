<%-- 
    Document   : getCallInfo
    Created on : Apr 22, 2021, 9:31:47 AM
    Author     : gsofi
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="radius.RadiusSessionRecord"%>
<%@page import="radius.RadiusLog_LineParserListener"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="nsofiasLib.utils.URLContextReader_object"%>
<%@page import="nsofiasLib.fileIO.FileLogger"%>
<%@page import="radius.CallInfo"%>
<%@page import="nsofiasLib.time.TimeStamp1"%>
<%@page import="nsofiasLib.time.TimeStamp1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    response.setCharacterEncoding("utf-8");
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");
    String lineId = request.getParameter("lineId");
    RadiusSessionRecord myRadiusRecord = myContainer.getEventsContainer().get(lineId);
    if (myRadiusRecord == null) {
        out.println("LINE_NOT_FOUND");
        return;
    }
    String res = checkIfMassive(lineId,myRadiusRecord);
    if (res != null)
        out.println(res);
%>


<%!
    private String checkIfMassive(String lineId,RadiusSessionRecord myRadiusRecord) {
        try {
            String now = new TimeStamp1().getNowUnformated();            
            CallInfo myCallInfo;
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
                    String path = SERVING_AREA + radius.NewWebServiceFromWSDL.PATH_DELIMETER + ATC + radius.NewWebServiceFromWSDL.PATH_DELIMETER + DSLAM + radius.NewWebServiceFromWSDL.PATH_DELIMETER + SLOT;
                    paths.add(new String[]{
                        path, radius.NewWebServiceFromWSDL.TYPE_COPPER
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
                    String path = ATC + radius.NewWebServiceFromWSDL.PATH_DELIMETER + CABLE + radius.NewWebServiceFromWSDL.PATH_DELIMETER + DP;
                    paths.add(new String[]{
                        path, radius.NewWebServiceFromWSDL.TYPE_COPPER_CABLE
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
                    String path = OLT + radius.NewWebServiceFromWSDL.PATH_DELIMETER + SHELF + radius.NewWebServiceFromWSDL.PATH_DELIMETER + SLOT;
                    paths.add(new String[]{
                        path, radius.NewWebServiceFromWSDL.TYPE_GPON
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
                    String path = ATC + radius.NewWebServiceFromWSDL.PATH_DELIMETER + CABLE + radius.NewWebServiceFromWSDL.PATH_DELIMETER + DP;
                    paths.add(new String[]{
                        path, radius.NewWebServiceFromWSDL.TYPE_GPON_CABLE
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
%>
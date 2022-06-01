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
        CallInfo myCallInfo = new CallInfo(lineId, new TimeStamp1().getNowUnformated(), "NA", "UNKN_REASON");
        out.println(myCallInfo);
    } else {
        CallInfo myCallInfo = getlineIdresources1(lineId, myRadiusRecord);
        out.println(myCallInfo);
    }
%>


<%!
    private CallInfo getlineIdresources1(String lineId, RadiusSessionRecord myRadiusRecord) {
        CallInfo myCallInfo = new CallInfo(lineId, new TimeStamp1().getNowUnformated(), "NA", "UNKN_REASON");

        try {
            String[] myValues = myRadiusRecord.getMyValues();
            String cardTechnology = myValues[5];
            String SERVING_AREA = myValues[18];
            String ATC = myValues[11];
            String DSLAM = myValues[15];
            String SLOT = DSLAM + ":" + myValues[7] + "-" + myValues[8] + "-" + myValues[9];
            //
            myCallInfo.getResources().put("SERVING_AREA", SERVING_AREA);
            myCallInfo.getResources().put("ATC", SERVING_AREA + ";" + ATC);
            //
            if (!cardTechnology.equals("GPON")) {
                //--------- COPPER  --------------
                //path = SERVING_AREA + ";" + ATC + ";" + DSLAM + ";" + SLOT;
                //path = ATC + ";" + CABLE + ";" + DP;
                myCallInfo.setNetworkType("COPPER");
                String CABLE = ATC + "#" + myValues[12];
                String DP = CABLE + "#" + myValues[13];
                //
                myCallInfo.getResources().put("DSLAM", SERVING_AREA + ";" + ATC + ";" + DSLAM);
                myCallInfo.getResources().put("SLOT", SERVING_AREA + ";" + ATC + ";" + DSLAM + ";" + SLOT);
                myCallInfo.getResources().put("CABLE", ATC + ";" + CABLE);
                myCallInfo.getResources().put("DP", ATC + ";" + CABLE + ";" + DP);
            } else {
                //-------- GPON ---------------
                //path = OLT + ";" + SHELF + ";" + SLOT;
                //path = ATC + ";" + CABLE + ";" + DP;
                String SHELF = DSLAM + ":" + myValues[7] + "-" + myValues[8];
                String CABLE = myValues[12];
                String BOX = myValues[13];////LLisice#ODCF-18-02-05 CABLE-BOX   
                //
                myCallInfo.setNetworkType("GPON");
                myCallInfo.getResources().put("OLT", DSLAM);
                myCallInfo.getResources().put("GPON_SHELF", DSLAM + ";" + SHELF);
                myCallInfo.getResources().put("GPON_SLOT", DSLAM + ";" + SHELF + ";" + SLOT);
                myCallInfo.getResources().put("GPON_CABLE", ATC + ";" + CABLE);
                myCallInfo.getResources().put("GPON_BOX", ATC + ";" + CABLE + ";" + BOX);
            }
        } catch (Exception e) {
        }
        return myCallInfo;
    }
%>
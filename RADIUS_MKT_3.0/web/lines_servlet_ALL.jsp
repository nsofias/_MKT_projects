<%@page import="com.google.gson.Gson"%>
<%@page import="nsofiasLib.fileIO.FileParser2Daemon,radius.*,java.util.Map,java.util.ArrayList,java.util.List,nsofiasLib.time.TimeStamp1"%>
<%--  
    Document   : alarms
    Created on : Oct 17, 2018, 12:40:34 PM
    Author     : nsofias
--%>
<%  response.setCharacterEncoding("utf-8");
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");;
    try {
        List<RadiusSessionRecord> myRadiusLogRecords = myContainer.getSessionsAsList();
        out.println(new Gson().toJson(myRadiusLogRecords));
    } catch (Exception e) {
        out.println("connector_exception :" + e.toString());
    }
%>

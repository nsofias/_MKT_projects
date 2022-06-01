
<%@page import="diligent_MKT.PathRetrieverFactory"%>
<%@page import="diligent_MKT.PathsRetriever"%>
<%@page import="diligent_MKT.Alarm_FYROM"%>
<%-- 
    Document   : usersAffected
    Created on : Jan 23, 2019, 11:36:30 AM
    Author     : nsofias
--%>
<%@page import="nsofiasLib.ote.alarms.*,java.util.Map,nsofiasLib.utils.URLContextReader_object,nsofiasLib.ote.DSLAMs.DslamDetailsFinder,nsofiasLib.ote.DSLAMs.DslamDetails,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02,03,04";%>
<%@ include file = "sequrityPart.jsp"%>
<%
//----------- sequrity----------------
    try
        {
        if (!userTypes.contains(userType))
            {
            %>
            <font face="Verdana" size="3" color="#000080">Sorry, you are not authorized to view this page!!!</font>
            <%return;
            }
        }
    catch (Exception e)
        {
        }
//----------- sequrity end----------------
%>

<%
    ArrayList<String> paths = new ArrayList();
    ServletContext myContext = request.getServletContext();
    String type = request.getParameter("type");
    String myPath = request.getParameter("path");
    String ticketId = request.getParameter("ticketId");
    //
    if (myPath != null) {
        myPath = new String(myPath.getBytes("iso-8859-1"), "UTF-8");
        paths.add(myPath);
        out.println("alarms with Path" + myPath);
    } else if (ticketId != null) {
        ticketId = new String(request.getParameter("ticketId").getBytes("iso-8859-1"), "UTF-8");
        //out.println("alarms with ticketId:" + ticketId);
        Diligent_Daemon myGroupBy_Daemon = null;
        ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
        for (Diligent_Daemon myDaemon : myGroupBy_Daemons) {
            if (type != null && (type.equals(myDaemon.getDesc()))) {
                myGroupBy_Daemon = myDaemon;
            }
        }
        if (myGroupBy_Daemon != null) {
            for (Alarm_FYROM myAlarm : myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList().get(ticketId).getElementsList()) {
                paths.add(myAlarm.getNetworkElementName());
            }
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Current status of affected customers</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>
        <%
            PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
            for (String path : paths) {%>
        <h1>Current lines' status for <%=path%></h1>
        <table  border='1' width='100%'>
            <%

                if (myPatrhsRetriever != null) {
                    ArrayList<String> myLines = myPatrhsRetriever.retrieveLines(path);
                    Collections.sort(myLines);
                    for (String line : myLines) {
                        out.println("<tr><td>" + line + "</td></tr>");
                    }
                } %>       
        </table>
        <%}%>
    </body>
</html>

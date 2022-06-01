<%@page import="diligent_MKT.PathRetrieverFactory"%>
<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="diligent_MKT.PathsRetriever"%>
<%@page import="nsofiasLib.ote.alarms.*,java.util.Map,nsofiasLib.utils.URLContextReader_object,nsofiasLib.ote.DSLAMs.DslamDetailsFinder,nsofiasLib.ote.DSLAMs.DslamDetails,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>

<%-- 
    Document   : usersAffected
    Created on : Jan 23, 2019, 11:36:30 AM
    Author     : nsofias
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ServletContext myContext = request.getServletContext();
    String type = request.getParameter("type");

    //
    //out.println("alarms with ticketId:" + ticketId);
    Diligent_Daemon myGroupBy_Daemon = null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myDaemon : myGroupBy_Daemons) {
        if (type != null && (type.equals(myDaemon.getDesc()))) {
            myGroupBy_Daemon = myDaemon;
        }
    }
    PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
    ArrayList<String> allLinesStopped = new ArrayList();
    if (myGroupBy_Daemon != null) {
        ArrayList<String> linesStoppedMasive = new ArrayList();
        allLinesStopped.addAll(myPatrhsRetriever.retrieveStoppedLines());
        for (String ticketId : myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList().keySet()) {
            for (Alarm_FYROM myAlarm : myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList().get(ticketId).getElementsList()) {
                if (myPatrhsRetriever != null) {
                    linesStoppedMasive.addAll(myPatrhsRetriever.retrieveLines(myAlarm.getNetworkElementName()));
                }
            }
        }
        //----------------
        for (String stoppedMasiveline : linesStoppedMasive) {
            allLinesStopped.remove(stoppedMasiveline);
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
        <h1>Current lines' status for </h1>
        <table  border='1' width='100%'>
            <%  if (myPatrhsRetriever != null) {
                    Collections.sort(allLinesStopped);
                    for (String line : allLinesStopped) {
                        out.println("<tr><td>" + line + "</td></tr>");
                    }
                }%>       
        </table>
    </body>
</html>

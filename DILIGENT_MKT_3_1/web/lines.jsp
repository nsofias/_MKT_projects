<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="diligent_MKT.PathRetrieverFactory"%>
<%@page import="diligent_MKT.PathsRetriever"%>
<%@page import="nsofiasLib.ote.alarms.*,java.util.Map,nsofiasLib.utils.URLContextReader_object,nsofiasLib.ote.DSLAMs.DslamDetailsFinder,nsofiasLib.ote.DSLAMs.DslamDetails,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<% String userTypes = "00,01,02";%>
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

<%-- 
    Document   : usersAffected
    Created on : Jan 23, 2019, 11:36:30 AM
    Author     : nsofias
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ServletContext myContext = request.getServletContext();
    String type = request.getParameter("type");
    String STOPPED_NOT_MASSIVE = request.getParameter("STOPPED_NOT_MASSIVE");//
    String FOUR_G_BACKUP = request.getParameter("FOUR_G_BACKUP");
    String FOUR_G_BACKUP_STOPPED = request.getParameter("FOUR_G_BACKUP_STOPPED");

    ////STOPPED,FOUR_G_BACKUP,NOT_MASSIVE
    //out.println("alarms with ticketId:" + ticketId);
    Diligent_Daemon myGroupBy_Daemon = null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myDaemon : myGroupBy_Daemons) {
        if (type != null && (type.equals(myDaemon.getDesc()))) {
            myGroupBy_Daemon = myDaemon;
        }
    }
        PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
    ArrayList<String> finalArray = new ArrayList();
    String header = "";
    if (myGroupBy_Daemon != null) {
        if (STOPPED_NOT_MASSIVE != null) {
            ArrayList<String> allLines = new ArrayList();
            allLines.addAll(myPatrhsRetriever.retrieveStoppedLines());
            finalArray = filterOutMassive(allLines, myGroupBy_Daemon, myPatrhsRetriever);
            out.println("STOPPED Lines size = " + allLines.size());
            out.println("STOPPED_NOT_MASSIVE size = " + finalArray.size());
            header = "lines DISCONNECTED not due to massive fault (" + type + ")";
        } else if (FOUR_G_BACKUP_STOPPED != null) {
            FourG_backupDaemon myFourG_backupDaemon = (FourG_backupDaemon) myContext.getAttribute("myFourG_backupDaemon");
            finalArray.addAll(myFourG_backupDaemon.getStopped4G().values());
            header = "DISCONNECTED lines with 4G_BACKUP capability (" + type + ")";
        } else if (FOUR_G_BACKUP != null) {
            finalArray.addAll(PathRetrieverFactory.create(Alarm_FYROM.TYPE_COPPER).retrieve4GBackupLines());
            out.println("FOUR_G_BACKUP Lines size = " + finalArray.size());
            header = "lines with 4G_BACKUP capability (" + type + ")";
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

        <h1><%=header%></h1>
        <table  border='1' width='100%'>
            <%  if (myPatrhsRetriever != null) {
                    Collections.sort(finalArray);
                    for (String line : finalArray) {
                        out.println("<tr><td>" + line + "</td></tr>");
                        out.flush();
                    }
                }%>       
        </table> 
    </body>
</html>

<%! private ArrayList filterOutMassive(ArrayList<String> allLines, Diligent_Daemon myGroupBy_Daemon, PathsRetriever myPatrhsRetriever) {
        ArrayList<String> myLines = new ArrayList();
        if (myGroupBy_Daemon != null) {
            ArrayList<String> linesMasive = new ArrayList();
            if (myPatrhsRetriever != null) {
                List<diligent_MKT.Alarm_FYROM> myLiveAlarms = myGroupBy_Daemon.getMyStatsObjContainer().getAlarmArrayList_stillAlive();
                for (diligent_MKT.Alarm_FYROM myAlarm : myLiveAlarms) {
                    linesMasive.addAll(myPatrhsRetriever.retrieveLines(myAlarm.getNetworkElementName()));
                }
            }
            //----------------
            for (String line : allLines) {
                if (!linesMasive.contains(line)) {
                    myLines.add(line);
                }
            }
        }
        return myLines;
    }
%>
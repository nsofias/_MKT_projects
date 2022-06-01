<%@page import="diligent_MKT.Ticket_FYROM"%>
<%@page import="java.net.URLEncoder,java.util.Map,nsofiasLib.ote.alarms.*,java.util.Iterator,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<!DOCTYPE html>

<html>
    <head>
        <title>Tickets summary</title>
        <link rel="stylesheet" href="global_1.css">      
    </head>
<%
    ServletContext myContext = request.getServletContext();
    try
        {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        }
    catch (Exception e)
        {
        }
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    String str = "";
    try
        {
        TimeStamp1 fromT = new TimeStamp1();
        System.out.println("fromT1=" + fromT.getNowUnformated());
        fromT.addDays(-1);
        System.out.println("fromT2=" + fromT.getNowUnformated());
        String to = fromT.getNowUnformated().substring(0, 8) + "T235959.000";//20180402T133545.000
        String from = fromT.getNowUnformated().substring(0, 8) + "T000000.000";
        System.out.println("from=" + from + " to=" + to);
        List<nsofiasLib.ote.alarms.Ticket> ticketsList = new ArrayList();
        for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
            {
            ticketsList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsAsArrayList());
            }
        try
            {
            Collections.sort(ticketsList);
            }
        catch (Exception e)
            {
            }
        //----------------------------
        str += "<h1> DiligentMKT summary of " + fromT.getTodayFormated() + "<h1>";
        System.out.println(str);
        str += "<table width='100%'  border='1'>";
        str += "<tr><th>SR</th><th>Type</th><th>Synopsis</th><th>started</th><th>stopped</th><th>Reported</th><th>criticality</th><th>Disconnected customers</th><th>affected customers</th></tr>";

        for (Object myTicketObj : ticketsList)
            {
            Ticket_FYROM myTicket = (Ticket_FYROM) myTicketObj;
            if (myTicket.getState().equals(Ticket.STATE_PENDING_TO_OPEN) || myTicket.getState().equals(Ticket.STATE_CANCELED))
                {
                continue;
                }
            if (myTicket.getIncidentStartDate().compareTo(from) > 0 && myTicket.getIncidentStartDate().compareTo(to) < 0)
                {
                str += "<tr>";
                str += "<td nowrap>" + myTicket.getSR() + "</td>";
                str += "<td nowrap>" + myTicket.getType() + "</td>";
                str += "<td nowrap>" + myTicket.getSYNOPSIS() + "</td>";
                str += "<td nowrap>" + new TimeStamp1(myTicket.getIncidentStartDate()).getNowFormated() + "</td>";
                str += "<td nowrap>" + new TimeStamp1(myTicket.getIncidentStoppedDate()).getNowFormated() + "</td>";
                str += "<td nowrap>" + new TimeStamp1(myTicket.getIncidentReportedDate()).getNowFormated() + "</td>";
                str += "<td align='right'>" + myTicket.getCriticalityDesc(myTicket.getCriticality()) + "</td>";
                str += "<td align='right'>" + myTicket.findLinesDisconnected() + "</td>";
                str += "<td align='right'>" + myTicket.findLinesAffected() + "</td>";
                str += "</tr>";
                }
            }

        str += "</table>";
        }
    catch (Exception e)
        {
        e.printStackTrace(System.out);
        }
    out.println(str);

%>

    </body>
</html>



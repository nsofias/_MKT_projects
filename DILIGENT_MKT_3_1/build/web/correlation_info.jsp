<%-- 
    Document   : correlation_info
    Created on : Jan 7, 2019, 2:37:46 PM
    Author     : nsofias
--%>
<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="diligent_MKT.Ticket_FYROM"%>
<%@page import="java.net.URLEncoder,nsofiasLib.ote.alarms.*,java.util.Iterator,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Correlation info</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>
        <h1>Correlation Info GUI</h1>
        <form name="F1" action="correlation_info.jsp">
            <h2>Please insert ticket number or ticket id :<h2>
                    <input type="text" name="sr" value="" size="40" />
                    <input type="submit" value="Submit" name="Submit" />
                    </form> <p> 
                        <%          
                            String sr = request.getParameter("sr");
                            if (sr != null)
                                {
                                ServletContext myContext = request.getServletContext();
                                ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
                                List<Ticket_FYROM> ticketsList = new ArrayList();
                                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
                                    {
                                    ticketsList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsAsArrayList());
                                    }
                                Ticket_FYROM tiketFound = null;
                                for (Ticket_FYROM myTiket : ticketsList)
                                    {
                                    if ((myTiket.getSR() != null && myTiket.getSR().equals(sr)) || myTiket.getTicketId().equals(sr))
                                        {
                                        tiketFound = myTiket;
                                        }
                                    }
                                if (tiketFound != null)
                                    {
                                    String correlationString = tiketFound.getCollerationString();
                                    List alarmList = tiketFound.getElementsList();
                                    if (alarmList.size() > 1)
                                        {
                                        out.println("<h3>Correlation type:" + tiketFound.getType() + "</h3>");
                                        out.println("<h3>Element type: Some (" + alarmList.size() + ") " + tiketFound.getSubType() + "s</h3>");
                                        out.println("<h3>Parent (common) element : " + correlationString.replace(";", " : ") + "</h3>");
                                        }
                                    else
                                        {
                                        out.println("<h3>Correlation type:" + tiketFound.getType() + "</h3>");
                                        out.println("<h3>Element type: One " + tiketFound.getSubType() + "s</h3>");
                                        out.println("<h3>Parent (common) element : " + correlationString.replace(";", " : ") + "</h3>");
                                        }
                                    //-------
                                    out.println("<p><table>");
                                    out.println("<tr>");
                                    if (tiketFound.getType().equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER))
                                        {
                                        out.println("<th>SERVING_AREA</th><th>ATC</th><th>DSLAM</th><th>slot</th>");
                                        out.println("</tr>");
                                        for (Object myAlarm : alarmList)
                                            {
                                            Alarm_FYROM myAlarm_FYROM = (Alarm_FYROM) myAlarm;
                                            String elementName = myAlarm_FYROM.getNetworkElementName();
                                            String[] elementName_ = elementName.split(";");
                                            out.println("<tr><td>");
                                            for (int i = 0; i < elementName_.length; i++)
                                                {
                                                out.println(elementName_[i]);
                                                if (i < elementName_.length - 1)
                                                    {
                                                    out.println("</td><td>");
                                                    }
                                                }
                                            out.println("</td></tr>");
                                            }

                                        }
                                    else if (tiketFound.getType().equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE))
                                        {
                                        out.println("<th>RSU</th><th>Cable</th><th>DP</th>");
                                        out.println("</tr>");
                                        for (Object myAlarm : alarmList)
                                            {
                                            Alarm_FYROM myAlarm_FYROM = (Alarm_FYROM) myAlarm;
                                            String elementName = myAlarm_FYROM.getNetworkElementName();
                                            String[] elementName_ = elementName.split(";");
                                            out.println("<tr><td>");
                                            for (int i = 0; i < elementName_.length; i++)
                                                {
                                                out.println(elementName_[i]);
                                                if (i < elementName_.length - 1)
                                                    {
                                                    out.println("</td><td>");
                                                    }
                                                }
                                            out.println("</td></tr>");
                                            }
                                        out.println("</td></tr>");
                                        }
                                    else if (tiketFound.getType().equals(diligent_MKT.Alarm_FYROM.TYPE_GPON))
                                        {
                                        out.println("<th>ATC</th><th>OLT</th><th>Shelf</th><th>Slot</th>");
                                        out.println("</tr>");
                                        for (Object myAlarm : alarmList)
                                            {
                                            Alarm_FYROM myAlarm_FYROM = (Alarm_FYROM) myAlarm;
                                            String elementName = myAlarm_FYROM.getNetworkElementName();
                                            String[] elementName_ = elementName.split(";");
                                            out.println("<tr><td>");
                                            for (int i = 0; i < elementName_.length; i++)
                                                {
                                                out.println(elementName_[i]);
                                                if (i < elementName_.length - 1)
                                                    {
                                                    out.println("</td><td>");
                                                    }
                                                }
                                            out.println("</td></tr>");
                                            }
                                        out.println("</td></tr>");
                                        }
                                    else if (tiketFound.getType().equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE))
                                        {
                                        out.println("<th>ATC</th><th>Cable</th><th>BOX</th>");
                                        out.println("</tr>");
                                        for (Object myAlarm : alarmList)
                                            {
                                            Alarm_FYROM myAlarm_FYROM = (Alarm_FYROM) myAlarm;
                                            String elementName = myAlarm_FYROM.getNetworkElementName();
                                            String[] elementName_ = elementName.split(";");
                                            out.println("<tr><td>");
                                            for (int i = 0; i < elementName_.length; i++)
                                                {
                                                out.println(elementName_[i]);
                                                if (i < elementName_.length - 1)
                                                    {
                                                    out.println("</td><td>");
                                                    }
                                                }
                                            out.println("</td></tr>");
                                            }
                                        out.println("</td></tr>");
                                        }
                                    out.println("</table>");
                                    out.println(tiketFound.toHTML("Diligent"));
                                    /*
                                    out.println("<p><table>");
                                    out.println("<tr>");
                                    out.println("<th>Customer LineIDs</th>");
                                    for (String myLineID : customerList)
                                        {
                                        out.println(myLineID);
                                        }
                                    out.println("</tr>");
                                    out.println("</table>");          */

                        %>
                    <p><a href="linesRegistered.jsp?type=<%=tiketFound.getType()%>&ticketId=<%=URLEncoder.encode(tiketFound.getTicketId(), "UTF-8")%>" target="_blank"><%=tiketFound.getCurrentUsersRegistered()%> Current Registered Users</a>
                        <%     }
                                }
                        %>
                        </body>
                        </html>

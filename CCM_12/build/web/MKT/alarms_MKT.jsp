<%@page import="java.util.Comparator"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="ccm.MKT.Ticket_MKT"%>
<%@page import="java.util.stream.Collectors"%>
<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="diligent_MKT.Ticket_FYROM"%>
<%@page import="java.net.URLEncoder,java.util.Map,nsofiasLib.ote.alarms.*,java.util.Iterator,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList"%>
<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="nsofiasLib.ote.alarms.Ticket"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Map,java.net.URLEncoder,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,ccm.CCMonitorStatsObjsContainer,ccm.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>


    <head>
        <title>Alarms</title>
        <link rel="stylesheet" href="../global.css">        
    </head>
    <body  bgcolor="#D6DFF7">  

        <%
            ServletContext myContext = request.getServletContext();
            CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
            AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
            //---------------------------------------------------------
            List<Alarm_FYROM> alarmArrayList = new ArrayList();
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String text = request.getParameter("text");
            String ticketId = request.getParameter("ticketId");
            String type = "ALL";
            if (text != null) {
                out.println("text=" + text);
                out.flush();
                Ticket_FYROM myTicket_FYROM = (Ticket_FYROM) new Gson().fromJson(text, Ticket_FYROM.class);
                alarmArrayList.addAll(myTicket_FYROM.getElementsList());
                type = myTicket_FYROM.getType();

            } else if (ticketId != null) {
                myCCMonitorStatsObjsContainer.getAlarmArrayList().entrySet().stream().map(entry -> entry.getValue())
                        .filter(v -> v.getTicketId() != null)
                        .map(v -> (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(v.getTicketId()))
                        .filter(v -> v != null)
                        .map(v -> v.getMyTicket_IBM())
                        .filter(v -> v != null && v.getSR() != null && !v.getSR().isEmpty() && v.getTicketId().equals(ticketId))
                        .forEach(ticket -> {
                            alarmArrayList.addAll(ticket.getElementsList());
                        });

            } else {
                myCCMonitorStatsObjsContainer.getAlarmArrayList().values().stream()
                        .filter(v -> v.getTicketId() != null)
                        .map(v -> (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(v.getTicketId()))
                        .filter(v -> v != null)
                        .map(v -> v.getMyTicket_IBM())
                        .filter(v -> v != null && v.getSR() != null && !v.getSR().isEmpty())
                        .forEach(ticket -> {
                            alarmArrayList.addAll(ticket.getElementsList());
                        });
            }
            Collections.sort(alarmArrayList, Comparator.comparing((Alarm_FYROM a)->a.getAlarmStart()).reversed());
            String elType = "";
            if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER)) {
                elType = "Host : RSU : DSLAM : slot";
            } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE)) {
                elType = "RSU : Cable : DP";
            } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON)) {
                elType = "OLT : Shelf : Slot";
            } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE)) {
                elType = "ATC : Cable : BOX";
            }
        %>                        

        <table  border='1' width='100%'>
            <tr bgcolor="LightBlue">
                <th></th>
                <th><%=elType%></th>
                <th>Element sub Type</th>
                <th>Start</th>                
                <th>Stop</th>            
                <th>Status</th>                 
                <th>Registered lines</th> 
                <th>Affected elements</th> 
                <th>Ticket-ID</th>  
                <th>affected Service ID</th>
                <th>mark Customers affected Status</th>
                <th>release Customers affected Status</th>
                <th>reason</th>
                <th>B.Board</th>
                <th>Oppening profile</th>

            </tr>

            <%
                for (Alarm_FYROM myAlarm : alarmArrayList) {

                    try {
                        String AlertOrigin = "-";
                        try {
                            AlertOrigin = myAlarm.getNetworkElementName();
                        } catch (Exception e) {
                            myAlarm.setAlarmObject("-");
                        }
                        AlertOrigin = AlertOrigin.replaceAll(";", " : ");
                        TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlarmStart());
                        //TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlarmStop());
                        TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlarmStart());
                        //out.println(new Gson().toJson(myAlarm));out.flush();
                        T0.addSeconds(-7400);
                        String AlertStart = new TimeStamp1(myAlarm.getAlarmStart()).getNowFormated();
                        String AlertStop = myAlarm.getAlarmStop() != null ? myAlarm.getAlarmStop() : "-";
                        String AlertTypeS = myAlarm.getAlarmType();
                        String desc = myAlarm.getDesc();
                        String sr = myAlarm.getTicketSR();
                        if (sr == null) {
                            sr = "";
                        }
                        String myObjType = myAlarm.getAlarmType();
                        String elementType = myAlarm.getAlarmSubType();
                        //
                        String usersAffected = "N/A";
                        if (myAlarm.getActiveLinesAffected() > 0) {
                            usersAffected = String.valueOf(myAlarm.getActiveLinesAffected());
                        }

                        if (myAlarm.isStilAlive()) {
            %>                            
            <tr  bgcolor="white">  
                <%
                    if (myAlarm.isRepeated()) {%>
                <td nowrap>R</td>
                <% } else {%>
                <td nowrap></td>
                <% }%>
                <td nowrap><%=AlertOrigin%></td>
                <td nowrap><%=elementType%></td>
                <td nowrap><%=AlertStart.substring(0, 16)%></td>
                <td nowrap></td>                                                          
                <td><b>alive!</b></td>
                <td nowrap><a href="linesRegistered.jsp?type=<%=myObjType%>&path=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>" target="_blank"><%=myAlarm.getLinesRegistered()%></a></td>
                <td nowrap><a href="http://10.232.63.13:8080/DILIGENT_MKT/pathsAffected.jsp?type=<%=myObjType%>&path=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>" target="_blank">Affected Sub-Paths</a></td>                
                <td nowrap><%=sr%></td>
                <td nowrap><%=myAlarm.getAffServiceID()%></td>
                <td nowrap><%=myAlarm.getMarkCustomersStatus()%></td>
                <td nowrap><%=myAlarm.getReleaseCustomersStatus()%></td>
                <td nowrap><%=myAlarm.getAlarmReason()%>
                    <%if (myAlarm.isDyingGasp()) {%>
                    <img src="img/power.jpg" width="15" height="15" alt=" P "/>
                    <%}%> 
                </td>
                <td nowrap><%=myAlarm.getMyBulletinid()%></td>
                <td nowrap><%=myAlarm.getAlarmOpenningProfile().toString()%></td>
                <td><%=myAlarm.getATC()%></td> 
                 <td><%=myAlarm.getSERVING_AREA()%></td> 
            </tr> 
            <%
            } else {
            %>
            <tr>
                <%
                    if (myAlarm.isRepeated()) {%>
                <td nowrap>R</td>
                <% } else {%>
                <td nowrap></td>
                <% }%>                                
                <td nowrap><%=AlertOrigin%></td>                
                <td nowrap><%=elementType%></td>
                <td nowrap><%=AlertStart.substring(0, 16)%></td>
                <td nowrap><%=AlertStop.substring(0, 16)%></td>                          
                <td>closed</td>
                <td nowrap><a href="linesRegistered.jsp?type=<%=myObjType%>&path=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>" target="_blank"><%=myAlarm.getLinesRegistered()%></a></td>
                <td nowrap><a href="http://10.232.63.13:8080/DILIGENT_MKT/pathsAffected.jsp?type=<%=type%>&path=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>">Affected Sub-Paths</a></td>  
                <td nowrap><%=sr%></td>
                <td nowrap><%=myAlarm.getAffServiceID()%></td>
                <td nowrap><%=myAlarm.getMarkCustomersStatus()%></td>
                <td nowrap><%=myAlarm.getReleaseCustomersStatus()%></td>    
                <td nowrap><%=myAlarm.getAlarmReason()%>
                    <%if (myAlarm.isDyingGasp()) {%>
                    <img src="img/power.jpg" width="15" height="15" alt=" P "/>
                    <%}%> 
                </td>
                <td nowrap><%=myAlarm.getMyBulletinid()%></td>
                <td nowrap><%=myAlarm.getAlarmOpenningProfile().toString()%></td>
                <td><%=myAlarm.getATC()%></td> 
                <td><%=myAlarm.getSERVING_AREA()%></td> 
            </tr> 
            <%
                        }
                    } catch (Exception e) {
                        out.println(e.toString());
                        e.printStackTrace();
                    }
                }
            %>

        </table>
    </body>
</html>

<%!
    String criticality_desc(int criticality) {
        if (criticality == 1) {
            return "WARNING";
        } else if (criticality == 2) {
            return "MINOR";
        } else if (criticality == 3) {
            return "MAJOR";
        } else if (criticality == 4) {
            return "CRITICAL";
        } else if (criticality == 5) {
            return "TOP CRITICAL";
        }
        return "WARNING";
    }
%>
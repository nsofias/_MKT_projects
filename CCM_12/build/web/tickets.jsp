<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="nsofiasLib.ote.alarms.Ticket"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Map,java.net.URLEncoder,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,ccm.CCMonitorStatsObjsContainer,ccm.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02";%>
<%@ include file = "sequrityPart.jsp"%>
<%//----------- sequrity----------------
    try {
        if (!userTypes.contains(userType)) {
%>
<font face="Verdana" size="3" color="#000080">Sorry, you are not authorized to view this page!!!</font>
<%return;
        }
    } catch (Exception e) {
    }
//----------- sequrity end----------------
%>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    TimeStamp1 myLastCallInputTimeStamp = myCCMonitorStatsObjsContainer.getMyLastCallInputTimeStamp();
    TimeStamp1 now = new TimeStamp1();
    double sinse_myLastNewAlarms = (int) now.secondsDiff(myLastCallInputTimeStamp);
    String openTicket = request.getParameter("openTicket");
    if (openTicket != null) {

    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tickets</title>
        <link rel="stylesheet" href="global.css">
        <script language="javascript">
            var max_timePage = 120;
            var max_timeData = <%=sinse_myLastNewAlarms%>;
            var cinterval = setInterval('countdown_timer()', 1000);

            function countdown_timer() {
                max_timePage--;
                max_timeData++;
                document.getElementById('countdownPage').innerHTML = max_timePage;
                document.getElementById('countdownData').innerHTML = max_timeData;
                //
                if (max_timePage === 0) {
                    clearInterval(cinterval);
                }
            }
        </script>
    </head>
    <%
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        try {
            myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        } catch (Exception e) {
        }
        //---------------------- parameters ----------------

        AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
        //------------------------------------
        Map<String, CCMAlarm> alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
        if (alarmArrayList.isEmpty()) {
            out.println("<h2>No current alarms found ...</h2>");
            return;
        }
        //System.out.println("CCM12:alarmArrayList size====" + alarmArrayList.size());
        //---------------------------------------------------------- 
        TimeStamp1 t1, t2;
        try {
            if (request.getParameter("from") != null) {
                t1 = new TimeStamp1(request.getParameter("from"));
            } else {
                t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated());
            }
        } catch (Exception e) {
            out.println("NO CLOCK YET!!!!!!!!");
            return;
        }
        t2 = new TimeStamp1(t1.getNowUnformated());
        t2.addHours(-24);
        //System.out.println("CCM12:from, to =" + t1.getNowFormated() + " " + t2.getNowFormated());
        AggregationsForPeriod myAggregationsForPeriod = myCCMonitorStatsObjsContainer.getCurrentObject();
        Set<String> types = myAggregationsForPeriod.getAggregationLabels();
    %>



    <body>
        <form action="tickets.jsp">
            Alarm Type:<select name="alarmType" onchange="this.form.submit()">                
                <%
                    String alarmType = request.getParameter("alarmType");
                    if (alarmType == null) {
                        alarmType = "ANY";
                    }
                    out.println("<option value='ANY'>ANY</option>");
                    for (String type : types) {
                        if (!type.startsWith("DIMENSSION")) {
                            if (type.equals(alarmType)) {
                                out.println("<option selected value='" + type + "'>" + type + "</option>");
                            } else if (!type.startsWith("DIMENSSION")) {
                                out.println("<option value='" + type + "'>" + type + "</option>");
                            }
                        }
                    }
                %>
            </select>&nbsp;



            &nbsp;&nbsp;Ticket state :<select name="ticketState" onchange="this.form.submit()">                    
                <%
                    String ticketState = request.getParameter("ticketState");
                    if (ticketState == null) {
                        ticketState = "ANY";
                    }
                    out.println("<option value='ANY'>ANY</option>");
                    out.println("<option selected value='" + ticketState + "'>" + ticketState + "</option>");
                    out.println("<option value='" + Ticket.STATE_OPEN + "'>" + Ticket.STATE_OPEN + "</option>");
                    out.println("<option value='" + Ticket.STATE_CANCELED + "'>" + Ticket.STATE_CANCELED + "</option>");
                    out.println("<option value='" + Ticket.STATE_CLOSED + "'>" + Ticket.STATE_CLOSED + "</option>");
                    out.println("<option value='" + Ticket.STATE_OPEN_FAILED + "'>" + Ticket.STATE_OPEN_FAILED + "</option>");
                    out.println("<option value='" + Ticket.STATE_PENDING_TO_OPEN + "'>" + Ticket.STATE_PENDING_TO_OPEN + "</option>");
                    out.println("<option value='" + Ticket.STATE_UPDATED + "'>" + Ticket.STATE_UPDATED + "</option>");

                %>        
            </select>            

        </form>        


        <table border="0" width="100%"   id="table1" >
            <tr>
                <td nowrap width="5%" bgcolor="Gray"><font color="white">Page will refresh in (sec): <span id="countdownPage">0</span></font></td>                
                <td nowrap width="5%" bgcolor="Gray"><font color="white">Data last update since (sec): <span id="countdownData">0</span></font></td>                                   
            </tr>
        </table>        

        <table  border='1'>
            <tr>
                <th>On the map view</th>
                <th>SR number</th>
                <th>sourse</th>
                <th>Parent</th>                
                <th>SR started</th>
                <th>SR stopped</th>
                <th>SR reported</th>  
                <th>SR type</th>  
                <th>Ticket State</th>
                <th>Customer calls</th>
                <th>Bound CTTs</th>
                <th>signature</th>
                <th>reason</th>
                <!--<th>affected</th>-->
            </tr>
            <%                ArrayList<String> alarmIds = new ArrayList(alarmArrayList.keySet());
                Collections.sort(alarmIds, Collections.reverseOrder());
                for (String key : alarmIds) {
                    CCMAlarm myAlarm = alarmArrayList.get(key);
                    //System.out.println("CCM12:alarms key=" + key);

                    String alertOrigin = myAlarm.getAlarmObject().replace(";", "; ");;
                    TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlertStart());
                    T0.addSeconds(-7400);
                    String StatusS = "";
                    boolean isAlive = myAlarm.isStilAlive();
                    if (isAlive) {
                        StatusS = "Ενεργο";
                    } else {
                        StatusS = "Μη ενεργό";
                    }
                    CCMTicket myCCMTicket = null;
                    if (myAlarm.getTicketId() != null) {
                        myCCMTicket = myAlarmsDetectionListener.getTicketsMap().get(myAlarm.getTicketId());
                    }
                    String signatute = "";
                    String sr = "";
                    String incidentStartDate = "";
                    String incidentStoppedDate = "";
                    String srReported = "";
                    if (myCCMTicket != null && myCCMTicket.getSR() != null && !myCCMTicket.getSR().isEmpty()) {
                        if ((!alarmType.equals("ANY") && !alarmType.equals(myCCMTicket.getType()))
                                || (!ticketState.equals("ANY") && (myCCMTicket == null || !ticketState.equals(myCCMTicket.getState())))) {
                            continue;
                        }
                        if (myCCMTicket.getLastSignature() != null) {
                            signatute = myCCMTicket.getLastSignature().getLabel();
                        }
                        sr = myCCMTicket.getSR();
                        if (sr == null) {
                            sr = myCCMTicket.getComments();
                        }
                        try {
                            srReported = new TimeStamp1(myCCMTicket.getIncidentReportedDate()).getNowFormated();
                        } catch (Exception e) {
                        }
                        try {
                            incidentStartDate = new TimeStamp1(myCCMTicket.getIncidentStartDate()).getNowFormated();
                        } catch (Exception e) {
                        }
                        try {
                            incidentStoppedDate = new TimeStamp1(myCCMTicket.getIncidentStoppedDate()).getNowFormated();
                        } catch (Exception e) {
                        }
                        String reason = "N/A";
                        try {
                            reason = myCCMTicket.getAlertMostSignificantReason();
                        } catch (Exception e) {
                        }
                        long impact = myCCMTicket.getCustomerImpact();
                        Double[] latLon = myCCMTicket.getLatLon();
                        //--------
                        if (StatusS.equals("Ενεργο")) {%>
            <tr bgcolor = 'white'>
                <%   } else {%>    
            <tr>
                <%   }%> 
                <%if (latLon != null) {%>
                <td nowrap><a href="map_1.jsp?lat=<%=latLon[0]%>&lon=<%=latLon[1]%>"><IMG src = "fyrom.jpg"/></a></td>
                <%} else 
            {%> <td></td><%}%>
                <td><a href="CCMTicketInfo.jsp?myTicketId=<%=URLEncoder.encode(myAlarm.getTicketId(), "utf-8")%>" target="_blank"><%=sr%></a></td>
                <td><%=alertOrigin%></td> 
                <td><%=myAlarm.getAlarmParent().replace(";", "; ")%></td>                              
                <td><%=incidentStartDate%></td>
                <td><%=incidentStoppedDate%></td>
                <td><%=srReported%></td>
                <td><%=myCCMTicket.getType()%></td>
                <td><%=myCCMTicket.getState().replace("STATE_", "")%></td>
                <td><%=myCCMTicket.getNumOfCalls()%> out of <%=impact%> </td>
                <td><%=myCCMTicket.getNumOfCCTs()%></td>
                <td><%=signatute%></td> 
                <%if (myCCMTicket.getState().equals(Ticket.STATE_OPEN) && false) {%>                
                <td><a href='alarms.jsp?myTicketId=<%=URLEncoder.encode(myCCMTicket.getTicketId(), "UTF-8")%>' target='_blank'>close</a></td>
                <%} else if (myCCMTicket.getState().equals(Ticket.STATE_CLOSED)) {%>                
                <!--<td><a href='tickets.jsp?openTicket=<%=myAlarm.getTicketId()%>' target='_blank'>open</a></td>-->
                <%}%>
                <td><%=reason%></td>
                <!--<td><%=impact%></td>-->
            </tr> 

            <%           }

                }%>        
        </table>

    </body>
</html>



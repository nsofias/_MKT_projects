<%@page import="com.google.gson.Gson"%>
<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="nsofiasLib.ote.alarms.Ticket"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Map,java.net.URLEncoder,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,ccm.CCMonitorStatsObjsContainer,ccm.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02";%>
<%@include file = "sequrityPart.jsp"%>
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
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Alarms</title>
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
        //--- remove alarm ---------
        String remove_alarmId = request.getParameter("remove_alarm");
        String gantt = request.getParameter("gantt");
        if (remove_alarmId != null) {
            CCMAlarm existingAlarm = myCCMonitorStatsObjsContainer.getAlarmArrayList().get(remove_alarmId);
            System.out.println("CCM12:" + remove_alarmId + " existingAlarm is " + existingAlarm);
            if (existingAlarm != null) {
                if (existingAlarm.getTicketId() != null) {
                    System.out.println("CCM12:" + remove_alarmId + " existingAlarm TicketId is not null");
                    CCMTicket myTicket = myAlarmsDetectionListener.getTicketsMap().get(existingAlarm.getTicketId());
                    if (myTicket != null && myTicket.getState().equals(Ticket.STATE_OPEN)) {
                        myTicket.setState(Ticket.STATE_PENDING_TO_CLOSE);
                    }
                }
                myCCMonitorStatsObjsContainer.getAlarmArrayList().remove(remove_alarmId);
                System.out.println("CCM12:" + remove_alarmId + " was removed");
            }
            remove_alarmId = "";
        }

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
        Counters1 reasons = myAggregationsForPeriod.getCurrentResourceCounters(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON);
    %>


    <body>
        <table border="0" width="100%"   id="table1" >
            <tr>
                <td nowrap width="5%" bgcolor="Gray"><font color="white">Page will refresh in (sec): <span id="countdownPage">0</span></font></td>                
                <td nowrap width="5%" bgcolor="Gray"><font color="white">Data last update since (sec): <span id="countdownData">0</span></font></td>                                   
            </tr>
        </table>        
        <%if (gantt != null) {%>
        <IMG width='100%' src='AlarmsServletGantt?from=<%=t1.getNowUnformated()%>&to=<%=t2.getNowUnformated()%>'>
        <%}%>
        <form action="alarms.jsp">
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
            &nbsp;&nbsp;Reason :<select name="reason" onchange="this.form.submit()">                    
                <%
                    String myReason = request.getParameter("reason");
                    if (myReason == null) {
                        myReason = "ANY";
                    }
                    out.println("<option value='ANY'>ANY</option>");
                    List<String> alarmReasons = reasons.getLabelsAsList();
                    for (String reason : alarmReasons) {
                        if (myReason.equals(reason)) {
                            out.println("<option selected value='" + reason + "'>" + reason + "</option>");
                        } else {
                            out.println("<option value='" + reason + "'>" + reason + "</option>");
                        }
                    }
                %>        
            </select>


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


            <%if (request.getParameter(
                        "withSR") != null) {%>
            &nbsp;With SR<input onchange="this.form.submit()" type="checkbox" name="withSR" checked="checked" value="ON" />
            <%} else {%>
            &nbsp;With SR<input onchange="this.form.submit()" type="checkbox" name="withSR" value="ON" />
            <%}%>
        </form>
        <table  border='1' width="100%">
            <tr>
                <th>sourse</th>                
                <th>start</th>
                <th>stop</th>
                <th>type</th>                
                <th>significant reason</th>
                <th>Distinct callers</th>
                <th>Min Ticketing threshold</th>
                <th>Affected users</th>
                <th>SR</th>
                <th>SR reported time</th>
                <!--<th>Previous (closed) SR</th>-->
                <th>Ticket State</th>
                <th>Num Of CTTs</th>
                <th nowrap>signature</th>
                <th>comments</th>                
                <th>weather</th>
                <th>Childs</th>                
            </tr>
            <%
                ArrayList<String> alarmIds = new ArrayList(alarmArrayList.keySet());

                Collections.sort(alarmIds, Collections.reverseOrder());
                for (String key : alarmIds) {
                    CCMAlarm myAlarm = alarmArrayList.get(key);
                    //System.out.println("CCM12:alarms key=" + key);

                    String alertOrigin = myAlarm.getAlarmObject().replace(";", "; ");
                    //System.out.println("CCM12:" + alertOrigin);
                    TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlertStart());
                    TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlarmStop());
                    TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlertStart());
                    T0.addSeconds(-7400);
                    String AlertStart = T1.getNowFormated();
                    String AlarmStop = T2.getNowFormated();
                    String AlertType = myAlarm.getAlarmType();
                    if (AlertType == null) {
                        AlertType = "UNKNOWN";
                    }
                    String AlertTypeS = "";
                    if (AlertType.equals("REASON")) {
                        AlertTypeS = "Reason " + myAlarm.getAlarmObject();
                    } else {
                        AlertTypeS = AlertType;
                    }
                    String AlertMostSignificantReason = myAlarm.getAlertMostSignificantReason();
                    if ((!alarmType.equals("ANY") && !alarmType.equals(AlertType))
                            || (!myReason.equals("ANY") && !myReason.equals(AlertMostSignificantReason))) {
                        continue;
                    }
                    String StatusS = "";
                    boolean isAlive = myAlarm.isStilAlive();
                    if (isAlive) {
                        StatusS = "Ενεργο";
                    } else {
                        StatusS = "Μη ενεργό";
                    }
                    String resource = myAlarm.getAlarmObject();
                    CCMTicket myCCMTicket = null;
                    if (myAlarm.getTicketId() != null) {
                        myCCMTicket = myAlarmsDetectionListener.getTicketsMap().get(myAlarm.getTicketId());
                    }
                    String mySignature = "";
                    String srReported = "";
                    if (!ticketState.equals("ANY") && (myCCMTicket == null || !ticketState.equals(myCCMTicket.getState()))) {
                        continue;
                    }
                    String impact = "N/A";
                    if (myCCMTicket != null) {
                        try {
                            impact = String.valueOf(myCCMTicket.getCustomerImpact());
                            if (myCCMTicket.getLastSignature() != null) {
                                mySignature = myCCMTicket.getLastSignature().getLabel() + ":" + myCCMTicket.getLastSignature().getSynopsis();
                            }

                            srReported = new TimeStamp1(myCCMTicket.getIncidentReportedDate()).getNowFormated();
                        } catch (Exception e) {
                        }
                    }
                    if (request.getParameter("withSR") != null && myCCMTicket.getSR() == null) {
                        continue;
                    }
                    String childs = "";
                    if (myAlarm.getDesc() != null) {
                        childs = myAlarm.getDesc().replace(";", "; ");
                    }
                    //---------
                    Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");
                    int createTicketMinCallsDefault = myParameters.getIntValue("createTicketMinCalls.DEFAULT", 5);
                    long createTicketMinCallsForType = myParameters.getIntValue("createTicketMinCalls." + AlertType, createTicketMinCallsDefault);
                    //**********************************- dynamic ******************************************* 
                    if (myAlarm.getAffectedCustomers() > 0) {
                        createTicketMinCallsForType = 3 + java.lang.Math.round(0.002 * myAlarm.getAffectedCustomers());
                    }
                    //-----
                    if (StatusS.equals("Ενεργο")) {%>
            <tr bgcolor = 'white'>
                <%   } else {%>    
            <tr>
                <%   }%> 
                <td><%=alertOrigin%></td>                                
                <td nowrap><%=AlertStart.substring(0, 16)%></td>
                <td nowrap><%=AlarmStop.substring(0, 16)%></td>  
                <td><%=AlertTypeS%></td>  
                <td><%=AlertMostSignificantReason%></td> 
                <td><a href='numbers_called.jsp?resourceType=<%=AlertType%>&resource=<%=URLEncoder.encode(resource, "UTF8")%>&from=<%=T2.getNowUnformated()%>&to=<%=T1.getNowUnformated()%>' target='_blank'><%=(int) myAlarm.getTotalCalls()%> </a></td>                
                <td><%=createTicketMinCallsForType%></td>  
                <td><%=impact%></td> 
                <%if (myCCMTicket != null) {
                        String sr = myCCMTicket.getSR() != null ? myCCMTicket.getSR() : "";
                %>                  
                <td><a href="CCMTicketInfo.jsp?myTicketId=<%=URLEncoder.encode(myAlarm.getTicketId(), "utf-8")%>" target="_blank"><%=sr%></a></td>                                 
                <td><%=srReported%></td>
                <td><%=myCCMTicket.getState().replace("STATE_", "")%></td>
                <td><%=myCCMTicket.getNumOfCCTs()%></td>
                <td><%=mySignature%></td> 
                <td><%=myCCMTicket.getComments().replace(";", "; ")%></td>                             
                <td><%=myAlarm.getWeatherInfo()%></td> 
                <td><%=childs%></td>   
                <%} else {%>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td>-</td>
                <td><%=myAlarm.getWeatherInfo()%></td>  
                <td><%=childs%></td>                                   
                <%}%>
                <!--
                <td><a href='alarms.jsp?remove_alarm=<%=URLEncoder.encode(key, "utf-8")%>' target='_blank'>remove</a></td>
                -->
                </b>  

            </tr>        
            <%

                }%>        
        </table>

    </body>
</html>



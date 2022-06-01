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
<% String userTypes = "00,01,02";%>
<%@include file = "../sequrityPart.jsp"%>
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
    AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
    String type = request.getParameter("type");
    String noheaders = request.getParameter("noheaders");
    String criticality_ = request.getParameter("criticality");
    String simpleView = request.getParameter("simpleView");
    String unhidden = request.getParameter("unhidden");//uncanceled
    String uncanceled = request.getParameter("uncanceled");
    String status = request.getParameter("status");
    String subType = request.getParameter("subType");
    String search = request.getParameter("search");
    String title = request.getParameter("title");
    if (title == null) {
        title = "";
    }

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
    Map<String, CCMAlarm> alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
    if (alarmArrayList.isEmpty()) {
        out.println("<h2>No current alarms found ...</h2>");
        return;
    }
    int disconnected = -1;
    try {
        disconnected = Integer.parseInt(request.getParameter("disconnected"));
    } catch (Exception e) {
    }
    Map<String, String[]> parameters = request.getParameterMap();
    //--------------------------     
    String _parameters = "";
    for (String key : parameters.keySet()) {
        //out.println("<p>"+key + "=" + parameters.get(key)[0]);
        if (!key.equals("open") && !key.equals("remove")) {
            _parameters += key + "=" + parameters.get(key)[0] + "&";
        }
    }
    if (status == null || status.isEmpty()) {
        status = "ALL";
    }
    if (type == null || type.isEmpty()) {
        type = "ALL";
    }
    if (subType == null || subType.isEmpty()) {
        subType = "ALL";
    }
    int criticality = 0;

    if (criticality_ == null || criticality_.isEmpty()) {
        criticality = 0;
    } else {
        criticality = Integer.parseInt(criticality_);
    }
    String criticality_S = "ALL";
    if (criticality == Ticket.CRITICALITY_WARNING) {
        criticality_S = "WARNING";
    } else if (criticality == Ticket.CRITICALITY_MINOR) {
        criticality_S = "MINOR";
    } else if (criticality == Ticket.CRITICALITY_MAJOR) {
        criticality_S = "MAJOR";
    } else if (criticality == Ticket.CRITICALITY_CRITICAL) {
        criticality_S = "CRITICAL";
    } else {
        criticality_S = "ALL";
    }
    if (search == null) {
        search = "";
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tickets</title>
        <link rel="stylesheet" href="../global.css">
    </head>
    <h1><%=title%></h1>
    <%if (noheaders == null) {%>
    <p><form name="critucalityform" action="tickets_MKT.jsp">
        Recent Tickets &nbsp;                 

        Criticality:<select  onchange="this.form.submit()" name="criticality"> 
            <option value="<%=criticality%>"><%=criticality_S%></option>
            <option  value="1">WARNING</option>
            <option  value="2">MINOR</option>
            <option value="3">MAJOR</option> 
            <option value="4">CRITICAL</option>
            <option value="0">ALL</option>
        </select> 
        Status:
        <select  onchange="this.form.submit()" name="status"> 
            <option value="<%=status%>"><%=status%></option>
            <option value="OPEN">Open</option>
            <option value="ALL">All</option>
        </select> 


        subType:
        <select  onchange="this.form.submit()" name="subType">                                 
            <option value="<%=subType%>"><%=subType%></option>
            <% if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER)) {%>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SERVING_AREA%>">SERVING_AREA</option>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_ATC%>">ATC</option>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_DSLAM%>">DSLAM</option>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SLOT%>">SLOT</option>
            <option value="ALL">ALL</option>
            <%}%>
            <% if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE)) {%>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_ATC%>">ATC</option>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_CABLE%>">CABLE</option>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_DP%>">DP</option>
            <option value="ALL">ALL</option>
            <%}%>      
            <% if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON)) {%>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_OLT%>">OLT</option>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SHELF%>">SHELF</option>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SLOT%>">SLOT</option>
            <option value="ALL">ALL</option>

            <%}%>  
            <% if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE)) {%>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_CABLE_ATC%>">ATC</option>        
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_CABLE%>">CABLE</option>
            <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_BOX%>">BOX</option>
            <option value="ALL">ALL</option>
            <%}%>                     
        </select>                
        &nbsp;&nbsp;&nbsp;&nbsp;type ticketId or SR and press ENTER:<input type="text" name="search" onchange="this.form.submit()"  value="<%=search%>" size="25" />
        <%if (unhidden == null) {%>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hide 'pending'? :<input type="checkbox" onchange="this.form.submit()" name="unhidden" value="ON" />
        <%} else {%>
        &nbsp;&nbsp;&nbsp;&nbsp;Hide 'pending'? :<input type="checkbox" onchange="this.form.submit()" name="unhidden" value="ON" checked="checked"/>
        <%}%>
        <%if (uncanceled == null) {%>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hide 'canceled'? :<input type="checkbox" onchange="this.form.submit()" name="uncanceled" value="ON" />
        <%} else {%>
        &nbsp;&nbsp;&nbsp;&nbsp;Hide 'canceled'? :<input type="checkbox" onchange="this.form.submit()" name="uncanceled" value="ON" checked="checked"/>
        <%}%>    
        <input type="hidden" name="title" value="<%=title%>" />
        <input type="hidden" name="type" value="<%=type%>" />
        <input type="hidden" name="subType" value="<%=subType%>" />
        <input type="hidden" name="disconnected" value="<%=disconnected%>" />
        <input type="hidden" name="status" value="<%=status%>" />
        <input type="hidden" name="criticality" value="<%=criticality_%>" />        
    </form>   
    <p><a href="alarms_MKT.jsp?type=<%=type%>">go to Alarms</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="map.jsp?status=OPEN"><IMG src = "fyrom.jpg"/></a></p>
            <%}       %>        

    <table  width="100%" border='1'>

        <tr>     
            <th>map</th>
            <th>R</th>
            <th>Description</th>
            <th>Element type</th>
            <th>Number of elements</th>                  
            <th>Started</th>
            <th>Reported</th>
            <th>Stopped/Last update</th>                     
            <th>Status</th>
            <th>Registered lines</th>                
            <th>Criticality</th>
            <th>TicketId</th>
        </tr>            


        <%
            //***********************************************************************************
            List<Ticket_FYROM> ticketsList = alarmArrayList.values().stream()
                    .filter(v -> v.getTicketId() != null)
                    .map(v -> (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(v.getTicketId()))
                    .filter(v -> v != null)
                    .map(v -> v.getMyTicket_IBM()).filter(v -> v != null).sorted(( tt1,  tt2) -> tt1.getIncidentStartDate().compareTo(tt2.getIncidentStartDate()) > 0 ? -1 : 1)
                    .collect(Collectors.toList());
            //***********************************************************************************
            for (Ticket_FYROM myTicket : ticketsList) {
                //*********** delit it *********************************
                /*
                if (myTicket.getIncidentStoppedDate() != null) {
                    myTicket.setState(Ticket.STATE_CLOSED);
                }*/
                //****************************
                if (criticality != 0 && myTicket.getCriticality() < criticality) {
                    continue;
                }
                if (disconnected != 0 && myTicket.findLinesDisconnected() < disconnected) {
                    continue;
                }
                if (!subType.equals("ALL") && !subType.equals(myTicket.getSubType())) {
                    continue;
                }
                if (status.equals("OPEN") && !myTicket.isOpen()) {
                    continue;
                }
                try {
                    if (search != null && !search.isEmpty()) {
                        if (!myTicket.getSYNOPSIS().contains(search) && !myTicket.getTicketId().contains(search) && (myTicket.getSR() == null || !myTicket.getSR().equals(search))) {
                            continue;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Tickets.jsp error for:" + myTicket.getCollerationString());
                    continue;
                }
                String AlertStart = "", AlertReported = "", AlertStop = "";
                try {
                    AlertStart = new TimeStamp1(myTicket.getIncidentStartDate()).getNowFormated().substring(0, 16);
                } catch (Exception e) {
                }
                try {
                    AlertReported = new TimeStamp1(myTicket.getIncidentReportedDate()).getNowFormated().substring(0, 16);
                } catch (Exception e) {
                }
                try {
                    AlertStop = new TimeStamp1(myTicket.getIncidentStoppedDate()).getNowFormated().substring(0, 16);
                } catch (Exception e) {
                }

                String ticketId = myTicket.getTicketId();
                String color = "blue";
                String desc = myTicket.getSYNOPSIS();//getDesc_html(myTicket);
                int pos;
                if ((pos = desc.indexOf(":")) > 0) {
                    desc = desc.substring(pos + 1);
                }
                String myStatus = "";
                if (myTicket.isOpen()) {
                    myStatus = "<font color='green'><b>" + myTicket.getState() + "</b></font>";
                } else if (myTicket.getState().equals(Ticket_FYROM.STATE_OPEN_FAILED) || myTicket.getState().equals(Ticket_FYROM.STATE_CLOSE_FAILED)) {
                    myStatus = "<font color='red'>" + myTicket.getState() + "</font>";
                } else {
                    myStatus = "<font color='grey'>" + myTicket.getState() + "</font>";
                }
                //---------------
                int numberOfElements = myTicket.getElementsList().size();
                String sr = "";
                if (myTicket.getSR() != null) {
                    sr = myTicket.getSR();
                } else {
                    continue;
                }
                //-------------------------------------------------------------------------------------
                if (myTicket.isStillAlive()) {
        %> 
        <tr bgcolor='white'>             
            <td nowrap><a onclick="openMap('<%=ticketId%>')"><IMG src = "fyrom.jpg"/></a></td>
                    <%
                        if (myTicket.isRepeated()) {%>
            <td nowrap>R</td>
            <% } else {%>
            <td nowrap></td>
            <% }%>                                                   
            <td style="width:100px"><%=desc%></td>
            <td nowrap><%=myTicket.getSubType()%></td> 
            <td nowrap><a href="alarms_MKT.jsp?text=<%=URLEncoder.encode(new Gson().toJson(myTicket), "UTF-8")%>" target="_blank"><%=numberOfElements%></a></td>
            <td nowrap><%=AlertStart%></td>
            <td nowrap><%=AlertReported%></td>
            <td nowrap></td>
            <td nowrap><a onclick="openEventsLog('<%=ticketId%>')"><font color='<%=color%>'><%=myStatus%></font></a></td>                                
            <td nowrap><a href="linesRegistered.jsp?type=<%=myTicket.getType()%>&path=<%=URLEncoder.encode(myTicket.getElementsList().get(0).getAlarmObject(), "UTF-8")%>" target="_blank"><%=myTicket.getCurrentUsersRegistered()%></a></td>                                                                                
            <td nowrap><%=myTicket.getCriticalityDesc(myTicket.getCriticality())%></td>  
            <td nowrap><a href="../ticketInfo.jsp?text=<%=URLEncoder.encode(new Gson().toJson(myTicket), "UTF-8")%>" target="_blank"><%=sr%></a>
                <%if (myTicket.isPowerSupplyRelated()) {%>
                <img src="../img/power.jpg" width="15" height="15" alt=" P "/>
                <%}%>                 
            </td>                              
        </tr> 
        <%              } else {
        %>
        <tr>             
            <td nowrap><a onclick="openMap('<%=ticketId%>')"><IMG src = "fyrom.jpg"/></a></td>
                    <%
                        if (myTicket.isRepeated()) {%>
            <td nowrap>R</td>
            <% } else {%>
            <td nowrap></td>
            <% }%>                  
            <td style="width:100px"><%=desc%></td>                
            <td nowrap><%=myTicket.getSubType()%></td>    
            <td nowrap><a href="alarms_MKT.jsp?type=<%=myTicket.getType()%>&ticketId=<%=URLEncoder.encode(ticketId, "UTF-8")%>" target="_blank"><%=numberOfElements%></a></td>
            <td nowrap><%=AlertStart%></td>                
            <td nowrap><%=AlertReported%></td>
            <td nowrap><%=AlertStop%></td>
            <td nowrap><a onclick="openEventsLog('<%=ticketId%>')"><font color='<%=color%>'><%=myStatus%></font></a></td>            
            <td nowrap><a href="linesRegistered.jsp?type=<%=myTicket.getType()%>&path=<%=URLEncoder.encode(myTicket.getElementsList().get(0).getAlarmObject(), "UTF-8")%>" target="_blank"><%=myTicket.getCurrentUsersRegistered()%></a></td>
            <td nowrap><%=myTicket.getCriticalityDesc(myTicket.getCriticality())%></td>    
            <td nowrap><a href="../ticketInfo.jsp?text=<%=URLEncoder.encode(new Gson().toJson(myTicket), "UTF-8")%>" target="_blank"><%=sr%></a>
                <%if (myTicket.isPowerSupplyRelated()) {%>
                <img src="../img/power.jpg" width="15" height="15" alt=" P "/>
                <%}%>                   
            </td>                    
        </tr> 
        <%                  }
            }
        %>
    </table>
</body>
</html>


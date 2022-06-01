
<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="diligent_MKT.Ticket_FYROM"%>
<%@page import="java.net.URLEncoder,java.util.Map,nsofiasLib.ote.alarms.*,java.util.Iterator,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02,04";%>
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
    ServletContext myContext = request.getServletContext();
    try {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    } catch (Exception e) {
    }
    //------------------------------
    String title = request.getParameter("title");
    if (title == null) {
        title = "";
    }
    String open_ticketId = request.getParameter("open");
    String remove_ticketId = request.getParameter("remove");
    String type = request.getParameter("type");
    String noheaders = request.getParameter("noheaders");
    String criticality_ = request.getParameter("criticality");
    String simpleView = request.getParameter("simpleView");
    String unhidden = request.getParameter("unhidden");//uncanceled
    String uncanceled = request.getParameter("uncanceled");
    String status = request.getParameter("status");
    String subType = request.getParameter("subType");
    String search = request.getParameter("search");
    int disconnected = -1;
    try {
        disconnected = Integer.parseInt(request.getParameter("disconnected"));
    } catch (Exception e) {
    }
    Map<String, String[]> parameters = request.getParameterMap();
    //--------------------------     
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    //-----------------------------------------------------------
    String _parameters = "";
    //parameters.remove("open");
    for (String key : parameters.keySet()) {
        //out.println("<p>"+key + "=" + parameters.get(key)[0]);
        if (!key.equals("open") && !key.equals("remove")) {
            _parameters += key + "=" + parameters.get(key)[0] + "&";
        }
    }
    //out.println("<p>_parameters=" + _parameters);
    //-----------------
    if (open_ticketId != null) {
        //out.println("open_ticketId = " + open_ticketId);
        //out.println("open_ticketId type = " + type);

        for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
            if (type == null || (type.equals(myGroupBy_Daemon.getDesc()))) {
                out.println("open_ticketId myGroupBy_Daemon.getDesc() = " + myGroupBy_Daemon.getDesc());
                try {
                    Map<String, Ticket_FYROM> list = myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList();
                    Ticket_FYROM myTicket = list.get(open_ticketId);
                    if (myTicket != null) {
                        //out.println("open_ticketId FPOUND!!!!!!!!!!!!!! ");
                        myTicket.setBUSY(false);
                        myTicket.setOpenImediately(true);
                    }
                } catch (Exception e) {
                    out.println("open_ticketId error for " + open_ticketId);
                }
            }
        }
    }
    //-----------------
    if (remove_ticketId != null) {
        //out.println("remove_ticketId = " + remove_ticketId);
        //out.println("remove_ticketId type = " + type);

        for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
            if (type == null || (type.equals(myGroupBy_Daemon.getDesc()))) {
                out.println("remove_ticketId myGroupBy_Daemon.getDesc() = " + myGroupBy_Daemon.getDesc());
                try {
                    Map<String, Ticket_FYROM> list = myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList();
                    list.remove(remove_ticketId);
                    out.println("remove_ticketId FPOUND!!!!!!!!!!!!!! ");
                } catch (Exception e) {
                    out.println("remove_ticketId error for " + remove_ticketId);
                }
            }
        }
    }

    //Container myCCMonitorStatsObjsContainer = null;    
    List<Ticket_FYROM> ticketsList = new ArrayList();
    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
        if (type == null || (type.equals(myGroupBy_Daemon.getDesc()))) {
            ticketsList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsAsArrayList());
        }
    }
    try {
        Collections.sort(ticketsList);
    } catch (Exception e) {
    }
    //out.println(ticketsList.size());
    //----------------------------------------
    //==========    

    if (status == null || status.isEmpty()) {
        status = "ALL";
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
    //------------- for Data refresh ----------------
    Config myConfig = (Config) myContext.getAttribute("myConfig");
    double myFileParserDaemonTimeStamp_fromNow = 300;
%>

<!DOCTYPE html>

<html>
    <head>
        <title>Siebel Tickets</title>
        <link rel="stylesheet" href="global_1.css">
        <script  type="text/javascript">
            var max_timePage = 120;
            var max_timeData = <%=myFileParserDaemonTimeStamp_fromNow%>;
            if (max_timeData < 0) {
                max_timeData = 120;
            }
            var cinterval;

            function countdown_timer() {
                max_timePage--;
                max_timeData--;
                document.getElementById('countdownPage').innerHTML = max_timePage;
                if (max_timeData < 0)
                {
                    document.getElementById('countdownData').innerHTML = "READY";
                    window.location.reload(true);
                } else
                {
                    document.getElementById('countdownData').innerHTML = max_timeData;
                }
                //
                if (max_timePage === 0) {
                    clearInterval(cinterval);
                }
            }
            // 1,000 means 1 second.
            cinterval = setInterval('countdown_timer()', 1000);
        </script>

        <script type="text/javascript">
            function openAlert(ticketId) {
                var myAlertWindow = window.open("alarms.jsp?type=<%=type%>&ticketId=" + ticketId, "myWindow",
                        "status = 1, left=0, top=0, height = 300, width = 800, resizable = 0");
                myAlertWindow.focus;
            }
            function openMap(SR) {
                var myAlertWindow = window.open("map.jsp?SR=" + SR, "myWindow",
                        "status = 1, left=0, top=0, height = 650, width = 650, resizable = 0");
                myAlertWindow.focus;
            }
            function openEventsLog(SR) {
                var myAlertWindow = window.open("events.jsp?SR=" + SR, "myWindow",
                        "status = 1, left=0, top=0, height = 400, width = 500, resizable = 0");
                myAlertWindow.focus;
            }
        </script>         
    </head>


    <body  bgcolor="#D6DFF7">
        <%
            //  ----------- END OF SEQURITY CHECK ---------------    
            if (simpleView == null)//not simpleView
            {
        %>

        <table border="0" width="100%"   id="table1" >
            <tr>
                <td nowrap width="10%" bgcolor="grey"><font color="white">Logged in as:<%=username%></font></td>    
                <td nowrap width="40%" bgcolor="grey"><font color="white">Page refresh: <span id="countdownPage">0</span>s</font></td>                
                <td nowrap width="40%" bgcolor="grey"><font color="white">Data refresh: <span id="countdownData">0</span>s</font></td>                
            </tr>
        </table>  


        <h1><%=title%></h1>
        <%if (noheaders == null) {%>
        <p><form name="critucalityform" action="tickets.jsp">
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
        <p><a href="alarms.jsp?type=<%=type%>">go to Alarms</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="map.jsp?status=OPEN"><IMG src = "img/fyrom.jpg"/></a></p>
                <%}       %>        
                <%}%>
        <table  border='1'>

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
                <th>Comments</th>
                <th>disconnected / last update</th>
                <th>Registered lines</th>                
                <th>Criticality</th>
                <th>TicketId</th>
                <th>action</th>
                    <%if (userType.equals("00")) {%>                    
                <th>-</th>
                    <%}%>
            </tr>            


            <%
                //TimeStamp1 myT1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());

//                Counters topScorers = myCCMonitorStatsObjsContainer.getTopScorers_events(T1, T2);
                int count = 0;
                for (Object myAlarmObj : ticketsList) {
                    Ticket_FYROM myTicket = (Ticket_FYROM) myAlarmObj;
                    if (myTicket.getElementsList().size() == 0) {
                        //continue;
                    }
                    if (unhidden != null && myTicket.getState().equals(Ticket_FYROM.STATE_PENDING_TO_OPEN)) {
                        continue;
                    }
                    if (uncanceled != null && myTicket.getState().equals(Ticket_FYROM.STATE_CANCELED)) {
                        continue;
                    }
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
                    long usersDisconnected = myTicket.findLinesDisconnected();
                    long currentUsersDisconnected = myTicket.getCurrentUsersDisconnected();
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
                    String myComments = myTicket.getComments();
                    //---------------
                    int numberOfElements = myTicket.getElementsList().size();
                    String tType = myTicket.getType().replace("TYPE_", "");
                    if (++count > 1250) {
                        break;
                    }
                    String sr = "N/A";
                    if (myTicket.getSR() != null) {
                        sr = myTicket.getSR();
                    }
                    //-------------------------------------------------------------------------------------
                    if (myTicket.isStillAlive()) {
                        String encParms = _parameters + "open=" + URLEncoder.encode(ticketId, "UTF-8");
                        String encParms1 = _parameters + "remove=" + URLEncoder.encode(ticketId, "UTF-8");
            %> 
            <tr>             
                <td nowrap><a onclick="openMap('<%=ticketId%>')"><IMG src = "img/fyrom.jpg"/></a></td>
                        <%
                            if (myTicket.isRepeated()) {%>
                <td nowrap>R</td>
                <% } else {%>
                <td nowrap></td>
                <% }%>                                                   
                <td style="width:100px"><%=desc%></td>
                <td nowrap><%=myTicket.getSubType()%></td> 
                <td nowrap><a href="alarms.jsp?type=<%=type%>&ticketId=<%=URLEncoder.encode(ticketId, "UTF-8")%>" target="_blank"><%=numberOfElements%></a></td>
                <td nowrap><%=AlertStart%></td>
                <td nowrap><%=AlertReported%></td>
                <td nowrap></td>
                <td nowrap><a onclick="openEventsLog('<%=ticketId%>')"><font color='<%=color%>'><%=myStatus%></font></a></td> 
                <td nowrap><%=myComments%></td>                
                <td nowrap align="center"><%=usersDisconnected%>/<font color="red"><%=currentUsersDisconnected%></font></td>                                  
                <td nowrap><a href="linesRegistered.jsp?type=<%=type%>&ticketId=<%=URLEncoder.encode(ticketId, "UTF-8")%>" target="_blank"><%=myTicket.getCurrentUsersRegistered()%></a></td>                                                                                
                <td nowrap><%=myTicket.getCriticalityDesc(myTicket.getCriticality())%></td>  
                <td nowrap><a href="correlation_info.jsp?sr=<%=URLEncoder.encode(sr, "UTF-8")%>" target="_blank"><%=sr%></a>
                    <%if (isDyingGasp(myTicket)) {%>
                    <img src="img/power.jpg" width="15" height="15" alt=" P "/>
                    <%}%>                 
                </td>                  
                <%
                    if (myTicket.getState().equals(Ticket_FYROM.STATE_PENDING_TO_OPEN) || myTicket.getState().equals(Ticket_FYROM.STATE_OPEN_FAILED)) {
                %>
                <td><a href="tickets.jsp?<%=encParms%>"><IMG src = "img/open.jpg"/></a></td>
                        <%
                        } else {%>
                <td></td>
                <%          }
                    if (userType.equals("00")) {%>
                <td><a href="tickets.jsp?<%=encParms1%>">remove</a></td>
                <%}%>


            </tr> 
            <%              } else {
                String encParms1 = _parameters + "remove=" + URLEncoder.encode(ticketId, "UTF-8");
            %>
            <tr bgcolor='#E5E4E2'>             
                <td nowrap><a onclick="openMap('<%=ticketId%>')"><IMG src = "img/fyrom.jpg"/></a></td>
                        <%
                            if (myTicket.isRepeated()) {%>
                <td nowrap>R</td>
                <% } else {%>
                <td nowrap></td>
                <% }%>                  
                <td style="width:100px"><%=desc%></td>                
                <td nowrap><%=myTicket.getSubType()%></td>    
                <td nowrap><a href="alarms.jsp?type=<%=type%>&ticketId=<%=URLEncoder.encode(ticketId, "UTF-8")%>" target="_blank"><%=numberOfElements%></a></td>
                <td nowrap><%=AlertStart%></td>                
                <td nowrap><%=AlertReported%></td>
                <td nowrap><%=AlertStop%></td>
                <td nowrap><a onclick="openEventsLog('<%=ticketId%>')"><font color='<%=color%>'><%=myStatus%></font></a></td>
                <td nowrap><%=myComments%></td>      
                <td nowrap align="center"><%=usersDisconnected%>/<font color="red"><%=currentUsersDisconnected%></font></td>  
                <td nowrap><a href="linesRegistered.jsp?type=<%=type%>&ticketId=<%=URLEncoder.encode(ticketId, "UTF-8")%>" target="_blank"><%=myTicket.getCurrentUsersRegistered()%></a></td>    
                <td nowrap><%=myTicket.getCriticalityDesc(myTicket.getCriticality())%></td>    
                <td nowrap><a href="correlation_info.jsp?sr=<%=URLEncoder.encode(sr, "UTF-8")%>" target="_blank"><%=sr%></a>
                    <%if (isDyingGasp(myTicket)) {%>
                    <img src="img/power.jpg" width="15" height="15" alt=" P "/>
                    <%}%>                   
                </td>                    

                <%      if (userType.equals("00")) {%>                                 
                <td><a href="tickets.jsp?<%=encParms1%>">remove</a></td>
                <%    } %>     

            </tr> 
            <%                  }
                }
            %>
        </table>
    </body>
</html>

<%!
    boolean isDyingGasp(Ticket_FYROM myTicket) {
        for (Alarm_FYROM myAlarm : myTicket.getElementsList()) {
            if (myAlarm.isDyingGasp()) {
                return true;
            }
        }
        return false;
    }
%>


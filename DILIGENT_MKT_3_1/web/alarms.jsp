<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="diligent_MKT.Ticket_FYROM"%>
<%@page import="java.net.URLEncoder,nsofiasLib.ote.alarms.*,java.util.Map,nsofiasLib.utils.URLContextReader_object,nsofiasLib.ote.DSLAMs.DslamDetailsFinder,nsofiasLib.ote.DSLAMs.DslamDetails,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
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
<!DOCTYPE html>
<html>


    <head>
        <title>Alarms</title>
        <link rel="stylesheet" href="global_1.css">
        <script  type="text/javascript">
            var max_timePage = 120;
            var max_timeData = 120;
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
    </head>
    <body  bgcolor="#D6DFF7">  

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
            //------------------------------status,type,subType,criticality,source-----------------
            String title = request.getParameter("title");
            if (title == null)
                {
                title = "";
                }
            String status = request.getParameter("status");
            if (status == null || status.isEmpty())
                {
                status = "ALL";
                }
            String type = request.getParameter("type");
            if (type == null || type.isEmpty())
                {
                type = "ALL";
                }
            String subType = request.getParameter("subType");
            if (subType == null || subType.isEmpty())
                {
                subType = "ALL";
                }
            int criticality = 0;
            try
                {
                criticality = Integer.valueOf(request.getParameter("criticality"));
                }
            catch (Exception e)
                {
                criticality = 0;
                }
            String source = request.getParameter("source");
            if (source == null || source.isEmpty())
                {
                source = "";
                }
            //---------------------------------------------------------
            String ticketId = request.getParameter("ticketId");
            if (ticketId != null)
                {
                ticketId = new String(request.getParameter("ticketId").getBytes("iso-8859-1"), "UTF-8");
                out.println("alarms with ticketId:" + ticketId);
                }

            Diligent_Daemon myGroupBy_Daemon = null;
            ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
            for (Diligent_Daemon myDaemon : myGroupBy_Daemons)
                {                    
                if (type != null && (type.equals(myDaemon.getDaemonName())))
                    {                    
                    myGroupBy_Daemon = myDaemon;
                    //out.println(alarmArrayList.size());
                    }
                }
            if (myGroupBy_Daemon == null)
                {
                out.println("<p><h1>  Please use the left side menu to continue...</h1>");
                return;
                }
            //---------------------------
            List alarmArrayList = new ArrayList();
            if (ticketId != null)
                {
                Container myContainer = myGroupBy_Daemon.getMyStatsObjContainer();
                Map<String, Ticket_FYROM> tickets = myContainer.getTicketsArrayList();                
                if (tickets.get(ticketId) == null)
                    {
                    for (String key : tickets.keySet())
                        {
                        out.println("<p>'" + key + "'");
                        }
                    out.println("<p>'" + ticketId + "'");
                    return;
                    }
                List myList = tickets.get(ticketId).getElementsList();
                alarmArrayList.addAll(myList);
                }
            else
                {
                alarmArrayList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getAlarmArrayList());
                System.out.println("sss "+type+"   alarmArrayList size:"+alarmArrayList.size());
                }
            try
                {
                Collections.sort(alarmArrayList);
                }
            catch (Exception e)
                {
                }
            //------------- for Data refresh ----------------
            Config myConfig = (Config) myContext.getAttribute("myConfig");
            String killAll = request.getParameter("killAll");
            if (killAll != null)
                {
                for (Object myAlarmObj : alarmArrayList)
                    {
                    nsofiasLib.ote.alarms.Alarm myAlarm = (nsofiasLib.ote.alarms.Alarm) myAlarmObj;
                    if (myAlarm.isStilAlive())
                        {
                        myAlarm.setState(nsofiasLib.ote.alarms.Alarm.STATE_CLOSED);
                        }
                    }
                }
            String kill = request.getParameter("kill");
            if (kill != null)
                {
                for (Object myAlarmObj : alarmArrayList)
                    {
                    Alarm_FYROM myAlarm = (Alarm_FYROM) myAlarmObj;
                    if (myAlarm.getNetworkElementName() == null || (myAlarm.isStilAlive() && myAlarm.getNetworkElementName().equals(kill)))
                        {
                        myAlarm.setState(Alarm_FYROM.STATE_PENDING_TO_CLOSE);
                        //              alarmArrayList.remove(myAlarm);
                        break;
                        }
                    }
                }

            //---------------------------------------------------------- 
            TimeStamp1 t1, t2;
            try
                {
                if (request.getParameter("from") != null)
                    {
                    t1 = new TimeStamp1(request.getParameter("from"));
                    }
                else
                    {
                    t1 = new TimeStamp1();
                    }
                }
            catch (Exception e)
                {
                out.println("NO CLOCK YET!!!!!!!!");
                return;
                }
            t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addHours(-24);
        %>


        <%  if (ticketId == null)
                {%>
        <table border="0" width="100%"   id="table1" >
            <tr>
                <td nowrap width="10%" bgcolor="grey"><font color="white">Logged in as:<%=username%></font></td>    
                <td nowrap width="40%" bgcolor="grey"><font color="white">Page refresh: <span id="countdownPage">0</span>s</font></td>                
                <td nowrap width="40%" bgcolor="grey"><font color="white">Data refresh: <span id="countdownData">0</span>s</font></td>                
            </tr>
        </table>      
        <h1><%=title%></h1>
        <p><form name="critucalityform" action="alarms.jsp?type=<%=type%>">
            Status:
            <select  onchange="this.form.submit()" name="status">                                 
                <option value="<%=status%>"><%=status%></option>
                <option value="alive">alive</option>
                <option value="ALL">ALL</option>
            </select>  
            subType:
            <select  onchange="this.form.submit()" name="subType">                                 
                <option value="<%=subType%>"><%=subType%></option>
                <% if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER))
                        {%>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SERVING_AREA%>">SERVING_AREA</option>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_ATC%>">ATC</option>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_DSLAM%>">DSLAM</option>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SLOT%>">SLOT</option>
                <option value="ALL">ALL</option>
                <%}%>
                <% if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE))
                        {%>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_ATC%>">ATC</option>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_CABLE%>">CABLE</option>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_DP%>">DP</option>
                <option value="ALL">ALL</option>
                <%}%>      
                <% if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON))
                        {%>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_OLT%>">OLT</option>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SHELF%>">SHELF</option>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SLOT%>">SLOT</option>
                <option value="ALL">ALL</option>
                <%}%>  
                <% if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE))
                        {%>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_CABLE_ATC%>">ATC</option>        
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_CABLE%>">CABLE</option>
                <option value="<%=diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_BOX%>">BOX</option>
                <option value="ALL">ALL</option>
                <%}%>                     
            </select>
            criticality >=:
            <select  onchange="this.form.submit()" name="criticality">                                 
                <option value="<%=criticality%>"><%=criticality_desc(criticality)%></option>
                <option value="1">WARNING</option>
                <option value="2">MINOR</option>
                <option value="3">MAJOR</option>
                <option value="4">CRITICAL</option>
                <option value="5">TOP CRITICAL</option>
            </select>                  
            <input type="text" name="source" value="<%=source%>" />
            <input type="hidden" name="type" value="<%=type%>" />
            <input type="hidden" name="subType" value="<%=subType%>" />
            <input type="hidden" name="criticality" value="<%=criticality%>" />
        </form>

        <%
                }
            //------------------------------------
            String elType = "";
            if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER))
                {
                elType = "Host : RSU : DSLAM : slot";
                }
            else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE))
                {
                elType = "RSU : Cable : DP";
                }
            else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON))
                {
                elType = "OLT : Shelf : Slot";
                }
            else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE))
                {
                elType = "ATC : Cable : BOX";
                }
        %>                        
        <!-- 
                <table  border='1'>                             
                    <tr><IMG width='100%' src='AlarmsServletGantt?from=<%=t1.getNowUnformated()%>&to=<%=t2.getNowUnformated()%>'></tr>            
                </table>
        -->
        <table  border='1' width='100%'>
            <tr bgcolor="LightBlue">
                <th></th>
                <th><%=elType%></th>
                <th>Element sub Type</th>
                <th>Start</th>                
                <th>Stop</th>            
                <th>Status</th> 
                <th>Disconnected lines (last cycle)</th> 
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

            <%int count = 0;
                for (Object myAlarmObj : alarmArrayList)
                    {
                    try
                        {
                        if (++count > 1250)
                            {
                            break;
                            }
                        Alarm_FYROM myAlarm = (Alarm_FYROM) myAlarmObj;
                        //---------------- set filters (status,type,subType,criticality,source) --------------------
                        if (status.contains("alive") && !myAlarm.isStilAlive())
                            {
                            continue;
                            }
                        if (!type.equals("ALL") && !type.equals(myAlarm.getAlarmType()))
                            {
                            continue;
                            }
                        if (!subType.equals("ALL") && !subType.equals(myAlarm.getAlarmSubType()))
                            {
                            continue;
                            }
                        if (myAlarm.getCriticality() < criticality)
                            {
                            continue;
                            }
                        if (!source.equals("") && myAlarm.getNetworkElementName() != null && !myAlarm.getNetworkElementName().contains(source))
                            {
                            continue;
                            }
                        /*
                        if (ticketId != null && (myAlarm.getTicketId().isEmpty() || !myAlarm.getTicketId().equals(ticketId)))
                            {
                            continue;
                            }*/
                        String AlertOrigin = "-";
                        try
                            {
                            AlertOrigin = myAlarm.getNetworkElementName();
                            }
                        catch (Exception e)
                            {
                            myAlarm.setAlarmObject("-");
                            }
                        AlertOrigin = AlertOrigin.replaceAll(";", " : ");
                        TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlarmStart());
                        TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlarmStop());
                        TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlarmStart());
                        T0.addSeconds(-7400);
                        String AlertStart = T1.getNowFormated();
                        String AlertStop = T2.getNowFormated();
                        String AlertTypeS = myAlarm.getAlarmType();
                        String color = "#E5E4E2";
                        String desc = myAlarm.getDesc();
                        String sr = myAlarm.getTicketSR();
                        if (sr == null)
                            {
                            sr = "";
                            }
                        String myObjType = myAlarm.getAlarmType();
                        String elementType = myAlarm.getAlarmSubType();
                        //
                        String usersAffected = "N/A";
                        if (myAlarm.getActiveLinesAffected() > 0)
                            {
                            usersAffected = String.valueOf(myAlarm.getActiveLinesAffected());
                            }
                        if (myAlarm.isStilAlive())
                            {                            
            %>                            
            <tr>  
                <%
                    if (myAlarm.isRepeated())
                        {%>
                <td nowrap>R</td>
                <% }
                else
                    {%>
                <td nowrap></td>
                <% }%>
                <td nowrap><a href='HistoryServlet?type=<%=AlertTypeS%>&resource=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>'  target="_blank"><%=AlertOrigin%></a></td>
                <td nowrap><%=elementType%></td>
                <td nowrap><%=AlertStart.substring(0, 16)%></td>
                <td nowrap></td>                                                          
                <td><b>alive!</b></td>
                <td nowrap><%=myAlarm.getLinesDisconnected()%></td>
                <td nowrap><a href="linesRegistered.jsp?type=<%=type%>&path=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>" target="_blank"><%=myAlarm.getLinesRegistered()%></a></td>
                <td nowrap><a href="pathsAffected.jsp?type=<%=type%>&path=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>" target="_blank">Affected Sub-Paths</a></td>                
                <td nowrap><%=sr%></td>
                <td nowrap><%=myAlarm.getAffServiceID()%></td>
                <td nowrap><%=myAlarm.getMarkCustomersStatus()%></td>
                <td nowrap><%=myAlarm.getReleaseCustomersStatus()%></td>
                <td nowrap><%=myAlarm.getAlarmReason()%>
                <%if (myAlarm.isDyingGasp())
                    {%>
                    <img src="img/power.jpg" width="15" height="15" alt=" P "/>
                   <%}%> 
                </td>
                <td nowrap><%=myAlarm.getMyBulletinid()%></td>
                <td nowrap><%=myAlarm.getAlarmOpenningProfile().toString()%></td>
                <td>
                    <a href="alarms.jsp?type=<%=type%>&status=<%=status%>&kill=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>"><img src="img/delete.png" width="20" height="15" alt="delete"/></a>                    
                </td>
            </tr> 
            <%                    }
            else
                {
            %>
            <tr bgcolor="<%=color%>">
                <%
                    if (myAlarm.isRepeated())
                        {%>
                <td nowrap>R</td>
                <% }
                else
                    {%>
                <td nowrap></td>
                <% }%>                                
                <td nowrap><a href='HistoryServlet?type=<%=AlertTypeS%>&resource=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>'  target="_blank"><%=AlertOrigin%></a></td>                
                <td nowrap><%=elementType%></td>
                <td nowrap><%=AlertStart.substring(0, 16)%></td>
                <td nowrap><%=AlertStop.substring(0, 16)%></td>                          
                <td>old</td>
                <td nowrap><%=myAlarm.getLinesDisconnected()%></td>
                <td nowrap><a href="linesRegistered.jsp?type=<%=type%>&path=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>" target="_blank"><%=myAlarm.getLinesRegistered()%></a></td>
                <td nowrap><a href="pathsAffected.jsp?type=<%=type%>&path=<%=URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8")%>">Affected Sub-Paths</a></td>  
                <td nowrap><%=sr%></td>
                <td nowrap><%=myAlarm.getAffServiceID()%></td>
                <td nowrap><%=myAlarm.getMarkCustomersStatus()%></td>
                <td nowrap><%=myAlarm.getReleaseCustomersStatus()%></td>    
                <td nowrap><%=myAlarm.getAlarmReason()%>
                <%if (myAlarm.isDyingGasp())
                    {%>
                    <img src="img/power.jpg" width="15" height="15" alt=" P "/>
                   <%}%> 
                </td>
                <td nowrap><%=myAlarm.getMyBulletinid()%></td>
                <td nowrap><%=myAlarm.getAlarmOpenningProfile().toString()%></td>
            </tr> 
            <%                  }
                        }
                    catch (Exception e)
                        {
                        }
                    }
            %>

        </table>
    </body>
</html>

<%!
    String criticality_desc(int criticality)
        {
        if (criticality == 1)
            {
            return "WARNING";
            }
        else if (criticality == 2)
            {
            return "MINOR";
            }
        else if (criticality == 3)
            {
            return "MAJOR";
            }
        else if (criticality == 4)
            {
            return "CRITICAL";
            }
        else if (criticality == 5)
            {
            return "TOP CRITICAL";
            }
        return "WARNING";
        }
%>
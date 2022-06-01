<%@page import="nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
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
    String type = request.getParameter("type");
    //Container myCCMonitorStatsObjsContainer = null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    Diligent_Daemon myGroupBy_Daemon;
    for (Diligent_Daemon groupBy_Daemon : myGroupBy_Daemons)
        {
        if (type == null || (type.equals(groupBy_Daemon.getDesc())))
            {
            myGroupBy_Daemon=groupBy_Daemon;
            }
        }  
%>

<!DOCTYPE html>

<html>
    <head>
    <head>
        <title>TOP10</title>
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
    </head>    

    <body> 
        <table border="0" width="100%"   id="table1" >
            <tr>
                <td nowrap width="10%" bgcolor="grey"><font color="white">Logged in as:<%=username%></font></td>    
                <td nowrap width="40%" bgcolor="grey"><font color="white">Page refresh: <span id="countdownPage">0</span>s</font></td>                
                <td nowrap width="40%" bgcolor="grey"><font color="white">Data refresh: <span id="countdownData">0</span>s</font></td>                                  
            </tr>
        </table>
        <h1> RECENT MAJOR TICKETS (DSL, User agents or Cells</h1>
        <table width="100%"> 
            <tr>
                <td>                    
                    <table width="100%"> 
                        <tr>
                            <td>
                                <b><%=diligent_MKT.Alarm_FYROM.TYPE_COPPER%></b>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <iframe width="800" height="800" src= "tickets.jsp?criticality=2&status=ALL&type=<%=diligent_MKT.Alarm_FYROM.TYPE_COPPER%>&noheaders" frameborder= "0" ></iframe>
                            </td>
                        </tr> 

                    </table>
                </td>
                <td>                    
                    <table width="100%"> 
                        <tr>
                            <td> 
                                <b><%=diligent_MKT.Alarm_FYROM.TYPE_GPON%></b> 
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <iframe width="800" height="800" src= "tickets.jsp?criticality=2&status=ALL&type=<%=diligent_MKT.Alarm_FYROM.TYPE_GPON%>&noheaders" frameborder= "0" ></iframe>
                            </td>
                        </tr> 

                    </table>
                </td>                  
            </tr>
        </table>

    </body> 
</html>


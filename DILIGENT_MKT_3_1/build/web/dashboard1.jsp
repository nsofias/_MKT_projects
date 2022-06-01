
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
    int daysBack = 7;
    try
        {
        daysBack = Integer.parseInt(request.getParameter("daysBack"));
        }
    catch (Exception e)
        {
        }
%>

<!DOCTYPE html>

<html>
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

    <body> 
        <table border="0" width="100%"   id="table1" >
            <tr>
                <td nowrap width="10%" bgcolor="grey"><font color="white">Logged in as:<%=username%></font></td>    
                <td nowrap width="40%" bgcolor="grey"><font color="white">Page refresh: <span id="countdownPage">0</span>s</font></td>                
                <td nowrap width="40%" bgcolor="grey"><font color="white">Data refresh: <span id="countdownData">0</span>s</font></td>                                  
            </tr>
        </table>

        <h1> <IMG width="50" height="50" src='img/sad.jpg'>TOP UNSTABLE (outages) resources from </h1>
        <table width="100%">              
            <tr>
                <td><iframe width="500" height="400" src= "scorersForType.jsp?type=<%=diligent_MKT.Alarm_FYROM.TYPE_COPPER%>&reportType=events" frameborder= "0" ></iframe></td>                                 
                <td><iframe width="400" height="400" src= "scorersForType.jsp?type=<%=diligent_MKT.Alarm_FYROM.TYPE_GPON%>&reportType=events" frameborder= "0" ></iframe></td>                
            </tr>      
            <tr>
                <td><iframe width="500" height="400" src= "scorersForType.jsp?type=<%=diligent_MKT.Alarm_FYROM.TYPE_COPPER%>&reportType=impact" frameborder= "0" ></iframe></td>                                 
                <td><iframe width="400" height="400" src= "scorersForType.jsp?type=<%=diligent_MKT.Alarm_FYROM.TYPE_GPON%>&reportType=impact" frameborder= "0" ></iframe></td>                 
            </tr>            
        </table>
    </body>
</html>

 
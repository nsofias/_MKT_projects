<%@page import="ccm.MKT.NetworkResourcesFinder_MKT"%>
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
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    TimeStamp1 myLastCallInputTimeStamp = myCCMonitorStatsObjsContainer.getMyLastCallInputTimeStamp();
    TimeStamp1 now = new TimeStamp1();
    double sinse_myLastNewAlarms = (int) now.secondsDiff(myLastCallInputTimeStamp);
%>
<html>
    <head>
        <title>Event stream</title>
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

        Map<String, CallInfo> events = myCCMonitorStatsObjsContainer.getDimensionInstances();
        if (events.isEmpty()) {%>
    out.print("<h2>No current alarms found ...</h2>");
    <%      return;
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

    %>



    <body>
        <table border="0" width="100%"   id="table1" >
            <tr>
                <td nowrap width="5%" bgcolor="Gray"><font color="white">Page will refresh in (sec): <span id="countdownPage">0</span></font></td>                
                <td nowrap width="5%" bgcolor="Gray"><font color="white">Data last update since (sec): <span id="countdownData">0</span></font></td>                                   
            </tr>
        </table>        

        <%  ArrayList<String> eventIds = new ArrayList(events.keySet());
            Collections.sort(eventIds, Collections.reverseOrder());
            int count = 0;
            out.println("<table width='100%'>");
            for (String key : eventIds) {
                CallInfo myCallInfo = events.get(key);

                if (myCallInfo.getResources().get("SERVING_AREA") == null) {
                   // myCallInfo = new NetworkResourcesFinder_MKT().findCLIsResourcesFromNCDB(myCallInfo.getLineId());
                    //out.println(myCallInfo1.toJson());
                }
                if (count++ > 1000) {
                    break;
                }
                try {
                    out.println("<tr><td>" + myCallInfo.getLineId() + "</td><td>" + myCallInfo.getStartTime() + " : " + myCallInfo.getNetworkType() + " : " + myCallInfo.getResources() + "</td></tr>");
                } catch (Exception e) {
                    System.out.println("CCM12:error====" + e.toString());
                    e.printStackTrace();
                }

            }
            out.println("<table width='100%'>");
        %>        



    </body>
</html>



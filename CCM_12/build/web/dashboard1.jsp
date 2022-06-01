<%@page import="nsofiasLib.others.Helpme"%>
<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.others.SimpleDaemon,nsofiasLib.others.Parameters,java.util.Map,nsofiasLib.others.Parameters,java.util.Collections,java.net.URLEncoder"%>
<%@page import="org.apache.catalina.ha.backend.CollectedInfo,java.text.NumberFormat"%>
<%@page import="nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.ArrayList,java.util.List,ccm.*"%>
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
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!--SERVING_AREA;ATC;DSLAM;OLT;SHELF;SLOT;CABLE;DP;BOX;-->
<%
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    Set<String> dimensionLabels = myCCMonitorStatsObjsContainer.getCurrentObject().getAggregationLabels();
    AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");

    Map<String, SimpleDaemon> daemons = (Map<String, SimpleDaemon>) myContext.getAttribute("daemons");
    TimeStamp1 myLastCallInputTimeStamp = myCCMonitorStatsObjsContainer.getMyLastCallInputTimeStamp();
    TimeStamp1 now = new TimeStamp1();
    double sinse_myLastNewAlarms = (int) now.secondsDiff(myLastCallInputTimeStamp);
    int maxDataToDisplay = 30;
    int numOfCCTs = myAlarmsDetectionListener.getNumOfCCTs();
    int numOfTickets = myAlarmsDetectionListener.getNumOfTickets();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    try {
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    } catch (Exception e) {
    }
%>
<head>
    <link rel="stylesheet" href="global.css" type="text/css"/>
    <title>CCM anomaly detection</title>
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

<body>
    <table border="0" width="100%"   id="table1" >
        <tr>
            <td nowrap width="5%" bgcolor="Gray"><font color="white">Page will refresh in (sec): <span id="countdownPage">0</span></font></td>                
            <td nowrap width="5%" bgcolor="Gray"><font color="white">Data last update since (sec): <span id="countdownData">0</span></font></td>                                   
        </tr>
    </table> 
    <table border="0" width="100%" height="150" id="table1" >
        <tr>
            <td width="30%">     
                <table border="0" width="100%" height="150" id="table1" >
                    <tr><td>Last event Timestamp</td><td><%=myCCMonitorStatsObjsContainer.getMyClock().getNowFormated().replace(":000", "")%></td></tr>
                    <tr><td>Aggregation period</td><td><%=myCCMonitorStatsObjsContainer.getMeasurePeriod()%> minutes</td></tr>
                    <tr><td>From</td><td><%=new TimeStamp1(myCCMonitorStatsObjsContainer.getCurrentObject().getTo()).getNowFormated().replace(":000", "")%></td></tr>
                    <tr><td>To</td><td><%=new TimeStamp1(myCCMonitorStatsObjsContainer.getCurrentObject().getFrom()).getNowFormated().replace(":000", "")%></td></tr>
                    <tr><td>CTTs (today)</td><td><b><%=numOfCCTs%></b></td></tr>
                    <tr><td>Tickets (today)</td><td><b><%=numOfTickets%></b></td></tr>
                    <%if (numOfTickets > 0) {%>
                    <tr><td>CTTs/Ticket (today)</td><td><b><%=Helpme.format_number(numOfCCTs / numOfTickets, 2)%></b></td></tr>
                    <%}%>
                </table>   
            </td>           
            <td width="60%"> 
                <a href="QStatsObjsViewer_text.jsp?resourceType=<%=CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME%>" target="_blank"><%=CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME%></a>
                <a href="QStatsObjsViewer.jsp?resourceType=<%=CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME%>&maxDataToDisplay=<%=3 * maxDataToDisplay%>&Ysize=350&lines" target="_blank"><IMG width="95%" height="150" id="TIME" src="QStatsObjsViewer.jsp?resourceType=<%=CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME%>&maxDataToDisplay=<%=2 * maxDataToDisplay%>&Ysize=350&lines"></IMG></a>
            </td>            
            <td> 
                <a href="QStatsObjsViewer_text.jsp?resourceType=<%=CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON%>" target="_blank"><%=CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON%></a>
                (<%=(int) myCCMonitorStatsObjsContainer.getCurrentObject().getCurrentResourceCounters(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON).getTotalValue()%>)
                <a href="QStatsObjsViewer.jsp?resourceType=<%=CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON%>&maxDataToDisplay=<%=maxDataToDisplay%>&Ysize=350" target="_blank"><IMG width="95%" height="150" id="REASON" src="QStatsObjsViewer.jsp?resourceType=<%=CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON%>&Ysize=350"></IMG></a>            
            </td> 

        </tr>           
    </table>    
    <table border="0" width="100%" height="300" id="table1" >   

        <tr>
            <%  int count = 0;
                int maxInRow = 6;
                for (String resourceType : dimensionLabels) {
                    //System.out.println("CCM12:dashboard:resourceType="+resourceType);
                    if (!resourceType.equals(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON)
                            && !resourceType.equals(CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME)) {
                        count++;
                        if (count > maxInRow) {
                            out.print("</tr><tr>");
                            count = 0;
                        }
            %>       
            <td>
                <a href="QStatsObjsViewer_text.jsp?resourceType=<%=resourceType%>" target="_blank"><%=resourceType%></a>
                (<%=(int) myCCMonitorStatsObjsContainer.getCurrentObject().getCurrentResourceCounters(resourceType).getTotalValueOfParam("COUNT")%>)
                <p><a href="QStatsObjsViewer.jsp?resourceType=<%=resourceType%>&maxDataToDisplay=<%=3 * maxDataToDisplay%>&Ysize=500" target="_blank"><IMG width="95%" height="150"  id="<%=resourceType%>"  src="QStatsObjsViewer.jsp?resourceType=<%=resourceType%>&maxDataToDisplay=15&Ysize=350"></IMG></a>           
            </td> 
            <%}
                }%>    
        </tr>           
    </table> 
    <!--
<p><iframe height = "50"  id="alarms" name="alarms" src="alarms.jsp"></iframe>
    -->
</body>    
</html>


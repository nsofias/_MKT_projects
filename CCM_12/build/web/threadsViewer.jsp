<%@page import="ccm.AlarmsDetectionListener"%>
<%@page import="ccm.CCMonitorStatsObjsContainer"%>
<%@page import="java.util.Map,java.util.Properties,java.io.FileInputStream,nsofiasLib.utils.Counters,nsofiasLib.others.SimpleDaemon,nsofiasLib.utils.FTPDaemon,java.text.NumberFormat,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,nsofiasLib.fileIO.FileParser2Daemon,java.util.ArrayList,java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00";%>
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
    //******************************************************************************************************************
    String Start = request.getParameter("Start");
    String Stop = request.getParameter("Stop");
    String Pause = request.getParameter("Pause");
    String pause_daemon = request.getParameter("pause_daemon");
    String continue_daemon = request.getParameter("continue_daemon");

    //String Refresh=request.getParameter("Refresh");

%>

<!DOCTYPE html>
<html>
    <head>
        <title>Control Panel</title>
        <meta http-equiv="refresh" content="60; url=threadsViewer.jsp">
    </head>
    <body>  



        <!--            //****************************** STANDARD TEXT ***************************************************************** -->
        <h2>Application Threads!</h2>
        <form action="threadsViewer.jsp">
            <input type="submit" name="Start" value="Start" />
            <input type="submit" name="Stop" value="Stop" />
            <input type="submit" name="Pause" value="Pause" />
            <input type="submit" name="Refresh" value="Refresh" />
        </form> 
        <%            
            NumberFormat myNumberFormat = NumberFormat.getInstance();
            myNumberFormat.setMinimumFractionDigits(2);
            myNumberFormat.setMaximumFractionDigits(2);
            myNumberFormat.setGroupingUsed(false);
            //
            Map<String, SimpleDaemon> daemons = (Map<String, SimpleDaemon>) myContext.getAttribute("daemons");
            CCMonitorStatsObjsContainer myContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
            AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) daemons.get("alarmsDetectionListener");
        %>
        <table style="text-align:left; font-size:20px;" border="1"  cellpadding="1"  id="table2" > 
            <tr><td>AlarmArrayList size</td><td><%=myContainer.getAlarmArrayList().size()%></td></tr>
            <tr><td>DimensionInstances size</td><td><%=myContainer.getDimensionInstances().size()%></td></tr>
            <tr><td>Clock</td><td><%=myContainer.getMyClock().getNowFormated()%></td></tr>
            <tr><td>ClockFirstIn</td><td><%=myContainer.getMyClockFirstIn().getNowFormated()%></td></tr>
            <tr><td>Tickets size</td><td><%=myAlarmsDetectionListener.getTicketsMap().size()%></td></tr>
        </table>  
        <%
            if (daemons != null) {
                if (Stop != null) {
                    out.write("Stopping");
                    for (String daemonName : daemons.keySet()) {
                        SimpleDaemon mySimpleDaemon = daemons.get(daemonName);
                        mySimpleDaemon.setRunning(false);
                    }
                } else if (Pause != null) {
                    out.write("Pausing");
                    for (String daemonName : daemons.keySet()) {
                        SimpleDaemon mySimpleDaemon = daemons.get(daemonName);
                        mySimpleDaemon.setPaused(true);
                    }
                } else if (Start != null) {
                    out.write("Starting");
                    for (String daemonName : daemons.keySet()) {
                        SimpleDaemon mySimpleDaemon = daemons.get(daemonName);
                        mySimpleDaemon.setRunning(true);
                        if (mySimpleDaemon.isStopped()) {
                            new Thread(mySimpleDaemon).start();
                        }
                    }
                } else if (pause_daemon != null) {
                    out.write("Pausing daemon " + pause_daemon);
                    SimpleDaemon mySimpleDaemon = daemons.get(pause_daemon);
                    mySimpleDaemon.setPaused(true);
                } else if (continue_daemon != null) {
                    out.write("Continue_daemon daemon " + continue_daemon);
                    SimpleDaemon mySimpleDaemon = daemons.get(continue_daemon);
                    mySimpleDaemon.setPaused(false);
                }
        %>    

        <p>       
        <table style="text-align:left; font-size:20px;" border="1"  cellpadding="1"  id="table2" >     
            <tr>
                <th>Daemon Name</th>
                <th>minutes since last Process Time</th>
                <th>minutes since last successful  Process Time</th>
                <th>State</th><th>Process Period (In Minutes)</th>
            </tr>
            <%
                for (String daemonName : daemons.keySet()) {
                    SimpleDaemon mySimpleDaemon = daemons.get(daemonName);
                    TimeStamp1 now = new TimeStamp1();
                    String timeDiff_, timeDiff1_;
                    if (mySimpleDaemon.getLastProccessTime() != null) {
                        TimeStamp1 lastProccessTime = new TimeStamp1(mySimpleDaemon.getLastProccessTime());
                        double timeDiff = now.minutesDiff(lastProccessTime);
                        timeDiff_ = myNumberFormat.format(timeDiff).replace(",", ".");
                    } else {
                        timeDiff_ = "never";
                    }
                    if (mySimpleDaemon.getLastSuccessfulProccessTime() != null) {
                        TimeStamp1 lastSuccessfulProccessTime = new TimeStamp1(mySimpleDaemon.getLastSuccessfulProccessTime());
                        double timeDiff1 = now.minutesDiff(lastSuccessfulProccessTime);
                        timeDiff1_ = myNumberFormat.format(timeDiff1).replace(",", ".");
                    } else {
                        timeDiff1_ = "never";
                    }
            %>
            <tr>
                <td><%=mySimpleDaemon.getDaemonName()%></td>
                <td><%=timeDiff_%></td>
                <td><%=timeDiff1_%></td>
                <td><%=mySimpleDaemon.getState()%></td>
                <td><%=mySimpleDaemon.getProccessPeriodInMinutes()%></td>
                <%              if (!mySimpleDaemon.isPaused()) {%>
                <td><a href="threadsViewer.jsp?pause_daemon=<%=daemonName%>">pause</a></td>
                <%  } else {%>
                <td><a href="threadsViewer.jsp?continue_daemon=<%=daemonName%>">continue</a></td>
                <%      }%>
            </tr>
            <%      }%>
        </Table>            
        <p></p>             
        <%}%>       
        <%
            Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
            if (myCounters != null) {
                try {
                    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
                } catch (Exception e) {
                }
                if (myCounters != null && request.getParameter("Reset") != null) {
                    out.write("Reseting...");
                    myCounters.clear();
                }
        %>
        <iframe src= "sessions.jsp" frameborder= "0" width= "500" height="300"></iframe>    
        <table style="text-align:left; font-size:20px;" border="1"  cellpadding="1"  id="table1" >                    
            <%
                List<String> labels = myCounters.getLabelsSortedBy(Counters.sortByDN);
                for (String label : labels) {%>
            <tr>
                <td><%=label%></td>
                <td><%=myCounters.getCount(label)%></td>
            </tr>        
            <%      }
                }%>
        </Table>   
    </body>
</html>

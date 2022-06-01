<%@page import="diligent_MKT.Ticket_FYROM"%>
<%@page import="nsofiasLib.utils.MailAlert,nsofiasLib.utils.URLContextReader_object,nsofiasLib.utils.Counters,nsofiasLib.utils.FTPDaemon,java.text.NumberFormat,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,nsofiasLib.fileIO.FileParser2Daemon,java.util.ArrayList,java.util.List,SKOPIA.*,com.google.gson.*,java.io.*,java.lang.reflect.Modifier,java.util.Map,java.lang.reflect.Type,java.util.concurrent.ConcurrentHashMap,com.google.gson.reflect.TypeToken,com.google.gson.stream.JsonReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00";%>
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
<html>
    <head>
        <title>CCMonitor</title>
        <meta http-equiv="refresh" content="120; url=threadsViewer.jsp">
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>            
        <h2>DSLMON Threads!</h2>

        <form action="threadsViewer.jsp">
            <input type="submit" name="Stop" value="Stop DSLMON" />
            <input type="submit" name="Start" value="Start DSLMON" />
            <input type="submit" name="Refresh" value="Refresh" />  
            <input type="submit" name="flushTickets" value="flushTickets" />  

        </form>        
        <%
            TimeStamp1 now = new TimeStamp1();
            ServletContext myContext = request.getServletContext();
            ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
            TicketsUpdateDaemon myTicketsUpdateDaemon = (TicketsUpdateDaemon) myContext.getAttribute("myTicketsUpdateDaemon");

            HealthCheckerDaemon myHealthCheckerDaemon = (HealthCheckerDaemon) myContext.getAttribute("myHealthCheckerDaemon");

//
            Counters myCounters = new Counters();
            try {
                myCounters = (Counters) myContext.getAttribute("browseCounters");
                myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
            } catch (Exception e) {
            }
            //
            String Reset = request.getParameter("Reset");
            String Start = request.getParameter("Start");
            String Stop = request.getParameter("Stop");
            String flushTickets = request.getParameter("flushTickets");
            //-----------------
            if (flushTickets != null) {
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                    try (Writer writer = new FileWriter(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/data/" + myGroupBy_Daemon.getDesc() + "_tickets.flash")) {
                        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
                        gson.toJson(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList(), writer);
                        //-------------
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/data/" + myGroupBy_Daemon.getDesc() + "_tickets.flash"));
                        Map<String, Ticket_FYROM> ticketsArrayList = new ConcurrentHashMap();
                        ticketsArrayList.clear();
                        Type type = new TypeToken<Map<String, Ticket_FYROM>>() {
                        }.getType();
                        ticketsArrayList = gson.fromJson(bufferedReader, type);
                        for (String key : ticketsArrayList.keySet()) {
                            out.println("<p>" + key);
                        }
                    } catch (IOException e) {
                        out.println("DSLMON_SKOPIA error:Tickets flushToDisk error:" + e.toString());
                    }
                }

            }
            if (Reset != null) {
                out.write("Reseting...");
                myCounters.clear();
            }
            if (Stop != null) {
                out.write("Stopping");
                System.out.println("DSLMON STOPPED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated());
                new MailAlert().sendmailAlert("DSLMON STOPPED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated(), "-");
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                    try {
                        myGroupBy_Daemon.setRunning(false);
                    } catch (Exception e) {
                        System.out.println("DSLMON_SKOPIA myGroupBy_Daemon timecheck error:" + "DSLMON_SKOPIA " + e.toString());
                        new MailAlert().sendmailAlert("DSLMON_SKOPIA myGroupBy_Daemon time check error:" + "DSLMON_SKOPIA " + e.toString(), e);
                    }
                }
                myHealthCheckerDaemon.setRunning(false);
                myTicketsUpdateDaemon.setRunning(false);
            }
            if (Start != null) {
                out.write("Starting");
                System.out.println("DSLMON STARTED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated());
                new MailAlert().sendmailAlert("DSLMON STARTED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated(), "-");
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                    try {
                        myGroupBy_Daemon.setRunning(true);
                    } catch (Exception e) {
                        System.out.println("DSLMON_SKOPIA myGroupBy_Daemon timecheck error:" + "DSLMON_SKOPIA " + e.toString());
                        new MailAlert().sendmailAlert("DSLMON_SKOPIA myGroupBy_Daemon time check error:" + "DSLMON_SKOPIA " + e.toString(), e);
                    }
                }
                myHealthCheckerDaemon.setRunning(true);
                myTicketsUpdateDaemon.setRunning(true);
                //
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                    try {
                        new Thread(myGroupBy_Daemon).start();
                    } catch (Exception e) {
                        System.out.println("DSLMON_SKOPIA myGroupBy_Daemon timecheck error:" + "DSLMON_SKOPIA " + e.toString());
                        new MailAlert().sendmailAlert("DSLMON_SKOPIA myGroupBy_Daemon time check error:" + "DSLMON_SKOPIA " + e.toString(), e);
                    }
                }
                if (myHealthCheckerDaemon.isStopped()) {
                    new Thread(myHealthCheckerDaemon).start();
                }
                if (myTicketsUpdateDaemon.isStopped()) {
                    new Thread(myTicketsUpdateDaemon).start();
                }
            }
            //

            NumberFormat myNumberFormat = NumberFormat.getInstance();
            myNumberFormat.setMinimumFractionDigits(2);
            myNumberFormat.setMaximumFractionDigits(2);
            myNumberFormat.setGroupingUsed(false);
//    
            //------------------
            ArrayList status = new ArrayList();
            status.add("<font color='green'>Started</font>");
            status.add("<font color='orange'>Stopping...</font>");
            status.add("<font color='red'>Stopped!</font>");
//-------------------------------------------------------------------
//-------------------------------------------------------------------
//-------------------------------------------------------------------
//-------------------------------------------------------------------
//-------------------------------------------------------------------

            TimeStamp1 myHealthCheckerDaemonTimeStamp = myHealthCheckerDaemon.getHealthMonitorTimeStamp();
            for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                Container myContainer = myGroupBy_Daemon.getMyStatsObjContainer();
                TimeStamp1 lastCycleTimeStamp = new TimeStamp1(myGroupBy_Daemon.getLastProccessTime());
                TimeStamp1 lastDataTimeStamp = new TimeStamp1(myGroupBy_Daemon.getLastSuccessfulProccessTime());
                TimeStamp1 myTicketsUpdateDaemonTimeStamp = myTicketsUpdateDaemon.getMyDaemonTimeStamp_cycle();
                TimeStamp1 myDSLFileParserDaemonTimeStampData = lastDataTimeStamp;
                double myDSLFileParserDaemonTimeStamp_fromNow = 0;
                double myHealthCheckerDaemonTimeStamp_fromNow = 0;
                double myTicketsUpdateDaemonTimeStamp_fromNow = 0;
                if (myDSLFileParserDaemonTimeStampData != null) {
                    myDSLFileParserDaemonTimeStamp_fromNow = -myDSLFileParserDaemonTimeStampData.minutesDiff(now);
                }
                if (myHealthCheckerDaemonTimeStamp != null) {
                    myHealthCheckerDaemonTimeStamp_fromNow = -myHealthCheckerDaemonTimeStamp.minutesDiff(now);
                }
                if (myTicketsUpdateDaemonTimeStamp != null) {
                    myTicketsUpdateDaemonTimeStamp_fromNow = -myTicketsUpdateDaemonTimeStamp.minutesDiff(now);
                }
        %>       
        <h2><%=myGroupBy_Daemon.getDesc()%></h2>        
        Last Data input @: <%=lastDataTimeStamp.getNowFormated()%>
        Last Cycle  @: <%=lastCycleTimeStamp.getNowFormated()%>
        <p>
        <table style="text-align:left; font-size:12px;" border="1"  cellpadding="1"  id="table2" >                 
            <tr><td>DSLFileParserDaemon</td><td><%=myNumberFormat.format(myDSLFileParserDaemonTimeStamp_fromNow).replace(",", ".")%></td>
                <td><%=status.get(myGroupBy_Daemon.getStatus())%></td>
            </tr>
            <tr><td>HealthCheckerDaemon</td><td><%=myNumberFormat.format(myHealthCheckerDaemonTimeStamp_fromNow).replace(",", ".")%></td>
                <td><%=status.get(myHealthCheckerDaemon.getStatus())%></td>
            </tr>
            <tr><td>TicketsUpdateDaemon</td><td><%=myNumberFormat.format(myTicketsUpdateDaemonTimeStamp_fromNow).replace(",", ".")%></td>
                <td><%=status.get(myTicketsUpdateDaemon.getStatus())%></td>
            </tr>    
            <tr><td>TicketsUpdateDaemon</td><td><%=myNumberFormat.format(myTicketsUpdateDaemonTimeStamp_fromNow).replace(",", ".")%></td>
                <td><%=status.get(myTicketsUpdateDaemon.getStatus())%></td>
            </tr>             
        </Table>            
        <p></p>    
        <%
                out.println("<p>TicketsList size =" + myContainer.getTicketsArrayList().size() + "    EventsLogArrayList size =" + myContainer.getEventsLogArrayList().size());
            }

            //-----------------------------------------------------------------------------
            //----------------- Connection to CCM ------------
            //-----------------------------------------------------------------------------
/*          out.println("<h1>Connections:</h1>");
            URLContextReader_object myCCMInfo_object = new URLContextReader_object();
            try
                {
                myCCMInfo_object.getUrlContext("http://" + System.getenv("ccm") + ":8080/CCM/howManyCallers.jsp?from=20170101T101010.000&to=20170101T101010.000&resource=6666");
                out.println("<p>Connection to CCM(howManyCallers.jsp): <font color='green'>ok!</font>");
                }
            catch (Exception e)
                {
                out.println("<p>Connection to CCM(howManyCallers.jsp): <font color='red'>failed!</font>");
                }*/

        %>

    </body>
</html>

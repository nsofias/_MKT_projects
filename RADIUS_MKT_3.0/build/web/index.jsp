<%@page import="nsofiasLib.fileIO.FileParser2Daemon,radius.*,java.util.Map,java.util.ArrayList,java.util.List,nsofiasLib.time.TimeStamp1"%>
<%-- 
    Document   : alarms
    Created on : Oct 17, 2018, 12:40:34 PM
    Author     : nsofias
--%>
<%  response.setCharacterEncoding("utf-8");
    //----------
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");
    FileParser2Daemon myDSLFileParserDaemon = (FileParser2Daemon) myContext.getAttribute("fileParserDaemon");
    //---------------------------
    String Reset = request.getParameter("Reset");
    String Start = request.getParameter("Start");
    String Stop = request.getParameter("Stop");
    String getStuckedSessions = request.getParameter("getStuckedSessions");
    String search = request.getParameter("search");
    //-----------------   
    if (getStuckedSessions != null)
        {
        //out.write("Reseting...");
        ArrayList<String> stucks = getStuckedSessions(myContainer, 120);
        for (String myStuck :stucks)
            {
            out.println(myStuck.toString());
            }
        }    
    if (Reset != null)
        {
        //out.write("Reseting...");
        myContainer.resetCounters();
        }
    if (Stop != null)
        {
        System.out.println("Collector: STOPPED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated());
        myDSLFileParserDaemon.setRunning(false);
        }
    if (Start != null)
        {
        //out.write("Starting");        
        System.out.println("Collector: STATRED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated());
        if (myDSLFileParserDaemon.isStopped())
            {
            myDSLFileParserDaemon.setRunning(true);
            new Thread(myDSLFileParserDaemon).start();
            }
        }
%>
<!DOCTYPE html>
<html>


    <head>
        <title>RadiusLog_LineParserListener</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>
        <h1>RadiusLog_LineParserListener</h1>
        <p><h2>Collector Commands!</h2>
        <form action="index.jsp">
            <input type="submit" name="Reset" value="Reset counters" />
            <%if (myDSLFileParserDaemon.isRunning())
                    { %>
            <input type="submit" name="Stop" value="Stop Daemon" />
            <input type="submit" disabled="" name="Start" value="..." />                    
            <%} else
                { %>
            <input type="submit" disabled="" name="Stop" value="..." />
            <input type="submit" name="Start" value="Start Daemon" />                    
            <%}%>
            
             <input type="submit" name="getStuckedSessions" value="getStuckedSessions" />
            <input type="submit" name="Refresh" value="Refresh" />
        </form>          
        <p>Counter_adds: <%=myContainer.getCounter_startEvents()%>
        <p>Counter_updates: <%=myContainer.getCounter_stopEvents()%>            
        <p>Last update: <%=myContainer.getTimestam_lastSession()%>
        <p>Oldest session: <%=myContainer.getOldestLiveSession()%>
        <p>Missing line ID errors: <%=myContainer.getCounter_NoLineIdErros()%>
        <p>Bad timing errors: <%=myContainer.getCounter_BadTimingErros()%>
        <p>Wrong State errors: <%=myContainer.getCounter_WrongStateErros()%>        
        <p>Total sessions:<%=myContainer.getAllSessionsNumber()%>
            <%  if (myContainer.getAllSessionsNumber() > 0)
            {%>
        <p>Live sessions: <%=myContainer.getLiveSessionsNumber()%> ( <%= 1.0 * myContainer.getLiveSessionsNumber() / myContainer.getAllSessionsNumber()%> )
            <%}%>   

        <table width="100%">              
            <tr>
                <td><iframe width="1500" height="400" src= "lines.jsp?max=100&all" frameborder= "0" ></iframe></td>                                                 
            </tr>      
            <tr>
                <td><iframe width="1500" height="400" src= "errors.jsp" frameborder= "0" ></iframe></td>                                                
            </tr>            
        </table>
    </body>
</html>



<%!
    public ArrayList<String> getStuckedSessions(RadiusLog_LineParserListener myContainer, int minutesBack)
        {
        String timestam_lastSession = myContainer.getTimestam_lastSession();
        ArrayList<String> stucks = new ArrayList();
        TimeStamp1 oldTimestamp = new TimeStamp1(timestam_lastSession+".000");
        oldTimestamp.addMinutes(-minutesBack);
        String oldTimestamp_ = oldTimestamp.getNowUnformated();
        for (String key : myContainer.getEventsContainer().keySet())
            {
            RadiusSessionRecord myRadiusLogRecord = myContainer.getEventsContainer().get(key);
            String sessionTime = myRadiusLogRecord.getTimeStamp();
                {
                if (sessionTime.compareTo(oldTimestamp_) < 0)
                    {
                    if (myRadiusLogRecord.isIsLive())
                        {
                        double dif = new TimeStamp1(timestam_lastSession+".000").hoursDiff( new TimeStamp1(sessionTime+".000") );
                        myContainer.getMyErrors().add(0, "live session " + myRadiusLogRecord.getId() + ": has not been updated for  " + dif + " hours");
                        stucks.add(key);
                        }
                    }
                }
            }
        return stucks;
        }
%>
<%@page import="java.util.Map,java.util.Collections"%>
<%@page import="org.apache.catalina.ha.backend.CollectedInfo"%>
<%@page import="nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.ArrayList,java.util.List,ccm.*"%>
<%@page contentType="text/html; charset=UTF-8"%>


<%
    ServletContext myContext = request.getServletContext();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    //
    //---------------------- parameters ----------------
    String GROUP_ID = request.getParameter("GROUP_ID");
    if (GROUP_ID == null)
        {
        GROUP_ID = "INVITE";
        }
    Map<String, CallsLoaderDaemon> daemons = (Map<String, CallsLoaderDaemon>)myContext.getAttribute("daemons");
    CallsLoaderDaemon myCallsLoaderDaemon = (CallsLoaderDaemon)daemons.get(GROUP_ID);
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = myCallsLoaderDaemon.getMyStatsObjContainer();
    //
    String from = request.getParameter("from");
    String to = request.getParameter("to");

    String from_ = "";
    String to_ = "";
    if (from == null)
        {
        from = myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated();
        from_ = myCCMonitorStatsObjsContainer.getMyClock().getNowFormated();
        TimeStamp1 toTimeStamp = new TimeStamp1(from);
        toTimeStamp.addHours(-3);
        to = toTimeStamp.getNowUnformated();
        to_ = toTimeStamp.getNowFormated();
        }
    Counters myAnumbers = myCCMonitorStatsObjsContainer.getLinesForPeriod(from, to);
    List<String> labels = myAnumbers.getLabelsSortedBy(Counters.sortByCount); 
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Top scorers from <%=to_%> to:<%=from_%></h1>
        <table border="1" cellpadding="5" cellspacing="5">
            <tr><td><b>Caller</b></td><td><b>Calls</b></td><td><b>Δικτυακοι Ποροι</b></td><td><b>Ιστορικο κλησεων</b></td></tr>
            <% for (String Anum : labels)
                    {
                    try
                        {
                        long count = myAnumbers.getCount(Anum);

                        String Anum1 = Anum.substring(0, 8) + "XX";
            %>
            <tr><td><%=Anum1%></td><td align = 'right'><%=count%></td><td><a href="resources.jsp?DN=<%=Anum%>" target="_blank">Δικτυακοι Ποροι</a></td><td><a href="AnumberCallHistory.jsp?ANumber=<%=Anum%>&from=<%=from%>&to=<%=to%>" target="_blank">Ιστορικο κλησεων</a></td></tr>
                    <%}
                            catch (Exception e)
                                {
                                }
                            }%>
        </table>
    </body>
</html>



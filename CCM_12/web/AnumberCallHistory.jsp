<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="ccm.CallInfo"%>
<%@page import="java.util.Collections"%>
<%@page import="org.apache.catalina.ha.backend.CollectedInfo"%>
<%@page import="nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.ArrayList,java.util.List,ccm.CCMonitorStatsObjsContainer,ccm.CCMAlarm"%>
<%@page contentType="text/html; charset=UTF-8"%>


<%
    ServletContext myContext = request.getServletContext();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    //

    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("statsObjContainer");
    String from = request.getParameter("from");
    String to = request.getParameter("to");
    String lineID = request.getParameter("lineID");
    if (from == null) {
        from = myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated();
        TimeStamp1 toTimeStamp = new TimeStamp1(from);
        toTimeStamp.addDays(-30);
        to = toTimeStamp.getNowUnformated();
    }

//    Counters myhistory = getAnumberHistory(lineID, from, to, myCCMonitorStatsObjsContainer);
//    myAnumbers.sort(Counters.sortByCount);

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Calls from <%=lineID%> Period from  <%=new TimeStamp1(to).getNowFormated()%> to <%=new TimeStamp1(from).getNowFormated()%></h2>        
        <table border="1" cellpadding="5" cellspacing="5">
            <tr><th><b>Ημερομηνια</b></th><th>Πληθος κλησεων</th></tr>
                    <%
                        Counters1 statObjs = myCCMonitorStatsObjsContainer.getLineIDCalls(lineID, from, to);
                        List<String> labels = statObjs.getLabelsAsSortedlist();
                        Collections.sort(labels);
                        for (String label : labels) {
                            double count = statObjs.getTotalValueOfLabel(label);
                            String date = new TimeStamp1(label + "00.000").getNowFormated();
                    %>
            <tr><td><%=date%></td></td><td><%=count%></td></tr>                            
            <%
                }
            %>
        </table>
    </body>
</html>


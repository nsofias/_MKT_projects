<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="ccm.CallInfo"%>
<%@page import="java.util.Collections"%>
<%@page import="org.apache.catalina.ha.backend.CollectedInfo"%>
<%@page import="nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.ArrayList,java.util.List,ccm.CCMonitorStatsObjsContainer,ccm.CCMAlarm"%>
<%@page contentType="text/html; charset=UTF-8"%>

<html>
    <head>
        <title>Alarm calls</title>
        <link rel="stylesheet" href="global.css">        
    </head>

<%
    ServletContext myContext = request.getServletContext();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    //

    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    String from = request.getParameter("from");
    String to = request.getParameter("to");
    String resourceType = request.getParameter("resourceType");
    String resource = request.getParameter("resource");
    out.println("<h1>resourceType = " + resourceType+"</h1>");
    out.println("<h1>resource = " + resource+"</h1>");
    if (from == null) {
        from = myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated();
        TimeStamp1 toTimeStamp = new TimeStamp1(from);
        toTimeStamp.addDays(-1);
        to = toTimeStamp.getNowUnformated();
    }
    Set<String> calls = myCCMonitorStatsObjsContainer.getCallsForResource(resourceType, resource, from, to);
    ArrayList<String> myCallsArray = new ArrayList(calls);
    Collections.sort(myCallsArray);
    String lineID = "";
    out.println("<table width='60%'>");
    for (String call : myCallsArray) {
        if (!lineID.equals(call.split("@")[0])) {
            out.println("<tr><td></td></tr>");
            lineID = call.split("@")[0];
        }
        out.println("<tr><td>" + call+"</td></tr>");
    }
    out.println("</table>");
    /*
    List<String> labels = myAnumbers.getLabelsSortedBy(Counters.sortByCount);    
    for (String Anum : labels){
        try {
            out.println("<p>"+Anum+" "+myAnumbers.getCount(Anum));
        } catch (Exception e) {
            out.println(e.toString());
        }
    }*/
%>



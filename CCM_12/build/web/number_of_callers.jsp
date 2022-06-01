<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="java.util.Collections"%>
<%@page import="org.apache.catalina.ha.backend.CollectedInfo"%>
<%@page import="nsofiasLib.utils.Counters,java.util.ArrayList,java.util.List,ccm.CCMonitorStatsObjsContainer,ccm.*"%>
<%@page contentType="text/html; charset=UTF-8"%>


<%
    ServletContext myContext = request.getServletContext();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    //
    String origin = request.getParameter("origin");
    String from = request.getParameter("from");
    String to = request.getParameter("to");
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    String alertType = "";
    CCMAlarm myAlarm = new CCMAlarm(origin, to, alertType);
    myAlarm.setAlarmObject(origin);
    myAlarm.setAlertStart(to);
    myAlarm.setAlarmStop(from);
    Counters1 myAnumbers = myCCMonitorStatsObjsContainer.getCallersCounters(myAlarm);
    out.println(myAnumbers.size());
%> 


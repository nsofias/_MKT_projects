<%@page import="com.google.gson.Gson"%>
<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="nsofiasLib.ote.alarms.Ticket"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Map,java.net.URLEncoder,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,ccm.CCMonitorStatsObjsContainer,ccm.*"%>
<%@page contentType="application/json" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    Map<String, CCMAlarm> alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
    out.println(new Gson().toJson(alarmArrayList));


%>



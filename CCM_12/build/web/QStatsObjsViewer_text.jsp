<%-- 
    Document   : QStatsObjsViewer
    Created on : Mar 5, 2020, 10:41:27 AM
    Author     : nsofias
--%>
<%@page import="nsofiasLib.utils.TrafficVolumnPatern"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.LinkedHashSet"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.time.TimeStamp1"%>
<%@page import="nsofiasLib.utils.MyChart"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="nsofiasLib.others.SimpleDaemon,org.jfree.chart.*,nsofiasLib.others.Parameters,java.net.URLDecoder,java.util.Collections,java.util.Map,java.util.List,java.util.ArrayList,nsofiasLib.fileIO.FileParser2,nsofiasLib.fileIO.SimpleLineParser,ccm.*"%>
<%@page import="java.awt.Color,java.awt.Font,java.io.IOException,java.io.OutputStream,org.jfree.chart.axis.CategoryLabelPositions,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.plot.PlotOrientation,org.jfree.chart.renderer.category.*,org.jfree.data.category.DefaultCategoryDataset"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    response.setContentType("text/html");
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
    String from, to;
    String resourceType = request.getParameter("resourceType");
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    //-------variables only for statistics-
    from = request.getParameter("from");
    to = request.getParameter("to");
    //----------------------------   
    AggregationsForPeriod myAggregationsForPeriod = myCCMonitorStatsObjsContainer.getCurrentObject();
    from = myAggregationsForPeriod.getFrom();
    to = myAggregationsForPeriod.getTo();
    Counters1 myResources = new Counters1();
        myResources.updateCounters(myAggregationsForPeriod.getCurrentResourceCounters(resourceType));
        Map<String, TrafficVolumnPatern> patterns = myCCMonitorStatsObjsContainer.getPaternsOfResource(resourceType);

        for (String label : myResources.keySet()) {
            try{
            double myPatern_max = 1 + Math.ceil(patterns.get(label).getVolumnPatern_max() * myResources.getTotalValueOfParam("COUNT"));
            myResources.updateCounters(label, "MAX", myPatern_max);
            }catch(Exception e){}
        }
    
    for (String label : myResources.keySet()) {
        if (myResources.getValue(label, "COUNT") == 0) {
            myResources.removeCounter(label);
        }
    }
    //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    Map<String, CCMAlarm> activeAlarms = myCCMonitorStatsObjsContainer.getAlarmArrayList_active();
    Set<String> inAlarmState = new HashSet<>();
    for (String key : activeAlarms.keySet()) {
        CCMAlarm myAlarm = activeAlarms.get(key);
        inAlarmState.add(myAlarm.getAlarmObject());
    }

    out.println(myResources.toHTML_TABLE(true, "COUNT", inAlarmState, Arrays.asList("MAX", "COUNT")));
%>
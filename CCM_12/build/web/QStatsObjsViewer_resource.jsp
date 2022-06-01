<%-- 
    Document   : QStatsObjsViewer
    Created on : Mar 5, 2020, 10:41:27 AM
    Author     : nsofias
--%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.time.TimeStamp1"%>
<%@page import="nsofiasLib.utils.VolumnPercentagePatern"%>
<%@page import="nsofiasLib.utils.MyChart"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="nsofiasLib.others.SimpleDaemon,org.jfree.chart.*,nsofiasLib.others.Parameters,java.net.URLDecoder,java.util.Collections,java.util.Map,java.util.List,java.util.ArrayList,nsofiasLib.fileIO.FileParser2,nsofiasLib.fileIO.SimpleLineParser,ccm.*"%>
<%@page import="java.awt.Color,java.awt.Font,java.io.IOException,java.io.OutputStream,org.jfree.chart.axis.CategoryLabelPositions,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.plot.PlotOrientation,org.jfree.chart.renderer.category.*,org.jfree.data.category.DefaultCategoryDataset"%>


<%
    response.setContentType("image/png");
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
    String from, to;
    String resourceType = request.getParameter("resourceType");
    String resource = request.getParameter("resource");
    boolean horizontal = request.getParameter("horizontal") != null;
    boolean lines = request.getParameter("lines") != null;
    //System.out.println("xxxxxxxxxxxxx  resourceType=" + resourceType);
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    //-------variables only for statistics-
    from = request.getParameter("from");
    to = request.getParameter("to");
    if (from == null) {
        TimeStamp1 from_ = myCCMonitorStatsObjsContainer.getMyClock();
        TimeStamp1 to_ = myCCMonitorStatsObjsContainer.getMyClock();
        to_.addHours(-24);
        from = from_.getNowUnformated();
        to = to_.getNowUnformated();
    }
    int maxDataToDisplay = 50;
    try {
        String maxDataToDisplay_ = request.getParameter("maxDataToDisplay");
        maxDataToDisplay = Integer.valueOf(maxDataToDisplay_);
    } catch (NumberFormatException e) {
    }
    int Ysize = 600;
    try {
        Ysize = Integer.valueOf(request.getParameter("Ysize"));
    } catch (Exception e) {
        //System.out.println("Ysize error:" + e.toString());
    }
    //----------------------------   
    Counters1 myResources = new Counters1();
    try {
        myResources = myCCMonitorStatsObjsContainer.aggregateOnTime(resourceType, resource, from, to, true);
        //System.out.println("toJson=" + myResources.toJson());
    } catch (Exception e) {
        e.printStackTrace(System.out);
        response.getWriter().flush();
        //System.out.println(myResources.toJson());
        return;
    }
    //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    int Xsize = 50 + ((myResources.size() * 50));
    if (maxDataToDisplay < myResources.size()) {
        Xsize = 50 + (maxDataToDisplay * 50);
    }
    //System.out.println("Ysize:" + Ysize);
    Color backgroundPaintColor = Color.darkGray;
    String xLebel = resourceType;
    String yLabel = "volumn";
    MyChart myChart = new MyChart();
    myChart.setSortInTime(true);
    myChart.setMax_entries(maxDataToDisplay);
    //System.out.println("CCM12:getColumns=" + myResources.getKnownParameters());
    String graphTittle = xLebel + " Period:" + new TimeStamp1(from).getNowFormated() + "-" + new TimeStamp1(to).getNowFormated();
    JFreeChart myJFreeChart = myChart.createChart(myResources, graphTittle, xLebel, yLabel, horizontal, lines, backgroundPaintColor);
    ChartUtilities.writeChartAsJPEG(response.getOutputStream(), myJFreeChart, Xsize, Ysize);
    response.getOutputStream().flush();
    response.getOutputStream().close();

%>
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.TrafficVolumnPatern;
import nsofiasLib.utils.MyChart;
import nsofiasLib.utils.Counters1;
import nsofiasLib.others.SimpleDaemon;
import org.jfree.chart.*;
import nsofiasLib.others.Parameters;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import nsofiasLib.fileIO.FileParser2;
import nsofiasLib.fileIO.SimpleLineParser;
import ccm.*;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.*;
import org.jfree.data.category.DefaultCategoryDataset;

public final class QStatsObjsViewer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    response.setContentType("image/png");
    response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
    String from, to;
    String resourceType = request.getParameter("resourceType");
    boolean horizontal = request.getParameter("horizontal") != null;
    boolean lines = request.getParameter("lines") != null;
    //System.out.println("xxxxxxxxxxxxx  resourceType=" + resourceType);
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    //-------variables only for statistics-
    from = request.getParameter("from");
    to = request.getParameter("to");

    int maxDataToDisplay = 50;
    try {
        String maxDataToDisplay_ = request.getParameter("maxDataToDisplay");
        maxDataToDisplay = Integer.valueOf(maxDataToDisplay_);
    } catch (NumberFormatException e) {
    }
    int Ysize = 650;
    try {
        Ysize = Integer.valueOf(request.getParameter("Ysize"));
    } catch (Exception e) {
    }
    // ------------------------------               
    Map<String, TrafficVolumnPatern> paterns = myCCMonitorStatsObjsContainer.getPaternsOfResource(resourceType);
    //----------------------------   
    AggregationsForPeriod myAggregationsForPeriod = myCCMonitorStatsObjsContainer.getCurrentObject();
    from = myAggregationsForPeriod.getFrom();
    to = myAggregationsForPeriod.getTo();

    Counters1 myResources = new Counters1();
    try {
        myResources.updateCounters(myAggregationsForPeriod.getCurrentResourceCounters(resourceType));
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
    Color backgroundPaintColor = Color.darkGray;
    String xLebel = resourceType;
    String yLabel = "volumn";
    MyChart myChart = new MyChart();
    if (!resourceType.equals(CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME)) {
        myChart.setSortByValue(true);
        myChart.setAlarming(true);
        Map<String, CCMAlarm> activeAlarms = myCCMonitorStatsObjsContainer.getAlarmArrayList_active();
        Set<String> inAlarmState = new HashSet<>();
        for (String key : activeAlarms.keySet()) {
            CCMAlarm myAlarm = activeAlarms.get(key);
            inAlarmState.add(myAlarm.getAlarmObject());
        }
        myChart.setInAlarmState(inAlarmState);
    } else {//RESOURCE_TYPE_TIME
        myChart.setSortInTime(true);
        myChart.setAlarming(false);
    }
    Set columns = new LinkedHashSet();
    columns.add("COUNT");
    myChart.setSortByParam("COUNT");
    myChart.setColumns(columns);
    myChart.setMax_entries(maxDataToDisplay);
    myChart.setShowValuesOnBars(true);
    //System.out.println(myResources.toString());
    String graphTittle = xLebel + " Period:" + new TimeStamp1(from).getNowFormated() + "-" + new TimeStamp1(to).getNowFormated();
    JFreeChart myJFreeChart = myChart.createChart(myResources, graphTittle, xLebel, yLabel, horizontal, lines, backgroundPaintColor);
    ChartUtilities.writeChartAsJPEG(response.getOutputStream(), myJFreeChart, Xsize, Ysize);
    response.getOutputStream().flush();
    response.getOutputStream().close();


    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

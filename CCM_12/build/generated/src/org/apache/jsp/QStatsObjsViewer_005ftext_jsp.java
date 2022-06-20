package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.utils.TrafficVolumnPatern;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import nsofiasLib.time.TimeStamp1;
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

public final class QStatsObjsViewer_005ftext_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


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

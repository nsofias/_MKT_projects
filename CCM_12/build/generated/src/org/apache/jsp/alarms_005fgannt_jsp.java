package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Locale;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.Task;
import java.io.OutputStream;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;
import org.jfree.chart.ChartUtilities;
import java.io.IOException;
import java.util.Date;
import java.util.Date;
import java.util.Calendar;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeries;
import java.util.HashMap;
import java.util.HashMap;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.category.IntervalCategoryDataset;
import nsofiasLib.others.SimpleDaemon;
import java.util.Collections;
import java.util.Map;
import java.net.URLEncoder;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import ccm.CCMonitorStatsObjsContainer;
import ccm.*;

public final class alarms_005fgannt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public void displayGraph(IntervalCategoryDataset dataset, String graphTittle, HttpServletResponse response, int Xsize, int Ysize, Date MinimumDate, Date MaximumDate) {
        try {
            OutputStream out = response.getOutputStream();
            JFreeChart chart = ChartFactory.createGanttChart(
                    "Recent Alarms", // chart title
                    "Alarms", // domain axis label
                    "->> time ->>", // range axis label
                    dataset, // data
                    true, // include legend
                    false, // tooltips
                    false // urls
            );
            CategoryPlot myPlot = chart.getCategoryPlot();
            DateAxis axis = (DateAxis) myPlot.getRangeAxis();
            axis.setMinimumDate(MinimumDate);
            axis.setMaximumDate(MaximumDate);
            BarRenderer myBarRenderer = (BarRenderer) myPlot.getRenderer();
            myBarRenderer.setSeriesPaint(0, Color.blue);
            myBarRenderer.setSeriesPaint(1, Color.MAGENTA);
            myBarRenderer.setSeriesPaint(2, Color.red);
            myBarRenderer.setSeriesPaint(3, Color.green);
            myBarRenderer.setSeriesPaint(4, Color.DARK_GRAY);
            response.setContentType("image/png");
            ChartUtilities.writeChartAsPNG(out, chart, Xsize, Ysize);
            //           ChartUtilities.writeChartAsJPEG(out, chart,Xsize,Ysize);
        } catch (IOException e) {
            e.printStackTrace(System.out);
            System.out.println("CCM12:AlarmsServletGantt:" + e.toString());
        } finally {
        }
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sequrityPart.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String userTypes = "00,01,02";
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    //String userTypes = "00,01,02";
    //  ----------- SEQURITY CHECK ---------------
    String request_URI = request.getRequestURI();
    request_URI = request_URI.substring(request_URI.lastIndexOf("/") + 1);
    String url = "login.jsp?request_URI=" + request_URI;
    String userType = (String) session.getAttribute("role");
    String username = (String) session.getAttribute("username");
    if (userType == null)
        {
      out.write('\n');
      if (true) {
        _jspx_page_context.forward(url);
        return;
      }
      out.write('\n');
  return;
    }
else if (userType.endsWith("-expired"))// password expired
        {
        
      out.write("\n");
      out.write("        <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password is expired!!!</font>\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("change_password.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");
return;
        }

      out.write('\n');
      out.write('\n');
      out.write('\n');

//----------- sequrity----------------
    try
        {
        if (!userTypes.contains(userType))
            {
            
      out.write("\n");
      out.write("            <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, you are not authorized to view this page!!!</font>\n");
      out.write("            ");
return;
            }
        }
    catch (Exception e)
        {
        }
//----------- sequrity end----------------

      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    Map<String, SimpleDaemon> daemons = (Map<String, SimpleDaemon>) myContext.getAttribute("daemons");
    TimeStamp1 myLastCallInputTimeStamp = myCCMonitorStatsObjsContainer.getMyLastCallInputTimeStamp();
    TimeStamp1 now = new TimeStamp1();
    double sinse_myLastNewAlarms = (int) now.secondsDiff(myLastCallInputTimeStamp);
    int Xsize = 1500, Ysize = 800;
    double hoursBack = 24.0;
    //
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    try {
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    } catch (Exception e) {
    }
    //---------------------- parameters ----------------

    Map<String, CCMAlarm> alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
    if (alarmArrayList.isEmpty()) {
      out.write('\n');
      return;
    }
    //System.out.println("CCM12:alarmArrayList size====" + alarmArrayList.size());
    //---------------------------------------------------------- 
    TimeStamp1 t1, t2;
    try {
        if (request.getParameter("from") != null) {
            t1 = new TimeStamp1(request.getParameter("from"));
        } else {
            t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated());
        }
    } catch (Exception e) {
        System.out.println("NO CLOCK YET!!!!!!!!");
        return;
    }
    t2 = new TimeStamp1(t1.getNowUnformated());
    t2.addHours(-24);
    //System.out.println("CCM12:from, to =" + t1.getNowFormated() + " " + t2.getNowFormated());

    List<String> reasons = myCCMonitorStatsObjsContainer.getReasons();

    try {
        hoursBack = t1.hoursDiff(t2);
        TaskSeriesCollection collection = new TaskSeriesCollection();
        int dispItems = 0;
        HashMap<String, TaskSeries> myTaskSeries = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        //
        for (String key : alarmArrayList.keySet()) {
            CCMAlarm myAlarm = alarmArrayList.get(key);
            try {
                String AlertOrigin = myAlarm.getAlarmObject();
                TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlertStart());
                TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlarmStop());
                if (T2.hoursDiff(t2) < 0){
                    continue;
                }
                String AlertMostSignificantReason = myAlarm.getAlertMostSignificantReason();
                calendar.set(T1.getYear(), T1.getMonthOfYear() - 1, T1.getDayOfMonth(), T1.getHourOfDay(), T1.getMinuteOfHour(), T1.getSecondOfMinute());
                Date AlertStartDate = calendar.getTime();
                calendar.set(T2.getYear(), T2.getMonthOfYear() - 1, T2.getDayOfMonth(), T2.getHourOfDay(), T2.getMinuteOfHour(), T2.getSecondOfMinute());
                Date AlertStopDate = calendar.getTime();
                dispItems++;
                if (myTaskSeries.get(AlertMostSignificantReason) == null) {
                    myTaskSeries.put(AlertMostSignificantReason, new TaskSeries(AlertMostSignificantReason));
                    myTaskSeries.get(AlertMostSignificantReason).add(new Task(AlertOrigin, new SimpleTimePeriod(AlertStartDate, AlertStopDate)));
                    collection.add(myTaskSeries.get(AlertMostSignificantReason));
                } else {
                    myTaskSeries.get(AlertMostSignificantReason).add(new Task(AlertOrigin, new SimpleTimePeriod(AlertStartDate, AlertStopDate)));
                }
                //System.out.println("AlarmsServletGantt:AlertMostSignificantReason=" + AlertMostSignificantReason + "   AlertOrigin=" + AlertOrigin + " AlertStartDate= " + AlertStartDate + " AlertStopDate=" + AlertStopDate);
            } catch (Exception e) {
e                .printStackTrace();
                System.out.println("CCM12:AlarmsServletGantt:1" + e.toString());
            }
        }
        Ysize = dispItems * 20;
        if (Ysize < 200) {
            Ysize = 200;
        }
        System.out.println("CCM12:AlarmsServletGantt:Ysize= " + Ysize);
        calendar.set(t2.getYear(), t2.getMonthOfYear() - 1, t2.getDayOfMonth(), t2.getHourOfDay(), t2.getMinuteOfHour(), t2.getSecondOfMinute());
        Date MinimumDate = calendar.getTime();
        calendar.set(t1.getYear(), t1.getMonthOfYear() - 1, t1.getDayOfMonth(), t1.getHourOfDay(), t1.getMinuteOfHour(), t1.getSecondOfMinute());
        Date clockDate = calendar.getTime();
        displayGraph(collection, "", response, Xsize, Ysize, MinimumDate, clockDate);
    } catch (Exception e) {
        System.out.println("CCM12:AlarmsServletGantt2:" + e.toString());
        e.printStackTrace(System.out);
    }

      out.write('\n');
      out.write('\n');
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

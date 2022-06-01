<%@page import="java.util.Locale"%>
<%@page import="org.jfree.data.time.SimpleTimePeriod"%>
<%@page import="org.jfree.data.time.SimpleTimePeriod"%>
<%@page import="org.jfree.data.gantt.Task"%>
<%@page import="org.jfree.data.gantt.Task"%>
<%@page import="java.io.OutputStream"%>
<%@page import="org.jfree.chart.JFreeChart"%>
<%@page import="org.jfree.chart.ChartFactory"%>
<%@page import="org.jfree.chart.plot.CategoryPlot"%>
<%@page import="org.jfree.chart.axis.DateAxis"%>
<%@page import="org.jfree.chart.renderer.category.BarRenderer"%>
<%@page import="java.awt.Color"%>
<%@page import="org.jfree.chart.ChartUtilities"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="org.jfree.data.gantt.TaskSeries"%>
<%@page import="org.jfree.data.gantt.TaskSeries"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.HashMap"%>
<%@page import="org.jfree.data.gantt.TaskSeriesCollection"%>
<%@page import="org.jfree.data.category.IntervalCategoryDataset"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Map,java.net.URLEncoder,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,ccm.CCMonitorStatsObjsContainer,ccm.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02";%>
<%@ include file = "sequrityPart.jsp"%>
<%
//----------- sequrity----------------
    try
        {
        if (!userTypes.contains(userType))
            {
            %>
            <font face="Verdana" size="3" color="#000080">Sorry, you are not authorized to view this page!!!</font>
            <%return;
            }
        }
    catch (Exception e)
        {
        }
//----------- sequrity end----------------
%>
<!DOCTYPE html>
<%
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
    if (alarmArrayList.isEmpty()) {%>
<%      return;
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
%>

<%!
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
%>
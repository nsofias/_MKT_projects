/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.ServletContext;
import nsofiasLib.time.TimeStamp1;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;

/**
 *
 * @author nsofias
 */
public class AlarmsServletGantt extends HttpServlet {

    int Xsize, Ysize;
    double hoursBack = 24.0;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext myContext = request.getServletContext();
        CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
        //
        List<String> reasons = myCCMonitorStatsObjsContainer.getReasons();
        Map<String, CCMAlarm> alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
        TimeStamp1 T0, T1;

        try {
            T0 = new TimeStamp1(request.getParameter("from"));
            T1 = new TimeStamp1(request.getParameter("to"));
            hoursBack = T0.hoursDiff(T1);

//System.out.println("Clock="+myCCMonitorStatsObjsContainer.getMyClock()+"  T1="+T1.getNowUnformated()+"  T0="+T0.getNowUnformated());        
            IntervalCategoryDataset myDataset = prepareGraph(alarmArrayList, T0, reasons);
            Xsize = 1500;
            Calendar calendar = Calendar.getInstance(Locale.getDefault());
            calendar.set(T0.getYear(), T0.getMonthOfYear() - 1, T0.getDayOfMonth(), T0.getHourOfDay(), T0.getMinuteOfHour(), T0.getSecondOfMinute());
            Date clockDate = calendar.getTime();
//System.out.println("clockDate.toString()="+clockDate.toString());
            calendar.set(T1.getYear(), T1.getMonthOfYear() - 1, T1.getDayOfMonth(), T1.getHourOfDay(), T1.getMinuteOfHour(), T1.getSecondOfMinute());
            Date MinimumDate = calendar.getTime();
//System.out.println("MinimumDate.toString()="+MinimumDate.toString());
            displayGraph(myDataset, "", response, Xsize, Ysize, MinimumDate, clockDate);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("CCM12:Gant servler " + e.toString());
        }
    }

    public IntervalCategoryDataset prepareGraph(Map<String, CCMAlarm> alarmArrayList, TimeStamp1 T0, List<String> reasons) {
        final TaskSeriesCollection collection = new TaskSeriesCollection();
        int dispItems = 0;
        HashMap<String, TaskSeries> myTaskSeries = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        //
        for (String key: alarmArrayList.keySet()) {
            CCMAlarm myAlarm=alarmArrayList.get(key);
            try {
                String AlertOrigin = myAlarm.getAlarmObject();
                TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlertStart());
                TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlarmStop());
                if (T0.hoursDiff(T2) > hoursBack) {
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
            }
        }
        Ysize = dispItems * 20;
        if (Ysize < 200) {
            Ysize = 200;
        }

        return collection;
    }

    public void displayGraph(IntervalCategoryDataset dataset, String graphTittle, HttpServletResponse response, int Xsize, int Ysize, Date MinimumDate, Date MaximumDate) {
        try {
            OutputStream out = response.getOutputStream();
            JFreeChart chart = ChartFactory.createGanttChart(
                    "Πρόσφατα Alarms", // chart title
                    "Alarms", // domain axis label
                    "->> ωρα ->>", // range axis label
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
            myBarRenderer.setSeriesPaint(0, Color.decode("#990012"));
            myBarRenderer.setSeriesPaint(2, Color.MAGENTA);
            myBarRenderer.setSeriesPaint(4, Color.orange);
            myBarRenderer.setSeriesPaint(5, Color.green);
            myBarRenderer.setSeriesPaint(7, Color.pink);
            response.setContentType("image/png");
            ChartUtilities.writeChartAsPNG(out, chart, Xsize, Ysize);
//           ChartUtilities.writeChartAsJPEG(out, chart,Xsize,Ysize);
        } catch (IOException e) {
            e.printStackTrace(System.out);
            System.out.println("CCM12:AlarmsServletGantt:" + e.toString());
        } finally {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

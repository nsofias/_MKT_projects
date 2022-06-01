package SKOPIA;

import diligent_MKT.Alarm_FYROM;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
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
public class AlarmsServletGantt extends HttpServlet
    {

    Map<String, String[]> DSLAMS;
    int Xsize, Ysize;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
        ServletContext myContext = request.getServletContext();
        //------------------------------
        String type = request.getParameter("type");
        List alarmArrayList = new ArrayList();
        ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
        for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
            {
            if (type != null && (type.equals(myGroupBy_Daemon.getDesc())))
                {
                alarmArrayList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getAlarmArrayList());
                }
            }
        try
            {
            Collections.sort(alarmArrayList);
            }
        catch (Exception e)
            {
            }
        int criticality = 0;
        //System.out.println("from=="+request.getParameter("from"));        
        TimeStamp1 T0, T1;
        try
            {
            T0 = new TimeStamp1(request.getParameter("from"));
            T1 = new TimeStamp1(request.getParameter("to"));
            }
        catch (Exception e)
            {
            System.out.println("AlarmsServletGantt error : " + e.toString());
            return;
            }
//System.out.println("Clock="+myCCMonitorStatsObjsContainer.getMyClock()+"  T1="+T1.getNowUnformated()+"  T0="+T0.getNowUnformated());        
        IntervalCategoryDataset myDataset = prepareGraph(type, alarmArrayList, T0, T1, criticality);
        Xsize = 1500;
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.set(T0.getYear(), T0.getMonthOfYear() - 1, T0.getDayOfMonth(), T0.getHourOfDay(), T0.getMinuteOfHour(), T0.getSecondOfMinute());
        Date clockDate = calendar.getTime();
//System.out.println("clockDate.toString()="+clockDate.toString());
        calendar.set(T1.getYear(), T1.getMonthOfYear() - 1, T1.getDayOfMonth(), T1.getHourOfDay(), T1.getMinuteOfHour(), T1.getSecondOfMinute());
        Date MinimumDate = calendar.getTime();
//System.out.println("MinimumDate.toString()="+MinimumDate.toString());
        displayGraph(myDataset, "", response, Xsize, Ysize, MinimumDate, clockDate);
        }

    public IntervalCategoryDataset prepareGraph(String type, List alarmArrayList, TimeStamp1 T0, TimeStamp1 T1, int criticality)
        {
        int dispItems = 0;
        final TaskSeries BRAS = new TaskSeries("BRAS");
        final TaskSeries DSLAM = new TaskSeries("DSLAM");
        final TaskSeries CARDS = new TaskSeries("CARDS");
        Calendar calendar = Calendar.getInstance();
        //
        for (Object myAlarmObj : alarmArrayList)
            {
            try
                {
                Alarm_FYROM myAlarm = (Alarm_FYROM) myAlarmObj;
//            if (!myAlarm.isStilAlive())
//                {
//                continue;
//                }
                String myLabel = myAlarm.getAlertOrigin();
                String labelDesc = myLabel;
                TimeStamp1 T_start = new TimeStamp1(myAlarm.getAlertStart());
                TimeStamp1 T_stop = new TimeStamp1(myAlarm.getAlarmStop());
                if (T1.hoursDiff(T_stop) > 0)
                    {
                    continue;
                    }
                dispItems++;
                calendar.set(T_start.getYear(), T_start.getMonthOfYear() - 1, T_start.getDayOfMonth(), T_start.getHourOfDay(), T_start.getMinuteOfHour(), T_start.getSecondOfMinute());
                Date AlertStartDate = calendar.getTime();
                calendar.set(T_stop.getYear(), T_stop.getMonthOfYear() - 1, T_stop.getDayOfMonth(), T_stop.getHourOfDay(), T_stop.getMinuteOfHour(), T_stop.getSecondOfMinute());
                Date AlertStopDate = calendar.getTime();
                Task myTask = new Task(labelDesc, new SimpleTimePeriod(AlertStartDate, AlertStopDate));
                DSLAM.add(myTask);
                }
            catch (Exception e)
                {
                e.printStackTrace(System.out);
                }
            }
        Ysize = 100 + dispItems * 25;
        if (Ysize < 200)
            {
            Ysize = 200;
            }
        final TaskSeriesCollection collection = new TaskSeriesCollection();
        collection.add(BRAS);
        collection.add(DSLAM);
        collection.add(CARDS);
        return collection;
        }

    public void displayGraph(IntervalCategoryDataset dataset, String graphTittle, HttpServletResponse response, int Xsize, int Ysize, Date MinimumDate, Date MaximumDate)
        {
        try
            {
            OutputStream out = response.getOutputStream();
            JFreeChart chart = ChartFactory.createGanttChart(
                    "", // chart title
                    "", // domain axis label
                    "-- >>> time -- >>>", // range axis label
                    dataset, // data
                    true, // include_disConnectionsCounters legend
                    false, // tooltips
                    false // urls
            );
            CategoryPlot myPlot = chart.getCategoryPlot();
            DateAxis axis = (DateAxis) myPlot.getRangeAxis();
            axis.setMinimumDate(MinimumDate);
            axis.setMaximumDate(MaximumDate);
            BarRenderer myBarRenderer = (BarRenderer) myPlot.getRenderer();
            myBarRenderer.setSeriesPaint(0, Color.decode("#990012"));//PSTN
            myBarRenderer.setSeriesPaint(1, Color.red);//ADSL/VDSL             
            myBarRenderer.setSeriesPaint(2, Color.orange);//OTE TV/SAT TV   
            response.setContentType("image/png");
            ChartUtilities.writeChartAsPNG(out, chart, Xsize, Ysize);
//           ChartUtilities.writeChartAsJPEG(out, chart,Xsize,Ysize);
            }
        catch (IOException throwable)
            {
            System.out.println("DSLMON:AlarmsServletGantt" + throwable.toString());
            }
        finally
            {
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
            throws ServletException, IOException
        {
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
            throws ServletException, IOException
        {
        processRequest(request, response);
        }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
        {
        return "Short description";
        }// </editor-fold>

    }

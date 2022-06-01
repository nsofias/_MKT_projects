package SKOPIA;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nsofiasLib.utils.mapper.Counters_1D_decimal;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author nsofias
 */
public class BRAS_servlet extends HttpServlet
    {

    Map<String, String[]> DSLAMS;

    Container myCCMonitorStatsObjsContainer = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
        //ArrayList sessions_patern = null;
        try
            {
            response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
            response.setHeader("Pragma", "no-cache"); //HTTP 1.0
            response.setDateHeader("Expires", 0); //prevents caching at the proxy server          
            //-------------------------------
            ServletContext myContext = request.getServletContext();
            //-------variables only for statistics--  
            int maxDataToDisplay = 120;
            String maxDataToDisplay_ = request.getParameter("maxDataToDisplay");
            if (maxDataToDisplay_ != null)
                {
                maxDataToDisplay = Integer.valueOf(maxDataToDisplay_);
                }
            //#######################################################
            String type = request.getParameter("type");
            String order_Desc = request.getParameter("order_Desc");
            String net_type_fix = request.getParameter("net_type_fix");
            String net_type_mobile = request.getParameter("net_type_mobile");
            ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
            for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
                {
                if (type != null && type.equals(myGroupBy_Daemon.getDesc()))
                    {
                    myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
                    }
                }
            //#######################################################
            if (myCCMonitorStatsObjsContainer == null)
                {
                return;
                }
            //-------
            String graphTittle = "";
            Counters_1D_decimal myLastAggregation = new Counters_1D_decimal();
            myLastAggregation.update(myCCMonitorStatsObjsContainer.getLastAggregation());
            //--------
            graphTittle = type;
            Map<String, Patern> paterns = myCCMonitorStatsObjsContainer.getTraffic_paterns();
            //---------------------------------------------------------------------   
            createGraph(type, order_Desc,net_type_fix, net_type_mobile, myLastAggregation, maxDataToDisplay, paterns, graphTittle, response);
            }
        catch (Exception e)
            {
            System.out.println("DSLMON_SKOPIA:BRAS_servlet error:" + e.toString());
            e.printStackTrace(System.out);
            }
        finally
            {
            }
        }

    public void createGraph(String type,String order_Desc, String net_type_fix, String net_type_mobile, Counters_1D_decimal myLastAggregation, int maxDataToDisplay, Map<String, Patern> paterns, String graphTittle, HttpServletResponse response)
        {
        Config myConfig = new Config();
        try
            {
            myConfig.load();
            }
        catch (Exception e)
            {
            e.printStackTrace(System.out);
            }
        boolean inAlarmState = false;
        DefaultCategoryDataset myDataset = new DefaultCategoryDataset();
        try
            {
        if (order_Desc != null)
            {
            myLastAggregation.sortByValueIncr();
            }
        else
            {
            myLastAggregation.sortByValue();
            }
            //-------------------------------------------------      
            Iterator itr = myLastAggregation.getKeysIterator();
            int count = 0;
            while (itr.hasNext() && count <= maxDataToDisplay)
                {
                String myLabel = (String) itr.next();
                double ActiveUsers = myLastAggregation.getValue(myLabel);
                String labelDesc = myLabel;
                if (labelDesc == null || labelDesc.equals("null"))
                    {
                    continue;
                    }

                myDataset.addValue(0, "below threshold", labelDesc);
                myDataset.addValue(ActiveUsers, "normal state", labelDesc);
                count++;
                }
            }
        catch (Exception e)
            {
            e.printStackTrace(System.out);
            System.out.println("DSLMON_SKOPIA:BRAS_servlet->createGraph error:" + e.toString());
            }
        int Xsize = 20 * (myDataset.getColumnCount()) + 40;
        if (Xsize < 700)
            {
            Xsize = 700;
            }
        int Ysize = 600;
        //-------------------------  
        if (myDataset.getColumnCount() > 0)
            {
            displayGraph(myDataset, graphTittle, response, Xsize, Ysize, inAlarmState, type);
            }
        }

    public void displayGraph(DefaultCategoryDataset dataset, String graphTittle, HttpServletResponse response, int Xsize, int Ysize, boolean inAlarmState, String type)
        {
        try
            {
            OutputStream out = response.getOutputStream();
            JFreeChart chart;
            CategoryPlot myPlot;
            chart = ChartFactory.createStackedBarChart(graphTittle, "", "sessions", dataset, PlotOrientation.HORIZONTAL, true, true, false);
            myPlot = chart.getCategoryPlot();
            myPlot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
            Ysize = Xsize;
            Xsize = 1000;
            if (inAlarmState == true)
                {
                chart.setBackgroundPaint(Color.orange);
                }
            chart.getTitle().setFont(new Font("Arial Narrow", Font.BOLD, 14));

            myPlot.getDomainAxis().setLowerMargin(0.050);
            // myPlot.getDomainAxis().setTickLabelFont(new Font("",Font.PLAIN,8));
            BarRenderer myBarRenderer = (BarRenderer) myPlot.getRenderer();
            myBarRenderer.setSeriesPaint(0, Color.red);// 
            myBarRenderer.setSeriesPaint(1, Color.ORANGE);// 
            //      myBarRenderer.setSeriesPaint(3, Color.gray);//
            response.setContentType("image/png");
            ChartUtilities.writeChartAsPNG(out, chart, Xsize, Ysize);
            }
        catch (IOException throwable)
            {
            System.out.println(throwable.toString());
            }
        finally
            {
            }
        }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
        processRequest(request, response);
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
        processRequest(request, response);
        }

    @Override
    public String getServletInfo()
        {
        return "Short description";
        }// </editor-fold>

    }

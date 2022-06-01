package SKOPIA;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nsofiasLib.databases.DatabaseLogger;
import nsofiasLib.others.Parameters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.mapper.Counters_1D_decimal;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author nsofias
 */
public class HistoryServlet extends HttpServlet
    {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
        try
            {
            response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
            response.setHeader("Pragma", "no-cache"); //HTTP 1.0
            response.setDateHeader("Expires", 0); //prevents caching at the proxy server
            request.setCharacterEncoding("UTF-8");
            //-------------------------------
            ServletContext myContext = request.getServletContext();
            //-------variables only for statistics--  
            int maxDataToDisplay = 100;
            String maxDataToDisplay_ = request.getParameter("maxDataToDisplay");
            if (maxDataToDisplay_ != null)
                {
                maxDataToDisplay = Integer.valueOf(maxDataToDisplay_);
                }
            //---            
            String myResource = new String(request.getParameter("resource").getBytes("iso-8859-1"), "UTF-8");
            String type = request.getParameter("type");
            //String myResource = request.getParameter("resource");
            //-------
            ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
            Container myCCMonitorStatsObjsContainer = null;
            for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
                {
                if (type != null && type.equals(myGroupBy_Daemon.getDesc()))
                    {
                    myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
                    }
                }
            if (myCCMonitorStatsObjsContainer == null)
                {
                return;
                }
            String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
            DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
            myDatabaseLogger.connect();
            Counters_1D_decimal statObjs = myCCMonitorStatsObjsContainer.getShotsOfLabel(myResource, type);
            statObjs.sortByKey();
            Patern myPatern = myCCMonitorStatsObjsContainer.getTraffic_paterns().get(myResource);
            //System.out.println"statObjs size=" + statObjs.size());
            myDatabaseLogger.close();
            //--------------------------------------------------
            DefaultCategoryDataset myDataset = prepareGraph(statObjs, myPatern, maxDataToDisplay);
            int Xsize = 30 * (myDataset.getColumnCount()) + 40;
            if (Xsize < 400)
                {
                Xsize = 400;
                }
            int Ysize = 530;//
            String graphTittle;

            graphTittle = "History for resource:" + myResource;
            if (myDataset.getColumnCount() > 0)
                {
                displayGraph(myDataset, graphTittle, response, Xsize, Ysize);
                }
            }
        catch (NumberFormatException e)
            {
            }
        catch (Exception e)
            {
            System.out.println("historyServlet processRequest error:" + e.toString());
            }
        finally
            {
            }
        }

    public DefaultCategoryDataset prepareGraph(Counters_1D_decimal statObjs, Patern myPatern, int maxDataToDisplay)
        {
        DefaultCategoryDataset myDataset = new DefaultCategoryDataset();
        Iterator myIterator = statObjs.getKeysIterator();
        int count = 0;
        while (myIterator.hasNext() && count < maxDataToDisplay)
            {
            count++;
            try
                {
                String l = (String) myIterator.next();
                String myLabel = new TimeStamp1(l).getNowFormated();
                //   System.out.printlnmyStatsObj.getDisplayName()+"  "+myStatsObj.getTotalCalls()+"   "+myStatsObj.getReasons().getTotalCount()); 
                myDataset.addValue(statObjs.getValue(l), "aggregations perc", myLabel);
                //System.out.println100*statObjs.getValue(i));
                }
            catch (Exception e)
                {
                System.out.println("DSLMON_SKOPIA:historyServlet prepareGraph error:" + e.toString());
                }
            }
        return myDataset;
        }

    public void displayGraph(DefaultCategoryDataset dataset, String graphTittle, HttpServletResponse response, int Xsize, int Ysize)
        {
        try
            {
            OutputStream out = response.getOutputStream();
            JFreeChart chart = ChartFactory.createLineChart(graphTittle, "", "sessions", dataset, PlotOrientation.VERTICAL, true, true, false);
            chart.getTitle().setFont(new Font("Arial Narrow", Font.BOLD, 14));
            chart.setBackgroundPaint(Color.white);
            CategoryPlot myPlot = chart.getCategoryPlot();
            myPlot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.UP_45);
            myPlot.getDomainAxis().setLowerMargin(0.025);
            myPlot.getDomainAxis().setTickLabelFont(new Font("", Font.PLAIN, 13));
//           myPlot.setRangeGridlinePaint(Color.GREEN);
            CategoryItemRenderer myBarRenderer = (CategoryItemRenderer) myPlot.getRenderer();
            myBarRenderer.setSeriesPaint(0, Color.blue);
            response.setContentType("image/png");
            ChartUtilities.writeChartAsPNG(out, chart, Xsize, Ysize);
//           ChartUtilities.writeChartAsJPEG(out, chart,Xsize,Ysize);
            out.flush();
            out.close();
            }
        catch (IOException e)
            {
            System.out.println("DSLMON_SKOPIA:historyServlet displayGraph error:" + e.toString());
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

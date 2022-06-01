package SKOPIA;

import diligent_MKT.Ticket_FYROM;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.HorizontalAlignment;

/**
 *
 * @author nsofias
 */
public class StatsTickets_Servlet extends HttpServlet
    {

    String H24;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
        ServletContext myContext = request.getServletContext();
        try
            {
            Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
            myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
            }
        catch (Exception e)
            {
            }
        //------------------------------
        Container myCCMonitorStatsObjsContainer = null;
        ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
        List<Ticket> ticketsList = new ArrayList();
        for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
            {
            myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
            ticketsList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsAsArrayList());
            }
        try
            {
            Collections.sort(ticketsList);
            }
        catch (Exception e)
            {
            }
        //out.println(ticketsList.size());
        //----------------------------------------
        Collections.sort(ticketsList);
        String accorTo = request.getParameter("accorTo");//duration,affected,timestamp,place,type,criticality
        if (accorTo == null)
            {
            accorTo = "ALL";
            }
        H24 = request.getParameter("H24");
        //----
        String T1, T2;
        try
            {
            if (request.getParameter("hoursBack") != null)
                {
                int hours = Integer.parseInt(request.getParameter("hoursBack"));
                TimeStamp1 t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());
                TimeStamp1 t2 = new TimeStamp1(t1.getNowUnformated());
                t2.addHours(-hours);
                T1 = t1.getNowUnformated();
                T2 = t2.getNowUnformated();
                }
            else if (request.getParameter("from") != null && request.getParameter("to") != null)
                {
                T1 = request.getParameter("from");
                T2 = request.getParameter("to");
                }
            else
                {
                TimeStamp1 t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());
                TimeStamp1 t2 = new TimeStamp1(t1.getNowUnformated());
                t2.addHours(-24);
                T1 = t1.getNowUnformated();
                T2 = t2.getNowUnformated();
                }
            }
        catch (Exception e)
            {
            e.printStackTrace(System.out);
            return;
            }
        //        
        Counters myDistrib = new Counters();

        switch (accorTo)
            {
            case "duration":
                myDistrib.updateCounters("0 to 5 min", 0);
                myDistrib.updateCounters("6 to 10 min", 0);
                myDistrib.updateCounters("11 to 15 min", 0);
                myDistrib.updateCounters("16 to 30 min", 0);
                myDistrib.updateCounters("31 to 60 min", 0);
                myDistrib.updateCounters("61 to ...", 0);

                break;
            case "affected":
                myDistrib.updateCounters("0 to 10", 0);
                myDistrib.updateCounters("11 to 20", 0);
                myDistrib.updateCounters("21 to 50", 0);
                myDistrib.updateCounters("51 to 200", 0);
                myDistrib.updateCounters("201 to 500", 0);
                myDistrib.updateCounters("501 to ...", 0);
                break;
            }
        // -------- create statistics only for closed/inService SRs ------------

        for (Object myAlarmObj : ticketsList)
            {
            Ticket_FYROM myTicket = (Ticket_FYROM) myAlarmObj;
            System.out.println("myTicket:" + myTicket.toString());
            if (myTicket.getElementsList().size() > 0 && !myTicket.isStillAlive())
                {
                System.out.println("myTicket:" + myTicket.getType());
                TimeStamp1 ticketT1 = new TimeStamp1(myTicket.getIncidentStartDate());
                TimeStamp1 ticketT2 = new TimeStamp1(myTicket.getIncidentStoppedDate());
                double duration = ticketT2.minutesDiff(ticketT1);
                //

                //---------------------------------------------------
                if (T1 != null && T2 != null)
                    {
                    String ticketT1_str = myTicket.getIncidentStartDate();
                    if (ticketT1_str.compareTo(T1) > 0 || ticketT1_str.compareTo(T2) < 0)
                        {
                        continue;
                        }
                    }

                //---------------------------------------------------
                String durationStr;
                if (duration < 5)
                    {
                    durationStr = "0 to 5 min";
                    }
                else if (duration <= 10)
                    {
                    durationStr = "6 to 10 min";
                    }
                else if (duration <= 15)
                    {
                    durationStr = "11 to 15 min";
                    }
                else if (duration <= 30)
                    {
                    durationStr = "16 to 30 min";
                    }
                else if (duration <= 60)
                    {
                    durationStr = "31 to 60 min";
                    }
                else
                    {
                    durationStr = "61 to ...";
                    }
                String AlertType = myTicket.getSubType();
                int affectedResources = myTicket.getCurrentUsersDisconnected();
                String affectedResourcesStr;
                if (affectedResources <= 10)
                    {
                    affectedResourcesStr = "0 to 10";
                    }
                else if (affectedResources <= 20)
                    {
                    affectedResourcesStr = "11 to 20";
                    }
                else if (affectedResources <= 50)
                    {
                    affectedResourcesStr = "21 to 50";
                    }
                else if (affectedResources <= 200)
                    {
                    affectedResourcesStr = "51 to 200";
                    }
                else if (affectedResources <= 500)
                    {
                    affectedResourcesStr = "201 to 500";
                    }
                else
                    {
                    affectedResourcesStr = "501 to ...";
                    }
//                if (myTicket.getArea().isEmpty())
//                    myTicket.updateTicketDetails(myAreaFinder);                
                String myArea = myTicket.getArea();
                int criticality = myTicket.getCriticality();
                String criticality_ = "";
                switch (criticality) {
                    case 1:
                        criticality_ = "WARNING";
                        break;
                    case 2:
                        criticality_ = "MINOR";
                        break;
                    case 3:
                        criticality_ = "MAJOR";
                        break;
                    case 4:
                        criticality_ = "CRITICAL";
                        break;
                    default:
                        break;
                }

                ////duration,affected,timestamp,place,type   
                System.out.println(
                        "accorTo = " + accorTo);
                switch (accorTo)
                    {
                    case "duration":
                        myDistrib.updateCounters(durationStr);
                        System.out.println("myDistrib.updateCounters(durationStr)");
                        break;
                    case "affected":
                        myDistrib.updateCounters(affectedResourcesStr);
                        System.out.println("myDistrib.updateCounters(affectedResourcesStr)");
                        break;
                    case "timestamp":
                        myDistrib.updateCounters(ticketT1.getNowUnformated().substring(0, 11));
                        System.out.println("myDistrib.updateCounters(ticketT1.getNowUnformated().substring(0, 11))");
                        break;
                    case "place":
                        myDistrib.updateCounters(myArea);
                        System.out.println("myDistrib.updateCounters(myArea)");
                        break;
                    case "type":
                        myDistrib.updateCounters(AlertType);
                        System.out.println("myDistrib.updateCounters(AlertType)");
                        break;
                    case "criticality":
                        myDistrib.updateCounters(String.valueOf(criticality_));
                        System.out.println("myDistrib.updateCounters(String.valueOf(criticality_)");
                        break;
                    }
                }
            }
        if (H24 == null)
            {
            myDistrib.calculatePercValues();
            }
        if (request.getParameter("text") == null)
            {
            createGraph(myDistrib, "Distribution of Tickets according to " + accorTo,accorTo,response);
            }
        else
            {
            createReport("Distribution accord. to " + accorTo + " between " + T1 + " and " + T2, myDistrib, accorTo, response);
            }
        }

    public void createReport(String header, Counters myDistrib, String accorTo, HttpServletResponse response)
        {
        try
            {
            PrintWriter out = response.getWriter();
            out.println("<head><title>Alarms</title><link rel='stylesheet' href='global_1.css'>");
            out.println(header);
            out.println("<Table>");
            out.println("<tr>");
            out.println("<th>" + accorTo + "</th>");
            out.println("<th>All</th>");
            out.println("</tr>");
            long total = myDistrib.getTotalCount();
            for (String label : myDistrib.keySet()){
                out.println("<tr>");
                long count = myDistrib.getCount(label);
                out.println("<td>" + label + "</td>");
                out.println("<td>" + count + " ( " + 1.0 * count / total + " ) </td>");
                out.println("</tr>");
                }
            out.println("<Table>");
            }
        catch (Exception e)
            {
            System.out.println("DSLMON:" + e.toString());
            }
        }

    public void createGraph(Counters myDistrib, String graphTittle,String accorTo, HttpServletResponse response)
        {            
        boolean inAlarmState = false;
        DefaultCategoryDataset myDataset = new DefaultCategoryDataset();
        try
            {
            //-------------------------------------------------   
            long total = myDistrib.getTotalCount();

            List<String> labels = myDistrib.getLabelsSortedBy(Counters.sortByCountDesc);    
       
            for (String header : labels)
                {
                long all = myDistrib.getCount(header);

                if (H24 == null)
                    {
                    myDataset.addValue(100.0 * all / total, "Opened(%)", header);
                    }
                else
                    {
                    myDataset.addValue(all, "Opened", header);
                    }
                }
            }
        catch (Exception e)
            {
            System.out.println("DSLMON:" + e.toString());
            }
        int Xsize = 20 * (myDataset.getColumnCount()) + 40;
        if (Xsize < 400)
            {
            Xsize = 400;
            }
        int Ysize = 400;
        //-------------------------  
        if (myDataset.getColumnCount() > 0)
            {
            displayGraph(myDataset, graphTittle, response, Xsize, Ysize, inAlarmState);
            }
        }

    public void displayGraph(DefaultCategoryDataset dataset, String graphTittle, HttpServletResponse response, int Xsize, int Ysize, boolean inAlarmState)
        {
        try
            {
            OutputStream out = response.getOutputStream();
            JFreeChart chart;
            if (H24 == null)
                {
                chart = ChartFactory.createStackedBarChart(graphTittle, "", "Percentage (%)", dataset, PlotOrientation.VERTICAL, true, true, false);
                }
            else
                {
                chart = ChartFactory.createStackedBarChart(graphTittle, "", "Number Of Tickets", dataset, PlotOrientation.VERTICAL, true, true, false);
                }
            if (inAlarmState == true)
                {
                chart.setBackgroundPaint(Color.orange);
                }
            chart.getTitle().setFont(new Font("Arial Narrow", Font.PLAIN, 15));
            chart.getTitle().setHorizontalAlignment(HorizontalAlignment.LEFT);
            CategoryPlot myPlot = chart.getCategoryPlot();
//             myPlot.setBackgroundPaint(Color.white);
            myPlot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.UP_45);
            myPlot.getDomainAxis().setLowerMargin(0.050);
            // myPlot.getDomainAxis().setTickLabelFont(new Font("",Font.PLAIN,8));
            BarRenderer myBarRenderer = (BarRenderer) myPlot.getRenderer();
            myBarRenderer.setSeriesPaint(0, Color.decode("#4E9258"));
            myBarRenderer.setSeriesPaint(1, Color.decode("#990012"));
            myBarRenderer.setSeriesPaint(2, Color.orange);//Commercial            
            //      myBarRenderer.setSeriesPaint(3, Color.gray);//
            response.setContentType("image/png");
            ChartUtilities.writeChartAsPNG(out, chart, Xsize, Ysize);
            }
        catch (IOException throwable)
            {
            System.out.println("DSLMON:" + throwable.toString());
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

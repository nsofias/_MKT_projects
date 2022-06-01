/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SKOPIA;

import diligent_MKT.Alarm_FYROM;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;

/**
 *
 * @author nsofias
 */
public class alarmsWS_servlet extends HttpServlet
    {

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
            throws ServletException, IOException
        {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
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
            Container myCCMonitorStatsObjsContainer = (Container) myContext.getAttribute("statsObjContainer");
            List alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
            Collections.sort(alarmArrayList);
            String myDslam = request.getParameter("DSLAM");
            String type = request.getParameter("type");
            if (type == null || type.isEmpty())
                {
                type = "ALL";
                }
            //---------
            int criticality = 0;
            try
                {
                criticality = Integer.parseInt(request.getParameter("criticality"));
                }
            catch (Exception e)
                {
                }
            //-----------------
            String status = request.getParameter("status");
            if (status == null || status.isEmpty())
                {
                status = "ALL";
                }
            //-------------------------------------------------------
            String mySR = request.getParameter("SR");
            if (mySR != null)
                {
                type = "ALL";
                status = "ALL";
                criticality = 0;
                }

            //---------------------------------------------------------- 
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
                    t2.addHours(-1);
                    T1 = t1.getNowUnformated();
                    T2 = t2.getNowUnformated();
                    }
                }
            catch (Exception e)
                {
                out.println("NO CLOCK YET!!!!!!!!");
                return;
                }
            if (alarmArrayList.isEmpty())
                {
                return;
                }
            /////////////////////
            for (Object myAlarmObj : alarmArrayList)
                {
                Alarm_FYROM myAlarm = (Alarm_FYROM) myAlarmObj;
                if (status.contains("alive") && !myAlarm.isStilAlive())
                    {
                    continue;
                    }
                if (myAlarm.getLinesDisconnected() < criticality)
                    {
                    continue;
                    }
                if (mySR != null && !myAlarm.getTicketId().equals(mySR))
                    {
                    continue;
                    }
                if (myAlarm.getAlarmStop().compareTo(T1) <= 0 && myAlarm.getAlarmStop().compareTo(T2) >= 0)
                    {
                    out.println(myAlarm.toString());
                    }

                }
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

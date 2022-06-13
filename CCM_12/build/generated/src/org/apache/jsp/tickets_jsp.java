package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.google.gson.Gson;
import java.util.Set;
import nsofiasLib.utils.Counters1;
import nsofiasLib.ote.alarms.Ticket;
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

public final class tickets_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 String userTypes = "00,01,02";
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    //String userTypes = "00,01,02";
    //  ----------- SEQURITY CHECK ---------------
    String request_URI = request.getRequestURI();
    request_URI = request_URI.substring(request_URI.lastIndexOf("/") + 1);
    String url = "login.jsp?request_URI=" + request_URI;
    String userType = (String) session.getAttribute("role");
    String username = (String) session.getAttribute("username");
    if (userType == null)
        {
      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward(url);
        return;
      }
      out.write('\r');
      out.write('\n');
  return;
    }
else if (userType.endsWith("-expired"))// password expired
        {
        
      out.write("\r\n");
      out.write("        <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password is expired!!!</font>\r\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("change_password.jsp");
        return;
      }
      out.write("\r\n");
      out.write("        ");
return;
        }

      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
//----------- sequrity----------------
    try {
        if (!userTypes.contains(userType)) {

      out.write("\r\n");
      out.write("<font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, you are not authorized to view this page!!!</font>\r\n");
return;
        }
    } catch (Exception e) {
    }
//----------- sequrity end----------------

      out.write('\r');
      out.write('\n');

    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    TimeStamp1 myLastCallInputTimeStamp = myCCMonitorStatsObjsContainer.getMyLastCallInputTimeStamp();
    TimeStamp1 now = new TimeStamp1();
    double sinse_myLastNewAlarms = (int) now.secondsDiff(myLastCallInputTimeStamp);
    String openTicket = request.getParameter("openTicket");
    if (openTicket != null) {

    }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Tickets</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            var max_timePage = 120;\r\n");
      out.write("            var max_timeData = ");
      out.print(sinse_myLastNewAlarms);
      out.write(";\r\n");
      out.write("            var cinterval = setInterval('countdown_timer()', 1000);\r\n");
      out.write("\r\n");
      out.write("            function countdown_timer() {\r\n");
      out.write("                max_timePage--;\r\n");
      out.write("                max_timeData++;\r\n");
      out.write("                document.getElementById('countdownPage').innerHTML = max_timePage;\r\n");
      out.write("                document.getElementById('countdownData').innerHTML = max_timeData;\r\n");
      out.write("                //\r\n");
      out.write("                if (max_timePage === 0) {\r\n");
      out.write("                    clearInterval(cinterval);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        try {
            myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        } catch (Exception e) {
        }
        //---------------------- parameters ----------------

        AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
        //------------------------------------
        Map<String, CCMAlarm> alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
        if (alarmArrayList.isEmpty()) {
            out.println("<h2>No current alarms found ...</h2>");
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
            out.println("NO CLOCK YET!!!!!!!!");
            return;
        }
        t2 = new TimeStamp1(t1.getNowUnformated());
        t2.addHours(-24);
        //System.out.println("CCM12:from, to =" + t1.getNowFormated() + " " + t2.getNowFormated());
        AggregationsForPeriod myAggregationsForPeriod = myCCMonitorStatsObjsContainer.getCurrentObject();
        Set<String> types = myAggregationsForPeriod.getAggregationLabels();
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"tickets.jsp\">\r\n");
      out.write("            Alarm Type:<select name=\"alarmType\" onchange=\"this.form.submit()\">                \r\n");
      out.write("                ");

                    String alarmType = request.getParameter("alarmType");
                    if (alarmType == null) {
                        alarmType = "ANY";
                    }
                    out.println("<option value='ANY'>ANY</option>");
                    for (String type : types) {
                        if (!type.startsWith("DIMENSSION")) {
                            if (type.equals(alarmType)) {
                                out.println("<option selected value='" + type + "'>" + type + "</option>");
                            } else if (!type.startsWith("DIMENSSION")) {
                                out.println("<option value='" + type + "'>" + type + "</option>");
                            }
                        }
                    }
                
      out.write("\r\n");
      out.write("            </select>&nbsp;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            &nbsp;&nbsp;Ticket state :<select name=\"ticketState\" onchange=\"this.form.submit()\">                    \r\n");
      out.write("                ");

                    String ticketState = request.getParameter("ticketState");
                    if (ticketState == null) {
                        ticketState = "ANY";
                    }
                    out.println("<option value='ANY'>ANY</option>");
                    out.println("<option selected value='" + ticketState + "'>" + ticketState + "</option>");
                    out.println("<option value='" + Ticket.STATE_OPEN + "'>" + Ticket.STATE_OPEN + "</option>");
                    out.println("<option value='" + Ticket.STATE_CANCELED + "'>" + Ticket.STATE_CANCELED + "</option>");
                    out.println("<option value='" + Ticket.STATE_CLOSED + "'>" + Ticket.STATE_CLOSED + "</option>");
                    out.println("<option value='" + Ticket.STATE_OPEN_FAILED + "'>" + Ticket.STATE_OPEN_FAILED + "</option>");
                    out.println("<option value='" + Ticket.STATE_PENDING_TO_OPEN + "'>" + Ticket.STATE_PENDING_TO_OPEN + "</option>");
                    out.println("<option value='" + Ticket.STATE_UPDATED + "'>" + Ticket.STATE_UPDATED + "</option>");

                
      out.write("        \r\n");
      out.write("            </select>            \r\n");
      out.write("\r\n");
      out.write("        </form>        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table border=\"0\" width=\"100%\"   id=\"table1\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td nowrap width=\"5%\" bgcolor=\"Gray\"><font color=\"white\">Page will refresh in (sec): <span id=\"countdownPage\">0</span></font></td>                \r\n");
      out.write("                <td nowrap width=\"5%\" bgcolor=\"Gray\"><font color=\"white\">Data last update since (sec): <span id=\"countdownData\">0</span></font></td>                                   \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>        \r\n");
      out.write("\r\n");
      out.write("        <table  border='1'>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>On the map view</th>\r\n");
      out.write("                <th>SR number</th>\r\n");
      out.write("                <th>sourse</th>\r\n");
      out.write("                <th>Parent</th>                \r\n");
      out.write("                <th>SR started</th>\r\n");
      out.write("                <th>SR stopped</th>\r\n");
      out.write("                <th>SR reported</th>  \r\n");
      out.write("                <th>SR type</th>  \r\n");
      out.write("                <th>Ticket State</th>\r\n");
      out.write("                <th>Customer calls</th>\r\n");
      out.write("                <th>Bound CTTs</th>\r\n");
      out.write("                <th>signature</th>\r\n");
      out.write("                <th>reason</th>\r\n");
      out.write("                <th>affected</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
                ArrayList<String> alarmIds = new ArrayList(alarmArrayList.keySet());
                Collections.sort(alarmIds, Collections.reverseOrder());
                for (String key : alarmIds) {
                    CCMAlarm myAlarm = alarmArrayList.get(key);
                    //System.out.println("CCM12:alarms key=" + key);

                    String alertOrigin = myAlarm.getAlarmObject().replace(";", "; ");;
                    TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlertStart());
                    T0.addSeconds(-7400);
                    String StatusS = "";
                    boolean isAlive = myAlarm.isStilAlive();
                    if (isAlive) {
                        StatusS = "Ενεργο";
                    } else {
                        StatusS = "Μη ενεργό";
                    }
                    CCMTicket myCCMTicket = null;
                    if (myAlarm.getTicketId() != null) {
                        myCCMTicket = myAlarmsDetectionListener.getTicketsMap().get(myAlarm.getTicketId());
                    }
                    String signatute = "";
                    String sr = "";
                    String incidentStartDate = "";
                    String incidentStoppedDate = "";
                    String srReported = "";
                    if (myCCMTicket != null && myCCMTicket.getSR() != null && !myCCMTicket.getSR().isEmpty()) {
                        if ((!alarmType.equals("ANY") && !alarmType.equals(myCCMTicket.getType()))
                                || (!ticketState.equals("ANY") && (myCCMTicket == null || !ticketState.equals(myCCMTicket.getState())))) {
                            continue;
                        }
                        if (myCCMTicket.getLastSignature() != null) {
                            signatute = myCCMTicket.getLastSignature().getLabel();
                        }
                        sr = myCCMTicket.getSR();
                        if (sr == null) {
                            sr = myCCMTicket.getComments();
                        }
                        try {
                            srReported = new TimeStamp1(myCCMTicket.getIncidentReportedDate()).getNowFormated();
                        } catch (Exception e) {
                        }
                        try {
                            incidentStartDate = new TimeStamp1(myCCMTicket.getIncidentStartDate()).getNowFormated();
                        } catch (Exception e) {
                        }
                        try {
                            incidentStoppedDate = new TimeStamp1(myCCMTicket.getIncidentStoppedDate()).getNowFormated();
                        } catch (Exception e) {
                        }

                        Counters1 myResources = new Counters1();
                        myResources.updateCounters(myAggregationsForPeriod.getCurrentResourceCounters(myAlarm.getAlarmType()));
                        myResources.removeParameter("COUNT");
                        //-----------
                        Double[] latLon = myCCMTicket.getLatLon();
                        //--------
                        if (StatusS.equals("Ενεργο")) {
      out.write("\r\n");
      out.write("            <tr bgcolor = 'white'>\r\n");
      out.write("                ");
   } else {
      out.write("    \r\n");
      out.write("            <tr bgcolor>\r\n");
      out.write("                ");
   }
      out.write(" \r\n");
      out.write("                <td nowrap><a href=\"map_1.jsp?lat=");
      out.print(latLon[0]);
      out.write("&lon=");
      out.print(latLon[1]);
      out.write("\"><IMG src = \"fyrom.jpg\"/></a></td>\r\n");
      out.write("                <td><a href=\"CCMTicketInfo.jsp?myTicketId=");
      out.print(URLEncoder.encode(myAlarm.getTicketId(), "utf-8"));
      out.write("\" target=\"_blank\">");
      out.print(sr);
      out.write("</a></td>\r\n");
      out.write("                <td>");
      out.print(alertOrigin);
      out.write("</td> \r\n");
      out.write("                <td>");
      out.print(myAlarm.getAlarmParent().replace(";", "; "));
      out.write("</td>                              \r\n");
      out.write("                <td>");
      out.print(incidentStartDate);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(incidentStoppedDate);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(srReported);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(myCCMTicket.getType());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(myCCMTicket.getState().replace("STATE_", ""));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(myCCMTicket.getNumOfCalls());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(myCCMTicket.getNumOfCCTs());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(signatute);
      out.write("</td> \r\n");
      out.write("                ");
if (myCCMTicket.getState().equals(Ticket.STATE_OPEN) && false) {
      out.write("                \r\n");
      out.write("                <td><a href='alarms.jsp?myTicketId=");
      out.print(URLEncoder.encode(myCCMTicket.getTicketId(), "UTF-8"));
      out.write("' target='_blank'>close</a></td>\r\n");
      out.write("                ");
} else if (myCCMTicket.getState().equals(Ticket.STATE_CLOSED)) {
      out.write("                \r\n");
      out.write("                <!--<td><a href='tickets.jsp?openTicket=");
      out.print(myAlarm.getTicketId());
      out.write("' target='_blank'>open</a></td>-->\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                <td>");
      out.print(myCCMTicket.getAlertMostSignificantReason());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(myCCMTicket.getCustomerImpact());
      out.write("</td>\r\n");
      out.write("            </tr> \r\n");
      out.write("\r\n");
      out.write("            ");
           }

                }
      out.write("        \r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

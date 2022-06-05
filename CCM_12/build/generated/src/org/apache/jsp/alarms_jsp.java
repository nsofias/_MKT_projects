package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.google.gson.Gson;
import nsofiasLib.others.Parameters;
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

public final class alarms_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Alarms</title>\r\n");
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
        //--- remove alarm ---------
        String remove_alarmId = request.getParameter("remove_alarm");
        String gantt = request.getParameter("gantt");
        if (remove_alarmId != null) {
            CCMAlarm existingAlarm = myCCMonitorStatsObjsContainer.getAlarmArrayList().get(remove_alarmId);
            System.out.println("CCM12:" + remove_alarmId + " existingAlarm is " + existingAlarm);
            if (existingAlarm != null) {
                if (existingAlarm.getTicketId() != null) {
                    System.out.println("CCM12:" + remove_alarmId + " existingAlarm TicketId is not null");
                    CCMTicket myTicket = myAlarmsDetectionListener.getTicketsMap().get(existingAlarm.getTicketId());
                    if (myTicket != null && myTicket.getState().equals(Ticket.STATE_OPEN)) {
                        myTicket.setState(Ticket.STATE_PENDING_TO_CLOSE);
                    }
                }
                myCCMonitorStatsObjsContainer.getAlarmArrayList().remove(remove_alarmId);
                System.out.println("CCM12:" + remove_alarmId + " was removed");
            }
            remove_alarmId = "";
        }

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
        Counters1 reasons = myAggregationsForPeriod.getCurrentResourceCounters(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON);
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <table border=\"0\" width=\"100%\"   id=\"table1\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td nowrap width=\"5%\" bgcolor=\"Gray\"><font color=\"white\">Page will refresh in (sec): <span id=\"countdownPage\">0</span></font></td>                \r\n");
      out.write("                <td nowrap width=\"5%\" bgcolor=\"Gray\"><font color=\"white\">Data last update since (sec): <span id=\"countdownData\">0</span></font></td>                                   \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>        \r\n");
      out.write("        ");
if (gantt != null) {
      out.write("\r\n");
      out.write("        <IMG width='100%' src='AlarmsServletGantt?from=");
      out.print(t1.getNowUnformated());
      out.write("&to=");
      out.print(t2.getNowUnformated());
      out.write("'>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        <form action=\"alarms.jsp\">\r\n");
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
      out.write("            &nbsp;&nbsp;Reason :<select name=\"reason\" onchange=\"this.form.submit()\">                    \r\n");
      out.write("                ");

                    String myReason = request.getParameter("reason");
                    if (myReason == null) {
                        myReason = "ANY";
                    }
                    out.println("<option value='ANY'>ANY</option>");
                    List<String> alarmReasons = reasons.getLabelsAsList();
                    for (String reason : alarmReasons) {
                        if (myReason.equals(reason)) {
                            out.println("<option selected value='" + reason + "'>" + reason + "</option>");
                        } else {
                            out.println("<option value='" + reason + "'>" + reason + "</option>");
                        }
                    }
                
      out.write("        \r\n");
      out.write("            </select>\r\n");
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
      out.write("\r\n");
      out.write("            ");
if (request.getParameter(
                        "withSR") != null) {
      out.write("\r\n");
      out.write("            &nbsp;With SR<input onchange=\"this.form.submit()\" type=\"checkbox\" name=\"withSR\" checked=\"checked\" value=\"ON\" />\r\n");
      out.write("            ");
} else {
      out.write("\r\n");
      out.write("            &nbsp;With SR<input onchange=\"this.form.submit()\" type=\"checkbox\" name=\"withSR\" value=\"ON\" />\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        <table  border='1' width=\"100%\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>sourse</th>                \r\n");
      out.write("                <th>start</th>\r\n");
      out.write("                <th>stop</th>\r\n");
      out.write("                <th>type</th>                \r\n");
      out.write("                <th>significant reason</th>\r\n");
      out.write("                <th>Distinct callers</th>\r\n");
      out.write("                <th>Min Ticketing threshold</th>\r\n");
      out.write("                <th>Affected users</th>\r\n");
      out.write("                <th>SR</th>\r\n");
      out.write("                <th>SR reported time</th>\r\n");
      out.write("                <!--<th>Previous (closed) SR</th>-->\r\n");
      out.write("                <th>Ticket State</th>\r\n");
      out.write("                <th>Num Of CTTs</th>\r\n");
      out.write("                <th nowrap>signature</th>\r\n");
      out.write("                <th>comments</th>                \r\n");
      out.write("                <th>weather</th>\r\n");
      out.write("                <th>Childs</th>                \r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                ArrayList<String> alarmIds = new ArrayList(alarmArrayList.keySet());

                Collections.sort(alarmIds, Collections.reverseOrder());
                for (String key : alarmIds) {
                    CCMAlarm myAlarm = alarmArrayList.get(key);
                    //System.out.println("CCM12:alarms key=" + key);

                    String alertOrigin = myAlarm.getAlarmObject().replace(";", "; ");
                    //System.out.println("CCM12:" + alertOrigin);
                    TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlertStart());
                    TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlarmStop());
                    TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlertStart());
                    T0.addSeconds(-7400);
                    String AlertStart = T1.getNowFormated();
                    String AlarmStop = T2.getNowFormated();
                    String AlertType = myAlarm.getAlarmType();
                    if (AlertType == null) {
                        AlertType = "UNKNOWN";
                    }
                    String AlertTypeS = "";
                    if (AlertType.equals("REASON")) {
                        AlertTypeS = "Reason " + myAlarm.getAlarmObject();
                    } else {
                        AlertTypeS = AlertType;
                    }
                    String AlertMostSignificantReason = myAlarm.getAlertMostSignificantReason();
                    if ((!alarmType.equals("ANY") && !alarmType.equals(AlertType))
                            || (!myReason.equals("ANY") && !myReason.equals(AlertMostSignificantReason))) {
                        continue;
                    }
                    String StatusS = "";
                    boolean isAlive = myAlarm.isStilAlive();
                    if (isAlive) {
                        StatusS = "Ενεργο";
                    } else {
                        StatusS = "Μη ενεργό";
                    }
                    String resource = myAlarm.getAlarmObject();
                    CCMTicket myCCMTicket = null;
                    if (myAlarm.getTicketId() != null) {
                        myCCMTicket = myAlarmsDetectionListener.getTicketsMap().get(myAlarm.getTicketId());
                    }
                    String mySignature = "";
                    String srReported = "";
                    if (!ticketState.equals("ANY") && (myCCMTicket == null || !ticketState.equals(myCCMTicket.getState()))) {
                        continue;
                    }
                    String impact = "N/A";
                    if (myCCMTicket != null) {
                        try {
                            impact = String.valueOf(myCCMTicket.getCustomerImpact());
                            if (myCCMTicket.getLastSignature() != null) {
                                mySignature = myCCMTicket.getLastSignature().getLabel() + ":" + myCCMTicket.getLastSignature().getSynopsis();
                            }

                            srReported = new TimeStamp1(myCCMTicket.getIncidentReportedDate()).getNowFormated();
                        } catch (Exception e) {
                        }
                    }
                    if (request.getParameter("withSR") != null && myCCMTicket.getSR() == null) {
                        continue;
                    }
                    String childs = "";
                    if (myAlarm.getDesc() != null) {
                        childs = myAlarm.getDesc().replace(";", "; ");
                    }
                    //---------
                    Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");
                    int createTicketMinCallsDefault = myParameters.getIntValue("createTicketMinCalls.DEFAULT", 5);
                    long createTicketMinCallsForType = myParameters.getIntValue("createTicketMinCalls." + AlertType, createTicketMinCallsDefault);
                    //**********************************- dynamic ******************************************* 
                    if (myAlarm.getAffectedCustomers() > 0) {
                        createTicketMinCallsForType = 2 + java.lang.Math.round(0.002 * myAlarm.getAffectedCustomers());
                    }
                    //-----
                    if (StatusS.equals("Ενεργο")) {
      out.write("\r\n");
      out.write("            <tr bgcolor = 'white'>\r\n");
      out.write("                ");
   } else {
      out.write("    \r\n");
      out.write("            <tr>\r\n");
      out.write("                ");
   }
      out.write(" \r\n");
      out.write("                <td>");
      out.print(alertOrigin);
      out.write("</td>                                \r\n");
      out.write("                <td nowrap>");
      out.print(AlertStart.substring(0, 16));
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlarmStop.substring(0, 16));
      out.write("</td>  \r\n");
      out.write("                <td>");
      out.print(AlertTypeS);
      out.write("</td>  \r\n");
      out.write("                <td>");
      out.print(AlertMostSignificantReason);
      out.write("</td> \r\n");
      out.write("                <td><a href='numbers_called.jsp?resourceType=");
      out.print(AlertType);
      out.write("&resource=");
      out.print(URLEncoder.encode(resource, "UTF8"));
      out.write("&from=");
      out.print(T2.getNowUnformated());
      out.write("&to=");
      out.print(T1.getNowUnformated());
      out.write("' target='_blank'>");
      out.print((int) myAlarm.getTotalCalls());
      out.write(" </a></td>                \r\n");
      out.write("                <td>");
      out.print(createTicketMinCallsForType);
      out.write("</td>  \r\n");
      out.write("                <td>");
      out.print(impact);
      out.write("</td> \r\n");
      out.write("                ");
if (myCCMTicket != null) {
                        String sr = myCCMTicket.getSR() != null ? myCCMTicket.getSR() : "";
                
      out.write("                  \r\n");
      out.write("                <td><a href=\"CCMTicketInfo.jsp?myTicketId=");
      out.print(URLEncoder.encode(myAlarm.getTicketId(), "utf-8"));
      out.write("\" target=\"_blank\">");
      out.print(sr);
      out.write("</a></td>                                 \r\n");
      out.write("                <td>");
      out.print(srReported);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(myCCMTicket.getState().replace("STATE_", ""));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(myCCMTicket.getNumOfCCTs());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(mySignature);
      out.write("</td> \r\n");
      out.write("                <td>");
      out.print(myCCMTicket.getComments().replace(";", "; "));
      out.write("</td>                             \r\n");
      out.write("                <td>");
      out.print(myAlarm.getWeatherInfo());
      out.write("</td> \r\n");
      out.write("                <td>");
      out.print(childs);
      out.write("</td>   \r\n");
      out.write("                ");
} else {
      out.write("\r\n");
      out.write("                <td>-</td>\r\n");
      out.write("                <td>-</td>\r\n");
      out.write("                <td>-</td>\r\n");
      out.write("                <td>-</td>\r\n");
      out.write("                <td>-</td>\r\n");
      out.write("                <td>-</td>\r\n");
      out.write("                <td>");
      out.print(myAlarm.getWeatherInfo());
      out.write("</td>  \r\n");
      out.write("                <td>");
      out.print(childs);
      out.write("</td>                                   \r\n");
      out.write("                ");
}
      out.write("                              \r\n");
      out.write("                <td><a href='alarms.jsp?remove_alarm=");
      out.print(URLEncoder.encode(key, "utf-8"));
      out.write("' target='_blank'>remove</a></td>\r\n");
      out.write("                </b>  \r\n");
      out.write("\r\n");
      out.write("            </tr>        \r\n");
      out.write("            ");


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

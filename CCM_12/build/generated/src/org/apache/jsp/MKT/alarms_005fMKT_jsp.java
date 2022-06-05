package org.apache.jsp.MKT;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Comparator;
import com.google.gson.Gson;
import ccm.MKT.Ticket_MKT;
import java.util.stream.Collectors;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.Ticket_FYROM;
import java.net.URLEncoder;
import java.util.Map;
import nsofiasLib.ote.alarms.*;
import java.util.Iterator;
import java.util.Collections;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
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

public final class alarms_005fMKT_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String criticality_desc(int criticality) {
        if (criticality == 1) {
            return "WARNING";
        } else if (criticality == 2) {
            return "MINOR";
        } else if (criticality == 3) {
            return "MAJOR";
        } else if (criticality == 4) {
            return "CRITICAL";
        } else if (criticality == 5) {
            return "TOP CRITICAL";
        }
        return "WARNING";
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Alarms</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../global.css\">        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body  bgcolor=\"#D6DFF7\">  \r\n");
      out.write("\r\n");
      out.write("        ");

            ServletContext myContext = request.getServletContext();
            CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
            AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
            //---------------------------------------------------------
            List<Alarm_FYROM> alarmArrayList = new ArrayList();
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String text = request.getParameter("text");
            String ticketId = request.getParameter("ticketId");
            String type = "ALL";
            if (text != null) {
                out.println("text=" + text);
                out.flush();
                Ticket_FYROM myTicket_FYROM = (Ticket_FYROM) new Gson().fromJson(text, Ticket_FYROM.class);
                alarmArrayList.addAll(myTicket_FYROM.getElementsList());
                type = myTicket_FYROM.getType();

            } else if (ticketId != null) {
                myCCMonitorStatsObjsContainer.getAlarmArrayList().entrySet().stream().map(entry -> entry.getValue())
                        .filter(v -> v.getTicketId() != null)
                        .map(v -> (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(v.getTicketId()))
                        .filter(v -> v != null)
                        .map(v -> v.getMyTicket_IBM())
                        .filter(v -> v != null && v.getSR() != null && !v.getSR().isEmpty() && v.getTicketId().equals(ticketId))
                        .forEach(ticket -> {
                            alarmArrayList.addAll(ticket.getElementsList());
                        });

            } else {
                myCCMonitorStatsObjsContainer.getAlarmArrayList().entrySet().stream().map(entry -> entry.getValue())
                        .filter(v -> v.getTicketId() != null)
                        .map(v -> (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(v.getTicketId()))
                        .filter(v -> v != null)
                        .map(v -> v.getMyTicket_IBM())
                        .filter(v -> v != null && v.getSR() != null && !v.getSR().isEmpty())
                        .forEach(ticket -> {
                            alarmArrayList.addAll(ticket.getElementsList());
                        });
            }
            Collections.sort(alarmArrayList, Comparator.comparing((Alarm_FYROM a)->a.getAlarmStart()).reversed());
            String elType = "";
            if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER)) {
                elType = "Host : RSU : DSLAM : slot";
            } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE)) {
                elType = "RSU : Cable : DP";
            } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON)) {
                elType = "OLT : Shelf : Slot";
            } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE)) {
                elType = "ATC : Cable : BOX";
            }
        
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("        <table  border='1' width='100%'>\r\n");
      out.write("            <tr bgcolor=\"LightBlue\">\r\n");
      out.write("                <th></th>\r\n");
      out.write("                <th>");
      out.print(elType);
      out.write("</th>\r\n");
      out.write("                <th>Element sub Type</th>\r\n");
      out.write("                <th>Start</th>                \r\n");
      out.write("                <th>Stop</th>            \r\n");
      out.write("                <th>Status</th>                 \r\n");
      out.write("                <th>Registered lines</th> \r\n");
      out.write("                <th>Affected elements</th> \r\n");
      out.write("                <th>Ticket-ID</th>  \r\n");
      out.write("                <th>affected Service ID</th>\r\n");
      out.write("                <th>mark Customers affected Status</th>\r\n");
      out.write("                <th>release Customers affected Status</th>\r\n");
      out.write("                <th>reason</th>\r\n");
      out.write("                <th>B.Board</th>\r\n");
      out.write("                <th>Oppening profile</th>\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            ");

                for (Alarm_FYROM myAlarm : alarmArrayList) {

                    try {
                        String AlertOrigin = "-";
                        try {
                            AlertOrigin = myAlarm.getNetworkElementName();
                        } catch (Exception e) {
                            myAlarm.setAlarmObject("-");
                        }
                        AlertOrigin = AlertOrigin.replaceAll(";", " : ");
                        TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlarmStart());
                        //TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlarmStop());
                        TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlarmStart());
                        //out.println(new Gson().toJson(myAlarm));out.flush();
                        T0.addSeconds(-7400);
                        String AlertStart = new TimeStamp1(myAlarm.getAlarmStart()).getNowFormated();
                        String AlertStop = myAlarm.getAlarmStop() != null ? myAlarm.getAlarmStop() : "-";
                        String AlertTypeS = myAlarm.getAlarmType();
                        String desc = myAlarm.getDesc();
                        String sr = myAlarm.getTicketSR();
                        if (sr == null) {
                            sr = "";
                        }
                        String myObjType = myAlarm.getAlarmType();
                        String elementType = myAlarm.getAlarmSubType();
                        //
                        String usersAffected = "N/A";
                        if (myAlarm.getActiveLinesAffected() > 0) {
                            usersAffected = String.valueOf(myAlarm.getActiveLinesAffected());
                        }

                        if (myAlarm.isStilAlive()) {
            
      out.write("                            \r\n");
      out.write("            <tr  bgcolor=\"white\">  \r\n");
      out.write("                ");

                    if (myAlarm.isRepeated()) {
      out.write("\r\n");
      out.write("                <td nowrap>R</td>\r\n");
      out.write("                ");
 } else {
      out.write("\r\n");
      out.write("                <td nowrap></td>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("                <td nowrap>");
      out.print(AlertOrigin);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(elementType);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertStart.substring(0, 16));
      out.write("</td>\r\n");
      out.write("                <td nowrap></td>                                                          \r\n");
      out.write("                <td><b>alive!</b></td>\r\n");
      out.write("                <td nowrap><a href=\"linesRegistered.jsp?type=");
      out.print(myObjType);
      out.write("&path=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(myAlarm.getLinesRegistered());
      out.write("</a></td>\r\n");
      out.write("                <td nowrap><a href=\"http://10.232.63.13:8080/DILIGENT_MKT/pathsAffected.jsp?type=");
      out.print(myObjType);
      out.write("&path=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("\" target=\"_blank\">Affected Sub-Paths</a></td>                \r\n");
      out.write("                <td nowrap>");
      out.print(sr);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAffServiceID());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getMarkCustomersStatus());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getReleaseCustomersStatus());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAlarmReason());
      out.write("\r\n");
      out.write("                    ");
if (myAlarm.isDyingGasp()) {
      out.write("\r\n");
      out.write("                    <img src=\"img/power.jpg\" width=\"15\" height=\"15\" alt=\" P \"/>\r\n");
      out.write("                    ");
}
      out.write(" \r\n");
      out.write("                </td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getMyBulletinid());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAlarmOpenningProfile().toString());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(myAlarm.getATC());
      out.write("</td> \r\n");
      out.write("                 <td>");
      out.print(myAlarm.getSERVING_AREA());
      out.write("</td> \r\n");
      out.write("            </tr> \r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                ");

                    if (myAlarm.isRepeated()) {
      out.write("\r\n");
      out.write("                <td nowrap>R</td>\r\n");
      out.write("                ");
 } else {
      out.write("\r\n");
      out.write("                <td nowrap></td>\r\n");
      out.write("                ");
 }
      out.write("                                \r\n");
      out.write("                <td nowrap>");
      out.print(AlertOrigin);
      out.write("</td>                \r\n");
      out.write("                <td nowrap>");
      out.print(elementType);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertStart.substring(0, 16));
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertStop.substring(0, 16));
      out.write("</td>                          \r\n");
      out.write("                <td>closed</td>\r\n");
      out.write("                <td nowrap><a href=\"linesRegistered.jsp?type=");
      out.print(myObjType);
      out.write("&path=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(myAlarm.getLinesRegistered());
      out.write("</a></td>\r\n");
      out.write("                <td nowrap><a href=\"http://10.232.63.13:8080/DILIGENT_MKT/pathsAffected.jsp?type=");
      out.print(type);
      out.write("&path=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("\">Affected Sub-Paths</a></td>  \r\n");
      out.write("                <td nowrap>");
      out.print(sr);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAffServiceID());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getMarkCustomersStatus());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getReleaseCustomersStatus());
      out.write("</td>    \r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAlarmReason());
      out.write("\r\n");
      out.write("                    ");
if (myAlarm.isDyingGasp()) {
      out.write("\r\n");
      out.write("                    <img src=\"img/power.jpg\" width=\"15\" height=\"15\" alt=\" P \"/>\r\n");
      out.write("                    ");
}
      out.write(" \r\n");
      out.write("                </td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getMyBulletinid());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAlarmOpenningProfile().toString());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(myAlarm.getATC());
      out.write("</td> \r\n");
      out.write("                <td>");
      out.print(myAlarm.getSERVING_AREA());
      out.write("</td> \r\n");
      out.write("            </tr> \r\n");
      out.write("            ");

                        }
                    } catch (Exception e) {
                        out.println(e.toString());
                        e.printStackTrace();
                    }
                }
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.stream.Collectors;
import java.util.Comparator;
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

public final class tickets_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();



      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Tickets</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    ");
        String remove = request.getParameter("remove");
        String flush = request.getParameter("flush");

        AlarmsDetectionListener myTicketsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
        if (flush != null) {
            myTicketsDetectionListener.saveContent();
        }
        List<CCMTicket> tickets = myTicketsDetectionListener.getTicketsMap().values().stream()
                .map(v -> (CCMTicket) v)
                //.sorted(( v1,  v2) -> v2.getIncidentReportedDate().compareTo(v1.getIncidentReportedDate()))
                .sorted(Comparator.comparing((CCMTicket v) -> v.getIncidentReportedDate()).reversed())
                .collect(Collectors.toList());
        CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
        Map<String, CCMAlarm> alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
        List<String> alarmTicketIDs = alarmArrayList.values().stream().map(v -> v.getTicketId()).collect(Collectors.toList());
    
      out.write("\r\n");
      out.write("    <body>         \r\n");
      out.write("        <table  border='1'>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>sourse</th>\r\n");
      out.write("                <th>Parent</th>\r\n");
      out.write("                <th>SR number</th>\r\n");
      out.write("                <th>SR reported</th>  \r\n");
      out.write("                <th>SR type</th>  \r\n");
      out.write("                <th>Ticket State</th>\r\n");
      out.write("                <th>num Of CTTs</th>\r\n");
      out.write("                <th nowrap>signature</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                //ArrayList<String> ticketIDs = new ArrayList(tickets.keySet());
                //Collections.sort(ticketIDs, Collections.reverseOrder());
                for (CCMTicket myCCMTicket : tickets) {
                    //System.out.println("CCM12:alarms key=" + key);
                    try {
                        String signatute = "";
                        String sr = "";
                        String srReported = "";
                        String ticketId = myCCMTicket.getTicketId();
                        String comments = myCCMTicket.getComments();
                        int ctts = myCCMTicket.getNumOfCCTs();
                        String element = myCCMTicket.getElementName();
                        try {
                            if (myCCMTicket.getLastSignature() != null) {
                                signatute = myCCMTicket.getLastSignature().getLabel();
                            }
                            sr = myCCMTicket.getSR();
                            if (sr == null) {
                                sr = "";
                            }
                            srReported = new TimeStamp1(myCCMTicket.getIncidentReportedDate()).getNowFormated();
                        } catch (Exception e) {
                        }
                        String color;
                        if (!alarmTicketIDs.contains(ticketId)) {
                            color = "magenta";
                            if (remove != null) {
                                myTicketsDetectionListener.getTicketsMap().remove(ticketId);
                            }
                        } else if (myCCMTicket.getState().contains("OPEN")) {
                            color = "white";
                        } else {
                            color = "lightgrey";
                        }


            
      out.write("\r\n");
      out.write("            <tr bgcolor = \"");
      out.print(color);
      out.write("\">\r\n");
      out.write("                <td>");
      out.print(ticketId);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(element);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(sr);
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
      out.print(myCCMTicket.getNumOfCCTs());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(signatute);
      out.write("</td> \r\n");
      out.write("                <td>");
      out.print(ctts);
      out.write("</td> \r\n");
      out.write("                <td>");
      out.print(comments);
      out.write("</td>\r\n");
      out.write("            </tr> \r\n");
      out.write("\r\n");
      out.write("            ");

                    } catch (Exception e) {
                        System.out.println("CCM12:tickets_1 error====" + e.toString());
                        e.printStackTrace();
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.others.Helpme;
import java.util.Set;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.others.Parameters;
import java.util.Map;
import nsofiasLib.others.Parameters;
import java.util.Collections;
import java.net.URLEncoder;
import org.apache.catalina.ha.backend.CollectedInfo;
import java.text.NumberFormat;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.ArrayList;
import java.util.List;
import ccm.*;

public final class dashboard1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");
return;
            }
        } catch (Exception e) {
        }
//----------- sequrity end----------------
    
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<!--SERVING_AREA;ATC;DSLAM;OLT;SHELF;SLOT;CABLE;DP;BOX;-->\r\n");

    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    Set<String> dimensionLabels = myCCMonitorStatsObjsContainer.getCurrentObject().getAggregationLabels();
    AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");

    Map<String, SimpleDaemon> daemons = (Map<String, SimpleDaemon>) myContext.getAttribute("daemons");
    TimeStamp1 myLastCallInputTimeStamp = myCCMonitorStatsObjsContainer.getMyLastCallInputTimeStamp();
    TimeStamp1 now = new TimeStamp1();
    double sinse_myLastNewAlarms = (int) now.secondsDiff(myLastCallInputTimeStamp);
    int maxDataToDisplay = 30;
    int numOfCCTs = myAlarmsDetectionListener.getNumOfCCTs();
    int numOfTickets = myAlarmsDetectionListener.getNumOfTickets();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    try {
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    } catch (Exception e) {
    }

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"global.css\" type=\"text/css\"/>\r\n");
      out.write("    <title>CCM anomaly detection</title>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Alarms</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"global.css\">\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("        var max_timePage = 120;\r\n");
      out.write("        var max_timeData = ");
      out.print(sinse_myLastNewAlarms);
      out.write(";\r\n");
      out.write("        var cinterval = setInterval('countdown_timer()', 1000);\r\n");
      out.write("\r\n");
      out.write("        function countdown_timer() {\r\n");
      out.write("            max_timePage--;\r\n");
      out.write("            max_timeData++;\r\n");
      out.write("            document.getElementById('countdownPage').innerHTML = max_timePage;\r\n");
      out.write("            document.getElementById('countdownData').innerHTML = max_timeData;\r\n");
      out.write("            //\r\n");
      out.write("            if (max_timePage === 0) {\r\n");
      out.write("                clearInterval(cinterval);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <table border=\"0\" width=\"100%\"   id=\"table1\" >\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td nowrap width=\"5%\" bgcolor=\"Gray\"><font color=\"white\">Page will refresh in (sec): <span id=\"countdownPage\">0</span></font></td>                \r\n");
      out.write("            <td nowrap width=\"5%\" bgcolor=\"Gray\"><font color=\"white\">Data last update since (sec): <span id=\"countdownData\">0</span></font></td>                                   \r\n");
      out.write("        </tr>\r\n");
      out.write("    </table> \r\n");
      out.write("    <table border=\"0\" width=\"100%\" height=\"150\" id=\"table1\" >\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td width=\"30%\">     \r\n");
      out.write("                <table border=\"0\" width=\"100%\" height=\"150\" id=\"table1\" >\r\n");
      out.write("                    <tr><td>Last event Timestamp</td><td>");
      out.print(myCCMonitorStatsObjsContainer.getMyClock().getNowFormated().replace(":000", ""));
      out.write("</td></tr>\r\n");
      out.write("                    <tr><td>Aggregation period</td><td>");
      out.print(myCCMonitorStatsObjsContainer.getMeasurePeriod());
      out.write(" minutes</td></tr>\r\n");
      out.write("                    <tr><td>From</td><td>");
      out.print(new TimeStamp1(myCCMonitorStatsObjsContainer.getCurrentObject().getTo()).getNowFormated().replace(":000", ""));
      out.write("</td></tr>\r\n");
      out.write("                    <tr><td>To</td><td>");
      out.print(new TimeStamp1(myCCMonitorStatsObjsContainer.getCurrentObject().getFrom()).getNowFormated().replace(":000", ""));
      out.write("</td></tr>\r\n");
      out.write("                    <tr><td>CTTs (today)</td><td><b>");
      out.print(numOfCCTs);
      out.write("</b></td></tr>\r\n");
      out.write("                    <tr><td>Tickets (today)</td><td><b>");
      out.print(numOfTickets);
      out.write("</b></td></tr>\r\n");
      out.write("                    ");
if (numOfTickets > 0) {
      out.write("\r\n");
      out.write("                    <tr><td>CTTs/Ticket (today)</td><td><b>");
      out.print(Helpme.format_number(numOfCCTs / numOfTickets, 2));
      out.write("</b></td></tr>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                </table>   \r\n");
      out.write("            </td>           \r\n");
      out.write("            <td width=\"60%\"> \r\n");
      out.write("                <a href=\"QStatsObjsViewer_text.jsp?resourceType=");
      out.print(CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME);
      out.write("\" target=\"_blank\">");
      out.print(CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME);
      out.write("</a>\r\n");
      out.write("                <a href=\"QStatsObjsViewer.jsp?resourceType=");
      out.print(CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME);
      out.write("&maxDataToDisplay=");
      out.print(3 * maxDataToDisplay);
      out.write("&Ysize=350&lines\" target=\"_blank\"><IMG width=\"95%\" height=\"150\" id=\"TIME\" src=\"QStatsObjsViewer.jsp?resourceType=");
      out.print(CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME);
      out.write("&maxDataToDisplay=");
      out.print(2 * maxDataToDisplay);
      out.write("&Ysize=350&lines\"></IMG></a>\r\n");
      out.write("            </td>            \r\n");
      out.write("            <td> \r\n");
      out.write("                <a href=\"QStatsObjsViewer_text.jsp?resourceType=");
      out.print(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON);
      out.write("\" target=\"_blank\">");
      out.print(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON);
      out.write("</a>\r\n");
      out.write("                (");
      out.print((int) myCCMonitorStatsObjsContainer.getCurrentObject().getCurrentResourceCounters(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON).getTotalValue());
      out.write(")\r\n");
      out.write("                <a href=\"QStatsObjsViewer.jsp?resourceType=");
      out.print(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON);
      out.write("&maxDataToDisplay=");
      out.print(maxDataToDisplay);
      out.write("&Ysize=350\" target=\"_blank\"><IMG width=\"95%\" height=\"150\" id=\"REASON\" src=\"QStatsObjsViewer.jsp?resourceType=");
      out.print(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON);
      out.write("&Ysize=350\"></IMG></a>            \r\n");
      out.write("            </td> \r\n");
      out.write("\r\n");
      out.write("        </tr>           \r\n");
      out.write("    </table>    \r\n");
      out.write("    <table border=\"0\" width=\"100%\" height=\"300\" id=\"table1\" >   \r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            ");
  int count = 0;
                int maxInRow = 6;
                for (String resourceType : dimensionLabels) {
                    //System.out.println("CCM12:dashboard:resourceType="+resourceType);
                    if (!resourceType.equals(CCMonitorStatsObjsContainer.RESOURCE_TYPE_REASON)
                            && !resourceType.equals(CCMonitorStatsObjsContainer.RESOURCE_TYPE_TIME)) {
                        count++;
                        if (count > maxInRow) {
                            out.print("</tr><tr>");
                            count = 0;
                        }
            
      out.write("       \r\n");
      out.write("            <td>\r\n");
      out.write("                <a href=\"QStatsObjsViewer_text.jsp?resourceType=");
      out.print(resourceType);
      out.write("\" target=\"_blank\">");
      out.print(resourceType);
      out.write("</a>\r\n");
      out.write("                (");
      out.print((int) myCCMonitorStatsObjsContainer.getCurrentObject().getCurrentResourceCounters(resourceType).getTotalValueOfParam("COUNT"));
      out.write(")\r\n");
      out.write("                <p><a href=\"QStatsObjsViewer.jsp?resourceType=");
      out.print(resourceType);
      out.write("&maxDataToDisplay=");
      out.print(3 * maxDataToDisplay);
      out.write("&Ysize=500\" target=\"_blank\"><IMG width=\"95%\" height=\"150\"  id=\"");
      out.print(resourceType);
      out.write("\"  src=\"QStatsObjsViewer.jsp?resourceType=");
      out.print(resourceType);
      out.write("&maxDataToDisplay=15&Ysize=350\"></IMG></a>           \r\n");
      out.write("            </td> \r\n");
      out.write("            ");
}
                }
      out.write("    \r\n");
      out.write("        </tr>           \r\n");
      out.write("    </table> \r\n");
      out.write("    <!--\r\n");
      out.write("<p><iframe height = \"50\"  id=\"alarms\" name=\"alarms\" src=\"alarms.jsp\"></iframe>\r\n");
      out.write("    -->\r\n");
      out.write("</body>    \r\n");
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

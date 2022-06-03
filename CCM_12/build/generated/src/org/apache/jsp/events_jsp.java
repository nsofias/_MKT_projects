package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ccm.MKT.NetworkResourcesFinder_MKT;
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

public final class events_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    TimeStamp1 myLastCallInputTimeStamp = myCCMonitorStatsObjsContainer.getMyLastCallInputTimeStamp();
    TimeStamp1 now = new TimeStamp1();
    double sinse_myLastNewAlarms = (int) now.secondsDiff(myLastCallInputTimeStamp);

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Event stream</title>\r\n");
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

        Map<String, CallInfo> events = myCCMonitorStatsObjsContainer.getDimensionInstances();
        if (events.isEmpty()) {
      out.write("\r\n");
      out.write("    out.print(\"<h2>No current alarms found ...</h2>\");\r\n");
      out.write("    ");
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

    
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("        ");
  ArrayList<String> eventIds = new ArrayList(events.keySet());
            Collections.sort(eventIds, Collections.reverseOrder());
            int count = 0;
            out.println("<table width='100%'>");
            for (String key : eventIds) {
                CallInfo myCallInfo = events.get(key);

                if (myCallInfo.getResources().get("SERVING_AREA") == null) {
                   // myCallInfo = new NetworkResourcesFinder_MKT().findCLIsResourcesFromNCDB(myCallInfo.getLineId());
                    //out.println(myCallInfo1.toJson());
                }
                if (count++ > 1000) {
                    break;
                }
                try {
                    out.println("<tr><td>" + myCallInfo.getLineId() + "</td><td>" + myCallInfo.getStartTime() + " : " + myCallInfo.getNetworkType() + " : " + myCallInfo.getResources() + "</td></tr>");
                } catch (Exception e) {
                    System.out.println("CCM12:error====" + e.toString());
                    e.printStackTrace();
                }

            }
            out.println("<table width='100%'>");
        
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
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

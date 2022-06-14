package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ccm.AlarmsDetectionListener;
import ccm.CCMonitorStatsObjsContainer;
import java.util.Map;
import java.util.Properties;
import java.io.FileInputStream;
import nsofiasLib.utils.Counters;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.utils.FTPDaemon;
import java.text.NumberFormat;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import nsofiasLib.fileIO.FileParser2Daemon;
import java.util.ArrayList;
import java.util.List;

public final class threadsViewer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String userTypes = "00";
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    //String userTypes = "00,01,02";
    //  ----------- SEQURITY CHECK ---------------
    String request_URI = request.getRequestURI();
    request_URI = request_URI.substring(request_URI.lastIndexOf("/") + 1);
    String url = "login.jsp?request_URI=" + request_URI;
    String userType = (String) session.getAttribute("role");
    String username = (String) session.getAttribute("username");
    if (userType == null)
        {
      out.write('\n');
      if (true) {
        _jspx_page_context.forward(url);
        return;
      }
      out.write('\n');
  return;
    }
else if (userType.endsWith("-expired"))// password expired
        {
        
      out.write("\n");
      out.write("        <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password is expired!!!</font>\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("change_password.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");
return;
        }

      out.write('\n');
      out.write('\n');
      out.write('\n');

//----------- sequrity----------------
    try
        {
        if (!userTypes.contains(userType))
            {
            
      out.write("\n");
      out.write("            <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, you are not authorized to view this page!!!</font>\n");
      out.write("            ");
return;
            }
        }
    catch (Exception e)
        {
        }
//----------- sequrity end----------------

      out.write('\n');

    ServletContext myContext = request.getServletContext();
    //******************************************************************************************************************
    String Start = request.getParameter("Start");
    String Stop = request.getParameter("Stop");
    String Pause = request.getParameter("Pause");
    String pause_daemon = request.getParameter("pause_daemon");
    String continue_daemon = request.getParameter("continue_daemon");

    //String Refresh=request.getParameter("Refresh");


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Control Panel</title> \n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--            //****************************** STANDARD TEXT ***************************************************************** -->\n");
      out.write("        <h2>Application Threads!</h2>\n");
      out.write("        <form action=\"threadsViewer.jsp\">\n");
      out.write("            <input type=\"submit\" name=\"Start\" value=\"Start\" />\n");
      out.write("            <input type=\"submit\" name=\"Stop\" value=\"Stop\" />\n");
      out.write("            <input type=\"submit\" name=\"Pause\" value=\"Pause\" />\n");
      out.write("            <input type=\"submit\" name=\"Refresh\" value=\"Refresh\" />\n");
      out.write("        </form> \n");
      out.write("        ");
            
            NumberFormat myNumberFormat = NumberFormat.getInstance();
            myNumberFormat.setMinimumFractionDigits(2);
            myNumberFormat.setMaximumFractionDigits(2);
            myNumberFormat.setGroupingUsed(false);
            //
            Map<String, SimpleDaemon> daemons = (Map<String, SimpleDaemon>) myContext.getAttribute("daemons");
            CCMonitorStatsObjsContainer myContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
            AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) daemons.get("alarmsDetectionListener");
        
      out.write("\n");
      out.write("        <table style=\"text-align:left; font-size:20px;\" border=\"1\"  cellpadding=\"1\"  id=\"table2\" > \n");
      out.write("            <tr><td>AlarmArrayList size</td><td>");
      out.print(myContainer.getAlarmArrayList().size());
      out.write("</td></tr>\n");
      out.write("            <tr><td>DimensionInstances size</td><td>");
      out.print(myContainer.getDimensionInstances().size());
      out.write("</td></tr>\n");
      out.write("            <tr><td>Clock</td><td>");
      out.print(myContainer.getMyClock().getNowFormated());
      out.write("</td></tr>\n");
      out.write("            <tr><td>ClockFirstIn</td><td>");
      out.print(myContainer.getMyClockFirstIn().getNowFormated());
      out.write("</td></tr>\n");
      out.write("            <tr><td>Tickets size</td><td>");
      out.print(myAlarmsDetectionListener.getTicketsMap().size());
      out.write("</td></tr>\n");
      out.write("        </table>  \n");
      out.write("        ");

            if (daemons != null) {
                if (Stop != null) {
                    out.write("Stopping");
                    for (String daemonName : daemons.keySet()) {
                        SimpleDaemon mySimpleDaemon = daemons.get(daemonName);
                        mySimpleDaemon.setRunning(false);
                    }
                } else if (Pause != null) {
                    out.write("Pausing");
                    for (String daemonName : daemons.keySet()) {
                        SimpleDaemon mySimpleDaemon = daemons.get(daemonName);
                        mySimpleDaemon.setPaused(true);
                    }
                } else if (Start != null) {
                    out.write("Starting");
                    for (String daemonName : daemons.keySet()) {
                        SimpleDaemon mySimpleDaemon = daemons.get(daemonName);
                        mySimpleDaemon.setRunning(true);
                        if (mySimpleDaemon.isStopped()) {
                            new Thread(mySimpleDaemon).start();
                        }
                    }
                } else if (pause_daemon != null) {
                    out.write("Pausing daemon " + pause_daemon);
                    SimpleDaemon mySimpleDaemon = daemons.get(pause_daemon);
                    mySimpleDaemon.setPaused(true);
                } else if (continue_daemon != null) {
                    out.write("Continue_daemon daemon " + continue_daemon);
                    SimpleDaemon mySimpleDaemon = daemons.get(continue_daemon);
                    mySimpleDaemon.setPaused(false);
                }
        
      out.write("    \n");
      out.write("\n");
      out.write("        <p>       \n");
      out.write("        <table style=\"text-align:left; font-size:20px;\" border=\"1\"  cellpadding=\"1\"  id=\"table2\" >     \n");
      out.write("            <tr>\n");
      out.write("                <th>Daemon Name</th>\n");
      out.write("                <th>minutes since last Process Time</th>\n");
      out.write("                <th>minutes since last successful  Process Time</th>\n");
      out.write("                <th>State</th><th>Process Period (In Minutes)</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (String daemonName : daemons.keySet()) {
                    SimpleDaemon mySimpleDaemon = daemons.get(daemonName);
                    TimeStamp1 now = new TimeStamp1();
                    String timeDiff_, timeDiff1_;
                    if (mySimpleDaemon.getLastProccessTime() != null) {
                        TimeStamp1 lastProccessTime = new TimeStamp1(mySimpleDaemon.getLastProccessTime());
                        double timeDiff = now.minutesDiff(lastProccessTime);
                        timeDiff_ = myNumberFormat.format(timeDiff).replace(",", ".");
                    } else {
                        timeDiff_ = "never";
                    }
                    if (mySimpleDaemon.getLastSuccessfulProccessTime() != null) {
                        TimeStamp1 lastSuccessfulProccessTime = new TimeStamp1(mySimpleDaemon.getLastSuccessfulProccessTime());
                        double timeDiff1 = now.minutesDiff(lastSuccessfulProccessTime);
                        timeDiff1_ = myNumberFormat.format(timeDiff1).replace(",", ".");
                    } else {
                        timeDiff1_ = "never";
                    }
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(mySimpleDaemon.getDaemonName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(timeDiff_);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(timeDiff1_);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(mySimpleDaemon.getState());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(mySimpleDaemon.getProccessPeriodInMinutes());
      out.write("</td>\n");
      out.write("                ");
              if (!mySimpleDaemon.isPaused()) {
      out.write("\n");
      out.write("                <td><a href=\"threadsViewer.jsp?pause_daemon=");
      out.print(daemonName);
      out.write("\">pause</a></td>\n");
      out.write("                ");
  } else {
      out.write("\n");
      out.write("                <td><a href=\"threadsViewer.jsp?continue_daemon=");
      out.print(daemonName);
      out.write("\">continue</a></td>\n");
      out.write("                ");
      }
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
      }
      out.write("\n");
      out.write("        </Table>            \n");
      out.write("        <p></p>             \n");
      out.write("        ");
}
      out.write("       \n");
      out.write("        ");

            Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
            if (myCounters != null) {
                try {
                    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
                } catch (Exception e) {
                }
                if (myCounters != null && request.getParameter("Reset") != null) {
                    out.write("Reseting...");
                    myCounters.clear();
                }
        
      out.write("\n");
      out.write("        <iframe src= \"sessions.jsp\" frameborder= \"0\" width= \"500\" height=\"300\"></iframe>    \n");
      out.write("        <table style=\"text-align:left; font-size:20px;\" border=\"1\"  cellpadding=\"1\"  id=\"table1\" >                    \n");
      out.write("            ");

                List<String> labels = myCounters.getLabelsSortedBy(Counters.sortByDN);
                for (String label : labels) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(label);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(myCounters.getCount(label));
      out.write("</td>\n");
      out.write("            </tr>        \n");
      out.write("            ");
      }
                }
      out.write("\n");
      out.write("        </Table>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

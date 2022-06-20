package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.Ticket_FYROM;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.URLContextReader_object;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.FTPDaemon;
import java.text.NumberFormat;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import nsofiasLib.fileIO.FileParser2Daemon;
import java.util.ArrayList;
import java.util.List;
import SKOPIA.*;
import com.google.gson.*;
import java.io.*;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 String userTypes = "00";
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>CCMonitor</title>\r\n");
      out.write("        <meta http-equiv=\"refresh\" content=\"120; url=threadsViewer.jsp\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>            \r\n");
      out.write("        <h2>DSLMON Threads!</h2>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"threadsViewer.jsp\">\r\n");
      out.write("            <input type=\"submit\" name=\"Stop\" value=\"Stop DSLMON\" />\r\n");
      out.write("            <input type=\"submit\" name=\"Start\" value=\"Start DSLMON\" />\r\n");
      out.write("            <input type=\"submit\" name=\"Refresh\" value=\"Refresh\" />  \r\n");
      out.write("            <input type=\"submit\" name=\"flushTickets\" value=\"flushTickets\" />  \r\n");
      out.write("\r\n");
      out.write("        </form>        \r\n");
      out.write("        ");

            TimeStamp1 now = new TimeStamp1();
            ServletContext myContext = request.getServletContext();
            ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
            TicketsUpdateDaemon myTicketsUpdateDaemon = (TicketsUpdateDaemon) myContext.getAttribute("myTicketsUpdateDaemon");

            HealthCheckerDaemon myHealthCheckerDaemon = (HealthCheckerDaemon) myContext.getAttribute("myHealthCheckerDaemon");

//
            Counters myCounters = new Counters();
            try {
                myCounters = (Counters) myContext.getAttribute("browseCounters");
                myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
            } catch (Exception e) {
            }
            //
            String Reset = request.getParameter("Reset");
            String Start = request.getParameter("Start");
            String Stop = request.getParameter("Stop");
            String flushTickets = request.getParameter("flushTickets");
            //-----------------
            if (flushTickets != null) {
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                    try (Writer writer = new FileWriter(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/data/" + myGroupBy_Daemon.getDesc() + "_tickets.flash")) {
                        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
                        gson.toJson(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList(), writer);
                        //-------------
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/data/" + myGroupBy_Daemon.getDesc() + "_tickets.flash"));
                        Map<String, Ticket_FYROM> ticketsArrayList = new ConcurrentHashMap();
                        ticketsArrayList.clear();
                        Type type = new TypeToken<Map<String, Ticket_FYROM>>() {
                        }.getType();
                        ticketsArrayList = gson.fromJson(bufferedReader, type);
                        for (String key : ticketsArrayList.keySet()) {
                            out.println("<p>" + key);
                        }
                    } catch (IOException e) {
                        out.println("DSLMON_SKOPIA error:Tickets flushToDisk error:" + e.toString());
                    }
                }

            }
            if (Reset != null) {
                out.write("Reseting...");
                myCounters.clear();
            }
            if (Stop != null) {
                out.write("Stopping");
                System.out.println("DSLMON STOPPED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated());
                new MailAlert().sendmailAlert("DSLMON STOPPED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated(), "-");
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                    try {
                        myGroupBy_Daemon.setRunning(false);
                    } catch (Exception e) {
                        System.out.println("DSLMON_SKOPIA myGroupBy_Daemon timecheck error:" + "DSLMON_SKOPIA " + e.toString());
                        new MailAlert().sendmailAlert("DSLMON_SKOPIA myGroupBy_Daemon time check error:" + "DSLMON_SKOPIA " + e.toString(), e);
                    }
                }
                myHealthCheckerDaemon.setRunning(false);
                myTicketsUpdateDaemon.setRunning(false);
            }
            if (Start != null) {
                out.write("Starting");
                System.out.println("DSLMON STARTED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated());
                new MailAlert().sendmailAlert("DSLMON STARTED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated(), "-");
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                    try {
                        myGroupBy_Daemon.setRunning(true);
                    } catch (Exception e) {
                        System.out.println("DSLMON_SKOPIA myGroupBy_Daemon timecheck error:" + "DSLMON_SKOPIA " + e.toString());
                        new MailAlert().sendmailAlert("DSLMON_SKOPIA myGroupBy_Daemon time check error:" + "DSLMON_SKOPIA " + e.toString(), e);
                    }
                }
                myHealthCheckerDaemon.setRunning(true);
                myTicketsUpdateDaemon.setRunning(true);
                //
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                    try {
                        new Thread(myGroupBy_Daemon).start();
                    } catch (Exception e) {
                        System.out.println("DSLMON_SKOPIA myGroupBy_Daemon timecheck error:" + "DSLMON_SKOPIA " + e.toString());
                        new MailAlert().sendmailAlert("DSLMON_SKOPIA myGroupBy_Daemon time check error:" + "DSLMON_SKOPIA " + e.toString(), e);
                    }
                }
                if (myHealthCheckerDaemon.isStopped()) {
                    new Thread(myHealthCheckerDaemon).start();
                }
                if (myTicketsUpdateDaemon.isStopped()) {
                    new Thread(myTicketsUpdateDaemon).start();
                }
            }
            //

            NumberFormat myNumberFormat = NumberFormat.getInstance();
            myNumberFormat.setMinimumFractionDigits(2);
            myNumberFormat.setMaximumFractionDigits(2);
            myNumberFormat.setGroupingUsed(false);
//    
            //------------------
            ArrayList status = new ArrayList();
            status.add("<font color='green'>Started</font>");
            status.add("<font color='orange'>Stopping...</font>");
            status.add("<font color='red'>Stopped!</font>");
//-------------------------------------------------------------------
//-------------------------------------------------------------------
//-------------------------------------------------------------------
//-------------------------------------------------------------------
//-------------------------------------------------------------------

            TimeStamp1 myHealthCheckerDaemonTimeStamp = myHealthCheckerDaemon.getHealthMonitorTimeStamp();
            for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                Container myContainer = myGroupBy_Daemon.getMyStatsObjContainer();
                TimeStamp1 lastCycleTimeStamp = new TimeStamp1(myGroupBy_Daemon.getLastProccessTime());
                TimeStamp1 lastDataTimeStamp = new TimeStamp1(myGroupBy_Daemon.getLastSuccessfulProccessTime());
                TimeStamp1 myTicketsUpdateDaemonTimeStamp = myTicketsUpdateDaemon.getMyDaemonTimeStamp_cycle();
                TimeStamp1 myDSLFileParserDaemonTimeStampData = lastDataTimeStamp;
                double myDSLFileParserDaemonTimeStamp_fromNow = 0;
                double myHealthCheckerDaemonTimeStamp_fromNow = 0;
                double myTicketsUpdateDaemonTimeStamp_fromNow = 0;
                if (myDSLFileParserDaemonTimeStampData != null) {
                    myDSLFileParserDaemonTimeStamp_fromNow = -myDSLFileParserDaemonTimeStampData.minutesDiff(now);
                }
                if (myHealthCheckerDaemonTimeStamp != null) {
                    myHealthCheckerDaemonTimeStamp_fromNow = -myHealthCheckerDaemonTimeStamp.minutesDiff(now);
                }
                if (myTicketsUpdateDaemonTimeStamp != null) {
                    myTicketsUpdateDaemonTimeStamp_fromNow = -myTicketsUpdateDaemonTimeStamp.minutesDiff(now);
                }
        
      out.write("       \r\n");
      out.write("        <h2>");
      out.print(myGroupBy_Daemon.getDesc());
      out.write("</h2>        \r\n");
      out.write("        Last Data input @: ");
      out.print(lastDataTimeStamp.getNowFormated());
      out.write("\r\n");
      out.write("        Last Cycle  @: ");
      out.print(lastCycleTimeStamp.getNowFormated());
      out.write("\r\n");
      out.write("        <p>\r\n");
      out.write("        <table style=\"text-align:left; font-size:12px;\" border=\"1\"  cellpadding=\"1\"  id=\"table2\" >                 \r\n");
      out.write("            <tr><td>DSLFileParserDaemon</td><td>");
      out.print(myNumberFormat.format(myDSLFileParserDaemonTimeStamp_fromNow).replace(",", "."));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(status.get(myGroupBy_Daemon.getStatus()));
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr><td>HealthCheckerDaemon</td><td>");
      out.print(myNumberFormat.format(myHealthCheckerDaemonTimeStamp_fromNow).replace(",", "."));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(status.get(myHealthCheckerDaemon.getStatus()));
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr><td>TicketsUpdateDaemon</td><td>");
      out.print(myNumberFormat.format(myTicketsUpdateDaemonTimeStamp_fromNow).replace(",", "."));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(status.get(myTicketsUpdateDaemon.getStatus()));
      out.write("</td>\r\n");
      out.write("            </tr>    \r\n");
      out.write("            <tr><td>TicketsUpdateDaemon</td><td>");
      out.print(myNumberFormat.format(myTicketsUpdateDaemonTimeStamp_fromNow).replace(",", "."));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(status.get(myTicketsUpdateDaemon.getStatus()));
      out.write("</td>\r\n");
      out.write("            </tr>             \r\n");
      out.write("        </Table>            \r\n");
      out.write("        <p></p>    \r\n");
      out.write("        ");

                out.println("<p>TicketsList size =" + myContainer.getTicketsArrayList().size() + "    EventsLogArrayList size =" + myContainer.getEventsLogArrayList().size());
            }

            //-----------------------------------------------------------------------------
            //----------------- Connection to CCM ------------
            //-----------------------------------------------------------------------------
/*          out.println("<h1>Connections:</h1>");
            URLContextReader_object myCCMInfo_object = new URLContextReader_object();
            try
                {
                myCCMInfo_object.getUrlContext("http://" + System.getenv("ccm") + ":8080/CCM/howManyCallers.jsp?from=20170101T101010.000&to=20170101T101010.000&resource=6666");
                out.println("<p>Connection to CCM(howManyCallers.jsp): <font color='green'>ok!</font>");
                }
            catch (Exception e)
                {
                out.println("<p>Connection to CCM(howManyCallers.jsp): <font color='red'>failed!</font>");
                }*/

        
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
import SKOPIA.*;

public final class summary_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    try
        {
        if (!userTypes.contains(userType))
            {
            
      out.write("\r\n");
      out.write("            <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, you are not authorized to view this page!!!</font>\r\n");
      out.write("            ");
return;
            }
        }
    catch (Exception e)
        {
        }
//----------- sequrity end----------------

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Tickets summary</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">      \r\n");
      out.write("    </head>\r\n");

    ServletContext myContext = request.getServletContext();
    try
        {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        }
    catch (Exception e)
        {
        }
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    String str = "";
    try
        {
        TimeStamp1 fromT = new TimeStamp1();
        System.out.println("fromT1=" + fromT.getNowUnformated());
        fromT.addDays(-1);
        System.out.println("fromT2=" + fromT.getNowUnformated());
        String to = fromT.getNowUnformated().substring(0, 8) + "T235959.000";//20180402T133545.000
        String from = fromT.getNowUnformated().substring(0, 8) + "T000000.000";
        System.out.println("from=" + from + " to=" + to);
        List<nsofiasLib.ote.alarms.Ticket> ticketsList = new ArrayList();
        for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
            {
            ticketsList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsAsArrayList());
            }
        try
            {
            Collections.sort(ticketsList);
            }
        catch (Exception e)
            {
            }
        //----------------------------
        str += "<h1> DiligentMKT summary of " + fromT.getTodayFormated() + "<h1>";
        System.out.println(str);
        str += "<table width='100%'  border='1'>";
        str += "<tr><th>SR</th><th>Type</th><th>Synopsis</th><th>started</th><th>stopped</th><th>Reported</th><th>criticality</th><th>Disconnected customers</th><th>affected customers</th></tr>";

        for (Object myTicketObj : ticketsList)
            {
            Ticket_FYROM myTicket = (Ticket_FYROM) myTicketObj;
            if (myTicket.getState().equals(Ticket.STATE_PENDING_TO_OPEN) || myTicket.getState().equals(Ticket.STATE_CANCELED))
                {
                continue;
                }
            if (myTicket.getIncidentStartDate().compareTo(from) > 0 && myTicket.getIncidentStartDate().compareTo(to) < 0)
                {
                str += "<tr>";
                str += "<td nowrap>" + myTicket.getSR() + "</td>";
                str += "<td nowrap>" + myTicket.getType() + "</td>";
                str += "<td nowrap>" + myTicket.getSYNOPSIS() + "</td>";
                str += "<td nowrap>" + new TimeStamp1(myTicket.getIncidentStartDate()).getNowFormated() + "</td>";
                str += "<td nowrap>" + new TimeStamp1(myTicket.getIncidentStoppedDate()).getNowFormated() + "</td>";
                str += "<td nowrap>" + new TimeStamp1(myTicket.getIncidentReportedDate()).getNowFormated() + "</td>";
                str += "<td align='right'>" + myTicket.getCriticalityDesc(myTicket.getCriticality()) + "</td>";
                str += "<td align='right'>" + myTicket.findLinesDisconnected() + "</td>";
                str += "<td align='right'>" + myTicket.findLinesAffected() + "</td>";
                str += "</tr>";
                }
            }

        str += "</table>";
        }
    catch (Exception e)
        {
        e.printStackTrace(System.out);
        }
    out.println(str);


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

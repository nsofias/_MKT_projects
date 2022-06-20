package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.Ticket_FYROM;
import java.net.URLEncoder;
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

public final class correlation_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 String userTypes = "00,01,02,03,04";
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Correlation info</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Correlation Info GUI</h1>\r\n");
      out.write("        <form name=\"F1\" action=\"correlation_info.jsp\">\r\n");
      out.write("            <h2>Please insert ticket number or ticket id :<h2>\r\n");
      out.write("                    <input type=\"text\" name=\"sr\" value=\"\" size=\"40\" />\r\n");
      out.write("                    <input type=\"submit\" value=\"Submit\" name=\"Submit\" />\r\n");
      out.write("                    </form> <p> \r\n");
      out.write("                        ");
          
                            String sr = request.getParameter("sr");
                            if (sr != null)
                                {
                                ServletContext myContext = request.getServletContext();
                                ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
                                List<Ticket_FYROM> ticketsList = new ArrayList();
                                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
                                    {
                                    ticketsList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsAsArrayList());
                                    }
                                Ticket_FYROM tiketFound = null;
                                for (Ticket_FYROM myTiket : ticketsList)
                                    {
                                    if ((myTiket.getSR() != null && myTiket.getSR().equals(sr)) || myTiket.getTicketId().equals(sr))
                                        {
                                        tiketFound = myTiket;
                                        }
                                    }
                                if (tiketFound != null)
                                    {
                                    String correlationString = tiketFound.getCollerationString();
                                    List alarmList = tiketFound.getElementsList();
                                    if (alarmList.size() > 1)
                                        {
                                        out.println("<h3>Correlation type:" + tiketFound.getType() + "</h3>");
                                        out.println("<h3>Element type: Some (" + alarmList.size() + ") " + tiketFound.getSubType() + "s</h3>");
                                        out.println("<h3>Parent (common) element : " + correlationString.replace(";", " : ") + "</h3>");
                                        }
                                    else
                                        {
                                        out.println("<h3>Correlation type:" + tiketFound.getType() + "</h3>");
                                        out.println("<h3>Element type: One " + tiketFound.getSubType() + "s</h3>");
                                        out.println("<h3>Parent (common) element : " + correlationString.replace(";", " : ") + "</h3>");
                                        }
                                    //-------
                                    out.println("<p><table>");
                                    out.println("<tr>");
                                    if (tiketFound.getType().equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER))
                                        {
                                        out.println("<th>SERVING_AREA</th><th>ATC</th><th>DSLAM</th><th>slot</th>");
                                        out.println("</tr>");
                                        for (Object myAlarm : alarmList)
                                            {
                                            Alarm_FYROM myAlarm_FYROM = (Alarm_FYROM) myAlarm;
                                            String elementName = myAlarm_FYROM.getNetworkElementName();
                                            String[] elementName_ = elementName.split(";");
                                            out.println("<tr><td>");
                                            for (int i = 0; i < elementName_.length; i++)
                                                {
                                                out.println(elementName_[i]);
                                                if (i < elementName_.length - 1)
                                                    {
                                                    out.println("</td><td>");
                                                    }
                                                }
                                            out.println("</td></tr>");
                                            }

                                        }
                                    else if (tiketFound.getType().equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE))
                                        {
                                        out.println("<th>RSU</th><th>Cable</th><th>DP</th>");
                                        out.println("</tr>");
                                        for (Object myAlarm : alarmList)
                                            {
                                            Alarm_FYROM myAlarm_FYROM = (Alarm_FYROM) myAlarm;
                                            String elementName = myAlarm_FYROM.getNetworkElementName();
                                            String[] elementName_ = elementName.split(";");
                                            out.println("<tr><td>");
                                            for (int i = 0; i < elementName_.length; i++)
                                                {
                                                out.println(elementName_[i]);
                                                if (i < elementName_.length - 1)
                                                    {
                                                    out.println("</td><td>");
                                                    }
                                                }
                                            out.println("</td></tr>");
                                            }
                                        out.println("</td></tr>");
                                        }
                                    else if (tiketFound.getType().equals(diligent_MKT.Alarm_FYROM.TYPE_GPON))
                                        {
                                        out.println("<th>ATC</th><th>OLT</th><th>Shelf</th><th>Slot</th>");
                                        out.println("</tr>");
                                        for (Object myAlarm : alarmList)
                                            {
                                            Alarm_FYROM myAlarm_FYROM = (Alarm_FYROM) myAlarm;
                                            String elementName = myAlarm_FYROM.getNetworkElementName();
                                            String[] elementName_ = elementName.split(";");
                                            out.println("<tr><td>");
                                            for (int i = 0; i < elementName_.length; i++)
                                                {
                                                out.println(elementName_[i]);
                                                if (i < elementName_.length - 1)
                                                    {
                                                    out.println("</td><td>");
                                                    }
                                                }
                                            out.println("</td></tr>");
                                            }
                                        out.println("</td></tr>");
                                        }
                                    else if (tiketFound.getType().equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE))
                                        {
                                        out.println("<th>ATC</th><th>Cable</th><th>BOX</th>");
                                        out.println("</tr>");
                                        for (Object myAlarm : alarmList)
                                            {
                                            Alarm_FYROM myAlarm_FYROM = (Alarm_FYROM) myAlarm;
                                            String elementName = myAlarm_FYROM.getNetworkElementName();
                                            String[] elementName_ = elementName.split(";");
                                            out.println("<tr><td>");
                                            for (int i = 0; i < elementName_.length; i++)
                                                {
                                                out.println(elementName_[i]);
                                                if (i < elementName_.length - 1)
                                                    {
                                                    out.println("</td><td>");
                                                    }
                                                }
                                            out.println("</td></tr>");
                                            }
                                        out.println("</td></tr>");
                                        }
                                    out.println("</table>");
                                    out.println(tiketFound.toHTML("Diligent"));
                                    /*
                                    out.println("<p><table>");
                                    out.println("<tr>");
                                    out.println("<th>Customer LineIDs</th>");
                                    for (String myLineID : customerList)
                                        {
                                        out.println(myLineID);
                                        }
                                    out.println("</tr>");
                                    out.println("</table>");          */

                        
      out.write("\r\n");
      out.write("                    <p><a href=\"linesRegistered.jsp?type=");
      out.print(tiketFound.getType());
      out.write("&ticketId=");
      out.print(URLEncoder.encode(tiketFound.getTicketId(), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(tiketFound.getCurrentUsersRegistered());
      out.write(" Current Registered Users</a>\r\n");
      out.write("                        ");
     }
                                }
                        
      out.write("\r\n");
      out.write("                        </body>\r\n");
      out.write("                        </html>\r\n");
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

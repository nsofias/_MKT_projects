package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.PathRetrieverFactory;
import diligent_MKT.PathsRetriever;
import diligent_MKT.Alarm_FYROM;
import nsofiasLib.ote.alarms.*;
import java.util.Map;
import nsofiasLib.utils.URLContextReader_object;
import nsofiasLib.ote.DSLAMs.DslamDetailsFinder;
import nsofiasLib.ote.DSLAMs.DslamDetails;
import java.util.Collections;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class linesRegistered_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    ArrayList<String> paths = new ArrayList();
    ServletContext myContext = request.getServletContext();
    String type = request.getParameter("type");
    String myPath = request.getParameter("path");
    String ticketId = request.getParameter("ticketId");
    //
    if (myPath != null) {
        myPath = new String(myPath.getBytes("iso-8859-1"), "UTF-8");
        paths.add(myPath);
        out.println("alarms with Path" + myPath);
    } else if (ticketId != null) {
        ticketId = new String(request.getParameter("ticketId").getBytes("iso-8859-1"), "UTF-8");
        //out.println("alarms with ticketId:" + ticketId);
        Diligent_Daemon myGroupBy_Daemon = null;
        ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
        for (Diligent_Daemon myDaemon : myGroupBy_Daemons) {
            if (type != null && (type.equals(myDaemon.getDesc()))) {
                myGroupBy_Daemon = myDaemon;
            }
        }
        if (myGroupBy_Daemon != null) {
            for (Alarm_FYROM myAlarm : myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList().get(ticketId).getElementsList()) {
                paths.add(myAlarm.getNetworkElementName());
            }
        }
    }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Current status of affected customers</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
            for (String path : paths) {
      out.write("\r\n");
      out.write("        <h1>Current lines' status for ");
      out.print(path);
      out.write("</h1>\r\n");
      out.write("        <table  border='1' width='100%'>\r\n");
      out.write("            ");


                if (myPatrhsRetriever != null) {
                    ArrayList<String> myLines = myPatrhsRetriever.retrieveLines(path);
                    Collections.sort(myLines);
                    for (String line : myLines) {
                        out.println("<tr><td>" + line + "</td></tr>");
                    }
                } 
      out.write("       \r\n");
      out.write("        </table>\r\n");
      out.write("        ");
}
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

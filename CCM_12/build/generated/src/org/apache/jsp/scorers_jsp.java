package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.Collections;
import org.apache.catalina.ha.backend.CollectedInfo;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.ArrayList;
import java.util.List;
import ccm.*;

public final class scorers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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

    ServletContext myContext = request.getServletContext();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    //
    //---------------------- parameters ----------------
    String GROUP_ID = request.getParameter("GROUP_ID");
    if (GROUP_ID == null)
        {
        GROUP_ID = "INVITE";
        }
    Map<String, CallsLoaderDaemon> daemons = (Map<String, CallsLoaderDaemon>)myContext.getAttribute("daemons");
    CallsLoaderDaemon myCallsLoaderDaemon = (CallsLoaderDaemon)daemons.get(GROUP_ID);
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = myCallsLoaderDaemon.getMyStatsObjContainer();
    //
    String from = request.getParameter("from");
    String to = request.getParameter("to");

    String from_ = "";
    String to_ = "";
    if (from == null)
        {
        from = myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated();
        from_ = myCCMonitorStatsObjsContainer.getMyClock().getNowFormated();
        TimeStamp1 toTimeStamp = new TimeStamp1(from);
        toTimeStamp.addHours(-3);
        to = toTimeStamp.getNowUnformated();
        to_ = toTimeStamp.getNowFormated();
        }
    Counters myAnumbers = myCCMonitorStatsObjsContainer.getLinesForPeriod(from, to);
    List<String> labels = myAnumbers.getLabelsSortedBy(Counters.sortByCount); 

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Top scorers from ");
      out.print(to_);
      out.write(" to:");
      out.print(from_);
      out.write("</h1>\r\n");
      out.write("        <table border=\"1\" cellpadding=\"5\" cellspacing=\"5\">\r\n");
      out.write("            <tr><td><b>Caller</b></td><td><b>Calls</b></td><td><b>Δικτυακοι Ποροι</b></td><td><b>Ιστορικο κλησεων</b></td></tr>\r\n");
      out.write("            ");
 for (String Anum : labels)
                    {
                    try
                        {
                        long count = myAnumbers.getCount(Anum);

                        String Anum1 = Anum.substring(0, 8) + "XX";
            
      out.write("\r\n");
      out.write("            <tr><td>");
      out.print(Anum1);
      out.write("</td><td align = 'right'>");
      out.print(count);
      out.write("</td><td><a href=\"resources.jsp?DN=");
      out.print(Anum);
      out.write("\" target=\"_blank\">Δικτυακοι Ποροι</a></td><td><a href=\"AnumberCallHistory.jsp?ANumber=");
      out.print(Anum);
      out.write("&from=");
      out.print(from);
      out.write("&to=");
      out.print(to);
      out.write("\" target=\"_blank\">Ιστορικο κλησεων</a></td></tr>\r\n");
      out.write("                    ");
}
                            catch (Exception e)
                                {
                                }
                            }
      out.write("\r\n");
      out.write("        </table>\r\n");
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

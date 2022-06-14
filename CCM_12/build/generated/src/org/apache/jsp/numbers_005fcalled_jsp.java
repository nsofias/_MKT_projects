package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Set;
import nsofiasLib.utils.Counters1;
import ccm.CallInfo;
import java.util.Collections;
import org.apache.catalina.ha.backend.CollectedInfo;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.ArrayList;
import java.util.List;
import ccm.CCMonitorStatsObjsContainer;
import ccm.CCMAlarm;

public final class numbers_005fcalled_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Alarm calls</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">        \n");
      out.write("    </head>\n");
      out.write("\n");

    ServletContext myContext = request.getServletContext();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    //

    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    String from = request.getParameter("from");
    String to = request.getParameter("to");
    String resourceType = request.getParameter("resourceType");
    String resource = request.getParameter("resource");
    out.println("<h1>resourceType = " + resourceType+"</h1>");
    out.println("<h1>resource = " + resource+"</h1>");
    if (from == null) {
        from = myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated();
        TimeStamp1 toTimeStamp = new TimeStamp1(from);
        toTimeStamp.addDays(-1);
        to = toTimeStamp.getNowUnformated();
    }
    Set<String> calls = myCCMonitorStatsObjsContainer.getCallsForResource(resourceType, resource, from, to);
    ArrayList<String> myCallsArray = new ArrayList(calls);
    Collections.sort(myCallsArray);
    String lineID = "";
    out.println("<table width='60%'>");
    for (String call : myCallsArray) {
        if (!lineID.equals(call.split("@")[0])) {
            out.println("<tr><td></td></tr>");
            lineID = call.split("@")[0];
        }
        out.println("<tr><td>" + call+"</td><td><a href='MKT/askSVT.jsp?lineID="+lineID+"' target='_EMPTY'> Ask SVT</a></td></tr>");
    }
    out.println("</table>");
   

      out.write("\n");
      out.write("\n");
      out.write("\n");
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

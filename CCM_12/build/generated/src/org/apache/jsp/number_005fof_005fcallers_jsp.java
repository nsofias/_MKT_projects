package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.utils.Counters1;
import java.util.Collections;
import org.apache.catalina.ha.backend.CollectedInfo;
import nsofiasLib.utils.Counters;
import java.util.ArrayList;
import java.util.List;
import ccm.CCMonitorStatsObjsContainer;
import ccm.*;

public final class number_005fof_005fcallers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    ServletContext myContext = request.getServletContext();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    //
    String origin = request.getParameter("origin");
    String from = request.getParameter("from");
    String to = request.getParameter("to");
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    String alertType = "";
    CCMAlarm myAlarm = new CCMAlarm(origin, to, alertType);
    myAlarm.setAlarmObject(origin);
    myAlarm.setAlertStart(to);
    myAlarm.setAlarmStop(from);
    Counters1 myAnumbers = myCCMonitorStatsObjsContainer.getCallersCounters(myAlarm);
    out.println(myAnumbers.size());

      out.write(" \r\n");
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

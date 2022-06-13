package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

public final class AnumberCallHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    ServletContext myContext = request.getServletContext();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    //

    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("statsObjContainer");
    String from = request.getParameter("from");
    String to = request.getParameter("to");
    String lineID = request.getParameter("lineID");
    if (from == null) {
        from = myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated();
        TimeStamp1 toTimeStamp = new TimeStamp1(from);
        toTimeStamp.addDays(-30);
        to = toTimeStamp.getNowUnformated();
    }

//    Counters myhistory = getAnumberHistory(lineID, from, to, myCCMonitorStatsObjsContainer);
//    myAnumbers.sort(Counters.sortByCount);


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2>Calls from ");
      out.print(lineID);
      out.write(" Period from  ");
      out.print(new TimeStamp1(to).getNowFormated());
      out.write(" to ");
      out.print(new TimeStamp1(from).getNowFormated());
      out.write("</h2>        \r\n");
      out.write("        <table border=\"1\" cellpadding=\"5\" cellspacing=\"5\">\r\n");
      out.write("            <tr><th><b>Ημερομηνια</b></th><th>Πληθος κλησεων</th></tr>\r\n");
      out.write("                    ");

                        Counters1 statObjs = myCCMonitorStatsObjsContainer.getLineIDCalls(lineID, from, to);
                        List<String> labels = statObjs.getLabelsAsSortedlist();
                        Collections.sort(labels);
                        for (String label : labels) {
                            double count = statObjs.getTotalValueOfLabel(label);
                            String date = new TimeStamp1(label + "00.000").getNowFormated();
                    
      out.write("\r\n");
      out.write("            <tr><td>");
      out.print(date);
      out.write("</td></td><td>");
      out.print(count);
      out.write("</td></tr>                            \r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
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

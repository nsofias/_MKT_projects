package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.PathRetrieverFactory;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.PathsRetriever;
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

public final class linesStopped_005fNOT_005fMASSIVE_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write('\n');
      out.write('\n');

    ServletContext myContext = request.getServletContext();
    String type = request.getParameter("type");

    //
    //out.println("alarms with ticketId:" + ticketId);
    Diligent_Daemon myGroupBy_Daemon = null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myDaemon : myGroupBy_Daemons) {
        if (type != null && (type.equals(myDaemon.getDesc()))) {
            myGroupBy_Daemon = myDaemon;
        }
    }
    PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
    ArrayList<String> allLinesStopped = new ArrayList();
    if (myGroupBy_Daemon != null) {
        ArrayList<String> linesStoppedMasive = new ArrayList();
        allLinesStopped.addAll(myPatrhsRetriever.retrieveStoppedLines());
        for (String ticketId : myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList().keySet()) {
            for (Alarm_FYROM myAlarm : myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList().get(ticketId).getElementsList()) {
                if (myPatrhsRetriever != null) {
                    linesStoppedMasive.addAll(myPatrhsRetriever.retrieveLines(myAlarm.getNetworkElementName()));
                }
            }
        }
        //----------------
        for (String stoppedMasiveline : linesStoppedMasive) {
            allLinesStopped.remove(stoppedMasiveline);
        }
    }


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Current status of affected customers</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Current lines' status for </h1>\n");
      out.write("        <table  border='1' width='100%'>\n");
      out.write("            ");
  if (myPatrhsRetriever != null) {
                    Collections.sort(allLinesStopped);
                    for (String line : allLinesStopped) {
                        out.println("<tr><td>" + line + "</td></tr>");
                    }
                }
      out.write("       \n");
      out.write("        </table>\n");
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

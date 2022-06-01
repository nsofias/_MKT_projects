package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.fileIO.FileParser2Daemon;
import radius.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import nsofiasLib.time.TimeStamp1;

public final class lines_005fservlet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
  response.setCharacterEncoding("utf-8");
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");;
    response.setCharacterEncoding("utf-8");
    String search = request.getParameter("search");
    String state = request.getParameter("state");
    try
        {
        List<RadiusSessionRecord> myRadiusLogRecords;
        if (state == null)
            {
            myRadiusLogRecords = myContainer.getSessionsAsList();
            }
        else if (state.equals("live"))
            {
            myRadiusLogRecords = myContainer.getLiveSessionsAsList();
            }
        else if (state.equals("closed"))
            {
            myRadiusLogRecords = myContainer.getClosedSessionsAsList();
            }
        else
            {
            return;
            }
        for (RadiusSessionRecord myRadiusLogRecord : myRadiusLogRecords)
            {
            String line = "";
            for (String rec : myRadiusLogRecord.getMyValues())
                {
                line += rec + "\t";
                }
            if (search == null || line.contains(search))
                {
                out.println(line + "\n");
                }
            }
        }
    catch (Exception e)
        {
        out.println("connector_exception :" + e.toString());
        }

      out.write('\n');
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.utils.Counters;
import java.util.ArrayList;
import nsofiasLib.time.TimeStamp1;
import ccm.CCMonitorStatsObjsContainer;

public final class shareInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

ServletContext myContext=request.getServletContext();
Counters myCounters = (Counters)myContext.getAttribute("browseCounters");
myCounters.updateCounters(request.getRequestURI());   
request.setCharacterEncoding("UTF-8");
String comment = request.getParameter("comment");
if (comment!=null && !comment.isEmpty())
    {
    TimeStamp1 now  = new TimeStamp1();
    String myTimeStamp = now.getNowFormated();
    comment = myTimeStamp +":"+comment; 
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer  = (CCMonitorStatsObjsContainer)myContext.getAttribute("statsObjContainer"); 
    ArrayList myComments = myCCMonitorStatsObjsContainer.getCommentsLogArrayList();
    myComments.add(0, comment);
    if (myComments.size()>3){myComments.remove(3);myComments.trimToSize();}

      out.write("\r\n");
      out.write("<b><h1>Please close this window!!!</h1></b>\r\n");
      out.write("    ");

    return;
    }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Share information with other users. Your text (latin characters) will be visible on the top of the screen for about half an hour</h1>\r\n");
      out.write("        <form action=\"shareInfo.jsp\" method=\"POST\">\r\n");
      out.write("            <input type=\"text\" name=\"comment\" value=\"\" size=\"100\" />\r\n");
      out.write("            <input type=\"submit\" value=\"ok\" />\r\n");
      out.write("        </form>\r\n");
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

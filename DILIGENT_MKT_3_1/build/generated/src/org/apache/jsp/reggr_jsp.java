package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import SKOPIA.Config;
import java.util.Collections;
import java.util.Iterator;
import org.apache.catalina.ha.backend.CollectedInfo;
import nsofiasLib.utils.mapper.Counters_1D;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.ArrayList;
import java.util.List;
import SKOPIA.*;

public final class reggr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");

    String type = request.getParameter("type");
    String order_Desc = request.getParameter("order_Desc");
    String net_type_fix = request.getParameter("net_type_fix");
    String net_type_mobile = request.getParameter("net_type_mobile");
    String quiryStr = "type=" + type;
    if (net_type_fix != null)
        {
        quiryStr += "&net_type_fix=" + net_type_fix;
        }
    if (net_type_mobile != null)
        {
        quiryStr += "&net_type_mobile=" + net_type_mobile;
        }    
    if (order_Desc!=null)
        {
        quiryStr += "&order_Desc=y";
        }    
    /*
            "dslmon_skopia.ktirio";
            "dslmon_skopia.ua";
            "dslmon_skopia.dslam";    
     */
    ServletContext myContext = request.getServletContext();
    try
        {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        }
    catch (Exception e)
        {
        }
    String volumeMin = request.getParameter("volumeMin");
    if (volumeMin == null)
        {
        volumeMin = "-1";
        }
    int maxDataToDisplay = 300;
    String maxDataToDisplay_ = request.getParameter("maxDataToDisplay");
    if (maxDataToDisplay_ != null)
        {
        maxDataToDisplay = Integer.valueOf(maxDataToDisplay_);
        }


      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>CCMonitor</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <!--    <body onload=\"JavaScript:timedRefresh(120000);\"> -->\n");
      out.write("    <body>   \n");
      out.write("        <table  border=\"0\" width=\"100%\"   id=\"table2\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <IMG width=\"100%\" src=\"BRAS_servlet?");
      out.print(quiryStr);
      out.write("&maxDataToDisplay=");
      out.print(maxDataToDisplay);
      out.write("\">                 \n");
      out.write("                </td>\n");
      out.write("            </tr>                     \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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

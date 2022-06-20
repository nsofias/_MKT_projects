package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.PathRetrieverFactory;
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

public final class userResourcesfinder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 String type = request.getParameter("type");
    String lineID = request.getParameter("lineID");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Current status of affected customers</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Current resources of customers with lineID: ");
      out.print(lineID);
      out.write(" of type ");
      out.print(type);
      out.write("</h1>\r\n");
      out.write("        <table>\r\n");
      out.write("            ");

                PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
                if (myPatrhsRetriever != null) {
                    String path = myPatrhsRetriever.retrievePath(lineID);
                    String elType = "";
                    if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER)) {
                        elType = "<tr><th>SERVING_AREA</th><th>ATC</th><th>DSLAM</th><th>slot</th></tr>";
                    } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE)) {
                        elType = "<th>RSU</th><th>Cable</th><th>DP</th>";
                    } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON)) {
                        elType = "<th>ATC</th><th>OLT</th><th>Shelf</th><th>Slot</th>";
                    } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE)) {
                        elType = "<th>ATC</th><th>Cable</th><th>BOX</th>";
                    }
                    String str = "<tr>";
                    for (String elementName_1 : path.split(";")) {
                        str = str + "<td>" + elementName_1 + "</td>";
                    }
                    str = str + "</tr>";
                    out.println(elType);
                    out.println(str);
                }
            
      out.write("       \r\n");
      out.write("        </table>\r\n");
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

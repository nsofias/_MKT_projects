package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.Ticket_FYROM;
import ccm.MKT.Ticket_MKT;
import ccm.CCMTicket;
import ccm.AlarmsDetectionListener;
import siebel.TicketSiebel;
import nsofiasLib.utils.JsonToHtmlConverter;
import java.net.URLEncoder;
import java.text.NumberFormat;
import com.google.gson.Gson;
import java.net.URLDecoder;
import nsofiasLib.utils.URLContextReader_object;
import java.util.ArrayList;
import nsofiasLib.others.Parameters;
import nsofiasLib.utils.Counters1;
import java.util.List;
import java.util.Map;
import nsofiasLib.others.SimpleDaemon;

public final class CCMTicketInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ServletContext myContext = session.getServletContext();
    AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
    //Ticket_MKT myTicket_MKT = null;
    //
    String myTicketId = request.getParameter("myTicketId");
    out.println("myTicketId=" + myTicketId);
    String myOutput = "";
    if (myTicketId != null) {
        CCMTicket myCCMTicket = myAlarmsDetectionListener.getTicketsMap().get(myTicketId);
        //out.println(new Gson().toJson(myCCMTicket));out.flush();
        myOutput = new JsonToHtmlConverter().getHtmlData(new Gson().toJson(myCCMTicket));
    } else {
        return;
    }


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ticket_MKT</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .json_object { \n");
      out.write("                margin:10px; \n");
      out.write("                padding-left:10px; \n");
      out.write("                border-left:1px solid #ccc\n");
      out.write("            }\n");
      out.write("            .json_key { \n");
      out.write("                font-weight: bold; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <h1>ticket details</h1>\n");
      out.write("        ");
out.println(myOutput);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

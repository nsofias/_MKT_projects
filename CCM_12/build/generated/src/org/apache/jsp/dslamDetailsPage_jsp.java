package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import nsofiasLib.ote.DSLAMs.NetworkEvent;
import nsofiasLib.ote.DSLAMs.DslamDetails;

public final class dslamDetailsPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Resources</h1>\r\n");
      out.write("\r\n");
      out.write("        ");

            String dslam = request.getParameter("dslam");
            if (dslam != null)
                {
                dslam = dslam.trim();
                }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <p><h1>Dslam details for ");
      out.print(dslam);
      out.write("</h1>\r\n");
      out.write("        ");

            try
                {
                nsofiasLib.ote.DSLAMs.DslamDetailsFinder myDslamDetailsFinder = new nsofiasLib.ote.DSLAMs.DslamDetailsFinder();
                DslamDetails myDslamDetails = myDslamDetailsFinder.getDslamDetails(dslam);
                if (myDslamDetails != null)
                    {
                    out.println("<p>EETT = " + myDslamDetails.getMyEETT());
                    out.println("<p>getMyHostName = " + myDslamDetails.getMyHostName());
                    out.println("<p>Area = " + myDslamDetails.getMyArea());
                    out.println("<p>PotsPorts = " + myDslamDetails.getPotsPorts());
                    out.println("<p>MyDslPorts = " + myDslamDetails.getMyDslPorts());
                    out.println("<p>MyDslCoords = " + myDslamDetails.getCoords());
                    out.println("<p>NextHop = " + myDslamDetails.getNextHop());
                    out.println("<p>isMSAN = ");
                    out.println(myDslamDetails.getPotsPorts() > 0 && myDslamDetails.getMyDslPorts() == 0);
                    out.println("<p>isWithoutCust = ");
                    out.println("<p>isWithoutCust = " + myDslamDetails != null && myDslamDetails.getPotsPorts() == 0 && myDslamDetails.getMyDslPorts() == 0);
                    out.println("<p> ");
                    out.println("<h2>NetworkEvents</h2>");
                    //
                    ArrayList<NetworkEvent> myNetworkEvents = myDslamDetails.getNetworkEvents();
                    for (NetworkEvent myNetworkEvent : myNetworkEvents)
                        {
                        out.println("<p>" + myNetworkEvent.getType() + " " + myNetworkEvent.getStartTime() + " " + myNetworkEvent.getEndTime() + " " + myNetworkEvent.getArea());
                        }
                    }
                }
            catch (Exception e)
                {
                e.printStackTrace();
                }
      out.write("                 \r\n");
      out.write("    </body>\r\n");
      out.write("</html>     \r\n");
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

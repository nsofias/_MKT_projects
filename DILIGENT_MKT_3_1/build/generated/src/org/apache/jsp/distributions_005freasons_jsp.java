package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class distributions_005freasons_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    String ticketReason = request.getParameter("ticketReason");
    String H24 = request.getParameter("H24");
    if (ticketReason == null || ticketReason.isEmpty())
        {
        ticketReason = "ANY";
        }   
/*
    public static String reason_DEH_MW = "reason_DEH_MW";
    public static String reason_DEH_AUMS = "reason_DEH_AUMS";
    public static String reason_POWER_SUPPLY = "reason_POWER_SUPPLY";
    public static String reason_TRANPORT = "reason_TRANPORT";
    public static String reason_NNM = "reason_NNM";    
    */

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Reported Incidents Stats</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Reported Incidents Stats</h1>\r\n");
      out.write("        <p><form name=\"myform\" action=\"distributions_reasons.jsp\">                               \r\n");
      out.write("            <b>Reason:</b>\r\n");
      out.write(" \r\n");
      out.write("            <select  onchange=\"this.form.submit()\" name=\"ticketReason\"> \r\n");
      out.write("                <option value=\"");
      out.print(ticketReason);
      out.write('"');
      out.write('>');
      out.print(ticketReason.replace("reason_",""));
      out.write("</option>\r\n");
      out.write("                <option value=\"reason_DEH_MW\">DEH_MW</option>\r\n");
      out.write("                <option value=\"reason_DEH_AUMS\">DEH_AUMS</option>\r\n");
      out.write("                <option value=\"reason_POWER_SUPPLY\">POWER_SUPPLY</option>\r\n");
      out.write("                <option value=\"reason_TRANPORT\">TRANPORT</option>\r\n");
      out.write("                <option value=\"reason_NNM\">NNM</option>\r\n");
      out.write("                <option value=\"ANY\">Any reason</option>                        \r\n");
      out.write("            </select>                \r\n");
      out.write("            ");
if (H24 != null)
            {
      out.write("\r\n");
      out.write("                <input type=\"hidden\" name=\"H24\" value=\"0\" />\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </form>         \r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        ");
if (H24 == null)
            {
      out.write("\r\n");
      out.write("            <table width=\"100%\"  border='1'>            \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?ticketReason=");
      out.print(ticketReason);
      out.write("'></td>\r\n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?accorTo=duration&ticketReason=");
      out.print(ticketReason);
      out.write("'></td>  \r\n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?accorTo=affected&ticketReason=");
      out.print(ticketReason);
      out.write("'></td>                    \r\n");
      out.write("                </tr> \r\n");
      out.write("                <tr><td><IMG height=\"300\"  src='reason_servlet.jsp?accorTo=timestamp&ticketReason=");
      out.print(ticketReason);
      out.write("'></td></tr>\r\n");
      out.write("                <tr><td><IMG height=\"300\"  src='reason_servlet.jsp?accorTo=place&ticketReason=");
      out.print(ticketReason);
      out.write("'></td></tr>                \r\n");
      out.write("            </table>\r\n");
      out.write("            ");
}
        else
            {
      out.write("  \r\n");
      out.write("            <table width=\"100%\"  border='1'>            \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?H24=1&ticketReason=");
      out.print(ticketReason);
      out.write("'></td> \r\n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?H24=1&accorTo=duration&ticketReason=");
      out.print(ticketReason);
      out.write("'></td>  \r\n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?H24=1&accorTo=affected&ticketReason=");
      out.print(ticketReason);
      out.write("'></td>\r\n");
      out.write("                </tr> \r\n");
      out.write("                <tr><td><IMG height=\"300\"  src='reason_servlet.jsp?H24=1&accorTo=timestamp&ticketReason=");
      out.print(ticketReason);
      out.write("'></td></tr>\r\n");
      out.write("                <tr><td><IMG height=\"300\"  src='reason_servlet.jsp?H24=1&accorTo=place&ticketReason=");
      out.print(ticketReason);
      out.write("'></td></tr>                \r\n");
      out.write("            </table>                \r\n");
      out.write("        ");
  }
      out.write("               \r\n");
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

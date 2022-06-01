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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Reported Incidents Stats</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Reported Incidents Stats</h1>\n");
      out.write("        <p><form name=\"myform\" action=\"distributions_reasons.jsp\">                               \n");
      out.write("            <b>Reason:</b>\n");
      out.write(" \n");
      out.write("            <select  onchange=\"this.form.submit()\" name=\"ticketReason\"> \n");
      out.write("                <option value=\"");
      out.print(ticketReason);
      out.write('"');
      out.write('>');
      out.print(ticketReason.replace("reason_",""));
      out.write("</option>\n");
      out.write("                <option value=\"reason_DEH_MW\">DEH_MW</option>\n");
      out.write("                <option value=\"reason_DEH_AUMS\">DEH_AUMS</option>\n");
      out.write("                <option value=\"reason_POWER_SUPPLY\">POWER_SUPPLY</option>\n");
      out.write("                <option value=\"reason_TRANPORT\">TRANPORT</option>\n");
      out.write("                <option value=\"reason_NNM\">NNM</option>\n");
      out.write("                <option value=\"ANY\">Any reason</option>                        \n");
      out.write("            </select>                \n");
      out.write("            ");
if (H24 != null)
            {
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"H24\" value=\"0\" />\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </form>         \n");
      out.write("        <p>&nbsp;</p>\n");
      out.write("        ");
if (H24 == null)
            {
      out.write("\n");
      out.write("            <table width=\"100%\"  border='1'>            \n");
      out.write("                <tr>\n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?ticketReason=");
      out.print(ticketReason);
      out.write("'></td>\n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?accorTo=duration&ticketReason=");
      out.print(ticketReason);
      out.write("'></td>  \n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?accorTo=affected&ticketReason=");
      out.print(ticketReason);
      out.write("'></td>                    \n");
      out.write("                </tr> \n");
      out.write("                <tr><td><IMG height=\"300\"  src='reason_servlet.jsp?accorTo=timestamp&ticketReason=");
      out.print(ticketReason);
      out.write("'></td></tr>\n");
      out.write("                <tr><td><IMG height=\"300\"  src='reason_servlet.jsp?accorTo=place&ticketReason=");
      out.print(ticketReason);
      out.write("'></td></tr>                \n");
      out.write("            </table>\n");
      out.write("            ");
}
        else
            {
      out.write("  \n");
      out.write("            <table width=\"100%\"  border='1'>            \n");
      out.write("                <tr>\n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?H24=1&ticketReason=");
      out.print(ticketReason);
      out.write("'></td> \n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?H24=1&accorTo=duration&ticketReason=");
      out.print(ticketReason);
      out.write("'></td>  \n");
      out.write("                    <td><IMG height=\"350\" src='reason_servlet.jsp?H24=1&accorTo=affected&ticketReason=");
      out.print(ticketReason);
      out.write("'></td>\n");
      out.write("                </tr> \n");
      out.write("                <tr><td><IMG height=\"300\"  src='reason_servlet.jsp?H24=1&accorTo=timestamp&ticketReason=");
      out.print(ticketReason);
      out.write("'></td></tr>\n");
      out.write("                <tr><td><IMG height=\"300\"  src='reason_servlet.jsp?H24=1&accorTo=place&ticketReason=");
      out.print(ticketReason);
      out.write("'></td></tr>                \n");
      out.write("            </table>                \n");
      out.write("        ");
  }
      out.write("               \n");
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

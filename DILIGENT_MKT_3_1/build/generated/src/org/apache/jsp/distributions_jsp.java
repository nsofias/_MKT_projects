package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class distributions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sequrityPart.jsp");
  }

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
 String userTypes = "00,01,02";
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    //String userTypes = "00,01,02";
    //  ----------- SEQURITY CHECK ---------------
    String request_URI = request.getRequestURI();
    request_URI = request_URI.substring(request_URI.lastIndexOf("/") + 1);
    String url = "login.jsp?request_URI=" + request_URI;
    String userType = (String) session.getAttribute("role");
    String username = (String) session.getAttribute("username");
    if (userType == null)
        {
      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward(url);
        return;
      }
      out.write('\r');
      out.write('\n');
  return;
    }
else if (userType.endsWith("-expired"))// password expired
        {
        
      out.write("\r\n");
      out.write("        <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password is expired!!!</font>\r\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("change_password.jsp");
        return;
      }
      out.write("\r\n");
      out.write("        ");
return;
        }

      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

//----------- sequrity----------------
    try
        {
        if (!userTypes.contains(userType))
            {
            
      out.write("\r\n");
      out.write("            <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, you are not authorized to view this page!!!</font>\r\n");
      out.write("            ");
return;
            }
        }
    catch (Exception e)
        {
        }
//----------- sequrity end----------------

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    String type = request.getParameter("type");
    String ticketStatus = request.getParameter("ticketStatus");
    String H24 = request.getParameter("H24");
    if (type == null || type.isEmpty())
        {
        type = "ALL";
        }
    if (ticketStatus == null || ticketStatus.isEmpty())
        {
        ticketStatus = "ALL";
        }    

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Reported Incidents Stats</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Reported Incidents Stats</h1>\r\n");
      out.write("        <p><form name=\"myform\" action=\"distributions.jsp\">                               \r\n");
      out.write("            <b>Resource type</b>\r\n");
      out.write("            <select  onchange=\"this.form.submit()\" name=\"type\"> \r\n");
      out.write("                <option value=\"");
      out.print(type);
      out.write('"');
      out.write('>');
      out.print(type);
      out.write("</option>\r\n");
      out.write("                <option value=\"BRAS\">BRAS</option>\r\n");
      out.write("                <option value=\"DSLAM\">DSLAM</option>\r\n");
      out.write("                <option value=\"CARD\">CARD</option>\r\n");
      out.write("                <option value=\"ALL\">ALL</option>                        \r\n");
      out.write("            </select>  \r\n");
      out.write("            <select  onchange=\"this.form.submit()\" name=\"ticketStatus\"> \r\n");
      out.write("                <option value=\"");
      out.print(ticketStatus);
      out.write('"');
      out.write('>');
      out.print(ticketStatus);
      out.write("</option>\r\n");
      out.write("                <option value=\"OPEN\">OPENED (in Siebel)</option>\r\n");
      out.write("                <option value=\"MANAGED\">OPENED (in Siebel) as Managed</option>\r\n");
      out.write("                <option value=\"UNMANAGED\">OPENED (in Siebel) as NOT Managed </option>\r\n");
      out.write("                <option value=\"ALL\">ALL Tickets (opened, not opened or failed to open)</option>                        \r\n");
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
      out.write("                    <td><IMG height=\"350\" src='StatsTickets_Servlet?accorTo=duration&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></td>  \r\n");
      out.write("                    <td><IMG height=\"350\" src='StatsTickets_Servlet?accorTo=affected&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></td>\r\n");
      out.write("                    <td><IMG height=\"350\" src='StatsTickets_Servlet?accorTo=type&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></td>\r\n");
      out.write("                </tr> \r\n");
      out.write("                <tr><IMG height=\"300\"  src='StatsTickets_Servlet?accorTo=timestamp&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></tr>\r\n");
      out.write("                <tr><IMG height=\"300\"  src='StatsTickets_Servlet?accorTo=place&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></tr>                \r\n");
      out.write("            </table>\r\n");
      out.write("            ");
}
        else
            {
      out.write("  \r\n");
      out.write("            <table width=\"100%\"  border='1'>            \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><IMG height=\"350\" src='StatsTickets_Servlet?H24=1&accorTo=duration&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></td>  \r\n");
      out.write("                    <td><IMG height=\"350\" src='StatsTickets_Servlet?H24=1&accorTo=affected&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></td>\r\n");
      out.write("                    <td><IMG height=\"350\" src='StatsTickets_Servlet?H24=1&accorTo=type&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></td>\r\n");
      out.write("                </tr> \r\n");
      out.write("                <tr><IMG height=\"300\"  src='StatsTickets_Servlet?H24=1&accorTo=timestamp&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></tr>\r\n");
      out.write("                <tr><IMG height=\"300\"  src='StatsTickets_Servlet?H24=1&accorTo=place&resourceType=");
      out.print(type);
      out.write("&ticketStatus=");
      out.print(ticketStatus);
      out.write("'></tr>                \r\n");
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

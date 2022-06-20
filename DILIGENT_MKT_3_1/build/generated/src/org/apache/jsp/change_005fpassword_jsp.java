package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class change_005fpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

    //  ----------- SEQURITY CHECK ---------------
    String request_URI = request.getRequestURI();
    request_URI=request_URI.substring(request_URI.lastIndexOf("/")+1);
    String url="login.jsp?request_URI="+request_URI;
    String userType=(String)session.getAttribute("role");
    if (userType==null)
        {
      out.write("\r\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward(url);
        return;
      }
      out.write("\r\n");
      out.write("    ");
  return;
        }

    //  ----------- END OF SEQURITY CHECK ---------------  

      out.write("\r\n");
      out.write("        <h1>Please enter your new Password</h1>\r\n");
      out.write("        <table width=\"800\" border=\"14\" cellspacing=\"15\" cellpadding=\"15\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p></th>\r\n");
      out.write("                </tr>              \r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("\r\n");
      out.write("                        <form method=\"POST\" action=\"security_policy_check.jsp\">\r\n");
      out.write("                            <p>&nbsp;</p>\r\n");
      out.write("                            <p>&nbsp;</p>\r\n");
      out.write("                            <p>&nbsp;</p>\r\n");
      out.write("                            <h2>Please enter your OLD Password:&nbsp;&nbsp;</h2>\r\n");
      out.write("                            <input type=\"password\" name=\"j_password_old\"><p>&nbsp;</p>\r\n");
      out.write("                            <h2>Please enter your New Password:&nbsp;&nbsp;</h2>\r\n");
      out.write("                            <input type=\"password\" name=\"j_password_1\"><p>&nbsp;</p>\r\n");
      out.write("                            <h2>Retype your new Password:&nbsp;&nbsp;</h2>\r\n");
      out.write("                            <input type=\"password\" name=\"j_password_2\"><p>&nbsp;</p>\r\n");
      out.write("                            <input type=\"submit\" value=\"Submit\" />\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
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

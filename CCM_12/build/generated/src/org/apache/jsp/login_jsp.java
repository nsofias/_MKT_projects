package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <p>&nbsp;</p>\n");
      out.write("        <p>&nbsp;</p>\n");
      out.write("        <p>&nbsp;</p>\n");
      out.write("    ");

    //----------- addCookie --------------------
     if (request.getParameter("JSESSIONID") != null)
         {
         Cookie userCookie = new Cookie("JSESSIONID", request.getParameter("JSESSIONID"));
         response.addCookie(userCookie);
         }
     else
         {
         String sessionId = session.getId();
         Cookie userCookie = new Cookie("JSESSIONID", sessionId);
         response.addCookie(userCookie);
         }   
     //-------------------------------------------        
    if (request.getParameter("logout")!=null)
        session.setAttribute("role", null);
    String request_URI = request.getParameter("request_URI");
//    out.print(request_URI);
    String userType=(String)session.getAttribute("role");
    if (userType!=null && request_URI==null )   
        {
      out.write("\n");
      out.write("        <h1>I know who you are. You have authenticated already!</h1>         \n");
      out.write("                \n");
       return;         }
    else if (userType!=null && request_URI.equals("login.jsp") )   
        {
      out.write("\n");
      out.write("        <h1>You have successfully authenticated!</h1> \n");
      out.write("        <p>Enjoy!       \n");
      out.write("                \n");
       return;         }
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <p>&nbsp;</p>\n");
      out.write("        <table width=\"50%\" border=\"14\" cellspacing=\"25\" cellpadding=\"25\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th><p><h1>Please enter your  Username and Password</h1></p></th>\n");
      out.write("                </tr>             \n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        ");

                            
                            if (request_URI == null)
                                {
                                request_URI = "login.jsp";
                                }
                        
      out.write("\n");
      out.write("                        <form method=\"GET\" action=\"security_check.jsp\">\n");
      out.write("                            <p>&nbsp;</p><p>&nbsp;</p>\n");
      out.write("                            <h2>User Name:&nbsp;&nbsp;</h2>\n");
      out.write("                            <input type=\"text\" name=\"j_username\"><p>&nbsp;</p>\n");
      out.write("                            <h2>Password:&nbsp;&nbsp;</h2>\n");
      out.write("                            <input type=\"password\" name=\"j_password\"><p>&nbsp;</p>\n");
      out.write("                            <input value=\"");
      out.print(request_URI);
      out.write("\" type=\"hidden\" name=\"request_URI\"><p>&nbsp;</p>\n");
      out.write("                            <input type=\"submit\" value=\"Submit\" />\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
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

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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title></title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("    ");

    session = request.getSession();
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
    String userName = (String) session.getAttribute("username");
    if (userType!=null && request_URI==null )   
        {
      out.write("\r\n");
      out.write("        <h1>");
      out.print(userName);
      out.write(",you have authenticated already!</h1>         \r\n");
      out.write("                 \r\n");
       return;         }
    else if (userType!=null && request_URI.equals("login.jsp") )   
        {
      out.write("\r\n");
      out.write("        <h1>You have successfully authenticated!</h1> \r\n");
      out.write("        <p>Enjoy!  \r\n");
      out.write("            ");

            if (!userType.equals("03"))
            {
      out.write("\r\n");
      out.write("             ");
      if (true) {
        _jspx_page_context.forward("dashboard1.jsp");
        return;
      }
      out.write("\r\n");
      out.write(" ");
            }
                
      return;         }
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <h1>Please enter your  Username and Password</h1>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <img src=\"img/diligent_logo.jpg\" width=\"130\" height=\"30\" alt=\"Dili@gent\"/>  \r\n");
      out.write("        <table width=\"800\" border=\"14\" cellspacing=\"15\" cellpadding=\"15\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                    \r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");

                            
                            if (request_URI == null)
                                {
                                request_URI = "login.jsp";
                                }
                        
      out.write("\r\n");
      out.write("                        <form method=\"GET\" action=\"security_check.jsp\">\r\n");
      out.write("                            <p>&nbsp;</p><p>&nbsp;</p>\r\n");
      out.write("                            <h2>User Name:&nbsp;&nbsp;</h2>\r\n");
      out.write("                            <input type=\"text\" name=\"j_username\"><p>&nbsp;</p>\r\n");
      out.write("                            <h2>Password:&nbsp;&nbsp;</h2>\r\n");
      out.write("                            <input type=\"password\" name=\"j_password\"><p>&nbsp;</p>\r\n");
      out.write("                            <input value=\"");
      out.print(request_URI);
      out.write("\" type=\"hidden\" name=\"request_URI\"><p>&nbsp;</p>\r\n");
      out.write("                            <input type=\"submit\" value=\"Submit\" />\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

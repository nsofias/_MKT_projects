package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.others.Parameters;
import nsofiasLib.databases.DatabaseLogger;
import java.sql.ResultSet;
import nsofiasLib.time.TimeStamp1;

public final class security_005fpolicy_005fcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


boolean check_password_content_ok(String myNewPassword) throws Exception
    {
    boolean hasSpecialChar=false,hasSmallLetter=false,hasCapitalLetter=false,hasNumber=false;
    for (int i=0; i<myNewPassword.length();i++)
        {
        int myChar = myNewPassword.charAt(i);
        if (myChar>=48 & myChar<=57)
            hasNumber=true;
        if (myChar>=33 & myChar<=37)
            hasSpecialChar=true;        
        if (myChar>=65 & myChar<=90)
            hasCapitalLetter=true;
        if (myChar>=97 & myChar<=122)
            hasSmallLetter=true;
        }    
    return hasSpecialChar&hasSmallLetter&hasCapitalLetter&hasNumber;
    }                

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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
  
    String username=(String)session.getAttribute("username");
    String password=(String)session.getAttribute("password");
    String userRole=(String)session.getAttribute("role");
    //------
    String myPassword_old=request.getParameter("j_password_old");
    String myPassword_1=request.getParameter("j_password_1");
    String myPassword_2=request.getParameter("j_password_2");
    DatabaseLogger myDatabaseLogger=null;
    if (username==null)
        {
      out.write("\r\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("login.jsp");
        return;
      }
      out.write("\r\n");
      out.write("    ");
  return;
        }    
    if (!password.equals(myPassword_old))
        {
      out.write("\r\n");
      out.write("        <b><font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your OLD password is not entered correctly. Please go\r\n");
      out.write("        <a href=\"change_password.jsp\">back</a> and try again!</font></b>\r\n");
      out.write("   ");
   return;
        }
    if (!myPassword_1.equals(myPassword_2))
        {
      out.write("\r\n");
      out.write("        <b><font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password is not entered correctly. Please go\r\n");
      out.write("        <a href=\"change_password.jsp\">back</a> and try again!</font></b>\r\n");
      out.write("   ");
   return;
        }
    String myNewPassword = myPassword_1;
    if (myNewPassword.length()<8)
        {
      out.write("\r\n");
      out.write("        <b><font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password should be at least 8 characters long. Please go\r\n");
      out.write("        <a href=\"change_password.jsp\">back</a> and try again!</font></b>\r\n");
      out.write("   ");
   return;
        }
    if (myNewPassword.length()<8)
        {
      out.write("\r\n");
      out.write("        <b><font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password should be at least 8 characters long. Please go\r\n");
      out.write("        <a href=\"change_password.jsp\">back</a> and try again!</font></b>\r\n");
      out.write("   ");
   return;
        }  
    if (!check_password_content_ok(myNewPassword))
        {
      out.write("\r\n");
      out.write("        <b><font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password should contain at least one special character (%,@,#,$,!), one number, one Capital and one small letter. Please go\r\n");
      out.write("        <a href=\"change_password.jsp\">back</a> and try again!</font></b>\r\n");
      out.write("   ");
   return;
        }        
   String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
   myDatabaseLogger= new DatabaseLogger("com.mysql.jdbc.Driver","jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
   try
        {        
        myDatabaseLogger.connect();
        TimeStamp1 now = new TimeStamp1();
        now.addDays(90);
        String passwordExpiryDate = now.getTodayUnformated();
        String sqlStr="UPDATE `dslmon_skopia`.`users` SET users.password='"+myNewPassword+"',users.passwordExpiryDate='"+passwordExpiryDate +"' WHERE users.username='"+username+"' AND users.password='"+myPassword_old+"'";
        myDatabaseLogger.writeln(sqlStr);
        myDatabaseLogger.close();
        session.setAttribute("password", myNewPassword);
        session.setAttribute("role", userRole.split("-")[0]);
        //System.out.println(sqlStr);
	}//try
   catch(Exception e)
        {
        out.println(e.toString());
        myDatabaseLogger.close();
        
      out.write("\r\n");
      out.write("        <b><font face=\"Verdana\" size=\"3\" color=\"#000080\">SORRY SERVICE NOT AVAILABLE AT THE MOMENT! Your password did not change. Please go\r\n");
      out.write("        <a href=\"index.jsp\">back</a> and try again!</font></b>\r\n");
      out.write("   ");
   
        }
      out.write("\r\n");
      out.write("        <b><font face=\"Verdana\" size=\"3\" color=\"#000080\">Your password changed!. Please go\r\n");
      out.write("        <a href=\"index.jsp\">back</a></font></b>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.others.Parameters;
import nsofiasLib.databases.DatabaseLogger;
import nsofiasLib.time.TimeStamp1;
import java.sql.ResultSet;
import java.util.*;
import java.text.NumberFormat;

public final class updateUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
 
//---------------------
String request_URI = request.getRequestURI();
request_URI=request_URI.substring(request_URI.lastIndexOf("/")+1);
String url="login.jsp?request_URI="+request_URI;
String userType=(String)session.getAttribute("role");
if (userType==null)
    {
      out.write("\r\n");
      out.write("    ");
      if (true) {
        _jspx_page_context.forward(url);
        return;
      }
      out.write('\r');
      out.write('\n');
  return;
    }
if (userType.endsWith("-expired"))// password expired
    {
    
      out.write("\r\n");
      out.write("    <b><font face=\"Verdana\" size=\"3\" color=\"#000080\"></font></b>Sorry, your password is expired!!!\r\n");
      out.write("    ");
      if (true) {
        _jspx_page_context.forward("change_password.jsp");
        return;
      }
      out.write("\r\n");
      out.write("    ");
return;
    }
    if (!userType.equals("00")){return;}
//--------------------------------------------------------------            
        String UPDATE = request.getParameter("UPDATE");
        String DELETE = request.getParameter("DELETE");
        String CREATE_USER = request.getParameter("CREATE_USER");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String lastPasswordChange = request.getParameter("lastPasswordChange");
        String realName = request.getParameter("realName");
        String passwordExpiryDate = request.getParameter("passwordExpiryDate");
        String title="Users administration";
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        DatabaseLogger myDatabaseLogger= new DatabaseLogger("com.mysql.jdbc.Driver","jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();        
        if (CREATE_USER!=null)
            {
            try{       
            String sqlStr="INSERT INTO users (`username`, `password`, `role`, `lastPasswordChange`,`realName`,`passwordExpiryDate`) VALUES ('"+username+"', '"+password+"', '"+role+"', '"+lastPasswordChange+"', '"+realName+"', '"+passwordExpiryDate+"')"; 
            myDatabaseLogger.writeln(sqlStr);
//            out.println(sqlStr);
            }catch(Exception e){
      out.write("User already  exists.  Now go <a href=\"showUsers.jsp\">  back to Users</a> ");
return;}
      out.write("\r\n");
      out.write("            <h2>User created successfully, now go <a href=\"showUsers.jsp\">  back to Users</a></h2>\r\n");
      out.write("            ");

            return;
            }
        if (UPDATE!=null)
            {
            String sqlStr="update users set password = '"+password+"',role='"+role+"',lastPasswordChange='"+lastPasswordChange+"',realName='"+realName+"',passwordExpiryDate='"+passwordExpiryDate+"' where username='"+username+"'";
            myDatabaseLogger.writeln(sqlStr); 
            
      out.write("\r\n");
      out.write("            <h2>User updated successfully, now go<a href=\"showUsers.jsp\">  back to Users</a></h2>\r\n");
      out.write("            ");

            return;
            }
        if (DELETE!=null)
            {
            String sqlStr="delete from users where username='"+username+"'";
            myDatabaseLogger.writeln(sqlStr); 
            
      out.write("\r\n");
      out.write("            <h2>User deleted successfully, now go <a href=\"showUsers.jsp\"> back to Users</a></h2>\r\n");
      out.write("            ");

            return;
            }    
      out.write("    \r\n");
      out.write("\r\n");
      out.write("        <h1>");
      out.print(title);
      out.write("</h1>\r\n");
      out.write("        <form action=\"updateUser.jsp?update\">\r\n");
      out.write("        \r\n");
      if (username!=null)
            {
            String sqlStr="select * from users where username='"+username+"'";
            ResultSet users=myDatabaseLogger.getResults(sqlStr);
            users.next();
            
      out.write(" \r\n");
      out.write("            <table border=\"1\" cellspacing=\"1\" cellpadding=\"1\">            \r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">username</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"username\" value=\"");
      out.print(users.getString(1));
      out.write("\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">password</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"password\" value=\"");
      out.print(users.getString(2));
      out.write("\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">role</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"role\" value=\"");
      out.print(users.getString(3));
      out.write("\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">last Password Change</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"lastPasswordChange\" value=\"");
      out.print(users.getString(4));
      out.write("\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">real Name</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"realName\" value=\"");
      out.print(users.getString(5));
      out.write("\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">password Expiry Date</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"passwordExpiryDate\" value=\"");
      out.print(users.getString(6));
      out.write("\"></td>    \r\n");
      out.write("        </table>                    \r\n");
      out.write("        <input name=\"UPDATE\" type=\"submit\" value=\"Update User\">\r\n");
      out.write("        <input name=\"DELETE\" type=\"submit\" value=\"Delete User\">                \r\n");
          }
        else
            {
            TimeStamp1 now= new TimeStamp1();
            now.addDays(-1);                       
        
      out.write("  \r\n");
      out.write("        <table border=\"1\" cellspacing=\"1\" cellpadding=\"1\">            \r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">username</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"username\" value=\"\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">password</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"password\" value=\"\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">role</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"role\" value=\"\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">last Password Change</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input readonly type=\"text\" name=\"lastPasswordChange\" value=\"\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">real Name</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input type=\"text\" name=\"realName\" value=\"\"></td>\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\">password Expiry Date</td><td align=\"left\" bgcolor=\"#DEB0AF\"><input readonly type=\"text\" name=\"passwordExpiryDate\" value=\"");
      out.print(now.getTodayUnformated());
      out.write("\"></td>                             \r\n");
      out.write("        </table>                    \r\n");
      out.write("        <input name=\"CREATE_USER\" type=\"submit\" value=\"Create User\">                \r\n");
          }
      out.write(" \r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    \r\n");
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

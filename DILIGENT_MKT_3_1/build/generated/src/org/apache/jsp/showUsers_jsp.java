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

public final class showUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    private String format_number(double myNumder)
        {
        NumberFormat myNumberFormat = NumberFormat.getInstance();
        myNumberFormat.setMinimumFractionDigits(2);
        myNumberFormat.setMaximumFractionDigits(2); 
        myNumberFormat.setGroupingUsed(false);
        String myNumder_string = myNumberFormat.format(myNumder);

        myNumder_string = myNumder_string.replaceAll(",",".");
        double myNumder_D=Double.valueOf(myNumder_string).doubleValue();
        if (myNumder>myNumder_D)
            {
            myNumder_D=myNumder_D+0.01;  
            myNumder_string = myNumberFormat.format(myNumder_D); 
            myNumder_string = myNumder_string.replaceAll(",",".");
            }               
        return(myNumder_string);
        }     

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
      out.write("\r\n");
      out.write("\r\n");
 String userTypes = "00";
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");

        String title="Users administration";
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        DatabaseLogger myDatabaseLogger= new DatabaseLogger("com.mysql.jdbc.Driver","jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        String sqlStr="select * from users";
        ResultSet users=myDatabaseLogger.getResults(sqlStr);
        
      out.write(" \r\n");
      out.write("        <h1>");
      out.print(title);
      out.write("</h1>\r\n");
      out.write("        <a href=\"updateUser.jsp\">Create User</a>\r\n");
      out.write("        <table border=\"1\" cellspacing=\"1\" cellpadding=\"1\">\r\n");
      out.write("            <tr><th align=\"left\" bgcolor=\"#DEB0AF\">username</th>\r\n");
      out.write("            <th align=\"left\" bgcolor=\"#DEB0AF\">password</th>\r\n");
      out.write("            <th align=\"left\" bgcolor=\"#DEB0AF\">role</th>\r\n");
      out.write("            <th align=\"left\" bgcolor=\"#DEB0AF\">last Password Change</th>\r\n");
      out.write("            <th align=\"left\" bgcolor=\"#DEB0AF\">real Name</th>\r\n");
      out.write("            <th align=\"left\" bgcolor=\"#DEB0AF\">password Expiry Date</th></tr>\r\n");
        while (users.next())
            {    
                        
            
      out.write("\r\n");
      out.write("            <tr><td align=\"left\" bgcolor=\"#DEB0AF\"><a  href=\"updateUser.jsp?username=");
      out.print(users.getString(1));
      out.write('"');
      out.write('>');
      out.print(users.getString(1));
      out.write("</a></td>\r\n");
      out.write("            <td align=\"left\" bgcolor=\"#DEB0AF\">**************</td>\r\n");
      out.write("            <td align=\"left\" bgcolor=\"#DEB0AF\">");
      out.print(users.getString(3));
      out.write("</td>\r\n");
      out.write("            <td align=\"left\" bgcolor=\"#DEB0AF\">");
      out.print(users.getString(4));
      out.write("</td>\r\n");
      out.write("            <td align=\"left\" bgcolor=\"#DEB0AF\">");
      out.print(users.getString(5));
      out.write("</td>\r\n");
      out.write("            <td align=\"left\" bgcolor=\"#DEB0AF\">");
      out.print(users.getString(6));
      out.write("</td>     \r\n");
            }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \t\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

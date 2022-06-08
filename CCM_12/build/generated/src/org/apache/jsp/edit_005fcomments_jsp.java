package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLDecoder;
import java.sql.ResultSet;
import nsofiasLib.databases.DatabaseLogger;

public final class edit_005fcomments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String comments = URLDecoder.decode(request.getParameter("comments"), "UTF-8");
    //out.println(comments);
    String elementName = request.getParameter("elementName");
    String start = request.getParameter("start");
    String submit = request.getParameter("submit");

    if (submit != null)
        {
        if (comments.trim().isEmpty())
            {
            comments="-";
            }
        DatabaseLogger myDatabaseLogger;
        myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/ccm?user=sa&password=trinitron");
        myDatabaseLogger.connect();

        String SQL_update = "UPDATE ccm.alarms SET  comments = '" + comments + "' WHERE elementName='" + elementName + "' AND start='" + start + "'";
        try
            {
            //out.println(SQL_update);
            myDatabaseLogger.writeln(SQL_update);
            myDatabaseLogger.close();
                
      out.write("\n");
      out.write("                <h3>Your comments for ");
      out.print(elementName);
      out.write("  @ ");
      out.print(start);
      out.write(" updated successfully! <p>You can close this window now. <p>Please, notice that you have to refresh before updates become visible</h3>\n");
      out.write("                ");

                    }
                catch (Exception e)
                    {
                
      out.write("\n");
      out.write("                <h3>Your comments' for ");
      out.print(elementName);
      out.write("  @ ");
      out.print(start);
      out.write(" update failed, sorry! Send this information to Administrator:");
      out.print(e.toString());
      out.write(" <p>You can close this window now.</h3>\n");
      out.write("                ");

            }
        return;
        }
    else
        {
        DatabaseLogger myDatabaseLogger;
        myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/ccm?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        String SQL = "SELECT comments FROM ccm.alarms WHERE start='" + start + "' AND elementName ='" + elementName + "' ";
        ResultSet res = myDatabaseLogger.getResults(SQL);
        if (res.next())
            {
            comments = res.getString("comments").trim();
            }
        myDatabaseLogger.close();
        }


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h3>Comments for ");
      out.print(elementName);
      out.write(" @ ");
      out.print(start);
      out.write("</h3>\n");
      out.write("        <form name=\"comments\" action=\"edit_comments.jsp\" method=\"POST\" accept-charset=\"UTF-8\">\n");
      out.write("            <textarea style=\"text-align: left\" name=\"comments\" rows=\"4\" cols=\"20\">");
      out.print(comments);
      out.write("</textarea>\n");
      out.write("            <input type=\"submit\" value=\"submit comments\" name=\"submit\" />\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(elementName);
      out.write("\" name=\"elementName\" />\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(start);
      out.write("\" name=\"start\" />\n");
      out.write("        </form>\n");
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

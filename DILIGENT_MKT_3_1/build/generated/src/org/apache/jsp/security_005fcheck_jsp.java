package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.others.Parameters;
import SKOPIA.Visitor;
import java.util.*;
import nsofiasLib.utils.CounterObjsGrouper;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.databases.DatabaseLogger;
import java.io.File;
import java.sql.ResultSet;

public final class security_005fcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
  DatabaseLogger myDatabaseLogger=null;
    String myUsername=request.getParameter("j_username");
    String request_URI=request.getParameter("request_URI");
//    if ( request_URI ==null || request_URI.isEmpty() || request_URI.equals("login.jsp") || request_URI.equals("null"))request_URI="index.jsp";
    //---------------------    
       try
        {
        String userRole=null;
        String myPassword=request.getParameter("j_password");  
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        myDatabaseLogger= new DatabaseLogger("com.mysql.jdbc.Driver","jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        //myDatabaseLogger= new DatabaseLogger("org.mariadb.jdbc.Driver","jdbc:mariadb://localhost/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        String sqlStr="SELECT * FROM users WHERE users.username='"+myUsername+"' AND users.password='"+myPassword+"'";
        ResultSet res=myDatabaseLogger.getResults(sqlStr);
        //System.out.println(sqlStr);
        String userType=(String)session.getAttribute("role");
        //
        if (res.next()  )  // authenticated
            {
            TimeStamp1 now = new TimeStamp1();
            String today = now.getTodayUnformated();
            String passwordExpiryDate=res.getString("passwordExpiryDate");                         // 20150101             
            userRole=res.getString("role");
            if (passwordExpiryDate.compareTo(today)<0)
                userRole=userRole+"-expired";
            session.setAttribute("username", myUsername);
            session.setAttribute("password", myPassword);
            session.setAttribute("role", userRole);
            //
            String IPAddr = request.getRemoteAddr();
            CounterObjsGrouper visitorsGrouper = (CounterObjsGrouper)request.getSession().getServletContext().getAttribute("visitors");
            ArrayList visitors = visitorsGrouper.getCounters();
            for (int i=0;i<visitors.size();i++)
                {
                 Visitor myVisitor = (Visitor)visitors.get(i);
                 String IPAddress = myVisitor.getIPAdress();
                 if(IPAddr.equals(IPAddress))
                     {
                     myVisitor.setUser(myUsername);
                     break;
                     }
                }
            myDatabaseLogger.close();
            
      out.write("            \n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward(request_URI);
        return;
      }
      out.write("\n");
      out.write("            ");
return;
            }
        else
            {
      out.write("\n");
      out.write("            <b><font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your authentication failed. Please go\n");
      out.write("            <a href=\"login.jsp\">back</a> and try again!</font></b>\n");
      out.write("       ");
   }
        //myDatabaseLogger.close();
	}//try
    catch(Exception e)
        {
        out.println(e.toString());
        
      out.write("\n");
      out.write("        request_URI=");
      out.print(request_URI);
      out.write("\n");
      out.write("        <b><font face=\"Verdana\" size=\"3\" color=\"#000080\">");
      out.print(e.toString());
      out.write("</font></b>\n");
      out.write("   ");
   try{myDatabaseLogger.close();}catch(Exception ex){}
        return;
        }

      out.write("\n");
      out.write("\n");
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

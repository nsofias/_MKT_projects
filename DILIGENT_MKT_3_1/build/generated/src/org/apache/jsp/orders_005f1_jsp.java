package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.others.Parameters;
import java.sql.ResultSet;
import nsofiasLib.databases.DatabaseLogger;
import java.util.Collections;
import nsofiasLib.utils.Counters1;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class orders_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
 String userTypes = "00,01,02,03,04";
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
      out.write("\r\n");

    TimeStamp1 now = new TimeStamp1();
    String period = request.getParameter("period");
    if (period == null) {
        period = "2";
    }
    String from_timestamp = request.getParameter("from");
    if (from_timestamp == null) {
        from_timestamp = now.getNowFormated().substring(0, 16);
    }        
    String to_timestamp = request.getParameter("to");
    if (to_timestamp == null) {
        to_timestamp = now.getNowFormated().substring(0, 10) + " 00:00";
    }
    System.out.println("orders:from_timestamp=" + from_timestamp);
    System.out.println("orders:to_timestamp=" + to_timestamp);

    String actionResult = request.getParameter("actionResult");
    String actionType = request.getParameter("actionType");
    ResultSet res;
    //--------------------------

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Alarms</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("    <script src=\"datetimepicker_css.js\"></script> \r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("        function period_setter()\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById('fromId').value = \"");
      out.print(from_timestamp);
      out.write("\";\r\n");
      out.write("            document.getElementById('toId').value = \"");
      out.print(to_timestamp);
      out.write("\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>  \r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"javascript:period_setter()\">\r\n");
      out.write("    <form id=\"myForm\"  method=\"POST\" action=\"orders_1.jsp\"  accept-charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        <b>Start of period: </b>\r\n");
      out.write("        <input readonly=\"\" name=\"to\" value=\"");
      out.print(to_timestamp);
      out.write("\" type=\"Text\" id=\"toId\" maxlength=\"25\" size=\"25\"/>\r\n");
      out.write("        <img src=\"cal.gif\" alt=\"\" onclick=\"javascript:NewCssCal('toId', 'ddMMyyyy', 'arrow', true, '24')\" style=\"cursor:pointer\"/>\r\n");
      out.write("        <b>End of period: </b>\r\n");
      out.write("        <input readonly=\"\" name=\"from\" value=\"");
      out.print(from_timestamp);
      out.write("\" type=\"Text\" id=\"fromId\" maxlength=\"25\" size=\"25\"/>\r\n");
      out.write("        <img src=\"cal.gif\" alt=\"\" onclick=\"javascript:NewCssCal('fromId', 'ddMMyyyy', 'arrow', true, '24')\" style=\"cursor:pointer\"/>\r\n");
      out.write("        <input type=\"hidden\" name=\"actionResult\" value=\"");
      out.print(actionResult);
      out.write("\" />\r\n");
      out.write("        <input type=\"hidden\" name=\"actionType\" value=\"");
      out.print(actionType);
      out.write("\" />\r\n");
      out.write("        <p><input type=\"submit\" value=\"SUBMIT\" />\r\n");
      out.write("    </form>     \r\n");
      out.write("    ");


        String T1 = new TimeStamp1(from_timestamp + ":00:000").getNowUnformated();
        String T2 = new TimeStamp1(to_timestamp + ":00:000").getNowUnformated();
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        //-------
        String sqlStr = "select actionType, actionID, actionDesc, actionResult, actionReportedDate, actionStatus from Actor.actions where actionReportedDate >= '" + T2 + "' AND actionReportedDate <= '" + T1 + "' order by actionReportedDate desc";
        //out.println("sqlStr="+sqlStr);
        //out.println("actionType="+actionType);
        //out.println("actionResult="+actionResult);
        
        res = myDatabaseLogger.getResults(sqlStr);
        out.println("<table border='1'  bgcolor='lightblue'> ");
        out.println("<tr><th>Reported</th><th>desc</th><th>SVT result( Transport - service )</th><th>status</th></tr>");
        while (res.next()) {
            try {
                if ((actionResult == null || actionResult.equals("null")|| res.getString("actionResult").startsWith(actionResult)) && actionType.equals(res.getString("actionType"))) {

                    String myReportedDate = "";
                    try {
                        myReportedDate = new TimeStamp1(res.getString("actionReportedDate")).getNowFormated();
                    } catch (Exception e) {out.println(e.toString());
                    }
                    String actionResultRes = res.getString("actionResult");//SVT_TRANSPORT_NOK:Not OK:Not OK
                    out.println("<tr>"
                            + "<td>" + myReportedDate
                            + "<td>" + res.getString("actionDesc") + "</td>"
                            + "<td>" + actionResultRes+ "</td>"
                            + "<td>" + res.getString("actionStatus") + "</td>"
                            + "</td></tr>");
                }
            } catch (Exception e) {
                //out.println("orders:actionResult=" + res.getString("actionResult"));
            }
        }

        res.close();
        out.println("</table>");

    
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

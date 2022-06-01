package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.reflect.Modifier;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.sql.ResultSet;
import nsofiasLib.databases.DatabaseLogger;
import com.google.gson.Gson;
import nsofiasLib.others.Parameters;
import java.util.Set;
import nsofiasLib.utils.Counters1;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.others.SimpleDaemon;
import java.util.Collections;
import java.util.Map;
import java.net.URLEncoder;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import ccm.CCMonitorStatsObjsContainer;
import ccm.*;

public final class alarms_005fhistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String userTypes = "00,01,02";
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    //String userTypes = "00,01,02";
    //  ----------- SEQURITY CHECK ---------------
    String request_URI = request.getRequestURI();
    request_URI = request_URI.substring(request_URI.lastIndexOf("/") + 1);
    String url = "login.jsp?request_URI=" + request_URI;
    String userType = (String) session.getAttribute("role");
    String username = (String) session.getAttribute("username");
    if (userType == null)
        {
      out.write('\n');
      if (true) {
        _jspx_page_context.forward(url);
        return;
      }
      out.write('\n');
  return;
    }
else if (userType.endsWith("-expired"))// password expired
        {
        
      out.write("\n");
      out.write("        <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password is expired!!!</font>\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("change_password.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");
return;
        }

      out.write('\n');
      out.write('\n');
      out.write('\n');
//----------- sequrity----------------
    try {
        if (!userTypes.contains(userType)) {

      out.write("\n");
      out.write("<font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, you are not authorized to view this page!!!</font>\n");
return;
        }
    } catch (Exception e) {
    }
//----------- sequrity end----------------

      out.write('\n');

    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    TimeStamp1 now = new TimeStamp1();
    String from = request.getParameter("from");
    if (from == null) {
        from = now.getNowFormated().substring(0, 16);
    }
    String to = request.getParameter("to");
    if (to == null) {
        to = now.getNowFormated().substring(0, 10) + " 00:00";
    }
    String T1 = new TimeStamp1(from + ":00:000").getNowUnformated();
    String T2 = new TimeStamp1(to + ":00:000").getNowUnformated();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Alarms history</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">\n");
      out.write("        <script src=\"datetimepicker_css.js\"></script>      \n");
      out.write("        <script language=\"javascript\">\n");
      out.write("            function downloadCSV(csv, filename) {\n");
      out.write("                var csvFile;\n");
      out.write("                var downloadLink;\n");
      out.write("                var csvEncoder = new TextEncoder(\"utf-8\");\n");
      out.write("                var BOM = \"\\uFEFF\";\n");
      out.write("                var csvEncoded = csvEncoder.encode([BOM + csv]);\n");
      out.write("                csvFile = new Blob([csvEncoded], {type: \"text/csv;charset=utf-8\"});\n");
      out.write("                downloadLink = document.createElement(\"a\");\n");
      out.write("                downloadLink.download = filename;\n");
      out.write("                // Create a link to the file\n");
      out.write("                downloadLink.href = window.URL.createObjectURL(csvFile);\n");
      out.write("                // Hide download link\n");
      out.write("                downloadLink.style.display = \"none\";\n");
      out.write("                // Add the link to DOM\n");
      out.write("                document.body.appendChild(downloadLink);\n");
      out.write("                downloadLink.click();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function exportTableToCSV(filename) {\n");
      out.write("                var csv = [];\n");
      out.write("                var rows = document.querySelectorAll(\"table tr\");\n");
      out.write("                for (var i = 0; i < rows.length; i++) {\n");
      out.write("                    var row = [], cols = rows[i].querySelectorAll(\"td, th\");\n");
      out.write("                    for (var j = 0; j < cols.length; j++)\n");
      out.write("                        row.push(cols[j].innerText);\n");
      out.write("                    csv.push(row.join(\";\"));\n");
      out.write("                }\n");
      out.write("                downloadCSV(csv.join(\"\\n\"), filename);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function period_setter()\n");
      out.write("            {\n");
      out.write("                document.getElementById('fromId').value = \"");
      out.print(from);
      out.write("\";\n");
      out.write("                document.getElementById('toId').value = \"");
      out.print(to);
      out.write("\";\n");
      out.write("            }\n");
      out.write("        </script>        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body onload=\"javascript:period_setter()\">\n");
      out.write("        <h1>Alarms από ");
      out.print(to);
      out.write(" έως ");
      out.print(from);
      out.write("</h1>\n");
      out.write("        <form id=\"myForm\"  method=\"POST\" action=\"alarms_history.jsp\"  accept-charset=\"UTF-8\">\n");
      out.write("            <b>Start of period: </b>\n");
      out.write("            <input readonly=\"\" name=\"to\" value=\"");
      out.print(to);
      out.write("\" type=\"Text\" id=\"toId\" maxlength=\"25\" size=\"25\"/>\n");
      out.write("            <img src=\"cal.gif\" alt=\"\" onclick=\"javascript:NewCssCal('toId', 'ddMMyyyy', 'arrow', true, '24')\" style=\"cursor:pointer\"/>\n");
      out.write("            <b>End of period: </b>\n");
      out.write("            <input readonly=\"\" name=\"from\" value=\"");
      out.print(from);
      out.write("\" type=\"Text\" id=\"fromId\" maxlength=\"25\" size=\"25\"/>\n");
      out.write("            <img src=\"cal.gif\" alt=\"\" onclick=\"javascript:NewCssCal('fromId', 'ddMMyyyy', 'arrow', true, '24')\" style=\"cursor:pointer\"/>            \n");
      out.write("            <p><input type=\"submit\" value=\"SUBMIT\" />\n");
      out.write("        </form>       \n");
      out.write("        <p><img src=\"csv.png\" alt=\"Export to CSV File\" onclick=\"exportTableToCSV('alarms.csv')\"/>\n");
      out.write("\n");
      out.write("        <table  border='1'>\n");
      out.write("            <tr>\n");
      out.write("                <th>sourse</th>                \n");
      out.write("                <th>start</th>\n");
      out.write("                <th>stop</th>\n");
      out.write("                <th>type</th>                \n");
      out.write("                <th>significant reason</th>                \n");
      out.write("                <th>Distinct callers</th>               \n");
      out.write("                <th>SR</th>\n");
      out.write("                <th>weather</th> \n");
      out.write("            </tr>\n");
      out.write("            ");
                
                String sql = "SELECT * FROM CCM.alarms where alarmId > '" + T2 + "' and alarmId<='" + T1 + "'";
                String connectionURL = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "alarms_database.connectionURL", "utf-8", "");
                String jdbcDriver = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "alarms_database.jdbcDriver", "utf-8", "");
                DatabaseLogger myDatabaseLogger = new DatabaseLogger(jdbcDriver, connectionURL);
                myDatabaseLogger.connect();
                ResultSet res = myDatabaseLogger.getResults(sql);
                Map<String, CCMAlarm> alarmArrayList = new HashMap<>();
                while (res.next()) {
                    try {
                        String alarmBody = res.getString("alarmBody");
                        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
                        CCMAlarm myCCMAlarm = (CCMAlarm) gson.fromJson(alarmBody, CCMAlarm.class);
                        alarmArrayList.put(myCCMAlarm.getAlarmId(), myCCMAlarm);
                        System.out.println("myCCMAlarm=" + myCCMAlarm.toString());
                    } catch (Exception e) {
                        out.println("CCM12:error====0 " + e.toString());
                        e.printStackTrace();
                    }
                }
                //---------------------------------------------------------- 
                ArrayList<String> alarmIds = new ArrayList(alarmArrayList.keySet());
                Collections.sort(alarmIds, Collections.reverseOrder());
                for (String key : alarmIds) {
                    CCMAlarm myAlarm = alarmArrayList.get(key);
                    try {
                        String alertOrigin = myAlarm.getAlarmObject();
                        TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlertStart());
                        T0.addSeconds(-7400);
                        String AlertStart = new TimeStamp1(myAlarm.getAlarmStart()).getNowFormated();
                        String AlarmStop = myAlarm.getAlarmStop()!=null ? new TimeStamp1(myAlarm.getAlarmStop()).getNowFormated() : "N/A";
                        String AlertType = myAlarm.getAlarmType()!=null?myAlarm.getAlarmType():"N/A";
                        String AlertTypeS = "";
                        if (AlertType.equals("REASON")) {
                            AlertTypeS = "Reason " + myAlarm.getAlarmObject();
                        } else {
                            AlertTypeS = AlertType;
                        }
                        String AlertMostSignificantReason = myAlarm.getAlertMostSignificantReason()!=null?myAlarm.getAlertMostSignificantReason() : "N/A";
            
      out.write("\n");
      out.write("            <tr >\n");
      out.write("                <td>");
      out.print(alertOrigin.replace(";", ":"));
      out.write("</td>                                \n");
      out.write("                <td nowrap>");
      out.print(AlertStart.substring(0, 16));
      out.write("</td>\n");
      out.write("                <td nowrap>");
      out.print(AlarmStop.substring(0, 16));
      out.write("</td>  \n");
      out.write("                <td>");
      out.print(AlertTypeS);
      out.write("</td>  \n");
      out.write("                <td>");
      out.print(AlertMostSignificantReason);
      out.write("</td> \n");
      out.write("                <td>");
      out.print((int) myAlarm.getTotalCalls());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(myAlarm.getTicketSR());
      out.write("</td>                  \n");
      out.write("                <td>");
      out.print(myAlarm.getWeatherInfo());
      out.write("</td> \n");
      out.write("                </b>  \n");
      out.write("            </tr>        \n");
      out.write("            ");
             } catch (Exception e) {
                        out.println("CCM12:error====1 " + e.toString());
                        e.printStackTrace();
                    }

                }
      out.write("        \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.others.Parameters;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.Ticket_FYROM;
import nsofiasLib.time.TimeStamp1;
import java.sql.ResultSet;
import java.util.HashMap;
import nsofiasLib.databases.DatabaseLogger;
import java.net.URLEncoder;
import java.util.Map;
import nsofiasLib.ote.alarms.*;
import java.util.Iterator;
import java.util.Collections;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private void toHTML(String[] headers, ArrayList<String[]> rows, JspWriter out) {
        try {
            out.println("<p><table>");
            //-------headers --------------------
            out.println("<tr>");
            for (String head : headers) {
                out.println("<th>" + head + "</th>");
            }
            out.println("</tr>");
            //-------body --------------------
            for (String[] row : rows) {
                out.println("<tr>");
                for (String el : row) {
                    if (el == null || el.equals("null")) {
                        el = "-";
                    }
                    out.println("<td>" + el + "</td>");
                }
                out.println("</tr>");
                out.flush();
            }
            out.println("</table>");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
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
      response.setContentType("text/html;charset=utf-8");
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
 String userTypes = "00,01,02";
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

      out.write('\r');
      out.write('\n');

    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    //=====================================================================================================
    ServletContext myContext = request.getServletContext();
    try {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    } catch (Exception e) {
    }
    TimeStamp1 now = new TimeStamp1();
    String period = request.getParameter("period");
    if (period == null) {
        period = "2";
    }
    String from = request.getParameter("from");
    if (from == null) {
        from = now.getNowFormated().substring(0, 16);
    }
    String to = request.getParameter("to");
    if (to == null) {
        to = now.getNowFormated().substring(0, 10) + " 00:00";
    }
    //
    String elementName = request.getParameter("elementName");
    if (elementName == null) {
        elementName = "";
    } else {
        elementName = elementName.trim();
    }

    String alarmType = request.getParameter("alarmType");
    if (alarmType == null) {
        alarmType = "any";
    } else {
        alarmType = alarmType.trim();
    }
    String sr = request.getParameter("sr");
    if (sr == null) {
        sr = "";
    } else {
        sr = sr.trim();
    }
    //
    String affected_ = request.getParameter("affected");
    int affected = 0;
    try {
        affected = Integer.valueOf(affected_);
    } catch (Exception e) {
    }
    //================================ end of general part =====================================================================


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>History</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("        <script src=\"datetimepicker_css.js\"></script>      \r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            function downloadCSV(csv, filename) {\r\n");
      out.write("                var csvFile;\r\n");
      out.write("                var downloadLink;\r\n");
      out.write("                var csvEncoder = new TextEncoder(\"utf-8\");\r\n");
      out.write("                var BOM = \"\\uFEFF\";\r\n");
      out.write("                var csvEncoded = csvEncoder.encode([BOM + csv]);\r\n");
      out.write("                csvFile = new Blob([csvEncoded], {type: \"text/csv;charset=utf-8\"});\r\n");
      out.write("                downloadLink = document.createElement(\"a\");\r\n");
      out.write("                downloadLink.download = filename;\r\n");
      out.write("                // Create a link to the file\r\n");
      out.write("                downloadLink.href = window.URL.createObjectURL(csvFile);\r\n");
      out.write("                // Hide download link\r\n");
      out.write("                downloadLink.style.display = \"none\";\r\n");
      out.write("                // Add the link to DOM\r\n");
      out.write("                document.body.appendChild(downloadLink);\r\n");
      out.write("                downloadLink.click();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function exportTableToCSV(filename) {\r\n");
      out.write("                var csv = [];\r\n");
      out.write("                var rows = document.querySelectorAll(\"table tr\");\r\n");
      out.write("                for (var i = 0; i < rows.length; i++) {\r\n");
      out.write("                    var row = [], cols = rows[i].querySelectorAll(\"td, th\");\r\n");
      out.write("\r\n");
      out.write("                    for (var j = 0; j < cols.length; j++)\r\n");
      out.write("                        row.push(cols[j].innerText);\r\n");
      out.write("\r\n");
      out.write("                    csv.push(row.join(\";\"));\r\n");
      out.write("                }\r\n");
      out.write("                downloadCSV(csv.join(\"\\n\"), filename);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function period_setter()\r\n");
      out.write("            {\r\n");
      out.write("                //                         document.getElementById('areaDistribution').disabled=true;\r\n");
      out.write("                //                         document.getElementById('per5minId').disabled=true;\r\n");
      out.write("                document.getElementById('fromId').value = \"");
      out.print(from);
      out.write("\";\r\n");
      out.write("                document.getElementById('toId').value = \"");
      out.print(to);
      out.write("\";\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>        \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body onload=\"javascript:period_setter()\">\r\n");
      out.write("        <h1>Alarms από ");
      out.print(to);
      out.write(" έως ");
      out.print(from);
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("        <form id=\"myForm\"  method=\"POST\" action=\"history.jsp\"  accept-charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("            <b>Start of period: </b>\r\n");
      out.write("            <input readonly=\"\" name=\"to\" value=\"");
      out.print(to);
      out.write("\" type=\"Text\" id=\"toId\" maxlength=\"25\" size=\"25\"/>\r\n");
      out.write("            <img src=\"cal.gif\" alt=\"\" onclick=\"javascript:NewCssCal('toId', 'ddMMyyyy', 'arrow', true, '24')\" style=\"cursor:pointer\"/>\r\n");
      out.write("\r\n");
      out.write("            <b>End of period: </b>\r\n");
      out.write("            <input readonly=\"\" name=\"from\" value=\"");
      out.print(from);
      out.write("\" type=\"Text\" id=\"fromId\" maxlength=\"25\" size=\"25\"/>\r\n");
      out.write("            <img src=\"cal.gif\" alt=\"\" onclick=\"javascript:NewCssCal('fromId', 'ddMMyyyy', 'arrow', true, '24')\" style=\"cursor:pointer\"/>\r\n");
      out.write("\r\n");
      out.write("            <p>Element name is (or contains) <input type=\"text\" size=\"20\" name=\"elementName\" value=\"");
      out.print(elementName);
      out.write("\" size=\"5\"/>\r\n");
      out.write("                SR like <input type=\"text\" name=\"sr\" value=\"");
      out.print(sr);
      out.write("\" size=\"20\"/>\r\n");
      out.write("                Affected customers more than <input onchange=\"this.form.submit()\" type=\"text\" name=\"affected\" value=\"");
      out.print(affected);
      out.write("\" size=\"5\"/>\r\n");
      out.write("                Technology:<select   onchange=\"this.form.submit()\" name=\"alarmType\"><option selected value=\"");
      out.print(alarmType);
      out.write('"');
      out.write('>');
      out.print(alarmType);
      out.write("</option><option value=\"any\">any</option><option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.TYPE_COPPER);
      out.write('"');
      out.write('>');
      out.print(diligent_MKT.Alarm_FYROM.TYPE_COPPER);
      out.write("</option><option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE);
      out.write('"');
      out.write('>');
      out.print(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE);
      out.write("</option><option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.TYPE_GPON);
      out.write('"');
      out.write('>');
      out.print(diligent_MKT.Alarm_FYROM.TYPE_GPON);
      out.write("</option><option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE);
      out.write('"');
      out.write('>');
      out.print(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE);
      out.write("</option></select>\r\n");
      out.write("            <p><input type=\"submit\" value=\"SUBMIT\" />\r\n");
      out.write("        </form> \r\n");
      out.write("        <p><img src=\"csv.png\" alt=\"Export to CSV File\" onclick=\"exportTableToCSV('alarms.csv')\"/>\r\n");
      out.write("\r\n");
      out.write("            ");

                //objTime, alertStop, alertOrigin, alertDesc, SERVING_AREA, ATC, DSLAM, SLOT, CABLE, DP, OLT, BOX, DESCRIPTION, REGION, linesDisconnected, linesRegistered, linesAffected,activeLinesAffected, affServiceID, markCustomersStatus, releaseCustomersStatus, 
                //SR, incidentStartDate, incidentStoppedDate, incidentReportedDate
                //out.println("from=" + from + "   to=" + to);
                //
                String T1 = null, T2 = null;
                //      out.println("from="+from+"   to="+to);  
                T1 = new TimeStamp1(from + ":00:000").getNowUnformated();
                T2 = new TimeStamp1(to + ":00:000").getNowUnformated();
                //out.println("from=" + T1 + "   to=" + T2);
                //
                ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
                ArrayList<String[]> rows = new ArrayList<>();
                try {
                    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                        for (String ticketID : myGroupBy_Daemon.getMyStatsObjContainer().getOpenTicketsArrayList().keySet()) {
                            Ticket_FYROM myTicket_FYROM = myGroupBy_Daemon.getMyStatsObjContainer().getOpenTicketsArrayList().get(ticketID);
                            if (myTicket_FYROM.getIncidentStartDate().compareTo(T2) > 0 && myTicket_FYROM.getIncidentStartDate().compareTo(T1) < 0) {
                                for (Alarm_FYROM myAlarm_FYROM : myTicket_FYROM.getElementsList()) {
                                    String[] row = new String[24];
                                    try {
                                        row[0] = new TimeStamp1(myAlarm_FYROM.getAlarmStart()).getNowFormated();
                                    } catch (Exception e) {
                                        row[0] = "";
                                    }
                                    try {
                                        row[1] = new TimeStamp1(myAlarm_FYROM.getAlarmStop()).getNowFormated();
                                    } catch (Exception e) {
                                        row[1] = "";
                                    }
                                    row[2] = myAlarm_FYROM.getAlertOrigin().replace(";", " - ");;
                                    row[3] = myAlarm_FYROM.getDESCRIPTION();
                                    row[4] = myAlarm_FYROM.getSERVING_AREA();
                                    row[5] = myAlarm_FYROM.getATC();
                                    row[6] = myAlarm_FYROM.getDSLAM();
                                    row[7] = myAlarm_FYROM.getSLOT();
                                    row[8] = myAlarm_FYROM.getCABLE();
                                    row[9] = myAlarm_FYROM.getDP();
                                    row[10] = myAlarm_FYROM.getOLT();
                                    row[11] = myAlarm_FYROM.getBOX();
                                    row[12] = myAlarm_FYROM.getREGION();
                                    row[13] = String.valueOf(myAlarm_FYROM.getLinesAffected());
                                    row[14] = String.valueOf(myAlarm_FYROM.getActiveLinesAffected());
                                    row[15] = myAlarm_FYROM.getAffServiceID();
                                    row[16] = myAlarm_FYROM.getMarkCustomersStatus();
                                    row[17] = myAlarm_FYROM.getReleaseCustomersStatus();
                                    row[18] = myTicket_FYROM.getSR();
                                    row[19] = String.valueOf(myTicket_FYROM.getCriticality());
                                    try {
                                        row[20] = new TimeStamp1(myTicket_FYROM.getIncidentStartDate()).getNowFormated();
                                    } catch (Exception e) {
                                        row[20] = "";
                                    }
                                    try {
                                        row[21] = new TimeStamp1(myTicket_FYROM.getIncidentStoppedDate()).getNowFormated();
                                    } catch (Exception e) {
                                        row[21] = "";
                                    }
                                    try {
                                        row[22] = new TimeStamp1(myTicket_FYROM.getIncidentReportedDate()).getNowFormated();
                                    } catch (Exception e) {
                                        row[22] = "";
                                    }
                                    row[23] = String.valueOf(myAlarm_FYROM.getAlarmType());
                                    // elementName,sr,affected
                                    try {
                                        if ((elementName == null || elementName.isEmpty() || myAlarm_FYROM.getAlertOrigin().contains(elementName))
                                                && (sr == null || sr.isEmpty() || myTicket_FYROM.getSR().contains(sr))
                                                && (alarmType == null || alarmType.equals("any") || myAlarm_FYROM.getAlarmType().equals(alarmType))
                                                && (myAlarm_FYROM.getLinesAffected() > affected)) {
                                            rows.add(row);
                                        }
                                    } catch (Exception e) {
                                        System.out.println("error");
                                    }

                                }
                            }
                        }
                    }

                    //----------------------------
                    String sql = "SELECT * FROM dslmon_skopia.alarms left join dslmon_skopia.tickets on alarms.ticketId=tickets.ticketId where objTime > '" + T2 + "' and objTime<='" + T1 + "'";
                    if (elementName != null && !elementName.isEmpty()) {
                        sql += " AND alertOrigin like '%" + elementName + "%'";
                    }
                    if (alarmType != null && !alarmType.equals("any")) {
                        sql += " AND alarmType ='" + alarmType + "'";
                    }
                    if (sr != null && !sr.isEmpty()) {
                        sql += " AND SR like '%" + sr + "%'";
                    }
                    sql += " AND linesAffected >" + affected;

                    String orderBy = " order by objTime desc;";
                    sql += orderBy;
                    //out.println("<p>sql=" + sql);
                    String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
                    DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
                    myDatabaseLogger.connect();
                    ResultSet res = myDatabaseLogger.getResults(sql);
                    //objTime, alertStop, alertOrigin, alertDesc, SERVING_AREA, ATC, DSLAM, SLOT, CABLE, DP, OLT, BOX, DESCRIPTION, REGION, linesDisconnected, linesRegistered, linesAffected,activeLinesAffected, affServiceID, markCustomersStatus, releaseCustomersStatus, 
                    //SR, incidentStartDate, incidentStoppedDate, incidentReportedDate        
                    while (res.next()) {
                        String[] row = new String[24];
                        try {
                            row[0] = new TimeStamp1(res.getString("objTime")).getNowFormated();
                        } catch (Exception e) {
                            row[0] = "";
                        }
                        try {
                            row[1] = new TimeStamp1(res.getString("alertStop")).getNowFormated();
                        } catch (Exception e) {
                            row[1] = "";
                        }
                        row[2] = res.getString("alertOrigin").replace(";", " - ");
                        row[3] = res.getString("DESCRIPTION");
                        row[4] = res.getString("SERVING_AREA");
                        row[5] = res.getString("ATC");
                        row[6] = res.getString("DSLAM");
                        row[7] = res.getString("SLOT");
                        row[8] = res.getString("CABLE");
                        row[9] = res.getString("DP");
                        row[10] = res.getString("OLT");
                        row[11] = res.getString("BOX");
                        row[12] = res.getString("REGION");
                        row[13] = res.getString("linesAffected");
                        row[14] = res.getString("activeLinesAffected");
                        row[15] = res.getString("affServiceID");
                        row[16] = res.getString("markCustomersStatus");
                        row[17] = res.getString("releaseCustomersStatus");
                        row[18] = res.getString("SR");
                        row[19] = res.getString("criticality");
                        try {
                            row[20] = new TimeStamp1(res.getString("incidentStartDate")).getNowFormated();
                        } catch (Exception e) {
                            row[20] = "";
                        }
                        try {
                            row[21] = new TimeStamp1(res.getString("incidentStoppedDate")).getNowFormated();
                        } catch (Exception e) {
                            row[21] = "";
                        }
                        try {
                            row[22] = new TimeStamp1(res.getString("incidentReportedDate")).getNowFormated();
                        } catch (Exception e) {
                            row[22] = "";
                        }
                        row[23] = res.getString("alarmType");
                        //=================================================================
                        rows.add(row);
                        //out.println("row=" + row);
                    }
                    //out.println("<p>finished");
                    if (myDatabaseLogger != null) {
                        myDatabaseLogger.close();
                    }
                    String[] header = "alarm Started,alarm Ended,alarm  Origin,alarm  Desc,area,ATC,DSLAM,SLOT,CABLE,DP,OLT,BOX, REGION, linesAffected,activeLinesAffected, affServiceID, markCustomersStatus, releaseCustomersStatus,SR,criticality, Ticket Start Date, Ticket end Date, Ticket Reporte dDate, alarm type".split(",");
                    toHTML(header, rows, out);
                } catch (Exception e) {
                    out.print(e.toString());
                    e.printStackTrace(System.out);
                }
            
      out.write("\r\n");
      out.write("            finished\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

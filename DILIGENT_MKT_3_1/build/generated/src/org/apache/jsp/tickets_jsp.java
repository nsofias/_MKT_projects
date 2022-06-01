package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.Ticket_FYROM;
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

public final class tickets_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    boolean isDyingGasp(Ticket_FYROM myTicket) {
        for (Alarm_FYROM myAlarm : myTicket.getElementsList()) {
            if (myAlarm.isDyingGasp()) {
                return true;
            }
        }
        return false;
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
      out.write("\r\n");
 String userTypes = "00,01,02,04";
      out.write('\r');
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

    ServletContext myContext = request.getServletContext();
    try {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    } catch (Exception e) {
    }
    //------------------------------
    String title = request.getParameter("title");
    if (title == null) {
        title = "";
    }
    String open_ticketId = request.getParameter("open");
    String remove_ticketId = request.getParameter("remove");
    String type = request.getParameter("type");
    String noheaders = request.getParameter("noheaders");
    String criticality_ = request.getParameter("criticality");
    String simpleView = request.getParameter("simpleView");
    String unhidden = request.getParameter("unhidden");//uncanceled
    String uncanceled = request.getParameter("uncanceled");
    String status = request.getParameter("status");
    String subType = request.getParameter("subType");
    String search = request.getParameter("search");
    int disconnected = -1;
    try {
        disconnected = Integer.parseInt(request.getParameter("disconnected"));
    } catch (Exception e) {
    }
    Map<String, String[]> parameters = request.getParameterMap();
    //--------------------------     
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    //-----------------------------------------------------------
    String _parameters = "";
    //parameters.remove("open");
    for (String key : parameters.keySet()) {
        //out.println("<p>"+key + "=" + parameters.get(key)[0]);
        if (!key.equals("open") && !key.equals("remove")) {
            _parameters += key + "=" + parameters.get(key)[0] + "&";
        }
    }
    //out.println("<p>_parameters=" + _parameters);
    //-----------------
    if (open_ticketId != null) {
        //out.println("open_ticketId = " + open_ticketId);
        //out.println("open_ticketId type = " + type);

        for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
            if (type == null || (type.equals(myGroupBy_Daemon.getDesc()))) {
                out.println("open_ticketId myGroupBy_Daemon.getDesc() = " + myGroupBy_Daemon.getDesc());
                try {
                    Map<String, Ticket_FYROM> list = myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList();
                    Ticket_FYROM myTicket = list.get(open_ticketId);
                    if (myTicket != null) {
                        //out.println("open_ticketId FPOUND!!!!!!!!!!!!!! ");
                        myTicket.setBUSY(false);
                        myTicket.setOpenImediately(true);
                    }
                } catch (Exception e) {
                    out.println("open_ticketId error for " + open_ticketId);
                }
            }
        }
    }
    //-----------------
    if (remove_ticketId != null) {
        //out.println("remove_ticketId = " + remove_ticketId);
        //out.println("remove_ticketId type = " + type);

        for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
            if (type == null || (type.equals(myGroupBy_Daemon.getDesc()))) {
                out.println("remove_ticketId myGroupBy_Daemon.getDesc() = " + myGroupBy_Daemon.getDesc());
                try {
                    Map<String, Ticket_FYROM> list = myGroupBy_Daemon.getMyStatsObjContainer().getTicketsArrayList();
                    list.remove(remove_ticketId);
                    out.println("remove_ticketId FPOUND!!!!!!!!!!!!!! ");
                } catch (Exception e) {
                    out.println("remove_ticketId error for " + remove_ticketId);
                }
            }
        }
    }

    //Container myCCMonitorStatsObjsContainer = null;    
    List<Ticket_FYROM> ticketsList = new ArrayList();
    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
        if (type == null || (type.equals(myGroupBy_Daemon.getDesc()))) {
            ticketsList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getTicketsAsArrayList());
        }
    }
    try {
        Collections.sort(ticketsList);
    } catch (Exception e) {
    }
    //out.println(ticketsList.size());
    //----------------------------------------
    //==========    

    if (status == null || status.isEmpty()) {
        status = "ALL";
    }
    if (subType == null || subType.isEmpty()) {
        subType = "ALL";
    }
    int criticality = 0;

    if (criticality_ == null || criticality_.isEmpty()) {
        criticality = 0;
    } else {
        criticality = Integer.parseInt(criticality_);
    }
    String criticality_S = "ALL";
    if (criticality == Ticket.CRITICALITY_WARNING) {
        criticality_S = "WARNING";
    } else if (criticality == Ticket.CRITICALITY_MINOR) {
        criticality_S = "MINOR";
    } else if (criticality == Ticket.CRITICALITY_MAJOR) {
        criticality_S = "MAJOR";
    } else if (criticality == Ticket.CRITICALITY_CRITICAL) {
        criticality_S = "CRITICAL";
    } else {
        criticality_S = "ALL";
    }
    if (search == null) {
        search = "";
    }
    //------------- for Data refresh ----------------
    Config myConfig = (Config) myContext.getAttribute("myConfig");
    double myFileParserDaemonTimeStamp_fromNow = 300;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Siebel Tickets</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("        <script  type=\"text/javascript\">\r\n");
      out.write("            var max_timePage = 120;\r\n");
      out.write("            var max_timeData = ");
      out.print(myFileParserDaemonTimeStamp_fromNow);
      out.write(";\r\n");
      out.write("            if (max_timeData < 0) {\r\n");
      out.write("                max_timeData = 120;\r\n");
      out.write("            }\r\n");
      out.write("            var cinterval;\r\n");
      out.write("\r\n");
      out.write("            function countdown_timer() {\r\n");
      out.write("                max_timePage--;\r\n");
      out.write("                max_timeData--;\r\n");
      out.write("                document.getElementById('countdownPage').innerHTML = max_timePage;\r\n");
      out.write("                if (max_timeData < 0)\r\n");
      out.write("                {\r\n");
      out.write("                    document.getElementById('countdownData').innerHTML = \"READY\";\r\n");
      out.write("                    window.location.reload(true);\r\n");
      out.write("                } else\r\n");
      out.write("                {\r\n");
      out.write("                    document.getElementById('countdownData').innerHTML = max_timeData;\r\n");
      out.write("                }\r\n");
      out.write("                //\r\n");
      out.write("                if (max_timePage === 0) {\r\n");
      out.write("                    clearInterval(cinterval);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            // 1,000 means 1 second.\r\n");
      out.write("            cinterval = setInterval('countdown_timer()', 1000);\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function openAlert(ticketId) {\r\n");
      out.write("                var myAlertWindow = window.open(\"alarms.jsp?type=");
      out.print(type);
      out.write("&ticketId=\" + ticketId, \"myWindow\",\r\n");
      out.write("                        \"status = 1, left=0, top=0, height = 300, width = 800, resizable = 0\");\r\n");
      out.write("                myAlertWindow.focus;\r\n");
      out.write("            }\r\n");
      out.write("            function openMap(SR) {\r\n");
      out.write("                var myAlertWindow = window.open(\"map.jsp?SR=\" + SR, \"myWindow\",\r\n");
      out.write("                        \"status = 1, left=0, top=0, height = 650, width = 650, resizable = 0\");\r\n");
      out.write("                myAlertWindow.focus;\r\n");
      out.write("            }\r\n");
      out.write("            function openEventsLog(SR) {\r\n");
      out.write("                var myAlertWindow = window.open(\"events.jsp?SR=\" + SR, \"myWindow\",\r\n");
      out.write("                        \"status = 1, left=0, top=0, height = 400, width = 500, resizable = 0\");\r\n");
      out.write("                myAlertWindow.focus;\r\n");
      out.write("            }\r\n");
      out.write("        </script>         \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body  bgcolor=\"#D6DFF7\">\r\n");
      out.write("        ");

            //  ----------- END OF SEQURITY CHECK ---------------    
            if (simpleView == null)//not simpleView
            {
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table border=\"0\" width=\"100%\"   id=\"table1\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td nowrap width=\"10%\" bgcolor=\"grey\"><font color=\"white\">Logged in as:");
      out.print(username);
      out.write("</font></td>    \r\n");
      out.write("                <td nowrap width=\"40%\" bgcolor=\"grey\"><font color=\"white\">Page refresh: <span id=\"countdownPage\">0</span>s</font></td>                \r\n");
      out.write("                <td nowrap width=\"40%\" bgcolor=\"grey\"><font color=\"white\">Data refresh: <span id=\"countdownData\">0</span>s</font></td>                \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1>");
      out.print(title);
      out.write("</h1>\r\n");
      out.write("        ");
if (noheaders == null) {
      out.write("\r\n");
      out.write("        <p><form name=\"critucalityform\" action=\"tickets.jsp\">\r\n");
      out.write("            Recent Tickets &nbsp;                 \r\n");
      out.write("\r\n");
      out.write("            Criticality:<select  onchange=\"this.form.submit()\" name=\"criticality\"> \r\n");
      out.write("                <option value=\"");
      out.print(criticality);
      out.write('"');
      out.write('>');
      out.print(criticality_S);
      out.write("</option>\r\n");
      out.write("                <option  value=\"1\">WARNING</option>\r\n");
      out.write("                <option  value=\"2\">MINOR</option>\r\n");
      out.write("                <option value=\"3\">MAJOR</option> \r\n");
      out.write("                <option value=\"4\">CRITICAL</option>\r\n");
      out.write("                <option value=\"0\">ALL</option>\r\n");
      out.write("            </select> \r\n");
      out.write("            Status:\r\n");
      out.write("            <select  onchange=\"this.form.submit()\" name=\"status\"> \r\n");
      out.write("                <option value=\"");
      out.print(status);
      out.write('"');
      out.write('>');
      out.print(status);
      out.write("</option>\r\n");
      out.write("                <option value=\"OPEN\">Open</option>\r\n");
      out.write("                <option value=\"ALL\">All</option>\r\n");
      out.write("            </select> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            subType:\r\n");
      out.write("            <select  onchange=\"this.form.submit()\" name=\"subType\">                                 \r\n");
      out.write("                <option value=\"");
      out.print(subType);
      out.write('"');
      out.write('>');
      out.print(subType);
      out.write("</option>\r\n");
      out.write("                ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER)) {
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SERVING_AREA);
      out.write("\">SERVING_AREA</option>\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_ATC);
      out.write("\">ATC</option>\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_DSLAM);
      out.write("\">DSLAM</option>\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SLOT);
      out.write("\">SLOT</option>\r\n");
      out.write("                <option value=\"ALL\">ALL</option>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("                ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE)) {
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_ATC);
      out.write("\">ATC</option>\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_CABLE);
      out.write("\">CABLE</option>\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_DP);
      out.write("\">DP</option>\r\n");
      out.write("                <option value=\"ALL\">ALL</option>\r\n");
      out.write("                ");
}
      out.write("      \r\n");
      out.write("                ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON)) {
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_OLT);
      out.write("\">OLT</option>\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SHELF);
      out.write("\">SHELF</option>\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SLOT);
      out.write("\">SLOT</option>\r\n");
      out.write("                <option value=\"ALL\">ALL</option>\r\n");
      out.write("\r\n");
      out.write("                ");
}
      out.write("  \r\n");
      out.write("                ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE)) {
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_CABLE_ATC);
      out.write("\">ATC</option>        \r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_CABLE);
      out.write("\">CABLE</option>\r\n");
      out.write("                <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_BOX);
      out.write("\">BOX</option>\r\n");
      out.write("                <option value=\"ALL\">ALL</option>\r\n");
      out.write("                ");
}
      out.write("                     \r\n");
      out.write("            </select>                \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;type ticketId or SR and press ENTER:<input type=\"text\" name=\"search\" onchange=\"this.form.submit()\"  value=\"");
      out.print(search);
      out.write("\" size=\"25\" />\r\n");
      out.write("            ");
if (unhidden == null) {
      out.write("\r\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hide 'pending'? :<input type=\"checkbox\" onchange=\"this.form.submit()\" name=\"unhidden\" value=\"ON\" />\r\n");
      out.write("            ");
} else {
      out.write("\r\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;Hide 'pending'? :<input type=\"checkbox\" onchange=\"this.form.submit()\" name=\"unhidden\" value=\"ON\" checked=\"checked\"/>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            ");
if (uncanceled == null) {
      out.write("\r\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hide 'canceled'? :<input type=\"checkbox\" onchange=\"this.form.submit()\" name=\"uncanceled\" value=\"ON\" />\r\n");
      out.write("            ");
} else {
      out.write("\r\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;Hide 'canceled'? :<input type=\"checkbox\" onchange=\"this.form.submit()\" name=\"uncanceled\" value=\"ON\" checked=\"checked\"/>\r\n");
      out.write("            ");
}
      out.write("    \r\n");
      out.write("            <input type=\"hidden\" name=\"title\" value=\"");
      out.print(title);
      out.write("\" />\r\n");
      out.write("            <input type=\"hidden\" name=\"type\" value=\"");
      out.print(type);
      out.write("\" />\r\n");
      out.write("            <input type=\"hidden\" name=\"subType\" value=\"");
      out.print(subType);
      out.write("\" />\r\n");
      out.write("            <input type=\"hidden\" name=\"disconnected\" value=\"");
      out.print(disconnected);
      out.write("\" />\r\n");
      out.write("            <input type=\"hidden\" name=\"status\" value=\"");
      out.print(status);
      out.write("\" />\r\n");
      out.write("            <input type=\"hidden\" name=\"criticality\" value=\"");
      out.print(criticality_);
      out.write("\" />        \r\n");
      out.write("        </form>   \r\n");
      out.write("        <p><a href=\"alarms.jsp?type=");
      out.print(type);
      out.write("\">go to Alarms</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"map.jsp?status=OPEN\"><IMG src = \"img/fyrom.jpg\"/></a></p>\r\n");
      out.write("                ");
}       
      out.write("        \r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("        <table  border='1'>\r\n");
      out.write("\r\n");
      out.write("            <tr>     \r\n");
      out.write("                <th>map</th>\r\n");
      out.write("                <th>R</th>\r\n");
      out.write("                <th>Description</th>\r\n");
      out.write("                <th>Element type</th>\r\n");
      out.write("                <th>Number of elements</th>                  \r\n");
      out.write("                <th>Started</th>\r\n");
      out.write("                <th>Reported</th>\r\n");
      out.write("                <th>Stopped/Last update</th>                     \r\n");
      out.write("                <th>Status</th>\r\n");
      out.write("                <th>Comments</th>\r\n");
      out.write("                <th>disconnected / last update</th>\r\n");
      out.write("                <th>Registered lines</th>                \r\n");
      out.write("                <th>Criticality</th>\r\n");
      out.write("                <th>TicketId</th>\r\n");
      out.write("                <th>action</th>\r\n");
      out.write("                    ");
if (userType.equals("00")) {
      out.write("                    \r\n");
      out.write("                <th>-</th>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("            </tr>            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");

                //TimeStamp1 myT1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());

//                Counters topScorers = myCCMonitorStatsObjsContainer.getTopScorers_events(T1, T2);
                int count = 0;
                for (Object myAlarmObj : ticketsList) {
                    Ticket_FYROM myTicket = (Ticket_FYROM) myAlarmObj;
                    if (myTicket.getElementsList().size() == 0) {
                        //continue;
                    }
                    if (unhidden != null && myTicket.getState().equals(Ticket_FYROM.STATE_PENDING_TO_OPEN)) {
                        continue;
                    }
                    if (uncanceled != null && myTicket.getState().equals(Ticket_FYROM.STATE_CANCELED)) {
                        continue;
                    }
                    if (criticality != 0 && myTicket.getCriticality() < criticality) {
                        continue;
                    }
                    if (disconnected != 0 && myTicket.findLinesDisconnected() < disconnected) {
                        continue;
                    }
                    if (!subType.equals("ALL") && !subType.equals(myTicket.getSubType())) {
                        continue;
                    }
                    if (status.equals("OPEN") && !myTicket.isOpen()) {
                        continue;
                    }
                    try {
                        if (search != null && !search.isEmpty()) {
                            if (!myTicket.getSYNOPSIS().contains(search) && !myTicket.getTicketId().contains(search) && (myTicket.getSR() == null || !myTicket.getSR().equals(search))) {
                                continue;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Tickets.jsp error for:" + myTicket.getCollerationString());
                        continue;
                    }
                    String AlertStart = "", AlertReported = "", AlertStop = "";
                    try {
                        AlertStart = new TimeStamp1(myTicket.getIncidentStartDate()).getNowFormated().substring(0, 16);
                    } catch (Exception e) {
                    }
                    try {
                        AlertReported = new TimeStamp1(myTicket.getIncidentReportedDate()).getNowFormated().substring(0, 16);
                    } catch (Exception e) {
                    }
                    try {
                        AlertStop = new TimeStamp1(myTicket.getIncidentStoppedDate()).getNowFormated().substring(0, 16);
                    } catch (Exception e) {
                    }

                    String ticketId = myTicket.getTicketId();
                    long usersDisconnected = myTicket.findLinesDisconnected();
                    long currentUsersDisconnected = myTicket.getCurrentUsersDisconnected();
                    String color = "blue";
                    String desc = myTicket.getSYNOPSIS();//getDesc_html(myTicket);
                    int pos;
                    if ((pos = desc.indexOf(":")) > 0) {
                        desc = desc.substring(pos + 1);
                    }
                    String myStatus = "";
                    if (myTicket.isOpen()) {
                        myStatus = "<font color='green'><b>" + myTicket.getState() + "</b></font>";
                    } else if (myTicket.getState().equals(Ticket_FYROM.STATE_OPEN_FAILED) || myTicket.getState().equals(Ticket_FYROM.STATE_CLOSE_FAILED)) {
                        myStatus = "<font color='red'>" + myTicket.getState() + "</font>";
                    } else {
                        myStatus = "<font color='grey'>" + myTicket.getState() + "</font>";
                    }
                    String myComments = myTicket.getComments();
                    //---------------
                    int numberOfElements = myTicket.getElementsList().size();
                    String tType = myTicket.getType().replace("TYPE_", "");
                    if (++count > 1250) {
                        break;
                    }
                    String sr = "N/A";
                    if (myTicket.getSR() != null) {
                        sr = myTicket.getSR();
                    }
                    //-------------------------------------------------------------------------------------
                    if (myTicket.isStillAlive()) {
                        String encParms = _parameters + "open=" + URLEncoder.encode(ticketId, "UTF-8");
                        String encParms1 = _parameters + "remove=" + URLEncoder.encode(ticketId, "UTF-8");
            
      out.write(" \r\n");
      out.write("            <tr>             \r\n");
      out.write("                <td nowrap><a onclick=\"openMap('");
      out.print(ticketId);
      out.write("')\"><IMG src = \"img/fyrom.jpg\"/></a></td>\r\n");
      out.write("                        ");

                            if (myTicket.isRepeated()) {
      out.write("\r\n");
      out.write("                <td nowrap>R</td>\r\n");
      out.write("                ");
 } else {
      out.write("\r\n");
      out.write("                <td nowrap></td>\r\n");
      out.write("                ");
 }
      out.write("                                                   \r\n");
      out.write("                <td style=\"width:100px\">");
      out.print(desc);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myTicket.getSubType());
      out.write("</td> \r\n");
      out.write("                <td nowrap><a href=\"alarms.jsp?type=");
      out.print(type);
      out.write("&ticketId=");
      out.print(URLEncoder.encode(ticketId, "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(numberOfElements);
      out.write("</a></td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertStart);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertReported);
      out.write("</td>\r\n");
      out.write("                <td nowrap></td>\r\n");
      out.write("                <td nowrap><a onclick=\"openEventsLog('");
      out.print(ticketId);
      out.write("')\"><font color='");
      out.print(color);
      out.write('\'');
      out.write('>');
      out.print(myStatus);
      out.write("</font></a></td> \r\n");
      out.write("                <td nowrap>");
      out.print(myComments);
      out.write("</td>                \r\n");
      out.write("                <td nowrap align=\"center\">");
      out.print(usersDisconnected);
      out.write("/<font color=\"red\">");
      out.print(currentUsersDisconnected);
      out.write("</font></td>                                  \r\n");
      out.write("                <td nowrap><a href=\"linesRegistered.jsp?type=");
      out.print(type);
      out.write("&ticketId=");
      out.print(URLEncoder.encode(ticketId, "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(myTicket.getCurrentUsersRegistered());
      out.write("</a></td>                                                                                \r\n");
      out.write("                <td nowrap>");
      out.print(myTicket.getCriticalityDesc(myTicket.getCriticality()));
      out.write("</td>  \r\n");
      out.write("                <td nowrap><a href=\"correlation_info.jsp?sr=");
      out.print(URLEncoder.encode(sr, "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(sr);
      out.write("</a>\r\n");
      out.write("                    ");
if (isDyingGasp(myTicket)) {
      out.write("\r\n");
      out.write("                    <img src=\"img/power.jpg\" width=\"15\" height=\"15\" alt=\" P \"/>\r\n");
      out.write("                    ");
}
      out.write("                 \r\n");
      out.write("                </td>                  \r\n");
      out.write("                ");

                    if (myTicket.getState().equals(Ticket_FYROM.STATE_PENDING_TO_OPEN) || myTicket.getState().equals(Ticket_FYROM.STATE_OPEN_FAILED)) {
                
      out.write("\r\n");
      out.write("                <td><a href=\"tickets.jsp?");
      out.print(encParms);
      out.write("\"><IMG src = \"img/open.jpg\"/></a></td>\r\n");
      out.write("                        ");

                        } else {
      out.write("\r\n");
      out.write("                <td></td>\r\n");
      out.write("                ");
          }
                    if (userType.equals("00")) {
      out.write("\r\n");
      out.write("                <td><a href=\"tickets.jsp?");
      out.print(encParms1);
      out.write("\">remove</a></td>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </tr> \r\n");
      out.write("            ");
              } else {
                String encParms1 = _parameters + "remove=" + URLEncoder.encode(ticketId, "UTF-8");
            
      out.write("\r\n");
      out.write("            <tr bgcolor='#E5E4E2'>             \r\n");
      out.write("                <td nowrap><a onclick=\"openMap('");
      out.print(ticketId);
      out.write("')\"><IMG src = \"img/fyrom.jpg\"/></a></td>\r\n");
      out.write("                        ");

                            if (myTicket.isRepeated()) {
      out.write("\r\n");
      out.write("                <td nowrap>R</td>\r\n");
      out.write("                ");
 } else {
      out.write("\r\n");
      out.write("                <td nowrap></td>\r\n");
      out.write("                ");
 }
      out.write("                  \r\n");
      out.write("                <td style=\"width:100px\">");
      out.print(desc);
      out.write("</td>                \r\n");
      out.write("                <td nowrap>");
      out.print(myTicket.getSubType());
      out.write("</td>    \r\n");
      out.write("                <td nowrap><a href=\"alarms.jsp?type=");
      out.print(type);
      out.write("&ticketId=");
      out.print(URLEncoder.encode(ticketId, "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(numberOfElements);
      out.write("</a></td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertStart);
      out.write("</td>                \r\n");
      out.write("                <td nowrap>");
      out.print(AlertReported);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertStop);
      out.write("</td>\r\n");
      out.write("                <td nowrap><a onclick=\"openEventsLog('");
      out.print(ticketId);
      out.write("')\"><font color='");
      out.print(color);
      out.write('\'');
      out.write('>');
      out.print(myStatus);
      out.write("</font></a></td>\r\n");
      out.write("                <td nowrap>");
      out.print(myComments);
      out.write("</td>      \r\n");
      out.write("                <td nowrap align=\"center\">");
      out.print(usersDisconnected);
      out.write("/<font color=\"red\">");
      out.print(currentUsersDisconnected);
      out.write("</font></td>  \r\n");
      out.write("                <td nowrap><a href=\"linesRegistered.jsp?type=");
      out.print(type);
      out.write("&ticketId=");
      out.print(URLEncoder.encode(ticketId, "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(myTicket.getCurrentUsersRegistered());
      out.write("</a></td>    \r\n");
      out.write("                <td nowrap>");
      out.print(myTicket.getCriticalityDesc(myTicket.getCriticality()));
      out.write("</td>    \r\n");
      out.write("                <td nowrap><a href=\"correlation_info.jsp?sr=");
      out.print(URLEncoder.encode(sr, "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(sr);
      out.write("</a>\r\n");
      out.write("                    ");
if (isDyingGasp(myTicket)) {
      out.write("\r\n");
      out.write("                    <img src=\"img/power.jpg\" width=\"15\" height=\"15\" alt=\" P \"/>\r\n");
      out.write("                    ");
}
      out.write("                   \r\n");
      out.write("                </td>                    \r\n");
      out.write("\r\n");
      out.write("                ");
      if (userType.equals("00")) {
      out.write("                                 \r\n");
      out.write("                <td><a href=\"tickets.jsp?");
      out.print(encParms1);
      out.write("\">remove</a></td>\r\n");
      out.write("                ");
    } 
      out.write("     \r\n");
      out.write("\r\n");
      out.write("            </tr> \r\n");
      out.write("            ");
                  }
                }
            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

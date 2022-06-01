package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.Ticket_FYROM;
import java.net.URLEncoder;
import nsofiasLib.ote.alarms.*;
import java.util.Map;
import nsofiasLib.utils.URLContextReader_object;
import nsofiasLib.ote.DSLAMs.DslamDetailsFinder;
import nsofiasLib.ote.DSLAMs.DslamDetails;
import java.util.Collections;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class alarms_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    String criticality_desc(int criticality)
        {
        if (criticality == 1)
            {
            return "WARNING";
            }
        else if (criticality == 2)
            {
            return "MINOR";
            }
        else if (criticality == 3)
            {
            return "MAJOR";
            }
        else if (criticality == 4)
            {
            return "CRITICAL";
            }
        else if (criticality == 5)
            {
            return "TOP CRITICAL";
            }
        return "WARNING";
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Alarms</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("        <script  type=\"text/javascript\">\r\n");
      out.write("            var max_timePage = 120;\r\n");
      out.write("            var max_timeData = 120;\r\n");
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
      out.write("    </head>\r\n");
      out.write("    <body  bgcolor=\"#D6DFF7\">  \r\n");
      out.write("\r\n");
      out.write("        ");

            ServletContext myContext = request.getServletContext();
            try
                {
                Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
                myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
                }
            catch (Exception e)
                {
                }
            //------------------------------status,type,subType,criticality,source-----------------
            String title = request.getParameter("title");
            if (title == null)
                {
                title = "";
                }
            String status = request.getParameter("status");
            if (status == null || status.isEmpty())
                {
                status = "ALL";
                }
            String type = request.getParameter("type");
            if (type == null || type.isEmpty())
                {
                type = "ALL";
                }
            String subType = request.getParameter("subType");
            if (subType == null || subType.isEmpty())
                {
                subType = "ALL";
                }
            int criticality = 0;
            try
                {
                criticality = Integer.valueOf(request.getParameter("criticality"));
                }
            catch (Exception e)
                {
                criticality = 0;
                }
            String source = request.getParameter("source");
            if (source == null || source.isEmpty())
                {
                source = "";
                }
            //---------------------------------------------------------
            String ticketId = request.getParameter("ticketId");
            if (ticketId != null)
                {
                ticketId = new String(request.getParameter("ticketId").getBytes("iso-8859-1"), "UTF-8");
                out.println("alarms with ticketId:" + ticketId);
                }

            Diligent_Daemon myGroupBy_Daemon = null;
            ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
            for (Diligent_Daemon myDaemon : myGroupBy_Daemons)
                {                    
                if (type != null && (type.equals(myDaemon.getDaemonName())))
                    {                    
                    myGroupBy_Daemon = myDaemon;
                    //out.println(alarmArrayList.size());
                    }
                }
            if (myGroupBy_Daemon == null)
                {
                out.println("<p><h1>  Please use the left side menu to continue...</h1>");
                return;
                }
            //---------------------------
            List alarmArrayList = new ArrayList();
            if (ticketId != null)
                {
                Container myContainer = myGroupBy_Daemon.getMyStatsObjContainer();
                Map<String, Ticket_FYROM> tickets = myContainer.getTicketsArrayList();                
                if (tickets.get(ticketId) == null)
                    {
                    for (String key : tickets.keySet())
                        {
                        out.println("<p>'" + key + "'");
                        }
                    out.println("<p>'" + ticketId + "'");
                    return;
                    }
                List myList = tickets.get(ticketId).getElementsList();
                alarmArrayList.addAll(myList);
                }
            else
                {
                alarmArrayList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getAlarmArrayList());
                System.out.println("sss "+type+"   alarmArrayList size:"+alarmArrayList.size());
                }
            try
                {
                Collections.sort(alarmArrayList);
                }
            catch (Exception e)
                {
                }
            //------------- for Data refresh ----------------
            Config myConfig = (Config) myContext.getAttribute("myConfig");
            String killAll = request.getParameter("killAll");
            if (killAll != null)
                {
                for (Object myAlarmObj : alarmArrayList)
                    {
                    nsofiasLib.ote.alarms.Alarm myAlarm = (nsofiasLib.ote.alarms.Alarm) myAlarmObj;
                    if (myAlarm.isStilAlive())
                        {
                        myAlarm.setState(nsofiasLib.ote.alarms.Alarm.STATE_CLOSED);
                        }
                    }
                }
            String kill = request.getParameter("kill");
            if (kill != null)
                {
                for (Object myAlarmObj : alarmArrayList)
                    {
                    Alarm_FYROM myAlarm = (Alarm_FYROM) myAlarmObj;
                    if (myAlarm.getNetworkElementName() == null || (myAlarm.isStilAlive() && myAlarm.getNetworkElementName().equals(kill)))
                        {
                        myAlarm.setState(Alarm_FYROM.STATE_PENDING_TO_CLOSE);
                        //              alarmArrayList.remove(myAlarm);
                        break;
                        }
                    }
                }

            //---------------------------------------------------------- 
            TimeStamp1 t1, t2;
            try
                {
                if (request.getParameter("from") != null)
                    {
                    t1 = new TimeStamp1(request.getParameter("from"));
                    }
                else
                    {
                    t1 = new TimeStamp1();
                    }
                }
            catch (Exception e)
                {
                out.println("NO CLOCK YET!!!!!!!!");
                return;
                }
            t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addHours(-24);
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
  if (ticketId == null)
                {
      out.write("\r\n");
      out.write("        <table border=\"0\" width=\"100%\"   id=\"table1\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td nowrap width=\"10%\" bgcolor=\"grey\"><font color=\"white\">Logged in as:");
      out.print(username);
      out.write("</font></td>    \r\n");
      out.write("                <td nowrap width=\"40%\" bgcolor=\"grey\"><font color=\"white\">Page refresh: <span id=\"countdownPage\">0</span>s</font></td>                \r\n");
      out.write("                <td nowrap width=\"40%\" bgcolor=\"grey\"><font color=\"white\">Data refresh: <span id=\"countdownData\">0</span>s</font></td>                \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>      \r\n");
      out.write("        <h1>");
      out.print(title);
      out.write("</h1>\r\n");
      out.write("        <p><form name=\"critucalityform\" action=\"alarms.jsp?type=");
      out.print(type);
      out.write("\">\r\n");
      out.write("            Status:\r\n");
      out.write("            <select  onchange=\"this.form.submit()\" name=\"status\">                                 \r\n");
      out.write("                <option value=\"");
      out.print(status);
      out.write('"');
      out.write('>');
      out.print(status);
      out.write("</option>\r\n");
      out.write("                <option value=\"alive\">alive</option>\r\n");
      out.write("                <option value=\"ALL\">ALL</option>\r\n");
      out.write("            </select>  \r\n");
      out.write("            subType:\r\n");
      out.write("            <select  onchange=\"this.form.submit()\" name=\"subType\">                                 \r\n");
      out.write("                <option value=\"");
      out.print(subType);
      out.write('"');
      out.write('>');
      out.print(subType);
      out.write("</option>\r\n");
      out.write("                ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER))
                        {
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
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE))
                        {
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
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON))
                        {
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
      out.write("                ");
}
      out.write("  \r\n");
      out.write("                ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE))
                        {
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
      out.write("            </select>\r\n");
      out.write("            criticality >=:\r\n");
      out.write("            <select  onchange=\"this.form.submit()\" name=\"criticality\">                                 \r\n");
      out.write("                <option value=\"");
      out.print(criticality);
      out.write('"');
      out.write('>');
      out.print(criticality_desc(criticality));
      out.write("</option>\r\n");
      out.write("                <option value=\"1\">WARNING</option>\r\n");
      out.write("                <option value=\"2\">MINOR</option>\r\n");
      out.write("                <option value=\"3\">MAJOR</option>\r\n");
      out.write("                <option value=\"4\">CRITICAL</option>\r\n");
      out.write("                <option value=\"5\">TOP CRITICAL</option>\r\n");
      out.write("            </select>                  \r\n");
      out.write("            <input type=\"text\" name=\"source\" value=\"");
      out.print(source);
      out.write("\" />\r\n");
      out.write("            <input type=\"hidden\" name=\"type\" value=\"");
      out.print(type);
      out.write("\" />\r\n");
      out.write("            <input type=\"hidden\" name=\"subType\" value=\"");
      out.print(subType);
      out.write("\" />\r\n");
      out.write("            <input type=\"hidden\" name=\"criticality\" value=\"");
      out.print(criticality);
      out.write("\" />\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        ");

                }
            //------------------------------------
            String elType = "";
            if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER))
                {
                elType = "Host : RSU : DSLAM : slot";
                }
            else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE))
                {
                elType = "RSU : Cable : DP";
                }
            else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON))
                {
                elType = "OLT : Shelf : Slot";
                }
            else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE))
                {
                elType = "ATC : Cable : BOX";
                }
        
      out.write("                        \r\n");
      out.write("        <!-- \r\n");
      out.write("                <table  border='1'>                             \r\n");
      out.write("                    <tr><IMG width='100%' src='AlarmsServletGantt?from=");
      out.print(t1.getNowUnformated());
      out.write("&to=");
      out.print(t2.getNowUnformated());
      out.write("'></tr>            \r\n");
      out.write("                </table>\r\n");
      out.write("        -->\r\n");
      out.write("        <table  border='1' width='100%'>\r\n");
      out.write("            <tr bgcolor=\"LightBlue\">\r\n");
      out.write("                <th></th>\r\n");
      out.write("                <th>");
      out.print(elType);
      out.write("</th>\r\n");
      out.write("                <th>Element sub Type</th>\r\n");
      out.write("                <th>Start</th>                \r\n");
      out.write("                <th>Stop</th>            \r\n");
      out.write("                <th>Status</th> \r\n");
      out.write("                <th>Disconnected lines (last cycle)</th> \r\n");
      out.write("                <th>Registered lines</th> \r\n");
      out.write("                <th>Affected elements</th> \r\n");
      out.write("                <th>Ticket-ID</th>  \r\n");
      out.write("                <th>affected Service ID</th>\r\n");
      out.write("                <th>mark Customers affected Status</th>\r\n");
      out.write("                <th>release Customers affected Status</th>\r\n");
      out.write("                <th>reason</th>\r\n");
      out.write("                <th>B.Board</th>\r\n");
      out.write("                <th>Oppening profile</th>\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            ");
int count = 0;
                for (Object myAlarmObj : alarmArrayList)
                    {
                    try
                        {
                        if (++count > 1250)
                            {
                            break;
                            }
                        Alarm_FYROM myAlarm = (Alarm_FYROM) myAlarmObj;
                        //---------------- set filters (status,type,subType,criticality,source) --------------------
                        if (status.contains("alive") && !myAlarm.isStilAlive())
                            {
                            continue;
                            }
                        if (!type.equals("ALL") && !type.equals(myAlarm.getAlarmType()))
                            {
                            continue;
                            }
                        if (!subType.equals("ALL") && !subType.equals(myAlarm.getAlarmSubType()))
                            {
                            continue;
                            }
                        if (myAlarm.getCriticality() < criticality)
                            {
                            continue;
                            }
                        if (!source.equals("") && myAlarm.getNetworkElementName() != null && !myAlarm.getNetworkElementName().contains(source))
                            {
                            continue;
                            }
                        /*
                        if (ticketId != null && (myAlarm.getTicketId().isEmpty() || !myAlarm.getTicketId().equals(ticketId)))
                            {
                            continue;
                            }*/
                        String AlertOrigin = "-";
                        try
                            {
                            AlertOrigin = myAlarm.getNetworkElementName();
                            }
                        catch (Exception e)
                            {
                            myAlarm.setAlarmObject("-");
                            }
                        AlertOrigin = AlertOrigin.replaceAll(";", " : ");
                        TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlarmStart());
                        TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlarmStop());
                        TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlarmStart());
                        T0.addSeconds(-7400);
                        String AlertStart = T1.getNowFormated();
                        String AlertStop = T2.getNowFormated();
                        String AlertTypeS = myAlarm.getAlarmType();
                        String color = "#E5E4E2";
                        String desc = myAlarm.getDesc();
                        String sr = myAlarm.getTicketSR();
                        if (sr == null)
                            {
                            sr = "";
                            }
                        String myObjType = myAlarm.getAlarmType();
                        String elementType = myAlarm.getAlarmSubType();
                        //
                        String usersAffected = "N/A";
                        if (myAlarm.getActiveLinesAffected() > 0)
                            {
                            usersAffected = String.valueOf(myAlarm.getActiveLinesAffected());
                            }
                        if (myAlarm.isStilAlive())
                            {                            
            
      out.write("                            \r\n");
      out.write("            <tr>  \r\n");
      out.write("                ");

                    if (myAlarm.isRepeated())
                        {
      out.write("\r\n");
      out.write("                <td nowrap>R</td>\r\n");
      out.write("                ");
 }
                else
                    {
      out.write("\r\n");
      out.write("                <td nowrap></td>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("                <td nowrap><a href='HistoryServlet?type=");
      out.print(AlertTypeS);
      out.write("&resource=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("'  target=\"_blank\">");
      out.print(AlertOrigin);
      out.write("</a></td>\r\n");
      out.write("                <td nowrap>");
      out.print(elementType);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertStart.substring(0, 16));
      out.write("</td>\r\n");
      out.write("                <td nowrap></td>                                                          \r\n");
      out.write("                <td><b>alive!</b></td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getLinesDisconnected());
      out.write("</td>\r\n");
      out.write("                <td nowrap><a href=\"linesRegistered.jsp?type=");
      out.print(type);
      out.write("&path=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(myAlarm.getLinesRegistered());
      out.write("</a></td>\r\n");
      out.write("                <td nowrap><a href=\"pathsAffected.jsp?type=");
      out.print(type);
      out.write("&path=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("\" target=\"_blank\">Affected Sub-Paths</a></td>                \r\n");
      out.write("                <td nowrap>");
      out.print(sr);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAffServiceID());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getMarkCustomersStatus());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getReleaseCustomersStatus());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAlarmReason());
      out.write("\r\n");
      out.write("                ");
if (myAlarm.isDyingGasp())
                    {
      out.write("\r\n");
      out.write("                    <img src=\"img/power.jpg\" width=\"15\" height=\"15\" alt=\" P \"/>\r\n");
      out.write("                   ");
}
      out.write(" \r\n");
      out.write("                </td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getMyBulletinid());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAlarmOpenningProfile().toString());
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <a href=\"alarms.jsp?type=");
      out.print(type);
      out.write("&status=");
      out.print(status);
      out.write("&kill=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("\"><img src=\"img/delete.png\" width=\"20\" height=\"15\" alt=\"delete\"/></a>                    \r\n");
      out.write("                </td>\r\n");
      out.write("            </tr> \r\n");
      out.write("            ");
                    }
            else
                {
            
      out.write("\r\n");
      out.write("            <tr bgcolor=\"");
      out.print(color);
      out.write("\">\r\n");
      out.write("                ");

                    if (myAlarm.isRepeated())
                        {
      out.write("\r\n");
      out.write("                <td nowrap>R</td>\r\n");
      out.write("                ");
 }
                else
                    {
      out.write("\r\n");
      out.write("                <td nowrap></td>\r\n");
      out.write("                ");
 }
      out.write("                                \r\n");
      out.write("                <td nowrap><a href='HistoryServlet?type=");
      out.print(AlertTypeS);
      out.write("&resource=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("'  target=\"_blank\">");
      out.print(AlertOrigin);
      out.write("</a></td>                \r\n");
      out.write("                <td nowrap>");
      out.print(elementType);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertStart.substring(0, 16));
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(AlertStop.substring(0, 16));
      out.write("</td>                          \r\n");
      out.write("                <td>old</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getLinesDisconnected());
      out.write("</td>\r\n");
      out.write("                <td nowrap><a href=\"linesRegistered.jsp?type=");
      out.print(type);
      out.write("&path=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(myAlarm.getLinesRegistered());
      out.write("</a></td>\r\n");
      out.write("                <td nowrap><a href=\"pathsAffected.jsp?type=");
      out.print(type);
      out.write("&path=");
      out.print(URLEncoder.encode(myAlarm.getNetworkElementName(), "UTF-8"));
      out.write("\">Affected Sub-Paths</a></td>  \r\n");
      out.write("                <td nowrap>");
      out.print(sr);
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAffServiceID());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getMarkCustomersStatus());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getReleaseCustomersStatus());
      out.write("</td>    \r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAlarmReason());
      out.write("\r\n");
      out.write("                ");
if (myAlarm.isDyingGasp())
                    {
      out.write("\r\n");
      out.write("                    <img src=\"img/power.jpg\" width=\"15\" height=\"15\" alt=\" P \"/>\r\n");
      out.write("                   ");
}
      out.write(" \r\n");
      out.write("                </td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getMyBulletinid());
      out.write("</td>\r\n");
      out.write("                <td nowrap>");
      out.print(myAlarm.getAlarmOpenningProfile().toString());
      out.write("</td>\r\n");
      out.write("            </tr> \r\n");
      out.write("            ");
                  }
                        }
                    catch (Exception e)
                        {
                        }
                    }
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");
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

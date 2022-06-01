package org.apache.jsp.MKT;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.google.gson.Gson;
import ccm.MKT.Ticket_MKT;
import java.util.stream.Collectors;
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

public final class tickets_005fMKT_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/MKT/../sequrityPart.jsp");
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
      out.write('\n');

    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
    String type = request.getParameter("type");
    String noheaders = request.getParameter("noheaders");
    String criticality_ = request.getParameter("criticality");
    String simpleView = request.getParameter("simpleView");
    String unhidden = request.getParameter("unhidden");//uncanceled
    String uncanceled = request.getParameter("uncanceled");
    String status = request.getParameter("status");
    String subType = request.getParameter("subType");
    String search = request.getParameter("search");
    String title = request.getParameter("title");
    if (title == null) {
        title = "";
    }

    TimeStamp1 t1, t2;
    try {
        if (request.getParameter("from") != null) {
            t1 = new TimeStamp1(request.getParameter("from"));
        } else {
            t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated());
        }
    } catch (Exception e) {
        out.println("NO CLOCK YET!!!!!!!!");
        return;
    }
    t2 = new TimeStamp1(t1.getNowUnformated());
    t2.addHours(-24);
    Map<String, CCMAlarm> alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
    if (alarmArrayList.isEmpty()) {
        out.println("<h2>No current alarms found ...</h2>");
        return;
    }
    int disconnected = -1;
    try {
        disconnected = Integer.parseInt(request.getParameter("disconnected"));
    } catch (Exception e) {
    }
    Map<String, String[]> parameters = request.getParameterMap();
    //--------------------------     
    String _parameters = "";
    for (String key : parameters.keySet()) {
        //out.println("<p>"+key + "=" + parameters.get(key)[0]);
        if (!key.equals("open") && !key.equals("remove")) {
            _parameters += key + "=" + parameters.get(key)[0] + "&";
        }
    }
    if (status == null || status.isEmpty()) {
        status = "ALL";
    }
    if (type == null || type.isEmpty()) {
        type = "ALL";
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Tickets</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../global.css\">\n");
      out.write("    </head>\n");
      out.write("    <h1>");
      out.print(title);
      out.write("</h1>\n");
      out.write("    ");
if (noheaders == null) {
      out.write("\n");
      out.write("    <p><form name=\"critucalityform\" action=\"tickets_MKT.jsp\">\n");
      out.write("        Recent Tickets &nbsp;                 \n");
      out.write("\n");
      out.write("        Criticality:<select  onchange=\"this.form.submit()\" name=\"criticality\"> \n");
      out.write("            <option value=\"");
      out.print(criticality);
      out.write('"');
      out.write('>');
      out.print(criticality_S);
      out.write("</option>\n");
      out.write("            <option  value=\"1\">WARNING</option>\n");
      out.write("            <option  value=\"2\">MINOR</option>\n");
      out.write("            <option value=\"3\">MAJOR</option> \n");
      out.write("            <option value=\"4\">CRITICAL</option>\n");
      out.write("            <option value=\"0\">ALL</option>\n");
      out.write("        </select> \n");
      out.write("        Status:\n");
      out.write("        <select  onchange=\"this.form.submit()\" name=\"status\"> \n");
      out.write("            <option value=\"");
      out.print(status);
      out.write('"');
      out.write('>');
      out.print(status);
      out.write("</option>\n");
      out.write("            <option value=\"OPEN\">Open</option>\n");
      out.write("            <option value=\"ALL\">All</option>\n");
      out.write("        </select> \n");
      out.write("\n");
      out.write("\n");
      out.write("        subType:\n");
      out.write("        <select  onchange=\"this.form.submit()\" name=\"subType\">                                 \n");
      out.write("            <option value=\"");
      out.print(subType);
      out.write('"');
      out.write('>');
      out.print(subType);
      out.write("</option>\n");
      out.write("            ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER)) {
      out.write("\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SERVING_AREA);
      out.write("\">SERVING_AREA</option>\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_ATC);
      out.write("\">ATC</option>\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_DSLAM);
      out.write("\">DSLAM</option>\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SLOT);
      out.write("\">SLOT</option>\n");
      out.write("            <option value=\"ALL\">ALL</option>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE)) {
      out.write("\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_ATC);
      out.write("\">ATC</option>\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_CABLE);
      out.write("\">CABLE</option>\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_DP);
      out.write("\">DP</option>\n");
      out.write("            <option value=\"ALL\">ALL</option>\n");
      out.write("            ");
}
      out.write("      \n");
      out.write("            ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON)) {
      out.write("\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_OLT);
      out.write("\">OLT</option>\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SHELF);
      out.write("\">SHELF</option>\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_SLOT);
      out.write("\">SLOT</option>\n");
      out.write("            <option value=\"ALL\">ALL</option>\n");
      out.write("\n");
      out.write("            ");
}
      out.write("  \n");
      out.write("            ");
 if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE)) {
      out.write("\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_CABLE_ATC);
      out.write("\">ATC</option>        \n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_CABLE);
      out.write("\">CABLE</option>\n");
      out.write("            <option value=\"");
      out.print(diligent_MKT.Alarm_FYROM.SUBTYPE_GPON_BOX);
      out.write("\">BOX</option>\n");
      out.write("            <option value=\"ALL\">ALL</option>\n");
      out.write("            ");
}
      out.write("                     \n");
      out.write("        </select>                \n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;type ticketId or SR and press ENTER:<input type=\"text\" name=\"search\" onchange=\"this.form.submit()\"  value=\"");
      out.print(search);
      out.write("\" size=\"25\" />\n");
      out.write("        ");
if (unhidden == null) {
      out.write("\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hide 'pending'? :<input type=\"checkbox\" onchange=\"this.form.submit()\" name=\"unhidden\" value=\"ON\" />\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;Hide 'pending'? :<input type=\"checkbox\" onchange=\"this.form.submit()\" name=\"unhidden\" value=\"ON\" checked=\"checked\"/>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
if (uncanceled == null) {
      out.write("\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hide 'canceled'? :<input type=\"checkbox\" onchange=\"this.form.submit()\" name=\"uncanceled\" value=\"ON\" />\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;Hide 'canceled'? :<input type=\"checkbox\" onchange=\"this.form.submit()\" name=\"uncanceled\" value=\"ON\" checked=\"checked\"/>\n");
      out.write("        ");
}
      out.write("    \n");
      out.write("        <input type=\"hidden\" name=\"title\" value=\"");
      out.print(title);
      out.write("\" />\n");
      out.write("        <input type=\"hidden\" name=\"type\" value=\"");
      out.print(type);
      out.write("\" />\n");
      out.write("        <input type=\"hidden\" name=\"subType\" value=\"");
      out.print(subType);
      out.write("\" />\n");
      out.write("        <input type=\"hidden\" name=\"disconnected\" value=\"");
      out.print(disconnected);
      out.write("\" />\n");
      out.write("        <input type=\"hidden\" name=\"status\" value=\"");
      out.print(status);
      out.write("\" />\n");
      out.write("        <input type=\"hidden\" name=\"criticality\" value=\"");
      out.print(criticality_);
      out.write("\" />        \n");
      out.write("    </form>   \n");
      out.write("    <p><a href=\"alarms_MKT.jsp?type=");
      out.print(type);
      out.write("\">go to Alarms</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"map.jsp?status=OPEN\"><IMG src = \"fyrom.jpg\"/></a></p>\n");
      out.write("            ");
}       
      out.write("        \n");
      out.write("\n");
      out.write("    <table  width=\"100%\" border='1'>\n");
      out.write("\n");
      out.write("        <tr>     \n");
      out.write("            <th>map</th>\n");
      out.write("            <th>R</th>\n");
      out.write("            <th>Description</th>\n");
      out.write("            <th>Element type</th>\n");
      out.write("            <th>Number of elements</th>                  \n");
      out.write("            <th>Started</th>\n");
      out.write("            <th>Reported</th>\n");
      out.write("            <th>Stopped/Last update</th>                     \n");
      out.write("            <th>Status</th>\n");
      out.write("            <th>Registered lines</th>                \n");
      out.write("            <th>Criticality</th>\n");
      out.write("            <th>TicketId</th>\n");
      out.write("        </tr>            \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            //***********************************************************************************
            List<Ticket_FYROM> ticketsList = alarmArrayList.values().stream()
                    .filter(v -> v.getTicketId() != null)
                    .map(v -> (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(v.getTicketId()))
                    .filter(v -> v != null)
                    .map(v -> v.getMyTicket_IBM()).filter(v -> v != null).sorted(( tt1,  tt2) -> tt1.getIncidentStartDate().compareTo(tt2.getIncidentStartDate()) > 0 ? -1 : 1)
                    .collect(Collectors.toList());
            //***********************************************************************************
            for (Ticket_FYROM myTicket : ticketsList) {
                //*********** delit it *********************************
                /*
                if (myTicket.getIncidentStoppedDate() != null) {
                    myTicket.setState(Ticket.STATE_CLOSED);
                }*/
                //****************************
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
                //---------------
                int numberOfElements = myTicket.getElementsList().size();
                String sr = "";
                if (myTicket.getSR() != null) {
                    sr = myTicket.getSR();
                } else {
                    continue;
                }
                //-------------------------------------------------------------------------------------
                if (myTicket.isStillAlive()) {
        
      out.write(" \n");
      out.write("        <tr bgcolor='white'>             \n");
      out.write("            <td nowrap><a onclick=\"openMap('");
      out.print(ticketId);
      out.write("')\"><IMG src = \"fyrom.jpg\"/></a></td>\n");
      out.write("                    ");

                        if (myTicket.isRepeated()) {
      out.write("\n");
      out.write("            <td nowrap>R</td>\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            <td nowrap></td>\n");
      out.write("            ");
 }
      out.write("                                                   \n");
      out.write("            <td style=\"width:100px\">");
      out.print(desc);
      out.write("</td>\n");
      out.write("            <td nowrap>");
      out.print(myTicket.getSubType());
      out.write("</td> \n");
      out.write("            <td nowrap><a href=\"alarms_MKT.jsp?text=");
      out.print(URLEncoder.encode(new Gson().toJson(myTicket), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(numberOfElements);
      out.write("</a></td>\n");
      out.write("            <td nowrap>");
      out.print(AlertStart);
      out.write("</td>\n");
      out.write("            <td nowrap>");
      out.print(AlertReported);
      out.write("</td>\n");
      out.write("            <td nowrap></td>\n");
      out.write("            <td nowrap><a onclick=\"openEventsLog('");
      out.print(ticketId);
      out.write("')\"><font color='");
      out.print(color);
      out.write('\'');
      out.write('>');
      out.print(myStatus);
      out.write("</font></a></td>                                \n");
      out.write("            <td nowrap><a href=\"linesRegistered.jsp?type=");
      out.print(myTicket.getType());
      out.write("&path=");
      out.print(URLEncoder.encode(myTicket.getElementsList().get(0).getAlarmObject(), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(myTicket.getCurrentUsersRegistered());
      out.write("</a></td>                                                                                \n");
      out.write("            <td nowrap>");
      out.print(myTicket.getCriticalityDesc(myTicket.getCriticality()));
      out.write("</td>  \n");
      out.write("            <td nowrap><a href=\"../ticketInfo.jsp?text=");
      out.print(URLEncoder.encode(new Gson().toJson(myTicket), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(sr);
      out.write("</a>\n");
      out.write("                ");
if (myTicket.isPowerSupplyRelated()) {
      out.write("\n");
      out.write("                <img src=\"../img/power.jpg\" width=\"15\" height=\"15\" alt=\" P \"/>\n");
      out.write("                ");
}
      out.write("                 \n");
      out.write("            </td>                              \n");
      out.write("        </tr> \n");
      out.write("        ");
              } else {
        
      out.write("\n");
      out.write("        <tr>             \n");
      out.write("            <td nowrap><a onclick=\"openMap('");
      out.print(ticketId);
      out.write("')\"><IMG src = \"fyrom.jpg\"/></a></td>\n");
      out.write("                    ");

                        if (myTicket.isRepeated()) {
      out.write("\n");
      out.write("            <td nowrap>R</td>\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            <td nowrap></td>\n");
      out.write("            ");
 }
      out.write("                  \n");
      out.write("            <td style=\"width:100px\">");
      out.print(desc);
      out.write("</td>                \n");
      out.write("            <td nowrap>");
      out.print(myTicket.getSubType());
      out.write("</td>    \n");
      out.write("            <td nowrap><a href=\"alarms_MKT.jsp?type=");
      out.print(myTicket.getType());
      out.write("&ticketId=");
      out.print(URLEncoder.encode(ticketId, "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(numberOfElements);
      out.write("</a></td>\n");
      out.write("            <td nowrap>");
      out.print(AlertStart);
      out.write("</td>                \n");
      out.write("            <td nowrap>");
      out.print(AlertReported);
      out.write("</td>\n");
      out.write("            <td nowrap>");
      out.print(AlertStop);
      out.write("</td>\n");
      out.write("            <td nowrap><a onclick=\"openEventsLog('");
      out.print(ticketId);
      out.write("')\"><font color='");
      out.print(color);
      out.write('\'');
      out.write('>');
      out.print(myStatus);
      out.write("</font></a></td>            \n");
      out.write("            <td nowrap><a href=\"linesRegistered.jsp?type=");
      out.print(myTicket.getType());
      out.write("&path=");
      out.print(URLEncoder.encode(myTicket.getElementsList().get(0).getAlarmObject(), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(myTicket.getCurrentUsersRegistered());
      out.write("</a></td>\n");
      out.write("            <td nowrap>");
      out.print(myTicket.getCriticalityDesc(myTicket.getCriticality()));
      out.write("</td>    \n");
      out.write("            <td nowrap><a href=\"../ticketInfo.jsp?text=");
      out.print(URLEncoder.encode(new Gson().toJson(myTicket), "UTF-8"));
      out.write("\" target=\"_blank\">");
      out.print(sr);
      out.write("</a>\n");
      out.write("                ");
if (myTicket.isPowerSupplyRelated()) {
      out.write("\n");
      out.write("                <img src=\"../img/power.jpg\" width=\"15\" height=\"15\" alt=\" P \"/>\n");
      out.write("                ");
}
      out.write("                   \n");
      out.write("            </td>                    \n");
      out.write("        </tr> \n");
      out.write("        ");
                  }
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

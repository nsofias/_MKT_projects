package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collections;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class alarms_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    ServletContext myContext=request.getServletContext();
    try
        {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        }
    catch (Exception e)
        {
        }
    //------------------------------
    String type = request.getParameter("type");

    List alarmArrayList = new ArrayList();
    Container myCCMonitorStatsObjsContainer=null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
        {
        if (type != null && (type.equals(myGroupBy_Daemon.getDesc()) ) )
            {
            alarmArrayList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getAlarmArrayList());
            myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
            }
        }
    try
        {
        Collections.sort(alarmArrayList);
        }
    catch (Exception e)
        {
        }
        String criticality = request.getParameter("criticality");        
        if (criticality==null)
            {
            criticality="0";
            }                                       
    //---------------------------------------------------------- 
        TimeStamp1 t1,t2;
        try{
        if (request.getParameter("from")!=null)
            t1 = new TimeStamp1(request.getParameter("from"));
        else
            t1=new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());
        }catch(Exception e){out.println("NO CLOCK YET!!!!!!!!");return;}
        t2= new TimeStamp1(t1.getNowUnformated());
        t2.addHours(-5);               

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Alarms</title>\r\n");
      out.write("        <script  type=\"text/javascript\">\r\n");
      out.write("            var max_timePage = 120;\r\n");
      out.write("            var max_timeData = 120;\r\n");
      out.write("            if (max_timeData<0){max_timeData=120;}\r\n");
      out.write("            var cinterval;\r\n");
      out.write("\r\n");
      out.write("            function countdown_timer(){\r\n");
      out.write("            max_timePage--;\r\n");
      out.write("            max_timeData--;\r\n");
      out.write("            document.getElementById('countdownPage').innerHTML = max_timePage;\r\n");
      out.write("            if (max_timeData<0)\r\n");
      out.write("                {\r\n");
      out.write("                document.getElementById('countdownData').innerHTML =\"READY\";\r\n");
      out.write("                window.location.reload(true); \r\n");
      out.write("                }\r\n");
      out.write("            else\r\n");
      out.write("                {\r\n");
      out.write("                document.getElementById('countdownData').innerHTML = max_timeData;\r\n");
      out.write("                }\r\n");
      out.write("            //\r\n");
      out.write("            if(max_timePage === 0){\r\n");
      out.write("            clearInterval(cinterval);\r\n");
      out.write("            }\r\n");
      out.write("            }\r\n");
      out.write("            // 1,000 means 1 second.\r\n");
      out.write("            cinterval = setInterval('countdown_timer()', 1000);\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <table border=\"0\" width=\"100%\"   id=\"table1\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td nowrap width=\"10%\" bgcolor=\"grey\"><font color=\"white\">Logged in as:");
      out.print(username);
      out.write("</font></td>    \r\n");
      out.write("                <td nowrap width=\"40%\" bgcolor=\"grey\"><font color=\"white\">Page refresh: <span id=\"countdownPage\">0</span>s</font></td>                \r\n");
      out.write("                <td nowrap width=\"40%\" bgcolor=\"grey\"><font color=\"white\">Data refresh: <span id=\"countdownData\">0</span>s</font></td>                \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>        \r\n");
      out.write("        <h1>Recent Alarms (");
      out.print(type);
      out.write(")</h1>\r\n");
      out.write("            <table  border='1'>            \r\n");
      out.write("            <tr><IMG width='95%' src='AlarmsServletGantt?type=");
      out.print(type);
      out.write("&from=");
      out.print(t1.getNowUnformated());
      out.write("&to=");
      out.print(t2.getNowUnformated());
      out.write("&criticality=");
      out.print(criticality);
      out.write("'></tr>           \r\n");
      out.write("            </table>                \r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class scorers_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    ServletContext myContext = request.getServletContext();
    try
        {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        }
    catch (Exception e)
        {
        }
    //******************************************************************
    String type = request.getParameter("type");
    Container myCCMonitorStatsObjsContainer = null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
        {
        if (type != null && (type.equals(myGroupBy_Daemon.getDesc())))
            {
            myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
            }
        }
    if (myCCMonitorStatsObjsContainer == null)
        {
        return;
        }
//******************************************************************    

    String reportType = request.getParameter("reportType");//events,impact
    //------------------------
    int daysBack = 7;
    try
        {
        daysBack = Integer.parseInt(request.getParameter("daysBack"));
        }
    catch (Exception e)
        {
        }

    String T1, T2, T1_, T2_;
    try
        {
        if (request.getParameter("from") != null && request.getParameter("to") != null)
            {
            T1 = request.getParameter("from");
            T2 = request.getParameter("to");
            T1_ = new TimeStamp1(T1).getNowFormated();
            T2_ = new TimeStamp1(T2).getNowFormated();
            }
        else
            {
            TimeStamp1 t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());
            TimeStamp1 t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addHours(-24 * daysBack);
            T1 = t1.getNowUnformated();
            T2 = t2.getNowUnformated();
            T1_ = t1.getNowFormated();
            T2_ = t2.getNowFormated();
            }
        }
    catch (Exception e)
        {
        out.println("NO CLOCK YET!!!!!!!!");
        return;
        }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TOP10</title>\r\n");
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
      out.write("        </script>        \r\n");
      out.write("    </head>    \r\n");
      out.write("\r\n");
      out.write("    <body> \r\n");
      out.write("        <table border=\"0\" width=\"100%\"   id=\"table1\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td nowrap width=\"5%\" bgcolor=\"grey\"><font color=\"white\">Page refresh: <span id=\"countdownPage\">0</span>s</font></td>                \r\n");
      out.write("                <td nowrap width=\"5%\" bgcolor=\"grey\"><font color=\"white\">Data refresh: <span id=\"countdownData\">0</span>s</font></td>                                \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <b>Days back:</b><form action=\"scorers.jsp\">\r\n");
      out.write("            <select onchange=\"form.submit()\"  name=\"daysBack\">\r\n");
      out.write("                <option value=\"");
      out.print(daysBack);
      out.write('"');
      out.write('>');
      out.print(daysBack);
      out.write("</option>\r\n");
      out.write("                <option value=\"1\">1</option>\r\n");
      out.write("                <option value=\"2\">2</option>\r\n");
      out.write("                <option value=\"3\">3</option>\r\n");
      out.write("                <option value=\"4\">4</option>\r\n");
      out.write("                <option value=\"5\">5</option>\r\n");
      out.write("                <option value=\"6\">6</option>\r\n");
      out.write("                <option value=\"7\">7</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <input type=\"hidden\" name=\"reportType\" value=\"");
      out.print(reportType);
      out.write("\" />\r\n");
      out.write("        </form>\r\n");
      out.write("        <h2> <IMG src='img/sad.jpg'>TOP unstable resources from ");
      out.print(T2_);
      out.write(" to ");
      out.print(T1_);
      out.write("</h2>\r\n");
      out.write("        <!--    <p>\r\n");
      out.write("                <h3>Instability Indicator = sum of disconnections/sum of live sessions</h3> \r\n");
      out.write("        //reportType:events,impact\r\n");
      out.write("        -->\r\n");
      out.write("        <table width=\"100%\">              \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><iframe width=\"530\" height=\"800\" src= \"scorersForType.jsp?from=");
      out.print(T1);
      out.write("&to=");
      out.print(T2);
      out.write("&type=");
      out.print(type);
      out.write("&reportType=events\" frameborder= \"0\" ></iframe></td>\r\n");
      out.write("                <td><iframe width=\"530\" height=\"800\" src= \"scorersForType.jsp?from=");
      out.print(T1);
      out.write("&to=");
      out.print(T2);
      out.write("&type=");
      out.print(type);
      out.write("&reportType=impact\" frameborder= \"0\"></iframe></td>                \r\n");
      out.write("            </tr>            \r\n");
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

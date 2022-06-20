package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class scorersForType_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private String format_number(double myNumder)
        {
        NumberFormat myNumberFormat = NumberFormat.getInstance();
        myNumberFormat.setMinimumFractionDigits(0);
        myNumberFormat.setMaximumFractionDigits(0);
        return (myNumberFormat.format(myNumder));
        }

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

      out.write("\r\n");
      out.write("\r\n");

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
    String reportType = request.getParameter("reportType");//events,impact

    Container myCCMonitorStatsObjsContainer = null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
        {
        if (type != null && (type.equals(myGroupBy_Daemon.getDesc())))
            {
            myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
            }
        }
    Counters topScorers = new Counters();
    

    String T1, T2;
    try
        {
        if (request.getParameter("from") != null && request.getParameter("to") != null)
            {
            T1 = request.getParameter("from");
            T2 = request.getParameter("to");
            }
        else
            {
            TimeStamp1 t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());
            TimeStamp1 t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addHours(-24 * 7);
            T1 = t1.getNowUnformated();
            T2 = t2.getNowUnformated();
            }
        out.println(myCCMonitorStatsObjsContainer.getMyClock());
        //    out.println(T1);out.println(T2);
        }
    catch (Exception e)
        {
        out.println("NO CLOCK YET!!!!!!!!");
        return;
        }
    String reportType_ = "";
    if (reportType.equals("events"))
        {
        reportType_ = "Number of events";
        }
    else if (reportType.equals("impact"))
        {
        reportType_ = "Impact (Human Hours)";
        }        String elType = "";
        if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER))
            {
            elType = "SERVING_AREA : ATC : DSLAM : slot";
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Alarms</title>   \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>         \r\n");
      out.write("        <table  border='1'>\r\n");
      out.write("            <tr bgcolor=\"LightBlue\">\r\n");
      out.write("                <th>");
      out.print(elType);
      out.write("</th>  \r\n");
      out.write("                <th>");
      out.print(reportType_);
      out.write("</th>                        \r\n");
      out.write("            </tr> \r\n");
      out.write("\r\n");
      out.write("            ");

                if (myCCMonitorStatsObjsContainer == null)
                    {
                    return;
                    }
                if (reportType.equals("events"))
                    {
                    topScorers = myCCMonitorStatsObjsContainer.getTopScorers_events(T1, T2);
                    }
                else if (reportType.equals("impact"))
                    {
                    topScorers = myCCMonitorStatsObjsContainer.getTopScorers_impact(T1, T2);
                    }
                List<String> labels = topScorers.getLabelsSortedBy(Counters.sortByValue);
                for (String header : labels)
                    {
                    try
                        {
                        String niceHeader = "";
                        niceHeader = header.replace(";", " : ");
                      
                        String reduction = "0";
                        if (reportType.equals("events"))
                            {
                            reduction = format_number(topScorers.getCount(header));
                            }
                        else if (reportType.equals("impact"))
                            {
                            reduction = format_number(topScorers.getValue(header));
                            }
            
      out.write("\r\n");
      out.write("            <tr>                      \r\n");
      out.write("                <td nowrap><a href='HistoryServlet?type=");
      out.print(type);
      out.write("&resource=");
      out.print(header);
      out.write("' target='_blank'>");
      out.print(niceHeader);
      out.write("</a></td>\r\n");
      out.write("                <td>");
      out.print(reduction);
      out.write("</td>\r\n");
      out.write("            </tr> \r\n");
      out.write("            ");
                  }
                    catch (Exception e)
                        {
                        out.println(e.toString());
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import SKOPIA.Config;
import java.util.Collections;
import java.util.Iterator;
import org.apache.catalina.ha.backend.CollectedInfo;
import java.util.Map;
import java.text.NumberFormat;
import nsofiasLib.utils.mapper.*;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.ArrayList;
import java.util.List;
import SKOPIA.*;

public final class reggr_005ftext_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    <html>\n");
      out.write("<head>\n");
      out.write("    <title>Alarms</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"global_1.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<!--    <body onload=\"JavaScript:timedRefresh(120000);\"> -->\n");
      out.write("<body>         \n");
      out.write("    ");

        ServletContext myContext = request.getServletContext();
        try
            {
            Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
            myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
            }
        catch (Exception e)
            {
            }
        String volumeMin = request.getParameter("volumeMin");
        if (volumeMin == null)
            {
            volumeMin = "-1";
            }
        //
        int maxDataToDisplay = 700;
        String maxDataToDisplay_ = request.getParameter("maxDataToDisplay");
        if (maxDataToDisplay_ != null)
            {
            maxDataToDisplay = Integer.valueOf(maxDataToDisplay_);
            }
        //----------------------
        Container myCCMonitorStatsObjsContainer = null;
        //-----------------------------------------------
        String type = request.getParameter("type");
        String order_Desc = request.getParameter("order_Desc");
        //------------------------------------
        String elType = "";
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

    
      out.write("\n");
      out.write("    <h2>User sessions distribution</h2>\n");
      out.write("    <table  border=\"1\" width=\"100%\"   id=\"table2\" cellspacing=\"5\" cellpadding=\"5\">   \n");
      out.write("        <th>");
      out.print(elType);
      out.write("</th>\n");
      out.write("        <th>sessions</th> \n");
      out.write("            ");

                ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
                    {
                    if (type != null && type.equals(myGroupBy_Daemon.getDesc()))
                        {
                        myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
                        }
                    }
                if (myCCMonitorStatsObjsContainer == null)
                    {
                    return;
                    }
                //-------
                Counters_1D_decimal myLastAggregation = new Counters_1D_decimal();

                try
                    {
                    myLastAggregation.update(myCCMonitorStatsObjsContainer.getLastAggregation());
                    //myLastAggregation.setTotalValue(myCCMonitorStatsObjsContainer.getLastAggregation().getTotalValue());
                    if (order_Desc != null)
                        {
                        myLastAggregation.sortByValueIncr();
                        }
                    else
                        {
                        myLastAggregation.sortByValue();
                        }
                    }
                catch (Exception e)
                    {
                    return;
                    }
                //CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = myGroupBy_Daemons.get(0).getMyStatsObjContainer();      
                //---------------------------------------------------------- 
                Iterator itr = myLastAggregation.getKeysIterator();
                int count = 0;
                while (itr.hasNext() && count < maxDataToDisplay)
                    {
                    count++;
                    String myLabel = (String) itr.next();
                    double myVolumn = myLastAggregation.getValue(myLabel);
                    String labelDesc = myLabel.replace(";", " : ");
                    if (myVolumn > 1)
                        {
                            
      out.write("         \n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"reggr_text.jsp?type=");
      out.print(type);
      out.write("&label=");
      out.print(labelDesc);
      out.write("&net_type_fix=y&net_type_mobile=y\" target=\"_blank\"><b>");
      out.print(labelDesc);
      out.write("</b></a> </td>\n");
      out.write("                            <td>");
      out.print(myVolumn);
      out.write("</td>   \n");
      out.write("                        </tr>\n");
      out.write("                        ");
  }
                        else
                            {
                        
      out.write("         \n");
      out.write("                        <tr>\n");
      out.write("                            <td nowrap>");
      out.print(labelDesc);
      out.write(" </td>\n");
      out.write("                            <td>");
      out.print(myVolumn);
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
  }
                out.flush();
                }
            out.flush();
        
      out.write("\n");
      out.write("\n");
      out.write("    </table>                                 \n");
      out.write("</body>\n");
      out.write("</html> ");
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

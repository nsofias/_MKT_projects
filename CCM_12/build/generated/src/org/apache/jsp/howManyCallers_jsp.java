package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.utils.Counters1;
import ccm.CCMonitorStatsObjsContainer;
import ccm.OTE.Ticket_OTE;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.ArrayList;
import java.util.List;

public final class howManyCallers_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    try {
        ServletContext myContext = request.getServletContext();
        //-------variables only for statistics--    
        String dslam = request.getParameter("dslam");
        String slot = request.getParameter("slot");
        //--------------
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
        //---------------------------------------------------------- 

        TimeStamp1 t1, t2;
        String T1, T2;
        if (from == null || to == null) {
            try {
                t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated());
            } catch (Exception e) {
                out.println("NO CLOCK YET!!!!!!!!");
                return;
            }
            t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addMinutes(-(myCCMonitorStatsObjsContainer.getMeasurePeriod()));
            T1 = t1.getNowUnformated().substring(0, 13);
            T2 = t2.getNowUnformated().substring(0, 13);
        } else {
            T1 = from;
            T2 = to;
        }


        //-------------------
        String resource = null;
        String resourceType = null;
        if (slot != null && dslam != null) {
            resource = dslam + ":" + slot;
            resourceType = Ticket_OTE.ELEMENT_TYPE_SLOT;
        } else if (dslam != null) {
            resource = dslam;
            resourceType = Ticket_OTE.ELEMENT_TYPE_DSLAM;
        }
        //out.println(resource+" "+resourceType+" "+T1+" "+T2);
        //=========================================================
        if (resourceType != null) {
            Counters1 myIPResources = myCCMonitorStatsObjsContainer.getLinesForResource(resourceType, resource, T1, T2);
            //Counters myIPResources = myCCMonitorStatsObjsContainer.getQStatsObj("", T1, T2).getResourceCounters(myReasons, resourceType, myCCMonitorStatsObjsContainer.getPstnResourcesCache());
            if (resource != null) {
                //out.println(myIPResources.toString());
                out.print(resource + "@" + myIPResources.size());
            } else {
                for (String label : myIPResources.keySet()) {
                    out.println(label + "@" + myIPResources.getTotalValueOfLabel(label));
                }
            }
//            long numberOfCallers = myIPResources.getCountOfPatern(resource);
//            out.print(fromTimeStampFormated+" "+toTimeStampFormated+" "+numberOfCallers);
            out.flush();
        }
        //=================================================================
    } catch (NumberFormatException e) {
        out.print(e.getMessage());
    }

      out.write('\r');
      out.write('\n');
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.Alarm_FYROM;
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

public final class inMassive_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public String isLineInMassive(String path, Diligent_Daemon myDaemon) throws Exception {
        List<Alarm_FYROM> myLiveAlarms = myDaemon.getMyStatsObjContainer().getAlarmArrayList_stillAlive();
        System.out.println("NewWebServiceFromWSDL:myLiveAlarms.size()=" + myLiveAlarms.size());
        for (Alarm_FYROM myAlarm : myLiveAlarms) {
            System.out.println("NewWebServiceFromWSDL:path:" + path + " <->  Alert:" + myAlarm.getAlertOrigin());
            if (path.contains(myAlarm.getAlarmObject())) {
                String sr = myAlarm.getTicketSR();
                String alarmReason = myAlarm.getAlarmReason();//Massive, Maintenance
                return sr + ";" + alarmReason;
            }
        }
        return null;
    }

    public String isLineInMassiveRecently(String path, Diligent_Daemon myDaemon) throws Exception {
        List<Alarm_FYROM> myAlarms = myDaemon.getMyStatsObjContainer().getAlarmArrayList();
        System.out.println("NewWebServiceFromWSDL:myLiveAlarms.size()=" + myAlarms.size());
        TimeStamp1 now = new TimeStamp1();
        for (Alarm_FYROM myAlarm : myAlarms) {
            try {
                //System.out.println("NewWebServiceFromWSDL:path:" + path + " <->  Alert:" + myAlarm.getAlertOrigin());
                if (!myAlarm.isStilAlive() && myAlarm.getAlarmStop() != null && !myAlarm.getAlarmStop().isEmpty() && path.contains(myAlarm.getAlarmObject())) {
                    TimeStamp1 stopped = new TimeStamp1(myAlarm.getAlarmStop());
                    double timeDiff = now.minutesDiff(stopped);
                    if (timeDiff < 90) {
                        String sr = myAlarm.getTicketSR();
                        String alarmReason = myAlarm.getAlarmReason();//Massive, Maintenance
                        return sr + ";" + alarmReason;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
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
      response.setContentType("text/html");
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
      out.write('\n');

    request.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    //--------------------------
    String path = request.getParameter("path");
    String type = request.getParameter("type");
    String minutesDiff_ = request.getParameter("minutesDiff");
    double minutesDiff = 0;
    if (minutesDiff_ != null) {
        try {
            minutesDiff = Integer.parseInt(minutesDiff_);
        } catch (Exception e) {
        }
    }
    String result;
    //
    for (Diligent_Daemon myDaemon : myGroupBy_Daemons) {
        if (type == null || myDaemon.getDesc().equals(type)) {
            try {
                String res;
                if (minutesDiff == 0) {
                    res = isLineInMassive(path, myDaemon);
                } else {
                    res = isLineInMassiveRecently(path, myDaemon);
                }
                if (res != null) {
                    result = res;
                    out.println(result);
                    return;
                }
            } catch (Exception e) {
                result = "ERROR_" + e.toString();
                out.println(result);
                return;
            }
        }
    }
    result = "NO_MASSIVE";
    out.println(result);

      out.write('\n');
      out.write('\n');
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

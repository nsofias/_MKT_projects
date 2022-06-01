package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import radius.RadiusSessionRecord;
import radius.RadiusLog_LineParserListener;
import java.net.URLEncoder;
import nsofiasLib.utils.URLContextReader_object;
import nsofiasLib.fileIO.FileLogger;
import radius.CallInfo;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.time.TimeStamp1;

public final class getCallInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private CallInfo getlineIdresources1(String lineId, RadiusSessionRecord myRadiusRecord) {
        CallInfo myCallInfo = new CallInfo(lineId, new TimeStamp1().getNowUnformated(), "NA", "UNKN_REASON");

        try {
            String[] myValues = myRadiusRecord.getMyValues();
            String cardTechnology = myValues[5];
            String SERVING_AREA = myValues[18];
            String ATC = myValues[11];
            String DSLAM = myValues[15];
            String SLOT = DSLAM + ":" + myValues[7] + "-" + myValues[8] + "-" + myValues[9];
            //
            myCallInfo.getResources().put("SERVING_AREA", SERVING_AREA);
            myCallInfo.getResources().put("ATC", SERVING_AREA + ";" + ATC);
            //
            if (!cardTechnology.equals("GPON")) {
                //--------- COPPER  --------------
                //path = SERVING_AREA + ";" + ATC + ";" + DSLAM + ";" + SLOT;
                //path = ATC + ";" + CABLE + ";" + DP;
                myCallInfo.setNetworkType("COPPER");
                String CABLE = ATC + "#" + myValues[12];
                String DP = CABLE + "#" + myValues[13];
                //
                myCallInfo.getResources().put("DSLAM", SERVING_AREA + ";" + ATC + ";" + DSLAM);
                myCallInfo.getResources().put("SLOT", SERVING_AREA + ";" + ATC + ";" + DSLAM + ";" + SLOT);
                myCallInfo.getResources().put("CABLE", ATC + ";" + CABLE);
                myCallInfo.getResources().put("DP", ATC + ";" + CABLE + ";" + DP);
            } else {
                //-------- GPON ---------------
                //path = OLT + ";" + SHELF + ";" + SLOT;
                //path = ATC + ";" + CABLE + ";" + DP;
                String SHELF = DSLAM + ":" + myValues[7] + "-" + myValues[8];
                String CABLE = myValues[12];
                String BOX = myValues[13];////LLisice#ODCF-18-02-05 CABLE-BOX   
                //
                myCallInfo.setNetworkType("GPON");
                myCallInfo.getResources().put("OLT", DSLAM);
                myCallInfo.getResources().put("GPON_SHELF", DSLAM + ";" + SHELF);
                myCallInfo.getResources().put("GPON_SLOT", DSLAM + ";" + SHELF + ";" + SLOT);
                myCallInfo.getResources().put("GPON_CABLE", ATC + ";" + CABLE);
                myCallInfo.getResources().put("GPON_BOX", ATC + ";" + CABLE + ";" + BOX);
            }
        } catch (Exception e) {
        }
        return myCallInfo;
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

    response.setCharacterEncoding("utf-8");
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");
    String lineId = request.getParameter("lineId");
    RadiusSessionRecord myRadiusRecord = myContainer.getEventsContainer().get(lineId);
    if (myRadiusRecord == null) {
        CallInfo myCallInfo = new CallInfo(lineId, new TimeStamp1().getNowUnformated(), "NA", "UNKN_REASON");
        out.println(myCallInfo);
    } else {
        CallInfo myCallInfo = getlineIdresources1(lineId, myRadiusRecord);
        out.println(myCallInfo);
    }

      out.write("\n");
      out.write("\n");
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

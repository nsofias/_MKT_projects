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

public final class checkLineIfMassive_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private String checkIfMassive(String lineId,RadiusSessionRecord myRadiusRecord) {
        try {
            String now = new TimeStamp1().getNowUnformated();            
            CallInfo myCallInfo;
            String[] myValues = myRadiusRecord.getMyValues();
            String cardTechnology = myValues[5];
            System.out.println("NewWebServiceFromWSDL:cardTechnology:" + cardTechnology);
            ArrayList<String[]> paths = new ArrayList();
            //--------- COPPER  --------------
            if (!cardTechnology.equals("GPON")) {
                myCallInfo = new CallInfo(lineId, now, "COPPER", "UNKN_REASON");
                try {
                    String SERVING_AREA = myValues[18];
                    String ATC = myValues[11];
                    String DSLAM = myValues[15];
                    String SLOT = DSLAM + ":" + myValues[7] + "-" + myValues[8] + "-" + myValues[9];
                    String path = SERVING_AREA + radius.NewWebServiceFromWSDL.PATH_DELIMETER + ATC + radius.NewWebServiceFromWSDL.PATH_DELIMETER + DSLAM + radius.NewWebServiceFromWSDL.PATH_DELIMETER + SLOT;
                    paths.add(new String[]{
                        path, radius.NewWebServiceFromWSDL.TYPE_COPPER
                    });
                    //**************
                    //SERVING_AREA;ATC;DSLAM;OLT;SHELF;SLOT;CABLE;DP;BOX;
                    myCallInfo.getResources().put("SERVING_AREA", SERVING_AREA);
                    myCallInfo.getResources().put("ATC", ATC);
                    myCallInfo.getResources().put("DSLAM", DSLAM);
                    myCallInfo.getResources().put("SLOT", SLOT);
                    //**************
                    System.out.println("NewWebServiceFromWSDL:path added:" + path);
                } catch (Exception e) {
                   System.out.println("NewWebServiceFromWSDL:" + e.toString());
                }
                //--------- COPPER CABLE  --------------
                try {
                    String ATC = myValues[11];
                    String CABLE = ATC + "#" + myValues[12];
                    String DP = CABLE + "#" + myValues[13];
                    String path = ATC + radius.NewWebServiceFromWSDL.PATH_DELIMETER + CABLE + radius.NewWebServiceFromWSDL.PATH_DELIMETER + DP;
                    paths.add(new String[]{
                        path, radius.NewWebServiceFromWSDL.TYPE_COPPER_CABLE
                    });
                    //*******************
                    myCallInfo.getResources().put("CABLE", CABLE);
                    myCallInfo.getResources().put("DP", DP);
                    //*******************
                    System.out.println("NewWebServiceFromWSDL:path added:" + path);
                } catch (Exception e) {
                   System.out.println("NewWebServiceFromWSDL:4 " + e.toString());
                }
                //-------- GPON ---------------
            } else {
                myCallInfo = new CallInfo(lineId, now, "GPON", "UNKN_REASON");
                try {
                    String OLT = myValues[15];
                    String SHELF = OLT + ":" + myValues[7] + "-" + myValues[8];
                    String SLOT = OLT + ":" + myValues[7] + "-" + myValues[8] + "-" + myValues[9];
                    String path = OLT + radius.NewWebServiceFromWSDL.PATH_DELIMETER + SHELF + radius.NewWebServiceFromWSDL.PATH_DELIMETER + SLOT;
                    paths.add(new String[]{
                        path, radius.NewWebServiceFromWSDL.TYPE_GPON
                    });
                    //**************
                    myCallInfo.getResources().put("OLT", OLT);
                    myCallInfo.getResources().put("SHELF", SHELF);
                    myCallInfo.getResources().put("SLOT", SLOT);
                    //**************                    
                    System.out.println("NewWebServiceFromWSDL:path added:" + path);
                } catch (Exception e) {
                   System.out.println("NewWebServiceFromWSDL:3 " + e.toString());
                }
                //-------- GPON CABLE ---------------
                try {
                    String ATC = myValues[11];
                    String CABLE = myValues[12];
                    String DP = myValues[13];////LLisice#ODCF-18-02-05 CABLE-BOX                    
                    String path = ATC + radius.NewWebServiceFromWSDL.PATH_DELIMETER + CABLE + radius.NewWebServiceFromWSDL.PATH_DELIMETER + DP;
                    paths.add(new String[]{
                        path, radius.NewWebServiceFromWSDL.TYPE_GPON_CABLE
                    });
                    //**************
                    myCallInfo.getResources().put("ATC", ATC);
                    myCallInfo.getResources().put("CABLE", CABLE);
                    myCallInfo.getResources().put("BOX", DP);
                    //**************                        
                    System.out.println("NewWebServiceFromWSDL:path added:" + path);
                } catch (Exception e) {
                   System.out.println("NewWebServiceFromWSDL:2  " + e.toString());
                }
            }
            //-------------------------------------        
            try {
                URLContextReader_object myUrlReader = new URLContextReader_object();
                for (String[] path : paths) {
                    String url = "http://10.232.63.13:8080/DILIGENT_MKT/inMassive.jsp" + "?path=" + URLEncoder.encode(path[0], "UTF-8") + "&type=" + path[1];
                    System.out.println("NewWebServiceFromWSDL:url:" + url);
                    String res = (String) myUrlReader.getUrlContext(url, 120000, 120000).get(0);
                    System.out.println("NewWebServiceFromWSDL:checkIfMassive returned:" + res);
                    if (!res.contains("NOT_FOUND")) {
                        return res;
                    }
                }
                return ("NO_MASSIVE_FOUND");
            } catch (Exception e) {
               System.out.println("NewWebServiceFromWSDL:1 " + e.toString());
            }
        } catch (Exception e) {
           System.out.println("NewWebServiceFromWSDL:0 " + e.toString());
            return ("NO_MASSIVE_FOUND");
        }
       System.out.println("NewWebServiceFromWSDL:-1 ");
        return ("NO_MASSIVE_FOUND");
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
        out.println("LINE_NOT_FOUND");
        return;
    }
    String res = checkIfMassive(lineId,myRadiusRecord);
    if (res != null)
        out.println(res);

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

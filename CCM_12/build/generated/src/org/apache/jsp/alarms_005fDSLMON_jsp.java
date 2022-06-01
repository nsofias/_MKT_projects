package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ccm.OTE.DSLMONInfo_object;
import ccm.OTE.DslmonAlarm;
import nsofiasLib.others.Parameters;
import java.util.Collections;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;

public final class alarms_005fDSLMON_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");

    DSLMONInfo_object myDSLMONInfo_object = new DSLMONInfo_object();
    System.setProperty("http.proxyHost", "");
    System.setProperty("http.proxyPort", "");
    ArrayList<DslmonAlarm> alarmArrayList = new ArrayList();
    try{
        String diligent_ip = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/common/conf/parameters.properties", "diligent", "UTF8");
    alarmArrayList = myDSLMONInfo_object.getDslmonAlarms("http://"+diligent_ip+":8080/DSLMON/alarmsWS_servlet");
    }catch(Exception e){out.println("Dili@gent is (at the moment) not available!!!");return;}    
    Collections.sort(alarmArrayList);  
    
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Alarms</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <body>     \r\n");
             
        String type = request.getParameter("type");
        if (type==null || type.isEmpty())
            type="ALL";
        //---------
        int criticality=50;
        try{
            criticality = Integer.parseInt(request.getParameter("criticality"));    
            }
        catch(Exception e){}                        
        //-----------------
        String status = request.getParameter("status");
        if (status==null || status.isEmpty())
            status="ALL";                  

      out.write(" \r\n");
      out.write("\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"diliEvents.png\" />\r\n");
      out.write("<p>\r\n");
      out.write("            <table  border='1'>\r\n");
      out.write("            <tr bgcolor=\"LightBlue\">\r\n");
      out.write("            <th>Resource Type</th>\r\n");
      out.write("            <th>Bras : Dslam : DslamCard</th>           \r\n");
      out.write("            <th>Dili@event info</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");


             for ( DslmonAlarm myAlarm:alarmArrayList)
                {
                if (myAlarm.getTicket_sr().startsWith("#") || myAlarm.getTicket_sr().startsWith("$"))
                    {
                    continue;
                    }                     
                if (status.contains("alive") && !myAlarm.isStilAlive())
                    {
                    continue;
                    }                
                if (
/*                   (type.equals("BRAS") && myAlarm.getAlertType()!=DslmonAlarm.brasCallsUp)||
                   (type.equals("DSLAM") && myAlarm.getAlertType()!=DslmonAlarm.dslamCallsUp)||*/
                   (type.equals("CARD") && myAlarm.getAlertType()!=DslmonAlarm.cardCallsUp)
                   )
                    {
                    continue;
                    } 
                if ( myAlarm.getDisConnections()<criticality)
                    {
                    continue;
                    }
                String AlertOrigin = myAlarm.getAlertOrigin();
                AlertOrigin = AlertOrigin.replaceAll(";", " : ");                
                TimeStamp1 T1 = new TimeStamp1(myAlarm.getAlertStart());
                TimeStamp1 T2 = new TimeStamp1(myAlarm.getAlertStop());
                TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlertStart());
                T0.addSeconds(-7400);
                String AlertStart = T1.getNowFormated();
                String AlertStop = T2.getNowFormated();                
                int AlertType = myAlarm.getAlertType();
                String AlertTypeS="";
                if (AlertType==DslmonAlarm.brasCallsUp)
                    {
                    AlertTypeS="BRAS";
                    }
                else if (AlertType==DslmonAlarm.dslamCallsUp)
                    {
                    AlertTypeS="DSLAM";
                    }
                else if (AlertType==DslmonAlarm.cardCallsUp)
                    {
                    AlertTypeS="CARD";      
                    }

                String bgcolor="#E5E4E2";
                String desc = "";
                if (myAlarm.getTicket_sr().startsWith("MTT"))
                    {
                    desc = "ΜΤΤ SR (ΜΕΤΑΓΩΓΗ): <font color='green'>"+myAlarm.getTicket_sr()+"</font>  ( "+myAlarm.getDisConnections()+" disconnections on "+AlertStart.substring(0, 16)+")";
                    }
                else
                    {
                    desc = "ΝΤΤ SR: <font color='green'>"+myAlarm.getTicket_sr()+"</font>  ( "+myAlarm.getDisConnections()+" disconnections on "+AlertStart.substring(0, 16)+")";
                    }
                String color="green";
                if (myAlarm.getDisConnections()>250)
                    color="red";
                if (myAlarm.isStilAlive())
                    {
      out.write("                            \r\n");
      out.write("                    <tr>  \r\n");
      out.write("                        <td nowrap><b>");
      out.print(AlertTypeS);
      out.write("</b></td>                    \r\n");
      out.write("                        <td nowrap><b><font color='");
      out.print(color);
      out.write('\'');
      out.write('>');
      out.print(AlertOrigin);
      out.write("</font></b></td>                      \r\n");
      out.write("                        <td nowrap><b>");
      out.print(desc);
      out.write("</b></td>                                                \r\n");
      out.write("                        <td><b>alive</b></td>\r\n");
      out.write("                    </tr> \r\n");
                  }
                else
                    { 
      out.write("\r\n");
      out.write("                    <tr bgcolor=\"");
      out.print(bgcolor);
      out.write("\">\r\n");
      out.write("                        <td nowrap>");
      out.print(AlertTypeS);
      out.write("</td>\r\n");
      out.write("                        <td nowrap>");
      out.print(AlertOrigin);
      out.write("</td>                     \r\n");
      out.write("                        <td nowrap>");
      out.print(desc);
      out.write("</td> \r\n");
      out.write("                        <td>old</td>\r\n");
      out.write("                    </tr> \r\n");
                  }                    
                }

      out.write("\r\n");
      out.write("        \r\n");
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

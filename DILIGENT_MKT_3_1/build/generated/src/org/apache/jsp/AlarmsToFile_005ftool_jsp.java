package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.others.Parameters;
import java.sql.ResultSet;
import nsofiasLib.databases.DatabaseLogger;
import java.util.Collections;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class AlarmsToFile_005ftool_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("application/csv");
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
    
    response.setHeader("Content-type","text/csv");
    response.setHeader("Content-disposition","inline; filename="+ "myAlarms.csv");
    String from_timestamp = request.getParameter("from");
    String to_timestamp = request.getParameter("to");
    ResultSet res;
    if (from_timestamp == null || to_timestamp == null)
        {
        out.println("dates????"); return;
        }
    try
        {
        from_timestamp = from_timestamp + "T000000.000";
        to_timestamp = to_timestamp + "T235959.000";
        //--------------------------
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        //-------
        String sqlStr = "select * from dslmon_skopia.alarms where objTime >= '" + from_timestamp + "' && objTime <= '" + to_timestamp + "'";
        res = myDatabaseLogger.getResults(sqlStr);
        out.println("objName;objTime;alertType;alertStart;alertStop;alertOrigin;stilAlive;criticality;alertDesc;disConnections;ticket_sr");
        while (res.next())
            {
            //objName+";"+objTime+";"+alertType+";"+alertStart+";"+alertStop+";"+alertOrigin+";"+stilAlive+";"+criticality+";"+alertDesc+";"+disConnections+";"+ticket_sr;                
            String objName = res.getString("objName").replace(";", ":");
            String objTime = res.getString("objTime");
            String alertType = res.getString("alertType");
            String alertStart = res.getString("alertStart");
            String alertStop = res.getString("alertStop");
            String alertOrigin = res.getString("alertOrigin").replace(";", ":");;
            String stilAlive = res.getString("stilAlive");
            String criticality = res.getString("criticality");
            String alertDesc = res.getString("alertDesc");
            String disConnections = res.getString("disConnections");
            String ticket_sr = res.getString("ticket_sr");
            out.println(objName + ";" + objTime + ";" + alertType + ";" + alertStart + ";" + alertStop + ";" + alertOrigin + ";" + stilAlive + ";" + criticality + ";" + alertDesc + ";" + disConnections + ";" + ticket_sr);
            }
        res.close();
        }
    catch (Exception e)
        {
        out.println(e.toString());
        }

      out.write("        \n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.others.Parameters;
import java.util.ArrayList;
import nsofiasLib.utils.mapper.*;
import nsofiasLib.databases.DatabaseParser;
import nsofiasLib.time.TimeStamp1;
import java.util.Iterator;

public final class patterns_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Unusual patterns</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>     \r\n");
      out.write("<h1>Unusual (time) patterns during last month</h1>\r\n");

        Counters_1D sourceCounters = null;
        LineGroupper myLineGroupper;
        DatabaseParser myDatabaseParser;
        String classForName = "com.mysql.jdbc.Driver";
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        String connectionString = "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron";
        String user = "sa";
        String password = "trinitron";
        TimeStamp1 startTimeStamp =new TimeStamp1();
        startTimeStamp.addDays(-30);
        String startTime = startTimeStamp.getNowUnformated();
        String sql = "SELECT * FROM dslmon_skopia.alarms where objTime > '"+startTime+"' order by objTime Desc ";
        try
            {

            //---------------
            myLineGroupper = new LineGroupper(new int[]
                {
                0
                }, ",");//group sourxes
            //            ------------------------------------------------------------
            myDatabaseParser = new DatabaseParser(myLineGroupper, classForName, connectionString, user, password);
            myDatabaseParser.parse_databaseRecords(sql);
            //
            sourceCounters = myLineGroupper.getAggregationResults();
            sourceCounters.sortByValue();
            //sourceCounters.sortByKey();
            //sourceCounters.display();
            }
        catch (Exception e)
            {
            e.printStackTrace();
            }
        //=============================================================================  
        if (sourceCounters == null)
            {
            return;
            }
        //----------------------------------------------------------------
        Iterator sourceIterator = sourceCounters.getKeysIterator();
        while (sourceIterator.hasNext())
            {
            try
                {
                String nextsource = (String) sourceIterator.next();
                if (sourceCounters.getCount(nextsource) > 5)
                    {
                    //System.out.println("Parsing resource = " + nextsource);
                    myLineGroupper = new LineGroupper(new int[]
                        {
                        1
                        }, ",");
                    myLineGroupper.setLineMustContain(nextsource);
                    //
                    myDatabaseParser = new DatabaseParser(myLineGroupper, classForName, connectionString, user, password);
                    sql = "SELECT * FROM dslmon_skopia.alarms  where objName = '"+nextsource+"' AND objTime > '"+startTime+"' order by objTime Desc limit 60000";
                    myDatabaseParser.parse_databaseRecords(sql);
                    Counters_1D timestampsCounters = myLineGroupper.getAggregationResults();
                    timestampsCounters.sortByKey();
                    //timestampsCounters.display();
                    //------------------------                
                    ArrayList myTimeStampsDiff = new ArrayList();
                    Iterator myIteratorT = timestampsCounters.getKeysIterator();
                    String thisT = (String) myIteratorT.next();
                    while (myIteratorT.hasNext())
                        {
                        String nextT = (String) myIteratorT.next();
                        double diff = new TimeStamp1(nextT).minutesDiff(new TimeStamp1(thisT));
                        myTimeStampsDiff.add(diff);
                        thisT = nextT;
                        }
                    double mean = myLineGroupper.getMean(myTimeStampsDiff);
                    double deviation = myLineGroupper.getDeviation(myTimeStampsDiff);
                   if (mean / deviation > 2 && mean > 60)
                        {
                        out.println("<p><b>"+nextsource +" </b>is repeating almost every "+ (int)mean/60+" hours  for (at least) " + sourceCounters.getCount(nextsource) + " times");
                        }
                    }
                }
            catch (Exception e)
                {
                e.printStackTrace();
                }
            }

        


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

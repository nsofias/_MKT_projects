package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.fileIO.FileParser2Daemon;
import radius.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import nsofiasLib.time.TimeStamp1;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public ArrayList<String> getStuckedSessions(RadiusLog_LineParserListener myContainer, int minutesBack)
        {
        String timestam_lastSession = myContainer.getTimestam_lastSession();
        ArrayList<String> stucks = new ArrayList();
        TimeStamp1 oldTimestamp = new TimeStamp1(timestam_lastSession+".000");
        oldTimestamp.addMinutes(-minutesBack);
        String oldTimestamp_ = oldTimestamp.getNowUnformated();
        for (String key : myContainer.getEventsContainer().keySet())
            {
            RadiusSessionRecord myRadiusLogRecord = myContainer.getEventsContainer().get(key);
            String sessionTime = myRadiusLogRecord.getTimeStamp();
                {
                if (sessionTime.compareTo(oldTimestamp_) < 0)
                    {
                    if (myRadiusLogRecord.isIsLive())
                        {
                        double dif = new TimeStamp1(timestam_lastSession+".000").hoursDiff( new TimeStamp1(sessionTime+".000") );
                        myContainer.getMyErrors().add(0, "live session " + myRadiusLogRecord.getId() + ": has not been updated for  " + dif + " hours");
                        stucks.add(key);
                        }
                    }
                }
            }
        return stucks;
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

      out.write('\n');
      out.write('\n');
  response.setCharacterEncoding("utf-8");
    //----------
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");
    FileParser2Daemon myDSLFileParserDaemon = (FileParser2Daemon) myContext.getAttribute("fileParserDaemon");
    //---------------------------
    String Reset = request.getParameter("Reset");
    String Start = request.getParameter("Start");
    String Stop = request.getParameter("Stop");
    String getStuckedSessions = request.getParameter("getStuckedSessions");
    String search = request.getParameter("search");
    //-----------------   
    if (getStuckedSessions != null)
        {
        //out.write("Reseting...");
        ArrayList<String> stucks = getStuckedSessions(myContainer, 120);
        for (String myStuck :stucks)
            {
            out.println(myStuck.toString());
            }
        }    
    if (Reset != null)
        {
        //out.write("Reseting...");
        myContainer.resetCounters();
        }
    if (Stop != null)
        {
        System.out.println("Collector: STOPPED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated());
        myDSLFileParserDaemon.setRunning(false);
        }
    if (Start != null)
        {
        //out.write("Starting");        
        System.out.println("Collector: STATRED by: " + session.getAttribute("username") + " at " + new TimeStamp1().getNowFormated());
        if (myDSLFileParserDaemon.isStopped())
            {
            myDSLFileParserDaemon.setRunning(true);
            new Thread(myDSLFileParserDaemon).start();
            }
        }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>RadiusLog_LineParserListener</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>RadiusLog_LineParserListener</h1>\n");
      out.write("        <p><h2>Collector Commands!</h2>\n");
      out.write("        <form action=\"index.jsp\">\n");
      out.write("            <input type=\"submit\" name=\"Reset\" value=\"Reset counters\" />\n");
      out.write("            ");
if (myDSLFileParserDaemon.isRunning())
                    { 
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"Stop\" value=\"Stop Daemon\" />\n");
      out.write("            <input type=\"submit\" disabled=\"\" name=\"Start\" value=\"...\" />                    \n");
      out.write("            ");
} else
                { 
      out.write("\n");
      out.write("            <input type=\"submit\" disabled=\"\" name=\"Stop\" value=\"...\" />\n");
      out.write("            <input type=\"submit\" name=\"Start\" value=\"Start Daemon\" />                    \n");
      out.write("            ");
}
      out.write("\n");
      out.write("            \n");
      out.write("             <input type=\"submit\" name=\"getStuckedSessions\" value=\"getStuckedSessions\" />\n");
      out.write("            <input type=\"submit\" name=\"Refresh\" value=\"Refresh\" />\n");
      out.write("        </form>          \n");
      out.write("        <p>Counter_adds: ");
      out.print(myContainer.getCounter_startEvents());
      out.write("\n");
      out.write("        <p>Counter_updates: ");
      out.print(myContainer.getCounter_stopEvents());
      out.write("            \n");
      out.write("        <p>Last update: ");
      out.print(myContainer.getTimestam_lastSession());
      out.write("\n");
      out.write("        <p>Oldest session: ");
      out.print(myContainer.getOldestLiveSession());
      out.write("\n");
      out.write("        <p>Missing line ID errors: ");
      out.print(myContainer.getCounter_NoLineIdErros());
      out.write("\n");
      out.write("        <p>Bad timing errors: ");
      out.print(myContainer.getCounter_BadTimingErros());
      out.write("\n");
      out.write("        <p>Wrong State errors: ");
      out.print(myContainer.getCounter_WrongStateErros());
      out.write("        \n");
      out.write("        <p>Total sessions:");
      out.print(myContainer.getAllSessionsNumber());
      out.write("\n");
      out.write("            ");
  if (myContainer.getAllSessionsNumber() > 0)
            {
      out.write("\n");
      out.write("        <p>Live sessions: ");
      out.print(myContainer.getLiveSessionsNumber());
      out.write(" ( ");
      out.print( 1.0 * myContainer.getLiveSessionsNumber() / myContainer.getAllSessionsNumber());
      out.write(" )\n");
      out.write("            ");
}
      out.write("   \n");
      out.write("\n");
      out.write("        <table width=\"100%\">              \n");
      out.write("            <tr>\n");
      out.write("                <td><iframe width=\"1500\" height=\"400\" src= \"lines.jsp?max=100&all\" frameborder= \"0\" ></iframe></td>                                                 \n");
      out.write("            </tr>      \n");
      out.write("            <tr>\n");
      out.write("                <td><iframe width=\"1500\" height=\"400\" src= \"errors.jsp\" frameborder= \"0\" ></iframe></td>                                                \n");
      out.write("            </tr>            \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

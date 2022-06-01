package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.PathRetrieverFactory;
import diligent_MKT.PathsRetriever;
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

public final class lines_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 private ArrayList filterOutMassive(ArrayList<String> allLines, Diligent_Daemon myGroupBy_Daemon, PathsRetriever myPatrhsRetriever) {
        ArrayList<String> myLines = new ArrayList();
        if (myGroupBy_Daemon != null) {
            ArrayList<String> linesMasive = new ArrayList();
            if (myPatrhsRetriever != null) {
                List<diligent_MKT.Alarm_FYROM> myLiveAlarms = myGroupBy_Daemon.getMyStatsObjContainer().getAlarmArrayList_stillAlive();
                for (diligent_MKT.Alarm_FYROM myAlarm : myLiveAlarms) {
                    linesMasive.addAll(myPatrhsRetriever.retrieveLines(myAlarm.getNetworkElementName()));
                }
            }
            //----------------
            for (String line : allLines) {
                if (!linesMasive.contains(line)) {
                    myLines.add(line);
                }
            }
        }
        return myLines;
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sequrityPart.jsp");
  }

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
 String userTypes = "00,01,02";
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    //String userTypes = "00,01,02";
    //  ----------- SEQURITY CHECK ---------------
    String request_URI = request.getRequestURI();
    request_URI = request_URI.substring(request_URI.lastIndexOf("/") + 1);
    String url = "login.jsp?request_URI=" + request_URI;
    String userType = (String) session.getAttribute("role");
    String username = (String) session.getAttribute("username");
    if (userType == null)
        {
      out.write('\n');
      if (true) {
        _jspx_page_context.forward(url);
        return;
      }
      out.write('\n');
  return;
    }
else if (userType.endsWith("-expired"))// password expired
        {
        
      out.write("\n");
      out.write("        <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, your password is expired!!!</font>\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("change_password.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");
return;
        }

      out.write('\n');
      out.write('\n');
      out.write('\n');

//----------- sequrity----------------
    try
        {
        if (!userTypes.contains(userType))
            {
            
      out.write("\n");
      out.write("            <font face=\"Verdana\" size=\"3\" color=\"#000080\">Sorry, you are not authorized to view this page!!!</font>\n");
      out.write("            ");
return;
            }
        }
    catch (Exception e)
        {
        }
//----------- sequrity end----------------

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

    ServletContext myContext = request.getServletContext();
    String type = request.getParameter("type");
    String STOPPED_NOT_MASSIVE = request.getParameter("STOPPED_NOT_MASSIVE");//
    String FOUR_G_BACKUP = request.getParameter("FOUR_G_BACKUP");
    String FOUR_G_BACKUP_STOPPED = request.getParameter("FOUR_G_BACKUP_STOPPED");

    ////STOPPED,FOUR_G_BACKUP,NOT_MASSIVE
    //out.println("alarms with ticketId:" + ticketId);
    Diligent_Daemon myGroupBy_Daemon = null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myDaemon : myGroupBy_Daemons) {
        if (type != null && (type.equals(myDaemon.getDesc()))) {
            myGroupBy_Daemon = myDaemon;
        }
    }
        PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
    ArrayList<String> finalArray = new ArrayList();
    String header = "";
    if (myGroupBy_Daemon != null) {
        if (STOPPED_NOT_MASSIVE != null) {
            ArrayList<String> allLines = new ArrayList();
            allLines.addAll(myPatrhsRetriever.retrieveStoppedLines());
            finalArray = filterOutMassive(allLines, myGroupBy_Daemon, myPatrhsRetriever);
            out.println("STOPPED Lines size = " + allLines.size());
            out.println("STOPPED_NOT_MASSIVE size = " + finalArray.size());
            header = "lines DISCONNECTED not due to massive fault (" + type + ")";
        } else if (FOUR_G_BACKUP_STOPPED != null) {
            FourG_backupDaemon myFourG_backupDaemon = (FourG_backupDaemon) myContext.getAttribute("myFourG_backupDaemon");
            finalArray.addAll(myFourG_backupDaemon.getStopped4G().values());
            header = "DISCONNECTED lines with 4G_BACKUP capability (" + type + ")";
        } else if (FOUR_G_BACKUP != null) {
            finalArray.addAll(PathRetrieverFactory.create(Alarm_FYROM.TYPE_COPPER).retrieve4GBackupLines());
            out.println("FOUR_G_BACKUP Lines size = " + finalArray.size());
            header = "lines with 4G_BACKUP capability (" + type + ")";
        }
    }


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Current status of affected customers</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>");
      out.print(header);
      out.write("</h1>\n");
      out.write("        <table  border='1' width='100%'>\n");
      out.write("            ");
  if (myPatrhsRetriever != null) {
                    Collections.sort(finalArray);
                    for (String line : finalArray) {
                        out.println("<tr><td>" + line + "</td></tr>");
                        out.flush();
                    }
                }
      out.write("       \n");
      out.write("        </table> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.utils.URLContextReader_object;
import java.util.Iterator;
import nsofiasLib.utils.CmdProcessBuilder;
import nsofiasLib.utils.mapper.Mapper;
import java.io.InputStreamReader;
import java.io.InputStream;
import nsofiasLib.utils.MailSender_new;
import nsofiasLib.time.TimeStamp1;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.util.Collections;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.FTPDaemon;
import java.text.NumberFormat;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import nsofiasLib.fileIO.FileParser2Daemon;
import java.util.ArrayList;
import java.util.List;

public final class logViewer_005falarms_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String flush = request.getParameter("flush");
    String errors = request.getParameter("errors");
    String notice = request.getParameter("notice");
    if (notice == null)
        {
        notice = "!@#$%";
        }

      out.write("\n");
      out.write("<form action=\"logViewer_alarms.jsp\">\n");
      out.write("    <input type=\"submit\" value=\"refresh\" name=\"refresh\" />\n");
      out.write("    <input type=\"submit\" value=\"flush\" name=\"flush\" />\n");
      out.write("    <input type=\"submit\" value=\"errors\" name=\"errors\" />\n");
      out.write("    <input type=\"text\" name=\"notice\" value=\"\" />\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");

    if (flush != null)
        {
        try
            {
            try
                {
                List<String> cmd = new ArrayList();
                cmd.add("/bin/bash");
                cmd.add("-c");
                cmd.add("> "+System.getenv("APPLICATIONS_PATH") + "/my.log");
                new CmdProcessBuilder().runCommand(cmd).toString();
                }
            catch (Exception e)
                {
                out.println(e.toString());
                }
            }
        catch (Exception e)
            {
            out.println("error:" + e.toString());
            }

        }
    //-----------------------------------
    if (errors != null)
        {
        try
            {
            String body = "";
            try
                {
                List<String> cmd = new ArrayList();
                //cmd.add("/bin/bash");
                //cmd.add("ping");
                //cmd.add("localhost");
                cmd.add("tail");
                cmd.add("-n10000");
                cmd.add("/opt/tomcat/apache-tomcat-8.5.37/logs/catalina.out");
                body += ("<p><h1>Diligent log file</h1>");
                String text[] = new CmdProcessBuilder().runCommand(cmd).toString().split("\n");
                for (String line : text)
                    {
                    if (line.contains("Exception") || line.contains("error") || line.contains("ERROR") || line.contains("Error"))
                        {
                        line = line.replace("\n", "<p>").replace("Exception", "<b><font color='red'>Exception</font></b>");
                        line = line.replace("\n", "<p>").replace("error", "<b><font color='red'>error</font></b>");
                        line = line.replace("\n", "<p>").replace("ERROR", "<b><font color='red'>error</font></b>");
                        line = line.replace("\n", "<p>").replace("Error", "<b><font color='red'>error</font></b>");
                        line = line.replace("SKOPIA", "MKT");
                        out.println("<p>" + line);
                        }
                    }

                }
            catch (Exception e)
                {
                body += e.toString();
                }
            }
        catch (Exception e)
            {
            out.println("error:" + e.toString());
            }
        }
    else
        {
        try
            {
            String body = "";
            try
                {
                List<String> cmd = new ArrayList();
                //cmd.add("/bin/bash");
                //cmd.add("ping");
                //cmd.add("localhost");
                cmd.add("tail");
                cmd.add("-n10000");
                cmd.add("/opt/tomcat/apache-tomcat-8.5.37/logs/catalina.out");
                body += ("<p><h1>Diligent log file</h1>");
                body += new CmdProcessBuilder().runCommand(cmd).toString()
                        .replace("Exception", "<b><font color='red'>Exception</font></b>")
                        .replace(notice, "<b><font color='red'>"+notice+"</font></b>")
                        .replace("\n", "<p>")
                        .replace("SKOPIA", "MKT");;
                out.println(body);
                }
            catch (Exception e)
                {
                body += e.toString();
                }
            }
        catch (Exception e)
            {
            out.println("error:" + e.toString());
            }
        }
    out.flush();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

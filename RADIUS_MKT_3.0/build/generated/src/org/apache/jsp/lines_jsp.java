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

public final class lines_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        String toCSVString(List<RadiusSessionRecord> myRadiusLogRecords, long max, String search)
            {
            int count = 0;
            String str = "";
            for (RadiusSessionRecord myRadiusLogRecord : myRadiusLogRecords)
                {
                String str1 = "<tr>";
                for (String e : myRadiusLogRecord.getMyValues())
                    {
                    str1 += "<td nowrap>";
                    str1 += e;
                    str1 += "</td>";
                    }
                str1 += "</tr>";
                if (search == null || str1.contains(search))
                    {
                    str += str1;
                    count++;
                    }
                if (count > max && count != -1)
                    {
                    break;
                    }
                }
            return str;
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
    String search = request.getParameter("search");
    //----------
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");
    long max = -1;
    try
        {
        max = Long.valueOf(request.getParameter("max"));
        }
    catch (Exception e)
        {
        }
    String state = request.getParameter("state");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Sessions</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            ");
  response.setCharacterEncoding("utf-8");
                try
                    {
                    List<RadiusSessionRecord> myRadiusLogRecords;
                    if (state == null)
                        {
                        myRadiusLogRecords = myContainer.getSessionsAsList();
                        }
                    else if (state.equals("live"))
                        {
                        myRadiusLogRecords = myContainer.getLiveSessionsAsList();
                        }
                    else if (state.equals("closed"))
                        {
                        myRadiusLogRecords = myContainer.getClosedSessionsAsList();
                        }
                    else
                        {
                        return;
                        }
                    out.println(toCSVString(myRadiusLogRecords, max, search));
                    }
                catch (Exception e)
                    {
                    out.println("connector_exception :" + e.toString());
                    }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>  \n");
      out.write("    ");
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

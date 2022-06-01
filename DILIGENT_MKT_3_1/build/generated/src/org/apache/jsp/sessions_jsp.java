package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nsofiasLib.utils.Counters;
import java.util.*;
import nsofiasLib.utils.CounterObjsGrouper;
import nsofiasLib.time.TimeStamp1;
import SKOPIA.Visitor;

public final class sessions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write('\n');
      out.write('\n');
 String userTypes = "00";
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>sessions Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ServletContext myContext = request.getServletContext();
            Counters myCounters = new Counters();
            try
                {
                myCounters = (Counters) myContext.getAttribute("browseCounters");
                myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
                }
            catch (Exception e)
                {
                }
            CounterObjsGrouper visitorsGrouper = (CounterObjsGrouper) request.getSession().getServletContext().getAttribute("visitors");
            ArrayList visitors = visitorsGrouper.getCounters();
            Collections.sort(visitors);

            int count = 0;
            for (int i = 0; i < visitors.size(); i++)
                {
                Visitor myVisitor = (Visitor) visitors.get(i);
                TimeStamp1 objTime = new TimeStamp1(myVisitor.getObjTime());
                TimeStamp1 now = new TimeStamp1();
                if (now.minutesDiff(objTime) < 5)
                    {
                    count++;
                    }
                }
            //-----------------
            String Reset = request.getParameter("Reset");
            if (Reset != null)
                {
                out.write("Reseting...");
                myCounters.clear();
                }

        
      out.write("\n");
      out.write("        <p>\n");
      out.write("        <form action=\"sessions.jsp\">\n");
      out.write("            <input type=\"submit\" name=\"Reset\" value=\"Reset counters\" />\n");
      out.write("            <input type=\"submit\" name=\"Refresh\" value=\"Refresh\" />\n");
      out.write("        </form> \n");
      out.write("        <p></p> \n");
      out.write("        <table style=\"text-align:left; font-size:20px;\" border=\"1\"  cellpadding=\"1\"  id=\"table1\" >                    \n");
      out.write("            ");

                List<String> labels = myCounters.getLabelsSortedBy(Counters.sortByCount);
                for (String label : labels) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(label);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(myCounters.getCount(label));
      out.write("</td>\n");
      out.write("            </tr>        \n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </Table>        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1> Active sessions : ");
      out.print(count);
      out.write("</h1>\n");
      out.write("        <table>\n");
      out.write("            ");


                for (int i = 0; i < visitors.size(); i++)
                    {
                    Visitor myVisitor = (Visitor) visitors.get(i);
                    String IPAddress = myVisitor.getIPAdress();
                    String visitor = myVisitor.getUser();
                    TimeStamp1 objTime = new TimeStamp1(myVisitor.getObjTime());
                    String objTimeS = new TimeStamp1(objTime).getNowFormated();
                    TimeStamp1 now = new TimeStamp1();
                    if (now.minutesDiff(objTime) < 5)
                    {
      out.write("\n");
      out.write("            <tr><td><b>");
      out.print(visitor);
      out.write('(');
      out.print(IPAddress);
      out.write(")</b></td><td><b>");
      out.print(objTimeS);
      out.write("</b></td></tr>                   \n");
      out.write("            ");
}
                else
                    {
      out.write("\n");
      out.write("            <tr><td>");
      out.print(visitor);
      out.write('(');
      out.print(IPAddress);
      out.write(")</td><td>");
      out.print(objTimeS);
      out.write("</td></tr>                         \n");
      out.write("            ");
}
                        }
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

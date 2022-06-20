package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import nsofiasLib.utils.CounterObjsGrouper;
import nsofiasLib.time.TimeStamp1;
import ccm.Visitor;

public final class sessions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>sessions Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");

        CounterObjsGrouper visitorsGrouper = (CounterObjsGrouper)request.getSession().getServletContext().getAttribute("visitors");
        ArrayList visitors = visitorsGrouper.getCounters();
        Collections.sort(visitors);
        
        int count=0;
        for (int i=0;i<visitors.size();i++)
            {
             Visitor myVisitor = (Visitor)visitors.get(i);
             TimeStamp1 objTime = new TimeStamp1(myVisitor.getObjTime());
             TimeStamp1 now  = new TimeStamp1();
             if (now.minutesDiff(objTime)<5)
                {count++;}                
            }        
        
        
        
      out.write("\r\n");
      out.write("        <h1> Active sessions : ");
      out.print(count);
      out.write("</h1>\r\n");
      out.write("        ");

        for (int i=0;i<visitors.size();i++)
            {
             Visitor myVisitor = (Visitor)visitors.get(i);
             String IPAddress = myVisitor.getIPAdress();
             TimeStamp1 objTime = new TimeStamp1(myVisitor.getObjTime());
             String objTimeS = new TimeStamp1(objTime).getNowFormated();
             TimeStamp1 now  = new TimeStamp1();
             if (now.minutesDiff(objTime)<5)
                {
      out.write("\r\n");
      out.write("                <b>");
      out.print(IPAddress);
      out.write("&nbsp;&nbsp;");
      out.print(objTimeS);
      out.write("</b>\r\n");
      out.write("                    <p>&nbsp;                    \r\n");
      out.write("                ");
}
             else
                {
      out.write("\r\n");
      out.write("                    ");
      out.print(IPAddress);
      out.write("&nbsp;&nbsp;");
      out.print(objTimeS);
      out.write("\r\n");
      out.write("                    <p>&nbsp;                    \r\n");
      out.write("                ");
}                 
            }
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

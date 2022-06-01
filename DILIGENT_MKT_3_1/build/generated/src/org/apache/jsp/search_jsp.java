package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import nsofiasLib.utils.URLContextReader_object;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import nsofiasLib.ote.alarms.*;
import java.util.Iterator;
import java.util.Collections;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                        String getUrl()
                            {
                            Properties properties = new Properties();
                            String APPLICATIONS_PATH = System.getenv("APPLICATIONS_PATH");//C:/my files/data/access7
                            try (FileInputStream myStream = new FileInputStream(APPLICATIONS_PATH + "/DSLMON_SKOPIA/conf/parameters.properties"))
                                {
                                properties.load(new InputStreamReader(myStream, "UTF8"));
                                return properties.getProperty("RETRIEVE_URL");
                                }
                            catch (Exception e)
                                {
                                return "";
                                }
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

      out.write('\n');
      out.write('\n');
 String userTypes = "00,01,02,03,04";
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
String search = request.getParameter("search");
    if (search == null)
        {
        search = "";
        }
    else
        {
        search = search.trim();
        }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Correlation info</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Customer Status Page</h1>\n");
      out.write("        <form name=\"F1\" action=\"search.jsp\">\n");
      out.write("            <h2>Please insert a line id (p.ex. F20392290)<h2>\n");
      out.write("                    <input type=\"text\" name=\"search\" value=\"");
      out.print(search);
      out.write("\" size=\"40\" />\n");
      out.write("                    <input type=\"submit\" value=\"Submit\" name=\"Submit\" />\n");
      out.write("                    </form>  \n");
      out.write("                    ");

                        if (search != null && !search.isEmpty())
                            {
                            String RETRIEVE_URL = getUrl() + "?search=" + URLEncoder.encode(search);
                            URLContextReader_object myUrlReader = new URLContextReader_object();
                            ArrayList<String> lines = myUrlReader.getUrlContext(RETRIEVE_URL, 120000, 120000);
                            for (String line : lines)
                                {
                                out.println("<p>" + line);
                                }
                            }
                    
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
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

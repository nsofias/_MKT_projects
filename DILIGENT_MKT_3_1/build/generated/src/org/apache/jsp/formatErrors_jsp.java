package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import diligent_MKT.PathRetrieverFactory;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.PathsRetriever;
import diligent_MKT.NCDB;
import java.util.Collections;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.fileIO.FileParser2;
import java.util.List;
import java.util.ArrayList;
import SKOPIA.*;

public final class formatErrors_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public void create_DiliAgent_DataFormatErrors_Report(String NCDBCheck, JspWriter out)
        {
        if (NCDBCheck != null)
            {
            ArrayList<String> myNCDBlist;
            try
                {
                myNCDBlist = NCDB.getDslamsDistinct();
                }
            catch (Exception e)
                {
                return;
                }
            //----------- copper ----------
            try
                {
                String str = "<p><h1>COPPER (NCDBCheck)</h1>";
                str += "<p><h1>COPPER Dslams (NCDBCheck)</h1>";
                PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_COPPER);
                ArrayList<String> mylist = myPathsRetriever.retrieveElements(3);
                out.println("Got " + mylist.size() + " dslams from RADIUS");
                out.println("Got " + myNCDBlist.size() + " dslams drom NCDB");
                out.flush();
                str += "<table width='100%'  border='1'>";
                for (String s : mylist)
                    {
                    //System.out.println(s);
                    if (!myNCDBlist.contains(s))
                        {
                        str += "<tr nowrap><td>DSLAM " + s + " not found in NCDB</td></tr>";
                        out.flush();
                        }
                    }
                str += "</table>";
                out.println(str);
                out.flush();
                }
            catch (Exception e)
                {
                }
            //----------- gpon ----------
            try
                {
                String str = "<p><h1>GPON (NCDBCheck)</h1>";
                str += "<p><h1>COPPER OLTs (NCDBCheck)</h1>";
                PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_GPON);
                ArrayList<String> mylist = myPathsRetriever.retrieveElements(2);
                out.println("Got " + mylist.size() + " OLTs from RADIUS");
                out.println("Got " + myNCDBlist.size() + " OLTs drom NCDB");
                out.flush();
                str += "<table width='100%'  border='1'>";
                for (String s : mylist)
                    {
                    //System.out.println(s);
                    if (!myNCDBlist.contains(s))
                        {
                        str += "<tr nowrap><td>OLT " + s + " not found in NCDB</td></tr>";
                        out.flush();
                        }
                    }
                str += "</table>";
                out.println(str);
                out.flush();
                }
            catch (Exception e)
                {
                }
            }
        //**************************************************************************
        //**************************************************************************
        //**************************************************************************
        try
            {
            String str = "<p><h1>COPPER</h1>";
            PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_COPPER);
            ArrayList<String> errors = myPathsRetriever.retrieveAggrErrors();
            str += "<table width='100%'  border='1'>";
            for (String s : errors)
                {
                //System.out.println(s);
                str += "<tr nowrap><td>" + s + "</td></tr>";
                }
            str += "</table>";
            out.println(str);
            out.flush();
            }
        catch (Exception e)
            {
            }
        //------------------------------
        try
            {
            String str = "<p><h1>COPPER(passive)</h1>";
            PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_COPPER_CABLE);
            ArrayList<String> errors = myPathsRetriever.retrieveAggrErrors();
            str += "<table width='100%'  border='1'>";
            for (String s : errors)
                {
                //System.out.println(s);
                str += "<tr nowrap><td>" + s + "</td></tr>";
                }
            str += "</table>";
            out.println(str);
            out.flush();
            }
        catch (Exception e)
            {
            }
        //------------------------------
        try
            {
            String str = "<p><h1>GPON</h1>";
            PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_GPON);
            ArrayList<String> errors = myPathsRetriever.retrieveAggrErrors();
            str += "<table width='100%'  border='1'>";
            for (String s : errors)
                {
                //System.out.println(s);
                str += "<tr nowrap><td>" + s + "</td></tr>";
                }
            str += "</table>";
            out.println(str);
            out.flush();
            }
        catch (Exception e)
            {
            }
        //------------------------------
        try
            {
            String str = "<p><h1>GPON (Passive)</h1>";
            PathsRetriever myPathsRetriever = new PathRetrieverFactory().create(Alarm_FYROM.TYPE_GPON_CABLE);
            ArrayList<String> errors = myPathsRetriever.retrieveAggrErrors();
            str += "<table width='100%'  border='1'>";
            for (String s : errors)
                {
                //System.out.println(s);
                str += "<tr nowrap><td>" + s + "</td></tr>";
                }
            str += "</table>";
            out.println(str);
            out.flush();
            }
        catch (Exception e)
            {
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"global_1.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Diligent input flow Data Format Errors Report</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String NCDBCheck = request.getParameter("NCDBCheck");
            out.println("<h1> DiligentMKT input format errors on " + new TimeStamp1().getNowFormated() + "</h1>");
            create_DiliAgent_DataFormatErrors_Report(NCDBCheck, out);
        
      out.write("\n");
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

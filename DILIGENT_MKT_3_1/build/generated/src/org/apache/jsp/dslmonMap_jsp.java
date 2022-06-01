package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import nsofiasLib.ote.DSLAMs.DslamDetailsFinder;
import OPENMAP.Alarm;
import OPENMAP.Circle;
import OPENMAP.smallestenclosingcircle;
import java.net.URLConnection;
import java.net.URL;
import OPENMAP.Point;
import nsofiasLib.utils.Counters;
import nsofiasLib.time.TimeStamp1;
import java.util.List;
import java.util.ArrayList;

public final class dslmonMap_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

    ArrayList<Alarm> alarms = new ArrayList();
    DslamDetailsFinder myDslamDetailsFinder = new DslamDetailsFinder();
    //--------------------------
    
    String[] resources = null;
    try
        {
        resources = request.getParameter("alarms").split(",");
        }
    catch (Exception e)
        {
        out.println("Enough, Im out of here!!!");
        return;
        }
    String errorStr = "";
    for (String myAlarmStr : resources)
        {
        String source = null;
        try
            {
            String[] myAlarmStrSlitted = myAlarmStr.split(":");
            source = myAlarmStrSlitted[0];
            String status = myAlarmStrSlitted[1];
            String type = myAlarmStrSlitted[2];
            String eType = myAlarmStrSlitted[3];
            Alarm myAlarm = new Alarm(source, status, type, eType);
            if (type.equals(Alarm.typeEquipment) && eType.equals(Alarm.EquipmentDslam))
                {
                String myDslam = myAlarm.getSource();
                String hostName = myDslamDetailsFinder.getDslamDetails(myDslam).getMyHostName();
                int MyDslPorts= myDslamDetailsFinder.getDslamDetails(myDslam).getMyDslPorts();                
                String[] coords = myDslamDetailsFinder.getDslamDetails(myDslam).getCoords().split(",");
                double lat_i = Double.parseDouble(coords[0]);
                double lon_i = Double.parseDouble(coords[1]);
                Point myPoint = new Point("Dslam: " + myDslam + "( " + hostName + " ) DslPorts:"+MyDslPorts, lon_i, lat_i);
                myAlarm.setCoords(myPoint);                            
                alarms.add(myAlarm);                
                }
            }
        catch (Exception e)
            {
            errorStr = errorStr + " " + source;
            }
        }
    if (!errorStr.isEmpty())
        {
        out.println("No coords for " + errorStr);
        }



      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <body>         \r\n");
      out.write("        <div id=\"mapdiv\"></div>\r\n");
      out.write("        <script src=\"http://www.openlayers.org/api/OpenLayers.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("        var options = {\r\n");
      out.write("                  controls: [\r\n");
      out.write("                    new OpenLayers.Control.Navigation(),\r\n");
      out.write("                    new OpenLayers.Control.PanZoomBar()\r\n");
      out.write("                  ]\r\n");
      out.write("                };            \r\n");
      out.write("            map = new OpenLayers.Map(\"mapdiv\",options);\r\n");
      out.write("            map.addLayer(new OpenLayers.Layer.OSM());\r\n");
      out.write("            var markers = new OpenLayers.Layer.Markers(\"Markers\");\r\n");
      out.write("            map.addLayer(markers);\r\n");
      out.write("            ");
  for (Alarm myAlarm : alarms)
                    {
                    Point myPoint = myAlarm.getCoords();
                    String desc = myPoint.name;
                    try
                        {
      out.write("\r\n");
      out.write("            var lonLat = new OpenLayers.LonLat(");
      out.print(myPoint.x);
      out.write(',');
      out.print(myPoint.y);
      out.write(")\r\n");
      out.write("                    .transform(\r\n");
      out.write("                            new OpenLayers.Projection(\"EPSG:4326\"), // transform from WGS 1984\r\n");
      out.write("                            map.getProjectionObject() // to Spherical Mercator Projection\r\n");
      out.write("                            );\r\n");
      out.write("            \r\n");
      out.write("            var size = new OpenLayers.Size(21,25);\r\n");
      out.write("            var offset = new OpenLayers.Pixel(-(size.w/2), -size.h); \r\n");
      out.write("            var icon;            \r\n");
          if (myAlarm.getStatus().equals(Alarm.statusInactive))
                {
      out.write("\r\n");
      out.write("                var icon = new OpenLayers.Icon('http://172.16.167.5:8080/OPENMAP/sad_I.jpg', size, offset); \r\n");
      out.write("                var myMarker = new OpenLayers.Marker(lonLat,icon);\r\n");
      out.write("                //myMarker.setOpacity(0.4);  \r\n");
              }
            else       
                {
      out.write("\r\n");
      out.write("                var icon = new OpenLayers.Icon('http://172.16.167.5:8080/OPENMAP/sad_A.jpg', size, offset); \r\n");
      out.write("                var myMarker = new OpenLayers.Marker(lonLat,icon);\r\n");
              }
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            myMarker.events.register('mousedown', myMarker, function (evt) {\r\n");
      out.write("                myPopup=new OpenLayers.Popup.FramedCloud(\"Popup\", new OpenLayers.LonLat(");
      out.print(myPoint.x);
      out.write(',');
      out.print(myPoint.y);
      out.write(")\r\n");
      out.write("                    .transform(\r\n");
      out.write("                            new OpenLayers.Projection(\"EPSG:4326\"), // transform from WGS 1984\r\n");
      out.write("                            map.getProjectionObject() // to Spherical Mercator Projection\r\n");
      out.write("                            ), null, '");
      out.print(desc);
      out.write("', null, true);\r\n");
      out.write("                map.addPopup(myPopup);\r\n");
      out.write("                OpenLayers.Event.stop(evt);\r\n");
      out.write("            });\r\n");
      out.write("            markers.addMarker(myMarker);\r\n");
      out.write("\r\n");
      out.write("            // A popup with some information about our location\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
          }
                    catch (Exception e)
                        {
                        System.out.println("OPENMAP error: Not found marker");
                        }
                    }
            
      out.write("\r\n");
      out.write("            var lonLatCenter = new OpenLayers.LonLat(21.42, 41.99)\r\n");
      out.write("                    .transform(\r\n");
      out.write("                            new OpenLayers.Projection(\"EPSG:4326\"), // transform from WGS 1984\r\n");
      out.write("                            map.getProjectionObject() // to Spherical Mercator Projection\r\n");
      out.write("                            );\r\n");
      out.write("            var zoom = 7;\r\n");
      out.write("            map.setCenter(lonLatCenter, zoom);\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body></html>");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.nio.charset.StandardCharsets;
import nsofiasLib.others.Helpme;
import java.util.Optional;
import ccm.MKT.Ticket_MKT;
import diligent_MKT.Alarm_FYROM;
import ccm.AlarmsDetectionListener;
import ccm.CCMonitorStatsObjsContainer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
import CoordsUtils.KMeans;
import java.util.stream.Collectors;
import CoordsUtils.Circle;
import java.util.Set;
import CoordsUtils.SmallestClosingCircle;
import CoordsUtils.Outliers;
import CoordsUtils.Point;
import nsofiasLib.utils.Counters;
import java.net.URLEncoder;
import java.util.Collections;
import nsofiasLib.time.TimeStamp1;
import java.text.NumberFormat;
import com.google.gson.Gson;
import java.net.URLDecoder;
import nsofiasLib.utils.URLContextReader_object;
import java.util.ArrayList;
import nsofiasLib.others.Parameters;
import nsofiasLib.utils.Counters1;
import java.util.List;
import java.util.Map;
import nsofiasLib.others.SimpleDaemon;

public final class map_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    static Double[] findLatLonOfATC(List<String> allATCsCoords, String myATC) {
        try {
            Optional<Double[]> res = allATCsCoords.stream().filter(v -> v.contains(myATC + ";"))
                    .findAny().map(v -> v.split(";"))
                    .map(v -> new Double[]{Double.valueOf(v[2].replace(",", ".")), Double.valueOf(v[3].replace(",", "."))});
            return res.orElse(null);
        } catch (Exception e) {
            return null;
        }
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    response.setCharacterEncoding("utf-8");
    String lat = request.getParameter("lat");
    String lon = request.getParameter("lon");
    ServletContext myContext = request.getServletContext();
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
    AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
    Circle circle = new Circle(new Point(21.4248902, 41.980903), 1000);//23.8048027,38.0080677
    int zoom = 9;
    //***************************************************************
    List<Point> points_ALL = new ArrayList();
    //***************************************************************
    if (lat != null && lon != null) {
        double latD = Double.valueOf(lat);
        double lonD = Double.valueOf(lon);
        Double d[] = new Double[]{latD, lonD};
        Point myPoint = new Point(d[1], d[0]);
        points_ALL.add(myPoint);
        out.print("points_ALL = " + points_ALL);
    } else {
        points_ALL = myCCMonitorStatsObjsContainer.getAlarmArrayList().values().stream()
                .filter(v -> v.getTicketId() != null && v.isStilAlive())
                .map(v -> (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(v.getTicketId()))
                .filter(v -> v != null)
                .map(v -> v.getLatLon())
                .filter(v -> v != null)
                .map(d -> new Point(d[1], d[0]))
                .peek(p -> {
                    try {
                        System.out.println("coords=" + p);
                    } catch (Exception e) {
                    }
                }
                )
                .collect(Collectors.toList());
    }
    if (!points_ALL.isEmpty()) {
        circle = SmallestClosingCircle.makeCircle(points_ALL);
    }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>   \r\n");
      out.write("        <title>XXL-Mobile MAP</title>\r\n");
      out.write("        <meta http-equiv=\"refresh\" content=\"60\" >\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"global.css\">\r\n");
      out.write("        <script src=\"OpenLayers.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            var map, layer;\r\n");
      out.write("            function init() {\r\n");
      out.write("                OpenLayers.ProxyHost = \"/proxy/?url=\";\r\n");
      out.write("                map = new OpenLayers.Map('map');\r\n");
      out.write("                map.addLayer(new OpenLayers.Layer.OSM());\r\n");
      out.write("                var markers = new OpenLayers.Layer.Markers(\"Markers\");\r\n");
      out.write("                map.addLayer(markers);\r\n");
      out.write("                var size = new OpenLayers.Size(21, 25);\r\n");
      out.write("            ");
//********************************************************************
                for (Point myPoint : points_ALL) {
                    myPoint.setIconUrl("./img/marker.png");
                    String desc = myPoint.name;
                    //System.out.println("OPENMAP: myPoint = " + desc + " @ " + myPoint.toString());
                    if (!myPoint.x.isNaN()) {
                        try {
      out.write("\r\n");
      out.write("                var lonLat = new OpenLayers.LonLat(");
      out.print(myPoint.x);
      out.write(',');
      out.print(myPoint.y);
      out.write(")\r\n");
      out.write("                        .transform(\r\n");
      out.write("                                new OpenLayers.Projection(\"EPSG:4326\"), // transform from WGS 1984\r\n");
      out.write("                                map.getProjectionObject() // to Spherical Mercator Projection\r\n");
      out.write("                                );\r\n");
      out.write("                var size = new OpenLayers.Size(21, 25);\r\n");
      out.write("                var offset = new OpenLayers.Pixel(-(size.w / 2), -size.h);\r\n");
      out.write("                var icon;\r\n");
      out.write("                var icon = new OpenLayers.Icon('");
      out.print(myPoint.getIconUrl());
      out.write("', size, offset);\r\n");
      out.write("                var myMarker = new OpenLayers.Marker(lonLat, icon);\r\n");
      out.write("                myMarker.events.register('mousedown', myMarker, function (evt) {\r\n");
      out.write("                    myPopup = new OpenLayers.Popup.FramedCloud(\"Popup\", new OpenLayers.LonLat(");
      out.print(myPoint.x);
      out.write(',');
      out.print(myPoint.y);
      out.write(")\r\n");
      out.write("                            .transform(\r\n");
      out.write("                                    new OpenLayers.Projection(\"EPSG:4326\"), // transform from WGS 1984\r\n");
      out.write("                                    map.getProjectionObject() // to Spherical Mercator Projection\r\n");
      out.write("                                    ), null, '");
      out.print(desc);
      out.write("', null, true);\r\n");
      out.write("                    map.addPopup(myPopup);\r\n");
      out.write("                    OpenLayers.Event.stop(evt);\r\n");
      out.write("                });\r\n");
      out.write("                markers.addMarker(myMarker);\r\n");
      out.write("            ");
  } catch (Exception e) {
                            System.out.println("OPENMAP error: Not found marker:" + e.toString());
                        }
                    }
                }
            
      out.write("\r\n");
      out.write("                var lonLatCenter = new OpenLayers.LonLat(");
      out.print(circle.c.x);
      out.write(',');
      out.write(' ');
      out.print(circle.c.y);
      out.write(")\r\n");
      out.write("                        .transform(\r\n");
      out.write("                                new OpenLayers.Projection(\"EPSG:4326\"), // transform from WGS 1984\r\n");
      out.write("                                map.getProjectionObject() // to Spherical Mercator Projection\r\n");
      out.write("                                );\r\n");
      out.write("                var zoom = ");
      out.print(zoom);
      out.write(";\r\n");
      out.write("                map.setCenter(lonLatCenter, zoom);\r\n");
      out.write("                //--------------- circle ---------------------\r\n");
      out.write("                var projection = map.getProjectionObject();\r\n");
      out.write("                var resolutionAtEquator = view.getResolution();\r\n");
      out.write("                var pointResolution = projection.getPointResolution(resolutionAtEquator, lonLatCenter);\r\n");
      out.write("                var resolutionFactor = resolutionAtEquator / pointResolution;\r\n");
      out.write("                var radius1 = (radius / OpenLayers.proj.METERS_PER_UNIT.m) * resolutionFactor;\r\n");
      out.write("                var circle = new OpenLayers.geom.Circle(center, radius1);\r\n");
      out.write("                var circleFeature = new OpenLayers.Feature(circle);\r\n");
      out.write("                // Source and vector layer\r\n");
      out.write("                var vectorSource = new OpenLayers.source.Vector({\r\n");
      out.write("                    projection: 'EPSG:4326'\r\n");
      out.write("                });\r\n");
      out.write("                vectorSource.addFeature(circleFeature);\r\n");
      out.write("                var vectorLayer = new OpenLayers.layer.Vector({\r\n");
      out.write("                    source: vectorSource\r\n");
      out.write("                });\r\n");
      out.write("                map.addLayer(vectorLayer);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>     \r\n");
      out.write("    <body onload=\"init()\">\r\n");
      out.write("        <div id=\"map\" class=\"smallmap\"></div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

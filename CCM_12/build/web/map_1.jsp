<%@page import="java.nio.charset.StandardCharsets"%>
<%@page import="nsofiasLib.others.Helpme"%>
<%@page import="java.util.Optional"%>
<%@page import="ccm.MKT.Ticket_MKT"%>
<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="ccm.AlarmsDetectionListener"%>
<%@page import="ccm.CCMonitorStatsObjsContainer"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Arrays"%>
<%@page import="CoordsUtils.KMeans"%>
<%@page import="java.util.stream.Collectors"%>
<%@page import="CoordsUtils.Circle"%>
<%@page import="java.util.Set"%>
<%@page import="CoordsUtils.SmallestClosingCircle"%>
<%@page import="CoordsUtils.Outliers"%>
<%@page import="CoordsUtils.Point"%>
<%@page import="nsofiasLib.utils.Counters"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.Collections"%>
<%@page import="nsofiasLib.time.TimeStamp1"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="nsofiasLib.utils.URLContextReader_object"%>
<%@page import="java.util.ArrayList"%>
<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%
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
%>
<html>
    <head>   
        <title>XXL-Mobile MAP</title>
        <meta http-equiv="refresh" content="60" >
        <link rel="stylesheet" href="global.css">
        <script src="OpenLayers.js"></script>
        <script type="text/javascript">
            var map, layer;
            function init() {
                OpenLayers.ProxyHost = "/proxy/?url=";
                map = new OpenLayers.Map('map');
                map.addLayer(new OpenLayers.Layer.OSM());
                var markers = new OpenLayers.Layer.Markers("Markers");
                map.addLayer(markers);
                var size = new OpenLayers.Size(21, 25);
            <%//********************************************************************
                for (Point myPoint : points_ALL) {
                    myPoint.setIconUrl("./img/marker.png");
                    String desc = myPoint.name;
                    //System.out.println("OPENMAP: myPoint = " + desc + " @ " + myPoint.toString());
                    if (!myPoint.x.isNaN()) {
                        try {%>
                var lonLat = new OpenLayers.LonLat(<%=myPoint.x%>,<%=myPoint.y%>)
                        .transform(
                                new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                                map.getProjectionObject() // to Spherical Mercator Projection
                                );
                var size = new OpenLayers.Size(21, 25);
                var offset = new OpenLayers.Pixel(-(size.w / 2), -size.h);
                var icon;
                var icon = new OpenLayers.Icon('<%=myPoint.getIconUrl()%>', size, offset);
                var myMarker = new OpenLayers.Marker(lonLat, icon);
                myMarker.events.register('mousedown', myMarker, function (evt) {
                    myPopup = new OpenLayers.Popup.FramedCloud("Popup", new OpenLayers.LonLat(<%=myPoint.x%>,<%=myPoint.y%>)
                            .transform(
                                    new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                                    map.getProjectionObject() // to Spherical Mercator Projection
                                    ), null, '<%=desc%>', null, true);
                    map.addPopup(myPopup);
                    OpenLayers.Event.stop(evt);
                });
                markers.addMarker(myMarker);
            <%  } catch (Exception e) {
                            System.out.println("OPENMAP error: Not found marker:" + e.toString());
                        }
                    }
                }
            %>
                var lonLatCenter = new OpenLayers.LonLat(<%=circle.c.x%>, <%=circle.c.y%>)
                        .transform(
                                new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                                map.getProjectionObject() // to Spherical Mercator Projection
                                );
                var zoom = <%=zoom%>;
                map.setCenter(lonLatCenter, zoom);
                //--------------- circle ---------------------
                var projection = map.getProjectionObject();
                var resolutionAtEquator = view.getResolution();
                var pointResolution = projection.getPointResolution(resolutionAtEquator, lonLatCenter);
                var resolutionFactor = resolutionAtEquator / pointResolution;
                var radius1 = (radius / OpenLayers.proj.METERS_PER_UNIT.m) * resolutionFactor;
                var circle = new OpenLayers.geom.Circle(center, radius1);
                var circleFeature = new OpenLayers.Feature(circle);
                // Source and vector layer
                var vectorSource = new OpenLayers.source.Vector({
                    projection: 'EPSG:4326'
                });
                vectorSource.addFeature(circleFeature);
                var vectorLayer = new OpenLayers.layer.Vector({
                    source: vectorSource
                });
                map.addLayer(vectorLayer);
            }


        </script>     
    <body onload="init()">
        <div id="map" class="smallmap"></div>
    </body>
</html>


<%!
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
%>
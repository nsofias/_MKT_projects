<%@page import="java.io.InputStreamReader,java.io.BufferedReader,nsofiasLib.ote.DSLAMs.DslamDetailsFinder,OPENMAP.Alarm,OPENMAP.Circle,OPENMAP.smallestenclosingcircle,java.net.URLConnection,java.net.URL,OPENMAP.Point,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,java.util.List,java.util.ArrayList"%>
<%
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


%>

<html>
    <body>         
        <div id="mapdiv"></div>
        <script src="http://www.openlayers.org/api/OpenLayers.js"></script>
        <script>
        var options = {
                  controls: [
                    new OpenLayers.Control.Navigation(),
                    new OpenLayers.Control.PanZoomBar()
                  ]
                };            
            map = new OpenLayers.Map("mapdiv",options);
            map.addLayer(new OpenLayers.Layer.OSM());
            var markers = new OpenLayers.Layer.Markers("Markers");
            map.addLayer(markers);
            <%  for (Alarm myAlarm : alarms)
                    {
                    Point myPoint = myAlarm.getCoords();
                    String desc = myPoint.name;
                    try
                        {%>
            var lonLat = new OpenLayers.LonLat(<%=myPoint.x%>,<%=myPoint.y%>)
                    .transform(
                            new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                            map.getProjectionObject() // to Spherical Mercator Projection
                            );
            
            var size = new OpenLayers.Size(21,25);
            var offset = new OpenLayers.Pixel(-(size.w/2), -size.h); 
            var icon;            
<%          if (myAlarm.getStatus().equals(Alarm.statusInactive))
                {%>
                var icon = new OpenLayers.Icon('http://172.16.167.5:8080/OPENMAP/sad_I.jpg', size, offset); 
                var myMarker = new OpenLayers.Marker(lonLat,icon);
                //myMarker.setOpacity(0.4);  
<%              }
            else       
                {%>
                var icon = new OpenLayers.Icon('http://172.16.167.5:8080/OPENMAP/sad_A.jpg', size, offset); 
                var myMarker = new OpenLayers.Marker(lonLat,icon);
<%              }%>
            
            myMarker.events.register('mousedown', myMarker, function (evt) {
                myPopup=new OpenLayers.Popup.FramedCloud("Popup", new OpenLayers.LonLat(<%=myPoint.x%>,<%=myPoint.y%>)
                    .transform(
                            new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                            map.getProjectionObject() // to Spherical Mercator Projection
                            ), null, '<%=desc%>', null, true);
                map.addPopup(myPopup);
                OpenLayers.Event.stop(evt);
            });
            markers.addMarker(myMarker);

            // A popup with some information about our location


            <%          }
                    catch (Exception e)
                        {
                        System.out.println("OPENMAP error: Not found marker");
                        }
                    }
            %>
            var lonLatCenter = new OpenLayers.LonLat(21.42, 41.99)
                    .transform(
                            new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                            map.getProjectionObject() // to Spherical Mercator Projection
                            );
            var zoom = 7;
            map.setCenter(lonLatCenter, zoom);
        </script>


    </body></html>
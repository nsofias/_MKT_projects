<%@page import="diligent_MKT.PathRetrieverFactory"%>
<%@page import="diligent_MKT.PathsRetriever"%>
<%@page import="nsofiasLib.ote.alarms.*,java.util.Map,nsofiasLib.utils.URLContextReader_object,nsofiasLib.ote.DSLAMs.DslamDetailsFinder,nsofiasLib.ote.DSLAMs.DslamDetails,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>

<%-- 
    Document   : usersAffected
    Created on : Jan 23, 2019, 11:36:30 AM
    Author     : nsofias
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String type = request.getParameter("type");
    String lineID = request.getParameter("lineID");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Current status of affected customers</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>
        <h1>Current resources of customers with lineID: <%=lineID%> of type <%=type%></h1>
        <table>
            <%
                PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
                if (myPatrhsRetriever != null) {
                    String path = myPatrhsRetriever.retrievePath(lineID);
                    String elType = "";
                    if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER)) {
                        elType = "<tr><th>SERVING_AREA</th><th>ATC</th><th>DSLAM</th><th>slot</th></tr>";
                    } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE)) {
                        elType = "<th>RSU</th><th>Cable</th><th>DP</th>";
                    } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON)) {
                        elType = "<th>ATC</th><th>OLT</th><th>Shelf</th><th>Slot</th>";
                    } else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE)) {
                        elType = "<th>ATC</th><th>Cable</th><th>BOX</th>";
                    }
                    String str = "<tr>";
                    for (String elementName_1 : path.split(";")) {
                        str = str + "<td>" + elementName_1 + "</td>";
                    }
                    str = str + "</tr>";
                    out.println(elType);
                    out.println(str);
                }
            %>       
        </table>
    </body>
</html>

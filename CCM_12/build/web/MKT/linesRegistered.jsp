
<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="diligent_MKT.PathsRetriever"%>
<%@page import="diligent_MKT.PathRetrieverFactory"%>
<%@page import="nsofiasLib.ote.alarms.*,java.util.Map,nsofiasLib.utils.URLContextReader_object,nsofiasLib.ote.DSLAMs.DslamDetailsFinder,nsofiasLib.ote.DSLAMs.DslamDetails,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    String type = request.getParameter("type");
    String path = request.getParameter("path");
    out.println("type="+type+" path="+path);
    out.flush();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registered lines</title>
        <link rel="stylesheet" href="../global.css">
    </head>
    <body>
        <h1>Current lines for <%=path%> </h1>        
        <table  border='1' width='100%'>
            <%            
                PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
                if (myPatrhsRetriever != null) {
                    ArrayList<String> myLines = myPatrhsRetriever.retrieveLines(path);
                    Collections.sort(myLines);
                    for (String line : myLines) {
                        out.println("<tr><td>" + line + "</td></tr>");
                }
            }%>       
        </table>
    </body>
</html>

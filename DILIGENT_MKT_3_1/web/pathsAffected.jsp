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
    String myPath = request.getParameter("path");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Current status of affected customers</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>
        <h1>Current status of affected customers for <%=myPath%> of type <%=type%></h1>
        <table>
            <%
                PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(type);
                if (myPatrhsRetriever != null) {
                    ArrayList<String> myPaths = myPatrhsRetriever.retrieveSubPaths(myPath);
                    for (String path : myPaths) {
                        out.println("<tr><td>" + path + "</td></tr>");
                    }
                }
            %>       
        </table>
    </body>
</html>

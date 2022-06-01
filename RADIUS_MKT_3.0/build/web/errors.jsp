<%@page import="nsofiasLib.fileIO.FileParser2Daemon,radius.*,java.util.Map,java.util.ArrayList,java.util.List,nsofiasLib.time.TimeStamp1"%>
<%-- 
    Document   : alarms
    Created on : Oct 17, 2018, 12:40:34 PM
    Author     : nsofias
--%>
<%  response.setCharacterEncoding("utf-8");
    //----------
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");
    ArrayList<String> errors= myContainer.getMyErrors();


%>
<!DOCTYPE html>
<html>


    <head>
        <title>Erros</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>                
        <table>
            <% for (String error:errors)
                {%>
                 <tr><td><%=error%></td></tr>
               <%}%>           
        </table>
    </body>  




<%-- 
    Document   : logs
    Created on : Jul 18, 2017, 1:39:13 PM
    Author     : nsofias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00";%>
<%@ include file = "sequrityPart.jsp"%>
    
<%
//----------- sequrity----------------
    try
        {
        if (!userTypes.contains(userType))
            {
            %>
            <font face="Verdana" size="3" color="#000080">Sorry, you are not authorized to view this page!!!</font>
            <%return;
            }
        }
    catch (Exception e)
        {
        }
//----------- sequrity end----------------
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Diligent Logs</h1>
        <table>
            <tr> 
                <td>
                    <div id="id1" style="position:relative; top: 0px; left: 0px;">        
                        <iframe src= "logViewer_system.jsp"  width= "800" height="800"></iframe>
                    </div> 
                </td>
                <td>
                    <div id="id2" style="position:relative; top: 0px; left: 0px;">        
                        <iframe src= "logViewer_alarms.jsp"  width= "800" height="800"></iframe>
                    </div> 
                </td>
            </tr>
        </table>
    </body>
</html>

<%-- 
    Document   : logs
    Created on : Jul 18, 2017, 1:39:13 PM
    Author     : nsofias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02,03,04,05";%>
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
        <link rel="stylesheet" href="global_1.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=username%>, &nbsp wellcome to Diligent!</h1>
        <h2>You may proceed selecting from the left menu </h2>
        <p><h3>enjoy! </h3>
       
    </body>
</html>

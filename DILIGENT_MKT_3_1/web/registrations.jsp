<%-- 
    Document   : registrations_perUA
    Created on : Nov 1, 2018, 10:19:14 PM
    Author     : nsofias
--%>
<%@page import="SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02";%>
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
<%
    String type = request.getParameter("type");
    String order_Desc = request.getParameter("order_Desc");
    String net_type_fix = request.getParameter("net_type_fix");
    String net_type_mobile = request.getParameter("net_type_mobile");
    String maxDataToDisplay = request.getParameter("maxDataToDisplay");
    if (maxDataToDisplay ==null)
        maxDataToDisplay="600";
    String quiryStr = "type=" + type+"&maxDataToDisplay="+maxDataToDisplay;
    if (net_type_fix != null)
        {
        quiryStr += "&net_type_fix=" + net_type_fix;
        }
    if (net_type_mobile != null)
        {
        quiryStr += "&net_type_mobile=" + net_type_mobile;
        }
    if (order_Desc!=null)
        {
        quiryStr += "&order_Desc=y";
        }
%>
<html>
    <head>
        <link rel="stylesheet" href="global_1.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=type%></h1>
<% 
   if (type != null && type.startsWith("Registrations") )
    {%> 
    <h2>Last hour UNIQUE registrations number</h2>
    <%}  %>    

        <table  width="100%">
            <tr>
                <td><iframe width="650" height="700" src= "reggr.jsp?<%=quiryStr%>" frameborder= "0"></iframe> </td>
                <td><iframe width="700" height="700" src= "reggr_text.jsp?<%=quiryStr%>" frameborder= "0"></iframe> </td>
            </tr>
        </table>
    </body>
</html>

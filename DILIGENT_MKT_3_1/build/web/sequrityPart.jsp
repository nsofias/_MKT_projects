<%-- 
    Document   : sequrityPart.jsp
    Created on : 16 Μαρ 2020, 2:33:16 μμ
    Author     : nsofias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    //String userTypes = "00,01,02";
    //  ----------- SEQURITY CHECK ---------------
    String request_URI = request.getRequestURI();
    request_URI = request_URI.substring(request_URI.lastIndexOf("/") + 1);
    String url = "login.jsp?request_URI=" + request_URI;
    String userType = (String) session.getAttribute("role");
    String username = (String) session.getAttribute("username");
    if (userType == null)
        {%>
<jsp:forward page="<%=url%>"/>
<%  return;
    }
else if (userType.endsWith("-expired"))// password expired
        {
        %>
        <font face="Verdana" size="3" color="#000080">Sorry, your password is expired!!!</font>
        <jsp:forward page="change_password.jsp"/>
        <%return;
        }
%>


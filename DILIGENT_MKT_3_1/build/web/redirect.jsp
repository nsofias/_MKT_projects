<%-- 
    Document   : redirect
    Created on : Feb 3, 2016, 10:55:34 AM
    Author     : nsofias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>You are redirected to Dili@gent site! If you don't you should ask ACCESS TO 172.16.167.7:8080 (A. Tsironis or Androulidakis Stelios)</h1>
        <%
            //  ----------- SEQURITY CHECK ---------------
            StringBuffer request_URI = request.getRequestURL();
            String request_URI_s = request_URI.toString();
            request_URI_s = request_URI_s.replace("172.16.167.5", System.getenv("diligent"));
            response.setStatus(response.SC_SERVICE_UNAVAILABLE);           
            response.sendRedirect(request_URI_s);
        %>        
    </body>
</html>

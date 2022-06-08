<%-- 
    Document   : askSVR
    Created on : Jun 8, 2022, 12:26:02 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Waiting from SVT...</h1>
        <%
            out.flush(); 
            String lineID = request.getParameter("lineID");  
            try {
                String res_ = svt_mkt_ws.SVT_MKT_ws.checkLineService(lineID);
                out.println(res_);
            } catch (Exception e) {
                e.printStackTrace();
            }%>
    </body>
</html>

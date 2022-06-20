<%-- 
    Document   : askSVR
    Created on : Jun 8, 2022, 12:26:02 PM
    Author     : Administrator
--%>

<%@page import="nsofiasLib.utils.JsonToHtmlConverter"%>
<%@page import="com.google.gson.Gson"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            .json_object { 
                margin:10px;
                padding-left:10px;
                border-left:1px solid #ccc
            }
            .json_key {
                font-weight: bold;
            }
        </style>        
        <h1>Waiting from SVT...</h1>
        <%
            out.flush();
            String lineID = request.getParameter("lineID");
            String res_="N/A";
            try {
                res_ = svt_mkt_ws.SVT_MKT_ws.checkLineServiceNEW_SVT(lineID);
                String myOutput = new JsonToHtmlConverter().getHtmlData(res_);
                out.println(myOutput);
            } catch (Exception e) {
                out.println(res_);
                e.printStackTrace();
            }%>
    </body>
</html>

<%-- 
    Document   : index
    Created on : May 10, 2021, 5:43:05 PM
    Author     : nsofias
--%>
<%@page import="diligent_MKT.Ticket_FYROM"%>
<%@page import="ccm.MKT.Ticket_MKT"%>
<%@page import="ccm.CCMTicket"%>
<%@page import="ccm.AlarmsDetectionListener"%>
<%@page import="siebel.TicketSiebel"%>
<%@page import="nsofiasLib.utils.JsonToHtmlConverter"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="nsofiasLib.utils.URLContextReader_object"%>
<%@page import="java.util.ArrayList"%>
<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%
    ServletContext myContext = session.getServletContext();
    AlarmsDetectionListener myAlarmsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
    //Ticket_MKT myTicket_MKT = null;
    //
    String myTicketId = request.getParameter("myTicketId");
    out.println("myTicketId=" + myTicketId);
    Ticket_FYROM myTicket_FYROM = null;
    if (myTicketId != null) {
        Ticket_MKT myTicket_MKT = (Ticket_MKT) myAlarmsDetectionListener.getTicketsMap().get(myTicketId);
        out.println("myTicket_MKT=" + myTicket_MKT.getSR());
        myTicket_FYROM = myTicket_MKT.getMyTicket_IBM();
    } else {
        String text = request.getParameter("text");
        if (text != null) {
            //out.println("text=" + text);out.flush();
            myTicket_FYROM = (Ticket_FYROM) new Gson().fromJson(text, Ticket_FYROM.class);
        }
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ticket_MKT</title>
        <link rel="stylesheet" href="global.css">
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
        <%
            out.println("<h1>ticket details</h1>");

            if (myTicket_FYROM != null) {
                out.println(new JsonToHtmlConverter().getHtmlData(new Gson().toJson(myTicket_FYROM)));
            } else {
                out.println("<h1>No ticket exists</h1>");
            }
        %>
    </body>
</html>





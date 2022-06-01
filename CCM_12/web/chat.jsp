<%@page import="nsofiasLib.utils.Counters"%>

<%
    ServletContext myContext=request.getServletContext();
    Counters myCounters = (Counters)myContext.getAttribute("browseCounters");
    try{
    myCounters.updateCounters(request.getRequestURI()+" -> "+request.getRemoteAddr());
    }catch(Exception e){} 
    %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

<frameset  rows ="70%,*">
    <frame name="up" scrolling="yes"  src="leftPage_perCC_TABLES.jsp">          
    <frame name="down" scrolling="yes"  src="chat/chat.jsp">
 <noframes>   
 <body>
  <p>This page uses frames, but your browser doesn't support them.</p>
  </body>
</noframes>      
</frameset>        

</html>

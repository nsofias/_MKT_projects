<%@page import="nsofiasLib.utils.Counters,java.util.ArrayList,nsofiasLib.time.TimeStamp1,ccm.CCMonitorStatsObjsContainer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
ServletContext myContext=request.getServletContext();
Counters myCounters = (Counters)myContext.getAttribute("browseCounters");
myCounters.updateCounters(request.getRequestURI());   
request.setCharacterEncoding("UTF-8");
String comment = request.getParameter("comment");
if (comment!=null && !comment.isEmpty())
    {
    TimeStamp1 now  = new TimeStamp1();
    String myTimeStamp = now.getNowFormated();
    comment = myTimeStamp +":"+comment; 
    CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer  = (CCMonitorStatsObjsContainer)myContext.getAttribute("statsObjContainer"); 
    ArrayList myComments = myCCMonitorStatsObjsContainer.getCommentsLogArrayList();
    myComments.add(0, comment);
    if (myComments.size()>3){myComments.remove(3);myComments.trimToSize();}
%>
<b><h1>Please close this window!!!</h1></b>
    <%
    return;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Share information with other users. Your text (latin characters) will be visible on the top of the screen for about half an hour</h1>
        <form action="shareInfo.jsp" method="POST">
            <input type="text" name="comment" value="" size="100" />
            <input type="submit" value="ok" />
        </form>
    </body>
</html>

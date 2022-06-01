<%@page import="java.util.*,nsofiasLib.utils.CounterObjsGrouper,nsofiasLib.time.TimeStamp1,ccm.Visitor"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sessions Page</title>
    </head>
    <body>
        
        <%
        CounterObjsGrouper visitorsGrouper = (CounterObjsGrouper)request.getSession().getServletContext().getAttribute("visitors");
        ArrayList visitors = visitorsGrouper.getCounters();
        Collections.sort(visitors);
        
        int count=0;
        for (int i=0;i<visitors.size();i++)
            {
             Visitor myVisitor = (Visitor)visitors.get(i);
             TimeStamp1 objTime = new TimeStamp1(myVisitor.getObjTime());
             TimeStamp1 now  = new TimeStamp1();
             if (now.minutesDiff(objTime)<5)
                {count++;}                
            }        
        
        
        %>
        <h1> Active sessions : <%=count%></h1>
        <%
        for (int i=0;i<visitors.size();i++)
            {
             Visitor myVisitor = (Visitor)visitors.get(i);
             String IPAddress = myVisitor.getIPAdress();
             TimeStamp1 objTime = new TimeStamp1(myVisitor.getObjTime());
             String objTimeS = new TimeStamp1(objTime).getNowFormated();
             TimeStamp1 now  = new TimeStamp1();
             if (now.minutesDiff(objTime)<5)
                {%>
                <b><%=IPAddress%>&nbsp;&nbsp;<%=objTimeS%></b>
                    <p>&nbsp;                    
                <%}
             else
                {%>
                    <%=IPAddress%>&nbsp;&nbsp;<%=objTimeS%>
                    <p>&nbsp;                    
                <%}                 
            }%>
    </body>
</html>

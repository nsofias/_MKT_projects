<%@page import="nsofiasLib.utils.Counters,java.util.*,nsofiasLib.utils.CounterObjsGrouper,nsofiasLib.time.TimeStamp1,SKOPIA.Visitor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00";%>
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

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sessions Page</title>
    </head>
    <body>
        <%
            ServletContext myContext = request.getServletContext();
            Counters myCounters = new Counters();
            try
                {
                myCounters = (Counters) myContext.getAttribute("browseCounters");
                myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
                }
            catch (Exception e)
                {
                }
            CounterObjsGrouper visitorsGrouper = (CounterObjsGrouper) request.getSession().getServletContext().getAttribute("visitors");
            ArrayList visitors = visitorsGrouper.getCounters();
            Collections.sort(visitors);

            int count = 0;
            for (int i = 0; i < visitors.size(); i++)
                {
                Visitor myVisitor = (Visitor) visitors.get(i);
                TimeStamp1 objTime = new TimeStamp1(myVisitor.getObjTime());
                TimeStamp1 now = new TimeStamp1();
                if (now.minutesDiff(objTime) < 5)
                    {
                    count++;
                    }
                }
            //-----------------
            String Reset = request.getParameter("Reset");
            if (Reset != null)
                {
                out.write("Reseting...");
                myCounters.clear();
                }

        %>
        <p>
        <form action="sessions.jsp">
            <input type="submit" name="Reset" value="Reset counters" />
            <input type="submit" name="Refresh" value="Refresh" />
        </form> 
        <p></p> 
        <table style="text-align:left; font-size:20px;" border="1"  cellpadding="1"  id="table1" >                    
            <%
                List<String> labels = myCounters.getLabelsSortedBy(Counters.sortByCount);
                for (String label : labels) {
            %>
            <tr>
                <td><%=label%></td>
                <td><%=myCounters.getCount(label)%></td>
            </tr>        
            <%}%>
        </Table>        



        <h1> Active sessions : <%=count%></h1>
        <table>
            <%

                for (int i = 0; i < visitors.size(); i++)
                    {
                    Visitor myVisitor = (Visitor) visitors.get(i);
                    String IPAddress = myVisitor.getIPAdress();
                    String visitor = myVisitor.getUser();
                    TimeStamp1 objTime = new TimeStamp1(myVisitor.getObjTime());
                    String objTimeS = new TimeStamp1(objTime).getNowFormated();
                    TimeStamp1 now = new TimeStamp1();
                    if (now.minutesDiff(objTime) < 5)
                    {%>
            <tr><td><b><%=visitor%>(<%=IPAddress%>)</b></td><td><b><%=objTimeS%></b></td></tr>                   
            <%}
                else
                    {%>
            <tr><td><%=visitor%>(<%=IPAddress%>)</td><td><%=objTimeS%></td></tr>                         
            <%}
                        }%>
        </table>
    </body>
</html>

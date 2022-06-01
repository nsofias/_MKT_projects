<%@page import="nsofiasLib.utils.Counters"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ServletContext myContext = request.getServletContext();
    Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
    try
        {
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        }
    catch (Exception e)
        {
        }
    String caller = request.getParameter("caller");
    if (caller == null)
        {
        caller = "";
        }
    System.out.println("CCM12:customerActivity-tools.jsp:caller=" + caller);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tools</title>
    </head>
    <body>
        <h1>Tools</h1>

        <h2>Customer Activity:</h2>
        <form action="tools.jsp" method="POST">
            <p><input type="text" name="caller" value="<%=caller%>" size="30" /> use 2112010020 for testing
            <p>   <input type="submit" name="submitCustomer" value="OK!" />
        </form>
    </body>
    <%if (caller != null)
            {%>
    <iframe width="100%" height="500" src='customerActivity.jsp?caller=<%=caller.trim()%>' frameborder= "0"></iframe>
        <%  }%>
</html>




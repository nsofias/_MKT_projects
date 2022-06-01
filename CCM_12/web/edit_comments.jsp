<%-- 
    Document   : edit_comments
    Created on : May 31, 2018, 11:35:17 AM
    Author     : nsofias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.net.URLDecoder,java.sql.ResultSet,nsofiasLib.databases.DatabaseLogger"%>

<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String comments = URLDecoder.decode(request.getParameter("comments"), "UTF-8");
    //out.println(comments);
    String elementName = request.getParameter("elementName");
    String start = request.getParameter("start");
    String submit = request.getParameter("submit");

    if (submit != null)
        {
        if (comments.trim().isEmpty())
            {
            comments="-";
            }
        DatabaseLogger myDatabaseLogger;
        myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/ccm?user=sa&password=trinitron");
        myDatabaseLogger.connect();

        String SQL_update = "UPDATE ccm.alarms SET  comments = '" + comments + "' WHERE elementName='" + elementName + "' AND start='" + start + "'";
        try
            {
            //out.println(SQL_update);
            myDatabaseLogger.writeln(SQL_update);
            myDatabaseLogger.close();
                %>
                <h3>Your comments for <%=elementName%>  @ <%=start%> updated successfully! <p>You can close this window now. <p>Please, notice that you have to refresh before updates become visible</h3>
                <%
                    }
                catch (Exception e)
                    {
                %>
                <h3>Your comments' for <%=elementName%>  @ <%=start%> update failed, sorry! Send this information to Administrator:<%=e.toString()%> <p>You can close this window now.</h3>
                <%
            }
        return;
        }
    else
        {
        DatabaseLogger myDatabaseLogger;
        myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/ccm?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        String SQL = "SELECT comments FROM ccm.alarms WHERE start='" + start + "' AND elementName ='" + elementName + "' ";
        ResultSet res = myDatabaseLogger.getResults(SQL);
        if (res.next())
            {
            comments = res.getString("comments").trim();
            }
        myDatabaseLogger.close();
        }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h3>Comments for <%=elementName%> @ <%=start%></h3>
        <form name="comments" action="edit_comments.jsp" method="POST" accept-charset="UTF-8">
            <textarea style="text-align: left" name="comments" rows="4" cols="20"><%=comments%></textarea>
            <input type="submit" value="submit comments" name="submit" />
            <input type="hidden" value="<%=elementName%>" name="elementName" />
            <input type="hidden" value="<%=start%>" name="start" />
        </form>
    </body>
</html>

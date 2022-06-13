<%@page import="ccm.Visitor,java.util.*,nsofiasLib.others.Parameters,nsofiasLib.utils.CounterObjsGrouper,nsofiasLib.time.TimeStamp1,nsofiasLib.databases.DatabaseLogger,java.io.File,java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  DatabaseLogger myDatabaseLogger = null;
            String myUsername = request.getParameter("j_username");
            String request_URI = request.getParameter("request_URI");
        //    if ( request_URI ==null || request_URI.isEmpty() || request_URI.equals("login.jsp") || request_URI.equals("null"))request_URI="index.jsp";
            //--------------------- 
            String connectionURL="";
            try
                {
                String userRole = null;
                String modules = null;
                String myPassword = request.getParameter("j_password");
                String jdbcDriver = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "jdbcDriver", "UTF8");
                connectionURL = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "connectionURL", "UTF8");
                myDatabaseLogger = new DatabaseLogger(jdbcDriver, connectionURL);
                myDatabaseLogger.connect();
                String sqlStr = "SELECT * FROM users WHERE users.username='" + myUsername + "' AND users.password='" + myPassword + "'";
                ResultSet res = myDatabaseLogger.getResults(sqlStr);
                //System.out.println(sqlStr);
                //
                if (res.next())  // authenticated
                    {
                    TimeStamp1 now = new TimeStamp1();
                    String today = now.getTodayUnformated();
                    String passwordExpiryDate = res.getString("passwordExpiryDate");                         // 20150101             
                    userRole = res.getString("role");
                    modules = res.getString("modules");
                    if (passwordExpiryDate.compareTo(today) < 0)
                        {
                        userRole = userRole + "-expired";
                        }
                    session.setAttribute("username", myUsername);
                    session.setAttribute("password", myPassword);
                    session.setAttribute("role", userRole);
                    session.setAttribute("modules", modules);
                    //
                    String IPAddr = request.getRemoteAddr();
                    CounterObjsGrouper visitorsGrouper = (CounterObjsGrouper) request.getSession().getServletContext().getAttribute("visitors");
                    ArrayList visitors = visitorsGrouper.getCounters();
                    for (int i = 0; i < visitors.size(); i++)
                        {
                        Visitor myVisitor = (Visitor) visitors.get(i);
                        String IPAddress = myVisitor.getIPAdress();
                        if (IPAddr.equals(IPAddress))
                            {
                            myVisitor.setUser(myUsername);
                            break;
                            }
                        }
                    myDatabaseLogger.close();
        %>            
        <jsp:forward page="<%=request_URI%>"/>
        <%return;
                }
            else
                {%>
        <b><font face="Verdana" size="3" color="#000080">Sorry, your authentication failed. Please go
                <a href="login.jsp">back</a> and try again!</font></b>
                <%   }
                    myDatabaseLogger.close();
                    }//try
                catch (Exception e)
                    {
                    out.println(connectionURL+" error:"+e.toString());
                %>
        request_URI=<%=request_URI%>
        <b><font face="Verdana" size="3" color="#000080"><%=e.toString()%></font></b>
                <%   myDatabaseLogger.close();
                        return;
                        }
                %>

    </body>
</html>

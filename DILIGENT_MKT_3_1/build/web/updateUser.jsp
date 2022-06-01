<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="nsofiasLib.databases.DatabaseLogger,nsofiasLib.time.TimeStamp1,java.sql.ResultSet,java.util.*,java.text.NumberFormat"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>




        <% 
//---------------------
String request_URI = request.getRequestURI();
request_URI=request_URI.substring(request_URI.lastIndexOf("/")+1);
String url="login.jsp?request_URI="+request_URI;
String userType=(String)session.getAttribute("role");
if (userType==null)
    {%>
    <jsp:forward page="<%=url%>"/>
<%  return;
    }
if (userType.endsWith("-expired"))// password expired
    {
    %>
    <b><font face="Verdana" size="3" color="#000080"></font></b>Sorry, your password is expired!!!
    <jsp:forward page="change_password.jsp"/>
    <%return;
    }
    if (!userType.equals("00")){return;}
//--------------------------------------------------------------            
        String UPDATE = request.getParameter("UPDATE");
        String DELETE = request.getParameter("DELETE");
        String CREATE_USER = request.getParameter("CREATE_USER");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String lastPasswordChange = request.getParameter("lastPasswordChange");
        String realName = request.getParameter("realName");
        String passwordExpiryDate = request.getParameter("passwordExpiryDate");
        String title="Users administration";
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        DatabaseLogger myDatabaseLogger= new DatabaseLogger("com.mysql.jdbc.Driver","jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();        
        if (CREATE_USER!=null)
            {
            try{       
            String sqlStr="INSERT INTO users (`username`, `password`, `role`, `lastPasswordChange`,`realName`,`passwordExpiryDate`) VALUES ('"+username+"', '"+password+"', '"+role+"', '"+lastPasswordChange+"', '"+realName+"', '"+passwordExpiryDate+"')"; 
            myDatabaseLogger.writeln(sqlStr);
//            out.println(sqlStr);
            }catch(Exception e){%>User already  exists.  Now go <a href="showUsers.jsp">  back to Users</a> <%return;}%>
            <h2>User created successfully, now go <a href="showUsers.jsp">  back to Users</a></h2>
            <%
            return;
            }
        if (UPDATE!=null)
            {
            String sqlStr="update users set password = '"+password+"',role='"+role+"',lastPasswordChange='"+lastPasswordChange+"',realName='"+realName+"',passwordExpiryDate='"+passwordExpiryDate+"' where username='"+username+"'";
            myDatabaseLogger.writeln(sqlStr); 
            %>
            <h2>User updated successfully, now go<a href="showUsers.jsp">  back to Users</a></h2>
            <%
            return;
            }
        if (DELETE!=null)
            {
            String sqlStr="delete from users where username='"+username+"'";
            myDatabaseLogger.writeln(sqlStr); 
            %>
            <h2>User deleted successfully, now go <a href="showUsers.jsp"> back to Users</a></h2>
            <%
            return;
            }    %>    

        <h1><%=title%></h1>
        <form action="updateUser.jsp?update">
        
<%      if (username!=null)
            {
            String sqlStr="select * from users where username='"+username+"'";
            ResultSet users=myDatabaseLogger.getResults(sqlStr);
            users.next();
            %> 
            <table border="1" cellspacing="1" cellpadding="1">            
            <tr><td align="left" bgcolor="#DEB0AF">username</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="username" value="<%=users.getString(1)%>"></td>
            <tr><td align="left" bgcolor="#DEB0AF">password</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="password" value="<%=users.getString(2)%>"></td>
            <tr><td align="left" bgcolor="#DEB0AF">role</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="role" value="<%=users.getString(3)%>"></td>
            <tr><td align="left" bgcolor="#DEB0AF">last Password Change</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="lastPasswordChange" value="<%=users.getString(4)%>"></td>
            <tr><td align="left" bgcolor="#DEB0AF">real Name</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="realName" value="<%=users.getString(5)%>"></td>
            <tr><td align="left" bgcolor="#DEB0AF">password Expiry Date</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="passwordExpiryDate" value="<%=users.getString(6)%>"></td>    
        </table>                    
        <input name="UPDATE" type="submit" value="Update User">
        <input name="DELETE" type="submit" value="Delete User">                
<%          }
        else
            {
            TimeStamp1 now= new TimeStamp1();
            now.addDays(-1);                       
        %>  
        <table border="1" cellspacing="1" cellpadding="1">            
            <tr><td align="left" bgcolor="#DEB0AF">username</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="username" value=""></td>
            <tr><td align="left" bgcolor="#DEB0AF">password</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="password" value=""></td>
            <tr><td align="left" bgcolor="#DEB0AF">role</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="role" value=""></td>
            <tr><td align="left" bgcolor="#DEB0AF">last Password Change</td><td align="left" bgcolor="#DEB0AF"><input readonly type="text" name="lastPasswordChange" value=""></td>
            <tr><td align="left" bgcolor="#DEB0AF">real Name</td><td align="left" bgcolor="#DEB0AF"><input type="text" name="realName" value=""></td>
            <tr><td align="left" bgcolor="#DEB0AF">password Expiry Date</td><td align="left" bgcolor="#DEB0AF"><input readonly type="text" name="passwordExpiryDate" value="<%=now.getTodayUnformated()%>"></td>                             
        </table>                    
        <input name="CREATE_USER" type="submit" value="Create User">                
<%          }%> 

        </form>
    
    </body>
</html>

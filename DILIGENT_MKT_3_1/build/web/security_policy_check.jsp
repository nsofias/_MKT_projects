<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="nsofiasLib.databases.DatabaseLogger,java.sql.ResultSet,nsofiasLib.time.TimeStamp1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%  
    String username=(String)session.getAttribute("username");
    String password=(String)session.getAttribute("password");
    String userRole=(String)session.getAttribute("role");
    //------
    String myPassword_old=request.getParameter("j_password_old");
    String myPassword_1=request.getParameter("j_password_1");
    String myPassword_2=request.getParameter("j_password_2");
    DatabaseLogger myDatabaseLogger=null;
    if (username==null)
        {%>
        <jsp:forward page="login.jsp"/>
    <%  return;
        }    
    if (!password.equals(myPassword_old))
        {%>
        <b><font face="Verdana" size="3" color="#000080">Sorry, your OLD password is not entered correctly. Please go
        <a href="change_password.jsp">back</a> and try again!</font></b>
   <%   return;
        }
    if (!myPassword_1.equals(myPassword_2))
        {%>
        <b><font face="Verdana" size="3" color="#000080">Sorry, your password is not entered correctly. Please go
        <a href="change_password.jsp">back</a> and try again!</font></b>
   <%   return;
        }
    String myNewPassword = myPassword_1;
    if (myNewPassword.length()<8)
        {%>
        <b><font face="Verdana" size="3" color="#000080">Sorry, your password should be at least 8 characters long. Please go
        <a href="change_password.jsp">back</a> and try again!</font></b>
   <%   return;
        }
    if (myNewPassword.length()<8)
        {%>
        <b><font face="Verdana" size="3" color="#000080">Sorry, your password should be at least 8 characters long. Please go
        <a href="change_password.jsp">back</a> and try again!</font></b>
   <%   return;
        }  
    if (!check_password_content_ok(myNewPassword))
        {%>
        <b><font face="Verdana" size="3" color="#000080">Sorry, your password should contain at least one special character (%,@,#,$,!), one number, one Capital and one small letter. Please go
        <a href="change_password.jsp">back</a> and try again!</font></b>
   <%   return;
        }        
   String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
   myDatabaseLogger= new DatabaseLogger("com.mysql.jdbc.Driver","jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
   try
        {        
        myDatabaseLogger.connect();
        TimeStamp1 now = new TimeStamp1();
        now.addDays(90);
        String passwordExpiryDate = now.getTodayUnformated();
        String sqlStr="UPDATE `dslmon_skopia`.`users` SET users.password='"+myNewPassword+"',users.passwordExpiryDate='"+passwordExpiryDate +"' WHERE users.username='"+username+"' AND users.password='"+myPassword_old+"'";
        myDatabaseLogger.writeln(sqlStr);
        myDatabaseLogger.close();
        session.setAttribute("password", myNewPassword);
        session.setAttribute("role", userRole.split("-")[0]);
        //System.out.println(sqlStr);
	}//try
   catch(Exception e)
        {
        out.println(e.toString());
        myDatabaseLogger.close();
        %>
        <b><font face="Verdana" size="3" color="#000080">SORRY SERVICE NOT AVAILABLE AT THE MOMENT! Your password did not change. Please go
        <a href="index.jsp">back</a> and try again!</font></b>
   <%   
        }%>
        <b><font face="Verdana" size="3" color="#000080">Your password changed!. Please go
        <a href="index.jsp">back</a></font></b>
    </body>
</html>

<%!
boolean check_password_content_ok(String myNewPassword) throws Exception
    {
    boolean hasSpecialChar=false,hasSmallLetter=false,hasCapitalLetter=false,hasNumber=false;
    for (int i=0; i<myNewPassword.length();i++)
        {
        int myChar = myNewPassword.charAt(i);
        if (myChar>=48 & myChar<=57)
            hasNumber=true;
        if (myChar>=33 & myChar<=37)
            hasSpecialChar=true;        
        if (myChar>=65 & myChar<=90)
            hasCapitalLetter=true;
        if (myChar>=97 & myChar<=122)
            hasSmallLetter=true;
        }    
    return hasSpecialChar&hasSmallLetter&hasCapitalLetter&hasNumber;
    }                
%>
<%-- 
    Document   : change_password
    Created on : Jan 22, 2016, 1:21:57 PM
    Author     : nsofias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" href="global.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

    <body>
        <%
    //  ----------- SEQURITY CHECK ---------------
    String request_URI = request.getRequestURI();
    request_URI=request_URI.substring(request_URI.lastIndexOf("/")+1);
    String url="login.jsp?request_URI="+request_URI;
    String userType=(String)session.getAttribute("role");
    if (userType==null)
        {%>
        <jsp:forward page="<%=url%>"/>
    <%  return;
        }

    //  ----------- END OF SEQURITY CHECK ---------------  
%>
        <h1>Please enter your new Password</h1>
        <table width="800" border="14" cellspacing="15" cellpadding="15">
            <thead>
                <tr>
                    <th><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p></th>
                </tr>              
            </thead>
            <tbody>
                <tr>
                    <td>

                        <form method="POST" action="security_policy_check.jsp">
                            <p>&nbsp;</p>
                            <p>&nbsp;</p>
                            <p>&nbsp;</p>
                            <h2>Please enter your OLD Password:&nbsp;&nbsp;</h2>
                            <input type="password" name="j_password_old"><p>&nbsp;</p>
                            <h2>Please enter your New Password:&nbsp;&nbsp;</h2>
                            <input type="password" name="j_password_1"><p>&nbsp;</p>
                            <h2>Retype your new Password:&nbsp;&nbsp;</h2>
                            <input type="password" name="j_password_2"><p>&nbsp;</p>
                            <input type="submit" value="Submit" />
                        </form>


                    </td>
                </tr>
            </tbody>
        </table>
    </body>
</html>

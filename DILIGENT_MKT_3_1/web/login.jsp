<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title></title>


        <link rel="stylesheet" href="global.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

    <body>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
    <%
    session = request.getSession();
    //----------- addCookie --------------------
     if (request.getParameter("JSESSIONID") != null)
         {
         Cookie userCookie = new Cookie("JSESSIONID", request.getParameter("JSESSIONID"));
         response.addCookie(userCookie);
         }
     else
         {
         String sessionId = session.getId();
         Cookie userCookie = new Cookie("JSESSIONID", sessionId);
         response.addCookie(userCookie);
         }   
     //-------------------------------------------

    if (request.getParameter("logout")!=null)
        session.setAttribute("role", null);
    String request_URI = request.getParameter("request_URI");
//    out.print(request_URI);
    String userType=(String)session.getAttribute("role");
    String userName = (String) session.getAttribute("username");
    if (userType!=null && request_URI==null )   
        {%>
        <h1><%=userName%>,you have authenticated already!</h1>         
                 
<%       return;         }
    else if (userType!=null && request_URI.equals("login.jsp") )   
        {%>
        <h1>You have successfully authenticated!</h1> 
        <p>Enjoy!  
            <%
            if (!userType.equals("03"))
            {%>
             <jsp:forward page="dashboard1.jsp"/>
 <%            }
                
      return;         }%>
        
        
        <h1>Please enter your  Username and Password</h1>
        <p>&nbsp;</p>
        <img src="img/diligent_logo.jpg" width="130" height="30" alt="Dili@gent"/>  
        <table width="800" border="14" cellspacing="15" cellpadding="15">
            <thead>
                    
            </thead>
            <tbody>
                <tr>
                    <td>
                        <%
                            
                            if (request_URI == null)
                                {
                                request_URI = "login.jsp";
                                }
                        %>
                        <form method="GET" action="security_check.jsp">
                            <p>&nbsp;</p><p>&nbsp;</p>
                            <h2>User Name:&nbsp;&nbsp;</h2>
                            <input type="text" name="j_username"><p>&nbsp;</p>
                            <h2>Password:&nbsp;&nbsp;</h2>
                            <input type="password" name="j_password"><p>&nbsp;</p>
                            <input value="<%=request_URI%>" type="hidden" name="request_URI"><p>&nbsp;</p>
                            <input type="submit" value="Submit" />
                        </form>


                    </td>
                </tr>
            </tbody>
        </table>






    </body>
</html>

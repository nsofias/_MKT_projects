<html>
    <head>
        <title></title>

        <link rel="stylesheet" href="global.css">
    </head>

    <body>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
    <%
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
    if (userType!=null && request_URI==null )   
        {%>
        <h1>I know who you are. You have authenticated already!</h1>         
                
<%       return;         }
    else if (userType!=null && request_URI.equals("login.jsp") )   
        {%>
        <h1>You have successfully authenticated!</h1> 
        <p>Enjoy!       
                
<%       return;         }%>
        
        
        
        <p>&nbsp;</p>
        <table width="50%" border="14" cellspacing="25" cellpadding="25">
            <thead>
                <tr>
                    <th><p><h1>Please enter your  Username and Password</h1></p></th>
                </tr>             
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

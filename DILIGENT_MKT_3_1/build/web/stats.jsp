<%-- 
    Document   : stats
    Created on : Jan 14, 2016, 2:46:07 PM
    Author     : nsofias
//duration,affected,timestamp,place,type 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="global.css">
    </head>
    <body >
        <h1> Dili@gent online Statistics</h1>
        <p>
        <table width="750" border="0" cellspacing="15" cellpadding="15">
          <thead>
              <tr>
                  <th></th>
              </tr>
              <tr>
                  <th></th>
              </tr>              
          </thead>            
            <tr><td><a href="scorers.jsp"><h2>Top unstable resources</h2></a></td></tr>
            <tr><td><a href="distributions.jsp"><h2>Reported Incidents distributions</h2></a></td></tr>
            <tr><td><a href="distributions.jsp?H24"><h2>Reported Incidents volumes (Last 24H)</h2></a></td></tr> 
            <tr><td><a href="availability.jsp"><h2>KPIs OnLine</h2></a></td></tr>        
        </table>
    </body>
</html>

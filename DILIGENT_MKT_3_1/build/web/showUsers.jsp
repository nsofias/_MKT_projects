<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="nsofiasLib.databases.DatabaseLogger,nsofiasLib.time.TimeStamp1,java.sql.ResultSet,java.util.*,java.text.NumberFormat"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
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
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        String title="Users administration";
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        DatabaseLogger myDatabaseLogger= new DatabaseLogger("com.mysql.jdbc.Driver","jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        String sqlStr="select * from users";
        ResultSet users=myDatabaseLogger.getResults(sqlStr);
        %> 
        <h1><%=title%></h1>
        <a href="updateUser.jsp">Create User</a>
        <table border="1" cellspacing="1" cellpadding="1">
            <tr><th align="left" bgcolor="#DEB0AF">username</th>
            <th align="left" bgcolor="#DEB0AF">password</th>
            <th align="left" bgcolor="#DEB0AF">role</th>
            <th align="left" bgcolor="#DEB0AF">last Password Change</th>
            <th align="left" bgcolor="#DEB0AF">real Name</th>
            <th align="left" bgcolor="#DEB0AF">password Expiry Date</th></tr>
<%        while (users.next())
            {    
                        
            %>
            <tr><td align="left" bgcolor="#DEB0AF"><a  href="updateUser.jsp?username=<%=users.getString(1)%>"><%=users.getString(1)%></a></td>
            <td align="left" bgcolor="#DEB0AF">**************</td>
            <td align="left" bgcolor="#DEB0AF"><%=users.getString(3)%></td>
            <td align="left" bgcolor="#DEB0AF"><%=users.getString(4)%></td>
            <td align="left" bgcolor="#DEB0AF"><%=users.getString(5)%></td>
            <td align="left" bgcolor="#DEB0AF"><%=users.getString(6)%></td>     
<%            }
%>





    </tbody>
</table>


        	

<%! 
    private String format_number(double myNumder)
        {
        NumberFormat myNumberFormat = NumberFormat.getInstance();
        myNumberFormat.setMinimumFractionDigits(2);
        myNumberFormat.setMaximumFractionDigits(2); 
        myNumberFormat.setGroupingUsed(false);
        String myNumder_string = myNumberFormat.format(myNumder);

        myNumder_string = myNumder_string.replaceAll(",",".");
        double myNumder_D=Double.valueOf(myNumder_string).doubleValue();
        if (myNumder>myNumder_D)
            {
            myNumder_D=myNumder_D+0.01;  
            myNumder_string = myNumberFormat.format(myNumder_D); 
            myNumder_string = myNumder_string.replaceAll(",",".");
            }               
        return(myNumder_string);
        }     
%>
    
    </body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02";%>
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
<!DOCTYPE html>

<%
    String type = request.getParameter("type");
    String ticketStatus = request.getParameter("ticketStatus");
    String H24 = request.getParameter("H24");
    if (type == null || type.isEmpty())
        {
        type = "ALL";
        }
    if (ticketStatus == null || ticketStatus.isEmpty())
        {
        ticketStatus = "ALL";
        }    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reported Incidents Stats</title>
    </head>
    <body>
        <h1>Reported Incidents Stats</h1>
        <p><form name="myform" action="distributions.jsp">                               
            <b>Resource type</b>
            <select  onchange="this.form.submit()" name="type"> 
                <option value="<%=type%>"><%=type%></option>
                <option value="BRAS">BRAS</option>
                <option value="DSLAM">DSLAM</option>
                <option value="CARD">CARD</option>
                <option value="ALL">ALL</option>                        
            </select>  
            <select  onchange="this.form.submit()" name="ticketStatus"> 
                <option value="<%=ticketStatus%>"><%=ticketStatus%></option>
                <option value="OPEN">OPENED (in Siebel)</option>
                <option value="MANAGED">OPENED (in Siebel) as Managed</option>
                <option value="UNMANAGED">OPENED (in Siebel) as NOT Managed </option>
                <option value="ALL">ALL Tickets (opened, not opened or failed to open)</option>                        
            </select>                
            <%if (H24 != null)
            {%>
                <input type="hidden" name="H24" value="0" />
            <%}%>
        </form>         
        <p>&nbsp;</p>
        <%if (H24 == null)
            {%>
            <table width="100%"  border='1'>            
                <tr>
                    <td><IMG height="350" src='StatsTickets_Servlet?accorTo=duration&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></td>  
                    <td><IMG height="350" src='StatsTickets_Servlet?accorTo=affected&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></td>
                    <td><IMG height="350" src='StatsTickets_Servlet?accorTo=type&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></td>
                </tr> 
                <tr><IMG height="300"  src='StatsTickets_Servlet?accorTo=timestamp&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></tr>
                <tr><IMG height="300"  src='StatsTickets_Servlet?accorTo=place&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></tr>                
            </table>
            <%}
        else
            {%>  
            <table width="100%"  border='1'>            
                <tr>
                    <td><IMG height="350" src='StatsTickets_Servlet?H24=1&accorTo=duration&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></td>  
                    <td><IMG height="350" src='StatsTickets_Servlet?H24=1&accorTo=affected&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></td>
                    <td><IMG height="350" src='StatsTickets_Servlet?H24=1&accorTo=type&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></td>
                </tr> 
                <tr><IMG height="300"  src='StatsTickets_Servlet?H24=1&accorTo=timestamp&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></tr>
                <tr><IMG height="300"  src='StatsTickets_Servlet?H24=1&accorTo=place&resourceType=<%=type%>&ticketStatus=<%=ticketStatus%>'></tr>                
            </table>                
        <%  }%>               
    </body>
</html>

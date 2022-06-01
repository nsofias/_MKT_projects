
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String ticketReason = request.getParameter("ticketReason");
    String H24 = request.getParameter("H24");
    if (ticketReason == null || ticketReason.isEmpty())
        {
        ticketReason = "ANY";
        }   
/*
    public static String reason_DEH_MW = "reason_DEH_MW";
    public static String reason_DEH_AUMS = "reason_DEH_AUMS";
    public static String reason_POWER_SUPPLY = "reason_POWER_SUPPLY";
    public static String reason_TRANPORT = "reason_TRANPORT";
    public static String reason_NNM = "reason_NNM";    
    */
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reported Incidents Stats</title>
    </head>
    <body>
        <h1>Reported Incidents Stats</h1>
        <p><form name="myform" action="distributions_reasons.jsp">                               
            <b>Reason:</b>
 
            <select  onchange="this.form.submit()" name="ticketReason"> 
                <option value="<%=ticketReason%>"><%=ticketReason.replace("reason_","")%></option>
                <option value="reason_DEH_MW">DEH_MW</option>
                <option value="reason_DEH_AUMS">DEH_AUMS</option>
                <option value="reason_POWER_SUPPLY">POWER_SUPPLY</option>
                <option value="reason_TRANPORT">TRANPORT</option>
                <option value="reason_NNM">NNM</option>
                <option value="ANY">Any reason</option>                        
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
                    <td><IMG height="350" src='reason_servlet.jsp?ticketReason=<%=ticketReason%>'></td>
                    <td><IMG height="350" src='reason_servlet.jsp?accorTo=duration&ticketReason=<%=ticketReason%>'></td>  
                    <td><IMG height="350" src='reason_servlet.jsp?accorTo=affected&ticketReason=<%=ticketReason%>'></td>                    
                </tr> 
                <tr><td><IMG height="300"  src='reason_servlet.jsp?accorTo=timestamp&ticketReason=<%=ticketReason%>'></td></tr>
                <tr><td><IMG height="300"  src='reason_servlet.jsp?accorTo=place&ticketReason=<%=ticketReason%>'></td></tr>                
            </table>
            <%}
        else
            {%>  
            <table width="100%"  border='1'>            
                <tr>
                    <td><IMG height="350" src='reason_servlet.jsp?H24=1&ticketReason=<%=ticketReason%>'></td> 
                    <td><IMG height="350" src='reason_servlet.jsp?H24=1&accorTo=duration&ticketReason=<%=ticketReason%>'></td>  
                    <td><IMG height="350" src='reason_servlet.jsp?H24=1&accorTo=affected&ticketReason=<%=ticketReason%>'></td>
                </tr> 
                <tr><td><IMG height="300"  src='reason_servlet.jsp?H24=1&accorTo=timestamp&ticketReason=<%=ticketReason%>'></td></tr>
                <tr><td><IMG height="300"  src='reason_servlet.jsp?H24=1&accorTo=place&ticketReason=<%=ticketReason%>'></td></tr>                
            </table>                
        <%  }%>               
    </body>
</html>

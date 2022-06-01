<%@page import="java.util.ArrayList,nsofiasLib.ote.DSLAMs.NetworkEvent,nsofiasLib.ote.DSLAMs.DslamDetails"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resources</h1>

        <%
            String dslam = request.getParameter("dslam");
            if (dslam != null)
                {
                dslam = dslam.trim();
                }
        %>

        <p><h1>Dslam details for <%=dslam%></h1>
        <%
            try
                {
                nsofiasLib.ote.DSLAMs.DslamDetailsFinder myDslamDetailsFinder = new nsofiasLib.ote.DSLAMs.DslamDetailsFinder();
                DslamDetails myDslamDetails = myDslamDetailsFinder.getDslamDetails(dslam);
                if (myDslamDetails != null)
                    {
                    out.println("<p>EETT = " + myDslamDetails.getMyEETT());
                    out.println("<p>getMyHostName = " + myDslamDetails.getMyHostName());
                    out.println("<p>Area = " + myDslamDetails.getMyArea());
                    out.println("<p>PotsPorts = " + myDslamDetails.getPotsPorts());
                    out.println("<p>MyDslPorts = " + myDslamDetails.getMyDslPorts());
                    out.println("<p>MyDslCoords = " + myDslamDetails.getCoords());
                    out.println("<p>NextHop = " + myDslamDetails.getNextHop());
                    out.println("<p>isMSAN = ");
                    out.println(myDslamDetails.getPotsPorts() > 0 && myDslamDetails.getMyDslPorts() == 0);
                    out.println("<p>isWithoutCust = ");
                    out.println("<p>isWithoutCust = " + myDslamDetails != null && myDslamDetails.getPotsPorts() == 0 && myDslamDetails.getMyDslPorts() == 0);
                    out.println("<p> ");
                    out.println("<h2>NetworkEvents</h2>");
                    //
                    ArrayList<NetworkEvent> myNetworkEvents = myDslamDetails.getNetworkEvents();
                    for (NetworkEvent myNetworkEvent : myNetworkEvents)
                        {
                        out.println("<p>" + myNetworkEvent.getType() + " " + myNetworkEvent.getStartTime() + " " + myNetworkEvent.getEndTime() + " " + myNetworkEvent.getArea());
                        }
                    }
                }
            catch (Exception e)
                {
                e.printStackTrace();
                }%>                 
    </body>
</html>     

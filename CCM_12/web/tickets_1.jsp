<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.Comparator"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="nsofiasLib.ote.alarms.Ticket"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Map,java.net.URLEncoder,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,ccm.CCMonitorStatsObjsContainer,ccm.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();


%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tickets</title>
        <link rel="stylesheet" href="global.css">
    </head>
    <%        String remove = request.getParameter("remove");
        AlarmsDetectionListener myTicketsDetectionListener = (AlarmsDetectionListener) myContext.getAttribute("myAlarmsDetectionListener");
        List<CCMTicket> tickets = myTicketsDetectionListener.getTicketsMap().values().stream()
                .map(v -> (CCMTicket) v)
                //.sorted(( v1,  v2) -> v2.getIncidentReportedDate().compareTo(v1.getIncidentReportedDate()))
                .sorted(Comparator.comparing((CCMTicket v) -> v.getIncidentReportedDate()).reversed())
                .collect(Collectors.toList());
        CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
        Map<String, CCMAlarm> alarmArrayList = myCCMonitorStatsObjsContainer.getAlarmArrayList();
        List<String> alarmTicketIDs = alarmArrayList.values().stream().map(v -> v.getTicketId()).collect(Collectors.toList());
    %>
    <body>         
        <table  border='1'>
            <tr>
                <th>sourse</th>
                <th>Parent</th>
                <th>SR number</th>
                <th>SR reported</th>  
                <th>SR type</th>  
                <th>Ticket State</th>
                <th>num Of CTTs</th>
                <th nowrap>signature</th>
            </tr>
            <%
                //ArrayList<String> ticketIDs = new ArrayList(tickets.keySet());
                //Collections.sort(ticketIDs, Collections.reverseOrder());
                for (CCMTicket myCCMTicket : tickets) {
                    //System.out.println("CCM12:alarms key=" + key);
                    try {
                        String signatute = "";
                        String sr = "";
                        String srReported = "";
                        String ticketId = myCCMTicket.getTicketId();
                        String comments = myCCMTicket.getComments();
                        int ctts = myCCMTicket.getNumOfCCTs();
                        String element = myCCMTicket.getElementName();
                        try {
                            if (myCCMTicket.getLastSignature() != null) {
                                signatute = myCCMTicket.getLastSignature().getLabel();
                            }
                            sr = myCCMTicket.getSR();
                            if (sr == null) {
                                sr = "";
                            }
                            srReported = new TimeStamp1(myCCMTicket.getIncidentReportedDate()).getNowFormated();
                        } catch (Exception e) {
                        }
                        String color;
                        if (!alarmTicketIDs.contains(ticketId)) {
                            color = "magenta";
                            if (remove != null) {
                                myTicketsDetectionListener.getTicketsMap().remove(ticketId);
                            }
                        } else if (myCCMTicket.getState().contains("OPEN")) {
                            color = "white";
                        } else {
                            color = "lightgrey";
                        }


            %>
            <tr bgcolor = "<%=color%>">
                <td><%=ticketId%></td>
                <td><%=element%></td>
                <td><%=sr%></td>
                <td><%=srReported%></td>
                <td><%=myCCMTicket.getType()%></td>
                <td><%=myCCMTicket.getState().replace("STATE_", "")%></td>
                <td><%=myCCMTicket.getNumOfCCTs()%></td>
                <td><%=signatute%></td> 
                <td><%=ctts%></td> 
                <td><%=comments%></td>
            </tr> 

            <%
                    } catch (Exception e) {
                        System.out.println("CCM12:tickets_1 error====" + e.toString());
                        e.printStackTrace();
                    }

                }%>        
        </table>

    </body>
</html>



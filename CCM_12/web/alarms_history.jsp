<%@page import="java.lang.reflect.Modifier"%>
<%@page import="com.google.gson.GsonBuilder"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="nsofiasLib.databases.DatabaseLogger"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="java.util.Set"%>
<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="nsofiasLib.ote.alarms.Ticket"%>
<%@page import="nsofiasLib.others.SimpleDaemon"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Map,java.net.URLEncoder,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,ccm.CCMonitorStatsObjsContainer,ccm.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02";%>
<%@include file = "sequrityPart.jsp"%>
<%//----------- sequrity----------------
    try {
        if (!userTypes.contains(userType)) {
%>
<font face="Verdana" size="3" color="#000080">Sorry, you are not authorized to view this page!!!</font>
<%return;
        }
    } catch (Exception e) {
    }
//----------- sequrity end----------------
%>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    TimeStamp1 now = new TimeStamp1();
    String from = request.getParameter("from");
    if (from == null) {
        from = now.getNowFormated().substring(0, 16);
    }
    String to = request.getParameter("to");
    if (to == null) {
        to = now.getNowFormated().substring(0, 10) + " 00:00";
    }
    String T1 = new TimeStamp1(from + ":00:000").getNowUnformated();
    String T2 = new TimeStamp1(to + ":00:000").getNowUnformated();
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Alarms history</title>
        <link rel="stylesheet" href="global.css">
        <script src="datetimepicker_css.js"></script>      
        <script language="javascript">
            function downloadCSV(csv, filename) {
                var csvFile;
                var downloadLink;
                var csvEncoder = new TextEncoder("utf-8");
                var BOM = "\uFEFF";
                var csvEncoded = csvEncoder.encode([BOM + csv]);
                csvFile = new Blob([csvEncoded], {type: "text/csv;charset=utf-8"});
                downloadLink = document.createElement("a");
                downloadLink.download = filename;
                // Create a link to the file
                downloadLink.href = window.URL.createObjectURL(csvFile);
                // Hide download link
                downloadLink.style.display = "none";
                // Add the link to DOM
                document.body.appendChild(downloadLink);
                downloadLink.click();
            }

            function exportTableToCSV(filename) {
                var csv = [];
                var rows = document.querySelectorAll("table tr");
                for (var i = 0; i < rows.length; i++) {
                    var row = [], cols = rows[i].querySelectorAll("td, th");
                    for (var j = 0; j < cols.length; j++)
                        row.push(cols[j].innerText);
                    csv.push(row.join(";"));
                }
                downloadCSV(csv.join("\n"), filename);
            }

            function period_setter()
            {
                document.getElementById('fromId').value = "<%=from%>";
                document.getElementById('toId').value = "<%=to%>";
            }
        </script>        
    </head>


    <body onload="javascript:period_setter()">
        <h1>Alarms από <%=to%> έως <%=from%></h1>
        <form id="myForm"  method="POST" action="alarms_history.jsp"  accept-charset="UTF-8">
            <b>Start of period: </b>
            <input readonly="" name="to" value="<%=to%>" type="Text" id="toId" maxlength="25" size="25"/>
            <img src="cal.gif" alt="" onclick="javascript:NewCssCal('toId', 'ddMMyyyy', 'arrow', true, '24')" style="cursor:pointer"/>
            <b>End of period: </b>
            <input readonly="" name="from" value="<%=from%>" type="Text" id="fromId" maxlength="25" size="25"/>
            <img src="cal.gif" alt="" onclick="javascript:NewCssCal('fromId', 'ddMMyyyy', 'arrow', true, '24')" style="cursor:pointer"/>            
            <p><input type="submit" value="SUBMIT" />
        </form>       
        <p><img src="csv.png" alt="Export to CSV File" onclick="exportTableToCSV('alarms.csv')"/>

        <table  border='1'>
            <tr>
                <th>sourse</th>                
                <th>start</th>
                <th>stop</th>
                <th>type</th>                
                <th>significant reason</th>                
                <th>Distinct callers</th>               
                <th>SR</th>
                <th>weather</th> 
            </tr>
            <%                
                String sql = "SELECT * FROM CCM.alarms where alarmId > '" + T2 + "' and alarmId<='" + T1 + "'";
                String connectionURL = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "alarms_database.connectionURL", "utf-8", "");
                String jdbcDriver = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "alarms_database.jdbcDriver", "utf-8", "");
                DatabaseLogger myDatabaseLogger = new DatabaseLogger(jdbcDriver, connectionURL);
                myDatabaseLogger.connect();
                ResultSet res = myDatabaseLogger.getResults(sql);
                Map<String, CCMAlarm> alarmArrayList = new HashMap<>();
                while (res.next()) {
                    try {
                        String alarmBody = res.getString("alarmBody");
                        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
                        CCMAlarm myCCMAlarm = (CCMAlarm) gson.fromJson(alarmBody, CCMAlarm.class);
                        alarmArrayList.put(myCCMAlarm.getAlarmId(), myCCMAlarm);
                        System.out.println("myCCMAlarm=" + myCCMAlarm.toString());
                    } catch (Exception e) {
                        out.println("CCM12:error====0 " + e.toString());
                        e.printStackTrace();
                    }
                }
                //---------------------------------------------------------- 
                ArrayList<String> alarmIds = new ArrayList(alarmArrayList.keySet());
                Collections.sort(alarmIds, Collections.reverseOrder());
                for (String key : alarmIds) {
                    CCMAlarm myAlarm = alarmArrayList.get(key);
                    try {
                        String alertOrigin = myAlarm.getAlarmObject();
                        TimeStamp1 T0 = new TimeStamp1(myAlarm.getAlertStart());
                        T0.addSeconds(-7400);
                        String AlertStart = new TimeStamp1(myAlarm.getAlarmStart()).getNowFormated();
                        String AlarmStop = myAlarm.getAlarmStop()!=null ? new TimeStamp1(myAlarm.getAlarmStop()).getNowFormated() : "N/A";
                        String AlertType = myAlarm.getAlarmType()!=null?myAlarm.getAlarmType():"N/A";
                        String AlertTypeS = "";
                        if (AlertType.equals("REASON")) {
                            AlertTypeS = "Reason " + myAlarm.getAlarmObject();
                        } else {
                            AlertTypeS = AlertType;
                        }
                        String AlertMostSignificantReason = myAlarm.getAlertMostSignificantReason()!=null?myAlarm.getAlertMostSignificantReason() : "N/A";
            %>
            <tr >
                <td><%=alertOrigin.replace(";", ":")%></td>                                
                <td nowrap><%=AlertStart.substring(0, 16)%></td>
                <td nowrap><%=AlarmStop.substring(0, 16)%></td>  
                <td><%=AlertTypeS%></td>  
                <td><%=AlertMostSignificantReason%></td> 
                <td><%=(int) myAlarm.getTotalCalls()%></td>
                <td><%=myAlarm.getTicketSR()%></td>                  
                <td><%=myAlarm.getWeatherInfo()%></td> 
                </b>  
            </tr>        
            <%             } catch (Exception e) {
                        out.println("CCM12:error====1 " + e.toString());
                        e.printStackTrace();
                    }

                }%>        
        </table>

    </body>
</html>



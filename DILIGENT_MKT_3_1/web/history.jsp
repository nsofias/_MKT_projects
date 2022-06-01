<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="diligent_MKT.Ticket_FYROM"%>
<%@page import="nsofiasLib.time.TimeStamp1,java.sql.ResultSet,java.util.HashMap,nsofiasLib.databases.DatabaseLogger,java.net.URLEncoder,java.util.Map,nsofiasLib.ote.alarms.*,java.util.Iterator,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
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
<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    //=====================================================================================================
    ServletContext myContext = request.getServletContext();
    try {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
    } catch (Exception e) {
    }
    TimeStamp1 now = new TimeStamp1();
    String period = request.getParameter("period");
    if (period == null) {
        period = "2";
    }
    String from = request.getParameter("from");
    if (from == null) {
        from = now.getNowFormated().substring(0, 16);
    }
    String to = request.getParameter("to");
    if (to == null) {
        to = now.getNowFormated().substring(0, 10) + " 00:00";
    }
    //
    String elementName = request.getParameter("elementName");
    if (elementName == null) {
        elementName = "";
    } else {
        elementName = elementName.trim();
    }

    String alarmType = request.getParameter("alarmType");
    if (alarmType == null) {
        alarmType = "any";
    } else {
        alarmType = alarmType.trim();
    }
    String sr = request.getParameter("sr");
    if (sr == null) {
        sr = "";
    } else {
        sr = sr.trim();
    }
    //
    String affected_ = request.getParameter("affected");
    int affected = 0;
    try {
        affected = Integer.valueOf(affected_);
    } catch (Exception e) {
    }
    //================================ end of general part =====================================================================

%>

<!DOCTYPE html>

<html>
    <head>
        <title>History</title>
        <link rel="stylesheet" href="global_1.css">
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
                //                         document.getElementById('areaDistribution').disabled=true;
                //                         document.getElementById('per5minId').disabled=true;
                document.getElementById('fromId').value = "<%=from%>";
                document.getElementById('toId').value = "<%=to%>";
            }

        </script>        
    </head>

    <body onload="javascript:period_setter()">
        <h1>Alarms από <%=to%> έως <%=from%></h1>

        <form id="myForm"  method="POST" action="history.jsp"  accept-charset="UTF-8">

            <b>Start of period: </b>
            <input readonly="" name="to" value="<%=to%>" type="Text" id="toId" maxlength="25" size="25"/>
            <img src="cal.gif" alt="" onclick="javascript:NewCssCal('toId', 'ddMMyyyy', 'arrow', true, '24')" style="cursor:pointer"/>

            <b>End of period: </b>
            <input readonly="" name="from" value="<%=from%>" type="Text" id="fromId" maxlength="25" size="25"/>
            <img src="cal.gif" alt="" onclick="javascript:NewCssCal('fromId', 'ddMMyyyy', 'arrow', true, '24')" style="cursor:pointer"/>

            <p>Element name is (or contains) <input type="text" size="20" name="elementName" value="<%=elementName%>" size="5"/>
                SR like <input type="text" name="sr" value="<%=sr%>" size="20"/>
                Affected customers more than <input onchange="this.form.submit()" type="text" name="affected" value="<%=affected%>" size="5"/>
                Technology:<select   onchange="this.form.submit()" name="alarmType"><option selected value="<%=alarmType%>"><%=alarmType%></option><option value="any">any</option><option value="<%=diligent_MKT.Alarm_FYROM.TYPE_COPPER%>"><%=diligent_MKT.Alarm_FYROM.TYPE_COPPER%></option><option value="<%=diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE%>"><%=diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE%></option><option value="<%=diligent_MKT.Alarm_FYROM.TYPE_GPON%>"><%=diligent_MKT.Alarm_FYROM.TYPE_GPON%></option><option value="<%=diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE%>"><%=diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE%></option></select>
            <p><input type="submit" value="SUBMIT" />
        </form> 
        <p><img src="csv.png" alt="Export to CSV File" onclick="exportTableToCSV('alarms.csv')"/>

            <%
                //objTime, alertStop, alertOrigin, alertDesc, SERVING_AREA, ATC, DSLAM, SLOT, CABLE, DP, OLT, BOX, DESCRIPTION, REGION, linesDisconnected, linesRegistered, linesAffected,activeLinesAffected, affServiceID, markCustomersStatus, releaseCustomersStatus, 
                //SR, incidentStartDate, incidentStoppedDate, incidentReportedDate
                //out.println("from=" + from + "   to=" + to);
                //
                String T1 = null, T2 = null;
                //      out.println("from="+from+"   to="+to);  
                T1 = new TimeStamp1(from + ":00:000").getNowUnformated();
                T2 = new TimeStamp1(to + ":00:000").getNowUnformated();
                //out.println("from=" + T1 + "   to=" + T2);
                //
                ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
                ArrayList<String[]> rows = new ArrayList<>();
                try {
                    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons) {
                        for (String ticketID : myGroupBy_Daemon.getMyStatsObjContainer().getOpenTicketsArrayList().keySet()) {
                            Ticket_FYROM myTicket_FYROM = myGroupBy_Daemon.getMyStatsObjContainer().getOpenTicketsArrayList().get(ticketID);
                            if (myTicket_FYROM.getIncidentStartDate().compareTo(T2) > 0 && myTicket_FYROM.getIncidentStartDate().compareTo(T1) < 0) {
                                for (Alarm_FYROM myAlarm_FYROM : myTicket_FYROM.getElementsList()) {
                                    String[] row = new String[24];
                                    try {
                                        row[0] = new TimeStamp1(myAlarm_FYROM.getAlarmStart()).getNowFormated();
                                    } catch (Exception e) {
                                        row[0] = "";
                                    }
                                    try {
                                        row[1] = new TimeStamp1(myAlarm_FYROM.getAlarmStop()).getNowFormated();
                                    } catch (Exception e) {
                                        row[1] = "";
                                    }
                                    row[2] = myAlarm_FYROM.getAlertOrigin().replace(";", " - ");;
                                    row[3] = myAlarm_FYROM.getDESCRIPTION();
                                    row[4] = myAlarm_FYROM.getSERVING_AREA();
                                    row[5] = myAlarm_FYROM.getATC();
                                    row[6] = myAlarm_FYROM.getDSLAM();
                                    row[7] = myAlarm_FYROM.getSLOT();
                                    row[8] = myAlarm_FYROM.getCABLE();
                                    row[9] = myAlarm_FYROM.getDP();
                                    row[10] = myAlarm_FYROM.getOLT();
                                    row[11] = myAlarm_FYROM.getBOX();
                                    row[12] = myAlarm_FYROM.getREGION();
                                    row[13] = String.valueOf(myAlarm_FYROM.getLinesAffected());
                                    row[14] = String.valueOf(myAlarm_FYROM.getActiveLinesAffected());
                                    row[15] = myAlarm_FYROM.getAffServiceID();
                                    row[16] = myAlarm_FYROM.getMarkCustomersStatus();
                                    row[17] = myAlarm_FYROM.getReleaseCustomersStatus();
                                    row[18] = myTicket_FYROM.getSR();
                                    row[19] = String.valueOf(myTicket_FYROM.getCriticality());
                                    try {
                                        row[20] = new TimeStamp1(myTicket_FYROM.getIncidentStartDate()).getNowFormated();
                                    } catch (Exception e) {
                                        row[20] = "";
                                    }
                                    try {
                                        row[21] = new TimeStamp1(myTicket_FYROM.getIncidentStoppedDate()).getNowFormated();
                                    } catch (Exception e) {
                                        row[21] = "";
                                    }
                                    try {
                                        row[22] = new TimeStamp1(myTicket_FYROM.getIncidentReportedDate()).getNowFormated();
                                    } catch (Exception e) {
                                        row[22] = "";
                                    }
                                    row[23] = String.valueOf(myAlarm_FYROM.getAlarmType());
                                    // elementName,sr,affected
                                    try {
                                        if ((elementName == null || elementName.isEmpty() || myAlarm_FYROM.getAlertOrigin().contains(elementName))
                                                && (sr == null || sr.isEmpty() || myTicket_FYROM.getSR().contains(sr))
                                                && (alarmType == null || alarmType.equals("any") || myAlarm_FYROM.getAlarmType().equals(alarmType))
                                                && (myAlarm_FYROM.getLinesAffected() > affected)) {
                                            rows.add(row);
                                        }
                                    } catch (Exception e) {
                                        System.out.println("error");
                                    }

                                }
                            }
                        }
                    }

                    //----------------------------
                    String sql = "SELECT * FROM dslmon_skopia.alarms left join dslmon_skopia.tickets on alarms.ticketId=tickets.ticketId where objTime > '" + T2 + "' and objTime<='" + T1 + "'";
                    if (elementName != null && !elementName.isEmpty()) {
                        sql += " AND alertOrigin like '%" + elementName + "%'";
                    }
                    if (alarmType != null && !alarmType.equals("any")) {
                        sql += " AND alarmType ='" + alarmType + "'";
                    }
                    if (sr != null && !sr.isEmpty()) {
                        sql += " AND SR like '%" + sr + "%'";
                    }
                    sql += " AND linesAffected >" + affected;

                    String orderBy = " order by objTime desc;";
                    sql += orderBy;
                    //out.println("<p>sql=" + sql);
                    String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
                    DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
                    myDatabaseLogger.connect();
                    ResultSet res = myDatabaseLogger.getResults(sql);
                    //objTime, alertStop, alertOrigin, alertDesc, SERVING_AREA, ATC, DSLAM, SLOT, CABLE, DP, OLT, BOX, DESCRIPTION, REGION, linesDisconnected, linesRegistered, linesAffected,activeLinesAffected, affServiceID, markCustomersStatus, releaseCustomersStatus, 
                    //SR, incidentStartDate, incidentStoppedDate, incidentReportedDate        
                    while (res.next()) {
                        String[] row = new String[24];
                        try {
                            row[0] = new TimeStamp1(res.getString("objTime")).getNowFormated();
                        } catch (Exception e) {
                            row[0] = "";
                        }
                        try {
                            row[1] = new TimeStamp1(res.getString("alertStop")).getNowFormated();
                        } catch (Exception e) {
                            row[1] = "";
                        }
                        row[2] = res.getString("alertOrigin").replace(";", " - ");
                        row[3] = res.getString("DESCRIPTION");
                        row[4] = res.getString("SERVING_AREA");
                        row[5] = res.getString("ATC");
                        row[6] = res.getString("DSLAM");
                        row[7] = res.getString("SLOT");
                        row[8] = res.getString("CABLE");
                        row[9] = res.getString("DP");
                        row[10] = res.getString("OLT");
                        row[11] = res.getString("BOX");
                        row[12] = res.getString("REGION");
                        row[13] = res.getString("linesAffected");
                        row[14] = res.getString("activeLinesAffected");
                        row[15] = res.getString("affServiceID");
                        row[16] = res.getString("markCustomersStatus");
                        row[17] = res.getString("releaseCustomersStatus");
                        row[18] = res.getString("SR");
                        row[19] = res.getString("criticality");
                        try {
                            row[20] = new TimeStamp1(res.getString("incidentStartDate")).getNowFormated();
                        } catch (Exception e) {
                            row[20] = "";
                        }
                        try {
                            row[21] = new TimeStamp1(res.getString("incidentStoppedDate")).getNowFormated();
                        } catch (Exception e) {
                            row[21] = "";
                        }
                        try {
                            row[22] = new TimeStamp1(res.getString("incidentReportedDate")).getNowFormated();
                        } catch (Exception e) {
                            row[22] = "";
                        }
                        row[23] = res.getString("alarmType");
                        //=================================================================
                        rows.add(row);
                        //out.println("row=" + row);
                    }
                    //out.println("<p>finished");
                    if (myDatabaseLogger != null) {
                        myDatabaseLogger.close();
                    }
                    String[] header = "alarm Started,alarm Ended,alarm  Origin,alarm  Desc,area,ATC,DSLAM,SLOT,CABLE,DP,OLT,BOX, REGION, linesAffected,activeLinesAffected, affServiceID, markCustomersStatus, releaseCustomersStatus,SR,criticality, Ticket Start Date, Ticket end Date, Ticket Reporte dDate, alarm type".split(",");
                    toHTML(header, rows, out);
                } catch (Exception e) {
                    out.print(e.toString());
                    e.printStackTrace(System.out);
                }
            %>
            finished
    </body>
</html>

<%!
    private void toHTML(String[] headers, ArrayList<String[]> rows, JspWriter out) {
        try {
            out.println("<p><table>");
            //-------headers --------------------
            out.println("<tr>");
            for (String head : headers) {
                out.println("<th>" + head + "</th>");
            }
            out.println("</tr>");
            //-------body --------------------
            for (String[] row : rows) {
                out.println("<tr>");
                for (String el : row) {
                    if (el == null || el.equals("null")) {
                        el = "-";
                    }
                    out.println("<td>" + el + "</td>");
                }
                out.println("</tr>");
                out.flush();
            }
            out.println("</table>");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
%>




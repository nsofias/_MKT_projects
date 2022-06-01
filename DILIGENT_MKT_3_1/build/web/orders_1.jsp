<%@page import="nsofiasLib.others.Parameters"%>
<%@page import="java.sql.ResultSet,nsofiasLib.databases.DatabaseLogger,java.util.Collections,nsofiasLib.utils.Counters1,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userTypes = "00,01,02,03,04";%>
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
    TimeStamp1 now = new TimeStamp1();
    String period = request.getParameter("period");
    if (period == null) {
        period = "2";
    }
    String from_timestamp = request.getParameter("from");
    if (from_timestamp == null) {
        from_timestamp = now.getNowFormated().substring(0, 16);
    }        
    String to_timestamp = request.getParameter("to");
    if (to_timestamp == null) {
        to_timestamp = now.getNowFormated().substring(0, 10) + " 00:00";
    }
    System.out.println("orders:from_timestamp=" + from_timestamp);
    System.out.println("orders:to_timestamp=" + to_timestamp);

    String actionResult = request.getParameter("actionResult");
    String actionType = request.getParameter("actionType");
    ResultSet res;
    //--------------------------
%>


<head>
    <title>Alarms</title>
    <link rel="stylesheet" href="global_1.css">
    <script src="datetimepicker_css.js"></script> 
    <script language="javascript">
        function period_setter()
        {
            document.getElementById('fromId').value = "<%=from_timestamp%>";
            document.getElementById('toId').value = "<%=to_timestamp%>";
        }
    </script>  
</head>
<body onload="javascript:period_setter()">
    <form id="myForm"  method="POST" action="orders_1.jsp"  accept-charset="UTF-8">

        <b>Start of period: </b>
        <input readonly="" name="to" value="<%=to_timestamp%>" type="Text" id="toId" maxlength="25" size="25"/>
        <img src="cal.gif" alt="" onclick="javascript:NewCssCal('toId', 'ddMMyyyy', 'arrow', true, '24')" style="cursor:pointer"/>
        <b>End of period: </b>
        <input readonly="" name="from" value="<%=from_timestamp%>" type="Text" id="fromId" maxlength="25" size="25"/>
        <img src="cal.gif" alt="" onclick="javascript:NewCssCal('fromId', 'ddMMyyyy', 'arrow', true, '24')" style="cursor:pointer"/>
        <input type="hidden" name="actionResult" value="<%=actionResult%>" />
        <input type="hidden" name="actionType" value="<%=actionType%>" />
        <p><input type="submit" value="SUBMIT" />
    </form>     
    <%

        String T1 = new TimeStamp1(from_timestamp + ":00:000").getNowUnformated();
        String T2 = new TimeStamp1(to_timestamp + ":00:000").getNowUnformated();
        String diligent_db = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties", "diligent_db", "utf-8","localhost");
        DatabaseLogger myDatabaseLogger = new DatabaseLogger("com.mysql.jdbc.Driver", "jdbc:mysql://"+diligent_db+":3306/dslmon_skopia?user=sa&password=trinitron");
        myDatabaseLogger.connect();
        //-------
        String sqlStr = "select actionType, actionID, actionDesc, actionResult, actionReportedDate, actionStatus from Actor.actions where actionReportedDate >= '" + T2 + "' AND actionReportedDate <= '" + T1 + "' order by actionReportedDate desc";
        //out.println("sqlStr="+sqlStr);
        //out.println("actionType="+actionType);
        //out.println("actionResult="+actionResult);
        
        res = myDatabaseLogger.getResults(sqlStr);
        out.println("<table border='1'  bgcolor='lightblue'> ");
        out.println("<tr><th>Reported</th><th>desc</th><th>SVT result( Transport - service )</th><th>status</th></tr>");
        while (res.next()) {
            try {
                if ((actionResult == null || actionResult.equals("null")|| res.getString("actionResult").startsWith(actionResult)) && actionType.equals(res.getString("actionType"))) {

                    String myReportedDate = "";
                    try {
                        myReportedDate = new TimeStamp1(res.getString("actionReportedDate")).getNowFormated();
                    } catch (Exception e) {out.println(e.toString());
                    }
                    String actionResultRes = res.getString("actionResult");//SVT_TRANSPORT_NOK:Not OK:Not OK
                    out.println("<tr>"
                            + "<td>" + myReportedDate
                            + "<td>" + res.getString("actionDesc") + "</td>"
                            + "<td>" + actionResultRes+ "</td>"
                            + "<td>" + res.getString("actionStatus") + "</td>"
                            + "</td></tr>");
                }
            } catch (Exception e) {
                //out.println("orders:actionResult=" + res.getString("actionResult"));
            }
        }

        res.close();
        out.println("</table>");

    %>

</body>
</html>







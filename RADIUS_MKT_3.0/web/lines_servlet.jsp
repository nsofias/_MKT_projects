<%@page import="nsofiasLib.fileIO.FileParser2Daemon,radius.*,java.util.Map,java.util.ArrayList,java.util.List,nsofiasLib.time.TimeStamp1"%>
<%--  
    Document   : alarms
    Created on : Oct 17, 2018, 12:40:34 PM
    Author     : nsofias
--%>
<%  response.setCharacterEncoding("utf-8");
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");;
    response.setCharacterEncoding("utf-8");
    String search = request.getParameter("search");
    String state = request.getParameter("state");
    try
        {
        List<RadiusSessionRecord> myRadiusLogRecords;
        if (state == null)
            {
            myRadiusLogRecords = myContainer.getSessionsAsList();
            }
        else if (state.equals("live"))
            {
            myRadiusLogRecords = myContainer.getLiveSessionsAsList();
            }
        else if (state.equals("closed"))
            {
            myRadiusLogRecords = myContainer.getClosedSessionsAsList();
            }
        else
            {
            return;
            }
        for (RadiusSessionRecord myRadiusLogRecord : myRadiusLogRecords)
            {
            String line = "";
            for (String rec : myRadiusLogRecord.getMyValues())
                {
                line += rec + "\t";
                }
            if (search == null || line.contains(search))
                {
                out.println(line + "\n");
                }
            }
        }
    catch (Exception e)
        {
        out.println("connector_exception :" + e.toString());
        }
%>

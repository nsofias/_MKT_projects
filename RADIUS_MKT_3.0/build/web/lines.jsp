<%@page import="nsofiasLib.fileIO.FileParser2Daemon,radius.*,java.util.Map,java.util.ArrayList,java.util.List,nsofiasLib.time.TimeStamp1"%>
<%-- 
    Document   : alarms
    Created on : Oct 17, 2018, 12:40:34 PM
    Author     : nsofias
--%>
<%  response.setCharacterEncoding("utf-8");
    String search = request.getParameter("search");
    //----------
    ServletContext myContext = request.getServletContext();
    RadiusLog_LineParserListener myContainer = (RadiusLog_LineParserListener) myContext.getAttribute("container");
    long max = -1;
    try
        {
        max = Long.valueOf(request.getParameter("max"));
        }
    catch (Exception e)
        {
        }
    String state = request.getParameter("state");
%>
<!DOCTYPE html>
<html>


    <head>
        <title>Sessions</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>
        <table>
            <%  response.setCharacterEncoding("utf-8");
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
                    out.println(toCSVString(myRadiusLogRecords, max, search));
                    }
                catch (Exception e)
                    {
                    out.println("connector_exception :" + e.toString());
                    }
            %>
        </table>
    </body>  
    <%!
        String toCSVString(List<RadiusSessionRecord> myRadiusLogRecords, long max, String search)
            {
            int count = 0;
            String str = "";
            for (RadiusSessionRecord myRadiusLogRecord : myRadiusLogRecords)
                {
                String str1 = "<tr>";
                for (String e : myRadiusLogRecord.getMyValues())
                    {
                    str1 += "<td nowrap>";
                    str1 += e;
                    str1 += "</td>";
                    }
                str1 += "</tr>";
                if (search == null || str1.contains(search))
                    {
                    str += str1;
                    count++;
                    }
                if (count > max && count != -1)
                    {
                    break;
                    }
                }
            return str;
            }
    %>



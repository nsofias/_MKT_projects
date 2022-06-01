<%@page import="java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<!DOCTYPE html>
<%
    String mySR = request.getParameter("SR");
    ServletContext myContext = request.getServletContext();
    //
    try
        {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        }
    catch (Exception e)
        {
        }
    //
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    List<String> events = new ArrayList();
    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
        {
        events.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getEventsLogArrayList());
        }

%>
<html>   
    <head>
        <title>EVENT LOG</title>
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>  
        <%            
            if (!userType.equals("00"))
                {
                return;
                }
            if (events.isEmpty())
                {
                out.println("<h2>Currently there are no systems events</h2>");
                return;
                }
        %>         
        <table  width="%" border='1'>
            <tr bgcolor="LightBlue">
                <% if (mySR == null)
                        {%>
                <th>Events log</th>
                    <%      }
                    else
                        {%>
                <th>Events log for <%=mySR%></th>
                    <%}%>
            </tr>

            <%

                for (String myEvent : events)
                    {
                    if (mySR == null || myEvent.contains(mySR))
                        {%>                            
            <tr>
                <td> 
                    <%=myEvent%>
                </td> 
            </tr> 
            <%          }
                    }
            %>        
        </table>
    </body>
</html>


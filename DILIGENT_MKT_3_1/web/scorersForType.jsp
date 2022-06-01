<%@page import="java.text.NumberFormat,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ServletContext myContext = request.getServletContext();
    try
        {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        }
    catch (Exception e)
        {
        }
    //******************************************************************
    String type = request.getParameter("type");
    String reportType = request.getParameter("reportType");//events,impact

    Container myCCMonitorStatsObjsContainer = null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
        {
        if (type != null && (type.equals(myGroupBy_Daemon.getDesc())))
            {
            myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
            }
        }
    Counters topScorers = new Counters();
    

    String T1, T2;
    try
        {
        if (request.getParameter("from") != null && request.getParameter("to") != null)
            {
            T1 = request.getParameter("from");
            T2 = request.getParameter("to");
            }
        else
            {
            TimeStamp1 t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());
            TimeStamp1 t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addHours(-24 * 7);
            T1 = t1.getNowUnformated();
            T2 = t2.getNowUnformated();
            }
        out.println(myCCMonitorStatsObjsContainer.getMyClock());
        //    out.println(T1);out.println(T2);
        }
    catch (Exception e)
        {
        out.println("NO CLOCK YET!!!!!!!!");
        return;
        }
    String reportType_ = "";
    if (reportType.equals("events"))
        {
        reportType_ = "Number of events";
        }
    else if (reportType.equals("impact"))
        {
        reportType_ = "Impact (Human Hours)";
        }        String elType = "";
        if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER))
            {
            elType = "SERVING_AREA : ATC : DSLAM : slot";
            }
        else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE))
            {
            elType = "RSU : Cable : DP";     
            }
        else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON))
            {
            elType = "OLT : Shelf : Slot";
            }
        else if (type.equals(diligent_MKT.Alarm_FYROM.TYPE_GPON_CABLE))
            {
            elType = "ATC : Cable : BOX";
            }
%>

<!DOCTYPE html>

<html>
    <head>
        <title>Alarms</title>   
        <link rel="stylesheet" href="global_1.css">
    </head>
    <body>         
        <table  border='1'>
            <tr bgcolor="LightBlue">
                <th><%=elType%></th>  
                <th><%=reportType_%></th>                        
            </tr> 

            <%
                if (myCCMonitorStatsObjsContainer == null)
                    {
                    return;
                    }
                if (reportType.equals("events"))
                    {
                    topScorers = myCCMonitorStatsObjsContainer.getTopScorers_events(T1, T2);
                    }
                else if (reportType.equals("impact"))
                    {
                    topScorers = myCCMonitorStatsObjsContainer.getTopScorers_impact(T1, T2);
                    }
                List<String> labels = topScorers.getLabelsSortedBy(Counters.sortByValue);
                for (String header : labels)
                    {
                    try
                        {
                        String niceHeader = "";
                        niceHeader = header.replace(";", " : ");
                      
                        String reduction = "0";
                        if (reportType.equals("events"))
                            {
                            reduction = format_number(topScorers.getCount(header));
                            }
                        else if (reportType.equals("impact"))
                            {
                            reduction = format_number(topScorers.getValue(header));
                            }
            %>
            <tr>                      
                <td nowrap><a href='HistoryServlet?type=<%=type%>&resource=<%=header%>' target='_blank'><%=niceHeader%></a></td>
                <td><%=reduction%></td>
            </tr> 
            <%                  }
                    catch (Exception e)
                        {
                        out.println(e.toString());
                        }
                    }
            %>

        </table>
    </body>
</html>

<%!
    private String format_number(double myNumder)
        {
        NumberFormat myNumberFormat = NumberFormat.getInstance();
        myNumberFormat.setMinimumFractionDigits(0);
        myNumberFormat.setMaximumFractionDigits(0);
        return (myNumberFormat.format(myNumder));
        }
%>
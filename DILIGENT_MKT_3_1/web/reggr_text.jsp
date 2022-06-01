<%@page import="SKOPIA.Config,java.util.Collections,java.util.Iterator"%>
<%@page import="org.apache.catalina.ha.backend.CollectedInfo"%>
<%@page import="java.util.Map,java.text.NumberFormat,nsofiasLib.utils.mapper.*,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.ArrayList,java.util.List,SKOPIA.*"%>
<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    <html>
<head>
    <title>Alarms</title>
    <link rel="stylesheet" href="global_1.css">

</head>
<!--    <body onload="JavaScript:timedRefresh(120000);"> -->
<body>         
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
        String volumeMin = request.getParameter("volumeMin");
        if (volumeMin == null)
            {
            volumeMin = "-1";
            }
        //
        int maxDataToDisplay = 700;
        String maxDataToDisplay_ = request.getParameter("maxDataToDisplay");
        if (maxDataToDisplay_ != null)
            {
            maxDataToDisplay = Integer.valueOf(maxDataToDisplay_);
            }
        //----------------------
        Container myCCMonitorStatsObjsContainer = null;
        //-----------------------------------------------
        String type = request.getParameter("type");
        String order_Desc = request.getParameter("order_Desc");
        //------------------------------------
        String elType = "";
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
    <h2>User sessions distribution</h2>
    <table  border="1" width="100%"   id="table2" cellspacing="5" cellpadding="5">   
        <th><%=elType%></th>
        <th>sessions</th> 
            <%
                ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
                for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
                    {
                    if (type != null && type.equals(myGroupBy_Daemon.getDesc()))
                        {
                        myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
                        }
                    }
                if (myCCMonitorStatsObjsContainer == null)
                    {
                    return;
                    }
                //-------
                Counters_1D_decimal myLastAggregation = new Counters_1D_decimal();

                try
                    {
                    myLastAggregation.update(myCCMonitorStatsObjsContainer.getLastAggregation());
                    //myLastAggregation.setTotalValue(myCCMonitorStatsObjsContainer.getLastAggregation().getTotalValue());
                    if (order_Desc != null)
                        {
                        myLastAggregation.sortByValueIncr();
                        }
                    else
                        {
                        myLastAggregation.sortByValue();
                        }
                    }
                catch (Exception e)
                    {
                    return;
                    }
                //CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = myGroupBy_Daemons.get(0).getMyStatsObjContainer();      
                //---------------------------------------------------------- 
                Iterator itr = myLastAggregation.getKeysIterator();
                int count = 0;
                while (itr.hasNext() && count < maxDataToDisplay)
                    {
                    count++;
                    String myLabel = (String) itr.next();
                    double myVolumn = myLastAggregation.getValue(myLabel);
                    String labelDesc = myLabel.replace(";", " : ");
                    if (myVolumn > 1)
                        {
                            %>         
                        <tr>
                            <td><a href="reggr_text.jsp?type=<%=type%>&label=<%=labelDesc%>&net_type_fix=y&net_type_mobile=y" target="_blank"><b><%=labelDesc%></b></a> </td>
                            <td><%=myVolumn%></td>   
                        </tr>
                        <%  }
                        else
                            {
                        %>         
                        <tr>
                            <td nowrap><%=labelDesc%> </td>
                            <td><%=myVolumn%></td>
                        </tr>
                        <%  }
                out.flush();
                }
            out.flush();
        %>

    </table>                                 
</body>
</html> 
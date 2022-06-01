<%@page import="nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    Container myCCMonitorStatsObjsContainer = null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
        {
        if (type != null && (type.equals(myGroupBy_Daemon.getDesc())))
            {
            myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
            }
        }
    if (myCCMonitorStatsObjsContainer == null)
        {
        return;
        }
//******************************************************************    

    String reportType = request.getParameter("reportType");//events,impact
    //------------------------
    int daysBack = 7;
    try
        {
        daysBack = Integer.parseInt(request.getParameter("daysBack"));
        }
    catch (Exception e)
        {
        }

    String T1, T2, T1_, T2_;
    try
        {
        if (request.getParameter("from") != null && request.getParameter("to") != null)
            {
            T1 = request.getParameter("from");
            T2 = request.getParameter("to");
            T1_ = new TimeStamp1(T1).getNowFormated();
            T2_ = new TimeStamp1(T2).getNowFormated();
            }
        else
            {
            TimeStamp1 t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());
            TimeStamp1 t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addHours(-24 * daysBack);
            T1 = t1.getNowUnformated();
            T2 = t2.getNowUnformated();
            T1_ = t1.getNowFormated();
            T2_ = t2.getNowFormated();
            }
        }
    catch (Exception e)
        {
        out.println("NO CLOCK YET!!!!!!!!");
        return;
        }
%>

<!DOCTYPE html>

<html>
    <head>
        <title>TOP10</title>
        <script  type="text/javascript">
            var max_timePage = 120;
            var max_timeData = 120;
            if (max_timeData < 0) {
                max_timeData = 120;
            }
            var cinterval;

            function countdown_timer() {
                max_timePage--;
                max_timeData--;
                document.getElementById('countdownPage').innerHTML = max_timePage;
                if (max_timeData < 0)
                {
                    document.getElementById('countdownData').innerHTML = "READY";
                    window.location.reload(true);
                } else
                {
                    document.getElementById('countdownData').innerHTML = max_timeData;
                }
                //
                if (max_timePage === 0) {
                    clearInterval(cinterval);
                }
            }
            // 1,000 means 1 second.
            cinterval = setInterval('countdown_timer()', 1000);
        </script>        
    </head>    

    <body> 
        <table border="0" width="100%"   id="table1" >
            <tr>
                <td nowrap width="5%" bgcolor="grey"><font color="white">Page refresh: <span id="countdownPage">0</span>s</font></td>                
                <td nowrap width="5%" bgcolor="grey"><font color="white">Data refresh: <span id="countdownData">0</span>s</font></td>                                
            </tr>
        </table>
        <b>Days back:</b><form action="scorers.jsp">
            <select onchange="form.submit()"  name="daysBack">
                <option value="<%=daysBack%>"><%=daysBack%></option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
            </select>
            <input type="hidden" name="reportType" value="<%=reportType%>" />
        </form>
        <h2> <IMG src='img/sad.jpg'>TOP unstable resources from <%=T2_%> to <%=T1_%></h2>
        <!--    <p>
                <h3>Instability Indicator = sum of disconnections/sum of live sessions</h3> 
        //reportType:events,impact
        -->
        <table width="100%">              
            <tr>
                <td><iframe width="530" height="800" src= "scorersForType.jsp?from=<%=T1%>&to=<%=T2%>&type=<%=type%>&reportType=events" frameborder= "0" ></iframe></td>
                <td><iframe width="530" height="800" src= "scorersForType.jsp?from=<%=T1%>&to=<%=T2%>&type=<%=type%>&reportType=impact" frameborder= "0"></iframe></td>                
            </tr>            
        </table>
    </body>
</html>


<%@page import="java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>
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
    ServletContext myContext=request.getServletContext();
    try
        {
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        }
    catch (Exception e)
        {
        }
    //------------------------------
    String type = request.getParameter("type");

    List alarmArrayList = new ArrayList();
    Container myCCMonitorStatsObjsContainer=null;
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    for (Diligent_Daemon myGroupBy_Daemon : myGroupBy_Daemons)
        {
        if (type != null && (type.equals(myGroupBy_Daemon.getDesc()) ) )
            {
            alarmArrayList.addAll(myGroupBy_Daemon.getMyStatsObjContainer().getAlarmArrayList());
            myCCMonitorStatsObjsContainer = myGroupBy_Daemon.getMyStatsObjContainer();
            }
        }
    try
        {
        Collections.sort(alarmArrayList);
        }
    catch (Exception e)
        {
        }
        String criticality = request.getParameter("criticality");        
        if (criticality==null)
            {
            criticality="0";
            }                                       
    //---------------------------------------------------------- 
        TimeStamp1 t1,t2;
        try{
        if (request.getParameter("from")!=null)
            t1 = new TimeStamp1(request.getParameter("from"));
        else
            t1=new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock());
        }catch(Exception e){out.println("NO CLOCK YET!!!!!!!!");return;}
        t2= new TimeStamp1(t1.getNowUnformated());
        t2.addHours(-5);               
%>
<!DOCTYPE html>

<html>
    <head>
        <title>Alarms</title>
        <script  type="text/javascript">
            var max_timePage = 120;
            var max_timeData = 120;
            if (max_timeData<0){max_timeData=120;}
            var cinterval;

            function countdown_timer(){
            max_timePage--;
            max_timeData--;
            document.getElementById('countdownPage').innerHTML = max_timePage;
            if (max_timeData<0)
                {
                document.getElementById('countdownData').innerHTML ="READY";
                window.location.reload(true); 
                }
            else
                {
                document.getElementById('countdownData').innerHTML = max_timeData;
                }
            //
            if(max_timePage === 0){
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
                <td nowrap width="10%" bgcolor="grey"><font color="white">Logged in as:<%=username%></font></td>    
                <td nowrap width="40%" bgcolor="grey"><font color="white">Page refresh: <span id="countdownPage">0</span>s</font></td>                
                <td nowrap width="40%" bgcolor="grey"><font color="white">Data refresh: <span id="countdownData">0</span>s</font></td>                
            </tr>
        </table>        
        <h1>Recent Alarms (<%=type%>)</h1>
            <table  border='1'>            
            <tr><IMG width='95%' src='AlarmsServletGantt?type=<%=type%>&from=<%=t1.getNowUnformated()%>&to=<%=t2.getNowUnformated()%>&criticality=<%=criticality%>'></tr>           
            </table>                
    </body>
</html>

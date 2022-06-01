<%@page import="SKOPIA.Config,java.util.Collections,java.util.Iterator"%>
<%@page import="org.apache.catalina.ha.backend.CollectedInfo"%>
<%@page import="nsofiasLib.utils.mapper.Counters_1D,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.ArrayList,java.util.List,SKOPIA.*"%>
<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%
    String type = request.getParameter("type");
    String order_Desc = request.getParameter("order_Desc");
    String net_type_fix = request.getParameter("net_type_fix");
    String net_type_mobile = request.getParameter("net_type_mobile");
    String quiryStr = "type=" + type;
    if (net_type_fix != null)
        {
        quiryStr += "&net_type_fix=" + net_type_fix;
        }
    if (net_type_mobile != null)
        {
        quiryStr += "&net_type_mobile=" + net_type_mobile;
        }    
    if (order_Desc!=null)
        {
        quiryStr += "&order_Desc=y";
        }    
    /*
            "dslmon_skopia.ktirio";
            "dslmon_skopia.ua";
            "dslmon_skopia.dslam";    
     */
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
    int maxDataToDisplay = 300;
    String maxDataToDisplay_ = request.getParameter("maxDataToDisplay");
    if (maxDataToDisplay_ != null)
        {
        maxDataToDisplay = Integer.valueOf(maxDataToDisplay_);
        }

%> 
<html>
    <head>
        <title>CCMonitor</title>

    </head>
    <!--    <body onload="JavaScript:timedRefresh(120000);"> -->
    <body>   
        <table  border="0" width="100%"   id="table2" cellspacing="0" cellpadding="0">
            <tr>
                <td>
                    <IMG width="100%" src="BRAS_servlet?<%=quiryStr%>&maxDataToDisplay=<%=maxDataToDisplay%>">                 
                </td>
            </tr>                     
        </table>


    </body>
</html> 

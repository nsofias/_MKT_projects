<%@page import="ccm.CallInfo"%>
<%@page import="java.util.Collections"%>
<%@page import="org.apache.catalina.ha.backend.CollectedInfo"%>
<%@page import="nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.ArrayList,java.util.List,ccm.CCMonitorStatsObjsContainer,ccm.CCMAlarm"%>
<%@page contentType="text/html; charset=UTF-8"%>


<%
        ServletContext myContext = request.getServletContext();
        Counters myCounters = (Counters) myContext.getAttribute("browseCounters");
        myCounters.updateCounters(request.getRequestURI() + " -> " + request.getRemoteAddr());
        //

        CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        if (from == null) {
            from = myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated();
            TimeStamp1 toTimeStamp = new TimeStamp1(from);
            toTimeStamp.addHours(-1);
            to = toTimeStamp.getNowUnformated();
        }
        Counters myAnumbers = myCCMonitorStatsObjsContainer.getLinesForPeriod(from, to);
        //out.print(myAnumbers.toHTMLString());
        List<String> labels = myAnumbers.getLabels();
        out.print(labels);    
%>



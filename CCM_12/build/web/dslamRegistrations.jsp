<%@page import="nsofiasLib.ote.DSLAMs.DslamDetails,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,ccm.CCMonitorStatsObjsContainer,ccm.CCMAlarm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String dslamCode = request.getParameter("dslamCode");
    ServletContext myContext=request.getServletContext();      
        try
            {
            nsofiasLib.ote.DSLAMs.DslamDetailsFinder myDslamDetailsFinder = new nsofiasLib.ote.DSLAMs.DslamDetailsFinder();
            DslamDetails myDslamDetails = myDslamDetailsFinder.getDslamDetails(dslamCode);
            long dslamRegistrations = myDslamDetails.getDslamRegistrations();
            out.println(dslamRegistrations);
            }
        catch (Exception e)
            {
            out.println(e.toString());
            }
%>

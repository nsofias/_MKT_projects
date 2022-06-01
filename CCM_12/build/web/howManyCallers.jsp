<%@page import="nsofiasLib.utils.Counters1"%>
<%@page import="ccm.CCMonitorStatsObjsContainer"%>
<%@page import="ccm.OTE.Ticket_OTE"%>
<%@page import="nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.ArrayList,java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try {
        ServletContext myContext = request.getServletContext();
        //-------variables only for statistics--    
        String dslam = request.getParameter("dslam");
        String slot = request.getParameter("slot");
        //--------------
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        CCMonitorStatsObjsContainer myCCMonitorStatsObjsContainer = (CCMonitorStatsObjsContainer) myContext.getAttribute("myContainer");
        //---------------------------------------------------------- 

        TimeStamp1 t1, t2;
        String T1, T2;
        if (from == null || to == null) {
            try {
                t1 = new TimeStamp1(myCCMonitorStatsObjsContainer.getMyClock().getNowUnformated());
            } catch (Exception e) {
                out.println("NO CLOCK YET!!!!!!!!");
                return;
            }
            t2 = new TimeStamp1(t1.getNowUnformated());
            t2.addMinutes(-(myCCMonitorStatsObjsContainer.getMeasurePeriod()));
            T1 = t1.getNowUnformated().substring(0, 13);
            T2 = t2.getNowUnformated().substring(0, 13);
        } else {
            T1 = from;
            T2 = to;
        }


        //-------------------
        String resource = null;
        String resourceType = null;
        if (slot != null && dslam != null) {
            resource = dslam + ":" + slot;
            resourceType = Ticket_OTE.ELEMENT_TYPE_SLOT;
        } else if (dslam != null) {
            resource = dslam;
            resourceType = Ticket_OTE.ELEMENT_TYPE_DSLAM;
        }
        //out.println(resource+" "+resourceType+" "+T1+" "+T2);
        //=========================================================
        if (resourceType != null) {
            Counters1 myIPResources = myCCMonitorStatsObjsContainer.getLinesForResource(resourceType, resource, T1, T2);
            //Counters myIPResources = myCCMonitorStatsObjsContainer.getQStatsObj("", T1, T2).getResourceCounters(myReasons, resourceType, myCCMonitorStatsObjsContainer.getPstnResourcesCache());
            if (resource != null) {
                //out.println(myIPResources.toString());
                out.print(resource + "@" + myIPResources.size());
            } else {
                for (String label : myIPResources.keySet()) {
                    out.println(label + "@" + myIPResources.getTotalValueOfLabel(label));
                }
            }
//            long numberOfCallers = myIPResources.getCountOfPatern(resource);
//            out.print(fromTimeStampFormated+" "+toTimeStampFormated+" "+numberOfCallers);
            out.flush();
        }
        //=================================================================
    } catch (NumberFormatException e) {
        out.print(e.getMessage());
    }
%>

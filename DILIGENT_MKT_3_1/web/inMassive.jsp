<%@page import="diligent_MKT.Alarm_FYROM"%>
<%@page import="nsofiasLib.ote.alarms.*,java.util.Map,nsofiasLib.utils.URLContextReader_object,nsofiasLib.ote.DSLAMs.DslamDetailsFinder,nsofiasLib.ote.DSLAMs.DslamDetails,java.util.Collections,nsofiasLib.utils.Counters,nsofiasLib.time.TimeStamp1,nsofiasLib.fileIO.SimpleLineParser,nsofiasLib.fileIO.FileParser2,java.util.List,java.util.ArrayList,SKOPIA.*"%>

<%-- 
    Document   : usersAffected
    Created on : Jan 23, 2019, 11:36:30 AM
    Author     : nsofias
--%>
<%
    request.setCharacterEncoding("UTF-8");
    ServletContext myContext = request.getServletContext();
    ArrayList<Diligent_Daemon> myGroupBy_Daemons = (ArrayList<Diligent_Daemon>) myContext.getAttribute("myDiligent_Daemons");
    //--------------------------
    String path = request.getParameter("path");
    String type = request.getParameter("type");
    String minutesDiff_ = request.getParameter("minutesDiff");
    double minutesDiff = 0;
    if (minutesDiff_ != null) {
        try {
            minutesDiff = Integer.parseInt(minutesDiff_);
        } catch (Exception e) {
        }
    }
    String result;
    //
    for (Diligent_Daemon myDaemon : myGroupBy_Daemons) {
        if (type == null || myDaemon.getDesc().equals(type)) {
            try {
                String res;
                if (minutesDiff == 0) {
                    res = isLineInMassive(path, myDaemon);
                } else {
                    res = isLineInMassiveRecently(path, myDaemon);
                }
                if (res != null) {
                    result = res;
                    out.println(result);
                    return;
                }
            } catch (Exception e) {
                result = "ERROR_" + e.toString();
                out.println(result);
                return;
            }
        }
    }
    result = "NO_MASSIVE";
    out.println(result);
%>

<%!
    public String isLineInMassive(String path, Diligent_Daemon myDaemon) throws Exception {
        List<Alarm_FYROM> myLiveAlarms = myDaemon.getMyStatsObjContainer().getAlarmArrayList_stillAlive();
        System.out.println("NewWebServiceFromWSDL:myLiveAlarms.size()=" + myLiveAlarms.size());
        for (Alarm_FYROM myAlarm : myLiveAlarms) {
            System.out.println("NewWebServiceFromWSDL:path:" + path + " <->  Alert:" + myAlarm.getAlertOrigin());
            if (path.contains(myAlarm.getAlarmObject())) {
                String sr = myAlarm.getTicketSR();
                String alarmReason = myAlarm.getAlarmReason();//Massive, Maintenance
                return sr + ";" + alarmReason;
            }
        }
        return null;
    }

    public String isLineInMassiveRecently(String path, Diligent_Daemon myDaemon) throws Exception {
        List<Alarm_FYROM> myAlarms = myDaemon.getMyStatsObjContainer().getAlarmArrayList();
        System.out.println("NewWebServiceFromWSDL:myLiveAlarms.size()=" + myAlarms.size());
        TimeStamp1 now = new TimeStamp1();
        for (Alarm_FYROM myAlarm : myAlarms) {
            try {
                //System.out.println("NewWebServiceFromWSDL:path:" + path + " <->  Alert:" + myAlarm.getAlertOrigin());
                if (!myAlarm.isStilAlive() && myAlarm.getAlarmStop() != null && !myAlarm.getAlarmStop().isEmpty() && path.contains(myAlarm.getAlarmObject())) {
                    TimeStamp1 stopped = new TimeStamp1(myAlarm.getAlarmStop());
                    double timeDiff = now.minutesDiff(stopped);
                    if (timeDiff < 90) {
                        String sr = myAlarm.getTicketSR();
                        String alarmReason = myAlarm.getAlarmReason();//Massive, Maintenance
                        return sr + ";" + alarmReason;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }
%>

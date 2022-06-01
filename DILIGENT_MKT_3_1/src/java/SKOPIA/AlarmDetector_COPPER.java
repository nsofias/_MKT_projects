package SKOPIA;

import diligent_MKT.AddServiceElements_ACTION_Thread;
import diligent_MKT.AlarmOpenningProfile;
import diligent_MKT.Alarm_FYROM;
import static diligent_MKT.Alarm_FYROM.COPPER_PATH_DEPTH_ATC;
import static diligent_MKT.Alarm_FYROM.COPPER_PATH_DEPTH_DSLAM;
import static diligent_MKT.Alarm_FYROM.COPPER_PATH_DEPTH_SERVING_AREA;
import static diligent_MKT.Alarm_FYROM.COPPER_PATH_DEPTH_SLOT;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_ATC;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_DSLAM;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SERVING_AREA;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_SLOT;
import static diligent_MKT.Alarm_FYROM.TYPE_COPPER;
import diligent_MKT.Ticket_FYROM;
import java.util.*;
import nsofiasLib.ote.alarms.Alarm_Parameters;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.mapper.paths.Path;
import nsofiasLib.utils.mapper.paths.Paths_1D_decimal;
import nsofiasLib.utils.mapper.paths.ReducedPathInfo;

public class AlarmDetector_COPPER extends AlarmDetector
    {

    public AlarmDetector_COPPER(Config myConfig)
        {
        super(myConfig);
        //
        String type1 = TYPE_COPPER.replace("TYPE_", "");
        parameters.load(type1);
        }

    @Override
    public ArrayList createAlarms(Paths_1D_decimal myLastAggregation, Paths_1D_decimal myBeforeLastAggregation) throws Exception
        {
        ArrayList<Alarm_FYROM> newAlarmsFound = new ArrayList();
        TimeStamp1 clock = new TimeStamp1(getMyContainer().getMyClock());
        clock.addMinutes(-15);
        String createAlarmsTimeStamp = clock.getNowUnformated();
        try
            {
            //------------------- Check myDisconnPaths -------------------------------
            System.out.println("DSLMON_SKOPIA:myDinsconnIPResources size = " + myLastAggregation.size());
            ArrayList<ReducedPathInfo> vanished = myLastAggregation.getReducedInfo(myBeforeLastAggregation, getParameters().ALARM_OPEN_PERC_REDUCTION, getParameters().ALARM_OPEN_DELTA_MIN);
            //************************************************************************************************************************************
            //*************** CONDITIONS *********************************************************************************************************  
            //************************************************************************************************************************************
            ArrayList<ReducedPathInfo> vanished1 = new ArrayList();
            vanished1.addAll(vanished);
            for (ReducedPathInfo reducedInfo : vanished1)
                {
                String myLabel = reducedInfo.getMyLabel();
                Map<String, Ticket_FYROM> ticketList = getMyContainer().getTicketsArrayList();
                for (String myTicketId : ticketList.keySet())
                    {
                    Ticket_FYROM myTicket = ticketList.get(myTicketId);
                    //--- if alarm finds already OPENN (in IMB) ticket with some of the  alarms' childs (alarm label = open ticket's corr string) then append its child allarms to alredy OPEN ticket ----------------------------
                    if (myTicket.getCollerationString().equals(myLabel) && myTicket.isOpen())
                        {
                        vanished.remove(reducedInfo);
                        vanished.addAll(reducedInfo.getChilds());
                        System.out.println("DSLMON_SKOPIA -> createAlarms: myOpenTicket " + myTicket.getCollerationString() + " updated by Parent elements' childs");
                        break;
                        }
                    //--- if alarm finds already PENDING ticket with some of the  alarms' childs (alarm label = pending tickt's corr string) then cancel pending ticket ------------------
                    if (myTicket.getCollerationString().equals(myLabel) && myTicket.isPending())
                        {
                        myTicket.setState(Ticket.STATE_CANCELED);
                        System.out.println("DSLMON_SKOPIA -> createAlarms: myPendingTicket " + myTicket.getCollerationString() + " Closed by Parent element");
                        break;
                        }
                    }
                }
            //************************************************************************************************************************************
            //******** CONDITIONS END*************************************************************************************************************
            //************************************************************************************************************************************
            for (ReducedPathInfo reducedInfo : vanished)
                {
                String myLabel = reducedInfo.getMyLabel();
                double currentValue = reducedInfo.getThisCount();
                double previousValue = reducedInfo.getPreviousCount();
                double reduction = reducedInfo.getReduction();
                double deltaValue = previousValue - currentValue;
                //System.out.println(myLabel + " Vanished:" + deltaValue + " Previously active:" + previousValue + " Currently active=" + currentValue + " type=" + type);
                //-------------------------------------------------
                try
                    {
                    //System.out.println(myLabel + " Vanished:" + deltaValue + " Previously active:" + previousValue + " Currently active=" + currentValue + " type=" + type);
                    Alarm_FYROM myAlarm = new Alarm_FYROM(myLabel, createAlarmsTimeStamp);
                    myAlarm.setAlarmType(this.findElementType());
                    String[] pathParts = myLabel.split(AlarmDetector.PATH_DELIMETER);
                    myAlarm.setSERVING_AREA(pathParts[COPPER_PATH_DEPTH_SERVING_AREA - 1]);
                    if (pathParts.length >= 2)
                        {
                        myAlarm.setATC(pathParts[COPPER_PATH_DEPTH_ATC - 1]);
                        }
                    if (pathParts.length >= 3)
                        {
                        myAlarm.setDSLAM(pathParts[COPPER_PATH_DEPTH_DSLAM - 1]);
                        }
                    if (pathParts.length == 4)
                        {
                        myAlarm.setSLOT(pathParts[COPPER_PATH_DEPTH_SLOT - 1]);
                        }
                    //------------ setObjType ----------
                    int level = pathParts.length;
                    myAlarm.setDESCRIPTION(pathParts[level - 1]);
                    String myObjType = findElementSubType(level);
                    myAlarm.setAlarmSubType(myObjType);
                    //----------------------------------                        
                    Path myPath = new Path(pathParts, AlarmDetector.PATH_DELIMETER);
                    myAlarm.setCorrStr(myPath.getCorrelationPath().toString());
                    if (!sameAlarmAlreadyOpen(myAlarm))
                        {
                        myAlarm.setAlertStart(createAlarmsTimeStamp);
                        myAlarm.setAlarmStop(createAlarmsTimeStamp);
                        myAlarm.setValueStuck(currentValue);
                        myAlarm.setLinesDisconnected((long) deltaValue);
                        if (myAlarm.getLinesDisconnected() >= getParameters().ALARM_CREATE_STATE_VOLUMN_MIN)
                            {
                            try
                                {
                                //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
                                if ((myObjType.equals(SUBTYPE_COPPER_SERVING_AREA) && reduction < 0.05)
                                        || (myObjType.equals(SUBTYPE_COPPER_ATC) && reduction < 0.05)
                                        || (myObjType.equals(SUBTYPE_COPPER_DSLAM) && reduction < 0.05))
                                    {
                                    myAlarm.setDesc(myObjType + " alert: " + findAlarmSynopsis("SERVING_AREA;ATC;DSLAM;SLOT", myLabel, myAlarm.getLinesDisconnected()));
                                    myAlarm.setAlarmOpenningProfile(new AlarmOpenningProfile("1; ;0"));
                                    //---------- linesRegistered ---------------------------- 
                                    int linesRegistered = 0;
                                    try
                                        {
                                        linesRegistered = myAlarm.findLinesRegistered();
                                        if (linesRegistered == 0)
                                            {
                                            continue;
                                            }
                                        myAlarm.setLinesRegistered(linesRegistered);
                                        }
                                    catch (Exception e)
                                        {
                                        System.out.println("DSLMON_SKOPIA ->(COPPER) findNumberOfVanishedLines: error: header:= " + myLabel + ", " + e.toString()+" error:"+e.toString());
                                        }
                                    newAlarmsFound.add(myAlarm);
                                    }
                                else if ((myObjType.equals(SUBTYPE_COPPER_DSLAM) && reduction < 0.8)
                                        || (myObjType.equals(SUBTYPE_COPPER_SLOT) && reduction < 0.8))
                                    {
                                    boolean dGasp = myAlarm.checkDying_gasp_state();
                                    boolean existsAlarmInNMS = myAlarm.existsAlarmInNMS();
                                    AlarmOpenningProfile openningProfile = findAlarmOpenningProfile(myObjType, dGasp, existsAlarmInNMS);//SUBTYPE_COPPER_DSLAM;yes;yes", "1;Possible Power Outage;0
                                    myAlarm.setAlarmOpenningProfile(openningProfile);
                                    System.out.println("DSLMON_SKOPIA ->(COPPER) armOpenningProfile for " + myLabel + " is " + openningProfile);
                                    if (openningProfile.isToOpen())
                                        {
                                        myAlarm.setDesc(myObjType + " alert: " + findAlarmSynopsis("SERVING_AREA;ATC;DSLAM;SLOT", myLabel, myAlarm.getLinesDisconnected()));
                                        int linesRegistered = 0;
                                        try
                                            {
                                            linesRegistered = myAlarm.findLinesRegistered();
                                            if (linesRegistered == 0)
                                                {
                                                continue;
                                                }
                                            myAlarm.setLinesRegistered(linesRegistered);
                                            }
                                        catch (Exception e)
                                            {
                                            System.out.println("DSLMON_SKOPIA ->(COPPER) findNumberOfVanishedLines: error: header:= " + myLabel + ", " + e.toString()+" error:"+e.toString());
                                            }
                                        newAlarmsFound.add(myAlarm);
                                        }
                                    }
                                //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
                                }
                            catch (Exception e)
                                {
                                myAlarm.setDesc(myObjType + " alert: " + findAlarmSynopsis("SERVING_AREA;ATC;DSLAM;SLOT", myLabel, myAlarm.getLinesDisconnected()));
                                newAlarmsFound.add(myAlarm);
                                System.out.println("DSLMON_SKOPIA -> createAlarms: NMS filters error, (alarm is proccess continued header:= " + myLabel + ", " + e.toString()+" error:"+e.toString());
                                new MailAlert().sendmailAlert("DSLMON_SKOPIA -> createAlarms: NMS filters error, (alarm is proccess continued header:= " + myLabel,e);
                                }
                            }
                        //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                        }
                    }
                catch (Exception e)
                    {
                    System.out.println("DSLMON_SKOPIA ->(COPPER) createAlarms: error: header:= " + myLabel + ", " + e.toString()+" error:"+e.toString());
                    //e.printStackTrace(System.out);
                    new MailAlert().sendmailAlert("DSLMON_SKOPIA error:"+" error:",e);
                    }
                }
            }
        catch (Exception e)
            {
            getMyContainer().getEventsLogArrayList().add(0, new TimeStamp1().getNowFormated() + ": CheckforAlarms() error " + e.getMessage());
            System.out.println("DSLMON_SKOPIA ->(COPPER) createAlarms: " + e.toString()+" error:"+e.toString());
            new MailAlert().sendmailAlert("DSLMON_SKOPIA error:"+" error:",e);
            }
        // ---------- Make Unique newAlarms  --------
        ArrayList<Alarm_FYROM> newAlarms_UNIQUE = new ArrayList();
        for (Alarm_FYROM myAlarm : newAlarmsFound)
            {
            if (!isSourceInAlarmArrayList(myAlarm.getObjName(), newAlarms_UNIQUE))
                {
                newAlarms_UNIQUE.add(myAlarm);
                }
            }
        return newAlarms_UNIQUE;
        }

    @Override
    public Map<String, Ticket_FYROM> createTickets(ArrayList<Alarm_FYROM> newAlarms)
        {
        Map<String, Ticket_FYROM> myNewTickets = new HashMap();
        Map<String, ArrayList<Alarm_FYROM>> grouppedAlarms = Collections.synchronizedMap(new LinkedHashMap());
        for (Alarm_FYROM myAlarm : newAlarms)
            {
            String correlationString = myAlarm.getCorrStr();
            Ticket_FYROM oldPendingTicket = findOldPendingTicket(correlationString);
            //----------- insert into pending ticket if it has the same correlation String -------------------
            if (oldPendingTicket != null)
                {
                oldPendingTicket.includeNetworkElement(myAlarm);
                System.out.println("DSLMON_SKOPIA -> createAlarms: includeNetworkElement " + myAlarm.getNetworkElementName() + " to already open ticket with SR " + oldPendingTicket.getSR());
                continue;
                }
            //----------- insert into open ticket if it has the same correlation String -------------------
            Ticket_FYROM oldOpenTicket = findOldOpenTicket(correlationString);
            if (!correlationString.equals("ROOT"))
                {
                if (oldOpenTicket != null)
                    {
                    oldOpenTicket.includeNetworkElement(myAlarm);
                    // -------- update IBM & CRM----------------
                    ArrayList<Alarm_FYROM> myElementsList = new ArrayList();
                    myElementsList.add(myAlarm);
                    try
                        {
                        //---------------- update (AddServiceElements_ACTION_Thread) in maximo ------------
                        Alarm_Parameters myParameters = new Alarm_Parameters();
                        myParameters.setHttp_proxyHost(myConfig.getHttp_proxyHost());
                        myParameters.setHttp_proxyPort(myConfig.getHttp_proxyPort());
                        myParameters.setERRORS_sendMailAlert(myConfig.isERRORS_sendMailAlert());
                        myParameters.setERRORS_mailSender(myConfig.getERRORS_mailSender());
                        myParameters.setERRORS_mailServer(myConfig.getERRORS_mailServer());
                        myParameters.setERRORS_mail_cc_recipients(myConfig.getERRORS_mail_cc_recipients());
                        myParameters.setERRORS_mail_recipients(myConfig.getERRORS_mail_recipients());
                        myParameters.setERRORS_mailUser(myConfig.getERRORS_mailUser());
                        myParameters.setERRORS_mailPass(myConfig.getERRORS_mailPass());
                        myParameters.setTICKETS_sendMailAlert(myConfig.isTICKETS_sendMailAlert());
                        myParameters.setTICKETS_mailSender(myConfig.getTICKETS_mailSender());
                        myParameters.setTICKETS_mailServer(myConfig.getTICKETS_mailServer());
                        myParameters.setTICKETS_mail_cc_recipients(myConfig.getTICKETS_mail_cc_recipients());
                        myParameters.setTICKETS_mail_recipients(myConfig.getTICKETS_mail_recipients());
                        myParameters.setTICKETS_mailUser(myConfig.getTICKETS_mailUser());
                        myParameters.setTICKETS_mailPass(myConfig.getTICKETS_mailPass());
                        //
                        System.out.println("DSLMON_SKOPIA -> createAlarms: trying toAddServiceElements_ACTION_Thread for " + myAlarm.getNetworkElementName() + " to already open ticket with SR " + oldOpenTicket.getSR());
                        AddServiceElements_ACTION_Thread myAddServiceElements_ACTION_Thread = new AddServiceElements_ACTION_Thread("Diligent",oldOpenTicket, myElementsList, myContainer.getEventsLogArrayList(), myParameters);
                        new Thread(myAddServiceElements_ACTION_Thread).start();
                        }
                    catch (Exception e)
                        {
                        System.out.println("DSLMON_SKOPIA -> createAlarms error: myTicket " + myAlarm.getNetworkElementName() + " failed to be appended to open Ticket " + oldOpenTicket.getTicketId() + " " + e.toString());
                        }
                    System.out.println("DSLMON_SKOPIA -> createAlarms: myTicket " + myAlarm.getNetworkElementName() + " appended to open Ticket " + oldOpenTicket.getTicketId());
                    continue;
                    }
                }
            //----------------------------------------------
            if (grouppedAlarms.get(correlationString) == null)
                {
                ArrayList<Alarm_FYROM> myList = new ArrayList();
                myList.add(myAlarm);
                if (correlationString.equals("ROOT"))
                    {
                    grouppedAlarms.put(myAlarm.getNetworkElementName(), myList);
                    }
                else
                    {
                    grouppedAlarms.put(correlationString, myList);
                    }
                }
            else
                {
                ArrayList<Alarm_FYROM> myList = grouppedAlarms.get(correlationString);
                myList.add(myAlarm);
                }
            }
        //--------------------------
        for (String list_ID : grouppedAlarms.keySet())
            {// fow each siteID
            List<Alarm_FYROM> alarmsInTicket = (ArrayList) grouppedAlarms.get(list_ID);
            Ticket_FYROM myTicket = new Ticket_FYROM(list_ID);
            myTicket.setType(this.findElementType());
            //------------ setObjType ----------            
            String subType = alarmsInTicket.get(0).getAlarmSubType();
            myTicket.setSubType(subType);
            //----------------------
            try
                {
                myTicket.setArea(myTicket.getTicketId().split("@")[0]);
                }
            catch (Exception e)
                {
                myTicket.setArea("N/A");
                }
            myTicket.appendNetworkElements(alarmsInTicket);
            myTicket.setIncidentStartDate(myTicket.getElementsList().get(0).getAlarmStart());
            myTicket.setState(Ticket_FYROM.STATE_PENDING_TO_OPEN);
            myTicket.setSYNOPSIS(myTicket.getDesc());
            //-----------PENDING_STATE_DURATION_MIN-----------           
            try
                {
                Alarm_FYROM myAlarm = alarmsInTicket.get(0);
                AlarmOpenningProfile myAlarmOpenningProfile = myAlarm.getAlarmOpenningProfile();
                myTicket.setWaitTime(myAlarmOpenningProfile.minutesToDelay());
                System.out.println("DSLMON_SKOPIA ->(COPPER) openningProfile for " + myAlarm.getAlertOrigin() + " minutesToDelay set to   " + myAlarmOpenningProfile.minutesToDelay());
                }
            catch (Exception e)
                {
                System.out.println("DSLMON_SKOPIA ->(COPPER) openningProfile PENDING_STATE_DURATION_MIN error " + e.toString() + " minutesToDelay set to   " + parameters.PENDING_STATE_DURATION_MIN);
                myTicket.setWaitTime(parameters.PENDING_STATE_DURATION_MIN);
                }
            myNewTickets.put(myTicket.getTicketId(), myTicket);
            }
        return myNewTickets;
        }

    @Override
    public String findElementType()
        {
        return TYPE_COPPER;
        }

    public String findElementSubType(int level)
        {
        if (level == COPPER_PATH_DEPTH_SERVING_AREA)
            {
            return SUBTYPE_COPPER_SERVING_AREA;
            }
        else if (level == COPPER_PATH_DEPTH_ATC)
            {
            return SUBTYPE_COPPER_ATC;
            }
        else if (level == COPPER_PATH_DEPTH_DSLAM)
            {
            return SUBTYPE_COPPER_DSLAM;
            }
        else if (level == COPPER_PATH_DEPTH_SLOT)
            {
            return SUBTYPE_COPPER_SLOT;
            }
        else
            {
            return "UNSPECIFIED";
            }
        }

    public static void main(String[] args)
        {
        String myLabel = "Kocani;OS_Kocani_Zrnovci;Zrnovci;Zrnovci:0-0-24";
        Alarm_FYROM myAlarm = new Alarm_FYROM("Kicevo;OS_M.Brod_Belica", "20201010");//Kocani;OS_Kocani_Zrnovci;Zrnovci;Zrnovci:0-0-24
        myAlarm.setAlarmType(TYPE_COPPER);
        myAlarm.setAlarmSubType(SUBTYPE_COPPER_ATC);
        String[] pathParts = myLabel.split(AlarmDetector.PATH_DELIMETER);
        myAlarm.setSERVING_AREA(pathParts[COPPER_PATH_DEPTH_SERVING_AREA - 1]);
        if (pathParts.length >= 2)
            {
            myAlarm.setATC(pathParts[COPPER_PATH_DEPTH_ATC - 1]);
            }
        if (pathParts.length >= 3)
            {
            myAlarm.setDSLAM(pathParts[COPPER_PATH_DEPTH_DSLAM - 1]);
            }
        if (pathParts.length == 4)
            {
            myAlarm.setSLOT(pathParts[COPPER_PATH_DEPTH_SLOT - 1]);
            }
        //
        double reduction = 0.0;
        String myObjType = myAlarm.getAlarmSubType();
        boolean dGasp = myAlarm.checkDying_gasp_state();
        boolean existsAlarmInNMS = myAlarm.existsAlarmInNMS();
        AlarmOpenningProfile openningProfile = new AlarmDetector_COPPER(new Config()).findAlarmOpenningProfile(myAlarm.getAlarmSubType(), dGasp, existsAlarmInNMS);//SUBTYPE_COPPER_DSLAM;yes;yes", "1;Possible Power Outage;0
        myAlarm.setAlarmOpenningProfile(openningProfile);
        System.out.println("DSLMON_SKOPIA ->(COPPER) openningProfile for " + myAlarm.getAlertOrigin() + " is " + openningProfile.isToOpen() + " " + openningProfile.getInfo() + " " + openningProfile.minutesToDelay());
        if ((myObjType.equals(SUBTYPE_COPPER_SERVING_AREA) && reduction == 0.0)
                || (myObjType.equals(SUBTYPE_COPPER_ATC) && reduction == 0.0)
                || (myObjType.equals(SUBTYPE_COPPER_DSLAM) && reduction < 0.05 && openningProfile.isToOpen())
                || (myObjType.equals(SUBTYPE_COPPER_DSLAM) && reduction < 0.5 && openningProfile.isToOpen())
                || (myObjType.equals(SUBTYPE_COPPER_SLOT) && reduction < 0.5 && openningProfile.isToOpen()))
            {
            System.out.println("DSLMON_SKOPIA ->(COPPER) " + myAlarm.getAlertOrigin() + " PASSED with profile " + openningProfile.toString());
            }
        }
    }

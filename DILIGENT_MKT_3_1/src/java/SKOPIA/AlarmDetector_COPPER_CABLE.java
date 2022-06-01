package SKOPIA;

import static SKOPIA.AlarmDetector.PATH_DELIMETER;
import diligent_MKT.AlarmOpenningProfile;
import diligent_MKT.Alarm_FYROM;
import static diligent_MKT.Alarm_FYROM.COPPER_CABLE_PATH_DEPTH_ATC;
import static diligent_MKT.Alarm_FYROM.COPPER_CABLE_PATH_DEPTH_CABLE;
import static diligent_MKT.Alarm_FYROM.COPPER_CABLE_PATH_DEPTH_DP;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_ATC;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_CABLE;
import static diligent_MKT.Alarm_FYROM.SUBTYPE_COPPER_CABLE_DP;
import static diligent_MKT.Alarm_FYROM.TYPE_COPPER_CABLE;
import diligent_MKT.Ticket_FYROM;
import java.util.*;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.mapper.paths.Path;
import nsofiasLib.utils.mapper.paths.Paths_1D_decimal;
import nsofiasLib.utils.mapper.paths.ReducedPathInfo;

public class AlarmDetector_COPPER_CABLE extends AlarmDetector
    {

    public AlarmDetector_COPPER_CABLE(Config myConfig)
        {
        super(myConfig);
        //
        String type1 = TYPE_COPPER_CABLE.replace("TYPE_", "");
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
                double deltaValue = previousValue - currentValue;
                //System.out.println(myLabel + " Vanished:" + deltaValue + " Previously active:" + previousValue + " Currently active=" + currentValue + " type=" + type);
                //-------------------------------------------------
                try
                    {
                    //System.out.println(myLabel + " Vanished:" + deltaValue + " Previously active:" + previousValue + " Currently active=" + currentValue + " type=" + type);
                    Alarm_FYROM myAlarm = new Alarm_FYROM(myLabel, createAlarmsTimeStamp);
                    myAlarm.setAlarmType(this.findElementType());
                    String[] pathParts = myLabel.split(PATH_DELIMETER);
                    myAlarm.setATC(pathParts[COPPER_CABLE_PATH_DEPTH_ATC - 1]);
                    if (pathParts.length >= 2)
                        {
                        myAlarm.setCABLE(pathParts[COPPER_CABLE_PATH_DEPTH_CABLE - 1]);
                        }
                    if (pathParts.length == 3)
                        {
                        myAlarm.setDP(pathParts[COPPER_CABLE_PATH_DEPTH_DP - 1]);
                        }
                    //------------ setObjType ----------
                    int level = pathParts.length;
                    myAlarm.setDESCRIPTION(pathParts[level - 1]);
                    String myObjType = findElementSubType(level);
                    myAlarm.setAlarmSubType(myObjType);
                    //----------------------------------                        
                    Path myPath = new Path(pathParts, PATH_DELIMETER);
                    myAlarm.setCorrStr(myPath.getCorrelationPath().toString());
                    if (!sameAlarmAlreadyOpen(myAlarm))
                        {
                        myAlarm.setAlertStart(createAlarmsTimeStamp);
                        myAlarm.setAlarmStop(createAlarmsTimeStamp);
                        myAlarm.setValueStuck(currentValue);
                        try
                            {
                            myAlarm.setLinesDisconnected((long) deltaValue);
                            }
                        catch (Exception e)
                            {
                            System.out.println("DSLMON_SKOPIA ->(COPPER_CABLE) findNumberOfVanishedLines: error: header:= " + myLabel + ", " + e.toString());
                            }
                        //--------------
                        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&                        
                        if ((myAlarm.getLinesDisconnected() == 0 || myAlarm.getLinesDisconnected() >= getParameters().ALARM_CREATE_STATE_VOLUMN_MIN))
                            {
                            boolean dGasp = myAlarm.checkDying_gasp_state();
                            AlarmOpenningProfile openningProfile = findAlarmOpenningProfile(myObjType, dGasp);//SUBTYPE_COPPER_DSLAM;yes;yes", "1;Possible Power Outage;0
                            myAlarm.setAlarmOpenningProfile(openningProfile);
                            System.out.println("DSLMON_SKOPIA ->(COPPER_CABLE) armOpenningProfile for " + myLabel + " is " + openningProfile);
                            if (openningProfile.isToOpen())
                                {
                                myAlarm.setDesc(myObjType + " alert: " + findAlarmSynopsis("ATC;CABLE;DP", myLabel, myAlarm.getLinesDisconnected()));
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
                                    System.out.println("DSLMON_SKOPIA ->(COPPER_CABLE) findNumberOfVanishedLines: error: header:= " + myLabel + ", " + e.toString());
                                    }
                                newAlarmsFound.add(myAlarm);
                                }
                            }
                        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&  
                        }
                    //myAlarm.findCustomersAffected();
                    }
                catch (Exception e)
                    {
                    System.out.println("DSLMON_SKOPIA -> createAlarms: error: header:= " + myLabel + ", " + e.toString());
                    //e.printStackTrace(System.out);
                    new MailAlert().sendmailAlert("DSLMON_SKOPIA error:", e);
                    }
                }

            }
        catch (Exception e)
            {
            getMyContainer().getEventsLogArrayList().add(0, new TimeStamp1().getNowFormated() + ": CheckforAlarms() error " + e.getMessage());
            System.out.println("DSLMON_SKOPIA -> createAlarms: " + e.toString());
            new MailAlert().sendmailAlert("DSLMON_SKOPIA error:", e);
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
    public String findElementType()
        {
        return TYPE_COPPER_CABLE;
        }

    public String findElementSubType(int level)
        {
        if (level == COPPER_CABLE_PATH_DEPTH_ATC)
            {
            return SUBTYPE_COPPER_CABLE_ATC;
            }
        else if (level == COPPER_CABLE_PATH_DEPTH_CABLE)
            {
            return SUBTYPE_COPPER_CABLE_CABLE;
            }
        else if (level == COPPER_CABLE_PATH_DEPTH_DP)
            {
            return SUBTYPE_COPPER_CABLE_DP;
            }
        else
            {
            return "UNSPECIFIED";
            }
        }

    public static void main(String[] args)
        {
        Alarm_FYROM myAlarm = new Alarm_FYROM("Kocani : OS_Kocani_Zrnovci : Zrnovci : Zrnovci:0-0-24", "20201010");
        myAlarm.setAlarmType(TYPE_COPPER_CABLE);
        myAlarm.setAlarmSubType(SUBTYPE_COPPER_CABLE_ATC);
        boolean dGasp = true;
        AlarmOpenningProfile openningProfile = new AlarmDetector_COPPER(new Config()).findAlarmOpenningProfile(myAlarm.getAlarmSubType(), dGasp);//SUBTYPE_COPPER_DSLAM;yes;yes", "1;Possible Power Outage;0
        myAlarm.setAlarmOpenningProfile(openningProfile);
        System.out.println("DSLMON_SKOPIA ->(COPPER) openningProfile for " + myAlarm.getAlertOrigin() + " is " + openningProfile.isToOpen() + " " + openningProfile.getInfo() + " " + openningProfile.minutesToDelay());
        if ((myAlarm.getLinesDisconnected() == 0 || myAlarm.getLinesDisconnected() >= new AlarmDetector_COPPER(new Config()).getParameters().ALARM_CREATE_STATE_VOLUMN_MIN) && openningProfile.isToOpen())
            {
            System.out.println("DSLMON_SKOPIA ->(COPPER) " + myAlarm.getAlertOrigin() + " PASSED with profile " + openningProfile.toString());
            }
        }
    }

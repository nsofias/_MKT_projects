package SKOPIA;

import diligent_MKT.AddServiceElements_ACTION_Thread;
import diligent_MKT.AlarmOpenningProfile;
import diligent_MKT.Alarm_FYROM;
import static diligent_MKT.Alarm_FYROM.TYPE_COPPER;
import diligent_MKT.Ticket_FYROM;
import java.io.FileInputStream;
import java.net.URL;
import java.util.*;
import nsofiasLib.fileIO.FileParser2;
import nsofiasLib.fileIO.SimpleLineParser;
import nsofiasLib.ote.alarms.Alarm_Parameters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.MailSender_new;
import nsofiasLib.utils.mapper.paths.Paths_1D_decimal;

public class AlarmDetector
    {
    public static int ALARM_CREATE_STATE_VOLUMN_MIN = 2;
    public final Detector_parameters parameters = new Detector_parameters();
    public static String PATH_DELIMETER = ";";
    public Container myContainer = null;
    public final Config myConfig;
    String myAlarmOldTimeStamp = new TimeStamp1().getNowUnformated();//
    Map<String, String> alarmOpenningProfiles = new HashMap<>();

    //-- support for pending mode ----
    public AlarmDetector(Config myConfig)
        {
        this.myConfig = myConfig;
        myContainer = new Container(myConfig, PATH_DELIMETER);
        loadAlarmOpenningProfiles();
        }

    private void loadAlarmOpenningProfiles()
        {
        try
            {
            SimpleLineParser mySimpleLineParser = new SimpleLineParser();
            mySimpleLineParser.setKeepResults(true);
            FileParser2 myFileParser = new FileParser2(mySimpleLineParser);
            myFileParser.parse_file(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf//openningProfiles.csv");
            ArrayList<String> res = mySimpleLineParser.getResults();
            for (String s : res)
                {
                int pos = s.indexOf(";");
                alarmOpenningProfiles.put(s.substring(0, pos), s.substring(pos + 1));
                System.out.println("DSLMON:AlarmDetector:loadAlarmOpenningProfiles loaded mapping " + s.substring(0, pos) + " <->" + s.substring(pos + 1));
                }
            System.out.println("DSLMON:AlarmDetector:loadAlarmOpenningProfiles loaded!!!");
            }
        catch (Exception e)
            {
            System.out.println("DSLMON:AlarmDetector:loadAlarmOpenningProfiles error " + e.toString());
            }
        }

    public AlarmOpenningProfile findAlarmOpenningProfile(String SUBTYPE, boolean DGASP, boolean existsAlarmInNMS)
        {
        String res = SUBTYPE;
        if (DGASP)
            {
            res += "_yes";
            }
        else
            {
            res += "_no";
            }
        if (existsAlarmInNMS)
            {
            res += "_yes";
            }
        else
            {
            res += "_no";
            }
        System.out.println("DSLMON:findAlarmOpenningProfile res:" + res);
        if (alarmOpenningProfiles.get(res) != null)
            {
            return new AlarmOpenningProfile(alarmOpenningProfiles.get(res));
            }
        else
            {
            System.out.println("DSLMON:findAlarmOpenningProfile Default res returned:" + res);
            return new AlarmOpenningProfile("1;;0");
            }
        }

    public AlarmOpenningProfile findAlarmOpenningProfile(String SUBTYPE, boolean DGASP)
        {
        String res = SUBTYPE;
        if (DGASP)
            {
            res += "_yes";
            }
        else
            {
            res += "_no";
            }
        res += "_NA";
        System.out.println("DSLMON:findAlarmOpenningProfile res:" + res);
        return new AlarmOpenningProfile(alarmOpenningProfiles.get(res));
        }

    public long checkForAlarms() throws Exception
        {
        loadAlarmOpenningProfiles();
        Paths_1D_decimal lastAggregation = (Paths_1D_decimal) getMyContainer().getLastAggregation();
        Paths_1D_decimal BeforeLastAggregation = (Paths_1D_decimal) getMyContainer().getBeforeLastAggregation();
        if (getMyContainer().getMyClock() != null)
            {
            try
                {
                //-------------CREATE ALARMS ------------------------
                ArrayList<Alarm_FYROM> newAlarms = createAlarms(lastAggregation, BeforeLastAggregation);
                //----------- check For REPEATED FAULTS ----------------
                try
                    {
                    TimeStamp1 t1 = new TimeStamp1(getMyContainer().getMyClock());
                    TimeStamp1 t2 = new TimeStamp1(getMyContainer().getMyClock());
                    t2.addHours(-parameters.REPEATED_FAULTS_PERIOD);
                    String T1 = t1.getNowUnformated();
                    String T2 = t2.getNowUnformated();
                    Counters topScorers = getMyContainer().getTopScorers_events(T1, T2);
                    for (Alarm_FYROM myAlarm : newAlarms)
                        {
                        String elementName = myAlarm.getNetworkElementName();
                        if (topScorers.getCount(elementName) > getParameters().REPEATED_FAULTS_NUMBER)
                            {
                            myAlarm.setRepeated(true);
                            String notes = "Ο ΠΟΡΟΣ " + myAlarm.getObjName() + " ΕΧΕΙ ΒΓΕΙ ΣΕ ΒΛΑΒΗ " + topScorers.getCount(elementName) + " ΦΟΡΕΣ ΤΙΣ ΤΕΛΕΥΤΑΙΕΣ " + getParameters().REPEATED_FAULTS_PERIOD + " ΩΡΕΣ.";
                            myAlarm.setNotes(notes);
                            System.out.println("DSLMON:REPEATED ALARM FOUND: " + elementName);
                            }
                        }
                    }
                catch (Exception e)
                    {
                    System.out.println("DSLMON_SKOPIA: check For REPEATED FAULTS error:" + e.toString() +" error:"+ e.toString());
                    }
                //-------------- CREATE TICKETS --------------------------------------
                Map<String, Ticket_FYROM> myNewTickets = createTickets(newAlarms);
                getMyContainer().getTicketsArrayList().putAll(myNewTickets);
                return newAlarms.size();
                }
            catch (Exception e)
                {
                System.out.println("DSLMON_SKOPIA:checkForAlarms "+ e.toString());
                getMyContainer().getEventsLogArrayList().add(0, new TimeStamp1().getNowFormated() + ":" + e.getMessage());
                return 0;
                }
            }
        else
            {
            System.out.println("DSLMON_SKOPIA:checkForAlarms error: CLOCK is null !!!");
            return 0;
            }
        }

    public ArrayList createAlarms(Paths_1D_decimal myLastAggregation, Paths_1D_decimal myBeforeLastAggregation) throws Exception
        {//overwritten
        return null;
        }

    public Map<String, Ticket_FYROM> createTickets(ArrayList<Alarm_FYROM> newAlarms)
        {
        Map<String, Ticket_FYROM> myNewTickets = new HashMap();
        Map<String, ArrayList<Alarm_FYROM>> grouppedAlarms = Collections.synchronizedMap(new LinkedHashMap());
        for (Alarm_FYROM myAlarm : newAlarms)
            {
            String correlationString = myAlarm.getCorrStr();
            if (!correlationString.equals("ROOT"))
                {
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
                if (oldOpenTicket != null)
                    {
                    oldOpenTicket.includeNetworkElement(myAlarm);
                    System.out.println("DSLMON_SKOPIA -> createAlarms: includeNetworkElement " + myAlarm.getNetworkElementName() + " to already open ticket with SR " + oldOpenTicket.getSR());
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
                        System.out.println("DSLMON_SKOPIA -> createAlarms: AddServiceElements_ACTION_Thread for " + myAlarm.getNetworkElementName() + " to already open ticket with SR " + oldOpenTicket.getSR());
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
                System.out.println("DSLMON_SKOPIA ->(PASSIVE EQUIPMENT) openningProfile PENDING_STATE_DURATION_MIN error " + e.toString() + " minutesToDelay set to   " + parameters.PENDING_STATE_DURATION_MIN);
                myTicket.setWaitTime(parameters.PENDING_STATE_DURATION_MIN);
                }
            //
            myNewTickets.put(myTicket.getTicketId(), myTicket);
            }
        return myNewTickets;
        }

    public String findElementType()
        {
        return "UNSPECIFIED";
        }

    Ticket_FYROM findOldPendingTicket(String correlationString)
        {
        for (String ticketID : getMyContainer().getTicketsArrayList().keySet())
            {
            Ticket_FYROM myTicket_FYROM = getMyContainer().getTicketsArrayList().get(ticketID);
            if (myTicket_FYROM.getCollerationString().equals(correlationString) && myTicket_FYROM.isPending())
                {
                return myTicket_FYROM;
                }
            }
        return null;
        }

    Ticket_FYROM findOldOpenTicket(String correlationString)
        {
        for (String ticketID : getMyContainer().getTicketsArrayList().keySet())
            {
            Ticket_FYROM myTicket_FYROM = getMyContainer().getTicketsArrayList().get(ticketID);
            if (myTicket_FYROM.getCollerationString().equals(correlationString) && myTicket_FYROM.isOpen())
                {
                return myTicket_FYROM;
                }
            }
        return null;
        }

    public String findAlarmSynopsis(String path, String myLabel, long deltaValue)
        {
        try
            {
            //String[] myPath = "SERVING_AREA;ATC;DSLAM;SLOT".split(AlarmDetector.PATH_DELIMETER);
            String[] myPath = path.split(AlarmDetector.PATH_DELIMETER);
            String[] myLabels = myLabel.split(AlarmDetector.PATH_DELIMETER);
            String niceDesc = "";
            for (int i = 0; i < myLabels.length; i++)
                {
                niceDesc += " " + myPath[i] + "->" + myLabels[i];
                }
            return niceDesc + " Vanished:" + deltaValue;
            }
        catch (Exception e)
            {
            return myLabel + " Vanished:" + deltaValue;
            }
        }

    public boolean sameAlarmAlreadyOpen(Alarm_FYROM myAlarm)
        {
        for (Alarm_FYROM alarm : getMyContainer().getAlarmArrayList())
            {
            if (myAlarm.getAlertOrigin().equals(alarm.getAlertOrigin()) && alarm.isStilAlive())
                {
                return true;
                }
            }
        return false;
        }

    public boolean isSourceInAlarmArrayList(String objName, List<Alarm_FYROM> alarmArrayList)
        {
        for (Alarm_FYROM myAlarm : alarmArrayList)
            {
            if (myAlarm.getObjName().equals(objName))
                {
                return true;
                }
            }
        return false;
        }

    /**
     * @return the myCCMonitorStatsObjsContainer
     */
    public Container getMyContainer()
        {
        return myContainer;
        }

    /**
     * @return the parameters
     */
    public Detector_parameters getParameters()
        {
        return parameters;
        }

    //************************************************************************************
    public static void main(String args[])
        {
        try
            {
            System.setProperty("http.proxyHost", "");
            System.setProperty("http.proxyPort", "");
            // ------- READ PARAMETERS -------------------------            
            Properties properties = new Properties();
            properties.load(new FileInputStream(System.getenv("APPLICATIONS_PATH") + "/DSLMON_SKOPIA/conf/parameters.properties"));
            String sender = properties.getProperty("siebel.mailSender");
            String recipient = "nsofias@ote.gr";
            String smtpServer = properties.getProperty("siebel.mailServer");
            String cc = "nsofias@ote.gr";
            //-----------------------------------------
            MailSender_new myMailSender = new MailSender_new();
            myMailSender.setServer(smtpServer);
            myMailSender.setSender(sender);
            myMailSender.setRecipient(recipient);
            myMailSender.setCc(cc);
            System.out.println("DSLMON_SKOPIA:  sending mail alert to " + sender);
            String myHtmlTotal = "";
            String alertOrigin = "ΚΥΡΙ";

            String bbb = myMailSender.embed(new URL("http://172.16.167.7:8080/DSLMON_SKOPIA/BRAS_servlet?type=" + TYPE_COPPER), "bbb");

            myHtmlTotal += "<p>&nbsp;</p><p>&nbsp;</p><table>";
            myHtmlTotal += "<tr><td><h2>Συνολικη εικονα</h2></td></tr>";
            //myHtmlTotal += "<tr><td><img src=\"cid:" + aaa + "\"></td></tr>";
            myHtmlTotal += "<tr><td><img src=\"cid:" + bbb + "\"></td></tr>";
            myHtmlTotal += "</TABLE>";
            myMailSender.setBodyMessage(myHtmlTotal);
            myMailSender.sendMail();

            }
        catch (Exception e)
            {
            e.printStackTrace();
            }
        }
    }

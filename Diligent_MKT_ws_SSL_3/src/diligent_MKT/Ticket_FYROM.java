package diligent_MKT;

import SKOPIA.exceptions.AllAlarmsClosedException;
import SKOPIA.exceptions.FoundAlreadyOpenException;
import affected_services.SyncAFFECTEDSERVICEResponseType;
import diligent_mkt_ws.Diligent_connector;
import static diligent_mkt_ws.Diligent_connector.appendToIncident;
import static diligent_mkt_ws.Diligent_connector.createIncident;
import static diligent_mkt_ws.Diligent_connector.updateIncident;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import nsofiasLib.databases.DatabaseLogger;
import nsofiasLib.ote.alarms.Alarm;
import nsofiasLib.ote.alarms.Alarm_Parameters;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.Counters;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.MailSender_new;

/**
 *
 * @author nsofias
 */
public class Ticket_FYROM extends nsofiasLib.ote.alarms.Ticket {

    public final List<Alarm_FYROM> elementsList = new CopyOnWriteArrayList();
    public boolean openImediately = false;
    public double waitTime = -1;//not wait
    private String comments = "";
    public static String STATE_OPEN_INCIDENT = "OPEN_INCIDENT";
    public static String STATE_OPEN_AFFECTEDSERVICE = "OPEN_WITH_AFFECTEDSERVICES";
    public static String STATE_OPEN_PROPAGATED = "OPEN_PROPAGATED_TO_CRM";

    public Ticket_FYROM(String corrString) {
        super(corrString);
    }

    public String openTicket(String owner) throws Exception {
        //---------------------------------------------------------------------------------------       
        //Diligent contacts IBM Control Desk, provides a description, the network nodes affected and asks for an Incident ID
        //IBM Control Desk answers to Diligent with the Incident ID, Target time and Estimated time for resolved if exists
        //incidentID = IBMControlDesk.openTicket(this);
        //-------------------------------------------------------   
        System.out.println("Ticket_FYROM openTicket() started ");
        IncidentInfo myIncidentInfo = findIncidentInfo(owner,this.getType(), this.getSubType(), this.getElementsList().size());
        String mainDevice = myIncidentInfo.mainDevice;
        String myDesc = myIncidentInfo.myDesc;
        if (isPowerSupplyRelated()) {
            myDesc += " (Power Supply)";
        }
        String myDescLong = myIncidentInfo.myDescLong;
        String slotDevice = myIncidentInfo.slotDevice;
        //String timestamp = new TimeStamp1().getNowUnformated();
        String timestamp = this.getIncidentStartDate();
        int faultType = myIncidentInfo.faultType;
        int impact = 3;
        //--------------- found already open ----------------
        String incidentFound = foundAlreadyOpenByExternal(faultType, myIncidentInfo);
        if (incidentFound != null) {
            this.setComments("found already open with incidentID " + incidentFound);
            this.setSR(incidentFound);
            //
            this.getElementsList().forEach((myAlarm)
                    -> {
                myAlarm.setTicketSR(incidentFound);
            });
            this.setIncidentReportedDate(new TimeStamp1().getNowUnformated());
            System.out.println("Ticket_FYROM:openTicket:found already open with incidentID " + incidentFound);
            throw new FoundAlreadyOpenException();
        }
        //--------------- all Elements Closed ----------------
        if (allElementsClosed()) {
            System.out.println("Ticket_FYROM : allElementsClosed for Ticket with CollerationString " + this.getCollerationString());
            this.setComments("All alarms closed before Ticket Creation for ticket ");
            throw new AllAlarmsClosedException();
        }
        //************************************************
        try {
            String incidentID = createIncident(myDesc, myDescLong, mainDevice, slotDevice, timestamp, faultType, impact, this.getTicketId());
            this.setSR(incidentID);
            //
            this.getElementsList().forEach((myAlarm)
                    -> {
                myAlarm.setTicketSR(incidentID);
            });
            //
            this.setIncidentReportedDate(new TimeStamp1().getNowUnformated());
            System.out.println("Ticket_FYROM:openTicket:incidentID = " + incidentID);
        } catch (Exception e) {
            this.setSR(this.getTicketId());
            throw e;
        }
        return this.getSR();
    }

    public boolean isPowerSupplyRelated() {
        List<Alarm_FYROM> myElementsList = this.getElementsList();
        for (Alarm_FYROM myAlarm_FYROM : myElementsList) {
            if (myAlarm_FYROM.isDyingGasp()) {
                return true;
            }
        }
        return false;
    }

    private String foundAlreadyOpenByExternal(int faultType, IncidentInfo myIncidentInfo) {
        //if (this.getType().equals(Alarm_FYROM.TYPE_COPPER) || this.getType().equals(Alarm_FYROM.TYPE_GPON))
        {
            try {
                String existingTicketId;
                for (Alarm_FYROM myAlarm : this.getElementsList()) {
                    String elementCinum;

                    if (faultType == 36 || faultType == 51 || faultType == 52) {
                        elementCinum = myIncidentInfo.mainDevice;
                        existingTicketId = Diligent_connector.getExternalIncident(elementCinum);
                    } else {
                        elementCinum = myAlarm.getDESCRIPTION();
                        existingTicketId = Diligent_connector.getExternalIncident(elementCinum);
                        // check parent also the parent-----
                        if (existingTicketId == null) {
                            existingTicketId = Diligent_connector.getExternalIncident(myIncidentInfo.mainDevice);
                        }
                    }
                    //--------------------
                    if (existingTicketId != null) {
                        System.out.println("Ticket_FYROM : foundAlreadyOpen for alarm " + myAlarm.getAlertOrigin());
                        return existingTicketId;
                    }
                }
            } catch (Exception e) {
                new MailAlert().sendmailAlert("Diligent_connector:ableToOpen error:", e);
                e.printStackTrace(System.out);
                return null;
            }
        }
        return null;
    }

    private boolean allElementsClosed() {
        return this.getElementsList().stream().noneMatch((myAlarm) -> (myAlarm.getState().equals(Alarm.STATE_OPEN)));
    }

    public void addServiceElements(String owner) throws Exception {
        addServiceElements(owner,this.getElementsList());
    }

    public void addServiceElements(String owner,List<Alarm_FYROM> myElementsList) throws Exception {
        IncidentInfo myIncidentInfo = findIncidentInfo(owner, this.getType(), this.getSubType(), this.getElementsList().size());// there are more than one element
        String serviveInFault = myIncidentInfo.serviceInFault;
        int faultType = myIncidentInfo.faultType;
        System.out.println("Ticket_FYROM addServiceElements() started ");
        myElementsList.forEach((Alarm_FYROM myAlarm)
                -> {
            if (myAlarm.getState().equals(Alarm.STATE_OPEN)) {
                String whereStr = myAlarm.prepareNCDBInfo();
                long impact = myAlarm.getActiveLinesAffected();
                System.out.println("whereStr for = " + myAlarm.getNetworkElementName() + " of " + this.getDesc() + " is " + whereStr);
                if (whereStr != null) {
                    try {
                        //---------Ticket_FYROM openTicket() myAlarm_FYROM myAlarm_FYROM.loadNCDBInfo() started --------------                    
                        String child = " Diligent - " + myAlarm.getDESCRIPTION() + " BB-id:" + myAlarm.getMyBulletinid() + " - " + myAlarm.getAlarmOpenningProfile().toString();
                        String region = myAlarm.getREGION();
                        Counters services = myAlarm.getMyServices();
                        long adsl = 0;
                        long iptv = services.getCount("IPTV");
                        long voip = services.getCount("VOIP");
                        long internet = services.getCount("ADSL");
                        long wlr = services.getCount("WLR");
                        //long activelines = myAlarm1.getActiveLinesAffected();
                        //appendToIncident(String ticketId,String startDate, String endDate, String child, String region, long internet, long iptv, long voip, long adsl, long wlr, long impact)
                        String parent;
                        if (faultType == 36 || faultType == 51 || faultType == 52) {
                            parent = myIncidentInfo.mainDevice;
                        } else {
                            parent = myAlarm.getDESCRIPTION();
                        }
                        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------                    
                        SyncAFFECTEDSERVICEResponseType res = appendToIncident(this.getSR(), myAlarm.getAlarmStart(), "", parent, child, region, serviveInFault, internet, iptv, voip, adsl, wlr, impact);
                        try {
                            myAlarm.setAffServiceID(String.valueOf(res.getAFFECTEDSERVICESet().getAFFECTEDSERVICE().get(0).getAFFECTEDSERVICEID().getValue()));
                        } catch (Exception e) {
                            myAlarm.setAffServiceID("");
                        }
                    } catch (Exception e) {
                        System.out.println("Ticket Propagation Error:" + e.toString());
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public void updateServiceElements(Alarm_FYROM myAlarm) throws Exception {
        if (myAlarm.getAlarmStop() != null && myAlarm.getAffServiceID() != null && !myAlarm.getAffServiceID().isEmpty()) {
            System.out.println("DiligentMKT/updateServiceElements for " + myAlarm.getTicketSR() + "-" + myAlarm.getAffServiceID() + " myAlarm.getAlarmStop()=" + myAlarm.getAlarmStop());
            updateIncident(this.getSR(), myAlarm.getAlarmStop(), myAlarm.getAffServiceID());
            myAlarm.setTicketSR(this.getSR());
        }
    }

    private void markCustomersAffected(String owner,Alarm_FYROM myAlarm) throws Exception {
        if (myAlarm.getState().equals(Ticket.STATE_OPEN)) {
            try {
                //Diligent sends a query to Netcracker Replica DB passing then network nodes affected and retrieves the affected customers     
                //Diligent propagates the affected customers to SugarCRM providing also the Grouping Ticket incident ID
                IncidentInfo myIncidentInfo = findIncidentInfo(owner,this.getType(), this.getSubType(), this.getElementsList().size());
                String description = myIncidentInfo.myDesc;
                String whereStr = myAlarm.getWhereStr();
                if (whereStr != null) {
                    NCDB myNCDB = new NCDB();
                    myNCDB.loadDBInfo(whereStr);
                    ArrayList activelinesArray = myNCDB.getActiveLines();
                    //---------------------------
                    if (activelinesArray.isEmpty())// if no lines found then use radius lines
                    {
                        PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(this.getType());
                        if (myPatrhsRetriever != null) {
                            activelinesArray = myPatrhsRetriever.retrieveLineIDs(myAlarm.getNetworkElementName());
                        }
                        new MailAlert().sendmailAlert("DiligentMKT warning:", new Exception("NO ACTIVE LINES FOUND FROM NCDB QUERY FOR ELEMENT NAME " + myAlarm.getNetworkElementName() + " TRYING WITH LINES IN RADIUS"));
                        System.out.println("DiligentMKT/markCustomersAffected() warning:NO ACTIVE LINES FOUND FROM NCDB QUERY FOR ELEMENT NAME " + myAlarm.getNetworkElementName() + " TRYING WITH LINES IN RADIUS");
                    }
                    //-----------------------------------------------
                    if (activelinesArray.isEmpty()) {
                        myAlarm.setMarkCustomersStatus("EMPTY_LIST");
                    } else if (!myAlarm.getAffServiceID().isEmpty()) {
                        String myBulletinid = Diligent_connector.bulletinSearch(myAlarm.getAlertOrigin());
                        if (myBulletinid != null) {
                            myAlarm.setAlarmReason("Maintenance");
                            myAlarm.setMyBulletinid(myBulletinid);
                        }
                        Diligent_connector.markAffected(this.getSR() + "-" + myAlarm.getAffServiceID(), this.getSR(), activelinesArray, description, myAlarm.getAlarmReason());
                        System.out.println("DiligentMKT/markCustomersAffected() for :" + this.getSR() + "-" + myAlarm.getAffServiceID() + " at " + new TimeStamp1().getNowFormated());
                    }
                }
            } catch (Exception e) {
                System.out.println("DiligentMKT/markCustomersAffected() error:" + e.toString() + " for " + this.getSR() + "-" + myAlarm.getAffServiceID() + " at " + new TimeStamp1().getNowFormated() + " error:" + e.toString());
                e.printStackTrace(System.out);
            }
        }
    }

    public void markCustomersAffected(String owner) throws Exception {
        for (Alarm_FYROM myAlarm : this.getElementsList()) {
            markCustomersAffected(owner,myAlarm);
        }
    }

    public void markCustomersAffected(String owner,ArrayList<Alarm_FYROM> myElementsList) throws Exception {
        for (Alarm_FYROM myAlarm : myElementsList) {
            markCustomersAffected(owner,myAlarm);
        }
    }

    public void releaseCustomersAffected(Alarm_FYROM myAlarm) throws Exception {
        //Diligent sends a query to Netcracker Replica DB passing then network nodes affected and retrieves the affected customers     
        //Diligent propagates the affected customers to SugarCRM providing also the Grouping Ticket incident ID
        String whereStr = myAlarm.getWhereStr();
        if (whereStr != null) {
            try {
                NCDB myNCDB = new NCDB();
                myNCDB.loadDBInfo(whereStr);
                ArrayList activelinesArray = myNCDB.getActiveLines();
                if (activelinesArray.isEmpty()) {// if no lines found then use radius lines
                    PathsRetriever myPatrhsRetriever = PathRetrieverFactory.create(this.getType());
                    if (myPatrhsRetriever != null) {
                        activelinesArray = myPatrhsRetriever.retrieveLineIDs(myAlarm.getNetworkElementName());
                    }
                }
                if (!myAlarm.getAffServiceID().isEmpty() && !activelinesArray.isEmpty()) {
                    Diligent_connector.releaseAffected(this.getSR() + "-" + myAlarm.getAffServiceID(), this.getSR(), activelinesArray);
                    System.out.println("DiligentMKT/releaseAffected() for :" + this.getSR() + "-" + myAlarm.getAffServiceID() + " at " + new TimeStamp1().getNowFormated());
                    //---------------------
                    LinesValidator myValidator = new LinesValidator(this.getSR(), myAlarm.getAffServiceID(), myAlarm.getAlarmStop(), activelinesArray);
                    Thread myLinesValidatorThread = new Thread(myValidator);
                    myLinesValidatorThread.start();
                }
            } catch (Exception e) {
                System.out.println("DiligentMKT/releaseAffected() error for :" + this.getSR() + "-" + myAlarm.getAffServiceID() + " at " + new TimeStamp1().getNowFormated() + " error:" + e.toString());
                e.printStackTrace(System.out);
            }
        }
    }
//==========================================================================

    @Override
    public void saveToDatabase(String tableName, DatabaseLogger myDatabaseLogger) throws Exception {
        String sql = "INSERT INTO " + tableName + " (ticketId,SR,criticality,incidentStartDate,incidentStoppedDate,incidentReportedDate,state,area,collerationString)"
                + "VALUES('" + this.getTicketId() + "','" + this.getSR() + "'," + this.getCriticality() + ",'" + this.getIncidentStartDate() + "','" + this.getIncidentStoppedDate() + "','" + this.getIncidentReportedDate() + "','" + this.getState() + "','" + this.getArea() + "','" + this.getCollerationString() + "');";
        System.out.println("DiligentMKT:save ticket: " + sql);
        myDatabaseLogger.writeln(sql);
        for (Alarm_FYROM myAlarm : getElementsList()) {
            myAlarm.saveToDatabase(myDatabaseLogger);
        }
    }

    /**
     *
     * @param myAlarms
     */
    public void appendNetworkElements(List<Alarm_FYROM> myAlarms) {
        elementsList.addAll(myAlarms);
        this.getElementsList().forEach((myAlarm)
                -> {
            myAlarm.setTicketId(this.getTicketId());
        });
    }

    /**
     * @return the openImediately
     */
    public boolean isOpenImediately() {
        return openImediately;
    }

    /**
     * @param openImediately the openImediately to set
     */
    public void setOpenImediately(boolean openImediately) {
        this.openImediately = openImediately;
    }

    /**
     * @return the waitTime
     */
    public double getWaitTime() {
        return waitTime;
    }

    /**
     * @param waitTime the waitTime to set
     */
    public void setWaitTime(double waitTime) {
        this.waitTime = waitTime;
    }

    /**
     * @return the elementsList
     */
    public List<Alarm_FYROM> getElementsList() {
        return elementsList;
    }

    public void includeNetworkElement(Alarm_FYROM myAlarm) {
        myAlarm.setTicketSR(this.getSR());
        elementsList.add(myAlarm);
    }

    public int getCurrentUsersDisconnected() {
        int users = 0;
        for (Alarm_FYROM myAlarm : elementsList) {
            if (myAlarm.getState().equals(Ticket.STATE_OPEN)) {
                users += myAlarm.getLinesDisconnected();
            }
        }
        return users;
    }

    public int getCurrentUsersRegistered() {
        int users = 0;
        for (Alarm_FYROM myAlarm : elementsList) {
            users += myAlarm.getLinesRegistered();
        }
        return users;
    }

    public String toHTML(String owner) {
        try {
            IncidentInfo myIncidentInfo = findIncidentInfo(owner,this.getType(), this.getSubType(), this.getElementsList().size());
            String SQL_STRING = "SELECT V_DILIGENT_LINE_DETAIL.LINE_ID, DSLAM_NAME, SLOT,  PORT_STATUS, ATC, RSU, CABLE, DP, STATUS, HAS_ADSL, HAS_VOIP, HAS_IPTV, INTERFACE "
                    + "FROM NC_OSS_PROD_RDB.V_DILIGENT_LINES left join NC_OSS_PROD_RDB.V_DILIGENT_LINE_DETAIL "
                    + "on V_DILIGENT_LINES.LINE_ID = V_DILIGENT_LINE_DETAIL.LINE_ID ";
            String body = "";
            List<Alarm_FYROM> alarmList = this.getElementsList();
            //
            String path = "";
            if (this.getType().equals(Alarm_FYROM.TYPE_COPPER)) {
                path = "<th>SERVING_AREA/ATC/DSLAM/slot</th>";
            } else if (this.getType().equals(Alarm_FYROM.TYPE_COPPER_CABLE)) {
                path = "<th>ATC/Cable/DP</th>";
            } else if (this.getType().equals(Alarm_FYROM.TYPE_GPON)) {
                path = "<th>ATC/OLT/Slot</th>";
            } else if (this.getType().equals(Alarm_FYROM.TYPE_GPON_CABLE)) {
                path = "<th>ATC/Cable/BOX</th>";
            }    //        
            body = body + "<p>Ticket type:" + this.getType().replace("TYPE_", "") + " Hierarchy:" + path;
            body = body + "<p>Parent (upper hierarchy) element : " + this.getCollerationString().replace(Alarm_FYROM.PATH_DELIMETER, " : ");
            //
            body = body + "<p><b>FAULTTYPE:</b>" + myIncidentInfo.faultType + " Some (" + alarmList.size() + ") " + this.getSubType() + "s";
            body = body + "<p><b>STRING2: </b>" + myIncidentInfo.mainDevice;
            body = body + "<p><b>LINISKAOPREMA: </b>" + myIncidentInfo.slotDevice;
            body = body + "<p><b>DESCRIPTION: </b>" + myIncidentInfo.myDesc;
            body = body + "<p><b>LONGDESCRIPTION: </b>" + myIncidentInfo.myDescLong;
            body = body + "<p><b>TICKET_ID: </b>" + this.getSR();
            body = body + "<p>IncidentStartDate: " + new TimeStamp1(getIncidentStartDate()).getNowFormated();
            body = body + "<p>Disconnected Lines: " + findLinesDisconnected();
            body = body + "<p>NCDB Ports (total): " + findLinesAffected();
            //body = body + "<p>NCDB Ports (active): " + findActiveLinesAffected();
            body = body + "<p>Services : " + findNCDBAServicesAsString();
            body = body + "<p>Status: " + this.getState();
            body = body + "<p>Criticality: " + this.getCriticality();
            //body = body + "<p>Synopsis: " + this.getSYNOPSIS();         
            //-----
            body = body + "<p><p><b>-------------- AFFECTED SERVICES ------------</b>";
            body = body + "<p><table border = '1'>";
            body = body + "<tr>";
            body = body + "<th>CINUM</th>";
            body = body + "<th>DESCRIPTION</th>";
            body = body + "<th>REGION</th>";
            body = body + "<th>SERVICEINFAULT</th>";
            body = body + "<th>Lines Disconnected</th>";
            body = body + "<th>Active ports</th>";
            body = body + "<th>Total ports</th>";
            body = body + "<th>INTERNET</th><th>IPTV</th><th>VOIP</th><th>ADSL</th><th>WLR</th><th>sql</th>";
            body = body + "</tr>";
            //-----------------------------
            for (Alarm_FYROM myAlarm : alarmList) {
                Counters services = myAlarm.getMyServices();
                long internet = services.getCount("INTERNET");
                long iptv = services.getCount("IPTV");
                long voip = services.getCount("VOIP");
                long adsl = services.getCount("ADSL");
                //long wlr = services.getCount("WLR")             
                String sql = SQL_STRING + " WHERE " + myAlarm.getWhereStr();
                body = body + "<tr>";
                body = body + "<td nowrap>" + myIncidentInfo.mainDevice + "</td>";
                body = body + "<td nowrap>" + "Diligent - " + myAlarm.getDESCRIPTION() + "</td>";
                body = body + "<td nowrap>" + myAlarm.getREGION() + "</td>";
                body = body + "<td nowrap>" + myIncidentInfo.serviceInFault + "</td>";
                body = body + "<td nowrap>" + myAlarm.getLinesDisconnected() + "</td>";
                body = body + "<td nowrap>" + myAlarm.getActiveLinesAffected() + "</td>";
                body = body + "<td nowrap>" + myAlarm.getLinesAffected() + "</td>";
                body = body + "<td nowrap>" + internet + "</td>";
                body = body + "<td nowrap>" + iptv + "</td>";
                body = body + "<td nowrap>" + voip + "</td>";
                body = body + "<td nowrap>" + adsl + "</td>";
                body = body + "<td nowrap></td>";
                body = body + "<td nowrap>" + sql + "</td>";
                body = body + "</tr>";
            }
            body = body + "</table>";
            return body;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("DSLMON: createMailAlert failed!" + e.toString());
            return "";
        }
    }

    public void sendMailAlert(String owner,String subject, Alarm_Parameters params) {
        try {
            String body = toHTML(owner);
            //----------------------------------------
            MailSender_new myMailSender = new MailSender_new();
            myMailSender.setServer(params.getTICKETS_mailServer());
            myMailSender.setSender(params.getTICKETS_mailSender());
            myMailSender.setUser(params.getTICKETS_mailUser());
            myMailSender.setPass(params.getTICKETS_mailPass());
            myMailSender.setRecipient(params.getTICKETS_mail_recipients());
            myMailSender.setCc(params.getTICKETS_mail_cc_recipients());
            myMailSender.setSubject(subject);
            myMailSender.setBodyMessage(body);
            myMailSender.sendMail();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("DSLMON: createMailAlert failed!" + e.toString());
        }
    }

    public String toString1() {
        String str = "";
        str = str + "\nSR:" + this.getSR();
        str = str + "\nIncidentStartDate:" + new TimeStamp1(getIncidentStartDate()).getNowFormated();
        str = str + "\nAffectedResources:" + findLinesDisconnected();
        str = str + "\nStatus:" + this.getState();
        str = str + "\n--------------network elements------------";
        for (Alarm childAlarm : elementsList) {
            str = str + "\n" + childAlarm.toString();
        }
//        System.out.println("str="+str);
        return str;
    }

    public int getCriticality() {
        long disconections = findLinesDisconnected();
        if (disconections <= 1000) {
            return (Ticket.CRITICALITY_MINOR);
        } else if (disconections <= 5000) {
            return (Ticket.CRITICALITY_MAJOR);
        } else {
            return (Ticket.CRITICALITY_CRITICAL);
        }
    }

    public String getCriticalityDesc(int criticality) {

        if (criticality == Ticket.CRITICALITY_WARNING) {
            return "WARNING";
        } else if (criticality == Ticket.CRITICALITY_MINOR) {
            return "3 - MINOR";
        } else if (criticality == Ticket.CRITICALITY_MAJOR) {
            return "2 - MAJOR";
        } else {
            return "1 - CRITICAL";
        }
    }

    public String getDesc() {
        List<Alarm_FYROM> elements = this.getElementsList();
        try {
            this.setArea(this.getTicketId().split("@")[0]);
        } catch (Exception e) {
        }
        //String ticketType = myTicket.getType();
        String desc;
        desc = "Service outage ( " + this.getSubType() + "): ";
        if (this.getElementsList().size() <= 3) {
            for (nsofiasLib.ote.alarms.Alarm myAlarm : this.getElementsList()) {
                try {
                    String name = myAlarm.getAlarmObject().replace(";", " : ");
                    if (this.isStillAlive() && myAlarm.isStilAlive()) {
                        desc = desc + " <font color='red'>" + name + "</font>";
                    } else if (this.isStillAlive() && !myAlarm.isStilAlive()) {
                        desc = desc + "<font color='green'>" + name + "</font>";
                    } else {
                        desc = desc + name;
                    }
                } catch (Exception e) {
                    System.out.println("DSLMON_SKOPIA: getDesc_html error: ticketType:" + this.getSubType() + " " + myAlarm.getAlarmObject() + ":" + e.toString());
                }
                desc = desc + ",";
            }
            desc = desc.substring(0, desc.length() - 1);
        } else// more than 3 elements
        {
            desc = elements.size() + " " + this.getType() + "s";
        }

        //----------------------------------------------------------
//        if (desc.length()>149)
//            desc=desc.substring(0, 149);
        return desc;
    }

    public String getDescUnformated() {
        List<Alarm_FYROM> elements = this.getElementsList();
        try {
             this.setArea(this.getTicketId().split("@")[0]);
        } catch (Exception e) {
        }
        //String ticketType = myTicket.getType();
        String desc;
        desc = "Service outage ( " + this.getSubType() + "): ";
        if (this.getElementsList().size() <= 3) {
            for (nsofiasLib.ote.alarms.Alarm myAlarm : this.getElementsList()) {
                try {
                    String name = myAlarm.getAlarmObject().replace(";", " : ");
                    desc += name;
                } catch (Exception e) {
                    System.out.println("DSLMON_SKOPIA: getDesc_html error: ticketType:" + this.getSubType() + " " + myAlarm.getAlarmObject() + ":" + e.toString());
                }
                desc = desc + ",";
            }
            desc = desc.substring(0, desc.length() - 1);
        } else
        {// more than 3 elements
            desc = elements.size() + " " + this.getType() + "s";
        }

        //----------------------------------------------------------
//        if (desc.length()>149)
//            desc=desc.substring(0, 149);
        return desc;
    }

    public String getDesc_html() {
        List<Alarm_FYROM> elements = this.getElementsList();
        try {
            this.setArea(this.getTicketId().split("@")[0]);
        } catch (Exception e) {
        }
        //String ticketType = myTicket.getType();
        String desc;
        desc = "Service outage ( " + this.getSubType() + "): ";
        if (this.getElementsList().size() <= 3) {
            for (nsofiasLib.ote.alarms.Alarm myAlarm : this.getElementsList()) {
                try {
                    String name = myAlarm.getAlarmObject().replace(";", " : ");
                    if (this.isStillAlive() && myAlarm.isStilAlive()) {
                        desc = desc + " <font color='red'>" + name + "</font>";
                    } else if (this.isStillAlive() && !myAlarm.isStilAlive()) {
                        desc = desc + "<font color='green'>" + name + "</font>";
                    } else {
                        desc = desc + name;
                    }
                } catch (Exception e) {
                    System.out.println("DSLMON_SKOPIA: getDesc_html error: ticketType:" + this.getSubType() + " " + myAlarm.getAlarmObject() + ":" + e.toString());
                }
                desc = desc + ",";
            }
            desc = desc.substring(0, desc.length() - 1);
        } else// more than 3 elements
        {
            desc = elements.size() + " " + this.getType() + "s";
        }

        //----------------------------------------------------------
//        if (desc.length()>149)
//            desc=desc.substring(0, 149);
        return desc;
    }

    /**
     * @return the repeatedFault
     */
    public boolean isRepeated() {
        boolean isRepeated = true;
        for (Alarm myAlarm : getElementsList()) {
            if (!myAlarm.isRepeated()) {
                isRepeated = false;
                break;
            }
        }
        return isRepeated;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the allAlarms_CLOSED
     */
    public boolean isAllAlarms_CLOSED() {
        for (Alarm myAlarm : elementsList) {
            if (myAlarm.getState().equals(Alarm.STATE_OPEN)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @return the linesDisconnected
     */
    public long findLinesDisconnected() {
        long lines = 0;
        for (Alarm_FYROM myAlarm : elementsList) {
            lines += myAlarm.getLinesDisconnected();
        }
        return lines;
    }

    /**
     * @return the linesAffected
     */
    public long findLinesAffected() {
        long lines = 0;
        lines = elementsList.stream().map((myAlarm) -> myAlarm.getLinesAffected()).reduce(lines, (accumulator, _item) -> accumulator + _item);
        return lines;
    }

    /**
     * @return the activeLinesAffected
     */
    public long findActiveLinesAffected() {
        long lines = 0;
        for (Alarm_FYROM myAlarm : elementsList) {
            lines += myAlarm.getActiveLinesAffected();
        }
        return lines;
    }

    public String findNCDBAServicesAsString() {
        Counters services = new Counters();
        for (Alarm_FYROM myAlarm : elementsList) {
            try {
                services.updateCounters(myAlarm.getMyServices());
            } catch (Exception e) {
            }
        }
        String serv = "";
        for (String label : services.keySet()) {
            serv += label + " : " + services.getCount(label);
            serv += ",";
        }
        if (serv.endsWith(",")) {
            serv = serv.substring(0, serv.length() - 1);
        }
        System.out.println("serv = " + services.getDesc("serv"));
        return serv;
    }

    private IncidentInfo findIncidentInfo(String owner,String type, String subType, int numOfElements) throws Exception {
        IncidentInfo myIncidentInfo = new IncidentInfo();
        ArrayList<String> types = new ArrayList();
        types.add(Alarm_FYROM.TYPE_COPPER + ";" + Alarm_FYROM.SUBTYPE_COPPER_SERVING_AREA + ";" + "1" + ";" + "31");
        types.add(Alarm_FYROM.TYPE_COPPER + ";" + Alarm_FYROM.SUBTYPE_COPPER_SERVING_AREA + ";" + "2" + ";" + "31");
        types.add(Alarm_FYROM.TYPE_COPPER + ";" + Alarm_FYROM.SUBTYPE_COPPER_ATC + ";" + "1" + ";" + "33");
        types.add(Alarm_FYROM.TYPE_COPPER + ";" + Alarm_FYROM.SUBTYPE_COPPER_ATC + ";" + "2" + ";" + "32");
        types.add(Alarm_FYROM.TYPE_COPPER + ";" + Alarm_FYROM.SUBTYPE_COPPER_DSLAM + ";" + "1" + ";" + "35");
        types.add(Alarm_FYROM.TYPE_COPPER + ";" + Alarm_FYROM.SUBTYPE_COPPER_DSLAM + ";" + "2" + ";" + "34");
        types.add(Alarm_FYROM.TYPE_COPPER + ";" + Alarm_FYROM.SUBTYPE_COPPER_SLOT + ";" + "1" + ";" + "36");
        types.add(Alarm_FYROM.TYPE_COPPER + ";" + Alarm_FYROM.SUBTYPE_COPPER_SLOT + ";" + "2" + ";" + "36");
        //
        types.add(Alarm_FYROM.TYPE_COPPER_CABLE + ";" + Alarm_FYROM.SUBTYPE_COPPER_CABLE_ATC + ";" + "1" + ";" + "33");
        types.add(Alarm_FYROM.TYPE_COPPER_CABLE + ";" + Alarm_FYROM.SUBTYPE_COPPER_CABLE_ATC + ";" + "2" + ";" + "33");
        types.add(Alarm_FYROM.TYPE_COPPER_CABLE + ";" + Alarm_FYROM.SUBTYPE_COPPER_CABLE_CABLE + ";" + "1" + ";" + "38");
        types.add(Alarm_FYROM.TYPE_COPPER_CABLE + ";" + Alarm_FYROM.SUBTYPE_COPPER_CABLE_CABLE + ";" + "2" + ";" + "37");
        types.add(Alarm_FYROM.TYPE_COPPER_CABLE + ";" + Alarm_FYROM.SUBTYPE_COPPER_CABLE_DP + ";" + "1" + ";" + "40");
        types.add(Alarm_FYROM.TYPE_COPPER_CABLE + ";" + Alarm_FYROM.SUBTYPE_COPPER_CABLE_DP + ";" + "2" + ";" + "39");
        //
        //types.add(Alarm_FYROM.TYPE_GPON + ";" + AlarmDetector_GPON.SUBTYPE_GPON_ATC + ";" + "1" + ";" + "50");
        //types.add(Alarm_FYROM.TYPE_GPON + ";" + AlarmDetector_GPON.SUBTYPE_GPON_ATC + ";" + "2" + ";" + "50");
        types.add(Alarm_FYROM.TYPE_GPON + ";" + Alarm_FYROM.SUBTYPE_GPON_OLT + ";" + "1" + ";" + "50");
        types.add(Alarm_FYROM.TYPE_GPON + ";" + Alarm_FYROM.SUBTYPE_GPON_OLT + ";" + "2" + ";" + "50");
        //
        types.add(Alarm_FYROM.TYPE_GPON + ";" + Alarm_FYROM.SUBTYPE_GPON_SHELF + ";" + "1" + ";" + "49");
        types.add(Alarm_FYROM.TYPE_GPON + ";" + Alarm_FYROM.SUBTYPE_GPON_SHELF + ";" + "2" + ";" + "49");
        //
        types.add(Alarm_FYROM.TYPE_GPON + ";" + Alarm_FYROM.SUBTYPE_GPON_SLOT + ";" + "1" + ";" + "52");
        types.add(Alarm_FYROM.TYPE_GPON + ";" + Alarm_FYROM.SUBTYPE_GPON_SLOT + ";" + "2" + ";" + "51");
        //
        types.add(Alarm_FYROM.TYPE_GPON_CABLE + ";" + Alarm_FYROM.SUBTYPE_GPON_CABLE_ATC + ";" + "1" + ";" + "31");
        types.add(Alarm_FYROM.TYPE_GPON_CABLE + ";" + Alarm_FYROM.SUBTYPE_GPON_CABLE_ATC + ";" + "2" + ";" + "31");
        types.add(Alarm_FYROM.TYPE_GPON_CABLE + ";" + Alarm_FYROM.SUBTYPE_GPON_CABLE + ";" + "1" + ";" + "54");
        types.add(Alarm_FYROM.TYPE_GPON_CABLE + ";" + Alarm_FYROM.SUBTYPE_GPON_CABLE + ";" + "2" + ";" + "53");
        types.add(Alarm_FYROM.TYPE_GPON_CABLE + ";" + Alarm_FYROM.SUBTYPE_GPON_BOX + ";" + "1" + ";" + "58");
        types.add(Alarm_FYROM.TYPE_GPON_CABLE + ";" + Alarm_FYROM.SUBTYPE_GPON_BOX + ";" + "2" + ";" + "57");
        //---------------
        for (String myType : types) {
            int vol = 1;
            if (numOfElements > 1) {
                vol = 2;
            }
            String[] mtType_ = myType.split(";");
            if (type.equals(mtType_[0]) && subType.equals(mtType_[1]) && vol == Integer.parseInt(mtType_[2])) {
                int faultType = Integer.parseInt(mtType_[3]);
                myIncidentInfo.faultType = faultType;
                //
                switch (faultType) {
                    case 31://SUBTYPE_COPPER_SERVING_AREA
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getSERVING_AREA();
                        myIncidentInfo.slotDevice = myIncidentInfo.mainDevice;
                        myIncidentInfo.myDesc = owner  +" - SERVING_AREA alarm";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "ALL Services";
                        return myIncidentInfo;
                    case 32://SUBTYPE_COPPER_ATCs
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getSERVING_AREA();
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getATC() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - RSU(S) alarm";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "DSLAM_Cel_Stepen";
                        return myIncidentInfo;
                    case 33://SUBTYPE_COPPER_ATC
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getATC();//ATC
                        myIncidentInfo.slotDevice = myIncidentInfo.mainDevice;//ATC
                        myIncidentInfo.myDesc = owner  +" - RSU(S) alarm";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "DSLAM_Cel_Stepen";
                        return myIncidentInfo;
                    case 34://SUBTYPE_COPPER_DSLAMs
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getATC();
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getDSLAM() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - DSLAM(S) alarms";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "DSLAM_Switch";
                        return myIncidentInfo;
                    case 35://SUBTYPE_COPPER_DSLAM
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getDSLAM();
                        myIncidentInfo.slotDevice = myIncidentInfo.mainDevice;
                        myIncidentInfo.myDesc = owner  +" - DSLAM(S) alarms";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "DSLAM_Switch";
                        return myIncidentInfo;
                    case 36://SUBTYPE_COPPER_SLOT or SUBTYPE_COPPER_SLOTs
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getDSLAM();//DSLAM
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getSLOT() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - DSLAM SLOT(S) alarm";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "DSLAM_Module";
                        return myIncidentInfo;
                    //-----------------------------------    
                    case 37://SUBTYPE_COPPER_CABLE_CABLEs
                    case 38://SUBTYPE_COPPER_CABLE_CABLE
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getATC();
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getCABLE() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - CABLE(s) alarms";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "Copper_cable";
                        return myIncidentInfo;
                    case 39://SUBTYPE_COPPER_CABLE_DPs 
                    case 40://SUBTYPE_COPPER_CABLE_DP 
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getCABLE();
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getDP() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - DP(s) alarms";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "Copper_cable";
                        return myIncidentInfo;
                    //-------------------------------------------------------                      //-------------------------------------------------------  

                    case 49://SUBTYPE_GPON_SHELF
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getOLT();
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getSHELF() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - GPON_SHELF(S) alarm";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "GPON_Module";
                        return myIncidentInfo;
                    //-------------------------------------------------                                            //-------------------------------------------------                        

                    case 50://SUBTYPE_GPON_OLT(s)
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getATC();
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getOLT() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - GPON_OLT(S) alarm";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "GPON_Cel_Stepen";
                        return myIncidentInfo;
                    case 51://SUBTYPE_GPON_SLOTs
                    case 52://SUBTYPE_GPON_SLOT
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getOLT();
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getSLOT() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - GPON_SLOT(S) alarm";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "GPON_Module";
                        return myIncidentInfo;
                    //-------------------------------------------------
                    case 53://SUBTYPE_GPON_CABLEs
                    case 54://SUBTYPE_GPON_CABLE
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getATC();
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getCABLE() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - GPON_CABLE(S) alarm";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "Optic_cable";
                        return myIncidentInfo;
                    case 57://SUBTYPE_GPON_BOXs
                    case 58://SUBTYPE_GPON_BOX
                        myIncidentInfo.mainDevice = this.getElementsList().get(0).getCABLE();
                        this.getElementsList().forEach((myAlarm)
                                -> {
                            myIncidentInfo.slotDevice += myAlarm.getBOX() + ";";
                        });
                        if (myIncidentInfo.slotDevice.endsWith(";")) {
                            myIncidentInfo.slotDevice = myIncidentInfo.slotDevice.substring(0, myIncidentInfo.slotDevice.length() - 1);
                        }
                        myIncidentInfo.myDesc = owner  +" - GPON_BOX(ES) alarm";
                        myIncidentInfo.myDescLong = myIncidentInfo.slotDevice;
                        myIncidentInfo.serviceInFault = "Optic_cable";
                        return myIncidentInfo;
                    default:
                        break;
                }
            }
        }
        System.out.println("DSLMON:findIncidentInfo faild for type:" + type + ", subType:" + subType);
        return null;
    }

    @Override
    public boolean isOpen() {
        return (this.getState().equals(Ticket_FYROM.STATE_OPEN_INCIDENT)
                || this.getState().equals(Ticket.STATE_UPDATED)
                || this.getState().equals(Ticket_FYROM.STATE_OPEN_AFFECTEDSERVICE)
                || this.getState().equals(Ticket_FYROM.STATE_OPEN_PROPAGATED));
    }

    //------------------------------------------------------------------------------------------------
    //----------------------------------- -------------------------------------------------------------
    //------------------------------------------------------------------------------------------------
    //------------------------------------------ main ------------------------------------------------
    //------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Ticket_FYROM myTicket_FYROM = new Ticket_FYROM("faffsfef");
        Alarm_FYROM myAlarm = new Alarm_FYROM("Kocani : OS_Kocani_Zrnovci : Zrnovci : Zrnovci:0-0-24", "20201010");
        String myBulletinid = Diligent_connector.bulletinSearch(myAlarm.getAlertOrigin());
        if (myBulletinid != null) {
            myAlarm.setAlarmReason("Maintenance");
        }
    }
}

class IncidentInfo {

    public String mainDevice = "";
    public String myDesc = "";
    public String myDescLong = "";
    public String slotDevice = "";
    public String serviceInFault = "";
    int faultType;
}

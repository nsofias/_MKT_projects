/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

import static ccm.CCMonitorStatsObjsContainer.MAIN_DIRECTORY;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static java.lang.Math.round;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nsofiasLib.databases.DatabaseLogger;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.others.Parameters;
import nsofiasLib.others.SimpleDaemon;
import nsofiasLib.time.TimeStamp1;

/**
 *
 * @author nsofias
 */
public class AlarmsDetectionListener extends SimpleDaemon {

    DatabaseLogger databaseLogger = null;
    private java.lang.reflect.Type myTicketsTypeToken;
    private CCMTicketFactory CCMTicketFactory;
    private final Map<String, CCMTicket> ticketsMap = new ConcurrentHashMap();

    public AlarmsDetectionListener(int sleep, int step) {
        super(sleep, step);
        try {
            Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");
            String connectionURL = myParameters.getStringValue("alarms_database" + ".connectionURL", "");
            String jdbcDriver = myParameters.getStringValue("alarms_database" + ".jdbcDriver", "com.mysql.jdbc.Driver");
            if (!connectionURL.isEmpty()) {
                databaseLogger = new DatabaseLogger(jdbcDriver, connectionURL);
                databaseLogger.connect();
            }
        } catch (Exception e) {
            System.out.println("CCM12:AlarmsDetectionListener databaseLogger did not connect!!!!");
            e.printStackTrace();
        }
    }

    public void onAlarmStart(CCMAlarm myAlarm) {
        if (CCMTicketFactory != null && (myAlarm.getTicketId() == null || myAlarm.getTicketId().trim().isEmpty()) ) {
            System.out.println("CCM12:AlarmsDetectionListener:onAlarmStart isAllowedToCreateTicket for " + myAlarm.getAlarmObject());
            String ticketID = createCCMTicket(myAlarm);
            myAlarm.setTicketId(ticketID);
        }
    }

    public void onAlarmUpdate(CCMAlarm myAlarm) {
        CCMTicket myCCMTicket = ticketsMap.get(myAlarm.getTicketId());
        if (myCCMTicket != null) {
            myCCMTicket.setNumOfCalls((int) myAlarm.getTotalCalls());
        }
    }

    public void onAlarmEnd(CCMAlarm myAlarm) {
        //------------ mail -----------
        //emailAlarm(myAlarm);
        //------------------ ticketing ------------------
        if (CCMTicketFactory != null && myAlarm.getTicketId() != null) {
            CCMTicket myTicket = getTicketsMap().get(myAlarm.getTicketId());
            if (myTicket != null) {
                try {
                    if (myTicket.getSR() != null) {
                        myTicket.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        String signature = myTicket.getLastSignature() != null ? myTicket.getLastSignature().getLabel() : "N/A";
                        myAlarm.setTicketSR(myTicket.getSR() + ":" + signature + ":" + myTicket.getNumOfCCTs());
                    } else {
                        myTicket.setState(Ticket.STATE_CANCELED);
                    }
                } catch (Exception e) {
                    myTicket.setState(Ticket.STATE_CLOSE_FAILED);
                    System.out.println("CCM12:AlarmsDetectionListener:onAlarmEnd ticket error: " + e.toString());
                    e.printStackTrace(System.out);
                }
            }
        }
        if (databaseLogger != null) {
            try {
                myAlarm.saveToDatabase(databaseLogger);
            } catch (Exception e) {
                e.printStackTrace(System.out);
                System.out.println("CCM12:AlarmsDetectionListener:onAlarmEnd ticket error: " + e.toString());
            }
        } else {
            System.out.println("CCM12:AlarmsDetectionListener:onAlarmEnd ticket Exception: databaseLogger is null");
        }
    }

    @Override
    public void processData() throws Exception {
        for (String key : getTicketsMap().keySet()) {
            CCMTicket myTicket = getTicketsMap().get(key);
            //System.out.println("CCM12:AlarmsDetectionListener:processData ticket for:" + myTicket.getElementName() + " of type:" + myTicket.getType() + " state:" + myTicket.getState());            
            String myType = myTicket.getType();
            int affectedCustomers=myTicket.findNumberOfAffectedCustomers();
                    int totalCalls= myTicket.getNumOfCalls();
            if (myTicket.getState().equals(Ticket.STATE_PENDING_TO_OPEN) && myTicket.isAllowedToOpen(myType,affectedCustomers,totalCalls)) {
                try {
                    System.out.println("CCM12:AlarmsDetectionListener:processData Oppening ticket for:" + myTicket.getElementName() + " of type:" + myTicket.getType());
                    //--- isElementAlreadyDefected ---
                    myTicket.isElementAlreadyDefected();// throws CCM_element_AlreadyOpen_Exception if open
                    //
                    myTicket.initializeSignature();
                    String sr = myTicket.openTicket();
                    myTicket.setSR(sr);
                    //--
                    if (sr != null && !sr.isEmpty()) {
                        myTicket.setComments("Created sr:" + sr);
                        myTicket.setState(Ticket.STATE_OPEN);
                        System.out.println("\n\n\n   ************** CCM12:createSiebelTicket ************* success (SR:" + sr + ") for " + myTicket.getElementName());
                        boolean createEmail = Parameters.loadBooleanValue(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "createEmailForTicket", "UTF8", false);
                        if (createEmail) {
                            String subject = "Abnormal Condition' detected by CCM-DILIGENT for " + myTicket.getType() + " " + myTicket.getElementName();
                            try {
                                new CCMMail(subject, myTicket.toHTML()).send();
                            } catch (Exception e) {
                                System.out.println("CCM12:AlarmsDetectionListener:#1 error " + e.toString());
                                e.printStackTrace(System.out);
                            }
                        }
                    } else {
                        myTicket.setState(Ticket.STATE_OPEN_FAILED);
                        //new MailAlert().sendmailAlert("CCM12:createSiebelTicket warning: Not created ticket for ", myTicket.getElementName() + " of type " + myTicket.getType());
                        //System.out.println("CCM12:createSiebelTicket: Ticket NOT created. Maybe already open");
                    }
                } catch (ccm.exceptions.CCM_element_AlreadyOpen_Exception e) {
                    myTicket.setState(Ticket.STATE_OPEN_FAILED);
                    myTicket.setComments("AlreadyOpen:" + e.getMessage());
                    //new MailAlert().sendmailAlert("CCM12:createSiebelTicket AlreadyOpen:", e);
                } catch (Exception e) {
                    e.printStackTrace(System.out);
                    myTicket.setState(Ticket.STATE_OPEN_FAILED);
                    myTicket.setComments(e.toString());
                    //new MailAlert().sendmailAlert("CCM12:createSiebelTicket error:", e);
                }
            } else if (myTicket.getState().equals(Ticket.STATE_OPEN)) {
                try {
                    myTicket.updateSignature();
                } catch (Exception e) {
                    System.out.println("CCM12:AlarmsDetectionListener:#2 error " + e.toString());
                    e.printStackTrace(System.out);
                    //new MailAlert().sendmailAlert("CCM12:DSLMON_SKOPIA error:", e);
                }
            } else if (myTicket.getState().equals(Ticket.STATE_PENDING_TO_CLOSE)) {
                try {
                    myTicket.updateSignature();
                } catch (Exception e) {
                    System.out.println("CCM12:AlarmsDetectionListener:#3 error " + e.toString());
                    e.printStackTrace(System.out);
                    //new MailAlert().sendmailAlert("CCM12:DSLMON_SKOPIA error:", e);
                }
                try {
                    boolean closed = myTicket.closeTicket();
                    if (closed) {
                        myTicket.setState(Ticket.STATE_CLOSED);
                    }
                } catch (Exception e) {
                    myTicket.setState(Ticket.STATE_CLOSE_FAILED);
                    e.printStackTrace(System.out);
                    System.out.println("CCM12:AlarmsDetectionListener: closeTicket failed for " + myTicket.getElementName());
                    //new MailAlert().sendmailAlert("CCM12:DSLMON_SKOPIA error:", e);
                }
            }
        }
    }

    private String createCCMTicket(CCMAlarm myAlarm) {
        try {
            CCMTicket myTicket = CCMTicketFactory.createTicket(myAlarm);
            if (myTicket != null) {
                String now = new TimeStamp1().getNowUnformated();
                String ticketID = now + "_" + myAlarm.getAlarmObject();
                myTicket.setTicketId(ticketID);
                myTicket.setType(myAlarm.getAlarmType());
                myTicket.setState(Ticket.STATE_PENDING_TO_OPEN);
                myTicket.setIncidentStartDate(myAlarm.getAlertStart());
                myTicket.setIncidentReportedDate(new TimeStamp1().getNowUnformated());
                myTicket.setElementName(myAlarm.getAlarmObject());
                myTicket.setParentElementName(myAlarm.getAlarmParent());
                myTicket.setAlertMostSignificantReason(myAlarm.getAlertMostSignificantReason());
                myTicket.setInitialNumOfCalls((int) myAlarm.getTotalCalls());
                myTicket.setNumOfCalls((int) myAlarm.getTotalCalls());
                getTicketsMap().put(myTicket.getTicketId(), myTicket);
                return ticketID;
            }
        } catch (Exception e) {
            System.out.println("CCM12:AlarmsDetectionListener:createCCMTicket error: " + e.toString());
            e.printStackTrace();
        }
        return null;
    }


    public int getNumOfCCTs() {
        int count = 0;
        String today = new TimeStamp1().getTodayUnformated();
        for (String key : ticketsMap.keySet()) {
            CCMTicket myCCMTicket = ticketsMap.get(key);
            String incidentDay = myCCMTicket.getIncidentStartDate().substring(0, 8);
            if (today.equals(incidentDay)) {
                try {
                    count += myCCMTicket.getNumOfCCTs();
                } catch (Exception e) {
                }
            }
        }
        return count;
    }

    public int getNumOfTickets() {
        int count = 0;
        String today = new TimeStamp1().getTodayUnformated();
        for (String key : ticketsMap.keySet()) {
            CCMTicket myCCMTicket = ticketsMap.get(key);
            String incidentDay = myCCMTicket.getIncidentStartDate().substring(0, 8);
            if (today.equals(incidentDay) && myCCMTicket.managedToOpenTicket()) {
                try {
                    count++;
                } catch (Exception e) {
                }
            }
        }
        return count;
    }

    @Override
    public void startProccess() throws Exception {//loadFromDisk
        String CONF_DIR = MAIN_DIRECTORY + "conf/";
        System.out.println("CCM12:AlarmsDetectionListener:startProccess tickets");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(CONF_DIR + "CCM" + ".tickets"), "utf-8"));
            Gson gson = new Gson();
            ticketsMap.putAll((Map<String, CCMTicket>) gson.fromJson(bufferedReader, myTicketsTypeToken));
            System.out.println("CCM12:loadFromDisk tickets:parsed" + "CCM" + ".tickets");
        } catch (Exception e) {
            System.out.println("CCM12:loadFromDisk tickets error:" + CONF_DIR + "CCM" + ".tickets Not loaded!!! " + e.toString());
        }
    }

    @Override
    public void endProccess() throws Exception {// flushToDisk
        String CONF_DIR = MAIN_DIRECTORY + "conf/";
        System.out.println("CCM12:AlarmsDetectionListener:endProccess flushing To Disk");
        try ( BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(CONF_DIR + "CCM" + ".tickets"), "UTF-8"))) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(ticketsMap, writer);
        } catch (Exception e) {
            System.out.println("CCM12:loadFromDisk tickets error:" + CONF_DIR + "CCM" + ".tickets Not saved!!! " + e.toString());
        }
        //------------------- DatabaseLogger close --------------------------------------- 
        if (databaseLogger != null) {
            try {
                databaseLogger.close();
            } catch (Exception e) {
                System.out.println("CCM12:AlarmsDetectionListener:#4 error " + e.toString());
                e.printStackTrace();
            }
        }
    }

    /**
     * @param myCCMTicketFactory the myCCMTicketFactory to set
     */
    public void setCCMTicketFactory(CCMTicketFactory myCCMTicketFactory) {
        this.CCMTicketFactory = myCCMTicketFactory;
    }

    /**
     * @return the ticketsMap
     */
    public Map<String, CCMTicket> getTicketsMap() {
        return ticketsMap;
    }

    /**
     * @param myTicketsTypeToken the myTicketsTypeToken to set
     */
    public void setMyTicketsTypeToken(java.lang.reflect.Type myTicketsTypeToken) {
        this.myTicketsTypeToken = myTicketsTypeToken;
    }
}

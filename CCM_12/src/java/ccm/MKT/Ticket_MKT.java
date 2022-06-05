/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.MKT;

import ccm.SignatureFactory;
import ccm.CCMTicket;
import ccm.Signature;
import ccm.exceptions.CCM_element_AlreadyOpen_Exception;
import com.google.gson.Gson;
import diligent_MKT.Alarm_FYROM;
import diligent_MKT.Ticket_FYROM;
import static diligent_mkt_ws.Alarm_umbrella.findBoundCTTs;
import diligent_mkt_ws.Diligent_connector;
import static java.lang.Math.round;
import java.util.ArrayList;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import nsofiasLib.ote.alarms.Alarm;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.others.Parameters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.JsonToHtmlConverter;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.URLContextReader_object;

/**
 *
 * @author nsofias
 */
public class Ticket_MKT extends nsofiasLib.ote.alarms.Ticket implements CCMTicket {

    private int initialNumOfCCTs = 0;
    private int initialNumOfCalls = 0;
    private Ticket_FYROM myTicket_IBM;
    private String elementName;
    private String parentElementName;
    private String alertMostSignificantReason;
    private String comments = "";
    private String foundOpennedSR = "";
    private int numOfCCTs = 0;
    private int numOfCalls = 0;

    private final List<Signature> signatureHistory = new LinkedList();

    public Ticket_MKT(String corrString) {
        super(corrString);
    }

    @Override
    public boolean isAllowedToOpen(String myType, int affectedCustomers, int totalCalls) {
        Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");
        int createTicketMinCallsDefault = myParameters.getIntValue("createTicketMinCalls.DEFAULT", 5);
        long createTicketMinCallsForType = myParameters.getIntValue("createTicketMinCalls." + myType, createTicketMinCallsDefault);
        //**********************************- dynamic ******************************************* 
        if (affectedCustomers > 0) {
            createTicketMinCallsForType = 3 + round(0.002 * affectedCustomers);
        }
        //-----------------------------------       
        boolean allowedToCreate = myParameters.getBooleanValue("createTicket." + myType, false);
        System.out.println("CCM12:Ticket_MKT:isAllowedToCreateTicket:" + myType + " " + totalCalls + " > " + createTicketMinCallsForType + " " + allowedToCreate);
        return (allowedToCreate && totalCalls >= createTicketMinCallsForType);
    }

    @Override
    public int findNumberOfAffectedCustomers() {
        Alarm_FYROM myAlarm_FYROM = this.getMyTicket_IBM().getElementsList().get(0);
        return myAlarm_FYROM.findLinesRegistered();
    }

    @Override
    public String openTicket() throws Exception {
        try {
            //-------------------------- openTicket --------------------------------
            myTicket_IBM.openTicket("Diligent-Anomaly:" + this.getLastSignature().getLabel());// release in production            
            if (myTicket_IBM.getSR() == null) {
                throw new Exception();
            }
            myTicket_IBM.setState(Ticket_FYROM.STATE_OPEN_INCIDENT);
            System.out.println("CCM12:Ticket_MKT:New state " + Ticket_FYROM.STATE_OPEN_INCIDENT + " for " + myTicket_IBM.getDesc() + " at " + new TimeStamp1().getNowFormated());
            new MailAlert().sendmailAlert("OPPENED ticket with  Synopsis:" + myTicket_IBM.getSYNOPSIS(), new Gson().toJson(myTicket_IBM));
            //------------------------- addServiceElements -------------------------
            myTicket_IBM.addServiceElements("Diligent-Anomaly:" + this.getLastSignature().getLabel());
            //addServiceElementsVirtual();
            myTicket_IBM.setState(Ticket_FYROM.STATE_OPEN_AFFECTEDSERVICE);
            System.out.println("CCM12:Ticket_MKT:New state " + Ticket_FYROM.STATE_OPEN_AFFECTEDSERVICE + " for " + myTicket_IBM.getDesc() + " at " + new TimeStamp1().getNowFormated());
            //myTicket.sendMailAlert("AFFECTEDSERVICE added to  ticket with  Synopsis:" + myTicket.getSYNOPSIS(), myParameters);
            //------------------- markDeffected ---------
            myTicket_IBM.markCustomersAffected("Diligent-Anomaly:" + this.getLastSignature().getLabel());
            myTicket_IBM.setState(Ticket_FYROM.STATE_OPEN_PROPAGATED);
            System.out.println("CCM12:Ticket_MKT:New state " + Ticket_FYROM.STATE_OPEN_PROPAGATED + " for " + myTicket_IBM.getDesc() + " at " + new TimeStamp1().getNowFormated());
            new MailAlert().sendmailAlert("CCM12:Ticket_MKT:propagateAffectedCustomers for ticket with  Synopsis:" + myTicket_IBM.getSYNOPSIS(), new Gson().toJson(myTicket_IBM));
        } catch (Exception e) {
            myTicket_IBM.setBUSY(false);
            e.printStackTrace(System.out);
            System.out.println("CCM12:Ticket_MKT:Error_" + myTicket_IBM.getCollerationString() + "@" + new TimeStamp1().getNowUnformated());
            myTicket_IBM.setState(Ticket.STATE_OPEN_FAILED);
            System.out.println("CCM12:Ticket_MKT:OPEN_ACTION_Thread error:" + e.toString());
            new MailAlert().sendmailAlert("CCM12:Ticket_MKT:ERROR (" + e.toString() + " oppening ticket with  Synopsis:" + myTicket_IBM.getSYNOPSIS(), e);
        }
        System.out.println("CCM12:Ticket_MKT: On_OPEN_ACTION_Thread ended " + myTicket_IBM.getSR());
        return myTicket_IBM.getSR();
    }

    /*
    private void openTicketVirtual() {
        int randomNum = ThreadLocalRandom.current().nextInt(1000, 9999);
        String SR = "INC" + "_" + String.valueOf(randomNum);
        myTicket_IBM.setSR(SR);
    }

    private void addServiceElementsVirtual() {
        Alarm_FYROM myAlarm = myTicket_IBM.getElementsList().get(0);
        int randomNum = ThreadLocalRandom.current().nextInt(10000000, 99999999);
        myAlarm.setAffServiceID(String.valueOf(randomNum));
    }*/
    @Override
    public String isElementAlreadyDefected() throws Exception {
        try {
            isElementAlreadyDefected_diligent();
            isElementAlreadyDefected_IBM();
        } catch (CCM_element_AlreadyOpen_Exception e) {
            throw e;
        } catch (Exception e) {
            System.out.println("CCM12:Ticket_MKT:isElementAlreadyDefected error:" + e.toString());
            e.printStackTrace();
            return null;
        }
        return null;
    }

    private void isElementAlreadyDefected_IBM() throws Exception {
        String existingSR = null;
        if (myTicket_IBM.getType() != null && (myTicket_IBM.getType().equals(Alarm_FYROM.TYPE_COPPER) || myTicket_IBM.getType().equals(Alarm_FYROM.TYPE_GPON))) {
            if (this.getType().equals(Alarm_FYROM.SUBTYPE_COPPER_SLOT) || this.getType().equals(Alarm_FYROM.SUBTYPE_GPON_SLOT)) {
                existingSR = Diligent_connector.getAlreadyOpenIncident(this.getParentElementName());
            } else {
                existingSR = Diligent_connector.getAlreadyOpenIncident(this.getElementName());
                // check parent also the parent-----
                if (existingSR == null) {
                    existingSR = Diligent_connector.getAlreadyOpenIncident(this.getParentElementName());
                }
            }
            //--------------------
            if (existingSR != null) {
                System.out.println("CCM:Ticket_FYROM : foundAlreadyOpen for alarm " + this.getElementName());
                throw new CCM_element_AlreadyOpen_Exception(existingSR);
            }
        }
    }

    private void isElementAlreadyDefected_diligent() throws Exception {
        List<String> pathsToCheck = new ArrayList();
        pathsToCheck.add(this.getElementName());
        if (this.getType().equals("CABLE"))// check also GPON paths
        {
            pathsToCheck.add(this.myTicket_IBM.getElementsList().get(0).getCABLE().replace("#", ";"));
        }
        if (this.getType().equals("DP"))// check also GPON paths
        {
            pathsToCheck.add(this.myTicket_IBM.getElementsList().get(0).getDP().replace("#", ";"));
        }
        for (String path : pathsToCheck) {
            URLContextReader_object myUrlReader = new URLContextReader_object();
            String url = "http://10.232.63.13:8080/DILIGENT_MKT/inMassive.jsp" + "?path=" + URLEncoder.encode(path, "UTF-8");// + "&type=" + this.getType();
            System.out.println("checkIfMassive:url:" + url);
            String existingSR = (String) myUrlReader.getUrlContext(url, 120000, 120000).get(0);
            System.out.println("checkIfMassive returned:" + existingSR);
            if (existingSR != null && existingSR.trim().startsWith("INC")) {
                throw new CCM_element_AlreadyOpen_Exception(existingSR);
            }
        }
    }

    @Override
    public String isElementRecentlyDefected() throws Exception {
        List<String> pathsToCheck = new ArrayList();
        pathsToCheck.add(this.getElementName());
        if (this.getType().equals("CABLE"))// check also GPON paths
        {
            pathsToCheck.add(this.myTicket_IBM.getElementsList().get(0).getCABLE().replace("#", ";"));
        }
        if (this.getType().equals("DP"))// check also GPON paths
        {
            pathsToCheck.add(this.myTicket_IBM.getElementsList().get(0).getDP().replace("#", ";"));
        }
        for (String path : pathsToCheck) {
            URLContextReader_object myUrlReader = new URLContextReader_object();
            String url = "http://10.232.63.13:8080/DILIGENT_MKT/inMassive.jsp" + "?minutesDiff=300&path=" + URLEncoder.encode(path, "UTF-8");// + "&type=" + this.getType();
            System.out.println("inMassiveRecently:url:" + url);
            String res = (String) myUrlReader.getUrlContext(url, 120000, 120000).get(0);
            System.out.println("inMassiveRecently returned:" + res);
            if (res.contains("INC")) {
                return res;
            }
        }
        return null;
    }

    @Override
    public boolean closeTicket() throws Exception {
        myTicket_IBM.setBUSY(true);
        Alarm_FYROM myIBMAlarm = myTicket_IBM.getElementsList().get(0);
        long releaseCustomersAffectedDelay = 30;//minutes
        TimeStamp1 T1 = new TimeStamp1(myTicket_IBM.getIncidentReportedDate());
        TimeStamp1 now = new TimeStamp1();
        double diff = now.minutesDiff(T1);
        if (diff > releaseCustomersAffectedDelay) {
            try {
                System.out.println("RemoveServiceElements_ACTION_Thread started for  " + myIBMAlarm.getTicketSR() + "-" + myIBMAlarm.getAffServiceID());
                String stop_time = new TimeStamp1().getNowUnformated();
                myTicket_IBM.setIncidentStoppedDate(stop_time);
                myTicket_IBM.setState(Ticket.STATE_CLOSED);
                //****************************--------------- update (remove) in maximo & CRM  ------------********************
                myIBMAlarm.setAlarmStop(stop_time);
                if (!myIBMAlarm.getAffServiceID().isEmpty() && myIBMAlarm.getTicketSR() != null) {
                    System.out.println("DSLMON_SKOPIA -> createAlarms: RemoveServiceElements_ACTION_Thread: " + myIBMAlarm.getTicketSR() + "-" + myIBMAlarm.getAffServiceID());
                    myTicket_IBM.updateServiceElements(myIBMAlarm);
                }
                //--------------------------------
                myTicket_IBM.releaseCustomersAffected(myIBMAlarm);
                System.out.println("RemoveServiceElements_ACTION_Thread/propagateAffectedCustomers_inService for " + myIBMAlarm.getTicketSR() + "-" + myIBMAlarm.getAffServiceID() + " at " + new TimeStamp1().getNowFormated());
                myIBMAlarm.setState(Alarm.STATE_CLOSED);
                this.setState(Ticket.STATE_CLOSED);
                myTicket_IBM.setBUSY(false);
                return true;
            } catch (Exception e) {
                myTicket_IBM.setBUSY(false);
                e.printStackTrace(System.out);
                System.out.println("RemoveServiceElements_ACTION_Thread error:(" + myIBMAlarm.getTicketSR() + "-" + myIBMAlarm.getAffServiceID() + "):  " + e.toString());
            }
        }
        myTicket_IBM.setBUSY(false);
        System.out.println("DSLMON_SKOPIA: RemoveServiceElements_ACTION_Thread ended " + myIBMAlarm.getTicketSR() + "-" + myIBMAlarm.getAffServiceID());
        return false;
    }

    @Override
    public String getIncidentStoppedDate() {
        return myTicket_IBM.getIncidentStoppedDate();
    }

    /**
     * @return the initialNumOfCCTs
     */
    @Override
    public int getInitialNumOfCCTs() {
        return initialNumOfCCTs;
    }

    /**
     * @param initialNumOfCCTs the initialNumOfCCTs to set
     */
    @Override
    public void setInitialNumOfCCTs(int initialNumOfCCTs) {
        this.initialNumOfCCTs = initialNumOfCCTs;
    }

    @Override
    public void initializeSignature() {
        try {
            String sr_ = isElementRecentlyDefected();
            if (sr_ != null) {
                String[] sr = sr_.split(";");
                this.setFoundOpennedSR(sr[0]);
                if (sr.length > 1 && sr[1].contains("Maintenance")) {
                    this.setFoundOpennedSR(sr[0] + "-Maintenance");
                    this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_2"));//SIGNATURE_2 = "Αfter Maintenance";;
                    System.out.println("CCM12:Ticket_MKT:initializeSignature:SIGNATURE_2 -Αfter recent Maintenance  for " + elementName);
                } else {
                    this.setFoundOpennedSR(sr[0] + "-Massive");
                    System.out.println("CCM12:Ticket_MKT:initializeSignature:SIGNATURE_3-After recent NTT  for " + elementName);
                    this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_3"));//SIGNATURE_3 = "After NTT sr"                    
                }
            } else if (this.getAlertMostSignificantReason().contains("Mobile")) {
                this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_9"));////"Mobile";
                System.out.println("CCM12:Ticket_MKT:initializeSignature:SIGNATURE_9 - Mobile problem for " + elementName + "");
            } else if (myTicket_IBM.getType().equals(Alarm_FYROM.TYPE_COPPER) || myTicket_IBM.getType().equals(Alarm_FYROM.TYPE_GPON)) {
                this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_1"));////"Unknown problem";
                System.out.println("CCM12:Ticket_MKT:initializeSignature:SIGNATURE_1 -Unknown problem for " + elementName + "");
            } else {
                this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_6"));////"Cable problem";
                System.out.println("CCM12:Ticket_MKT:initializeSignature:SIGNATURE_6 - Probable Cable Fault " + elementName + "");
            }
        } catch (Exception e) {
            System.out.println("CCM12:Ticket_MKT:initializeSignature error:" + e.toString() + " for " + this.getElementName());
            e.printStackTrace();
            System.out.println("CCM12:Ticket_MKT:initializeSignature:SIGNATURE_1 -Unknown problem for " + elementName + "");
        }
    }

    @Override
    public void updateSignature() {
        if (this.getLastSignature() != null) {
            try {
                String started = this.getLastSignature().getCreationTimeStamp();
                TimeStamp1 startedTimeStamp = new TimeStamp1(started);
                TimeStamp1 now = new TimeStamp1();
                int boundCTTs = 0;
                try {
                    boundCTTs = retrieveSR_CTTsNumber(myTicket_IBM.getSR());
                    this.setNumOfCCTs(boundCTTs);
                } catch (Exception e) {
                    System.out.println("CCM12:Ticket_MKT:updateSignature:retrieveSR_CTTsNumber error:" + e.toString() + " for SR " + myTicket_IBM.getSR());
                    e.printStackTrace(System.out);
                }
                String signatureId = this.getLastSignature().getLabel();
                switch (signatureId) {
                    case "SIGNATURE_1"://"Unknown problem";
                        if (boundCTTs == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (boundCTTs <= 1 && now.minutesDiff(startedTimeStamp) > 180) {
                            this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_5"));
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        }
                        break;
                    case "SIGNATURE_2"://SIGNATURE_2 = "Αfter Maintenance";
                        if (boundCTTs == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            //this.setLastSignature(SignatureFactory_MKT.createSignature("SIGNATURE_10));
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (boundCTTs <= 1 && now.minutesDiff(startedTimeStamp) > 180) {
                            this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_5"));
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        }
                        break;
                    case "SIGNATURE_3"://SIGNATURE_3 = "After NTT sr"
                        if (boundCTTs == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            //this.setLastSignature(SignatureFactory_MKT.createSignature("SIGNATURE_10));
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (boundCTTs <= 1 && now.minutesDiff(startedTimeStamp) > 180) {
                            this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_5"));
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        }
                        break;
                    case "SIGNATURE_6"://SIGNATURE_3 = "CABLE"
                        if (boundCTTs == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            //this.setLastSignature(SignatureFactory_MKT.createSignature("SIGNATURE_10));
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (boundCTTs <= 1 && now.minutesDiff(startedTimeStamp) > 180) {
                            this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_5"));
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        }
                        break;
                    case "SIGNATURE_9"://SIGNATURE_9 = "Mobile"
                        if (boundCTTs == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            //this.setLastSignature(SignatureFactory_MKT.createSignature("SIGNATURE_10));
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (boundCTTs <= 1 && now.minutesDiff(startedTimeStamp) > 180) {
                            this.setLastSignature(SignatureFactory.createSignature("SIGNATURE_5"));
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println("CCM12:Ticket_MKT:updateSignature: error:" + e.toString());
                e.printStackTrace(System.out);
            }
        }
    }

    public int retrieveSR_CTTsNumber(String SR) throws Exception {
        int ctts = findBoundCTTs(SR);
        System.out.println("ALARM_UMBRELLA:findBoundCTTs returned " + ctts);
        return ctts;
    }

    /**
     * @return the elementName
     */
    @Override
    public String getElementName() {
        return elementName;
    }

    /**
     * @param elementName the elementName to set
     */
    @Override
    public void setElementName(String elementName
    ) {
        this.elementName = elementName;
    }

    /**
     * @return the parentElementName
     */
    @Override
    public String getParentElementName() {
        return parentElementName;
    }

    /**
     * @param parentElementName the parentElementName to set
     */
    @Override
    public void setParentElementName(String parentElementName) {
        this.parentElementName = parentElementName;
    }

    /**
     * @return the foundOpennedSR
     */
    @Override
    public String getFoundOpennedSR() {
        return foundOpennedSR;
    }

    /**
     * @param foundOpennedSR the foundOpennedSR to set
     */
    @Override
    public void setFoundOpennedSR(String foundOpennedSR) {
        this.foundOpennedSR = foundOpennedSR;
    }

    /**
     * @return the numOfCCTs
     */
    @Override
    public int getNumOfCCTs() {
        return numOfCCTs;
    }

    /**
     * @param numOfCCTs the numOfCCTs to set
     */
    @Override
    public void setNumOfCCTs(int numOfCCTs) {
        this.numOfCCTs = numOfCCTs;
    }

    /**
     * @return the signature
     */
    @Override
    public Signature getLastSignature() {
        if (!this.getSignatureHistory().isEmpty()) {
            return this.getSignatureHistory().get(this.getSignatureHistory().size() - 1);
        }else{
            return null;
        }
    }

    public void setLastSignature(Signature s) {
        this.getSignatureHistory().add(s);
    }

    /**
     * @return the signatureHistory
     */
    public List<Signature> getSignatureHistory() {
        return signatureHistory;
    }

    /**
     * @return the alertMostSignificantReason
     */
    @Override
    public String getAlertMostSignificantReason() {
        return alertMostSignificantReason;
    }

    /**
     * @param alertMostSignificantReason the alertMostSignificantReason to set
     */
    @Override
    public void setAlertMostSignificantReason(String alertMostSignificantReason) {
        this.alertMostSignificantReason = alertMostSignificantReason;
    }

    /**
     * @return the comments
     */
    @Override
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    @Override
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the numOfCalls
     */
    @Override
    public int getNumOfCalls() {
        return numOfCalls;
    }

    /**
     * @param numOfCalls the numOfCalls to set
     */
    @Override
    public void setNumOfCalls(int numOfCalls) {
        this.numOfCalls = numOfCalls;
    }

    /**
     * @return the initialNumOfCalls
     */
    @Override
    public int getInitialNumOfCalls() {
        return initialNumOfCalls;
    }

    /**
     * @param initialNumOfCalls the initialNumOfCalls to set
     */
    @Override
    public void setInitialNumOfCalls(int initialNumOfCalls) {
        this.initialNumOfCalls = initialNumOfCalls;
    }

    @Override
    public int getCustomerImpact() {
        if (this.getMyTicket_IBM() != null) {
            return getMyTicket_IBM().getCurrentUsersRegistered();
        }
        return (0);
    }

    @Override
    public String toHTML() {
        String myBodyMessage = "<style>body {\n"
                + "    margin: 20px;\n"
                + "    background-position: top;\n"
                + "    background-repeat: no-repeat;\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 12px;\n"
                + "    color: #480082;\n"
                + "}\n"
                + "\n"
                + "table {      \n"
                + "    font-size: 10px;\n"
                + "    /*background-image: url(diligent_View_front_page.jpg);*/\n"
                + "    background-color: lightgray;\n"
                + "    color: #E10075;\n"
                + "}\n"
                + "th {\n"
                + "    border: 1px solid;\n"
                + "    border-color: whitesmoke; \n"
                + "    background-color: #E10075;\n"
                + "    color: white;\n"
                + "\n"
                + "    padding: 2px;\n"
                + "}\n"
                + "\n"
                + "td {\n"
                + "    border: 1px solid;\n"
                + "    border-color: whitesmoke; \n"
                + "    padding: 2px;\n"
                + "}\n"
                + "body.achtergrond {\n"
                + "\n"
                + "}\n"
                + "\n"
                + "body.corporate {\n"
                + "\n"
                + "}\n"
                + "body.doc {\n"
                + "\n"
                + "}\n"
                + ".font,doctext,TD,P,U,LI,OL,UL,BLOCKQUOTE,U,SUB,SUP {\n"
                + "    font-family: Verdana, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: purple;;\n"
                + "}\n"
                + "\n"
                + "i {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #009900;\n"
                + "    font-style : italic;\n"
                + "}\n"
                + "\n"
                + "B,STRONG {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #E10075;\n"
                + "    font-weight : bold;	\n"
                + "}\n"
                + "\n"
                + "\n"
                + "A, A:hover, A:visited, A:active, A:link {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #009900;\n"
                + "    font-weight : bold;	\n"
                + "}\n"
                + "\n"
                + "A, A:hover  {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #000000;\n"
                + "    font-weight : bold;	\n"
                + "}\n"
                + "\n"
                + "INPUT,SELECT,TEXTAREA {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 14px;\n"
                + "    color: #E10075;\n"
                + "    padding : 1px;\n"
                + "    border-style: double;\n"
                + "    border-color: #002F00;                  \n"
                + "}\n"
                + "SMALL,small {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 10px;\n"
                + "    color: #009900;\n"
                + "}\n"
                + "\n"
                + "H1 {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 24px;\n"
                + "    color: white;\n"
                + "    font-weight : bold;\n"
                + "    background-color: #E10075;	\n"
                + "}\n"
                + "\n"
                + "H2 {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 18px;\n"
                + "    color: white;\n"
                + "    font-weight : bold;\n"
                + "    background-color: #E10075;	\n"
                + "\n"
                + "}\n"
                + "\n"
                + "H3,H4,H5,H6 {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 14px;\n"
                + "    color: #E10075;\n"
                + "    font-weight : bold;\n"
                + "    background-color: #E10075;	\n"
                + "}\n"
                + "\n"
                + ".doctextLblue {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #00b2e6;\n"
                + "}\n"
                + "\n"
                + "/* Link styles */\n"
                + "\n"
                + "\n"
                + ".heading3\n"
                + "{\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 12px;\n"
                + "    font-weight: bold;\n"
                + "    color: #ffffff;\n"
                + "    text-decoration: none;	\n"
                + "}\n"
                + "\n"
                + ".menuitem, a.menuitem {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #009900;\n"
                + "    text-decoration: none;\n"
                + "}\n"
                + "\n"
                + "/* Title headings */\n"
                + ".corporateText{\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-size: 11px;\n"
                + "    color: #ffffff;\n"
                + "}\n"
                + ".pagetitle {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-weight: bold;\n"
                + "    color: #00b2e6;\n"
                + "    font-size: 14px;\n"
                + "}\n"
                + "\n"
                + ".doctitle {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-weight: bold;\n"
                + "    color: #009900;\n"
                + "    font-size: 11px;\n"
                + "    margin-bottom: 2px;\n"
                + "}\n"
                + "\n"
                + ".headingrightclmn {\n"
                + "    font-family: Arial, Helvetica, sans-serif;\n"
                + "    font-weight: bold;\n"
                + "    font-size: 12px;\n"
                + "    color: #00b2e6;\n"
                + "}\n"
                + "\n"
                + "img {\n"
                + "    /*width: 100%;*/\n"
                + "    object-fit:  contain;\n"
                + "\n"
                + "}\n"
                + "iframe {\n"
                + "    width: 100%;\n"
                + "    height: 90vh;\n"
                + "    background-color: lightgrey;	\n"
                + "}\n"
                + "\n"
                + "\n"
                + ".json_object { \n"
                + "    margin:10px; \n"
                + "    padding-left:10px; \n"
                + "    border-left:1px solid #ccc\n"
                + "}\n"
                + ".json_key { \n"
                + "    font-weight: bold; \n"
                + "}</style>";
        myBodyMessage += new JsonToHtmlConverter().getHtmlData(new Gson().toJson(this));
        myBodyMessage += "<p>Visit CCM-diligent Anomaly Detection (for MKT) URL @  <a href='http://10.232.63.14:8080/CCM/'>http://10.232.63.14:8080/CCM</a>";
        return myBodyMessage;
    }

    /**
     * @return the myTicket_IBM
     */
    public Ticket_FYROM getMyTicket_IBM() {
        return myTicket_IBM;
    }

    /**
     * @param myTicket_FYROM the myTicket_IBM to set
     */
    public void setMyTicket_IBM(Ticket_FYROM myTicket_FYROM) {
        this.myTicket_IBM = myTicket_FYROM;
    }

    public static void main(String[] args) {
        try {

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm.OTE;

import java.util.List;
import my_siebel_proxy_client.MY_Siebel_PROXY_client;
import static my_siebel_proxy_client.MY_Siebel_PROXY_client.prepareSR;
import my_siebel_proxy_client.exceptions.RetrieveNEs_InternalServerErrorException;
import my_siebel_proxy_client.exceptions.RetrieveNEs_OperationTimeoutException;
import my_siebel_proxy_client.exceptions.RetrieveNEs_UnableToMapException;
import nsofiasLib.ote.DSLAMs.OwnerGroupActivitiesFinder;
import ccm.CCMTicket;
import ccm.Signature;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import static my_siebel_proxy_client.MY_Siebel_PROXY_client.appendSR_NOTES;
import static my_siebel_proxy_client.MY_Siebel_PROXY_client.manageMODE_NO;
import static my_siebel_proxy_client.MY_Siebel_PROXY_client.manageMODE_YES;
import static my_siebel_proxy_client.MY_Siebel_PROXY_client.retrieveSR_CTTsNumber;
import nsofiasLib.ote.DSLAMs.DslamDetails;
import nsofiasLib.ote.alarms.Ticket;
import nsofiasLib.others.Parameters;
import nsofiasLib.time.TimeStamp1;
import nsofiasLib.utils.CommonUrls;
import nsofiasLib.utils.MailAlert;
import nsofiasLib.utils.URLContextReader_object;
import siebel.NetworkElement;
import siebel.SiebelParameters;
import siebel.TicketSiebel;

/**
 *
 * @author nsofias
 */
public class Ticket_OTE extends nsofiasLib.ote.alarms.Ticket implements CCMTicket {

    private String elementName;
    private String parentElementName = "";
    private int initialNumOfCCTs = 0;
    private int initialNumOfCalls = 0;
    private TicketSiebel myTicketSiebel;
    private String alertMostSignificantReason;
    private String comments = "";
    private String foundOpennedSR = "";
    private int numOfCCTs = 0;
    private int numOfCalls = 0;
    private Signature_OTE signature;
    private final ArrayList<String> signatureHistory = new ArrayList();
    //
    public static String ELEMENT_TYPE_AREA = "AREA";
    public static String ELEMENT_TYPE_BRAS = "BRAS";
    public static String ELEMENT_TYPE_DSLAM = "DSLAM";
    public static String ELEMENT_TYPE_SLOT = "SLOT";
    public static String ELEMENT_TYPE_CABLE = "CABLE";

    public Ticket_OTE(String corrString) {
        super(corrString);
    }

    @Override
    public boolean isAllowedToOpen(String myType, long affectedCustomers, int totalCalls) {
        Parameters myParameters = new Parameters(System.getenv("APPLICATIONS_PATH") + "/ccm/conf/parameters.properties", "UTF8");
        int createTicketMinCallsDefault = myParameters.getIntValue("createTicketMinCalls.DEFAULT", 5);
        long createTicketMinCallsForType = myParameters.getIntValue("createTicketMinCalls." + myType, createTicketMinCallsDefault);
        //**********************************- dynamic *******************************************        
        boolean allowedToCreate = myParameters.getBooleanValue("createTicket." + myType, false);
        System.out.println("CCM12:Ticket_MKT:isAllowedToCreateTicket:" + myType + " " + totalCalls + " > " + createTicketMinCallsForType + " " + allowedToCreate);
        return (allowedToCreate && totalCalls >= createTicketMinCallsForType);
    }

    @Override
    public long findNumberOfAffectedCustomers() {
        return 0;
    }

    @Override
    public String openTicket() throws Exception {
        myTicketSiebel.setOpenedbyDiliAgent(true);
        myTicketSiebel.setCollerationString("corrStr");
        myTicketSiebel.setSourceType(this.getType());
        myTicketSiebel.setIncidentStartDate(this.getIncidentStartDate());
        myTicketSiebel.setIncidentReportedDate(this.getIncidentStartDate());
        myTicketSiebel.setManageMODE(MY_Siebel_PROXY_client.manageMODE_NO);
        // prepare Ticket for siebel
        prepareSiebelParameters(elementName);
        try {
            myTicketSiebel.setSourceType(this.getType());
            myTicketSiebel.getSiebelParameters().setCreateSRHeaderGroup("NMC-DATA/IP");
            //------  for PRODUCTION ----------
            this.setSR(my_siebel_proxy_client.MY_Siebel_PROXY_client.createSR(myTicketSiebel).split("&")[1]);
            myTicketSiebel.setSR(this.getSR());
            setInitialNumOfCCTs(retrieveSR_CTTsNumber(this.getSR()));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            throw e;
        }
        return this.getSR();
    }

    public void prepareSiebelParameters(String myObjElement) throws Exception {
        if (myTicketSiebel != null) {
            switch (this.getType()) {
                case "AREA":
                    myTicketSiebel.setSynopsis("'Abnormal Condition' detected by CCM-DILIGENT anomaly detection algorithm (CD-ADA) for Dslam(s) " + myObjElement + " in area of " + myObjElement);
                    break;
                case "CABLE":
                    myTicketSiebel.setSynopsis("'Abnormal Condition' detected by CCM-DILIGENT anomaly detection algorithm (CD-ADA) for Dslam(s) " + myObjElement + " in area of " + myObjElement + " – Possibly Affected by cable fault");
                    break;
                default:
                    myTicketSiebel.setSynopsis("'Abnormal Condition' detected by CCM-DILIGENT Anomaly Detection Algorithm for " + this.getType() + " " + myObjElement);
                    break;
            }
            System.out.println("CCM12:Ticket_OTE:prepareSiebelParameters Synopsis=" + myTicketSiebel.getSynopsis());
            SiebelParameters mySiebelParameters = new SiebelParameters();
            myTicketSiebel.setSiebelParameters(mySiebelParameters);
            Siebel_profile mySiebel_profile = new Siebel_profile();
            switch (this.getType()) {
                case "BRAS":
                    mySiebelParameters.setCreateSRHeaderCategory(mySiebel_profile.getCreateSR_header_BRAS_Category());
                    mySiebelParameters.setCreateSRHeaderEquipmentType(mySiebel_profile.getCreateSR_header_BRAS_EquipmentType());
                    mySiebelParameters.setCreateSRHeaderTTSymptom(mySiebel_profile.getCreateSR_header_BRAS_TTSymptom());
                    break;
                default:// "Dslam & slot"
                    mySiebelParameters.setCreateSRHeaderCategory(mySiebel_profile.getCreateSR_header_Category());
                    mySiebelParameters.setCreateSRHeaderEquipmentType(mySiebel_profile.getCreateSR_header_EquipmentType());
                    mySiebelParameters.setCreateSRHeaderTTSymptom(mySiebel_profile.getCreateSR_header_TTSymptom());
                    break;
            }
            mySiebelParameters.setCreateSRHeaderInventory(mySiebel_profile.getCreateSR_header_Inventory());
            mySiebelParameters.setCreateSRHeaderGroup(mySiebel_profile.getCreateSR_header_Group());
            mySiebelParameters.setCreateSRHeaderReportedBy(mySiebel_profile.getCreateSR_header_ReportedBy());
            mySiebelParameters.setCreateSRElementStatus(mySiebel_profile.getCreateSR_element_Status());
            mySiebelParameters.setPriority(mySiebel_profile.getCreateSR_header_Priority());
            mySiebelParameters.setCreateSRServiceAffected(mySiebel_profile.isCreateSR_serviceAffecting());
            //

            //-------------------------------
            if (!this.getType().equals("BRAS")) {
                try {
                    prepareSR(myTicketSiebel);
                } catch (RetrieveNEs_OperationTimeoutException | RetrieveNEs_InternalServerErrorException e) {
                    myTicketSiebel.setSiebelResponseCode("RetrieveNEs_OperationTimeout");
                    e.printStackTrace(System.out);
                    throw e;
                } catch (RetrieveNEs_UnableToMapException e) {
                    myTicketSiebel.setSiebelResponseCode("RetrieveNEs_UnableToMap");
                    e.printStackTrace(System.out);
                    throw e;
                } catch (Exception e) {
                    myTicketSiebel.setSiebelResponseCode("RetrieveNEs_" + e.toString());
                    e.printStackTrace(System.out);
                    throw e;
                }
            }
            //----------------- UPDATE TemipAlatm_DSL MUNICIPALITY -------------------
            String municipality;
            if (this.getType().equals("BRAS")) {
                municipality = "ΑΤΤΙΚΗΣ";
                myTicketSiebel.setArea("ΑΤΤΙΚΗΣ");
            } else {
                municipality = myTicketSiebel.getArea();
            }
            System.out.println("CCM12:Ticket_OTE:createSiebelTicket:municipality=" + municipality);
            OwnerGroupActivitiesFinder myOnerGroupActivitiesFinder = new OwnerGroupActivitiesFinder();
            String myTechDept = myOnerGroupActivitiesFinder.getTECHCNICAL_DEPARTMENT(municipality, myTicketSiebel.getSiebelParameters().getCreateSRHeaderGroup());
            if (myTechDept != null) {
                myTicketSiebel.getSiebelParameters().setCreateSRHeaderGroup(myTechDept);
            }
            //------- check for allready defected elements ------
            List<NetworkElement> myUpdatedTicketSiebelList = myTicketSiebel.getElementsList();
            for (int i = myUpdatedTicketSiebelList.size() - 1; i >= 0; i--) {
                NetworkElement myNetworkElementUpdate = myUpdatedTicketSiebelList.get(i);
                //**************************************************************
                if (myNetworkElementUpdate.getSr() != null && !myNetworkElementUpdate.getSr().isEmpty())// remove the allready 'Defective'
                {
                    myTicketSiebel.setSR(myNetworkElementUpdate.getSr());
                    myUpdatedTicketSiebelList.remove(i);
                    System.out.println("CCM12:Ticket_OTE:createSiebelTicket:" + myNetworkElementUpdate.getDslamCode() + " found open " + myNetworkElementUpdate.getSr());
                    break;
                }
            }
            if (myUpdatedTicketSiebelList.isEmpty()) {// already oppened!!!!! 
                System.out.println("CCM12:Ticket_OTE:createSiebelTicket:myUpdatedTicketSiebelList.isEmpty" + " found open " + myTicketSiebel.getSR());
                //this.getCCMAlarm().setAlarmComments(" Found already Oppened, SR:" + myTicketSiebel.getSR());
                throw new Exception(" found already Oppened with SR:" + myTicketSiebel.getSR());
            }
        }
    }

    @Override
    public String isElementAlreadyDefected() throws Exception {
        NetworkElement myNetworkElement = myTicketSiebel.getElementsList().get(0);
        String existingTicketId = null;
        switch (myNetworkElement.getSRType()) {
            case "BRAS":
                existingTicketId = MY_Siebel_PROXY_client.isDeffected(myNetworkElement);
                break;
            case "DSLAM": {
                existingTicketId = MY_Siebel_PROXY_client.isDeffected(myNetworkElement);
                if (!existingTicketId.startsWith("Defective")) {
                    NetworkElement myNetworkElementBRAS = new NetworkElement();
                    myNetworkElementBRAS.setSRType("BRAS");
                    myNetworkElementBRAS.setNasidentifier(myNetworkElement.getNasidentifier());
                    existingTicketId = MY_Siebel_PROXY_client.isDeffected(myNetworkElementBRAS);
                }
                break;
            }
            case "SLOT": {
                existingTicketId = MY_Siebel_PROXY_client.isDeffected(myNetworkElement);
                if (!existingTicketId.startsWith("Defective")) {
                    NetworkElement myNetworkElementDSLAM = new NetworkElement();
                    myNetworkElementDSLAM.setSRType("DSLAM");
                    myNetworkElementDSLAM.setNasidentifier(myNetworkElement.getNasidentifier());
                    myNetworkElementDSLAM.setDslamCode(myNetworkElement.getDslamCode());
                    existingTicketId = MY_Siebel_PROXY_client.isDeffected(myNetworkElementDSLAM);
                }
            }
        }
        if (existingTicketId != null && existingTicketId.startsWith("Defective")) {
            //Defective:1-188785059334:NTT
            return existingTicketId.split(":")[1];
        } else {
            return null;
        }
    }

    @Override
    public String isElementRecentlyDefected() throws Exception {
        return null;
    }

    public boolean managedToOpenTicket() {
        return this.getState().equals(Ticket.STATE_OPEN)
                || this.getState().equals(Ticket.STATE_CLOSED)
                || this.getState().equals(Ticket.STATE_CLOSE_FAILED)
                || this.getState().equals(Ticket.STATE_PENDING_TO_CLOSE)
                || this.getState().equals(Ticket.STATE_UPDATED);
    }

    @Override
    public void initializeSignature() {
        switch (this.getType()) {
            case "AREA":
            case "DSLAM":
            case "SLOT":
                DslmonAlarm recent_DslmonAlarm = getRecentDslmonAlarm(this.getDslamCode(), 600);
                if (recent_DslmonAlarm != null
                        && recent_DslmonAlarm.getAlertStop() != null
                        && !recent_DslmonAlarm.getAlertStop().isEmpty()) {
                    TimeStamp1 recent_DslmonAlarm_closed = new TimeStamp1(recent_DslmonAlarm.getAlertStop());
                    TimeStamp1 now = new TimeStamp1();
                    double minitesElapsed = now.hoursDiff(recent_DslmonAlarm_closed);
                    if (minitesElapsed < 90 && recent_DslmonAlarm.getTicket_sr().startsWith("1-") || recent_DslmonAlarm.getTicket_sr().startsWith("ΝTT_1")) {
                        this.setFoundOpennedSR(recent_DslmonAlarm.getTicket_sr());
                        System.out.println("CCM12:Ticket_OTE:createSiebelTicket:SIGNATURE_3-After NTT sr for " + this.getElementName() + ", getRecentDslmonAlarm:myDslam:" + recent_DslmonAlarm.getAlertOrigin() + "  " + recent_DslmonAlarm.getAlertStart() + "  " + recent_DslmonAlarm.getAlertStop());
                        this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_3));//SIGNATURE_3 = "After NTT sr"

                        this.setIncidentStartDate(recent_DslmonAlarm_closed.getNowUnformated());
                        //
                        DSLMON_KPIs_object myCCMInfo_object = new DSLMON_KPIs_object();
                        if (myCCMInfo_object.isRepeated(this.getDslamCode())) {
                            System.out.println("CCM12:Ticket_OTE:createSiebelTicket:SIGNATURE_7-Repeated problem, getRecentDslmonAlarm:myDslam:" + recent_DslmonAlarm.getAlertOrigin() + "  " + recent_DslmonAlarm.getAlertStart() + "  " + recent_DslmonAlarm.getAlertStop());
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_7));//SIGNATURE_7 = "Repeated problem"
                        }
                    } else if (minitesElapsed < 90 && recent_DslmonAlarm.getTicket_sr().startsWith("MTT_1")) {
                        this.setFoundOpennedSR(recent_DslmonAlarm.getTicket_sr());
                        this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_2));//SIGNATURE_2 = "Αfter Maintenance";
                        this.setIncidentStartDate(recent_DslmonAlarm_closed.getNowUnformated());
                        System.out.println("CCM12:Ticket_OTE:createSiebelTicket:SIGNATURE_2 -Αfter Maintenance  for " + this.getElementName() + ", getRecentDslmonAlarm:myDslam:" + recent_DslmonAlarm.getAlertOrigin() + "  " + recent_DslmonAlarm.getAlertStart() + "  " + recent_DslmonAlarm.getAlertStop());
                    }
                } else if (this.getType().equals("AREA") && this.getAlertMostSignificantReason().equals("CABLE")) {
                    this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_6));//"Probable Cable Faultm";
                    System.out.println("CCM12:Ticket_OTE:createSiebelTicket:SIGNATURE_6 -CABLE fault for " + this.getElementName() + "");
                } else {
                    this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_1));////"Unknown problem";
                    System.out.println("CCM12:Ticket_OTE:createSiebelTicket:SIGNATURE_1 -Unknown problem for " + this.getElementName() + "");
                }
                break;
            case "BRAS":
                this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_11));////"BRAS/BNG Problem";  
                System.out.println("CCM12:Ticket_OTE:createSiebelTicket:SIGNATURE_11 -BRAS/BNG Problem for " + this.getElementName() + "");
                break;
            default:
                this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_1));////"Unknown problem";
                System.out.println("CCM12:createSiebelTicket:SIGNATURE_1 -Unknown problem (as default for " + this.getElementName() + "");
                new MailAlert().sendmailAlert("CCM12:Ticket_OTE:createSiebelTicket warning: 'Default' signature SIGNATURE_1 for ", this.getElementName() + " of type " + this.getType());
                break;
        }
    }

    @Override
    public void updateSignature() {
        if (this.getLastSignature() != null) {
            try {
                String started = this.getLastSignature().getCreationTimeStamp();
                TimeStamp1 startedTimeStamp = new TimeStamp1(started);
                TimeStamp1 now = new TimeStamp1();
                int currrent_ccts = retrieveSR_CTTsNumber(this.getSR());
                this.setNumOfCCTs(currrent_ccts);
                String signatureId = this.getLastSignature().getLabel();
                switch (signatureId) {
                    case "SIGNATURE_1"://"Unknown problem";
                        if (currrent_ccts == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_9));////"Problem solved";
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (currrent_ccts >= 5 && myTicketSiebel.getSiebelParameters().getPriority().equals("MINOR"))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_1));////"Unknown problem";
                            myTicketSiebel.getSiebelParameters().setPriority("MAJOR");
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        } else if (currrent_ccts >= 1 && myTicketSiebel.getManageMODE().equals(manageMODE_NO))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_1));////"Unknown problem";
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        }
                        break;
                    case "SIGNATURE_2"://SIGNATURE_2 = "Αfter Maintenance";
                        if (currrent_ccts == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_9));////"Problem solved";
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (currrent_ccts == 1 && now.minutesDiff(startedTimeStamp) > 180) {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_5));//#5 Customer Late Reaction 
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (currrent_ccts >= 5 && myTicketSiebel.getSiebelParameters().getPriority().equals("MINOR"))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_2));////"Unknown problem";
                            myTicketSiebel.getSiebelParameters().setPriority("MAJOR");
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        } else if (currrent_ccts >= 1 && myTicketSiebel.getManageMODE().equals(manageMODE_NO))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_2));////"Unknown problem";
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        }
                        break;
                    case "SIGNATURE_3"://SIGNATURE_3 = "After NTT sr"
                        if (currrent_ccts == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_9));////"Problem solved";
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (currrent_ccts == 1 && now.minutesDiff(startedTimeStamp) > 180) {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_5));//#5 Customer Late Reaction 
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (currrent_ccts >= 5 && myTicketSiebel.getSiebelParameters().getPriority().equals("MINOR"))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_3));//SIGNATURE_3 = "After NTT sr"
                            myTicketSiebel.getSiebelParameters().setPriority("MAJOR");
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        } else if (currrent_ccts >= 1 && myTicketSiebel.getManageMODE().equals(manageMODE_NO))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_3));//SIGNATURE_3 = "After NTT sr"
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        }
                        break;
                    case "SIGNATURE_6"://SIGNATURE_6 = Probable Cable Fault 
                        if (currrent_ccts == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_9));////"Problem solved";
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                        } else if (currrent_ccts >= 5 && myTicketSiebel.getManageMODE().equals(manageMODE_NO))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_6));//SIGNATURE_6 = Probable Cable Fault 
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                        } else if (currrent_ccts >= 1 && this.getSignatureHistory().size() == 1)//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_6));//SIGNATURE_6 = Probable Cable Fault 
                            appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                        }
                        break;
                    case "SIGNATURE_7"://Repeated Problem
                        if (currrent_ccts == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_9));////"Problem solved";
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (currrent_ccts >= 5 && myTicketSiebel.getSiebelParameters().getPriority().equals("MINOR"))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_7));//Repeated Problem
                            myTicketSiebel.getSiebelParameters().setPriority("MAJOR");
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        } else if (currrent_ccts >= 1 && myTicketSiebel.getManageMODE().equals(manageMODE_NO))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_7));//Repeated Problem
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        }
                        break;
                    case "SIGNATURE_11"://"BRAS/BNG Problem";
                        if (currrent_ccts == 0 && now.minutesDiff(startedTimeStamp) > 1440) {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_9));////"Problem solved";
                            setIncidentStoppedDate(new TimeStamp1().getNowUnformated());
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                            this.setState(Ticket.STATE_PENDING_TO_CLOSE);
                        } else if (currrent_ccts >= 20 && myTicketSiebel.getSiebelParameters().getPriority().equals("MINOR"))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_11));////"BRAS/BNG Problem";
                            myTicketSiebel.getSiebelParameters().setPriority("CRITICAL");
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        } else if (currrent_ccts >= 5 && myTicketSiebel.getSiebelParameters().getPriority().equals("MINOR"))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_11));////"BRAS/BNG Problem";
                            myTicketSiebel.getSiebelParameters().setPriority("MAJOR");
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            updateManageMode();
                        } else if (currrent_ccts >= 1 && myTicketSiebel.getManageMODE().equals(manageMODE_NO))//ctts >0
                        {
                            this.setLastSignature(SignatureFactory_OTE.createSignature(Signature_OTE.SIGNATURE_11));////"BRAS/BNG Problem";
                            myTicketSiebel.setManageMODE(manageMODE_YES);
                            if (this.getSignatureHistory().size() == 2) {
                                appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
                            }
                            myTicketSiebel.setManageMODE(my_siebel_proxy_client.MY_Siebel_PROXY_client.manageMODE_YES);
                            updateManageMode();
                        }
                        break;
                }
            } catch (Exception e) {

            }
        }

    }

    public String getDslamCode() {
        switch (this.getType()) {
            case "DSLAM":
                return elementName;
            case "SLOT":
                return this.getParentElementName();
            default:
                return null;
        }
    }

    private void updateManageMode() {
        try {
            //---update manageMode
            myTicketSiebel.setManageMODE(my_siebel_proxy_client.MY_Siebel_PROXY_client.manageMODE_YES);
            my_siebel_proxy_client.MY_Siebel_PROXY_client.updateManageMode(myTicketSiebel);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("CCM12:Ticket_OTE:" + e.toString());
        }
    }

    public DslmonAlarm getRecentDslmonAlarm(String myDslam, int minutesBack) {
        try {
            if (myDslam != null) {
                String T1 = new TimeStamp1().getNowUnformated();
                TimeStamp1 T2_ = new TimeStamp1(T1);
                T2_.addMinutes(-minutesBack);
                String T2 = T2_.getNowUnformated();
                DSLMONInfo_object myDSLMONInfo_object = new DSLMONInfo_object();
                String diligent_IP = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/common/conf/parameters.properties", "diligent", "UTF8");
                String url = "http://" + diligent_IP + ":8080/DSLMON/alarmsWS_servlet?from=" + T1 + "&to=" + T2 + "&DSLAM=" + myDslam;
                ArrayList<DslmonAlarm> dslMonAlarms = myDSLMONInfo_object.getDslmonAlarms(url);
                System.out.println("CCM12:Ticket_OTE:" + url);
                DslmonAlarm lastDslmonAlarm = null;
                //--------------------
                if (dslMonAlarms.size() > 0) {
                    String stoppedLast = "20000101T101010.000";
                    for (DslmonAlarm myDslmonAlarm : dslMonAlarms) {

                        if (!myDslmonAlarm.isStilAlive() && stoppedLast.compareTo(myDslmonAlarm.getAlertStop()) < 0)//stopped later
                        {
                            stoppedLast = myDslmonAlarm.getAlertStop();
                            lastDslmonAlarm = myDslmonAlarm;
                        }
                    }
                    return lastDslmonAlarm;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            new MailAlert().sendmailAlert("getDslamDetails error:", e);
            return null;
        }
    }

    public static ArrayList findTemipAlarms(String filter) {
        ArrayList dslAlarms = new ArrayList();
        try {
            System.setProperty("http.proxyHost", "");
            System.setProperty("http.proxyPort", "");
            // ------ read cards & dslams---------------------
            TimeStamp1 afterT = new TimeStamp1();
            afterT.addHours(-48);
            String after = afterT.getNowUnformated();
            String correlator_ip = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/common/conf/parameters.properties", "correlator", "UTF8");
            ArrayList<String> myURLContext = new URLContextReader_object().getUrlContext("http://" + correlator_ip + ":8080/CORELLATION_PROJECT/alarms_TEMIP.jsp?element_name_filter=" + filter + "&format=JSON1&TemipAlarm_DSL&H24&AFTER=" + after);
            //-----------------
            Gson gson = new Gson();
            java.lang.reflect.Type my_class = new TypeToken<ArrayList<TemipAlarm>>() {
            }.getType();
            ArrayList<TemipAlarm> temipAlarms = ((ArrayList<TemipAlarm>) gson.fromJson(myURLContext.get(0), my_class));
            for (TemipAlarm myTemipAlarm : temipAlarms) {
                String elName = findFieldValue(myTemipAlarm.getAdditionalText(), "Field2").replaceAll("ONU_" + filter, "").replaceAll("ONU-" + filter, "").replaceAll(" ", "_");
                //System.out.println("DSLMON:elName=" + elName+" filter="+filter+" myTemipAlarm.getState()="+myTemipAlarm.getState());
                if (!myTemipAlarm.getState().equals("Terminated") && (elName.contains("_" + filter) && (elName.contains(filter + "_")) || elName.endsWith(filter))) {
                    //System.out.println("DSLMON:Temip Alarms (" + temipAlarms.size() + " found for dsl " + filter);
                    dslAlarms.add(myTemipAlarm);
                }
            }
        } catch (Exception e) {
            //getEventsLogArrayList().add(0, new TimeStamp1().getNowFormated() + ":" + e.getMessage());
            System.out.println("CCM12:Ticket_OTE:readTemipAlarms error:" + e.toString());
            //new MailAlert().sendmailAlert("DSLMON.TemipAlarm_DSL/CCMonitorStatsObjsContainer", e);
        }
        return dslAlarms;
    }

    private static String findFieldValue(String additionalText, String field) {
        String[] addText = additionalText.split(",");
        for (String myField : addText) {
            try {
                String header = myField.split("=")[0];
                if (header.trim().endsWith(field)) {
                    return myField.split("=")[1].trim();
                }
            } catch (Exception e) {
                return "";
            }
        }
        return "";
    }

    @Override
    public boolean closeTicket() throws Exception {
        //return closeTicket_DSL_forControl(myTicketSiebel);
        /*
        try{
        String note = "Diligent Info: Οι πελάτες έχουν σταματήσει να καλούν για παράπονα ...";
        myTicketSiebel.getNotesArrayList().add(note);
        appendSR_NOTES(myTicketSiebel, myTicketSiebel.getNotesArrayList());
        }catch(Exception e){};*/
        return this.getLastSignature().getLabel().equals(Signature_OTE.SIGNATURE_9);
    }

    @Override
    public String getSR() {
        if (myTicketSiebel != null) {
            return myTicketSiebel.getSR();
        }
        return null;
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
    public void setElementName(String elementName) {
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

    private void updateNotes() {
        try {
            //--- notes ----
            ArrayList<String> notes = this.getLastSignature().createNotesList(this.getFoundOpennedSR(), myTicketSiebel.getArea(), myTicketSiebel.getElementsList().get(0).getDslamCode(), this.getParentElementName());//String sr,String area,String dslam
            notes.stream().filter(note -> (!myTicketSiebel.getNotesArrayList().contains(note))).forEachOrdered(note -> {
                myTicketSiebel.getNotesArrayList().add(note);
            });
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("CCM12:Ticket_OTE:" + e.toString());
        }
    }

    public String getSignatureHistoryPath() {
        String path = "";
        path = signatureHistory.stream().map(s -> ";" + s).reduce(path, String::concat);
        return path;
    }

    /**
     * @return the signatureHistory
     */
    public ArrayList<String> getSignatureHistory() {
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
     * @param myTicketSiebel the myTicketSiebel to set
     */
    public void setMyTicketSiebel(TicketSiebel myTicketSiebel) {
        this.myTicketSiebel = myTicketSiebel;
    }

    @Override
    public int getCustomerImpact() {
        return (0);
    }

    /**
     * @return the signature
     */
    public Signature_OTE getLastSignature() {
        return signature;
    }

    /**
     * @param signature the signature to set
     */
    public void setLastSignature(Signature signature) {
        this.signature = (Signature_OTE) signature;
    }

    @Override
    public String toHTML() {
        String myBodyMessage = "";
        myBodyMessage += "<TABLE>";
        myBodyMessage += "<table border='1' width='100%'  bgcolor='#EBF4FA' border='1' cellpadding='5'>";
        myBodyMessage += "<tr><td>Synopsis</td><td>" + myTicketSiebel.getSynopsis() + "</td></tr>";
        myBodyMessage += "<tr><td>SR number</td><td>" + this.getSR() + "</td></tr>";
        myBodyMessage += "<tr><td>Network element</td><td>" + elementName + "</td></tr>";
        myBodyMessage += "<tr><td>Network element type</td><td>" + this.getType() + "</td></tr>";
        myBodyMessage += "<tr><td>Parent network element</td><td>" + parentElementName + "</td></tr>";
        myBodyMessage += "<tr><td>Reason for complaints</td><td>" + this.getAlertMostSignificantReason() + "</td></tr>";
        if (this.getDslamCode() != null) {
            try {
                myBodyMessage += "<tr><td>weather conditions</td><td>" + DslamDetails.weather(this.getDslamCode()) + "</td></tr>";
            } catch (Exception e) {
                e.printStackTrace();
            }
            myBodyMessage += "<tr><td>Dslam Extra Info</td><td>" + getDslamExtraInfo(this.getDslamCode()) + "</td></tr>";
        }
        myBodyMessage += "<tr><td>Μια πρώτη διάγνωση από CCM/Dili@gent/BigVoice</td><td>" + askDslmon() + "</td></tr>";
        myBodyMessage += "<tr><td>Start time</td><td>" + new TimeStamp1(this.getIncidentStartDate()).getNowFormated().substring(0, 16) + "</td></tr>";
        myBodyMessage += "<tr><td>Duration</td><td>" + (new TimeStamp1(new TimeStamp1()).minutesDiff(new TimeStamp1(this.getIncidentStartDate()))) + " minutes</td></tr>";
        myBodyMessage += "<tr><td>Previous (recent) ticket</td><td>" + foundOpennedSR + "</td></tr>";
        if (numOfCCTs > 0) {
            myBodyMessage += "<tr><td>number Of related CCTs</td><td>" + numOfCCTs + "</td></tr>";
        }
        myBodyMessage += "</TABLE>";
        //----- notes -----
        myBodyMessage += "<p><h2>Route cause:</h2>";
        myBodyMessage += "<p><TABLE>";
        for (String note : myTicketSiebel.getNotesArrayList()) {
            if (note.contains("Πιθανές αιτίες")) {
                myBodyMessage += "<tr><td>" + note + "</td>+</tr>";
            }
        }
        myBodyMessage += "<p></TABLE>";
        myBodyMessage += "<p>Visit CCM-diligent Anomaly Detectio URL @  <a href='http://172.25.37.250:8080/CCM/'>http://172.25.37.250:8080/CCM</a>";
        return myBodyMessage;
    }

    private String askDslmon() {
        String str = "";
        try {
            ArrayList<DslmonAlarm> history = getHistory(1);
            try {
                int totalDisconnections = 0;
                int aliveDisconnections = 0;
                for (DslmonAlarm dslmonAlarm : history) {
                    totalDisconnections += dslmonAlarm.getDisConnections();
                    if (dslmonAlarm.isStilAlive()) {
                        aliveDisconnections += dslmonAlarm.getDisConnections();
                    }
                }
                //------------
                for (DslmonAlarm dslmonAlarm : history) {
                    str = "'Κοπηκαν' " + totalDisconnections + " χρηστες στις " + new TimeStamp1(dslmonAlarm.getAlertStart()).getNowFormated() + ". ";
                    if (aliveDisconnections > 0) {
                        str = str + " " + aliveDisconnections + " χρηστες ειναι ακομη εκτος! ";
                    } else {
                        str = str + "Οι χρηστες εχουν επανελθει. ";
                    }
                    if (!dslmonAlarm.getTicket_sr().startsWith("#") && !dslmonAlarm.getTicket_sr().startsWith("$")) {
                        if (dslmonAlarm.getTicket_sr().startsWith("MTT")) {
                            str = str + "Εχει ανοιχτει MTT (ΜΕΤΑΓΩΓΗ):" + dslmonAlarm.getTicket_sr() + " και οι ποροι εχου βγει defective.";
                        }
                        if (dslmonAlarm.getTicket_sr().startsWith("NTT")) {
                            str = str + "Εχει ανοιχτει ΝΤΤ:" + dslmonAlarm.getTicket_sr() + " και οι ποροι εχου βγει defective.";
                        } else {
                            str = str + "Εχει ανοιχτει (από Dili@gent) ΝΤΤ:" + dslmonAlarm.getTicket_sr() + " και οι ποροι εχου βγει defective.";
                        }
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("CCM:Ticket_OTE: askDslmon error(#):" + e.toString());
            }
        } catch (Exception e) {
            System.out.println("CCM12:Ticket_OTE:askDslmon error:" + e.toString());
        }
        return str;
    }

    public ArrayList<DslmonAlarm> getHistory(int hoursBack) {
        ArrayList<DslmonAlarm> dslMonAlarms = new ArrayList();
        try {
            String myDslam = getDslamCode();
            if (myDslam != null) {
                System.setProperty("http.proxyHost", "");
                System.setProperty("http.proxyPort", "");
                DSLMONInfo_object myDSLMONInfo_object = new DSLMONInfo_object();
                String diligent_IP = Parameters.loadStringValue(System.getenv("APPLICATIONS_PATH") + "/common/conf/parameters.properties", "diligent", "UTF8");
                dslMonAlarms = myDSLMONInfo_object.getDslmonAlarms("http://" + diligent_IP + ":8080/DSLMON/alarmsWS_servlet?hoursBack=" + hoursBack + "&DSLAM=" + myDslam);
            }
        } catch (Exception e) {
            new MailAlert().sendmailAlert("getDslamDetails error:", e);
            e.printStackTrace();
        }
        return dslMonAlarms;
    }

    public static String getDslamExtraInfo(String dslam_code) {
        String info = "";
        try {
            CommonUrls myCommonUrls = new CommonUrls();
            String res = myCommonUrls.getDslamInfo(dslam_code);
            if (!res.trim().equals("{}")) {
                info = "DSLAM_CODE: " + getValueOf(res, "DSLAM_CODE") + ","
                        + "KV: " + getValueOf(res, "kv") + ","
                        + "EETT: " + getValueOf(res, "eett") + ","
                        + "Municipality: " + getValueOf(res, "municipality") + ","
                        + "Address: " + getValueOf(res, "address") + ","
                        + "TEK: " + getValueOf(res, "tek") + ","
                        + "Lat, Lon: " + getValueOf(res, "lat") + " " + getValueOf(res, "lng") + ","
                        + "Position URL: http://www.google.com/maps/place/" + getValueOf(res, "lat") + "," + getValueOf(res, "lng");
            }
        } catch (Exception e) {
        }
        return (info);
    }

    static String getValueOf(String str, String field) //..."golden2g": false,....
    {
        String value = "";
        try {
            int pos = str.indexOf("\"" + field + "\"");
            if (pos >= 0) {
                value = str.substring(pos);
                pos = value.indexOf(",");
                value = value.substring(0, pos);//"golden2g": false
                value = value.split(":")[1].replaceAll("\"", "").trim();
            }
        } catch (Exception e) {
        }
        return value;
    }

    @Override
    public Double[] getLatLon() {
        return null;
    }

    public static void main(String[] args) {
        try {
            int currrent_ccts = retrieveSR_CTTsNumber("1-189367190813");
            System.out.println("CCM12:Ticket_OTE:currrent_ccts=" + currrent_ccts);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}

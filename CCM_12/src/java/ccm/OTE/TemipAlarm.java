package ccm.OTE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import siebel.TicketSiebel;

/**
 *
 * @author nsofias
 */
public class TemipAlarm 
    {
    private boolean repeated = false;
    private int timesRepeated = 0;
    private String context;
    private String alarmOrigin;
    private String alarmType;
    private String elementType;
    private String additionalText;
    private String alarmData;
    private String NATURAL;
    private String originalEventTime;
    private String state;
    private String problemStatus;
    private String originalSeverity;
    private long identifier;
    private String creationTimestamp;
    private String closedTimestamp;
    private String alarmObjectOperatorNote = "";
    private String OC = "";
    private String OC_title = "";
    private String EETTCode = "";
    private String area = "";
    private String municipality = "UNSPECIFIED";
    private String reason = "";
    private String reasonDesc = "";
    private String ERT = "";
    private boolean ackn = false;
    private int resourceInfo = -1;
    private TicketSiebel ticketSiebel = null;
    private int foundCounter = 0;
    private String alarmSynopsis;
    private String alarmCase_identifier;
    private String coords;
    private ArrayList<String> notesArrayList = new ArrayList();
    private ArrayList<TemipAlarm> subAlarmsList = new ArrayList();
    private final StringBuffer comments = new StringBuffer();
    private String debugInfo = "";

    /**
     * @return the repeated
     */
    public boolean isRepeated()
        {
        return repeated;
        }

    /**
     * @param repeated the repeated to set
     */
    public void setRepeated(boolean repeated)
        {
        this.repeated = repeated;
        }

    /**
     * @return the timesRepeated
     */
    public int getTimesRepeated()
        {
        return timesRepeated;
        }

    /**
     * @param timesRepeated the timesRepeated to set
     */
    public void setTimesRepeated(int timesRepeated)
        {
        this.timesRepeated = timesRepeated;
        }

    /**
     * @return the context
     */
    public String getContext()
        {
        return context;
        }

    /**
     * @param context the context to set
     */
    public void setContext(String context)
        {
        this.context = context;
        }

    /**
     * @return the alarmOrigin
     */
    public String getAlarmOrigin()
        {
        return alarmOrigin;
        }

    /**
     * @param alarmOrigin the alarmOrigin to set
     */
    public void setAlarmOrigin(String alarmOrigin)
        {
        this.alarmOrigin = alarmOrigin;
        }

    /**
     * @return the alarmType
     */
    public String getAlarmType()
        {
        return alarmType;
        }

    /**
     * @param alarmType the alarmType to set
     */
    public void setAlarmType(String alarmType)
        {
        this.alarmType = alarmType;
        }

    /**
     * @return the elementType
     */
    public String getElementType()
        {
        return elementType;
        }

    /**
     * @param elementType the elementType to set
     */
    public void setElementType(String elementType)
        {
        this.elementType = elementType;
        }

    /**
     * @return the additionalText
     */
    public String getAdditionalText()
        {
        return additionalText;
        }

    /**
     * @param additionalText the additionalText to set
     */
    public void setAdditionalText(String additionalText)
        {
        this.additionalText = additionalText;
        }

    /**
     * @return the alarmData
     */
    public String getAlarmData()
        {
        return alarmData;
        }

    /**
     * @param alarmData the alarmData to set
     */
    public void setAlarmData(String alarmData)
        {
        this.alarmData = alarmData;
        }

    /**
     * @return the NATURAL
     */
    public String getNATURAL()
        {
        return NATURAL;
        }

    /**
     * @param NATURAL the NATURAL to set
     */
    public void setNATURAL(String NATURAL)
        {
        this.NATURAL = NATURAL;
        }

    /**
     * @return the originalEventTime
     */
    public String getOriginalEventTime()
        {
        return originalEventTime;
        }

    /**
     * @param originalEventTime the originalEventTime to set
     */
    public void setOriginalEventTime(String originalEventTime)
        {
        this.originalEventTime = originalEventTime;
        }

    /**
     * @return the state
     */
    public String getState()
        {
        return state;
        }

    /**
     * @param state the state to set
     */
    public void setState(String state)
        {
        this.state = state;
        }

    /**
     * @return the problemStatus
     */
    public String getProblemStatus()
        {
        return problemStatus;
        }

    /**
     * @param problemStatus the problemStatus to set
     */
    public void setProblemStatus(String problemStatus)
        {
        this.problemStatus = problemStatus;
        }

    /**
     * @return the originalSeverity
     */
    public String getOriginalSeverity()
        {
        return originalSeverity;
        }

    /**
     * @param originalSeverity the originalSeverity to set
     */
    public void setOriginalSeverity(String originalSeverity)
        {
        this.originalSeverity = originalSeverity;
        }

    /**
     * @return the identifier
     */
    public long getIdentifier()
        {
        return identifier;
        }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(long identifier)
        {
        this.identifier = identifier;
        }

    /**
     * @return the creationTimestamp
     */
    public String getCreationTimestamp()
        {
        return creationTimestamp;
        }

    /**
     * @param creationTimestamp the creationTimestamp to set
     */
    public void setCreationTimestamp(String creationTimestamp)
        {
        this.creationTimestamp = creationTimestamp;
        }

    /**
     * @return the closedTimestamp
     */
    public String getClosedTimestamp()
        {
        return closedTimestamp;
        }

    /**
     * @param closedTimestamp the closedTimestamp to set
     */
    public void setClosedTimestamp(String closedTimestamp)
        {
        this.closedTimestamp = closedTimestamp;
        }

    /**
     * @return the alarmObjectOperatorNote
     */
    public String getAlarmObjectOperatorNote()
        {
        return alarmObjectOperatorNote;
        }

    /**
     * @param alarmObjectOperatorNote the alarmObjectOperatorNote to set
     */
    public void setAlarmObjectOperatorNote(String alarmObjectOperatorNote)
        {
        this.alarmObjectOperatorNote = alarmObjectOperatorNote;
        }

    /**
     * @return the OC
     */
    public String getOC()
        {
        return OC;
        }

    /**
     * @param OC the OC to set
     */
    public void setOC(String OC)
        {
        this.OC = OC;
        }

    /**
     * @return the OC_title
     */
    public String getOC_title()
        {
        return OC_title;
        }

    /**
     * @param OC_title the OC_title to set
     */
    public void setOC_title(String OC_title)
        {
        this.OC_title = OC_title;
        }

    /**
     * @return the EETTCode
     */
    public String getEETTCode()
        {
        return EETTCode;
        }

    /**
     * @param EETTCode the EETTCode to set
     */
    public void setEETTCode(String EETTCode)
        {
        this.EETTCode = EETTCode;
        }

    /**
     * @return the area
     */
    public String getArea()
        {
        return area;
        }

    /**
     * @param area the area to set
     */
    public void setArea(String area)
        {
        this.area = area;
        }

    /**
     * @return the municipality
     */
    public String getMunicipality()
        {
        return municipality;
        }

    /**
     * @param municipality the municipality to set
     */
    public void setMunicipality(String municipality)
        {
        this.municipality = municipality;
        }

    /**
     * @return the reason
     */
    public String getReason()
        {
        return reason;
        }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason)
        {
        this.reason = reason;
        }

    /**
     * @return the reasonDesc
     */
    public String getReasonDesc()
        {
        return reasonDesc;
        }

    /**
     * @param reasonDesc the reasonDesc to set
     */
    public void setReasonDesc(String reasonDesc)
        {
        this.reasonDesc = reasonDesc;
        }

    /**
     * @return the ERT
     */
    public String getERT()
        {
        return ERT;
        }

    /**
     * @param ERT the ERT to set
     */
    public void setERT(String ERT)
        {
        this.ERT = ERT;
        }

    /**
     * @return the ackn
     */
    public boolean isAckn()
        {
        return ackn;
        }

    /**
     * @param ackn the ackn to set
     */
    public void setAckn(boolean ackn)
        {
        this.ackn = ackn;
        }

    /**
     * @return the resourceInfo
     */
    public int getResourceInfo()
        {
        return resourceInfo;
        }

    /**
     * @param resourceInfo the resourceInfo to set
     */
    public void setResourceInfo(int resourceInfo)
        {
        this.resourceInfo = resourceInfo;
        }

    /**
     * @return the ticketSiebel
     */
    public TicketSiebel getTicketSiebel()
        {
        return ticketSiebel;
        }

    /**
     * @param ticketSiebel the ticketSiebel to set
     */
    public void setTicketSiebel(TicketSiebel ticketSiebel)
        {
        this.ticketSiebel = ticketSiebel;
        }

    /**
     * @return the foundCounter
     */
    public int getFoundCounter()
        {
        return foundCounter;
        }

    /**
     * @param foundCounter the foundCounter to set
     */
    public void setFoundCounter(int foundCounter)
        {
        this.foundCounter = foundCounter;
        }

    /**
     * @return the alarmSynopsis
     */
    public String getAlarmSynopsis()
        {
        return alarmSynopsis;
        }

    /**
     * @param alarmSynopsis the alarmSynopsis to set
     */
    public void setAlarmSynopsis(String alarmSynopsis)
        {
        this.alarmSynopsis = alarmSynopsis;
        }

    /**
     * @return the alarmCase_identifier
     */
    public String getAlarmCase_identifier()
        {
        return alarmCase_identifier;
        }

    /**
     * @param alarmCase_identifier the alarmCase_identifier to set
     */
    public void setAlarmCase_identifier(String alarmCase_identifier)
        {
        this.alarmCase_identifier = alarmCase_identifier;
        }

    /**
     * @return the coords
     */
    public String getCoords()
        {
        return coords;
        }

    /**
     * @param coords the coords to set
     */
    public void setCoords(String coords)
        {
        this.coords = coords;
        }

    /**
     * @return the notesArrayList
     */
    public ArrayList<String> getNotesArrayList()
        {
        return notesArrayList;
        }

    /**
     * @param notesArrayList the notesArrayList to set
     */
    public void setNotesArrayList(ArrayList<String> notesArrayList)
        {
        this.notesArrayList = notesArrayList;
        }

    /**
     * @return the subAlarmsList
     */
    public ArrayList<TemipAlarm> getSubAlarmsList()
        {
        return subAlarmsList;
        }

    /**
     * @param subAlarmsList the subAlarmsList to set
     */
    public void setSubAlarmsList(ArrayList<TemipAlarm> subAlarmsList)
        {
        this.subAlarmsList = subAlarmsList;
        }

    /**
     * @return the comments
     */
    public StringBuffer getComments()
        {
        return comments;
        }

    /**
     * @return the debugInfo
     */
    public String getDebugInfo()
        {
        return debugInfo;
        }

    /**
     * @param debugInfo the debugInfo to set
     */
    public void setDebugInfo(String debugInfo)
        {
        this.debugInfo = debugInfo;
        }
    }

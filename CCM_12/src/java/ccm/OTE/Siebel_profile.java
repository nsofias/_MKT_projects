package ccm.OTE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nsofias
 */
public class Siebel_profile
    {
    private String removeNE_header_CauseofFailureA = "Τροφοδοσία / Κλιματισμός";
    private String removeNE_header_CauseofFailureB = "ΔΙΑΚΟΠΗ ΔΕΗ";
    private String removeNE_header_TTSolution = "Ενέργεια τρίτου / ΔΕΗ";
    private String removeNE_header_TicketRootCause = "Υπαιτιότητα τρίτου";
    private String removeNE_header_TechnicalDepartment = "NMC-DATA/IP";
    private String removeNE_element_Position = "DSLAM";
    private String removeNE_element_Cause = "ΔΙΑΚΟΠΗ ΤΡΟΦΟΔΟΣΙΑΣ/LINK FLAP/SOFT REBOOT";
    private String removeNE_element_Solution = "ΕΠΑΝΑΦΟΡΑ ΤΡΟΦΟΔΟΣΙΑΣ/LINK UP/SOFTWARE UP";

    private String createSR_header_Inventory = "OBJECTEL";
    private String createSR_header_ReportedBy = "CCM-DILIGENT";
    private String createSR_header_SRType = "NTT";
    private String createSR_header_Group = "NMC-DATA/IP";

    private String createSR_header_Priority = "MINOR";

    private String createSR_element_Status = "Defective";
    private String createSR_wfmType = "ΒΛΑΒΗ DSLAM/MSAN";
    private boolean createSR_serviceAffecting = true;
    private String createSR_synopsis = "";
    private String createSR_notes = "";
    private String createSR_ActivityStatus = "";
    private String createSR_ActivityType = "";
    private String createSR_sActivityId = "";
    //
    private String createSR_header_BRAS_Category = "METRO ETHERNET";
    private String createSR_header_BRAS_EquipmentType = "METRO ETHERNET";
    private String createSR_header_BRAS_TTSymptom = "ΠΡΟΒΛΗΜΑ ΣΕ ΕΦΕΔΡΙΚΟ ΣΥΣΤΗΜΑ (ΚΟΜΒΟΣ,ΚΑΡΤΑ,LINK,ΤΡΟΦΟΔΟΤΙΚΟ,FAN)";
    //
    private String createSR_header_Category = "ΠΡΟΣΒΑΣΗ";
    private String createSR_header_EquipmentType = "DSLAM-MSAN";
    private String createSR_header_TTSymptom = "ΆΛΛΟ ΣΥΜΠΤΩΜΑ";

    /**
     * @return the createSR_serviceAffecting
     */
    public boolean isCreateSR_serviceAffecting()
        {
        return createSR_serviceAffecting;
        }

    /**
     * @param createSR_serviceAffecting the createSR_serviceAffecting to set
     */
    public void setCreateSR_serviceAffecting(boolean createSR_serviceAffecting)
        {
        this.createSR_serviceAffecting = createSR_serviceAffecting;
        }

    /**
     * @return the removeNE_header_CauseofFailureA
     */
    public String getRemoveNE_header_CauseofFailureA()
        {
        return removeNE_header_CauseofFailureA;
        }

    /**
     * @param removeNE_header_CauseofFailureA the
     * removeNE_header_CauseofFailureA to set
     */
    public void setRemoveNE_header_CauseofFailureA(String removeNE_header_CauseofFailureA)
        {
        this.removeNE_header_CauseofFailureA = removeNE_header_CauseofFailureA;
        }

    /**
     * @return the removeNE_header_CauseofFailureB
     */
    public String getRemoveNE_header_CauseofFailureB()
        {
        return removeNE_header_CauseofFailureB;
        }

    /**
     * @param removeNE_header_CauseofFailureB the
     * removeNE_header_CauseofFailureB to set
     */
    public void setRemoveNE_header_CauseofFailureB(String removeNE_header_CauseofFailureB)
        {
        this.removeNE_header_CauseofFailureB = removeNE_header_CauseofFailureB;
        }

    /**
     * @return the removeNE_header_TTSolution
     */
    public String getRemoveNE_header_TTSolution()
        {
        return removeNE_header_TTSolution;
        }

    /**
     * @param removeNE_header_TTSolution the removeNE_header_TTSolution to set
     */
    public void setRemoveNE_header_TTSolution(String removeNE_header_TTSolution)
        {
        this.removeNE_header_TTSolution = removeNE_header_TTSolution;
        }

    /**
     * @return the removeNE_header_TicketRootCause
     */
    public String getRemoveNE_header_TicketRootCause()
        {
        return removeNE_header_TicketRootCause;
        }

    /**
     * @param removeNE_header_TicketRootCause the
     * removeNE_header_TicketRootCause to set
     */
    public void setRemoveNE_header_TicketRootCause(String removeNE_header_TicketRootCause)
        {
        this.removeNE_header_TicketRootCause = removeNE_header_TicketRootCause;
        }

    /**
     * @return the removeNE_header_TechnicalDepartment
     */
    public String getRemoveNE_header_TechnicalDepartment()
        {
        return removeNE_header_TechnicalDepartment;
        }

    /**
     * @param removeNE_header_TechnicalDepartment the
     * removeNE_header_TechnicalDepartment to set
     */
    public void setRemoveNE_header_TechnicalDepartment(String removeNE_header_TechnicalDepartment)
        {
        this.removeNE_header_TechnicalDepartment = removeNE_header_TechnicalDepartment;
        }

    /**
     * @return the removeNE_element_Position
     */
    public String getRemoveNE_element_Position()
        {
        return removeNE_element_Position;
        }

    /**
     * @param removeNE_element_Position the removeNE_element_Position to set
     */
    public void setRemoveNE_element_Position(String removeNE_element_Position)
        {
        this.removeNE_element_Position = removeNE_element_Position;
        }

    /**
     * @return the removeNE_element_Cause
     */
    public String getRemoveNE_element_Cause()
        {
        return removeNE_element_Cause;
        }

    /**
     * @param removeNE_element_Cause the removeNE_element_Cause to set
     */
    public void setRemoveNE_element_Cause(String removeNE_element_Cause)
        {
        this.removeNE_element_Cause = removeNE_element_Cause;
        }

    /**
     * @return the removeNE_element_Solution
     */
    public String getRemoveNE_element_Solution()
        {
        return removeNE_element_Solution;
        }

    /**
     * @param removeNE_element_Solution the removeNE_element_Solution to set
     */
    public void setRemoveNE_element_Solution(String removeNE_element_Solution)
        {
        this.removeNE_element_Solution = removeNE_element_Solution;
        }

    /**
     * @return the createSR_header_Inventory
     */
    public String getCreateSR_header_Inventory()
        {
        return createSR_header_Inventory;
        }

    /**
     * @param createSR_header_Inventory the createSR_header_Inventory to set
     */
    public void setCreateSR_header_Inventory(String createSR_header_Inventory)
        {
        this.createSR_header_Inventory = createSR_header_Inventory;
        }

    /**
     * @return the createSR_header_ReportedBy
     */
    public String getCreateSR_header_ReportedBy()
        {
        return createSR_header_ReportedBy;
        }

    /**
     * @param createSR_header_ReportedBy the createSR_header_ReportedBy to set
     */
    public void setCreateSR_header_ReportedBy(String createSR_header_ReportedBy)
        {
        this.createSR_header_ReportedBy = createSR_header_ReportedBy;
        }

    /**
     * @return the createSR_header_SRType
     */
    public String getCreateSR_header_SRType()
        {
        return createSR_header_SRType;
        }

    /**
     * @param createSR_header_SRType the createSR_header_SRType to set
     */
    public void setCreateSR_header_SRType(String createSR_header_SRType)
        {
        this.createSR_header_SRType = createSR_header_SRType;
        }

    /**
     * @return the createSR_header_TTSymptom
     */
    public String getCreateSR_header_TTSymptom()
        {
        return createSR_header_TTSymptom;
        }

    /**
     * @param createSR_header_TTSymptom the createSR_header_TTSymptom to set
     */
    public void setCreateSR_header_TTSymptom(String createSR_header_TTSymptom)
        {
        this.createSR_header_TTSymptom = createSR_header_TTSymptom;
        }

    /**
     * @return the createSR_header_Group
     */
    public String getCreateSR_header_Group()
        {
        return createSR_header_Group;
        }

    /**
     * @param createSR_header_Group the createSR_header_Group to set
     */
    public void setCreateSR_header_Group(String createSR_header_Group)
        {
        this.createSR_header_Group = createSR_header_Group;
        }

    /**
     * @return the createSR_header_Priority
     */
    public String getCreateSR_header_Priority()
        {
        return createSR_header_Priority;
        }

    /**
     * @param createSR_header_Priority the createSR_header_Priority to set
     */
    public void setCreateSR_header_Priority(String createSR_header_Priority)
        {
        this.createSR_header_Priority = createSR_header_Priority;
        }

    /**
     * @return the createSR_header_Category
     */
    public String getCreateSR_header_Category()
        {
        return createSR_header_Category;
        }

    /**
     * @param createSR_header_Category the createSR_header_Category to set
     */
    public void setCreateSR_header_Category(String createSR_header_Category)
        {
        this.createSR_header_Category = createSR_header_Category;
        }

    /**
     * @return the createSR_header_EquipmentType
     */
    public String getCreateSR_header_EquipmentType()
        {
        return createSR_header_EquipmentType;
        }

    /**
     * @param createSR_header_EquipmentType the createSR_header_EquipmentType to
     * set
     */
    public void setCreateSR_header_EquipmentType(String createSR_header_EquipmentType)
        {
        this.createSR_header_EquipmentType = createSR_header_EquipmentType;
        }

    /**
     * @return the createSR_element_Status
     */
    public String getCreateSR_element_Status()
        {
        return createSR_element_Status;
        }

    /**
     * @param createSR_element_Status the createSR_element_Status to set
     */
    public void setCreateSR_element_Status(String createSR_element_Status)
        {
        this.createSR_element_Status = createSR_element_Status;
        }

    /**
     * @return the createSR_wfmType
     */
    public String getCreateSR_wfmType()
        {
        return createSR_wfmType;
        }

    /**
     * @param createSR_wfmType the createSR_wfmType to set
     */
    public void setCreateSR_wfmType(String createSR_wfmType)
        {
        this.createSR_wfmType = createSR_wfmType;
        }

    /**
     * @return the createSR_synopsis
     */
    public String getCreateSR_synopsis()
        {
        return createSR_synopsis;
        }

    /**
     * @param createSR_synopsis the createSR_synopsis to set
     */
    public void setCreateSR_synopsis(String createSR_synopsis)
        {
        this.createSR_synopsis = createSR_synopsis;
        }

    /**
     * @return the createSR_notes
     */
    public String getCreateSR_notes()
        {
        return createSR_notes;
        }

    /**
     * @param createSR_notes the createSR_notes to set
     */
    public void setCreateSR_notes(String createSR_notes)
        {
        this.createSR_notes = createSR_notes;
        }

    /**
     * @return the createSR_ActivityStatus
     */
    public String getCreateSR_ActivityStatus()
        {
        return createSR_ActivityStatus;
        }

    /**
     * @param createSR_ActivityStatus the createSR_ActivityStatus to set
     */
    public void setCreateSR_ActivityStatus(String createSR_ActivityStatus)
        {
        this.createSR_ActivityStatus = createSR_ActivityStatus;
        }

    /**
     * @return the createSR_ActivityType
     */
    public String getCreateSR_ActivityType()
        {
        return createSR_ActivityType;
        }

    /**
     * @param createSR_ActivityType the createSR_ActivityType to set
     */
    public void setCreateSR_ActivityType(String createSR_ActivityType)
        {
        this.createSR_ActivityType = createSR_ActivityType;
        }

    /**
     * @return the createSR_sActivityId
     */
    public String getCreateSR_sActivityId()
        {
        return createSR_sActivityId;
        }

    /**
     * @param createSR_sActivityId the createSR_sActivityId to set
     */
    public void setCreateSR_sActivityId(String createSR_sActivityId)
        {
        this.createSR_sActivityId = createSR_sActivityId;
        }
    

    /**
     * @return the createSR_header_BRAS_Category
     */
    public String getCreateSR_header_BRAS_Category()
        {
        return createSR_header_BRAS_Category;
        }

    /**
     * @param createSR_header_BRAS_Category the createSR_header_BRAS_Category to set
     */
    public void setCreateSR_header_BRAS_Category(String createSR_header_BRAS_Category)
        {
        this.createSR_header_BRAS_Category = createSR_header_BRAS_Category;
        }

    /**
     * @return the createSR_header_BRAS_EquipmentType
     */
    public String getCreateSR_header_BRAS_EquipmentType()
        {
        return createSR_header_BRAS_EquipmentType;
        }

    /**
     * @param createSR_header_BRAS_EquipmentType the createSR_header_BRAS_EquipmentType to set
     */
    public void setCreateSR_header_BRAS_EquipmentType(String createSR_header_BRAS_EquipmentType)
        {
        this.createSR_header_BRAS_EquipmentType = createSR_header_BRAS_EquipmentType;
        }

    /**
     * @return the createSR_header_BRAS_TTSymptom
     */
    public String getCreateSR_header_BRAS_TTSymptom()
        {
        return createSR_header_BRAS_TTSymptom;
        }

    /**
     * @param createSR_header_BRAS_TTSymptom the createSR_header_BRAS_TTSymptom to set
     */
    public void setCreateSR_header_BRAS_TTSymptom(String createSR_header_BRAS_TTSymptom)
        {
        this.createSR_header_BRAS_TTSymptom = createSR_header_BRAS_TTSymptom;
        }
    
    }

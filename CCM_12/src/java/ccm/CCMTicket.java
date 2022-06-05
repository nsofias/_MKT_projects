/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

/**
 *
 * @author nsofias
 */
public interface CCMTicket {

    public String openTicket() throws Exception;

    public boolean closeTicket() throws Exception;

    public String getSR();

    public String getTicketId();

    public void setTicketId(String id);

    public String getElementName();

    public void setElementName(String myElementName);

    public String getParentElementName();

    public void setParentElementName(String parentElementName);

    public String getState();

    public String getType();

    public void setType(String type);

    public void setState(String state);

    public void initializeSignature();

    public void updateSignature();

    public String getIncidentStartDate();

    public void setIncidentStartDate(String incidentStartDate);

    public String getIncidentReportedDate();

    public void setIncidentReportedDate(String incidentReportedDate);

    public String getIncidentStoppedDate();

    public void setIncidentStoppedDate(String incidentStoppedDate);

    public String getEstimatedResolutionDate();

    public void setEstimatedResolutionDate(String estimatedResolutionDate);

    public String getFoundOpennedSR();

    public void setFoundOpennedSR(String foundOpennedSR);

    public int getInitialNumOfCCTs();

    public void setInitialNumOfCCTs(int initialNumOfCCTs);

    public int getNumOfCCTs();

    public void setNumOfCCTs(int numOfCCTs);

    public void setNumOfCalls(int calls);

    public int getNumOfCalls();

    public Signature getLastSignature();

    public String getAlertMostSignificantReason();

    public void setAlertMostSignificantReason(String alertMostSignificantReason);

    public String getComments();

    public void setComments(String comments);

    public String isElementAlreadyDefected() throws Exception;

    public String isElementRecentlyDefected() throws Exception;

    public void setSR(String SR);

    public String toHTML();

    public boolean managedToOpenTicket();

    public int getInitialNumOfCalls();

    public void setInitialNumOfCalls(int initialNumOfCalls);

    public int getCustomerImpact();

    public boolean isAllowedToOpen(String myType, int affectedCustomers, int totalCalls);

    public int findNumberOfAffectedCustomers();
}

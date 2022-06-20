
package crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReleaseAffectedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseAffectedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GroupingTicketIncidentID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AffectedMainProductsbyLineID" type="{http://crm.it.telekom.mk/diligent/datatypes/queryDiligentIncident}MainProductsbyLineID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseAffectedType", namespace = "http://crm.it.telekom.mk/diligent/datatypes/queryDiligentIncident", propOrder = {
    "transactionID",
    "groupingTicketIncidentID",
    "affectedMainProductsbyLineID"
})
public class ReleaseAffectedType {

    @XmlElement(name = "TransactionID")
    protected int transactionID;
    @XmlElement(name = "GroupingTicketIncidentID")
    protected int groupingTicketIncidentID;
    @XmlElement(name = "AffectedMainProductsbyLineID", required = true)
    protected MainProductsbyLineID affectedMainProductsbyLineID;

    /**
     * Gets the value of the transactionID property.
     * 
     */
    public int getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     */
    public void setTransactionID(int value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the groupingTicketIncidentID property.
     * 
     */
    public int getGroupingTicketIncidentID() {
        return groupingTicketIncidentID;
    }

    /**
     * Sets the value of the groupingTicketIncidentID property.
     * 
     */
    public void setGroupingTicketIncidentID(int value) {
        this.groupingTicketIncidentID = value;
    }

    /**
     * Gets the value of the affectedMainProductsbyLineID property.
     * 
     * @return
     *     possible object is
     *     {@link MainProductsbyLineID }
     *     
     */
    public MainProductsbyLineID getAffectedMainProductsbyLineID() {
        return affectedMainProductsbyLineID;
    }

    /**
     * Sets the value of the affectedMainProductsbyLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainProductsbyLineID }
     *     
     */
    public void setAffectedMainProductsbyLineID(MainProductsbyLineID value) {
        this.affectedMainProductsbyLineID = value;
    }

}

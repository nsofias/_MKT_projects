
package SVT_MKT_ws1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MarkAffectedType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MarkAffectedType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="GroupingTicketIncidentID" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="AffectedMainProductsbyLineID" type="{http://crm.it.telekom.mk/diligent/datatypes/queryDiligentIncident}MainProductsbyLineID"/&amp;gt;
 *         &amp;lt;element name="DefectiveType" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkAffectedType", namespace = "http://crm.it.telekom.mk/diligent/datatypes/queryDiligentIncident", propOrder = {
    "transactionID",
    "groupingTicketIncidentID",
    "affectedMainProductsbyLineID",
    "defectiveType",
    "description"
})
public class MarkAffectedType {

    @XmlElement(name = "TransactionID")
    protected int transactionID;
    @XmlElement(name = "GroupingTicketIncidentID")
    protected int groupingTicketIncidentID;
    @XmlElement(name = "AffectedMainProductsbyLineID", required = true)
    protected MainProductsbyLineID affectedMainProductsbyLineID;
    @XmlElement(name = "DefectiveType", required = true)
    protected String defectiveType;
    @XmlElement(name = "Description", required = true)
    protected String description;

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

    /**
     * Gets the value of the defectiveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefectiveType() {
        return defectiveType;
    }

    /**
     * Sets the value of the defectiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefectiveType(String value) {
        this.defectiveType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}

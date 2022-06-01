
package svt_mkt_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateCustomerIssueResponseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateCustomerIssueResponseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerIssueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incidentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validationModel" type="{http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/}ValidationModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCustomerIssueResponseData", namespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/", propOrder = {
    "customerIssueId",
    "incidentId",
    "validationModel"
})
public class UpdateCustomerIssueResponseData {

    @XmlElement(namespace = "")
    protected String customerIssueId;
    @XmlElement(namespace = "")
    protected String incidentId;
    @XmlElement(namespace = "")
    protected ValidationModel validationModel;

    /**
     * Gets the value of the customerIssueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIssueId() {
        return customerIssueId;
    }

    /**
     * Sets the value of the customerIssueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIssueId(String value) {
        this.customerIssueId = value;
    }

    /**
     * Gets the value of the incidentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentId() {
        return incidentId;
    }

    /**
     * Sets the value of the incidentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentId(String value) {
        this.incidentId = value;
    }

    /**
     * Gets the value of the validationModel property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationModel }
     *     
     */
    public ValidationModel getValidationModel() {
        return validationModel;
    }

    /**
     * Sets the value of the validationModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationModel }
     *     
     */
    public void setValidationModel(ValidationModel value) {
        this.validationModel = value;
    }

}

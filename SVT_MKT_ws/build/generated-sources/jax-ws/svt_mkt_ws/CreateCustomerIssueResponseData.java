
package svt_mkt_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for createCustomerIssueResponseData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="createCustomerIssueResponseData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="customerIssueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="incidentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="validationModel" type="{http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/}ValidationModel" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCustomerIssueResponseData", namespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/", propOrder = {
    "customerIssueId",
    "incidentId",
    "validationModel"
})
public class CreateCustomerIssueResponseData {

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


package svt_mkt_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCustomerIssueRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCustomerIssueRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerIssueModel" type="{http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/}customerIssueModel"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCustomerIssueRequestData", namespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/", propOrder = {
    "customerIssueModel"
})
public class CreateCustomerIssueRequestData {

    @XmlElement(namespace = "", required = true)
    protected CustomerIssueModel customerIssueModel;

    /**
     * Gets the value of the customerIssueModel property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIssueModel }
     *     
     */
    public CustomerIssueModel getCustomerIssueModel() {
        return customerIssueModel;
    }

    /**
     * Sets the value of the customerIssueModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIssueModel }
     *     
     */
    public void setCustomerIssueModel(CustomerIssueModel value) {
        this.customerIssueModel = value;
    }

}

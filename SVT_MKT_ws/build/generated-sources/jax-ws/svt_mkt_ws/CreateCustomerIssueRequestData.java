
package svt_mkt_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for createCustomerIssueRequestData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="createCustomerIssueRequestData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="customerIssueModel" type="{http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/}customerIssueModel"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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

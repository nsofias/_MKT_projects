
package svt_mkt_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="eiMessageContext" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageContext2"/&amp;gt;
 *         &amp;lt;element name="createCustomerIssueResponseData" type="{http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/}createCustomerIssueResponseData"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eiMessageContext",
    "createCustomerIssueResponseData"
})
@XmlRootElement(name = "createCustomerIssueResponse", namespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/")
public class CreateCustomerIssueResponse {

    @XmlElement(namespace = "", required = true)
    protected EIMessageContext2 eiMessageContext;
    @XmlElement(namespace = "", required = true)
    protected CreateCustomerIssueResponseData createCustomerIssueResponseData;

    /**
     * Gets the value of the eiMessageContext property.
     * 
     * @return
     *     possible object is
     *     {@link EIMessageContext2 }
     *     
     */
    public EIMessageContext2 getEiMessageContext() {
        return eiMessageContext;
    }

    /**
     * Sets the value of the eiMessageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIMessageContext2 }
     *     
     */
    public void setEiMessageContext(EIMessageContext2 value) {
        this.eiMessageContext = value;
    }

    /**
     * Gets the value of the createCustomerIssueResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCustomerIssueResponseData }
     *     
     */
    public CreateCustomerIssueResponseData getCreateCustomerIssueResponseData() {
        return createCustomerIssueResponseData;
    }

    /**
     * Sets the value of the createCustomerIssueResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCustomerIssueResponseData }
     *     
     */
    public void setCreateCustomerIssueResponseData(CreateCustomerIssueResponseData value) {
        this.createCustomerIssueResponseData = value;
    }

}

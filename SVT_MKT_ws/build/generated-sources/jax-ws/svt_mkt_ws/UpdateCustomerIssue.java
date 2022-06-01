
package svt_mkt_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eiMessageContext" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageContext2"/&gt;
 *         &lt;element name="updateCustomerIssueRequestData" type="{http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/}updateCustomerIssueRequestData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eiMessageContext",
    "updateCustomerIssueRequestData"
})
@XmlRootElement(name = "updateCustomerIssue", namespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/")
public class UpdateCustomerIssue {

    @XmlElement(namespace = "", required = true)
    protected EIMessageContext2 eiMessageContext;
    @XmlElement(namespace = "", required = true)
    protected UpdateCustomerIssueRequestData updateCustomerIssueRequestData;

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
     * Gets the value of the updateCustomerIssueRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCustomerIssueRequestData }
     *     
     */
    public UpdateCustomerIssueRequestData getUpdateCustomerIssueRequestData() {
        return updateCustomerIssueRequestData;
    }

    /**
     * Sets the value of the updateCustomerIssueRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCustomerIssueRequestData }
     *     
     */
    public void setUpdateCustomerIssueRequestData(UpdateCustomerIssueRequestData value) {
        this.updateCustomerIssueRequestData = value;
    }

}

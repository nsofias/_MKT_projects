
package crm;

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
 *         &amp;lt;element name="data" type="{http://crm.it.telekom.mk/diligent/datatypes/queryDiligentIncident}HasCustomerGroupFaultType"/&amp;gt;
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
    "data"
})
@XmlRootElement(name = "HasCustomerGroupFault", namespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident")
public class HasCustomerGroupFault {

    @XmlElement(namespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", required = true)
    protected EIMessageContext2 eiMessageContext;
    @XmlElement(namespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", required = true)
    protected HasCustomerGroupFaultType data;

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
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link HasCustomerGroupFaultType }
     *     
     */
    public HasCustomerGroupFaultType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link HasCustomerGroupFaultType }
     *     
     */
    public void setData(HasCustomerGroupFaultType value) {
        this.data = value;
    }

}

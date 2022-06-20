
package mk.telekom.it.crm.diligent.services.querydiligentincidentresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import mk.telekom.it.crm.diligent.datatypes.querydiligentincidentresponse.MarkAffectedAsyncResponse;
import net.tmobile.ei.messaging.datatypes.EIMessageContext2;


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
 *         &lt;element name="data" type="{http://crm.it.telekom.mk/diligent/datatypes/queryDiligentIncidentResponse}MarkAffectedAsyncResponse"/&gt;
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
    "data"
})
@XmlRootElement(name = "MarkAffectedResponse")
public class MarkAffectedResponse {

    @XmlElement(required = true)
    protected EIMessageContext2 eiMessageContext;
    @XmlElement(required = true)
    protected MarkAffectedAsyncResponse data;

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
     *     {@link MarkAffectedAsyncResponse }
     *     
     */
    public MarkAffectedAsyncResponse getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkAffectedAsyncResponse }
     *     
     */
    public void setData(MarkAffectedAsyncResponse value) {
        this.data = value;
    }

}

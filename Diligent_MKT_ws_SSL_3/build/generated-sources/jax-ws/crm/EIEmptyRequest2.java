
package crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EIEmptyRequest2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EIEmptyRequest2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eiMessageContext" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageContext2"/&gt;
 *         &lt;element name="data" type="{http://messaging.ei.tmobile.net/datatypes}EIEmpty"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIEmptyRequest2", propOrder = {
    "eiMessageContext",
    "data"
})
public class EIEmptyRequest2 {

    @XmlElement(required = true)
    protected EIMessageContext2 eiMessageContext;
    @XmlElement(required = true)
    protected EIEmpty data;

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
     *     {@link EIEmpty }
     *     
     */
    public EIEmpty getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIEmpty }
     *     
     */
    public void setData(EIEmpty value) {
        this.data = value;
    }

}

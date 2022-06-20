
package ibm_query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INCIDENTKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INCIDENTKeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainType"/&gt;
 *         &lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCIDENTKeyType", propOrder = {
    "_class",
    "ticketid"
})
public class INCIDENTKeyType {

    @XmlElement(name = "CLASS", required = true)
    protected MXDomainType _class;
    @XmlElement(name = "TICKETID", required = true)
    protected MXStringType ticketid;

    /**
     * Gets the value of the class property.
     * 
     * @return
     *     possible object is
     *     {@link MXDomainType }
     *     
     */
    public MXDomainType getCLASS() {
        return _class;
    }

    /**
     * Sets the value of the class property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXDomainType }
     *     
     */
    public void setCLASS(MXDomainType value) {
        this._class = value;
    }

    /**
     * Gets the value of the ticketid property.
     * 
     * @return
     *     possible object is
     *     {@link MXStringType }
     *     
     */
    public MXStringType getTICKETID() {
        return ticketid;
    }

    /**
     * Sets the value of the ticketid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXStringType }
     *     
     */
    public void setTICKETID(MXStringType value) {
        this.ticketid = value;
    }

}

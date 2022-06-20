
package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for INCIDENTMboKeyType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="INCIDENTMboKeyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="INCIDENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}INCIDENTKeyType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCIDENTMboKeyType", propOrder = {
    "incident"
})
public class INCIDENTMboKeyType {

    @XmlElement(name = "INCIDENT")
    protected INCIDENTKeyType incident;

    /**
     * Gets the value of the incident property.
     * 
     * @return
     *     possible object is
     *     {@link INCIDENTKeyType }
     *     
     */
    public INCIDENTKeyType getINCIDENT() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link INCIDENTKeyType }
     *     
     */
    public void setINCIDENT(INCIDENTKeyType value) {
        this.incident = value;
    }

}

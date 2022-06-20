
package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTINCIDENTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTINCIDENTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCIDENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}TTINCIDENT_INCIDENTType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTINCIDENTType", propOrder = {
    "incident"
})
public class TTINCIDENTType {

    @XmlElement(name = "INCIDENT")
    protected TTINCIDENTINCIDENTType incident;

    /**
     * Gets the value of the incident property.
     * 
     * @return
     *     possible object is
     *     {@link TTINCIDENTINCIDENTType }
     *     
     */
    public TTINCIDENTINCIDENTType getINCIDENT() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTINCIDENTINCIDENTType }
     *     
     */
    public void setINCIDENT(TTINCIDENTINCIDENTType value) {
        this.incident = value;
    }

}

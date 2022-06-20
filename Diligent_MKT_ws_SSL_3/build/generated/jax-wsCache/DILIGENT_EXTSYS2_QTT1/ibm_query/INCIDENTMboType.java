
package ibm_query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INCIDENTMboType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INCIDENTMboType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCIDENT" type="{http://www.ibm.com/maximo}INCIDENTObjectType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCIDENTMboType", propOrder = {
    "incident"
})
public class INCIDENTMboType {

    @XmlElement(name = "INCIDENT")
    protected INCIDENTObjectType incident;

    /**
     * Gets the value of the incident property.
     * 
     * @return
     *     possible object is
     *     {@link INCIDENTObjectType }
     *     
     */
    public INCIDENTObjectType getINCIDENT() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link INCIDENTObjectType }
     *     
     */
    public void setINCIDENT(INCIDENTObjectType value) {
        this.incident = value;
    }

}

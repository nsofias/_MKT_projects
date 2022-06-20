
package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTTINCIDENTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTTINCIDENTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCIDENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}QTTINCIDENT_INCIDENTType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTTINCIDENTType", propOrder = {
    "incident"
})
public class QTTINCIDENTType {

    @XmlElement(name = "INCIDENT")
    protected QTTINCIDENTINCIDENTType incident;

    /**
     * Gets the value of the incident property.
     * 
     * @return
     *     possible object is
     *     {@link QTTINCIDENTINCIDENTType }
     *     
     */
    public QTTINCIDENTINCIDENTType getINCIDENT() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTTINCIDENTINCIDENTType }
     *     
     */
    public void setINCIDENT(QTTINCIDENTINCIDENTType value) {
        this.incident = value;
    }

}

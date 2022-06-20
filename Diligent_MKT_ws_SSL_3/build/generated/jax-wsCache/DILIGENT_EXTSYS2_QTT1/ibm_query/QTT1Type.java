
package ibm_query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTT1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTT1Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCIDENT" type="{http://www.ibm.com/maximo}QTT1_INCIDENTType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTT1Type", propOrder = {
    "incident"
})
public class QTT1Type {

    @XmlElement(name = "INCIDENT")
    protected QTT1INCIDENTType incident;

    /**
     * Gets the value of the incident property.
     * 
     * @return
     *     possible object is
     *     {@link QTT1INCIDENTType }
     *     
     */
    public QTT1INCIDENTType getINCIDENT() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTT1INCIDENTType }
     *     
     */
    public void setINCIDENT(QTT1INCIDENTType value) {
        this.incident = value;
    }

}

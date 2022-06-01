
package cross_ws.alat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The payload for the response of operation 'performSyncMeasure' of port-type 'alat'
 * 			
 * 
 * <p>Java class for alat_resetPortResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alat_resetPortResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResetPortResponse" type="{http://oss.it.telekom.mk/alat/datatypes/alatmanagement}AlatResetPortResponse1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alat_resetPortResponse", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "resetPortResponse"
})
public class AlatResetPortResponse {

    @XmlElement(name = "ResetPortResponse")
    protected AlatResetPortResponse1 resetPortResponse;

    /**
     * Gets the value of the resetPortResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AlatResetPortResponse1 }
     *     
     */
    public AlatResetPortResponse1 getResetPortResponse() {
        return resetPortResponse;
    }

    /**
     * Sets the value of the resetPortResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlatResetPortResponse1 }
     *     
     */
    public void setResetPortResponse(AlatResetPortResponse1 value) {
        this.resetPortResponse = value;
    }

}

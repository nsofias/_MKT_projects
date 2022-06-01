
package cross_ws.alat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The payload for the request of operation 'performSyncMeasure' of port-type 'alat'
 * 			
 * 
 * <p>Java class for alat_resetPortRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alat_resetPortRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResetPort" type="{http://oss.it.telekom.mk/alat/datatypes/alatmanagement}AlatResetPortRequest1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alat_resetPortRequest", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "resetPort"
})
public class AlatResetPortRequest {

    @XmlElement(name = "ResetPort")
    protected AlatResetPortRequest1 resetPort;

    /**
     * Gets the value of the resetPort property.
     * 
     * @return
     *     possible object is
     *     {@link AlatResetPortRequest1 }
     *     
     */
    public AlatResetPortRequest1 getResetPort() {
        return resetPort;
    }

    /**
     * Sets the value of the resetPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlatResetPortRequest1 }
     *     
     */
    public void setResetPort(AlatResetPortRequest1 value) {
        this.resetPort = value;
    }

}

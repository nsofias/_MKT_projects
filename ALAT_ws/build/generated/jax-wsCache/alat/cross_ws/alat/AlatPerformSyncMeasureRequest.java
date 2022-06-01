
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
 * <p>Java class for alat_performSyncMeasureRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alat_performSyncMeasureRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PerformSyncMeasure" type="{http://oss.it.telekom.mk/alat/datatypes/alatmanagement}AlatPerformSyncMeasureRequest1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alat_performSyncMeasureRequest", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "performSyncMeasure"
})
public class AlatPerformSyncMeasureRequest {

    @XmlElement(name = "PerformSyncMeasure")
    protected AlatPerformSyncMeasureRequest1 performSyncMeasure;

    /**
     * Gets the value of the performSyncMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link AlatPerformSyncMeasureRequest1 }
     *     
     */
    public AlatPerformSyncMeasureRequest1 getPerformSyncMeasure() {
        return performSyncMeasure;
    }

    /**
     * Sets the value of the performSyncMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlatPerformSyncMeasureRequest1 }
     *     
     */
    public void setPerformSyncMeasure(AlatPerformSyncMeasureRequest1 value) {
        this.performSyncMeasure = value;
    }

}

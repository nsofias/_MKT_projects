
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
 * <p>Java class for alat_performSyncMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alat_performSyncMeasureResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PerformSyncMeasureResponse" type="{http://oss.it.telekom.mk/alat/datatypes/alatmanagement}AlatPerformSyncMeasureResponse1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alat_performSyncMeasureResponse", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "performSyncMeasureResponse"
})
public class AlatPerformSyncMeasureResponse {

    @XmlElement(name = "PerformSyncMeasureResponse")
    protected AlatPerformSyncMeasureResponse1 performSyncMeasureResponse;

    /**
     * Gets the value of the performSyncMeasureResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AlatPerformSyncMeasureResponse1 }
     *     
     */
    public AlatPerformSyncMeasureResponse1 getPerformSyncMeasureResponse() {
        return performSyncMeasureResponse;
    }

    /**
     * Sets the value of the performSyncMeasureResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlatPerformSyncMeasureResponse1 }
     *     
     */
    public void setPerformSyncMeasureResponse(AlatPerformSyncMeasureResponse1 value) {
        this.performSyncMeasureResponse = value;
    }

}

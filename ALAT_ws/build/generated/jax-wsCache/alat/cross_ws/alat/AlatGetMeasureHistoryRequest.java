
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
 * <p>Java class for alat_getMeasureHistoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alat_getMeasureHistoryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetMeasureHistory" type="{http://oss.it.telekom.mk/alat/datatypes/alatmanagement}AlatGetMeasureHistoryRequest1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alat_getMeasureHistoryRequest", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "getMeasureHistory"
})
public class AlatGetMeasureHistoryRequest {

    @XmlElement(name = "GetMeasureHistory")
    protected AlatGetMeasureHistoryRequest1 getMeasureHistory;

    /**
     * Gets the value of the getMeasureHistory property.
     * 
     * @return
     *     possible object is
     *     {@link AlatGetMeasureHistoryRequest1 }
     *     
     */
    public AlatGetMeasureHistoryRequest1 getGetMeasureHistory() {
        return getMeasureHistory;
    }

    /**
     * Sets the value of the getMeasureHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlatGetMeasureHistoryRequest1 }
     *     
     */
    public void setGetMeasureHistory(AlatGetMeasureHistoryRequest1 value) {
        this.getMeasureHistory = value;
    }

}

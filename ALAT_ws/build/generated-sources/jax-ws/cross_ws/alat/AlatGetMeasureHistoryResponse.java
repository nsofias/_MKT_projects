
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
 * <p>Java class for alat_getMeasureHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alat_getMeasureHistoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetMeasureHistoryResponse" type="{http://oss.it.telekom.mk/alat/datatypes/alatmanagement}AlatGetMeasureHistoryResponse1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alat_getMeasureHistoryResponse", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "getMeasureHistoryResponse"
})
public class AlatGetMeasureHistoryResponse {

    @XmlElement(name = "GetMeasureHistoryResponse")
    protected AlatGetMeasureHistoryResponse1 getMeasureHistoryResponse;

    /**
     * Gets the value of the getMeasureHistoryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AlatGetMeasureHistoryResponse1 }
     *     
     */
    public AlatGetMeasureHistoryResponse1 getGetMeasureHistoryResponse() {
        return getMeasureHistoryResponse;
    }

    /**
     * Sets the value of the getMeasureHistoryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlatGetMeasureHistoryResponse1 }
     *     
     */
    public void setGetMeasureHistoryResponse(AlatGetMeasureHistoryResponse1 value) {
        this.getMeasureHistoryResponse = value;
    }

}

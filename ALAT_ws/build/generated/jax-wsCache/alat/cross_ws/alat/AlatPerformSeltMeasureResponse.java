
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
 * <p>Java class for alat_performSeltMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alat_performSeltMeasureResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PerformSeltMeasureResponse" type="{http://oss.it.telekom.mk/alat/datatypes/alatmanagement}AlatPerformSeltMeasureResponse1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alat_performSeltMeasureResponse", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "performSeltMeasureResponse"
})
public class AlatPerformSeltMeasureResponse {

    @XmlElement(name = "PerformSeltMeasureResponse")
    protected AlatPerformSeltMeasureResponse1 performSeltMeasureResponse;

    /**
     * Gets the value of the performSeltMeasureResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AlatPerformSeltMeasureResponse1 }
     *     
     */
    public AlatPerformSeltMeasureResponse1 getPerformSeltMeasureResponse() {
        return performSeltMeasureResponse;
    }

    /**
     * Sets the value of the performSeltMeasureResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlatPerformSeltMeasureResponse1 }
     *     
     */
    public void setPerformSeltMeasureResponse(AlatPerformSeltMeasureResponse1 value) {
        this.performSeltMeasureResponse = value;
    }

}

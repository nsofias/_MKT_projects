
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
 * <p>Java class for alat_performSeltMeasureRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alat_performSeltMeasureRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PerformSeltMeasure" type="{http://oss.it.telekom.mk/alat/datatypes/alatmanagement}AlatPerformSeltMeasureRequest1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alat_performSeltMeasureRequest", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "performSeltMeasure"
})
public class AlatPerformSeltMeasureRequest {

    @XmlElement(name = "PerformSeltMeasure")
    protected AlatPerformSeltMeasureRequest1 performSeltMeasure;

    /**
     * Gets the value of the performSeltMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link AlatPerformSeltMeasureRequest1 }
     *     
     */
    public AlatPerformSeltMeasureRequest1 getPerformSeltMeasure() {
        return performSeltMeasure;
    }

    /**
     * Sets the value of the performSeltMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlatPerformSeltMeasureRequest1 }
     *     
     */
    public void setPerformSeltMeasure(AlatPerformSeltMeasureRequest1 value) {
        this.performSeltMeasure = value;
    }

}


package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INCIDENTS_ALL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INCIDENTS_ALL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCIDENTS" type="{diligent.services.all}INCIDENTArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCIDENTS_ALL", propOrder = {
    "incidents"
})
public class INCIDENTSALL {

    @XmlElementRef(name = "INCIDENTS", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<INCIDENTArray> incidents;

    /**
     * Gets the value of the incidents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link INCIDENTArray }{@code >}
     *     
     */
    public JAXBElement<INCIDENTArray> getINCIDENTS() {
        return incidents;
    }

    /**
     * Sets the value of the incidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link INCIDENTArray }{@code >}
     *     
     */
    public void setINCIDENTS(JAXBElement<INCIDENTArray> value) {
        this.incidents = value;
    }

}

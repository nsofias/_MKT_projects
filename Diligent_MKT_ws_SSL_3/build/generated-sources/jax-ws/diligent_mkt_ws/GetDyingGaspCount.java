
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_DyingGasp_count complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_DyingGasp_count"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineids" type="{diligent.services.all}stringArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_DyingGasp_count", propOrder = {
    "lineids"
})
public class GetDyingGaspCount {

    @XmlElementRef(name = "lineids", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> lineids;

    /**
     * Gets the value of the lineids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getLineids() {
        return lineids;
    }

    /**
     * Sets the value of the lineids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setLineids(JAXBElement<StringArray> value) {
        this.lineids = value;
    }

}

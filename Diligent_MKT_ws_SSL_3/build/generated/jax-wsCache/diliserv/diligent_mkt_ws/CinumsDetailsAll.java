
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cinums_details_all complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cinums_details_all"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cinum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceinfault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeimpact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cinums_details_all", propOrder = {
    "cinum",
    "serviceinfault",
    "typeimpact",
    "string1"
})
public class CinumsDetailsAll {

    @XmlElementRef(name = "cinum", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cinum;
    @XmlElementRef(name = "serviceinfault", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceinfault;
    @XmlElementRef(name = "typeimpact", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeimpact;
    @XmlElementRef(name = "string1", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<String> string1;

    /**
     * Gets the value of the cinum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCinum() {
        return cinum;
    }

    /**
     * Sets the value of the cinum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCinum(JAXBElement<String> value) {
        this.cinum = value;
    }

    /**
     * Gets the value of the serviceinfault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceinfault() {
        return serviceinfault;
    }

    /**
     * Sets the value of the serviceinfault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceinfault(JAXBElement<String> value) {
        this.serviceinfault = value;
    }

    /**
     * Gets the value of the typeimpact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeimpact() {
        return typeimpact;
    }

    /**
     * Sets the value of the typeimpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeimpact(JAXBElement<String> value) {
        this.typeimpact = value;
    }

    /**
     * Gets the value of the string1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getString1() {
        return string1;
    }

    /**
     * Sets the value of the string1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setString1(JAXBElement<String> value) {
        this.string1 = value;
    }

}

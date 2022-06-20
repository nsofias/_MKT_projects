
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_DyingGasp_countResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_DyingGasp_countResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="get_DyingGasp_countResult" type="{diligent.services.all}LINEIDSRESULT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_DyingGasp_countResponse", propOrder = {
    "getDyingGaspCountResult"
})
public class GetDyingGaspCountResponse {

    @XmlElementRef(name = "get_DyingGasp_countResult", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<LINEIDSRESULT> getDyingGaspCountResult;

    /**
     * Gets the value of the getDyingGaspCountResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LINEIDSRESULT }{@code >}
     *     
     */
    public JAXBElement<LINEIDSRESULT> getGetDyingGaspCountResult() {
        return getDyingGaspCountResult;
    }

    /**
     * Sets the value of the getDyingGaspCountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LINEIDSRESULT }{@code >}
     *     
     */
    public void setGetDyingGaspCountResult(JAXBElement<LINEIDSRESULT> value) {
        this.getDyingGaspCountResult = value;
    }

}

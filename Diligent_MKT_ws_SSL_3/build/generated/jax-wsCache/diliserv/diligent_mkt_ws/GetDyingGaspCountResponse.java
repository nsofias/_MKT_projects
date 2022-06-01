
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for get_DyingGasp_countResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="get_DyingGasp_countResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="get_DyingGasp_countResult" type="{diligent.services.all}LINEIDSRESULT" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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

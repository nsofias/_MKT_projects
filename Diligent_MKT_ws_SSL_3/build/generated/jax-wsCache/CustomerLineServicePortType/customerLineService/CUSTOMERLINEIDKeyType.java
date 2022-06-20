
package customerLineService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CUSTOMERLINEIDKeyType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CUSTOMERLINEIDKeyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CUSTOMERLINEIDID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXLongType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUSTOMERLINEIDKeyType", propOrder = {
    "customerlineidid"
})
public class CUSTOMERLINEIDKeyType {

    @XmlElement(name = "CUSTOMERLINEIDID", required = true, nillable = true)
    protected MXLongType customerlineidid;

    /**
     * Gets the value of the customerlineidid property.
     * 
     * @return
     *     possible object is
     *     {@link MXLongType }
     *     
     */
    public MXLongType getCUSTOMERLINEIDID() {
        return customerlineidid;
    }

    /**
     * Sets the value of the customerlineidid property.
     * 
     * @param value
     *     allowed object is
     *     {@link MXLongType }
     *     
     */
    public void setCUSTOMERLINEIDID(MXLongType value) {
        this.customerlineidid = value;
    }

}

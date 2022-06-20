
package customerLineService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CUSTOMERLINEIDMboKeyType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CUSTOMERLINEIDMboKeyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CUSTOMERLINEID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}CUSTOMERLINEIDKeyType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUSTOMERLINEIDMboKeyType", propOrder = {
    "customerlineid"
})
public class CUSTOMERLINEIDMboKeyType {

    @XmlElement(name = "CUSTOMERLINEID")
    protected CUSTOMERLINEIDKeyType customerlineid;

    /**
     * Gets the value of the customerlineid property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERLINEIDKeyType }
     *     
     */
    public CUSTOMERLINEIDKeyType getCUSTOMERLINEID() {
        return customerlineid;
    }

    /**
     * Sets the value of the customerlineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERLINEIDKeyType }
     *     
     */
    public void setCUSTOMERLINEID(CUSTOMERLINEIDKeyType value) {
        this.customerlineid = value;
    }

}

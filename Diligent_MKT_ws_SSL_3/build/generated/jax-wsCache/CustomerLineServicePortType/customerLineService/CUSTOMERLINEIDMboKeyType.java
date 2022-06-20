
package customerLineService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUSTOMERLINEIDMboKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUSTOMERLINEIDMboKeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMERLINEID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}CUSTOMERLINEIDKeyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

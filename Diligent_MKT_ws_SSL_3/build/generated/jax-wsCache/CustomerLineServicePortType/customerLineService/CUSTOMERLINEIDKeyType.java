
package customerLineService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUSTOMERLINEIDKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUSTOMERLINEIDKeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMERLINEIDID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXLongType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

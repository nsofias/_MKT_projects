
package customerLineService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUSTOMERLINEIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUSTOMERLINEIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMERLINEID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}CUSTOMERLINEID_CUSTOMERLINEIDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUSTOMERLINEIDType", propOrder = {
    "customerlineid"
})
public class CUSTOMERLINEIDType {

    @XmlElement(name = "CUSTOMERLINEID")
    protected CUSTOMERLINEIDCUSTOMERLINEIDType customerlineid;

    /**
     * Gets the value of the customerlineid property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERLINEIDCUSTOMERLINEIDType }
     *     
     */
    public CUSTOMERLINEIDCUSTOMERLINEIDType getCUSTOMERLINEID() {
        return customerlineid;
    }

    /**
     * Sets the value of the customerlineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERLINEIDCUSTOMERLINEIDType }
     *     
     */
    public void setCUSTOMERLINEID(CUSTOMERLINEIDCUSTOMERLINEIDType value) {
        this.customerlineid = value;
    }

}

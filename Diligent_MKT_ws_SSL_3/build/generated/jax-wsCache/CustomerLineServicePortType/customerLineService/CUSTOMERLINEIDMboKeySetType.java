
package customerLineService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUSTOMERLINEIDMboKeySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUSTOMERLINEIDMboKeySetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMERLINEID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}CUSTOMERLINEIDKeyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUSTOMERLINEIDMboKeySetType", propOrder = {
    "customerlineid"
})
public class CUSTOMERLINEIDMboKeySetType {

    @XmlElement(name = "CUSTOMERLINEID")
    protected List<CUSTOMERLINEIDKeyType> customerlineid;

    /**
     * Gets the value of the customerlineid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerlineid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUSTOMERLINEID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CUSTOMERLINEIDKeyType }
     * 
     * 
     */
    public List<CUSTOMERLINEIDKeyType> getCUSTOMERLINEID() {
        if (customerlineid == null) {
            customerlineid = new ArrayList<CUSTOMERLINEIDKeyType>();
        }
        return this.customerlineid;
    }

}

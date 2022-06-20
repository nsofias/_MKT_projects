
package customerLineService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUSTOMERLINEIDCombinedKeySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUSTOMERLINEIDCombinedKeySetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMERLINEID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTOMERLINEIDID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXLongType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUSTOMERLINEIDCombinedKeySetType", propOrder = {
    "customerlineid"
})
public class CUSTOMERLINEIDCombinedKeySetType {

    @XmlElement(name = "CUSTOMERLINEID")
    protected List<CUSTOMERLINEIDCombinedKeySetType.CUSTOMERLINEID> customerlineid;

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
     * {@link CUSTOMERLINEIDCombinedKeySetType.CUSTOMERLINEID }
     * 
     * 
     */
    public List<CUSTOMERLINEIDCombinedKeySetType.CUSTOMERLINEID> getCUSTOMERLINEID() {
        if (customerlineid == null) {
            customerlineid = new ArrayList<CUSTOMERLINEIDCombinedKeySetType.CUSTOMERLINEID>();
        }
        return this.customerlineid;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "customerlineidid"
    })
    public static class CUSTOMERLINEID {

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

}

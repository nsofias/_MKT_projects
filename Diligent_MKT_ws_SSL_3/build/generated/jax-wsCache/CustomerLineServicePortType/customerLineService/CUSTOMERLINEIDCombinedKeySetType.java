
package customerLineService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CUSTOMERLINEIDCombinedKeySetType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CUSTOMERLINEIDCombinedKeySetType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CUSTOMERLINEID" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="CUSTOMERLINEIDID" type="{http://oss.it.telekom.mk/tt/datatypes/customerLineService}MXLongType"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the customerlineid property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCUSTOMERLINEID().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
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


package affected_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFFECTEDSERVICECombinedKeySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFFECTEDSERVICECombinedKeySetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AFFECTEDSERVICE" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongType"/&gt;
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
@XmlType(name = "AFFECTEDSERVICECombinedKeySetType", propOrder = {
    "affectedservice"
})
public class AFFECTEDSERVICECombinedKeySetType {

    @XmlElement(name = "AFFECTEDSERVICE")
    protected List<AFFECTEDSERVICECombinedKeySetType.AFFECTEDSERVICE> affectedservice;

    /**
     * Gets the value of the affectedservice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedservice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAFFECTEDSERVICE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AFFECTEDSERVICECombinedKeySetType.AFFECTEDSERVICE }
     * 
     * 
     */
    public List<AFFECTEDSERVICECombinedKeySetType.AFFECTEDSERVICE> getAFFECTEDSERVICE() {
        if (affectedservice == null) {
            affectedservice = new ArrayList<AFFECTEDSERVICECombinedKeySetType.AFFECTEDSERVICE>();
        }
        return this.affectedservice;
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
     *         &lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongType"/&gt;
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
        "affectedserviceid"
    })
    public static class AFFECTEDSERVICE {

        @XmlElement(name = "AFFECTEDSERVICEID", required = true, nillable = true)
        protected MXLongType affectedserviceid;

        /**
         * Gets the value of the affectedserviceid property.
         * 
         * @return
         *     possible object is
         *     {@link MXLongType }
         *     
         */
        public MXLongType getAFFECTEDSERVICEID() {
            return affectedserviceid;
        }

        /**
         * Sets the value of the affectedserviceid property.
         * 
         * @param value
         *     allowed object is
         *     {@link MXLongType }
         *     
         */
        public void setAFFECTEDSERVICEID(MXLongType value) {
            this.affectedserviceid = value;
        }

    }

}

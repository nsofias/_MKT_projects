
package affected_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFFECTEDSERVICEMboKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFFECTEDSERVICEMboKeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AFFECTEDSERVICE" type="{http://www.ibm.com/maximo}AFFECTEDSERVICEKeyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFFECTEDSERVICEMboKeyType", propOrder = {
    "affectedservice"
})
public class AFFECTEDSERVICEMboKeyType {

    @XmlElement(name = "AFFECTEDSERVICE")
    protected AFFECTEDSERVICEKeyType affectedservice;

    /**
     * Gets the value of the affectedservice property.
     * 
     * @return
     *     possible object is
     *     {@link AFFECTEDSERVICEKeyType }
     *     
     */
    public AFFECTEDSERVICEKeyType getAFFECTEDSERVICE() {
        return affectedservice;
    }

    /**
     * Sets the value of the affectedservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFFECTEDSERVICEKeyType }
     *     
     */
    public void setAFFECTEDSERVICE(AFFECTEDSERVICEKeyType value) {
        this.affectedservice = value;
    }

}

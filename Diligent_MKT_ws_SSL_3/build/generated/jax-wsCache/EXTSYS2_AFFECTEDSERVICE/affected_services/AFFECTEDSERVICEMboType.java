
package affected_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFFECTEDSERVICEMboType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFFECTEDSERVICEMboType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AFFECTEDSERVICE" type="{http://www.ibm.com/maximo}AFFECTEDSERVICEObjectType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFFECTEDSERVICEMboType", propOrder = {
    "affectedservice"
})
public class AFFECTEDSERVICEMboType {

    @XmlElement(name = "AFFECTEDSERVICE")
    protected AFFECTEDSERVICEObjectType affectedservice;

    /**
     * Gets the value of the affectedservice property.
     * 
     * @return
     *     possible object is
     *     {@link AFFECTEDSERVICEObjectType }
     *     
     */
    public AFFECTEDSERVICEObjectType getAFFECTEDSERVICE() {
        return affectedservice;
    }

    /**
     * Sets the value of the affectedservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFFECTEDSERVICEObjectType }
     *     
     */
    public void setAFFECTEDSERVICE(AFFECTEDSERVICEObjectType value) {
        this.affectedservice = value;
    }

}

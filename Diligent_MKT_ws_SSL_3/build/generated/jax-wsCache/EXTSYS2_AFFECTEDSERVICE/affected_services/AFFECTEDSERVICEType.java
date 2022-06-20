
package affected_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFFECTEDSERVICEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFFECTEDSERVICEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AFFECTEDSERVICE" type="{http://www.ibm.com/maximo}AFFECTEDSERVICE_AFFECTEDSERVICEType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFFECTEDSERVICEType", propOrder = {
    "affectedservice"
})
public class AFFECTEDSERVICEType {

    @XmlElement(name = "AFFECTEDSERVICE")
    protected AFFECTEDSERVICEAFFECTEDSERVICEType affectedservice;

    /**
     * Gets the value of the affectedservice property.
     * 
     * @return
     *     possible object is
     *     {@link AFFECTEDSERVICEAFFECTEDSERVICEType }
     *     
     */
    public AFFECTEDSERVICEAFFECTEDSERVICEType getAFFECTEDSERVICE() {
        return affectedservice;
    }

    /**
     * Sets the value of the affectedservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFFECTEDSERVICEAFFECTEDSERVICEType }
     *     
     */
    public void setAFFECTEDSERVICE(AFFECTEDSERVICEAFFECTEDSERVICEType value) {
        this.affectedservice = value;
    }

}

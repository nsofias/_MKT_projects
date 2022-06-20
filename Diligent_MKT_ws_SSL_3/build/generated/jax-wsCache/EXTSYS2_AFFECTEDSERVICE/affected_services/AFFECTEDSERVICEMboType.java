
package affected_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AFFECTEDSERVICEMboType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AFFECTEDSERVICEMboType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AFFECTEDSERVICE" type="{http://www.ibm.com/maximo}AFFECTEDSERVICEObjectType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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


package affected_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AFFECTEDSERVICEKeyType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AFFECTEDSERVICEKeyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AFFECTEDSERVICEID" type="{http://www.ibm.com/maximo}MXLongType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFFECTEDSERVICEKeyType", propOrder = {
    "affectedserviceid"
})
public class AFFECTEDSERVICEKeyType {

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

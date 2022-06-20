
package affected_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFFECTEDSERVICEKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFFECTEDSERVICEKeyType"&gt;
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

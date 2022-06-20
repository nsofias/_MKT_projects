
package affected_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFFECTEDSERVICESetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFFECTEDSERVICESetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AFFECTEDSERVICE" type="{http://www.ibm.com/maximo}AFFECTEDSERVICE_AFFECTEDSERVICEType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFFECTEDSERVICESetType", propOrder = {
    "affectedservice"
})
public class AFFECTEDSERVICESetType {

    @XmlElement(name = "AFFECTEDSERVICE")
    protected List<AFFECTEDSERVICEAFFECTEDSERVICEType> affectedservice;

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
     * {@link AFFECTEDSERVICEAFFECTEDSERVICEType }
     * 
     * 
     */
    public List<AFFECTEDSERVICEAFFECTEDSERVICEType> getAFFECTEDSERVICE() {
        if (affectedservice == null) {
            affectedservice = new ArrayList<AFFECTEDSERVICEAFFECTEDSERVICEType>();
        }
        return this.affectedservice;
    }

}

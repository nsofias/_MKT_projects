
package ibm_query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INCIDENTMboSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INCIDENTMboSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCIDENT" type="{http://www.ibm.com/maximo}INCIDENTObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INCIDENTMboSetType", propOrder = {
    "incident"
})
public class INCIDENTMboSetType {

    @XmlElement(name = "INCIDENT")
    protected List<INCIDENTObjectType> incident;

    /**
     * Gets the value of the incident property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incident property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINCIDENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INCIDENTObjectType }
     * 
     * 
     */
    public List<INCIDENTObjectType> getINCIDENT() {
        if (incident == null) {
            incident = new ArrayList<INCIDENTObjectType>();
        }
        return this.incident;
    }

}


package TT_incident;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTTINCIDENTSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTTINCIDENTSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCIDENT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}QTTINCIDENT_INCIDENTType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTTINCIDENTSetType", propOrder = {
    "incident"
})
public class QTTINCIDENTSetType {

    @XmlElement(name = "INCIDENT")
    protected List<QTTINCIDENTINCIDENTType> incident;

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
     * {@link QTTINCIDENTINCIDENTType }
     * 
     * 
     */
    public List<QTTINCIDENTINCIDENTType> getINCIDENT() {
        if (incident == null) {
            incident = new ArrayList<QTTINCIDENTINCIDENTType>();
        }
        return this.incident;
    }

}

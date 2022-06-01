
package svt_tool;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EIPlaceholderValueCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EIPlaceholderValueCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="placeholderValue" type="{http://messaging.ei.tmobile.net/datatypes}EIPlaceholderValue" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIPlaceholderValueCollection", propOrder = {
    "placeholderValue"
})
public class EIPlaceholderValueCollection {

    @XmlElement(required = true)
    protected List<EIPlaceholderValue> placeholderValue;

    /**
     * Gets the value of the placeholderValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeholderValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceholderValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EIPlaceholderValue }
     * 
     * 
     */
    public List<EIPlaceholderValue> getPlaceholderValue() {
        if (placeholderValue == null) {
            placeholderValue = new ArrayList<EIPlaceholderValue>();
        }
        return this.placeholderValue;
    }

}

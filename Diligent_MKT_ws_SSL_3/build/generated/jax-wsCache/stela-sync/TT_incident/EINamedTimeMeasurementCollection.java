
package TT_incident;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EINamedTimeMeasurementCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EINamedTimeMeasurementCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeMeasurement" type="{http://messaging.ei.tmobile.net/datatypes}EINamedTimeMeasurement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EINamedTimeMeasurementCollection", namespace = "http://messaging.ei.tmobile.net/datatypes", propOrder = {
    "timeMeasurement"
})
public class EINamedTimeMeasurementCollection {

    protected List<EINamedTimeMeasurement> timeMeasurement;

    /**
     * Gets the value of the timeMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EINamedTimeMeasurement }
     * 
     * 
     */
    public List<EINamedTimeMeasurement> getTimeMeasurement() {
        if (timeMeasurement == null) {
            timeMeasurement = new ArrayList<EINamedTimeMeasurement>();
        }
        return this.timeMeasurement;
    }

}

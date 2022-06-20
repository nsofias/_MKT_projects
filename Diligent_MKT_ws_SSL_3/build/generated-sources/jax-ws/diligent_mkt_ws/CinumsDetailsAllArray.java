
package diligent_mkt_ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cinums_details_allArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cinums_details_allArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cinums_details_all" type="{diligent.services.all}cinums_details_all" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cinums_details_allArray", propOrder = {
    "cinumsDetailsAll"
})
public class CinumsDetailsAllArray {

    @XmlElement(name = "cinums_details_all", nillable = true)
    protected List<CinumsDetailsAll> cinumsDetailsAll;

    /**
     * Gets the value of the cinumsDetailsAll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cinumsDetailsAll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCinumsDetailsAll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CinumsDetailsAll }
     * 
     * 
     */
    public List<CinumsDetailsAll> getCinumsDetailsAll() {
        if (cinumsDetailsAll == null) {
            cinumsDetailsAll = new ArrayList<CinumsDetailsAll>();
        }
        return this.cinumsDetailsAll;
    }

}

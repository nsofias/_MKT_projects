
package diligent_mkt_ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ANNOUNCEMENTSArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ANNOUNCEMENTSArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ANNOUNCEMENTS" type="{diligent.services.all}ANNOUNCEMENTS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANNOUNCEMENTSArray", propOrder = {
    "announcements"
})
public class ANNOUNCEMENTSArray {

    @XmlElement(name = "ANNOUNCEMENTS", nillable = true)
    protected List<ANNOUNCEMENTS> announcements;

    /**
     * Gets the value of the announcements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the announcements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getANNOUNCEMENTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ANNOUNCEMENTS }
     * 
     * 
     */
    public List<ANNOUNCEMENTS> getANNOUNCEMENTS() {
        if (announcements == null) {
            announcements = new ArrayList<ANNOUNCEMENTS>();
        }
        return this.announcements;
    }

}

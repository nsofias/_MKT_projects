
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ANNOUNCEMENTS_ALL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ANNOUNCEMENTS_ALL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RECORDS" type="{diligent.services.all}ANNOUNCEMENTSArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANNOUNCEMENTS_ALL", propOrder = {
    "records"
})
public class ANNOUNCEMENTSALL {

    @XmlElementRef(name = "RECORDS", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<ANNOUNCEMENTSArray> records;

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSArray }{@code >}
     *     
     */
    public JAXBElement<ANNOUNCEMENTSArray> getRECORDS() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSArray }{@code >}
     *     
     */
    public void setRECORDS(JAXBElement<ANNOUNCEMENTSArray> value) {
        this.records = value;
    }

}

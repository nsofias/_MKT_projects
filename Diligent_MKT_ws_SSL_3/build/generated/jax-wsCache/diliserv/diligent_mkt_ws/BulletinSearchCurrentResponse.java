
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bulletin_search_currentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bulletin_search_currentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bulletin_search_currentResult" type="{diligent.services.all}ANNOUNCEMENTS_ALL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bulletin_search_currentResponse", propOrder = {
    "bulletinSearchCurrentResult"
})
public class BulletinSearchCurrentResponse {

    @XmlElementRef(name = "Bulletin_search_currentResult", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<ANNOUNCEMENTSALL> bulletinSearchCurrentResult;

    /**
     * Gets the value of the bulletinSearchCurrentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     *     
     */
    public JAXBElement<ANNOUNCEMENTSALL> getBulletinSearchCurrentResult() {
        return bulletinSearchCurrentResult;
    }

    /**
     * Sets the value of the bulletinSearchCurrentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     *     
     */
    public void setBulletinSearchCurrentResult(JAXBElement<ANNOUNCEMENTSALL> value) {
        this.bulletinSearchCurrentResult = value;
    }

}

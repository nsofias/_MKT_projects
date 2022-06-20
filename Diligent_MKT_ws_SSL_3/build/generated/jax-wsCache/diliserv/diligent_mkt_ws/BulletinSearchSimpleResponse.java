
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bulletin_search_simpleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bulletin_search_simpleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bulletin_search_simpleResult" type="{diligent.services.all}ANNOUNCEMENTS_ALL_SIMPLE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bulletin_search_simpleResponse", propOrder = {
    "bulletinSearchSimpleResult"
})
public class BulletinSearchSimpleResponse {

    @XmlElementRef(name = "Bulletin_search_simpleResult", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<ANNOUNCEMENTSALLSIMPLE> bulletinSearchSimpleResult;

    /**
     * Gets the value of the bulletinSearchSimpleResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALLSIMPLE }{@code >}
     *     
     */
    public JAXBElement<ANNOUNCEMENTSALLSIMPLE> getBulletinSearchSimpleResult() {
        return bulletinSearchSimpleResult;
    }

    /**
     * Sets the value of the bulletinSearchSimpleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALLSIMPLE }{@code >}
     *     
     */
    public void setBulletinSearchSimpleResult(JAXBElement<ANNOUNCEMENTSALLSIMPLE> value) {
        this.bulletinSearchSimpleResult = value;
    }

}

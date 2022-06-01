
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Bulletin_searchResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Bulletin_searchResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Bulletin_searchResult" type="{diligent.services.all}ANNOUNCEMENTS_ALL" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bulletin_searchResponse", propOrder = {
    "bulletinSearchResult"
})
public class BulletinSearchResponse {

    @XmlElementRef(name = "Bulletin_searchResult", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<ANNOUNCEMENTSALL> bulletinSearchResult;

    /**
     * Gets the value of the bulletinSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     *     
     */
    public JAXBElement<ANNOUNCEMENTSALL> getBulletinSearchResult() {
        return bulletinSearchResult;
    }

    /**
     * Sets the value of the bulletinSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     *     
     */
    public void setBulletinSearchResult(JAXBElement<ANNOUNCEMENTSALL> value) {
        this.bulletinSearchResult = value;
    }

}

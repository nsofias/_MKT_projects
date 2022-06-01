
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Bulletin_search_futureResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Bulletin_search_futureResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Bulletin_search_futureResult" type="{diligent.services.all}ANNOUNCEMENTS_ALL" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bulletin_search_futureResponse", propOrder = {
    "bulletinSearchFutureResult"
})
public class BulletinSearchFutureResponse {

    @XmlElementRef(name = "Bulletin_search_futureResult", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<ANNOUNCEMENTSALL> bulletinSearchFutureResult;

    /**
     * Gets the value of the bulletinSearchFutureResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     *     
     */
    public JAXBElement<ANNOUNCEMENTSALL> getBulletinSearchFutureResult() {
        return bulletinSearchFutureResult;
    }

    /**
     * Sets the value of the bulletinSearchFutureResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ANNOUNCEMENTSALL }{@code >}
     *     
     */
    public void setBulletinSearchFutureResult(JAXBElement<ANNOUNCEMENTSALL> value) {
        this.bulletinSearchFutureResult = value;
    }

}

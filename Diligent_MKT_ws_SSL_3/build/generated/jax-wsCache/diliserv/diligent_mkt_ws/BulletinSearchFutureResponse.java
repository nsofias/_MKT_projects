
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bulletin_search_futureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bulletin_search_futureResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bulletin_search_futureResult" type="{diligent.services.all}ANNOUNCEMENTS_ALL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

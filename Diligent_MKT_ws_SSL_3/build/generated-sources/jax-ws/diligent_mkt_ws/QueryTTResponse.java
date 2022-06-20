
package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Query_TTResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Query_TTResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Query_TTResult" type="{diligent.services.all}INCIDENTS_ALL" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Query_TTResponse", propOrder = {
    "queryTTResult"
})
public class QueryTTResponse {

    @XmlElementRef(name = "Query_TTResult", namespace = "diligent.services.all", type = JAXBElement.class, required = false)
    protected JAXBElement<INCIDENTSALL> queryTTResult;

    /**
     * Gets the value of the queryTTResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link INCIDENTSALL }{@code >}
     *     
     */
    public JAXBElement<INCIDENTSALL> getQueryTTResult() {
        return queryTTResult;
    }

    /**
     * Sets the value of the queryTTResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link INCIDENTSALL }{@code >}
     *     
     */
    public void setQueryTTResult(JAXBElement<INCIDENTSALL> value) {
        this.queryTTResult = value;
    }

}


package diligent_mkt_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Query_TTResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Query_TTResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Query_TTResult" type="{diligent.services.all}INCIDENTS_ALL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

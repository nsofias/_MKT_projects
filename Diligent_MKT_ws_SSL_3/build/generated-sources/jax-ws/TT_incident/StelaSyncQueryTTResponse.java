
package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The payload for the response of operation 'synch' of port-type 'stela-sync'
 * 			
 * 
 * <p>Java class for stela-sync_queryTTResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stela-sync_queryTTResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryTTResponse" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}QueryQTTINCIDENTResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stela-sync_queryTTResponse", namespace = "http://oss.it.telekom.mk/tt/datatypes/stela-sync", propOrder = {
    "queryTTResponse"
})
public class StelaSyncQueryTTResponse {

    @XmlElement(name = "QueryTTResponse", required = true)
    protected QueryQTTINCIDENTResponseType queryTTResponse;

    /**
     * Gets the value of the queryTTResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QueryQTTINCIDENTResponseType }
     *     
     */
    public QueryQTTINCIDENTResponseType getQueryTTResponse() {
        return queryTTResponse;
    }

    /**
     * Sets the value of the queryTTResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryQTTINCIDENTResponseType }
     *     
     */
    public void setQueryTTResponse(QueryQTTINCIDENTResponseType value) {
        this.queryTTResponse = value;
    }

}


package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The payload for the request of operation 'synch' of port-type 'stela-sync'
 * 			
 * 
 * <p>Java class for stela-sync_queryTTRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stela-sync_queryTTRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryTT" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}QueryQTTINCIDENTType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stela-sync_queryTTRequest", namespace = "http://oss.it.telekom.mk/tt/datatypes/stela-sync", propOrder = {
    "queryTT"
})
public class StelaSyncQueryTTRequest {

    @XmlElement(name = "QueryTT", required = true)
    protected QueryQTTINCIDENTType queryTT;

    /**
     * Gets the value of the queryTT property.
     * 
     * @return
     *     possible object is
     *     {@link QueryQTTINCIDENTType }
     *     
     */
    public QueryQTTINCIDENTType getQueryTT() {
        return queryTT;
    }

    /**
     * Sets the value of the queryTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryQTTINCIDENTType }
     *     
     */
    public void setQueryTT(QueryQTTINCIDENTType value) {
        this.queryTT = value;
    }

}

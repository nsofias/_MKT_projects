
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
 * <p>Java class for stela-sync_synchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stela-sync_synchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SyncSTELLAResponse" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}SyncTTINCIDENTResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stela-sync_synchResponse", namespace = "http://oss.it.telekom.mk/tt/datatypes/stela-sync", propOrder = {
    "syncSTELLAResponse"
})
public class StelaSyncSynchResponse {

    @XmlElement(name = "SyncSTELLAResponse", required = true)
    protected SyncTTINCIDENTResponseType syncSTELLAResponse;

    /**
     * Gets the value of the syncSTELLAResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SyncTTINCIDENTResponseType }
     *     
     */
    public SyncTTINCIDENTResponseType getSyncSTELLAResponse() {
        return syncSTELLAResponse;
    }

    /**
     * Sets the value of the syncSTELLAResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncTTINCIDENTResponseType }
     *     
     */
    public void setSyncSTELLAResponse(SyncTTINCIDENTResponseType value) {
        this.syncSTELLAResponse = value;
    }

}


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
 * &lt;p&gt;Java class for stela-sync_synchRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="stela-sync_synchRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SyncSTELLA" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}SyncTTINCIDENTType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stela-sync_synchRequest", namespace = "http://oss.it.telekom.mk/tt/datatypes/stela-sync", propOrder = {
    "syncSTELLA"
})
public class StelaSyncSynchRequest {

    @XmlElement(name = "SyncSTELLA", required = true)
    protected SyncTTINCIDENTType syncSTELLA;

    /**
     * Gets the value of the syncSTELLA property.
     * 
     * @return
     *     possible object is
     *     {@link SyncTTINCIDENTType }
     *     
     */
    public SyncTTINCIDENTType getSyncSTELLA() {
        return syncSTELLA;
    }

    /**
     * Sets the value of the syncSTELLA property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncTTINCIDENTType }
     *     
     */
    public void setSyncSTELLA(SyncTTINCIDENTType value) {
        this.syncSTELLA = value;
    }

}

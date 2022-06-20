
package TT_incident;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QTTINCIDENTCombinedKeySetType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QTTINCIDENTCombinedKeySetType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="INCIDENT" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="CLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType"/&amp;gt;
 *                   &amp;lt;element name="TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType"/&amp;gt;
 *                   &amp;lt;element name="TICKETUID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTTINCIDENTCombinedKeySetType", propOrder = {
    "incident"
})
public class QTTINCIDENTCombinedKeySetType {

    @XmlElement(name = "INCIDENT")
    protected List<QTTINCIDENTCombinedKeySetType.INCIDENT> incident;

    /**
     * Gets the value of the incident property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the incident property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getINCIDENT().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link QTTINCIDENTCombinedKeySetType.INCIDENT }
     * 
     * 
     */
    public List<QTTINCIDENTCombinedKeySetType.INCIDENT> getINCIDENT() {
        if (incident == null) {
            incident = new ArrayList<QTTINCIDENTCombinedKeySetType.INCIDENT>();
        }
        return this.incident;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="CLASS" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType"/&amp;gt;
     *         &amp;lt;element name="TICKETID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXStringType"/&amp;gt;
     *         &amp;lt;element name="TICKETUID" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}MXLongType"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "_class",
        "ticketid",
        "ticketuid"
    })
    public static class INCIDENT {

        @XmlElement(name = "CLASS", required = true)
        protected MXStringType _class;
        @XmlElement(name = "TICKETID", required = true)
        protected MXStringType ticketid;
        @XmlElement(name = "TICKETUID", required = true, nillable = true)
        protected MXLongType ticketuid;

        /**
         * Gets the value of the class property.
         * 
         * @return
         *     possible object is
         *     {@link MXStringType }
         *     
         */
        public MXStringType getCLASS() {
            return _class;
        }

        /**
         * Sets the value of the class property.
         * 
         * @param value
         *     allowed object is
         *     {@link MXStringType }
         *     
         */
        public void setCLASS(MXStringType value) {
            this._class = value;
        }

        /**
         * Gets the value of the ticketid property.
         * 
         * @return
         *     possible object is
         *     {@link MXStringType }
         *     
         */
        public MXStringType getTICKETID() {
            return ticketid;
        }

        /**
         * Sets the value of the ticketid property.
         * 
         * @param value
         *     allowed object is
         *     {@link MXStringType }
         *     
         */
        public void setTICKETID(MXStringType value) {
            this.ticketid = value;
        }

        /**
         * Gets the value of the ticketuid property.
         * 
         * @return
         *     possible object is
         *     {@link MXLongType }
         *     
         */
        public MXLongType getTICKETUID() {
            return ticketuid;
        }

        /**
         * Sets the value of the ticketuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link MXLongType }
         *     
         */
        public void setTICKETUID(MXLongType value) {
            this.ticketuid = value;
        }

    }

}

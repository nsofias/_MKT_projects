
package ibm_query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTT1CombinedKeySetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTT1CombinedKeySetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCIDENT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainType"/&gt;
 *                   &lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringType"/&gt;
 *                   &lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTT1CombinedKeySetType", propOrder = {
    "incident"
})
public class QTT1CombinedKeySetType {

    @XmlElement(name = "INCIDENT")
    protected List<QTT1CombinedKeySetType.INCIDENT> incident;

    /**
     * Gets the value of the incident property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incident property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINCIDENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QTT1CombinedKeySetType.INCIDENT }
     * 
     * 
     */
    public List<QTT1CombinedKeySetType.INCIDENT> getINCIDENT() {
        if (incident == null) {
            incident = new ArrayList<QTT1CombinedKeySetType.INCIDENT>();
        }
        return this.incident;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CLASS" type="{http://www.ibm.com/maximo}MXDomainType"/&gt;
     *         &lt;element name="TICKETID" type="{http://www.ibm.com/maximo}MXStringType"/&gt;
     *         &lt;element name="TICKETUID" type="{http://www.ibm.com/maximo}MXLongType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
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
        protected MXDomainType _class;
        @XmlElement(name = "TICKETID", required = true)
        protected MXStringType ticketid;
        @XmlElement(name = "TICKETUID", required = true, nillable = true)
        protected MXLongType ticketuid;

        /**
         * Gets the value of the class property.
         * 
         * @return
         *     possible object is
         *     {@link MXDomainType }
         *     
         */
        public MXDomainType getCLASS() {
            return _class;
        }

        /**
         * Sets the value of the class property.
         * 
         * @param value
         *     allowed object is
         *     {@link MXDomainType }
         *     
         */
        public void setCLASS(MXDomainType value) {
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

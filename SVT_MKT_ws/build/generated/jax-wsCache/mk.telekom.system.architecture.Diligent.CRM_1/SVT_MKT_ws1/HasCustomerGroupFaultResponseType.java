
package SVT_MKT_ws1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for HasCustomerGroupFaultResponseType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="HasCustomerGroupFaultResponseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="INCIDENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="INCIDENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasCustomerGroupFaultResponseType", namespace = "http://crm.it.telekom.mk/diligent/datatypes/queryDiligentIncident", propOrder = {
    "incidentid",
    "incidenttype"
})
public class HasCustomerGroupFaultResponseType {

    @XmlElement(name = "INCIDENT_ID", required = true)
    protected String incidentid;
    @XmlElement(name = "INCIDENT_TYPE", required = true)
    protected String incidenttype;

    /**
     * Gets the value of the incidentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCIDENTID() {
        return incidentid;
    }

    /**
     * Sets the value of the incidentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCIDENTID(String value) {
        this.incidentid = value;
    }

    /**
     * Gets the value of the incidenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCIDENTTYPE() {
        return incidenttype;
    }

    /**
     * Sets the value of the incidenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCIDENTTYPE(String value) {
        this.incidenttype = value;
    }

}


package crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HasCustomerGroupFaultResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HasCustomerGroupFaultResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCIDENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="INCIDENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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


package svt_mkt_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EIPingData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EIPingData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="technicalComponent" type="{http://messaging.ei.tmobile.net/datatypes}EIPingTargetType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="subComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIPingData", propOrder = {
    "technicalComponent",
    "subComponent"
})
public class EIPingData {

    @XmlSchemaType(name = "string")
    protected EIPingTargetType technicalComponent;
    protected String subComponent;

    /**
     * Gets the value of the technicalComponent property.
     * 
     * @return
     *     possible object is
     *     {@link EIPingTargetType }
     *     
     */
    public EIPingTargetType getTechnicalComponent() {
        return technicalComponent;
    }

    /**
     * Sets the value of the technicalComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIPingTargetType }
     *     
     */
    public void setTechnicalComponent(EIPingTargetType value) {
        this.technicalComponent = value;
    }

    /**
     * Gets the value of the subComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubComponent() {
        return subComponent;
    }

    /**
     * Sets the value of the subComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubComponent(String value) {
        this.subComponent = value;
    }

}

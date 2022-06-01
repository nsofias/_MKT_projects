
package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EIPingInfo complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EIPingInfo"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="type" type="{http://messaging.ei.tmobile.net/datatypes}EIPingTargetType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="subComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="timeMeasurementCollection" type="{http://messaging.ei.tmobile.net/datatypes}EINamedTimeMeasurementCollection" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIPingInfo", namespace = "http://messaging.ei.tmobile.net/datatypes", propOrder = {
    "type",
    "subComponent",
    "location",
    "version",
    "timeMeasurementCollection"
})
public class EIPingInfo {

    @XmlSchemaType(name = "string")
    protected EIPingTargetType type;
    protected String subComponent;
    protected String location;
    protected String version;
    protected EINamedTimeMeasurementCollection timeMeasurementCollection;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EIPingTargetType }
     *     
     */
    public EIPingTargetType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIPingTargetType }
     *     
     */
    public void setType(EIPingTargetType value) {
        this.type = value;
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

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the timeMeasurementCollection property.
     * 
     * @return
     *     possible object is
     *     {@link EINamedTimeMeasurementCollection }
     *     
     */
    public EINamedTimeMeasurementCollection getTimeMeasurementCollection() {
        return timeMeasurementCollection;
    }

    /**
     * Sets the value of the timeMeasurementCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EINamedTimeMeasurementCollection }
     *     
     */
    public void setTimeMeasurementCollection(EINamedTimeMeasurementCollection value) {
        this.timeMeasurementCollection = value;
    }

}

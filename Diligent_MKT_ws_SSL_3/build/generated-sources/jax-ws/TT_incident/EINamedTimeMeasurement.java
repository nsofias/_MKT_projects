
package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EINamedTimeMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EINamedTimeMeasurement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="durationMillis" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="stopTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EINamedTimeMeasurement", namespace = "http://messaging.ei.tmobile.net/datatypes", propOrder = {
    "description",
    "startTimestamp",
    "durationMillis",
    "stopTimestamp"
})
public class EINamedTimeMeasurement {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimestamp;
    protected long durationMillis;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopTimestamp;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Sets the value of the startTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimestamp(XMLGregorianCalendar value) {
        this.startTimestamp = value;
    }

    /**
     * Gets the value of the durationMillis property.
     * 
     */
    public long getDurationMillis() {
        return durationMillis;
    }

    /**
     * Sets the value of the durationMillis property.
     * 
     */
    public void setDurationMillis(long value) {
        this.durationMillis = value;
    }

    /**
     * Gets the value of the stopTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopTimestamp() {
        return stopTimestamp;
    }

    /**
     * Sets the value of the stopTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopTimestamp(XMLGregorianCalendar value) {
        this.stopTimestamp = value;
    }

}

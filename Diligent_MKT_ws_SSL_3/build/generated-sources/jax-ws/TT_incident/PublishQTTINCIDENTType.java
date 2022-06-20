
package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import TT_incident.runtime.ZeroOneBooleanAdapter;


/**
 * <p>Java class for PublishQTTINCIDENTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishQTTINCIDENTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}QTTINCIDENTSet"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}PublishingContentGroup"/&gt;
 *       &lt;attGroup ref="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}CommonContentGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishQTTINCIDENTType", propOrder = {
    "qttincidentSet"
})
public class PublishQTTINCIDENTType {

    @XmlElement(name = "QTTINCIDENTSet", required = true)
    protected QTTINCIDENTSetType qttincidentSet;
    @XmlAttribute(name = "event")
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected Boolean event;
    @XmlAttribute(name = "creationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlAttribute(name = "baseLanguage")
    protected String baseLanguage;
    @XmlAttribute(name = "transLanguage")
    protected String transLanguage;
    @XmlAttribute(name = "messageID")
    protected String messageID;
    @XmlAttribute(name = "maximoVersion")
    protected String maximoVersion;

    /**
     * Gets the value of the qttincidentSet property.
     * 
     * @return
     *     possible object is
     *     {@link QTTINCIDENTSetType }
     *     
     */
    public QTTINCIDENTSetType getQTTINCIDENTSet() {
        return qttincidentSet;
    }

    /**
     * Sets the value of the qttincidentSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTTINCIDENTSetType }
     *     
     */
    public void setQTTINCIDENTSet(QTTINCIDENTSetType value) {
        this.qttincidentSet = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean isEvent() {
        if (event == null) {
            return new ZeroOneBooleanAdapter().unmarshal("0");
        } else {
            return event;
        }
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(Boolean value) {
        this.event = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the baseLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseLanguage() {
        return baseLanguage;
    }

    /**
     * Sets the value of the baseLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseLanguage(String value) {
        this.baseLanguage = value;
    }

    /**
     * Gets the value of the transLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransLanguage() {
        return transLanguage;
    }

    /**
     * Sets the value of the transLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransLanguage(String value) {
        this.transLanguage = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the maximoVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximoVersion() {
        return maximoVersion;
    }

    /**
     * Sets the value of the maximoVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximoVersion(String value) {
        this.maximoVersion = value;
    }

}

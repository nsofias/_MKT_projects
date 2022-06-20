
package affected_services;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryAFFECTEDSERVICEResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAFFECTEDSERVICEResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ibm.com/maximo}AFFECTEDSERVICESet"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ibm.com/maximo}CommonContentGroup"/&gt;
 *       &lt;attGroup ref="{http://www.ibm.com/maximo}ResponseContentGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAFFECTEDSERVICEResponseType", propOrder = {
    "affectedserviceSet"
})
public class QueryAFFECTEDSERVICEResponseType {

    @XmlElement(name = "AFFECTEDSERVICESet", required = true)
    protected AFFECTEDSERVICESetType affectedserviceSet;
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
    @XmlAttribute(name = "rsStart")
    protected BigInteger rsStart;
    @XmlAttribute(name = "rsCount")
    protected BigInteger rsCount;
    @XmlAttribute(name = "rsTotal")
    protected BigInteger rsTotal;

    /**
     * Gets the value of the affectedserviceSet property.
     * 
     * @return
     *     possible object is
     *     {@link AFFECTEDSERVICESetType }
     *     
     */
    public AFFECTEDSERVICESetType getAFFECTEDSERVICESet() {
        return affectedserviceSet;
    }

    /**
     * Sets the value of the affectedserviceSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFFECTEDSERVICESetType }
     *     
     */
    public void setAFFECTEDSERVICESet(AFFECTEDSERVICESetType value) {
        this.affectedserviceSet = value;
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

    /**
     * Gets the value of the rsStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsStart() {
        return rsStart;
    }

    /**
     * Sets the value of the rsStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsStart(BigInteger value) {
        this.rsStart = value;
    }

    /**
     * Gets the value of the rsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsCount() {
        return rsCount;
    }

    /**
     * Sets the value of the rsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsCount(BigInteger value) {
        this.rsCount = value;
    }

    /**
     * Gets the value of the rsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRsTotal() {
        return rsTotal;
    }

    /**
     * Sets the value of the rsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRsTotal(BigInteger value) {
        this.rsTotal = value;
    }

}


package ibm_query;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ibm_query.runtime.ZeroOneBooleanAdapter;


/**
 * &lt;p&gt;Java class for QueryQTT1Type complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QueryQTT1Type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://www.ibm.com/maximo}QTT1Query"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.ibm.com/maximo}QueryContentGroup"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.ibm.com/maximo}CommonContentGroup"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryQTT1Type", propOrder = {
    "qtt1Query"
})
public class QueryQTT1Type {

    @XmlElement(name = "QTT1Query", required = true)
    protected QTT1QueryType qtt1Query;
    @XmlAttribute(name = "uniqueResult")
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected Boolean uniqueResult;
    @XmlAttribute(name = "maxItems")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxItems;
    @XmlAttribute(name = "rsStart")
    protected BigInteger rsStart;
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
     * Gets the value of the qtt1Query property.
     * 
     * @return
     *     possible object is
     *     {@link QTT1QueryType }
     *     
     */
    public QTT1QueryType getQTT1Query() {
        return qtt1Query;
    }

    /**
     * Sets the value of the qtt1Query property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTT1QueryType }
     *     
     */
    public void setQTT1Query(QTT1QueryType value) {
        this.qtt1Query = value;
    }

    /**
     * Gets the value of the uniqueResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean isUniqueResult() {
        if (uniqueResult == null) {
            return new ZeroOneBooleanAdapter().unmarshal("0");
        } else {
            return uniqueResult;
        }
    }

    /**
     * Sets the value of the uniqueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueResult(Boolean value) {
        this.uniqueResult = value;
    }

    /**
     * Gets the value of the maxItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxItems() {
        return maxItems;
    }

    /**
     * Sets the value of the maxItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxItems(BigInteger value) {
        this.maxItems = value;
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
        if (rsStart == null) {
            return new BigInteger("0");
        } else {
            return rsStart;
        }
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

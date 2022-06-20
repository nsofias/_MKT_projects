
package SVT_MKT_ws1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				The SOABPException2 is the designed default exception of the SOA backplane. All technical
 * 				errors of the web service gateway are delivered by this error structure. It is also recommended 
 * 				to use the SOABPException to deliver business errors.
 * 			
 * 
 * &lt;p&gt;Java class for SOABPException2 complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SOABPException2"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="eiMessageContext" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageContext2"/&amp;gt;
 *         &amp;lt;element name="timestamp" type="{http://messaging.ei.tmobile.net/datatypes}EIExceptionTimeStamp"/&amp;gt;
 *         &amp;lt;element name="originator" type="{http://messaging.ei.tmobile.net/datatypes}EIExceptionOriginator" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="exceptionClass" type="{http://messaging.ei.tmobile.net/datatypes}EIExceptionClass" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="subCode" type="{http://messaging.ei.tmobile.net/datatypes}EIExceptionSubCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="description" type="{http://messaging.ei.tmobile.net/datatypes}EIDescriptionElement" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="completed" type="{http://messaging.ei.tmobile.net/datatypes}EIOperationCompleted" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="stackTraceString" type="{http://messaging.ei.tmobile.net/datatypes}EIExceptionStackTrace" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="furtherInfo" type="{http://messaging.ei.tmobile.net/datatypes}EIExceptionFurtherInfo" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="placeholderValues" type="{http://messaging.ei.tmobile.net/datatypes}EIPlaceholderValueCollection" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOABPException2", propOrder = {
    "eiMessageContext",
    "timestamp",
    "originator",
    "exceptionClass",
    "subCode",
    "description",
    "completed",
    "stackTraceString",
    "furtherInfo",
    "placeholderValues"
})
public class SOABPException2 {

    @XmlElement(required = true)
    protected EIMessageContext2 eiMessageContext;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlSchemaType(name = "anyURI")
    protected String originator;
    protected String exceptionClass;
    protected String subCode;
    protected List<EIDescriptionElement> description;
    @XmlSchemaType(name = "string")
    protected EIOperationCompleted completed;
    protected String stackTraceString;
    protected List<String> furtherInfo;
    protected EIPlaceholderValueCollection placeholderValues;

    /**
     * Gets the value of the eiMessageContext property.
     * 
     * @return
     *     possible object is
     *     {@link EIMessageContext2 }
     *     
     */
    public EIMessageContext2 getEiMessageContext() {
        return eiMessageContext;
    }

    /**
     * Sets the value of the eiMessageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIMessageContext2 }
     *     
     */
    public void setEiMessageContext(EIMessageContext2 value) {
        this.eiMessageContext = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the exceptionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionClass() {
        return exceptionClass;
    }

    /**
     * Sets the value of the exceptionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionClass(String value) {
        this.exceptionClass = value;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the description property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDescription().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EIDescriptionElement }
     * 
     * 
     */
    public List<EIDescriptionElement> getDescription() {
        if (description == null) {
            description = new ArrayList<EIDescriptionElement>();
        }
        return this.description;
    }

    /**
     * Gets the value of the completed property.
     * 
     * @return
     *     possible object is
     *     {@link EIOperationCompleted }
     *     
     */
    public EIOperationCompleted getCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIOperationCompleted }
     *     
     */
    public void setCompleted(EIOperationCompleted value) {
        this.completed = value;
    }

    /**
     * Gets the value of the stackTraceString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTraceString() {
        return stackTraceString;
    }

    /**
     * Sets the value of the stackTraceString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTraceString(String value) {
        this.stackTraceString = value;
    }

    /**
     * Gets the value of the furtherInfo property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the furtherInfo property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFurtherInfo().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFurtherInfo() {
        if (furtherInfo == null) {
            furtherInfo = new ArrayList<String>();
        }
        return this.furtherInfo;
    }

    /**
     * Gets the value of the placeholderValues property.
     * 
     * @return
     *     possible object is
     *     {@link EIPlaceholderValueCollection }
     *     
     */
    public EIPlaceholderValueCollection getPlaceholderValues() {
        return placeholderValues;
    }

    /**
     * Sets the value of the placeholderValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIPlaceholderValueCollection }
     *     
     */
    public void setPlaceholderValues(EIPlaceholderValueCollection value) {
        this.placeholderValues = value;
    }

}

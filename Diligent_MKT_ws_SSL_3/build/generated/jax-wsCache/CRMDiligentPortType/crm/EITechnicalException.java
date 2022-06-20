
package crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		   		DEPRECATED! Please use for new service interfaces the SOABPException2.
 * 			
 * 
 * <p>Java class for EITechnicalException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EITechnicalException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eiMessageContext" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageContext"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exceptionClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stackTraceString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="furtherInfo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EITechnicalException", propOrder = {
    "eiMessageContext",
    "message",
    "exceptionClass",
    "stackTraceString",
    "furtherInfo"
})
public class EITechnicalException {

    @XmlElement(required = true)
    protected EIMessageContext eiMessageContext;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String exceptionClass;
    protected String stackTraceString;
    protected List<String> furtherInfo;

    /**
     * Gets the value of the eiMessageContext property.
     * 
     * @return
     *     possible object is
     *     {@link EIMessageContext }
     *     
     */
    public EIMessageContext getEiMessageContext() {
        return eiMessageContext;
    }

    /**
     * Sets the value of the eiMessageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIMessageContext }
     *     
     */
    public void setEiMessageContext(EIMessageContext value) {
        this.eiMessageContext = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the furtherInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFurtherInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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

}

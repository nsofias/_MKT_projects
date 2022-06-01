
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		   		DEPRECATED! Please use for new service interfaces the EIMessageContext2.
 * 		   	
 * 
 * &lt;p&gt;Java class for EIMessageContext complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EIMessageContext"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="target" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageTarget" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="replyTo" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageReplyTo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="requestId" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageRequestId" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="timeLeft" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageTimeLeft" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="priority" type="{http://messaging.ei.tmobile.net/datatypes}EIMessagePriority" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="redelivered" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageRedelivered" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="revision" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageRevision" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sender" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageSender"/&amp;gt;
 *         &amp;lt;element name="correlationId" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageCorrelationId"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIMessageContext", propOrder = {
    "target",
    "replyTo",
    "requestId",
    "timeLeft",
    "priority",
    "redelivered",
    "revision",
    "sender",
    "correlationId"
})
public class EIMessageContext {

    protected String target;
    protected String replyTo;
    protected String requestId;
    protected Long timeLeft;
    protected Short priority;
    @XmlSchemaType(name = "string")
    protected EIMessageRedelivered redelivered;
    protected String revision;
    @XmlElement(required = true)
    protected String sender;
    @XmlElement(required = true)
    protected String correlationId;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the timeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeLeft() {
        return timeLeft;
    }

    /**
     * Sets the value of the timeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeLeft(Long value) {
        this.timeLeft = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriority(Short value) {
        this.priority = value;
    }

    /**
     * Gets the value of the redelivered property.
     * 
     * @return
     *     possible object is
     *     {@link EIMessageRedelivered }
     *     
     */
    public EIMessageRedelivered getRedelivered() {
        return redelivered;
    }

    /**
     * Sets the value of the redelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIMessageRedelivered }
     *     
     */
    public void setRedelivered(EIMessageRedelivered value) {
        this.redelivered = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

}

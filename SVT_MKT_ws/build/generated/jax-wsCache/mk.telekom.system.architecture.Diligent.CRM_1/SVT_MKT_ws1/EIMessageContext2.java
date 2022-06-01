
package SVT_MKT_ws1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EIMessageContext2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EIMessageContext2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="target" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageTarget" minOccurs="0"/&gt;
 *         &lt;element name="replyTo" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageReplyTo" minOccurs="0"/&gt;
 *         &lt;element name="requestId" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageRequestId" minOccurs="0"/&gt;
 *         &lt;element name="timeLeft" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageTimeLeft" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://messaging.ei.tmobile.net/datatypes}EIMessagePriority" minOccurs="0"/&gt;
 *         &lt;element name="redelivered" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageRedelivered" minOccurs="0"/&gt;
 *         &lt;element name="revision" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageRevision" minOccurs="0"/&gt;
 *         &lt;element name="sender" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageSender"/&gt;
 *         &lt;element name="correlationId" type="{http://messaging.ei.tmobile.net/datatypes}EIMessageCorrelationId"/&gt;
 *         &lt;element name="sequenceId" type="{http://messaging.ei.tmobile.net/datatypes}EISequenceNumber" minOccurs="0"/&gt;
 *         &lt;element name="properties" type="{http://messaging.ei.tmobile.net/datatypes}EIMessagePropertyCollection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIMessageContext2", propOrder = {
    "target",
    "replyTo",
    "requestId",
    "timeLeft",
    "priority",
    "redelivered",
    "revision",
    "sender",
    "correlationId",
    "sequenceId",
    "properties"
})
public class EIMessageContext2 {

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
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceId;
    protected EIMessagePropertyCollection properties;

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

    /**
     * Gets the value of the sequenceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceId(BigInteger value) {
        this.sequenceId = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link EIMessagePropertyCollection }
     *     
     */
    public EIMessagePropertyCollection getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIMessagePropertyCollection }
     *     
     */
    public void setProperties(EIMessagePropertyCollection value) {
        this.properties = value;
    }

}


package svt_mkt_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for customerIssueModel complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="customerIssueModel"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dateEntered" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dateModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="modifiedUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tsrmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="faultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="contactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sendSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tsrmTeamId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="worklog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="teamId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="contactedFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="serviceInFault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="wholesaleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="operatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerIssueModel", namespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/", propOrder = {
    "id",
    "name",
    "dateEntered",
    "dateModified",
    "createdBy",
    "modifiedUserId",
    "description",
    "deleted",
    "tsrmId",
    "faultType",
    "customerId",
    "productId",
    "contactPerson",
    "contactPhone",
    "contactId",
    "sendSms",
    "status",
    "reason",
    "tsrmTeamId",
    "worklog",
    "serviceId",
    "teamId",
    "contactEmail",
    "contactedFailed",
    "serviceInFault",
    "wholesaleId",
    "operatorId"
})
public class CustomerIssueModel {

    @XmlElement(namespace = "")
    protected String id;
    @XmlElement(namespace = "")
    protected String name;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEntered;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateModified;
    @XmlElement(namespace = "")
    protected String createdBy;
    @XmlElement(namespace = "")
    protected String modifiedUserId;
    @XmlElement(namespace = "")
    protected String description;
    @XmlElement(namespace = "")
    protected Integer deleted;
    @XmlElement(namespace = "")
    protected String tsrmId;
    @XmlElement(namespace = "")
    protected String faultType;
    @XmlElement(namespace = "")
    protected String customerId;
    @XmlElement(namespace = "")
    protected String productId;
    @XmlElement(namespace = "")
    protected String contactPerson;
    @XmlElement(namespace = "")
    protected String contactPhone;
    @XmlElement(namespace = "")
    protected String contactId;
    @XmlElement(namespace = "")
    protected String sendSms;
    @XmlElement(namespace = "")
    protected String status;
    @XmlElement(namespace = "")
    protected String reason;
    @XmlElement(namespace = "")
    protected String tsrmTeamId;
    @XmlElement(namespace = "")
    protected String worklog;
    @XmlElement(namespace = "")
    protected String serviceId;
    @XmlElement(namespace = "")
    protected String teamId;
    @XmlElement(namespace = "")
    protected String contactEmail;
    @XmlElement(namespace = "")
    protected Integer contactedFailed;
    @XmlElement(namespace = "")
    protected String serviceInFault;
    @XmlElement(namespace = "")
    protected Integer wholesaleId;
    @XmlElement(namespace = "")
    protected String operatorId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dateEntered property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEntered() {
        return dateEntered;
    }

    /**
     * Sets the value of the dateEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEntered(XMLGregorianCalendar value) {
        this.dateEntered = value;
    }

    /**
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateModified(XMLGregorianCalendar value) {
        this.dateModified = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the modifiedUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    /**
     * Sets the value of the modifiedUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedUserId(String value) {
        this.modifiedUserId = value;
    }

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
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeleted(Integer value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the tsrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsrmId() {
        return tsrmId;
    }

    /**
     * Sets the value of the tsrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsrmId(String value) {
        this.tsrmId = value;
    }

    /**
     * Gets the value of the faultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultType() {
        return faultType;
    }

    /**
     * Sets the value of the faultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultType(String value) {
        this.faultType = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the sendSms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendSms() {
        return sendSms;
    }

    /**
     * Sets the value of the sendSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendSms(String value) {
        this.sendSms = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the tsrmTeamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsrmTeamId() {
        return tsrmTeamId;
    }

    /**
     * Sets the value of the tsrmTeamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsrmTeamId(String value) {
        this.tsrmTeamId = value;
    }

    /**
     * Gets the value of the worklog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorklog() {
        return worklog;
    }

    /**
     * Sets the value of the worklog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorklog(String value) {
        this.worklog = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the teamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the teamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamId(String value) {
        this.teamId = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactedFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContactedFailed() {
        return contactedFailed;
    }

    /**
     * Sets the value of the contactedFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContactedFailed(Integer value) {
        this.contactedFailed = value;
    }

    /**
     * Gets the value of the serviceInFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInFault() {
        return serviceInFault;
    }

    /**
     * Sets the value of the serviceInFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInFault(String value) {
        this.serviceInFault = value;
    }

    /**
     * Gets the value of the wholesaleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWholesaleId() {
        return wholesaleId;
    }

    /**
     * Sets the value of the wholesaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWholesaleId(Integer value) {
        this.wholesaleId = value;
    }

    /**
     * Gets the value of the operatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the value of the operatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

}

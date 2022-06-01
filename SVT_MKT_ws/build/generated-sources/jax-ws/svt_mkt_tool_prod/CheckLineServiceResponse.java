
package svt_mkt_tool_prod;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckLineServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckLineServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Transport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransportDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://servicediagnostictool.telekom.mk/datatypes/diagnostic}ServiceDiagnosticData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckLineServiceResponse", namespace = "http://servicediagnostictool.telekom.mk/datatypes/diagnostic", propOrder = {
    "lineID",
    "status",
    "transport",
    "transportDescription",
    "serviceDiagnosticData"
})
public class CheckLineServiceResponse {

    @XmlElement(name = "LineID", required = true)
    protected String lineID;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Transport", required = true)
    protected String transport;
    @XmlElement(name = "TransportDescription", required = true)
    protected String transportDescription;
    @XmlElement(name = "ServiceDiagnosticData")
    protected List<ServiceDiagnosticData> serviceDiagnosticData;

    /**
     * Gets the value of the lineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineID() {
        return lineID;
    }

    /**
     * Sets the value of the lineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineID(String value) {
        this.lineID = value;
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
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransport(String value) {
        this.transport = value;
    }

    /**
     * Gets the value of the transportDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportDescription() {
        return transportDescription;
    }

    /**
     * Sets the value of the transportDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportDescription(String value) {
        this.transportDescription = value;
    }

    /**
     * Gets the value of the serviceDiagnosticData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDiagnosticData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDiagnosticData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDiagnosticData }
     * 
     * 
     */
    public List<ServiceDiagnosticData> getServiceDiagnosticData() {
        if (serviceDiagnosticData == null) {
            serviceDiagnosticData = new ArrayList<ServiceDiagnosticData>();
        }
        return this.serviceDiagnosticData;
    }

}


package cross_ws.alat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlatResetPortResponse1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlatResetPortResponse1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResetPortResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlatResetPortResponse1", namespace = "http://oss.it.telekom.mk/alat/datatypes/alatmanagement", propOrder = {
    "resetPortResult"
})
public class AlatResetPortResponse1 {

    @XmlElement(name = "ResetPortResult", required = true)
    protected String resetPortResult;

    /**
     * Gets the value of the resetPortResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetPortResult() {
        return resetPortResult;
    }

    /**
     * Sets the value of the resetPortResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetPortResult(String value) {
        this.resetPortResult = value;
    }

}

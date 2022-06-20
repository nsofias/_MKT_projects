
package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import TT_incident.runtime.ZeroOneBooleanAdapter;


/**
 * <p>Java class for MXBooleanQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXBooleanQueryType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://oss.it.telekom.mk/TroubleTicket/ibm/maximo&gt;BooleanType"&gt;
 *       &lt;attribute name="operator" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}QueryOperatorType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXBooleanQueryType", propOrder = {
    "value"
})
public class MXBooleanQueryType {

    @XmlValue
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected Boolean value;
    @XmlAttribute(name = "operator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operator;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

}

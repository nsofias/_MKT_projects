
package ibm_query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ibm_query.runtime.ZeroOneBooleanAdapter;


/**
 * <p>Java class for MXBooleanQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXBooleanQueryType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.ibm.com/maximo&gt;BooleanType"&gt;
 *       &lt;attribute name="operator" type="{http://www.ibm.com/maximo}QueryOperatorType" /&gt;
 *       &lt;attribute name="operandModeOR" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    @XmlAttribute(name = "operandModeOR")
    protected Boolean operandModeOR;

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

    /**
     * Gets the value of the operandModeOR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperandModeOR() {
        return operandModeOR;
    }

    /**
     * Sets the value of the operandModeOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperandModeOR(Boolean value) {
        this.operandModeOR = value;
    }

}

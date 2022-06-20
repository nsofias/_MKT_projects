
package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MXLangStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXLangStringType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="changed" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}ChangeIndicatorType" /&gt;
 *       &lt;attribute name="languageEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="1" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXLangStringType", propOrder = {
    "value"
})
public class MXLangStringType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "changed")
    protected Boolean changed;
    @XmlAttribute(name = "languageEnabled")
    protected Boolean languageEnabled;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
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
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChanged(Boolean value) {
        this.changed = value;
    }

    /**
     * Gets the value of the languageEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLanguageEnabled() {
        if (languageEnabled == null) {
            return true;
        } else {
            return languageEnabled;
        }
    }

    /**
     * Sets the value of the languageEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanguageEnabled(Boolean value) {
        this.languageEnabled = value;
    }

}

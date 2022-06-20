
package svt_mkt_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *        			If used it contains a plain text description of the fault. This description is expected to be
 * 				helpful in explaining the fault to users. There MAY be any number of description elements.
 * 				SOA BP components will always issue their error messages in English.
 * 		        If support for multilingual error messages if desired one may define a description id to
 * 		        enable a lookup for the description text in another language.
 * 		        One may also use placeholders within the text to indicate that a certain variable is used.
 * 		        These placeholder can be inserted in the translatetd text again. The syntax using placeholders 
 * 		        in XML style is favored against the printf style placeholders as the internal application
 * 		        syntax for replacing fragments must not be defined.
 * 		    
 * 
 * &lt;p&gt;Java class for EIDescriptionElement complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EIDescriptionElement"&amp;gt;
 *   &amp;lt;simpleContent&amp;gt;
 *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
 *       &amp;lt;attribute ref="{http://messaging.ei.tmobile.net/datatypes}lang"/&amp;gt;
 *       &amp;lt;attribute name="descId" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIDescriptionElement", propOrder = {
    "value"
})
public class EIDescriptionElement {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "lang", namespace = "http://messaging.ei.tmobile.net/datatypes")
    protected String lang;
    @XmlAttribute(name = "descId", namespace = "http://messaging.ei.tmobile.net/datatypes")
    protected String descId;

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
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        if (lang == null) {
            return "en";
        } else {
            return lang;
        }
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the descId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescId() {
        return descId;
    }

    /**
     * Sets the value of the descId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescId(String value) {
        this.descId = value;
    }

}


package TT_incident;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import TT_incident.runtime.ZeroOneBooleanAdapter;


/**
 * &lt;p&gt;Java class for MXCryptoType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MXCryptoType"&amp;gt;
 *   &amp;lt;simpleContent&amp;gt;
 *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;base64Binary"&amp;gt;
 *       &amp;lt;attribute name="changed" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}ChangeIndicatorType" /&amp;gt;
 *       &amp;lt;attribute name="mxencrypted" type="{http://oss.it.telekom.mk/TroubleTicket/ibm/maximo}BooleanType" default="1" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXCryptoType", propOrder = {
    "value"
})
public class MXCryptoType {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "changed")
    protected Boolean changed;
    @XmlAttribute(name = "mxencrypted")
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected Boolean mxencrypted;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
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
     * Gets the value of the mxencrypted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean isMxencrypted() {
        if (mxencrypted == null) {
            return new ZeroOneBooleanAdapter().unmarshal("1");
        } else {
            return mxencrypted;
        }
    }

    /**
     * Sets the value of the mxencrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMxencrypted(Boolean value) {
        this.mxencrypted = value;
    }

}

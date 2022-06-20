
package svt_mkt_tool_prod;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EIPingTargetType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EIPingTargetType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Client"/&amp;gt;
 *     &amp;lt;enumeration value="Server"/&amp;gt;
 *     &amp;lt;enumeration value="Provider"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EIPingTargetType")
@XmlEnum
public enum EIPingTargetType {

    @XmlEnumValue("Client")
    CLIENT("Client"),
    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("Provider")
    PROVIDER("Provider");
    private final String value;

    EIPingTargetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EIPingTargetType fromValue(String v) {
        for (EIPingTargetType c: EIPingTargetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

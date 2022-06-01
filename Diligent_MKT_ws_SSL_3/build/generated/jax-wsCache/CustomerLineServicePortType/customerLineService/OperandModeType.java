
package customerLineService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OperandModeType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="OperandModeType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&amp;gt;
 *     &amp;lt;enumeration value="OR"/&amp;gt;
 *     &amp;lt;enumeration value="AND"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "OperandModeType")
@XmlEnum
public enum OperandModeType {

    OR,
    AND;

    public String value() {
        return name();
    }

    public static OperandModeType fromValue(String v) {
        return valueOf(v);
    }

}

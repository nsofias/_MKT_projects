
package affected_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperandModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperandModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="OR"/&gt;
 *     &lt;enumeration value="AND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

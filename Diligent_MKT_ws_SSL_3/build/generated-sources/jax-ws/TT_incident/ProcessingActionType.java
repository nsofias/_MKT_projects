
package TT_incident;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ProcessingActionType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ProcessingActionType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&amp;gt;
 *     &amp;lt;enumeration value="Add"/&amp;gt;
 *     &amp;lt;enumeration value="Change"/&amp;gt;
 *     &amp;lt;enumeration value="Replace"/&amp;gt;
 *     &amp;lt;enumeration value="Delete"/&amp;gt;
 *     &amp;lt;enumeration value="AddChange"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ProcessingActionType")
@XmlEnum
public enum ProcessingActionType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("Replace")
    REPLACE("Replace"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("AddChange")
    ADD_CHANGE("AddChange");
    private final String value;

    ProcessingActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessingActionType fromValue(String v) {
        for (ProcessingActionType c: ProcessingActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package svt_mkt_tool_prod;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EIOperationCompleted.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EIOperationCompleted"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="maybe"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EIOperationCompleted")
@XmlEnum
public enum EIOperationCompleted {


    /**
     * 
     * 					    This flag should be issued when it is clear that a operation was not executed. 
     * 					    This might be the case when e.g. the service provider was not reachable.
     * 					
     * 
     */
    @XmlEnumValue("no")
    NO("no"),

    /**
     * 
     * 					   This flag should be used when it is not clear to the sender of the fault if an operation
     * 					   was completed, e.g. when a exception because of an timeout was returned.
     * 					
     * 
     */
    @XmlEnumValue("maybe")
    MAYBE("maybe");
    private final String value;

    EIOperationCompleted(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EIOperationCompleted fromValue(String v) {
        for (EIOperationCompleted c: EIOperationCompleted.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

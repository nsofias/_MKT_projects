
package TT_incident;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EIOperationCompleted.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EIOperationCompleted"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="no"/&amp;gt;
 *     &amp;lt;enumeration value="maybe"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EIOperationCompleted", namespace = "http://messaging.ei.tmobile.net/datatypes")
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

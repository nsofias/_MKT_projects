
package svt_tool;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EIMessageRedelivered.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EIMessageRedelivered"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CLIENT"/&amp;gt;
 *     &amp;lt;enumeration value="SOABP"/&amp;gt;
 *     &amp;lt;enumeration value="MANUAL"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EIMessageRedelivered")
@XmlEnum
public enum EIMessageRedelivered {


    /**
     * redelivery by client-application
     * 
     */
    CLIENT,

    /**
     * redelivery by SOA-Backplane-components (WebService-Gateway or JMS-Server)
     * 
     */
    SOABP,

    /**
     * redelivery by human interaction (e.g. message-warehouse-operator)
     * 
     */
    MANUAL;

    public String value() {
        return name();
    }

    public static EIMessageRedelivered fromValue(String v) {
        return valueOf(v);
    }

}

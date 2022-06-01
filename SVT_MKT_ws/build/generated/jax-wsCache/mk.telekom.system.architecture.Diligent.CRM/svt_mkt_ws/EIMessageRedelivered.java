
package svt_mkt_ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EIMessageRedelivered.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EIMessageRedelivered"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLIENT"/&gt;
 *     &lt;enumeration value="SOABP"/&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

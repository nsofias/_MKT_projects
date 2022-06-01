
package mk.telekom.it.crm.diligent.services.diligent;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.tmobile.ei.messaging.datatypes.SOABPException2;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mk.telekom.it.crm.diligent.services.diligent package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TechnicalExceptionElement_QNAME = new QName("http://crm.it.telekom.mk/diligent/services/Diligent", "TechnicalExceptionElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mk.telekom.it.crm.diligent.services.diligent
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckMassiveFaultByLine }
     * 
     */
    public CheckMassiveFaultByLine createCheckMassiveFaultByLine() {
        return new CheckMassiveFaultByLine();
    }

    /**
     * Create an instance of {@link CheckMassiveFaultByLineOutput }
     * 
     */
    public CheckMassiveFaultByLineOutput createCheckMassiveFaultByLineOutput() {
        return new CheckMassiveFaultByLineOutput();
    }

    /**
     * Create an instance of {@link GetLineMetrics }
     * 
     */
    public GetLineMetrics createGetLineMetrics() {
        return new GetLineMetrics();
    }

    /**
     * Create an instance of {@link GetLineMetricsOutput }
     * 
     */
    public GetLineMetricsOutput createGetLineMetricsOutput() {
        return new GetLineMetricsOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOABPException2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SOABPException2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://crm.it.telekom.mk/diligent/services/Diligent", name = "TechnicalExceptionElement")
    public JAXBElement<SOABPException2> createTechnicalExceptionElement(SOABPException2 value) {
        return new JAXBElement<SOABPException2>(_TechnicalExceptionElement_QNAME, SOABPException2 .class, null, value);
    }

}

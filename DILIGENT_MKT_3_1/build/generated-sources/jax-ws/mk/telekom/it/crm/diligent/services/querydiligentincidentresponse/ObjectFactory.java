
package mk.telekom.it.crm.diligent.services.querydiligentincidentresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.tmobile.ei.messaging.datatypes.SOABPException2;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mk.telekom.it.crm.diligent.services.querydiligentincidentresponse package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _TechnicalExceptionElement_QNAME = new QName("http://crm.it.telekom.mk/diligent/services/queryDiligentIncidentResponse", "TechnicalExceptionElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mk.telekom.it.crm.diligent.services.querydiligentincidentresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MarkAffectedResponse }
     * 
     */
    public MarkAffectedResponse createMarkAffectedResponse() {
        return new MarkAffectedResponse();
    }

    /**
     * Create an instance of {@link MarkAffectedResponseOutput }
     * 
     */
    public MarkAffectedResponseOutput createMarkAffectedResponseOutput() {
        return new MarkAffectedResponseOutput();
    }

    /**
     * Create an instance of {@link ReleaseAffectedResponse }
     * 
     */
    public ReleaseAffectedResponse createReleaseAffectedResponse() {
        return new ReleaseAffectedResponse();
    }

    /**
     * Create an instance of {@link ReleaseAffectedResponseOutput }
     * 
     */
    public ReleaseAffectedResponseOutput createReleaseAffectedResponseOutput() {
        return new ReleaseAffectedResponseOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOABPException2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SOABPException2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncidentResponse", name = "TechnicalExceptionElement")
    public JAXBElement<SOABPException2> createTechnicalExceptionElement(SOABPException2 value) {
        return new JAXBElement<SOABPException2>(_TechnicalExceptionElement_QNAME, SOABPException2 .class, null, value);
    }

}

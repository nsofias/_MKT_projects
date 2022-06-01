
package svt_mkt_tool_prod;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the svt_mkt_tool_prod package. 
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

    private final static QName _TechnicalExceptionElement_QNAME = new QName("http://servicediagnostictool.telekom.mk/service/diagnostic", "TechnicalExceptionElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: svt_mkt_tool_prod
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckLineService }
     * 
     */
    public CheckLineService createCheckLineService() {
        return new CheckLineService();
    }

    /**
     * Create an instance of {@link EIMessageContext2 }
     * 
     */
    public EIMessageContext2 createEIMessageContext2() {
        return new EIMessageContext2();
    }

    /**
     * Create an instance of {@link CheckLineServiceRequest }
     * 
     */
    public CheckLineServiceRequest createCheckLineServiceRequest() {
        return new CheckLineServiceRequest();
    }

    /**
     * Create an instance of {@link CheckLineServiceOutput }
     * 
     */
    public CheckLineServiceOutput createCheckLineServiceOutput() {
        return new CheckLineServiceOutput();
    }

    /**
     * Create an instance of {@link CheckLineServiceResponse }
     * 
     */
    public CheckLineServiceResponse createCheckLineServiceResponse() {
        return new CheckLineServiceResponse();
    }

    /**
     * Create an instance of {@link SOABPException2 }
     * 
     */
    public SOABPException2 createSOABPException2() {
        return new SOABPException2();
    }

    /**
     * Create an instance of {@link DiagnosticData }
     * 
     */
    public DiagnosticData createDiagnosticData() {
        return new DiagnosticData();
    }

    /**
     * Create an instance of {@link ServiceDiagnosticData }
     * 
     */
    public ServiceDiagnosticData createServiceDiagnosticData() {
        return new ServiceDiagnosticData();
    }

    /**
     * Create an instance of {@link EIDescriptionElement }
     * 
     */
    public EIDescriptionElement createEIDescriptionElement() {
        return new EIDescriptionElement();
    }

    /**
     * Create an instance of {@link EIEmpty }
     * 
     */
    public EIEmpty createEIEmpty() {
        return new EIEmpty();
    }

    /**
     * Create an instance of {@link EIEmptyRequest }
     * 
     */
    public EIEmptyRequest createEIEmptyRequest() {
        return new EIEmptyRequest();
    }

    /**
     * Create an instance of {@link EIEmptyRequest2 }
     * 
     */
    public EIEmptyRequest2 createEIEmptyRequest2() {
        return new EIEmptyRequest2();
    }

    /**
     * Create an instance of {@link EIEmptyResponse }
     * 
     */
    public EIEmptyResponse createEIEmptyResponse() {
        return new EIEmptyResponse();
    }

    /**
     * Create an instance of {@link EIEmptyResponse2 }
     * 
     */
    public EIEmptyResponse2 createEIEmptyResponse2() {
        return new EIEmptyResponse2();
    }

    /**
     * Create an instance of {@link EIMessageContext }
     * 
     */
    public EIMessageContext createEIMessageContext() {
        return new EIMessageContext();
    }

    /**
     * Create an instance of {@link EIMessageProperty }
     * 
     */
    public EIMessageProperty createEIMessageProperty() {
        return new EIMessageProperty();
    }

    /**
     * Create an instance of {@link EIMessagePropertyCollection }
     * 
     */
    public EIMessagePropertyCollection createEIMessagePropertyCollection() {
        return new EIMessagePropertyCollection();
    }

    /**
     * Create an instance of {@link EINamedTimeMeasurement }
     * 
     */
    public EINamedTimeMeasurement createEINamedTimeMeasurement() {
        return new EINamedTimeMeasurement();
    }

    /**
     * Create an instance of {@link EINamedTimeMeasurementCollection }
     * 
     */
    public EINamedTimeMeasurementCollection createEINamedTimeMeasurementCollection() {
        return new EINamedTimeMeasurementCollection();
    }

    /**
     * Create an instance of {@link EIPingData }
     * 
     */
    public EIPingData createEIPingData() {
        return new EIPingData();
    }

    /**
     * Create an instance of {@link EIPingInfo }
     * 
     */
    public EIPingInfo createEIPingInfo() {
        return new EIPingInfo();
    }

    /**
     * Create an instance of {@link EIPingInfoCollection }
     * 
     */
    public EIPingInfoCollection createEIPingInfoCollection() {
        return new EIPingInfoCollection();
    }

    /**
     * Create an instance of {@link EIPingRequest }
     * 
     */
    public EIPingRequest createEIPingRequest() {
        return new EIPingRequest();
    }

    /**
     * Create an instance of {@link EIPingResponse }
     * 
     */
    public EIPingResponse createEIPingResponse() {
        return new EIPingResponse();
    }

    /**
     * Create an instance of {@link EIPlaceholderValue }
     * 
     */
    public EIPlaceholderValue createEIPlaceholderValue() {
        return new EIPlaceholderValue();
    }

    /**
     * Create an instance of {@link EIPlaceholderValueCollection }
     * 
     */
    public EIPlaceholderValueCollection createEIPlaceholderValueCollection() {
        return new EIPlaceholderValueCollection();
    }

    /**
     * Create an instance of {@link EITechnicalException }
     * 
     */
    public EITechnicalException createEITechnicalException() {
        return new EITechnicalException();
    }

    /**
     * Create an instance of {@link SOABPException }
     * 
     */
    public SOABPException createSOABPException() {
        return new SOABPException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOABPException2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SOABPException2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicediagnostictool.telekom.mk/service/diagnostic", name = "TechnicalExceptionElement")
    public JAXBElement<SOABPException2> createTechnicalExceptionElement(SOABPException2 value) {
        return new JAXBElement<SOABPException2>(_TechnicalExceptionElement_QNAME, SOABPException2 .class, null, value);
    }

}

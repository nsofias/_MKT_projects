
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _TechnicalExceptionElement_QNAME = new QName("http://diligent.it.telekom.mk/diligent/services/NeighbourTool", "TechnicalExceptionElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNeighbourDataByLine }
     * 
     */
    public GetNeighbourDataByLine createGetNeighbourDataByLine() {
        return new GetNeighbourDataByLine();
    }

    /**
     * Create an instance of {@link EIMessageContext2 }
     * 
     */
    public EIMessageContext2 createEIMessageContext2() {
        return new EIMessageContext2();
    }

    /**
     * Create an instance of {@link GetNeighbourDataByLineRequest }
     * 
     */
    public GetNeighbourDataByLineRequest createGetNeighbourDataByLineRequest() {
        return new GetNeighbourDataByLineRequest();
    }

    /**
     * Create an instance of {@link GetNeighbourDataByLineOutput }
     * 
     */
    public GetNeighbourDataByLineOutput createGetNeighbourDataByLineOutput() {
        return new GetNeighbourDataByLineOutput();
    }

    /**
     * Create an instance of {@link GetNeighbourDataByLineResponse }
     * 
     */
    public GetNeighbourDataByLineResponse createGetNeighbourDataByLineResponse() {
        return new GetNeighbourDataByLineResponse();
    }

    /**
     * Create an instance of {@link SOABPException2 }
     * 
     */
    public SOABPException2 createSOABPException2() {
        return new SOABPException2();
    }

    /**
     * Create an instance of {@link NeighbourDataMetrics }
     * 
     */
    public NeighbourDataMetrics createNeighbourDataMetrics() {
        return new NeighbourDataMetrics();
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
    @XmlElementDecl(namespace = "http://diligent.it.telekom.mk/diligent/services/NeighbourTool", name = "TechnicalExceptionElement")
    public JAXBElement<SOABPException2> createTechnicalExceptionElement(SOABPException2 value) {
        return new JAXBElement<SOABPException2>(_TechnicalExceptionElement_QNAME, SOABPException2 .class, null, value);
    }

}


package customerLineService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the customerLineService package. 
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

    private final static QName _TechnicalExceptionElement_QNAME = new QName("http://oss.it.telekom.mk/tt/services/customerLineService", "TechnicalExceptionElement");
    private final static QName _CUSTOMERLINEID_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CUSTOMERLINEID");
    private final static QName _CUSTOMERLINEIDMbo_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CUSTOMERLINEIDMbo");
    private final static QName _CUSTOMERLINEIDMboKey_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CUSTOMERLINEIDMboKey");
    private final static QName _CUSTOMERLINEIDMboKeySet_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CUSTOMERLINEIDMboKeySet");
    private final static QName _CUSTOMERLINEIDMboQuery_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CUSTOMERLINEIDMboQuery");
    private final static QName _CUSTOMERLINEIDMboSet_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CUSTOMERLINEIDMboSet");
    private final static QName _CUSTOMERLINEIDQuery_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CUSTOMERLINEIDQuery");
    private final static QName _CUSTOMERLINEIDSet_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CUSTOMERLINEIDSet");
    private final static QName _CreateCUSTOMERLINEID_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CreateCUSTOMERLINEID");
    private final static QName _CreateCUSTOMERLINEIDResponse_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CreateCUSTOMERLINEIDResponse");
    private final static QName _DeleteCUSTOMERLINEID_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "DeleteCUSTOMERLINEID");
    private final static QName _DeleteCUSTOMERLINEIDResponse_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "DeleteCUSTOMERLINEIDResponse");
    private final static QName _InvokeCUSTOMERLINEID_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "InvokeCUSTOMERLINEID");
    private final static QName _InvokeCUSTOMERLINEIDResponse_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "InvokeCUSTOMERLINEIDResponse");
    private final static QName _PublishCUSTOMERLINEID_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "PublishCUSTOMERLINEID");
    private final static QName _QueryCUSTOMERLINEID_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "QueryCUSTOMERLINEID");
    private final static QName _QueryCUSTOMERLINEIDResponse_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "QueryCUSTOMERLINEIDResponse");
    private final static QName _SyncCUSTOMERLINEID_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "SyncCUSTOMERLINEID");
    private final static QName _SyncCUSTOMERLINEIDResponse_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "SyncCUSTOMERLINEIDResponse");
    private final static QName _UpdateCUSTOMERLINEID_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "UpdateCUSTOMERLINEID");
    private final static QName _UpdateCUSTOMERLINEIDResponse_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "UpdateCUSTOMERLINEIDResponse");
    private final static QName _CUSTOMERLINEIDCUSTOMERLINEIDTypeCHANGEDATE_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CHANGEDATE");
    private final static QName _CUSTOMERLINEIDCUSTOMERLINEIDTypeCUSTOMERLINEIDID_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "CUSTOMERLINEIDID");
    private final static QName _CUSTOMERLINEIDCUSTOMERLINEIDTypeENDTIME_QNAME = new QName("http://oss.it.telekom.mk/tt/datatypes/customerLineService", "ENDTIME");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: customerLineService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDCombinedKeySetType }
     * 
     */
    public CUSTOMERLINEIDCombinedKeySetType createCUSTOMERLINEIDCombinedKeySetType() {
        return new CUSTOMERLINEIDCombinedKeySetType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDQueryType }
     * 
     */
    public CUSTOMERLINEIDQueryType createCUSTOMERLINEIDQueryType() {
        return new CUSTOMERLINEIDQueryType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDMboQueryType }
     * 
     */
    public CUSTOMERLINEIDMboQueryType createCUSTOMERLINEIDMboQueryType() {
        return new CUSTOMERLINEIDMboQueryType();
    }

    /**
     * Create an instance of {@link SyncCUSTOMERLINEID }
     * 
     */
    public SyncCUSTOMERLINEID createSyncCUSTOMERLINEID() {
        return new SyncCUSTOMERLINEID();
    }

    /**
     * Create an instance of {@link EIMessageContext2 }
     * 
     */
    public EIMessageContext2 createEIMessageContext2() {
        return new EIMessageContext2();
    }

    /**
     * Create an instance of {@link SyncCUSTOMERLINEIDType }
     * 
     */
    public SyncCUSTOMERLINEIDType createSyncCUSTOMERLINEIDType() {
        return new SyncCUSTOMERLINEIDType();
    }

    /**
     * Create an instance of {@link SyncCUSTOMERLINEIDResponse }
     * 
     */
    public SyncCUSTOMERLINEIDResponse createSyncCUSTOMERLINEIDResponse() {
        return new SyncCUSTOMERLINEIDResponse();
    }

    /**
     * Create an instance of {@link SyncCUSTOMERLINEIDResponseType }
     * 
     */
    public SyncCUSTOMERLINEIDResponseType createSyncCUSTOMERLINEIDResponseType() {
        return new SyncCUSTOMERLINEIDResponseType();
    }

    /**
     * Create an instance of {@link SOABPException2 }
     * 
     */
    public SOABPException2 createSOABPException2() {
        return new SOABPException2();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDType }
     * 
     */
    public CUSTOMERLINEIDType createCUSTOMERLINEIDType() {
        return new CUSTOMERLINEIDType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDMboType }
     * 
     */
    public CUSTOMERLINEIDMboType createCUSTOMERLINEIDMboType() {
        return new CUSTOMERLINEIDMboType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDMboKeyType }
     * 
     */
    public CUSTOMERLINEIDMboKeyType createCUSTOMERLINEIDMboKeyType() {
        return new CUSTOMERLINEIDMboKeyType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDMboKeySetType }
     * 
     */
    public CUSTOMERLINEIDMboKeySetType createCUSTOMERLINEIDMboKeySetType() {
        return new CUSTOMERLINEIDMboKeySetType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDMboSetType }
     * 
     */
    public CUSTOMERLINEIDMboSetType createCUSTOMERLINEIDMboSetType() {
        return new CUSTOMERLINEIDMboSetType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDSetType }
     * 
     */
    public CUSTOMERLINEIDSetType createCUSTOMERLINEIDSetType() {
        return new CUSTOMERLINEIDSetType();
    }

    /**
     * Create an instance of {@link CreateCUSTOMERLINEIDType }
     * 
     */
    public CreateCUSTOMERLINEIDType createCreateCUSTOMERLINEIDType() {
        return new CreateCUSTOMERLINEIDType();
    }

    /**
     * Create an instance of {@link CreateCUSTOMERLINEIDResponseType }
     * 
     */
    public CreateCUSTOMERLINEIDResponseType createCreateCUSTOMERLINEIDResponseType() {
        return new CreateCUSTOMERLINEIDResponseType();
    }

    /**
     * Create an instance of {@link DeleteCUSTOMERLINEIDType }
     * 
     */
    public DeleteCUSTOMERLINEIDType createDeleteCUSTOMERLINEIDType() {
        return new DeleteCUSTOMERLINEIDType();
    }

    /**
     * Create an instance of {@link DeleteCUSTOMERLINEIDResponseType }
     * 
     */
    public DeleteCUSTOMERLINEIDResponseType createDeleteCUSTOMERLINEIDResponseType() {
        return new DeleteCUSTOMERLINEIDResponseType();
    }

    /**
     * Create an instance of {@link InvokeCUSTOMERLINEIDType }
     * 
     */
    public InvokeCUSTOMERLINEIDType createInvokeCUSTOMERLINEIDType() {
        return new InvokeCUSTOMERLINEIDType();
    }

    /**
     * Create an instance of {@link InvokeCUSTOMERLINEIDResponseType }
     * 
     */
    public InvokeCUSTOMERLINEIDResponseType createInvokeCUSTOMERLINEIDResponseType() {
        return new InvokeCUSTOMERLINEIDResponseType();
    }

    /**
     * Create an instance of {@link PublishCUSTOMERLINEIDType }
     * 
     */
    public PublishCUSTOMERLINEIDType createPublishCUSTOMERLINEIDType() {
        return new PublishCUSTOMERLINEIDType();
    }

    /**
     * Create an instance of {@link QueryCUSTOMERLINEIDType }
     * 
     */
    public QueryCUSTOMERLINEIDType createQueryCUSTOMERLINEIDType() {
        return new QueryCUSTOMERLINEIDType();
    }

    /**
     * Create an instance of {@link QueryCUSTOMERLINEIDResponseType }
     * 
     */
    public QueryCUSTOMERLINEIDResponseType createQueryCUSTOMERLINEIDResponseType() {
        return new QueryCUSTOMERLINEIDResponseType();
    }

    /**
     * Create an instance of {@link UpdateCUSTOMERLINEIDType }
     * 
     */
    public UpdateCUSTOMERLINEIDType createUpdateCUSTOMERLINEIDType() {
        return new UpdateCUSTOMERLINEIDType();
    }

    /**
     * Create an instance of {@link UpdateCUSTOMERLINEIDResponseType }
     * 
     */
    public UpdateCUSTOMERLINEIDResponseType createUpdateCUSTOMERLINEIDResponseType() {
        return new UpdateCUSTOMERLINEIDResponseType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDKeyType }
     * 
     */
    public CUSTOMERLINEIDKeyType createCUSTOMERLINEIDKeyType() {
        return new CUSTOMERLINEIDKeyType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDObjectType }
     * 
     */
    public CUSTOMERLINEIDObjectType createCUSTOMERLINEIDObjectType() {
        return new CUSTOMERLINEIDObjectType();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDCUSTOMERLINEIDType }
     * 
     */
    public CUSTOMERLINEIDCUSTOMERLINEIDType createCUSTOMERLINEIDCUSTOMERLINEIDType() {
        return new CUSTOMERLINEIDCUSTOMERLINEIDType();
    }

    /**
     * Create an instance of {@link MXBinaryType }
     * 
     */
    public MXBinaryType createMXBinaryType() {
        return new MXBinaryType();
    }

    /**
     * Create an instance of {@link MXBooleanQueryType }
     * 
     */
    public MXBooleanQueryType createMXBooleanQueryType() {
        return new MXBooleanQueryType();
    }

    /**
     * Create an instance of {@link MXBooleanType }
     * 
     */
    public MXBooleanType createMXBooleanType() {
        return new MXBooleanType();
    }

    /**
     * Create an instance of {@link MXCryptoType }
     * 
     */
    public MXCryptoType createMXCryptoType() {
        return new MXCryptoType();
    }

    /**
     * Create an instance of {@link MXDateTimeQueryType }
     * 
     */
    public MXDateTimeQueryType createMXDateTimeQueryType() {
        return new MXDateTimeQueryType();
    }

    /**
     * Create an instance of {@link MXDateTimeType }
     * 
     */
    public MXDateTimeType createMXDateTimeType() {
        return new MXDateTimeType();
    }

    /**
     * Create an instance of {@link MXDomainQueryType }
     * 
     */
    public MXDomainQueryType createMXDomainQueryType() {
        return new MXDomainQueryType();
    }

    /**
     * Create an instance of {@link MXDomainType }
     * 
     */
    public MXDomainType createMXDomainType() {
        return new MXDomainType();
    }

    /**
     * Create an instance of {@link MXDoubleQueryType }
     * 
     */
    public MXDoubleQueryType createMXDoubleQueryType() {
        return new MXDoubleQueryType();
    }

    /**
     * Create an instance of {@link MXDoubleType }
     * 
     */
    public MXDoubleType createMXDoubleType() {
        return new MXDoubleType();
    }

    /**
     * Create an instance of {@link MXFloatQueryType }
     * 
     */
    public MXFloatQueryType createMXFloatQueryType() {
        return new MXFloatQueryType();
    }

    /**
     * Create an instance of {@link MXFloatType }
     * 
     */
    public MXFloatType createMXFloatType() {
        return new MXFloatType();
    }

    /**
     * Create an instance of {@link MXGLAccountQueryType }
     * 
     */
    public MXGLAccountQueryType createMXGLAccountQueryType() {
        return new MXGLAccountQueryType();
    }

    /**
     * Create an instance of {@link MXGLAccountType }
     * 
     */
    public MXGLAccountType createMXGLAccountType() {
        return new MXGLAccountType();
    }

    /**
     * Create an instance of {@link MXGLComponentQueryType }
     * 
     */
    public MXGLComponentQueryType createMXGLComponentQueryType() {
        return new MXGLComponentQueryType();
    }

    /**
     * Create an instance of {@link MXGLComponentType }
     * 
     */
    public MXGLComponentType createMXGLComponentType() {
        return new MXGLComponentType();
    }

    /**
     * Create an instance of {@link MXIntQueryType }
     * 
     */
    public MXIntQueryType createMXIntQueryType() {
        return new MXIntQueryType();
    }

    /**
     * Create an instance of {@link MXIntType }
     * 
     */
    public MXIntType createMXIntType() {
        return new MXIntType();
    }

    /**
     * Create an instance of {@link MXLangStringType }
     * 
     */
    public MXLangStringType createMXLangStringType() {
        return new MXLangStringType();
    }

    /**
     * Create an instance of {@link MXLongQueryType }
     * 
     */
    public MXLongQueryType createMXLongQueryType() {
        return new MXLongQueryType();
    }

    /**
     * Create an instance of {@link MXLongType }
     * 
     */
    public MXLongType createMXLongType() {
        return new MXLongType();
    }

    /**
     * Create an instance of {@link MXStringQueryType }
     * 
     */
    public MXStringQueryType createMXStringQueryType() {
        return new MXStringQueryType();
    }

    /**
     * Create an instance of {@link MXStringType }
     * 
     */
    public MXStringType createMXStringType() {
        return new MXStringType();
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
     * Create an instance of {@link CUSTOMERLINEIDCombinedKeySetType.CUSTOMERLINEID }
     * 
     */
    public CUSTOMERLINEIDCombinedKeySetType.CUSTOMERLINEID createCUSTOMERLINEIDCombinedKeySetTypeCUSTOMERLINEID() {
        return new CUSTOMERLINEIDCombinedKeySetType.CUSTOMERLINEID();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDQueryType.CUSTOMERLINEID }
     * 
     */
    public CUSTOMERLINEIDQueryType.CUSTOMERLINEID createCUSTOMERLINEIDQueryTypeCUSTOMERLINEID() {
        return new CUSTOMERLINEIDQueryType.CUSTOMERLINEID();
    }

    /**
     * Create an instance of {@link CUSTOMERLINEIDMboQueryType.CUSTOMERLINEID }
     * 
     */
    public CUSTOMERLINEIDMboQueryType.CUSTOMERLINEID createCUSTOMERLINEIDMboQueryTypeCUSTOMERLINEID() {
        return new CUSTOMERLINEIDMboQueryType.CUSTOMERLINEID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOABPException2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SOABPException2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/services/customerLineService", name = "TechnicalExceptionElement")
    public JAXBElement<SOABPException2> createTechnicalExceptionElement(SOABPException2 value) {
        return new JAXBElement<SOABPException2>(_TechnicalExceptionElement_QNAME, SOABPException2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEID")
    public JAXBElement<CUSTOMERLINEIDType> createCUSTOMERLINEID(CUSTOMERLINEIDType value) {
        return new JAXBElement<CUSTOMERLINEIDType>(_CUSTOMERLINEID_QNAME, CUSTOMERLINEIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEIDMbo")
    public JAXBElement<CUSTOMERLINEIDMboType> createCUSTOMERLINEIDMbo(CUSTOMERLINEIDMboType value) {
        return new JAXBElement<CUSTOMERLINEIDMboType>(_CUSTOMERLINEIDMbo_QNAME, CUSTOMERLINEIDMboType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboKeyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboKeyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEIDMboKey")
    public JAXBElement<CUSTOMERLINEIDMboKeyType> createCUSTOMERLINEIDMboKey(CUSTOMERLINEIDMboKeyType value) {
        return new JAXBElement<CUSTOMERLINEIDMboKeyType>(_CUSTOMERLINEIDMboKey_QNAME, CUSTOMERLINEIDMboKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboKeySetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboKeySetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEIDMboKeySet")
    public JAXBElement<CUSTOMERLINEIDMboKeySetType> createCUSTOMERLINEIDMboKeySet(CUSTOMERLINEIDMboKeySetType value) {
        return new JAXBElement<CUSTOMERLINEIDMboKeySetType>(_CUSTOMERLINEIDMboKeySet_QNAME, CUSTOMERLINEIDMboKeySetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEIDMboQuery")
    public JAXBElement<CUSTOMERLINEIDMboQueryType> createCUSTOMERLINEIDMboQuery(CUSTOMERLINEIDMboQueryType value) {
        return new JAXBElement<CUSTOMERLINEIDMboQueryType>(_CUSTOMERLINEIDMboQuery_QNAME, CUSTOMERLINEIDMboQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboSetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDMboSetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEIDMboSet")
    public JAXBElement<CUSTOMERLINEIDMboSetType> createCUSTOMERLINEIDMboSet(CUSTOMERLINEIDMboSetType value) {
        return new JAXBElement<CUSTOMERLINEIDMboSetType>(_CUSTOMERLINEIDMboSet_QNAME, CUSTOMERLINEIDMboSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEIDQuery")
    public JAXBElement<CUSTOMERLINEIDQueryType> createCUSTOMERLINEIDQuery(CUSTOMERLINEIDQueryType value) {
        return new JAXBElement<CUSTOMERLINEIDQueryType>(_CUSTOMERLINEIDQuery_QNAME, CUSTOMERLINEIDQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDSetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CUSTOMERLINEIDSetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEIDSet")
    public JAXBElement<CUSTOMERLINEIDSetType> createCUSTOMERLINEIDSet(CUSTOMERLINEIDSetType value) {
        return new JAXBElement<CUSTOMERLINEIDSetType>(_CUSTOMERLINEIDSet_QNAME, CUSTOMERLINEIDSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCUSTOMERLINEIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCUSTOMERLINEIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CreateCUSTOMERLINEID")
    public JAXBElement<CreateCUSTOMERLINEIDType> createCreateCUSTOMERLINEID(CreateCUSTOMERLINEIDType value) {
        return new JAXBElement<CreateCUSTOMERLINEIDType>(_CreateCUSTOMERLINEID_QNAME, CreateCUSTOMERLINEIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCUSTOMERLINEIDResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCUSTOMERLINEIDResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CreateCUSTOMERLINEIDResponse")
    public JAXBElement<CreateCUSTOMERLINEIDResponseType> createCreateCUSTOMERLINEIDResponse(CreateCUSTOMERLINEIDResponseType value) {
        return new JAXBElement<CreateCUSTOMERLINEIDResponseType>(_CreateCUSTOMERLINEIDResponse_QNAME, CreateCUSTOMERLINEIDResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCUSTOMERLINEIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCUSTOMERLINEIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "DeleteCUSTOMERLINEID")
    public JAXBElement<DeleteCUSTOMERLINEIDType> createDeleteCUSTOMERLINEID(DeleteCUSTOMERLINEIDType value) {
        return new JAXBElement<DeleteCUSTOMERLINEIDType>(_DeleteCUSTOMERLINEID_QNAME, DeleteCUSTOMERLINEIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCUSTOMERLINEIDResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCUSTOMERLINEIDResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "DeleteCUSTOMERLINEIDResponse")
    public JAXBElement<DeleteCUSTOMERLINEIDResponseType> createDeleteCUSTOMERLINEIDResponse(DeleteCUSTOMERLINEIDResponseType value) {
        return new JAXBElement<DeleteCUSTOMERLINEIDResponseType>(_DeleteCUSTOMERLINEIDResponse_QNAME, DeleteCUSTOMERLINEIDResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeCUSTOMERLINEIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvokeCUSTOMERLINEIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "InvokeCUSTOMERLINEID")
    public JAXBElement<InvokeCUSTOMERLINEIDType> createInvokeCUSTOMERLINEID(InvokeCUSTOMERLINEIDType value) {
        return new JAXBElement<InvokeCUSTOMERLINEIDType>(_InvokeCUSTOMERLINEID_QNAME, InvokeCUSTOMERLINEIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeCUSTOMERLINEIDResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvokeCUSTOMERLINEIDResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "InvokeCUSTOMERLINEIDResponse")
    public JAXBElement<InvokeCUSTOMERLINEIDResponseType> createInvokeCUSTOMERLINEIDResponse(InvokeCUSTOMERLINEIDResponseType value) {
        return new JAXBElement<InvokeCUSTOMERLINEIDResponseType>(_InvokeCUSTOMERLINEIDResponse_QNAME, InvokeCUSTOMERLINEIDResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishCUSTOMERLINEIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublishCUSTOMERLINEIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "PublishCUSTOMERLINEID")
    public JAXBElement<PublishCUSTOMERLINEIDType> createPublishCUSTOMERLINEID(PublishCUSTOMERLINEIDType value) {
        return new JAXBElement<PublishCUSTOMERLINEIDType>(_PublishCUSTOMERLINEID_QNAME, PublishCUSTOMERLINEIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCUSTOMERLINEIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryCUSTOMERLINEIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "QueryCUSTOMERLINEID")
    public JAXBElement<QueryCUSTOMERLINEIDType> createQueryCUSTOMERLINEID(QueryCUSTOMERLINEIDType value) {
        return new JAXBElement<QueryCUSTOMERLINEIDType>(_QueryCUSTOMERLINEID_QNAME, QueryCUSTOMERLINEIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCUSTOMERLINEIDResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryCUSTOMERLINEIDResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "QueryCUSTOMERLINEIDResponse")
    public JAXBElement<QueryCUSTOMERLINEIDResponseType> createQueryCUSTOMERLINEIDResponse(QueryCUSTOMERLINEIDResponseType value) {
        return new JAXBElement<QueryCUSTOMERLINEIDResponseType>(_QueryCUSTOMERLINEIDResponse_QNAME, QueryCUSTOMERLINEIDResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncCUSTOMERLINEIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SyncCUSTOMERLINEIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "SyncCUSTOMERLINEID")
    public JAXBElement<SyncCUSTOMERLINEIDType> createSyncCUSTOMERLINEID(SyncCUSTOMERLINEIDType value) {
        return new JAXBElement<SyncCUSTOMERLINEIDType>(_SyncCUSTOMERLINEID_QNAME, SyncCUSTOMERLINEIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncCUSTOMERLINEIDResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SyncCUSTOMERLINEIDResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "SyncCUSTOMERLINEIDResponse")
    public JAXBElement<SyncCUSTOMERLINEIDResponseType> createSyncCUSTOMERLINEIDResponse(SyncCUSTOMERLINEIDResponseType value) {
        return new JAXBElement<SyncCUSTOMERLINEIDResponseType>(_SyncCUSTOMERLINEIDResponse_QNAME, SyncCUSTOMERLINEIDResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCUSTOMERLINEIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCUSTOMERLINEIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "UpdateCUSTOMERLINEID")
    public JAXBElement<UpdateCUSTOMERLINEIDType> createUpdateCUSTOMERLINEID(UpdateCUSTOMERLINEIDType value) {
        return new JAXBElement<UpdateCUSTOMERLINEIDType>(_UpdateCUSTOMERLINEID_QNAME, UpdateCUSTOMERLINEIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCUSTOMERLINEIDResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCUSTOMERLINEIDResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "UpdateCUSTOMERLINEIDResponse")
    public JAXBElement<UpdateCUSTOMERLINEIDResponseType> createUpdateCUSTOMERLINEIDResponse(UpdateCUSTOMERLINEIDResponseType value) {
        return new JAXBElement<UpdateCUSTOMERLINEIDResponseType>(_UpdateCUSTOMERLINEIDResponse_QNAME, UpdateCUSTOMERLINEIDResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CHANGEDATE", scope = CUSTOMERLINEIDCUSTOMERLINEIDType.class)
    public JAXBElement<MXDateTimeType> createCUSTOMERLINEIDCUSTOMERLINEIDTypeCHANGEDATE(MXDateTimeType value) {
        return new JAXBElement<MXDateTimeType>(_CUSTOMERLINEIDCUSTOMERLINEIDTypeCHANGEDATE_QNAME, MXDateTimeType.class, CUSTOMERLINEIDCUSTOMERLINEIDType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEIDID", scope = CUSTOMERLINEIDCUSTOMERLINEIDType.class)
    public JAXBElement<MXLongType> createCUSTOMERLINEIDCUSTOMERLINEIDTypeCUSTOMERLINEIDID(MXLongType value) {
        return new JAXBElement<MXLongType>(_CUSTOMERLINEIDCUSTOMERLINEIDTypeCUSTOMERLINEIDID_QNAME, MXLongType.class, CUSTOMERLINEIDCUSTOMERLINEIDType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "ENDTIME", scope = CUSTOMERLINEIDCUSTOMERLINEIDType.class)
    public JAXBElement<MXDateTimeType> createCUSTOMERLINEIDCUSTOMERLINEIDTypeENDTIME(MXDateTimeType value) {
        return new JAXBElement<MXDateTimeType>(_CUSTOMERLINEIDCUSTOMERLINEIDTypeENDTIME_QNAME, MXDateTimeType.class, CUSTOMERLINEIDCUSTOMERLINEIDType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MXLongType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CUSTOMERLINEIDID", scope = CUSTOMERLINEIDObjectType.class)
    public JAXBElement<MXLongType> createCUSTOMERLINEIDObjectTypeCUSTOMERLINEIDID(MXLongType value) {
        return new JAXBElement<MXLongType>(_CUSTOMERLINEIDCUSTOMERLINEIDTypeCUSTOMERLINEIDID_QNAME, MXLongType.class, CUSTOMERLINEIDObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "ENDTIME", scope = CUSTOMERLINEIDObjectType.class)
    public JAXBElement<MXDateTimeType> createCUSTOMERLINEIDObjectTypeENDTIME(MXDateTimeType value) {
        return new JAXBElement<MXDateTimeType>(_CUSTOMERLINEIDCUSTOMERLINEIDTypeENDTIME_QNAME, MXDateTimeType.class, CUSTOMERLINEIDObjectType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MXDateTimeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://oss.it.telekom.mk/tt/datatypes/customerLineService", name = "CHANGEDATE", scope = CUSTOMERLINEIDObjectType.class)
    public JAXBElement<MXDateTimeType> createCUSTOMERLINEIDObjectTypeCHANGEDATE(MXDateTimeType value) {
        return new JAXBElement<MXDateTimeType>(_CUSTOMERLINEIDCUSTOMERLINEIDTypeCHANGEDATE_QNAME, MXDateTimeType.class, CUSTOMERLINEIDObjectType.class, value);
    }

}

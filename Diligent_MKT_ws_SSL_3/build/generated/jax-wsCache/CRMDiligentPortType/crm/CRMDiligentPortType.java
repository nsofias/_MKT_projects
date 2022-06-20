
package crm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * Eclipse Metro/2.4.8 (RELEASE-2.4.8-e044505; 2022-01-04T13:29:23+0000) JAXWS-RI/2.3.5 JAXWS-API/2.3.3 JAXB-RI/2.3.5 JAXB-API/2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CRMDiligentPortType", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CRMDiligentPortType {


    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "MarkAffected", action = "urn:MarkAffected")
    @RequestWrapper(localName = "MarkAffected", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.MarkAffected")
    @ResponseWrapper(localName = "MarkAffectedOutput", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.MarkAffectedOutput")
    public void markAffected(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident")
        MarkAffectedType data,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.OUT)
        Holder<MarkAffectedResponseType> data0)
        throws TechnicalExceptionMessage
    ;

    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "ReleaseAffected", action = "urn:ReleaseAffected")
    @RequestWrapper(localName = "ReleaseAffected", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.ReleaseAffected")
    @ResponseWrapper(localName = "ReleaseAffectedOutput", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.ReleaseAffectedOutput")
    public void releaseAffected(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident")
        ReleaseAffectedType data,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.OUT)
        Holder<ReleaseAffectedResponseType> data0)
        throws TechnicalExceptionMessage
    ;

    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "HasCustomerGroupFault", action = "urn:HasCustomerGroupFault")
    @RequestWrapper(localName = "HasCustomerGroupFault", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.HasCustomerGroupFault")
    @ResponseWrapper(localName = "HasCustomerGroupFaultOutput", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.HasCustomerGroupFaultOutput")
    public void hasCustomerGroupFault(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident")
        HasCustomerGroupFaultType data,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.OUT)
        Holder<HasCustomerGroupFaultResponseType> data0)
        throws TechnicalExceptionMessage
    ;

    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "GetMSISDN2Subline", action = "urn:GetMSISDN2Subline")
    @RequestWrapper(localName = "GetMSISDN2Subline", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.GetMSISDN2Subline")
    @ResponseWrapper(localName = "GetMSISDN2SublineOutput", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.GetMSISDN2SublineOutput")
    public void getMSISDN2Subline(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident")
        GetMSISDN2SublineType data,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.OUT)
        Holder<GetMSISDN2SublineResponseType> data0)
        throws TechnicalExceptionMessage
    ;

    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "HasCustomerIndividualFault", action = "urn:HasCustomerIndividualFault")
    @RequestWrapper(localName = "HasCustomerIndividualFault", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.HasCustomerIndividualFault")
    @ResponseWrapper(localName = "HasCustomerIndividualFaultOutput", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", className = "crm.HasCustomerIndividualFaultOutput")
    public void hasCustomerIndividualFault(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident")
        HasCustomerIndividualFaultType data,
        @WebParam(name = "data", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident", mode = WebParam.Mode.OUT)
        Holder<HasCustomerIndividualFaultResponseType> data0)
        throws TechnicalExceptionMessage
    ;

}

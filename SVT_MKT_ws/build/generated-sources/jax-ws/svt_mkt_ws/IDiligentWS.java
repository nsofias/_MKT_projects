
package svt_mkt_ws;

import javax.jws.HandlerChain;
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
@WebService(name = "IDiligentWS", targetNamespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/")
@HandlerChain(file = "IDiligentWS_handler.xml")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IDiligentWS {


    /**
     * 
     * @param eiMessageContext
     * @param createCustomerIssueRequestData
     * @param createCustomerIssueResponseData
     * @throws DiligentException_Exception
     */
    @WebMethod(action = "createCustomerIssue")
    @RequestWrapper(localName = "createCustomerIssue", targetNamespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/", className = "svt_mkt_ws.CreateCustomerIssue")
    @ResponseWrapper(localName = "createCustomerIssueResponse", targetNamespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/", className = "svt_mkt_ws.CreateCustomerIssueResponse")
    public void createCustomerIssue(
        @WebParam(name = "eiMessageContext", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "createCustomerIssueRequestData", targetNamespace = "")
        CreateCustomerIssueRequestData createCustomerIssueRequestData,
        @WebParam(name = "createCustomerIssueResponseData", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<CreateCustomerIssueResponseData> createCustomerIssueResponseData)
        throws DiligentException_Exception
    ;

    /**
     * 
     * @param updateCustomerIssueRequestData
     * @param eiMessageContext
     * @param updateCustomerIssueResponseData
     * @throws DiligentException_Exception
     */
    @WebMethod(action = "updateCustomerIssue")
    @RequestWrapper(localName = "updateCustomerIssue", targetNamespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/", className = "svt_mkt_ws.UpdateCustomerIssue")
    @ResponseWrapper(localName = "updateCustomerIssueResponse", targetNamespace = "http://crm.diligent.webservices.northbound.esb.middleware.telekom.mk/", className = "svt_mkt_ws.UpdateCustomerIssueResponse")
    public void updateCustomerIssue(
        @WebParam(name = "eiMessageContext", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "updateCustomerIssueRequestData", targetNamespace = "")
        UpdateCustomerIssueRequestData updateCustomerIssueRequestData,
        @WebParam(name = "updateCustomerIssueResponseData", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<UpdateCustomerIssueResponseData> updateCustomerIssueResponseData)
        throws DiligentException_Exception
    ;

}
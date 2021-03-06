
package TT_incident;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "stela-sync", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StelaSync {


    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "SyncTTINCIDENT", action = "urn:processDocument")
    @RequestWrapper(localName = "SyncTTINCIDENT", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync", className = "TT_incident.SyncTTINCIDENT")
    @ResponseWrapper(localName = "SyncTTINCIDENTOutput", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync", className = "TT_incident.SyncTTINCIDENTOutput")
    public void syncTTINCIDENT(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync")
        StelaSyncSynchRequest data,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync", mode = WebParam.Mode.OUT)
        Holder<StelaSyncSynchResponse> data0)
        throws TechnicalExceptionMessage
    ;

    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(action = "http://telekom.mk/TT/StelaQueryTT")
    @RequestWrapper(localName = "stelaQueryTT", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync", className = "TT_incident.StelaQueryTT")
    @ResponseWrapper(localName = "stelaQueryTTOutput", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync", className = "TT_incident.StelaQueryTTOutput")
    public void stelaQueryTT(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync")
        StelaSyncQueryTTRequest data,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync", mode = WebParam.Mode.OUT)
        Holder<StelaSyncQueryTTResponse> data0)
        throws TechnicalExceptionMessage
    ;

}

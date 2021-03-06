
package cross_ws.alat;

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
@WebService(name = "alat", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Alat {


    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "ResetPort", action = "http://telekom.mk/alat/ResetPort")
    @RequestWrapper(localName = "ResetPort", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", className = "cross_ws.alat.ResetPort")
    @ResponseWrapper(localName = "ResetPortOutput", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", className = "cross_ws.alat.ResetPortOutput")
    public void resetPort(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement")
        AlatResetPortRequest data,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", mode = WebParam.Mode.OUT)
        Holder<AlatResetPortResponse> data0)
        throws TechnicalExceptionMessage
    ;

    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "PerformSeltMeasure", action = "http://telekom.mk/alat/PerformSeltMeasure")
    @RequestWrapper(localName = "PerformSeltMeasure", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", className = "cross_ws.alat.PerformSeltMeasure")
    @ResponseWrapper(localName = "PerformSeltMeasureOutput", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", className = "cross_ws.alat.PerformSeltMeasureOutput")
    public void performSeltMeasure(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement")
        AlatPerformSeltMeasureRequest data,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", mode = WebParam.Mode.OUT)
        Holder<AlatPerformSeltMeasureResponse> data0)
        throws TechnicalExceptionMessage
    ;

    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "PerformSyncMeasure", action = "http://telekom.mk/alat/PerformSyncMeasure")
    @RequestWrapper(localName = "PerformSyncMeasure", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", className = "cross_ws.alat.PerformSyncMeasure")
    @ResponseWrapper(localName = "PerformSyncMeasureOutput", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", className = "cross_ws.alat.PerformSyncMeasureOutput")
    public void performSyncMeasure(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement")
        AlatPerformSyncMeasureRequest data,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", mode = WebParam.Mode.OUT)
        Holder<AlatPerformSyncMeasureResponse> data0)
        throws TechnicalExceptionMessage
    ;

    /**
     * 
     * @param eiMessageContext
     * @param data
     * @param data0
     * @throws TechnicalExceptionMessage
     */
    @WebMethod(operationName = "GetMeasureHistory", action = "http://telekom.mk/alat/GetMeasureHistory")
    @RequestWrapper(localName = "GetMeasureHistory", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", className = "cross_ws.alat.GetMeasureHistory")
    @ResponseWrapper(localName = "GetMeasureHistoryOutput", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", className = "cross_ws.alat.GetMeasureHistoryOutput")
    public void getMeasureHistory(
        @WebParam(name = "eiMessageContext", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", mode = WebParam.Mode.INOUT)
        Holder<EIMessageContext2> eiMessageContext,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement")
        AlatGetMeasureHistoryRequest data,
        @WebParam(name = "data", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", mode = WebParam.Mode.OUT)
        Holder<AlatGetMeasureHistoryResponse> data0)
        throws TechnicalExceptionMessage
    ;

}

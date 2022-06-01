
package SVT_MKT_ws1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * Eclipse Metro/2.4.8 (RELEASE-2.4.8-e044505; 2022-01-04T13:29:23+0000) JAXWS-RI/2.3.5 JAXWS-API/2.3.3 JAXB-RI/2.3.5 JAXB-API/2.3.3
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TechnicalExceptionElement", targetNamespace = "http://crm.it.telekom.mk/diligent/services/queryDiligentIncident")
public class TechnicalExceptionMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SOABPException2 faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public TechnicalExceptionMessage(String message, SOABPException2 faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public TechnicalExceptionMessage(String message, SOABPException2 faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: SVT_MKT_ws1.SOABPException2
     */
    public SOABPException2 getFaultInfo() {
        return faultInfo;
    }

}

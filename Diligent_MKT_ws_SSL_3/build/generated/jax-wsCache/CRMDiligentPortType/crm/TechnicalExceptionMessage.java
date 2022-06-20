
package crm;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
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
     *     returns fault bean: crm.SOABPException2
     */
    public SOABPException2 getFaultInfo() {
        return faultInfo;
    }

}

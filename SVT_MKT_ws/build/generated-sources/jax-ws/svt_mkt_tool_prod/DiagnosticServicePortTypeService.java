
package svt_mkt_tool_prod;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * Eclipse Metro/2.4.8 (RELEASE-2.4.8-e044505; 2022-01-04T13:29:23+0000) JAXWS-RI/2.3.5 JAXWS-API/2.3.3 JAXB-RI/2.3.5 JAXB-API/2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DiagnosticServicePortTypeService", targetNamespace = "http://servicediagnostictool.telekom.mk/service/diagnostic", wsdlLocation = "file:/C:/my%20files/JavaProjects/svt_skopia_wsdls/src-gen/wsdls/mk-telekom-servicediagnostictool-service-diagnostic/DiagnosticServicePortType_production.wsdl")
public class DiagnosticServicePortTypeService
    extends Service
{

    private final static URL DIAGNOSTICSERVICEPORTTYPESERVICE_WSDL_LOCATION;
    private final static WebServiceException DIAGNOSTICSERVICEPORTTYPESERVICE_EXCEPTION;
    private final static QName DIAGNOSTICSERVICEPORTTYPESERVICE_QNAME = new QName("http://servicediagnostictool.telekom.mk/service/diagnostic", "DiagnosticServicePortTypeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/my%20files/JavaProjects/svt_skopia_wsdls/src-gen/wsdls/mk-telekom-servicediagnostictool-service-diagnostic/DiagnosticServicePortType_production.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DIAGNOSTICSERVICEPORTTYPESERVICE_WSDL_LOCATION = url;
        DIAGNOSTICSERVICEPORTTYPESERVICE_EXCEPTION = e;
    }

    public DiagnosticServicePortTypeService() {
        super(__getWsdlLocation(), DIAGNOSTICSERVICEPORTTYPESERVICE_QNAME);
    }

    public DiagnosticServicePortTypeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DIAGNOSTICSERVICEPORTTYPESERVICE_QNAME, features);
    }

    public DiagnosticServicePortTypeService(URL wsdlLocation) {
        super(wsdlLocation, DIAGNOSTICSERVICEPORTTYPESERVICE_QNAME);
    }

    public DiagnosticServicePortTypeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DIAGNOSTICSERVICEPORTTYPESERVICE_QNAME, features);
    }

    public DiagnosticServicePortTypeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DiagnosticServicePortTypeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DiagnosticServicePortType
     */
    @WebEndpoint(name = "DiagnosticServicePortType")
    public DiagnosticServicePortType getDiagnosticServicePortType() {
        return super.getPort(new QName("http://servicediagnostictool.telekom.mk/service/diagnostic", "DiagnosticServicePortType"), DiagnosticServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DiagnosticServicePortType
     */
    @WebEndpoint(name = "DiagnosticServicePortType")
    public DiagnosticServicePortType getDiagnosticServicePortType(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicediagnostictool.telekom.mk/service/diagnostic", "DiagnosticServicePortType"), DiagnosticServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DIAGNOSTICSERVICEPORTTYPESERVICE_EXCEPTION!= null) {
            throw DIAGNOSTICSERVICEPORTTYPESERVICE_EXCEPTION;
        }
        return DIAGNOSTICSERVICEPORTTYPESERVICE_WSDL_LOCATION;
    }

}

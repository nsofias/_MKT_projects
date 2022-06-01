
package mk.telekom.it.crm.diligent.services.diligent;

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
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DiligentCRM", targetNamespace = "http://crm.it.telekom.mk/diligent/services/Diligent", wsdlLocation = "file:/C:/myfiles/JavaProjects/_MKT_projects/RADIUS_MKT_3.0/src/conf/xml-resources/web-services/NewWebServiceFromWSDL/wsdl/DILIGENT.wsdl")
public class DiligentCRM
    extends Service
{

    private final static URL DILIGENTCRM_WSDL_LOCATION;
    private final static WebServiceException DILIGENTCRM_EXCEPTION;
    private final static QName DILIGENTCRM_QNAME = new QName("http://crm.it.telekom.mk/diligent/services/Diligent", "DiligentCRM");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/myfiles/JavaProjects/_MKT_projects/RADIUS_MKT_3.0/src/conf/xml-resources/web-services/NewWebServiceFromWSDL/wsdl/DILIGENT.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DILIGENTCRM_WSDL_LOCATION = url;
        DILIGENTCRM_EXCEPTION = e;
    }

    public DiligentCRM() {
        super(__getWsdlLocation(), DILIGENTCRM_QNAME);
    }

    public DiligentCRM(WebServiceFeature... features) {
        super(__getWsdlLocation(), DILIGENTCRM_QNAME, features);
    }

    public DiligentCRM(URL wsdlLocation) {
        super(wsdlLocation, DILIGENTCRM_QNAME);
    }

    public DiligentCRM(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DILIGENTCRM_QNAME, features);
    }

    public DiligentCRM(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DiligentCRM(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DiligentPortType
     */
    @WebEndpoint(name = "DiligentPort")
    public DiligentPortType getDiligentPort() {
        return super.getPort(new QName("http://crm.it.telekom.mk/diligent/services/Diligent", "DiligentPort"), DiligentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns DiligentPortType
     */
    @WebEndpoint(name = "DiligentPort")
    public DiligentPortType getDiligentPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://crm.it.telekom.mk/diligent/services/Diligent", "DiligentPort"), DiligentPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DILIGENTCRM_EXCEPTION!= null) {
            throw DILIGENTCRM_EXCEPTION;
        }
        return DILIGENTCRM_WSDL_LOCATION;
    }

}

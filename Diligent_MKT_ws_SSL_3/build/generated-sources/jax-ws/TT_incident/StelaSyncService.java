
package TT_incident;

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
@WebServiceClient(name = "stela-syncService", targetNamespace = "http://oss.it.telekom.mk/tt/services/stela-sync", wsdlLocation = "file:/C:/myfiles/JavaProjects/diligent_skopia_wsdls_SSL/src-gen/wsdls/mk-telekom-it-oss-tt-services-stela-sync/stela-sync.wsdl")
public class StelaSyncService
    extends Service
{

    private final static URL STELASYNCSERVICE_WSDL_LOCATION;
    private final static WebServiceException STELASYNCSERVICE_EXCEPTION;
    private final static QName STELASYNCSERVICE_QNAME = new QName("http://oss.it.telekom.mk/tt/services/stela-sync", "stela-syncService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/myfiles/JavaProjects/diligent_skopia_wsdls_SSL/src-gen/wsdls/mk-telekom-it-oss-tt-services-stela-sync/stela-sync.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STELASYNCSERVICE_WSDL_LOCATION = url;
        STELASYNCSERVICE_EXCEPTION = e;
    }

    public StelaSyncService() {
        super(__getWsdlLocation(), STELASYNCSERVICE_QNAME);
    }

    public StelaSyncService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STELASYNCSERVICE_QNAME, features);
    }

    public StelaSyncService(URL wsdlLocation) {
        super(wsdlLocation, STELASYNCSERVICE_QNAME);
    }

    public StelaSyncService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STELASYNCSERVICE_QNAME, features);
    }

    public StelaSyncService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StelaSyncService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StelaSync
     */
    @WebEndpoint(name = "stela-sync")
    public StelaSync getStelaSync() {
        return super.getPort(new QName("http://oss.it.telekom.mk/tt/services/stela-sync", "stela-sync"), StelaSync.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns StelaSync
     */
    @WebEndpoint(name = "stela-sync")
    public StelaSync getStelaSync(WebServiceFeature... features) {
        return super.getPort(new QName("http://oss.it.telekom.mk/tt/services/stela-sync", "stela-sync"), StelaSync.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STELASYNCSERVICE_EXCEPTION!= null) {
            throw STELASYNCSERVICE_EXCEPTION;
        }
        return STELASYNCSERVICE_WSDL_LOCATION;
    }

}

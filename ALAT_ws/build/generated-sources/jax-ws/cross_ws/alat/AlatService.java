
package cross_ws.alat;

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
@WebServiceClient(name = "alatService", targetNamespace = "http://oss.it.telekom.mk/alat/services/alatmanagement", wsdlLocation = "file:/C:/myfiles/JavaProjects/diligent_skopia_wsdls_SSL/src-gen/wsdls/mk-telekom-it-oss-alat-services-alatmanagement/alat.wsdl")
public class AlatService
    extends Service
{

    private final static URL ALATSERVICE_WSDL_LOCATION;
    private final static WebServiceException ALATSERVICE_EXCEPTION;
    private final static QName ALATSERVICE_QNAME = new QName("http://oss.it.telekom.mk/alat/services/alatmanagement", "alatService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/myfiles/JavaProjects/diligent_skopia_wsdls_SSL/src-gen/wsdls/mk-telekom-it-oss-alat-services-alatmanagement/alat.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ALATSERVICE_WSDL_LOCATION = url;
        ALATSERVICE_EXCEPTION = e;
    }

    public AlatService() {
        super(__getWsdlLocation(), ALATSERVICE_QNAME);
    }

    public AlatService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ALATSERVICE_QNAME, features);
    }

    public AlatService(URL wsdlLocation) {
        super(wsdlLocation, ALATSERVICE_QNAME);
    }

    public AlatService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ALATSERVICE_QNAME, features);
    }

    public AlatService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AlatService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Alat
     */
    @WebEndpoint(name = "alat")
    public Alat getAlat() {
        return super.getPort(new QName("http://oss.it.telekom.mk/alat/services/alatmanagement", "alat"), Alat.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Alat
     */
    @WebEndpoint(name = "alat")
    public Alat getAlat(WebServiceFeature... features) {
        return super.getPort(new QName("http://oss.it.telekom.mk/alat/services/alatmanagement", "alat"), Alat.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ALATSERVICE_EXCEPTION!= null) {
            throw ALATSERVICE_EXCEPTION;
        }
        return ALATSERVICE_WSDL_LOCATION;
    }

}

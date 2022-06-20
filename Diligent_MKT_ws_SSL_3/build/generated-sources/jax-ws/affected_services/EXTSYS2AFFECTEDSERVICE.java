
package affected_services;

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
@WebServiceClient(name = "EXTSYS2_AFFECTEDSERVICE", targetNamespace = "http://www.ibm.com/maximo/wsdl/EXTSYS2_AFFECTEDSERVICE", wsdlLocation = "file:/C:/myfiles/JavaProjects/diligent_skopia_wsdls_SSL/src-gen/wsdls/EXTSYS2_AFFECTEDSERVICE.wsdl")
public class EXTSYS2AFFECTEDSERVICE
    extends Service
{

    private final static URL EXTSYS2AFFECTEDSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXTSYS2AFFECTEDSERVICE_EXCEPTION;
    private final static QName EXTSYS2AFFECTEDSERVICE_QNAME = new QName("http://www.ibm.com/maximo/wsdl/EXTSYS2_AFFECTEDSERVICE", "EXTSYS2_AFFECTEDSERVICE");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/myfiles/JavaProjects/diligent_skopia_wsdls_SSL/src-gen/wsdls/EXTSYS2_AFFECTEDSERVICE.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXTSYS2AFFECTEDSERVICE_WSDL_LOCATION = url;
        EXTSYS2AFFECTEDSERVICE_EXCEPTION = e;
    }

    public EXTSYS2AFFECTEDSERVICE() {
        super(__getWsdlLocation(), EXTSYS2AFFECTEDSERVICE_QNAME);
    }

    public EXTSYS2AFFECTEDSERVICE(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXTSYS2AFFECTEDSERVICE_QNAME, features);
    }

    public EXTSYS2AFFECTEDSERVICE(URL wsdlLocation) {
        super(wsdlLocation, EXTSYS2AFFECTEDSERVICE_QNAME);
    }

    public EXTSYS2AFFECTEDSERVICE(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXTSYS2AFFECTEDSERVICE_QNAME, features);
    }

    public EXTSYS2AFFECTEDSERVICE(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EXTSYS2AFFECTEDSERVICE(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EXTSYS2AFFECTEDSERVICEPortType
     */
    @WebEndpoint(name = "EXTSYS2_AFFECTEDSERVICESOAP11Port")
    public EXTSYS2AFFECTEDSERVICEPortType getEXTSYS2AFFECTEDSERVICESOAP11Port() {
        return super.getPort(new QName("http://www.ibm.com/maximo/wsdl/EXTSYS2_AFFECTEDSERVICE", "EXTSYS2_AFFECTEDSERVICESOAP11Port"), EXTSYS2AFFECTEDSERVICEPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EXTSYS2AFFECTEDSERVICEPortType
     */
    @WebEndpoint(name = "EXTSYS2_AFFECTEDSERVICESOAP11Port")
    public EXTSYS2AFFECTEDSERVICEPortType getEXTSYS2AFFECTEDSERVICESOAP11Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ibm.com/maximo/wsdl/EXTSYS2_AFFECTEDSERVICE", "EXTSYS2_AFFECTEDSERVICESOAP11Port"), EXTSYS2AFFECTEDSERVICEPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns EXTSYS2AFFECTEDSERVICEPortType
     */
    @WebEndpoint(name = "EXTSYS2_AFFECTEDSERVICESOAP12Port")
    public EXTSYS2AFFECTEDSERVICEPortType getEXTSYS2AFFECTEDSERVICESOAP12Port() {
        return super.getPort(new QName("http://www.ibm.com/maximo/wsdl/EXTSYS2_AFFECTEDSERVICE", "EXTSYS2_AFFECTEDSERVICESOAP12Port"), EXTSYS2AFFECTEDSERVICEPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EXTSYS2AFFECTEDSERVICEPortType
     */
    @WebEndpoint(name = "EXTSYS2_AFFECTEDSERVICESOAP12Port")
    public EXTSYS2AFFECTEDSERVICEPortType getEXTSYS2AFFECTEDSERVICESOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ibm.com/maximo/wsdl/EXTSYS2_AFFECTEDSERVICE", "EXTSYS2_AFFECTEDSERVICESOAP12Port"), EXTSYS2AFFECTEDSERVICEPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXTSYS2AFFECTEDSERVICE_EXCEPTION!= null) {
            throw EXTSYS2AFFECTEDSERVICE_EXCEPTION;
        }
        return EXTSYS2AFFECTEDSERVICE_WSDL_LOCATION;
    }

}


package uk.co.listpoint.contextmap;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * A service to allow ContextMaps to be maintained automatically under program control
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ContextMap6Service", targetNamespace = "http://www.listpoint.co.uk/webservices", wsdlLocation = "META-INF/wsdl/ContextMap6Service.wsdl")
public class ContextMap6Service
    extends Service
{

    private final static URL CONTEXTMAP6SERVICE_WSDL_LOCATION;
    private final static WebServiceException CONTEXTMAP6SERVICE_EXCEPTION;
    private final static QName CONTEXTMAP6SERVICE_QNAME = new QName("http://www.listpoint.co.uk/webservices", "ContextMap6Service");

    static {
        CONTEXTMAP6SERVICE_WSDL_LOCATION = uk.co.listpoint.contextmap.ContextMap6Service.class.getClassLoader().getResource("META-INF/wsdl/ContextMap6Service.wsdl");
        WebServiceException e = null;
        if (CONTEXTMAP6SERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/ContextMap6Service.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        CONTEXTMAP6SERVICE_EXCEPTION = e;
    }

    public ContextMap6Service() {
        super(__getWsdlLocation(), CONTEXTMAP6SERVICE_QNAME);
    }

    public ContextMap6Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONTEXTMAP6SERVICE_QNAME, features);
    }

    public ContextMap6Service(URL wsdlLocation) {
        super(wsdlLocation, CONTEXTMAP6SERVICE_QNAME);
    }

    public ContextMap6Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONTEXTMAP6SERVICE_QNAME, features);
    }

    public ContextMap6Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ContextMap6Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ContextMap6ServiceSoap
     */
    @WebEndpoint(name = "ContextMap6ServiceSoap")
    public ContextMap6ServiceSoap getContextMap6ServiceSoap() {
        return super.getPort(new QName("http://www.listpoint.co.uk/webservices", "ContextMap6ServiceSoap"), ContextMap6ServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContextMap6ServiceSoap
     */
    @WebEndpoint(name = "ContextMap6ServiceSoap")
    public ContextMap6ServiceSoap getContextMap6ServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.listpoint.co.uk/webservices", "ContextMap6ServiceSoap"), ContextMap6ServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTEXTMAP6SERVICE_EXCEPTION!= null) {
            throw CONTEXTMAP6SERVICE_EXCEPTION;
        }
        return CONTEXTMAP6SERVICE_WSDL_LOCATION;
    }

}
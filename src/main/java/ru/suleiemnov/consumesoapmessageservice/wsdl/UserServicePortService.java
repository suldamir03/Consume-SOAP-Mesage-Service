
package ru.suleiemnov.consumesoapmessageservice.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "UserServicePortService", targetNamespace = "http://sdr.com/spring-soap-example", wsdlLocation = "file:/E:/IdeaProjects/git/Consume-SOAP-Message-Service/src/main/resources/users.wsdl")
public class UserServicePortService
    extends Service
{

    private final static URL USERSERVICEPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERSERVICEPORTSERVICE_EXCEPTION;
    private final static QName USERSERVICEPORTSERVICE_QNAME = new QName("http://sdr.com/spring-soap-example", "UserServicePortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/IdeaProjects/git/Consume-SOAP-Message-Service/src/main/resources/users.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERSERVICEPORTSERVICE_WSDL_LOCATION = url;
        USERSERVICEPORTSERVICE_EXCEPTION = e;
    }

    public UserServicePortService() {
        super(__getWsdlLocation(), USERSERVICEPORTSERVICE_QNAME);
    }

    public UserServicePortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERSERVICEPORTSERVICE_QNAME, features);
    }

    public UserServicePortService(URL wsdlLocation) {
        super(wsdlLocation, USERSERVICEPORTSERVICE_QNAME);
    }

    public UserServicePortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERSERVICEPORTSERVICE_QNAME, features);
    }

    public UserServicePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserServicePortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserServicePort
     */
    @WebEndpoint(name = "UserServicePortSoap11")
    public UserServicePort getUserServicePortSoap11() {
        return super.getPort(new QName("http://sdr.com/spring-soap-example", "UserServicePortSoap11"), UserServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserServicePort
     */
    @WebEndpoint(name = "UserServicePortSoap11")
    public UserServicePort getUserServicePortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://sdr.com/spring-soap-example", "UserServicePortSoap11"), UserServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERSERVICEPORTSERVICE_EXCEPTION!= null) {
            throw USERSERVICEPORTSERVICE_EXCEPTION;
        }
        return USERSERVICEPORTSERVICE_WSDL_LOCATION;
    }

}

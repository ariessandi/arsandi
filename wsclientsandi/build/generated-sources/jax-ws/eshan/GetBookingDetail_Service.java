
package eshan;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GetBookingDetail", targetNamespace = "http://Eshan/", wsdlLocation = "http://localhost:8087/wssandi/GetBookingDetail?wsdl")
public class GetBookingDetail_Service
    extends Service
{

    private final static URL GETBOOKINGDETAIL_WSDL_LOCATION;
    private final static WebServiceException GETBOOKINGDETAIL_EXCEPTION;
    private final static QName GETBOOKINGDETAIL_QNAME = new QName("http://Eshan/", "GetBookingDetail");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8087/wssandi/GetBookingDetail?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETBOOKINGDETAIL_WSDL_LOCATION = url;
        GETBOOKINGDETAIL_EXCEPTION = e;
    }

    public GetBookingDetail_Service() {
        super(__getWsdlLocation(), GETBOOKINGDETAIL_QNAME);
    }

    public GetBookingDetail_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETBOOKINGDETAIL_QNAME, features);
    }

    public GetBookingDetail_Service(URL wsdlLocation) {
        super(wsdlLocation, GETBOOKINGDETAIL_QNAME);
    }

    public GetBookingDetail_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETBOOKINGDETAIL_QNAME, features);
    }

    public GetBookingDetail_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetBookingDetail_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetBookingDetail
     */
    @WebEndpoint(name = "GetBookingDetailPort")
    public GetBookingDetail getGetBookingDetailPort() {
        return super.getPort(new QName("http://Eshan/", "GetBookingDetailPort"), GetBookingDetail.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetBookingDetail
     */
    @WebEndpoint(name = "GetBookingDetailPort")
    public GetBookingDetail getGetBookingDetailPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Eshan/", "GetBookingDetailPort"), GetBookingDetail.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETBOOKINGDETAIL_EXCEPTION!= null) {
            throw GETBOOKINGDETAIL_EXCEPTION;
        }
        return GETBOOKINGDETAIL_WSDL_LOCATION;
    }

}
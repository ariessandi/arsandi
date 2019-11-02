
package eshan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eshan package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBooking_QNAME = new QName("http://Eshan/", "getBooking");
    private final static QName _GetBookingResponse_QNAME = new QName("http://Eshan/", "getBookingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eshan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBooking_Type }
     * 
     */
    public GetBooking_Type createGetBooking_Type() {
        return new GetBooking_Type();
    }

    /**
     * Create an instance of {@link GetBookingResponse }
     * 
     */
    public GetBookingResponse createGetBookingResponse() {
        return new GetBookingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooking_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "getBooking")
    public JAXBElement<GetBooking_Type> createGetBooking(GetBooking_Type value) {
        return new JAXBElement<GetBooking_Type>(_GetBooking_QNAME, GetBooking_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "getBookingResponse")
    public JAXBElement<GetBookingResponse> createGetBookingResponse(GetBookingResponse value) {
        return new JAXBElement<GetBookingResponse>(_GetBookingResponse_QNAME, GetBookingResponse.class, null, value);
    }

}

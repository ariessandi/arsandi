
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

    private final static QName _UpdateBooking_QNAME = new QName("http://Eshan/", "UpdateBooking");
    private final static QName _UpdateBookingResponse_QNAME = new QName("http://Eshan/", "UpdateBookingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eshan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateBooking_Type }
     * 
     */
    public UpdateBooking_Type createUpdateBooking_Type() {
        return new UpdateBooking_Type();
    }

    /**
     * Create an instance of {@link UpdateBookingResponse }
     * 
     */
    public UpdateBookingResponse createUpdateBookingResponse() {
        return new UpdateBookingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBooking_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "UpdateBooking")
    public JAXBElement<UpdateBooking_Type> createUpdateBooking(UpdateBooking_Type value) {
        return new JAXBElement<UpdateBooking_Type>(_UpdateBooking_QNAME, UpdateBooking_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "UpdateBookingResponse")
    public JAXBElement<UpdateBookingResponse> createUpdateBookingResponse(UpdateBookingResponse value) {
        return new JAXBElement<UpdateBookingResponse>(_UpdateBookingResponse_QNAME, UpdateBookingResponse.class, null, value);
    }

}

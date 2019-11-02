
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

    private final static QName _GetBookingDetail_QNAME = new QName("http://Eshan/", "getBookingDetail");
    private final static QName _GetBookingDetailResponse_QNAME = new QName("http://Eshan/", "getBookingDetailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eshan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookingDetail_Type }
     * 
     */
    public GetBookingDetail_Type createGetBookingDetail_Type() {
        return new GetBookingDetail_Type();
    }

    /**
     * Create an instance of {@link GetBookingDetailResponse }
     * 
     */
    public GetBookingDetailResponse createGetBookingDetailResponse() {
        return new GetBookingDetailResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingDetail_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "getBookingDetail")
    public JAXBElement<GetBookingDetail_Type> createGetBookingDetail(GetBookingDetail_Type value) {
        return new JAXBElement<GetBookingDetail_Type>(_GetBookingDetail_QNAME, GetBookingDetail_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "getBookingDetailResponse")
    public JAXBElement<GetBookingDetailResponse> createGetBookingDetailResponse(GetBookingDetailResponse value) {
        return new JAXBElement<GetBookingDetailResponse>(_GetBookingDetailResponse_QNAME, GetBookingDetailResponse.class, null, value);
    }

}

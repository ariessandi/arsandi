
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

    private final static QName _GetUser_QNAME = new QName("http://Eshan/", "getUser");
    private final static QName _GetUserResponse_QNAME = new QName("http://Eshan/", "getUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eshan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUser_Type }
     * 
     */
    public GetUser_Type createGetUser_Type() {
        return new GetUser_Type();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "getUser")
    public JAXBElement<GetUser_Type> createGetUser(GetUser_Type value) {
        return new JAXBElement<GetUser_Type>(_GetUser_QNAME, GetUser_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

}

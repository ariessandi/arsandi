
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

    private final static QName _PostUser_QNAME = new QName("http://Eshan/", "postUser");
    private final static QName _PostUserResponse_QNAME = new QName("http://Eshan/", "postUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eshan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostUser_Type }
     * 
     */
    public PostUser_Type createPostUser_Type() {
        return new PostUser_Type();
    }

    /**
     * Create an instance of {@link PostUserResponse }
     * 
     */
    public PostUserResponse createPostUserResponse() {
        return new PostUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostUser_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "postUser")
    public JAXBElement<PostUser_Type> createPostUser(PostUser_Type value) {
        return new JAXBElement<PostUser_Type>(_PostUser_QNAME, PostUser_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Eshan/", name = "postUserResponse")
    public JAXBElement<PostUserResponse> createPostUserResponse(PostUserResponse value) {
        return new JAXBElement<PostUserResponse>(_PostUserResponse_QNAME, PostUserResponse.class, null, value);
    }

}

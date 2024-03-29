
package eshan;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetUser", targetNamespace = "http://Eshan/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetUser {


    /**
     * 
     * @param userID
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://Eshan/", className = "eshan.GetUser_Type")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://Eshan/", className = "eshan.GetUserResponse")
    @Action(input = "http://Eshan/GetUser/getUserRequest", output = "http://Eshan/GetUser/getUserResponse")
    public List<Object> getUser(
        @WebParam(name = "UserID", targetNamespace = "")
        int userID);

}

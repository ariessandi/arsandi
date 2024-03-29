
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
@WebService(name = "GetBooking", targetNamespace = "http://Eshan/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetBooking {


    /**
     * 
     * @param paymentApproved
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBooking", targetNamespace = "http://Eshan/", className = "eshan.GetBooking_Type")
    @ResponseWrapper(localName = "getBookingResponse", targetNamespace = "http://Eshan/", className = "eshan.GetBookingResponse")
    @Action(input = "http://Eshan/GetBooking/getBookingRequest", output = "http://Eshan/GetBooking/getBookingResponse")
    public List<Object> getBooking(
        @WebParam(name = "paymentApproved", targetNamespace = "")
        int paymentApproved);

}

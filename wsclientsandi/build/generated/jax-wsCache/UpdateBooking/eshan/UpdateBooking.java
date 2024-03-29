
package eshan;

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
@WebService(name = "UpdateBooking", targetNamespace = "http://Eshan/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UpdateBooking {


    /**
     * 
     * @param paymentApproved
     * @param bookingId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpdateBooking")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpdateBooking", targetNamespace = "http://Eshan/", className = "eshan.UpdateBooking_Type")
    @ResponseWrapper(localName = "UpdateBookingResponse", targetNamespace = "http://Eshan/", className = "eshan.UpdateBookingResponse")
    @Action(input = "http://Eshan/UpdateBooking/UpdateBookingRequest", output = "http://Eshan/UpdateBooking/UpdateBookingResponse")
    public String updateBooking(
        @WebParam(name = "bookingId", targetNamespace = "")
        int bookingId,
        @WebParam(name = "paymentApproved", targetNamespace = "")
        int paymentApproved);

}

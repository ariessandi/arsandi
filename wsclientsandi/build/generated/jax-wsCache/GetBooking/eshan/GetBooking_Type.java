
package eshan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentApproved" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBooking", propOrder = {
    "paymentApproved"
})
public class GetBooking_Type {

    protected int paymentApproved;

    /**
     * Gets the value of the paymentApproved property.
     * 
     */
    public int getPaymentApproved() {
        return paymentApproved;
    }

    /**
     * Sets the value of the paymentApproved property.
     * 
     */
    public void setPaymentApproved(int value) {
        this.paymentApproved = value;
    }

}

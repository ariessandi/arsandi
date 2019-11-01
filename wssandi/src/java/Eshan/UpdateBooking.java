/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eshan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ARIESSANDI
 */
@WebService(serviceName = "UpdateBooking")
public class UpdateBooking {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "UpdateBooking")
    public String UpdateBooking(
            @WebParam(name = "bookingId") int bookingId,
            @WebParam(name = "paymentApproved") int paymentApproved
             ) {
        try{
        String myDriver="com.mysql.jdbc.Driver";
        String myUrl="jdbc:mysql://localhost:3306/cdcol";
        Class.forName(myDriver);
        Connection con = DriverManager.getConnection(myUrl,"root","");        
        String query="update booking set paymentApproved=? where bookingId=?";
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, paymentApproved); 
        st.setInt(2, bookingId); 
        st.executeUpdate();

        }
        catch(Exception ex){
            //System.err.println("Get Exception");
            //System.err.println(ex.getMessage());
            System.out.println(ex.toString());
        }
        return "Berhasil";                    
     }
}

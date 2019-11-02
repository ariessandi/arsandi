/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eshan;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import java.sql.ResultSet;
import java.sql.Statement;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARIESSANDI
 */
@WebService(serviceName = "GetBooking")
public class GetBooking {

    /**
     * This is a sample web service operation
     */
     String Result ="No record Found";
    @WebMethod(operationName = "getBooking")
    public Vector getBooking(@WebParam(name = "paymentApproved") int paymentApproved) {
        Vector v=new Vector();
        try{
        String myDriver="com.mysql.jdbc.Driver";
        String myUrl="jdbc:mysql://localhost:3306/cdcol";
        Class.forName(myDriver);
        Connection con = DriverManager.getConnection(myUrl,"root","");
        String query="select bookingId,bookingName,paymentProofId,paymentApproved,lawyer.lawyerFullName from booking,lawyer WHERE lawyer.lawyerId=booking.lawyerId and paymentApproved='"+paymentApproved+"'";
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(query);
        while(rs.next()){
            //int UserId = rs.getInt("userID");
            //String Username = rs.getString("username");
              v.addElement(rs.getInt("bookingId"));
              v.addElement(rs.getString("bookingName"));
              v.addElement(rs.getInt("paymentProofId")); 
              v.addElement(rs.getInt("paymentApproved")); 
              v.addElement(rs.getString("lawyerFullName")); 
            //Result="<UserID>"+UserID+"</UserID>,<Username>"+Username+"</Username>";
            
        }
        st.close();
        //return "";
        }
        catch(Exception ex){
            System.err.println("Get Exception");
            System.err.println(ex.getMessage());
        }
        return v;
        }
}

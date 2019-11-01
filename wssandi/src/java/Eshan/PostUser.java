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
@WebService(serviceName = "PostUser")
public class PostUser {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "postUser")
    public String postUser(
            @WebParam(name = "username") String username,
            @WebParam(name = "password") String password
             ) {
        try{
        String myDriver="com.mysql.jdbc.Driver";
        String myUrl="jdbc:mysql://localhost:3306/cdcol";
        Class.forName(myDriver);
        Connection con = DriverManager.getConnection(myUrl,"root","");        
        String query="insert into user (username,password)VALUE (?,?)";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, username);
        st.setString(2, password);
        st.executeUpdate();
        
        
       
        
        }
        catch(Exception ex){
            //System.err.println("Get Exception");
            //System.err.println(ex.getMessage());
            System.out.println(ex.toString());
        }
        return                                                                                                                                                                                                                                                                          "Input Data Sukses " ;
    }
}

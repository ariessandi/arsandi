/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eshan.GetBooking_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author ARIESSANDI
 */
public class Booking extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8087/wssandi/GetBooking.wsdl")
    private GetBooking_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int paymentApproved=Integer.parseInt(request.getParameter("paymentApproved"));
            Vector v=new Vector(getBooking(paymentApproved));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            Iterator itr=v.listIterator();
            
            out.println("<body>");
            out.println("<table border=1 ><tr><td>bookingId</td><td>bookingName</td><td>paymentProofId</td><td>paymentApproved</td><td>lawyerId</td></tr>");
            while(itr.hasNext()){
            //out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            //int bookingId = itr.next();
           if(paymentApproved==0){
            out.println("<tr><td><a href='updateBooking.jsp?bookingId="+itr.next()+"&paymentApproved=1'>Approve Booking</a></td><td>"+itr.next()+"</td><td>"+itr.next()+"</td><td>"+itr.next()+"</td><td>"+itr.next()+"</td></tr>");
           }else{
               out.println("<tr><td><a href='NewServlet?txt1="+itr.next()+"'>Sign Lawyer</a></td><td>"+itr.next()+"</td><td>"+itr.next()+"</td><td>"+itr.next()+"</td><td>"+itr.next()+"</td></tr>");
                          
           }
           }
           
            out.println("</table>");
            
            out.println("<a href='index_1.html'>Menu Awal</a>");
            out.println("</body>");
           // }
            out.println("</html>");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private java.util.List<java.lang.Object> getBooking(int paymentApproved) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        eshan.GetBooking port = service.getGetBookingPort();
        return port.getBooking(paymentApproved);
    }

}

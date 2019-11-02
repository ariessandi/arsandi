/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eshan.GetBookingDetail_Service;
import eshan.GetUser_Service;
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
public class NewServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8087/wssandi/GetBookingDetail.wsdl")
    private GetBookingDetail_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8087/wssandi/GetUser.wsdl")
    private GetUser_Service service;

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
            int id=Integer.parseInt(request.getParameter("txt1"));
            Vector v=new Vector(getUser(id));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            Iterator itr=v.listIterator();
            
            out.println("<body>");
            out.println("<form method=POST action='addLawyerBooking.jsp'>");
            out.println("Pilih Lawyer");
            out.println("<select name='lawyerId'>");
            out.println("<option value='0'>Pilih</option>");
            while(itr.hasNext()){
            //out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            
            
            out.println("<option value='"+itr.next()+"'>"+itr.next()+"</option>");
            }
            out.println("</option>");
            
             out.println("</select>");
            
            
            //int paymentApproved=Integer.parseInt(request.getParameter("paymentApproved"));
            Vector vv=new Vector(getBookingDetail(id));
            Iterator itrr=vv.listIterator();
            
            out.println("<table border=1 >");
            while(itrr.hasNext()){
            //out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            //int bookingId = itr.next();
           
            out.println("<tr><td>BookingId</td><td><input type=text name='bookingId' value='"+itrr.next()+"'></td></tr>");
            out.println("<tr><td>BookingName</td><td>"+itrr.next()+"</td></tr>");
            out.println("<tr><td>PaymentProofId</td><td>"+itrr.next()+"</td></tr>");
            out.println("<tr><td>PaymentApprove</td><td>"+itrr.next()+"</td></tr>");
            out.println("<!--tr><td>lawyerId</td><td>"+itrr.next()+"</td></tr-->");
            }
            out.println("</table>");
            
            out.println("<input type=submit>");
            out.println("</form>");
            
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

    private java.util.List<java.lang.Object> getUser(int userID) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        eshan.GetUser port = service.getGetUserPort();
        return port.getUser(userID);
    }

    private java.util.List<java.lang.Object> getBookingDetail(int bookingId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        eshan.GetBookingDetail port = service_1.getGetBookingDetailPort();
        return port.getBookingDetail(bookingId);
    }

  

}

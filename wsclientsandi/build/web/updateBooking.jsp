<%-- 
    Document   : newjspupdateBooking
    Created on : Nov 1, 2019, 9:51:14 AM
    Author     : ARIESSANDI
--%>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	eshan.UpdateBooking_Service service = new eshan.UpdateBooking_Service();
	eshan.UpdateBooking port = service.getUpdateBookingPort();
	 // TODO initialize WS operation arguments here
	//int bookingId = 0;
	int paymentApproved = Integer.valueOf(request.getParameter("paymentApproved"));
        int bookingId = Integer.valueOf(request.getParameter("bookingId"));
	// TODO process result here
	java.lang.String result = port.updateBooking(bookingId, paymentApproved);
	out.println("Result = "+result);
        response.sendRedirect("index_1.html");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

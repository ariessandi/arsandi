<%-- 
    Document   : prosestampil
    Created on : Nov 1, 2019, 6:31:31 AM
    Author     : ARIESSANDI
--%>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	eshan.GetBooking_Service service = new eshan.GetBooking_Service();
	eshan.GetBooking port = service.getGetBookingPort();
	 // TODO initialize WS operation arguments here
	int paymentApproved = 0;
	// TODO process result here
	java.util.List<java.lang.Object> result = port.getBooking(paymentApproved);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

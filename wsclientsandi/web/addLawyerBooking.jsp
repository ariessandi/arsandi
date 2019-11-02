<%-- 
    Document   : addLawyerBooking
    Created on : Nov 2, 2019, 6:57:29 PM
    Author     : ARIESSANDI
--%>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	eshan.PostUser_Service service = new eshan.PostUser_Service();
	eshan.PostUser port = service.getPostUserPort();
	 // TODO initialize WS operation arguments here
	//int bookingId = 0;
	//int lawyerId = 0;
        int bookingId = Integer.valueOf(request.getParameter("bookingId"));
	int lawyerId = Integer.valueOf(request.getParameter("lawyerId"));
	// TODO process result here
	java.lang.String result = port.postUser(bookingId, lawyerId);
	out.println("Result = "+result);
        response.sendRedirect("index_1.html");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

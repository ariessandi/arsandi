<%-- 
    Document   : prosestambah
    Created on : Nov 1, 2019, 5:29:30 AM
    Author     : ARIESSANDI
--%>


    <%-- start web service invocation --%><hr/>
    <%
    try {
	eshan.PostUser_Service service = new eshan.PostUser_Service();
	eshan.PostUser port = service.getPostUserPort();
	 // TODO initialize WS operation arguments here
	java.lang.String username = request.getParameter("username");
	java.lang.String password = request.getParameter("password");
	// TODO process result here
	//java.lang.String result = port.postUser(username, password);
	//out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

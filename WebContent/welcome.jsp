<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%
	if(session.getAttribute("id")==null)
	{
		response.sendRedirect("index.jsp");
	}
%>
<h1>Login Successful</h1><br/>
 Welcome ${id}
 <br/>
 <form action="logout">
 <input type= "submit" value="Logout"></form>>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String emailid,password; %><%--variable declartion --%>
<%
try
  {
 Class.forName("");
 Connection con=DriverManager.getConnection("","","");
   }
catch(Exception e)
	{
		
	}

emailid = request.getParameter("email");
password= request.getParameter("password");
//RequestDispatcher rd1= request.getRequestDispatcher("home.jsp");
//RequestDispatcher rd2= request.getRequestDispatcher("login.jsp");
if(emailid.equals("raj@gmail.com") && password.equals("1234"))
{
out.println("successfully login");	
request.setAttribute("obj",emailid);
//rd1.forward(request,response);

%>
<jsp:forward page="home.jsp"></jsp:forward>
<%
}
else
{
out.println("failure try once again");	
//rd2.forward(request,response);
%>
<jsp:forward page="login.jsp"></jsp:forward>
<%
}
%>
</body>
</html>
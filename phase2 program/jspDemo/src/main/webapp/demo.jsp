<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Welcome to HTML web page</h2>
<%-- jsp commet  --%>
<%!int a,b,sum; %>
<%
sum=a+b;
out.println("welcome to jsp<br>");
out.println("sum of two number id "+sum);
a=100;
b=200;
sum=a+b;
out.println("<br/> <font color=red> sum of two number is "+sum+"</font>");

%>
<%
out.println("anotherb scriptlet tag");
%>
<br/>
<p>sum of two number id<%=10+20 %></p>
<p> sum of two number is <%=sum %></p>
<font color="red"> sum of <%=a %> and <%=b %> is<%=sum %></font>

</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Books</title>
</head>
<body>

	<h1>Subjects</h1>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Shortcut</th>
		</tr>
		<c:forEach var="subjects" items="${subjects}">
			<tr>
				<td>${subjects.id}</td>
				<td>${subjects.name}</td>
				<td>${subjects.shortcut}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="portal.html">Home</a>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Students</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body style="background-image: url('css/background.jpg');">
<div id="page" >
	

	
		<div id="wrapper">

			<div id="header">
				<h3>Students List</h3>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>

						<th>First Name</th>
						<th>Last Name</th>
						<th>age</th>
						

					</tr>

					<c:forEach var="students" items="${students}">
						<tr>

							<td>${students.fname}</td>
							<td>${students.lname}</td>
							<td>${students.age}</td>



						</tr>


					</c:forEach>

				</table><br/>
				<a href="portal.html">Home</a>
			</div>
		</div>
	</div>

</body>
</html>
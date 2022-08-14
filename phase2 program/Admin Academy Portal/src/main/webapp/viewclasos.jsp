<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List,com.samples.domain.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Classes</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body style="background-image: url('css/background.jpg');">


				<table>

					<tr>

						<th>Section</th>
						<th>Subject</th>
						<th>Time</th>
						<th>Teacher</th>
						

					</tr><tr></tr>
					
					<%List <Claso> clasos = (List<Claso>)request.getAttribute("clasos");
					List <Teacher> teachers = (List<Teacher>)request.getAttribute("teachers");
					List<Subject> subjects=(List<Subject>)request.getAttribute("subjects");
					for(Claso c:clasos){%>
					<tr>
                <td><%=c.getSection()%></td>
                <td><%int k=c.getSubject();
						for (Subject t:subjects){
					int l=t.getId();
							if (k==l){
								out.println(t.getShortcut());
							}
						}%>
                    </td><td><%=c.getTime() %></td>
                    
                    <td>
            
					
						<%int k1=c.getTeacher();
						for (Teacher t2:teachers){
					int l2=t2.getId();
							if (k1==l2){
								out.println(t2.getFname()+" "+t2.getLname());
							}
						}
					}
					%></td>

				</tr>

				</table>
				<br/>
				<a href="AddClass.html">Add Class </a>__________________________ <a href="portal.html">Home</a>
	

</body>
</html>
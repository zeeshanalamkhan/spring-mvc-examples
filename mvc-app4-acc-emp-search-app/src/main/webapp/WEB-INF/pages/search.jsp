<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search.jsp</title>
</head>
<body>
	<center>
		<h1>
			<u>Search Employees</u>
		</h1>
	</center>
	<form action="searchEmps.htm" method="POST">
		EmpNo: <input type="text" name="no"><br>
		EmpName: <input type="text" name="name"><br>
		EmpDesg: <input type="text" name="desg"><br>
		EmpSalary: <input type="text" name="salary"><br>
		<input type="submit" value="Search"><br>
	</form>
</body>
</html>
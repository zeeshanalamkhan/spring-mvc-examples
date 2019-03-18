<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>
	<center>
		<u>Register Student Details</u>
	</center>
</h1>
<%-- <font color="red"> <form:errors path="*" />
</font> --%>
<form:form method="POST" commandName="regCmd">
 Number: <form:input path="sno" />
	<form:errors path="sno" />
	<br>
 Name: <form:input path="sname" />
	<span style='color: red'><form:errors path="sname" /></span>
	<br>
 Course: <form:select path="course" multiple="true">
		<form:options items="${courseList }" />
		<form:errors path="course" />
		<br>
	</form:select>
	<input type="submit" value="REGISTER" />
</form:form>

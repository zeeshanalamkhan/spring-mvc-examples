<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>
	<center>
		<u>Register Student Details</u>
	</center>
</h1>
<%-- <font color="red"> <form:errors path="*" />
</font> --%>
<form:form method="POST" commandName="stCmd">
 Number: <form:input path="sno" />
	<form:errors path="sno" />
	<br>
 Name: <form:input path="sname" /><form:errors path="sname" />
	<br>
 Address: <form:input path="sadd" /><form:errors path="sadd" />
	<br>
	<input type="submit" value="REGISTER" />
</form:form>

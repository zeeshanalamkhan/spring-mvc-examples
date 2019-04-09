<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>
	<center>
		<u>Update Student Details</u>
	</center>
</h1>
<%-- <font color="red"> <form:errors path="*" />
</font> --%>
<form:form method="POST" commandName="stCmd">
 Number: <form:input path="sno" /><span style="color:red">
	<form:errors path="sno" /></span>
	<br>
 Name: <form:input path="sname" /><span style="color:red"><form:errors path="sname" /></span>
	<br>
 Address: <form:input path="sadd" /><span style="color:red"><form:errors path="sadd" /></span>
	<br>
	<input type="submit" value="UPDATE" />
</form:form>

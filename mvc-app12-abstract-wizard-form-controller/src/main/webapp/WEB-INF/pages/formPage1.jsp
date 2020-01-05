<center>
	<h1 style='color: #1b9'>
		<u>FormPage1</u>
	</h1>
</center>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="POST" commandName="regCommand">
UserName: <form:input path="userName" />
	</br>
Password: <form:input path="password" />
	
	</br>
	<input type="submit" value="next" name="_target1" />&nbsp;&nbsp;
	<input type="submit" value="cancel" name="_cancel" />
</form:form>
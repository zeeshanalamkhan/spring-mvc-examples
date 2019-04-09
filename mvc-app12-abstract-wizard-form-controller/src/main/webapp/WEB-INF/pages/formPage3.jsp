<center>
<h1 style='color:#1b9'><u>FormPage3</u></h1>
</center>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="POST" commandName="regCommand">
City: <form:input path="city" />
	</br>
Pincode: <form:input path="pincode" />
	</br>
	<input type="submit" value="previous" name="_target1" />&nbsp;&nbsp;
	<input type="submit" value="finish" name="_finish" />&nbsp;&nbsp;
	<input type="submit" value="cancel" name="_cancel" />
</form:form>
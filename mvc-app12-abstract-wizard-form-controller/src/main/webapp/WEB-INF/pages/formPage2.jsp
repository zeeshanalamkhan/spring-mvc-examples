<center>
<h1 style='color:#1b9'><u>FormPage2</u></h1>
</center>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="POST" commandName="regCommand">
EmailId: <form:input path="emailId" />
	</br>
Phone: <form:input path="phone" />
	</br>
	<input type="submit" value="previous" name="_target0" />&nbsp;&nbsp;
	<input type="submit" value="next" name="_target2" />&nbsp;&nbsp;
	<input type="submit" value="cancel" name="_cancel" />
</form:form>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<center style='color: #016'>
	<h2>
		<u>REGISTRATION PAGE</u>
	</h2>
</center>
<form:form method="POST" commandName="stCmd">
	<form:errors path="*" />
	<div align="left">
		NAME:
		<form:input path="name" />
		</br> DOB:
		<form:input path="dob" />
		</br> DOJ:
		<form:input path="doj" />
		</br> DOM:
		<form:input path="dom" />
		</br> <input type="submit" value="REGISTER" />
	</div>
</form:form>
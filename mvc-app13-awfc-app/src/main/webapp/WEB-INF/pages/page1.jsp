<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="POST" commandName="regCmd">
	<form:errors path="*"></form:errors>
	<center>
		<h1 style='color: #1b9'>
			<u>Submit Employee Details</u>
		</h1>
	</center>
	<h2>
		<a href="register.htm">Register</a>&nbsp;&nbsp; <a href="listEmps.htm">All
			Employees</a>
	</h2>
	</br>
	EMPNO: <form:input path="empNo" />
	</br>
	ENAME: <form:input path="ename" />
	</br>
	<input type="submit" value="Next" name="_target1" />
	<input type="submit" value="Cancel" name="_cancel" />
</form:form>

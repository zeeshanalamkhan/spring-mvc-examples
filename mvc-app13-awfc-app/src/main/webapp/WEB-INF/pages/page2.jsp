<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="POST" commandName="regCmd">
	<form:errors path="*"></form:errors>
	<center>
		<h1 style='color: #1b9'>
			<u>Submit Employee Details</u>
		</h1>
	</center>
	<h2>
		<a href="home.htm">Home</a>&nbsp;&nbsp; <a href="listEmps.htm">All
			Employees</a>
	</h2>
	</br>
	HIREDATE: <form:input path="hireDate" />
	</br>
	SALARY: <form:input path="salary" />
	</br>
	<input type="submit" value="Previous" name="_target0" />
	<input type="submit" value="NEXT" name="_target2" />
	<input type="submit" value="Cancel" name="_cancel" />
</form:form>

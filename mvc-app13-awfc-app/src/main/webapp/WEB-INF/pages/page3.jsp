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
	COMM: <form:input path="comm" />
	</br>
	DEPTNO: <form:input path="deptNo" />
	</br>
	<input type="submit" value="Previous" name="_target1" />
	<input type="submit" value="Finish" name="_finish" />
	<input type="submit" value="Cancel" name="_cancel" />
</form:form>

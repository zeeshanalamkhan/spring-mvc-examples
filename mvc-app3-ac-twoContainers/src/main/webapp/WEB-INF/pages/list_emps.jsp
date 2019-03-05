<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" bgcolor="red">
	<tr bgcolor="#00FF00">
		<th>ENO</th>
		<th>ENAME</th>
		<th>JOB</th>
		<th>SALARY</th>
	</tr>
	<c:forEach var="emp" items="${empList }">
		<tr bgcolor="cyan">
			<td><c:out value="${emp.no }" /></td>
			<td><c:out value="${emp.name }" /></td>
			<td><c:out value="${emp.job }" /></td>
			<td><c:out value="${emp.salary }" /></td>
		</tr>
	</c:forEach>
</table>
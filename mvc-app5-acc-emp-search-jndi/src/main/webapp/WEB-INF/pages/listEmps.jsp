<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
	<h1>
		<u>SearchResults</u>
	</h1>
</center>
<br>
<h3>
	<a href="search.htm">Search Again</a>
</h3>
<c:if test="${not empty seachResults }">
	<table align="center" border="1">
		<tr>
			<th>EmpNo</th>
			<th>EmpName</th>
			<th>Salary</th>
			<th>Desg</th>
			<th>DeptNo</th>
			<th>ManagerNo</th>
		</tr>
		<c:forEach items="${seachResults}" var="result">
			<tr>
				<td><c:out value="${result.no}" /></td>
				<td><c:out value="${result.name}" /></td>
				<td><c:out value="${result.salary}" /></td>
				<td><c:out value="${result.desg}" /></td>
				<td><c:out value="${result.deptno}" /></td>
				<td><c:out value="${result.mgrno}" /></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
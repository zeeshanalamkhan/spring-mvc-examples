<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="true"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<center>
	<h1 style='color: #1b9'>
		<u>All Employees</u>
	</h1>
</center>
<h2>
	<a href="register.htm">Register</a>&nbsp;&nbsp; <a href="listEmps.htm">All
		Employees</a>
</h2>
</br>
<table border="1" bgcolor="pink" width="100%">
	<tr bgcolor="green">
		<th>EMPNO</th>
		<th>ENAME</th>
		<th>JOB</th>
		<th>SALARY</th>
	</tr>
	<c:choose>
		<c:when test="${empList  ne null}">
			<c:forEach var="st" items="${empList}">
				<tr bgcolor="gray">
					<td><c:out value="${st.empNo }" /></td>
					<td><c:out value="${st.ename }" /></td>
					<td><c:out value="${st.job }" /></td>
					<td><c:out value="${st.salary }" /></td>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<h2><span style='color: red'><u><b>NO RECORD FOUND</b></u></span></h2>
		</c:otherwise>
	</c:choose>
</table>

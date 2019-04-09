<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>
	<center>
		<u>List Students</u>
	</center>
</h1>
<table bgcolor="cyan" border="1" width="100%">
	<tr bgcolor="green">
		<th>SNO</th>
		<th>SNAME</th>
		<th>SADD</th>
		<th>DELETE</th>
	</tr>
	<c:choose>
		<c:when test="${stList ne null }">
			<c:forEach var="st" items="${stList }">
				<tr>
					<td><a href="update.htm?id=${st.sno }"><c:out
								value="${st.sno }" /></a></td>
					<td><c:out value="${st.sname }" /></td>
					<td><c:out value="${st.sadd }" /></td>
					<td><a href="delete.htm?id=${st.sno }"><c:out
								value="${st.sno }" /></a></td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<span style="color: red">No Record Found</span>
		</c:otherwise>
	</c:choose>
</table>
<br>
<br>
<h2>
	<br> <a href="home.htm">home</a>
</h2>
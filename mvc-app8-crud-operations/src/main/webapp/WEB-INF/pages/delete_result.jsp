<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>
	<center style='color: #880043'>
		<u>Delete Result Page</u>
	</center>
</h1>
<c:if test="${delMsg ne null }">
	<h2 style='color: green'>${delMsg }</h2>
</c:if>
<br>
<h3>
	<a href="home.htm"><span style='color: red'>home</span></a>
</h3>
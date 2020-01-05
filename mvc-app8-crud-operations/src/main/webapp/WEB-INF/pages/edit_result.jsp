<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>
	<center style='color:#880043'>
		<u>Edit Result Page</u>
	</center>
</h1>
<c:if test="${updMsg ne null }">
<h2 style='color:green'>${updMsg }</h2>
</c:if>
<br>
<h3>
<a href="home.htm">home</a>
</h3>
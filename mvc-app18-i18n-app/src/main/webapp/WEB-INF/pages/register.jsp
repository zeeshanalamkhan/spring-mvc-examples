<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page isELIgnored="false"%>

<center>
	<h1 style='color: #1b9'>
		<u><spring:message code="reg" /></u>
		<!-- <u>Registration Form</u> -->
	</h1>
</center>
<h2>
	Language: <a href="?language=en">English</a>&nbsp;&nbsp; <a
		href="?language=ur_PK">اردو</a>&nbsp;&nbsp;<a href="?language=hi_IN">हिंदी
	</a>
</h2>
</br>
<h3>
	<spring:message code="my.un" />
	<input type="text" name="username" /><br>

	<spring:message code="my.pw" text="default text" />
	<input type="password" name="paassword" /><br>
</h3>
Selected Locale:${pageContext.response.locale }

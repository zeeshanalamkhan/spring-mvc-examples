<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<form action="perform.htm" metod="POST">
	SNO: <input type="text" name="sno" /></br> SNAME: <input type="text"
		name="sname" /></br> SADD: <input type="text" name="sadd" /></br> <input
		type="submit" name="opt" value="insert" /> <input type="submit"
		name="opt" value="update" /> <input type="submit" name="opt"
		value="delete" /> <input type="submit" name="opt" value="view" />
</form>
</br>


	${operation } is Successfull.

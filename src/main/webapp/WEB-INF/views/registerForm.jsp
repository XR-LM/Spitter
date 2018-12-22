<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
 <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>"/>
<title>Spitter</title>
</head>
<body>
<h1>Register</h1>
	
	<sf:form method="post" commandName="spitter">
		<sf:errors path="*" element="div" cssClass="errors"/>
		<sf:label path="firstName" cssErrorClass="error">firstName</sf:label><sf:input path="firstName" cssErrorClass="error"></sf:input><br/>
		<sf:label path="lastName" cssErrorClass="error">lastName</sf:label><sf:input path="lastName" cssErrorClass="error"></sf:input><br/>
		<sf:label path="username" cssErrorClass="error">username</sf:label><sf:input path="username" cssErrorClass="error"></sf:input><br/>
		<sf:label path="password" cssErrorClass="error">password</sf:label><sf:password path="password" cssErrorClass="error"></sf:password><br/>
		<input type="submit" value="Register"/>
	</sf:form>
</body>
</html>
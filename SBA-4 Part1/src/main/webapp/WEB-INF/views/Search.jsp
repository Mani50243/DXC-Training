<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/mani.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="searchid">
ScientistId:<input type="text" name="sid">
<input type="submit" value="Search">
</form>
<form action="Searchbyname">
ScientistName:<input type="text" name="sname">
<input type="submit" value="Search">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<title>Update</title>
<link href="<c:url value="/resources/css/mani.css" />" rel="stylesheet">
</head>
<body>
<h1>
Hello Scientist PLz Update ur Details!  
</h1>
<form action="searchforUpdate">
SId:<input type="text" name="sid" value="${scientist.sid}">
<input type="submit" value="search">
</form>


<form action="updatedata">
SName:<input type="text" name="sname" value="${scientist.sname}">
<br>
<br>Date <input type="text" name="DOB" value="${scientist.getDOB()}">
<br>
<input type="submit" value="update scientist">
</form>

</body>
</html>
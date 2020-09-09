<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/css/mani.css" />" rel="stylesheet">
</head>
<body>
<center>
<h1>
	Hello world!  
</h1>

<div>
<form action="save">
Sname:<label><input type="text" name="sname"></label><br>
Sid:<lable><input type="text" name="sid"></label><br>
DOB:<lable><input type="date" name="DOB"></label><br>
<input type="submit">
</form>
</div>
<form action="updatePage">
<input type="submit" value="update">
</form>
<form action="delete">
scientistName:<input type="text" name="sname">
<input type="submit" value="delete">
</form>
<form action="Search">
<input type="submit" value="SearchBY">
</form>
<form action="SearchAll">
<input type="submit" value="SearchAll">
</form>
</center>
</body>
</html>

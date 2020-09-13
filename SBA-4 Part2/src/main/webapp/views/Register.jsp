<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link href="/css/ma.css" rel="stylesheet"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="ok">
<div class="form-group">
userId:<input type="text" name="user_id" class="form-control" placeholder="Enter userID" required><br>
userName:<input type="text" name="user_name" class="form-control" placeholder="Enter userName" required><br>
password:<input type="password" name="password" class="form-control" placeholder="Enter password" required><br>
security_question:<select name="security_question" class="form-control" required>
<option>Choose question</option>
<option>Favourite city</option>
<option>Favourite game</option>
<option>Favourite actor</option>
<option>Favourite pet name</option>
</select><br>
security_answer:<input type="text" name="security_answer" class="form-control" placeholder="Enter security answer" required><br>
<button type="submit" class="btn btn-primary">Register</button>
</div>
</form>
</center>
</body>
</html>
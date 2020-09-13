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

<form action="forgot">
<div class="form-group">
<label>UserId</label><input type="text" name="id" class="form-control" placeholder="Enter userID"><br>
<label>SecurityQuestion:</label><select name="qs" class="form-control">
<option>choose the question</option>
<option>Favourite pet name</option>
<option>Favourite city</option>
<option>Favourite game</option>
<option>Favourite actor</option>
</select><br>
<label>SecurityAnswer:</label><input type="text" name="answer" class="form-control" placeholder="Enter security answer">
<button type="submit" class="btn btn-primary">validate</button>
</div>
</form>
</body>
</html>
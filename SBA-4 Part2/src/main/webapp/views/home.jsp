<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script type="text/javascript">
function test(){
	alert("invalid pass");
}

</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="/img/on.jpg">
<div class="container">
<center>
<form action="user">
<div class="form-group">
UserId<input type="text" name="userId"><br>
</div>
<div class="form-group">
Password<input type="password" name="password"><br>
</div>
<button type="submit" class="btn btn-primary">Submit</button>
</form>
<form action="fi">
<input type="submit" value="forgotpassword">
</form>

<form action="reg">
<input type="submit" value="Register">
</form>
</center>
</div>
<c:if test="${val!=valid}"><div class="alert alert-danger" role="alert">
  invalid pass
</div>
</c:if>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="/css/ma.css" rel="stylesheet"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
function test(form){
	var pwd= form.pass.value;
	var pwds=form.password.value;
	if(pwd!=pwds){
		alert('pass and confirm pass must be same');
		return false;
	}
}
</script>
<center>
<form onsubmit="return test(this)" action="update">
<table>
<div class="form-group">
<label>userId:</label><input type="text" value="${user_id}" class="form-control"><br>
<label>Newpassword:</label><input type="password" id="pass" name="pass" class="form-control" placeholder="Enter new password"><br>
<label>confirmPassword:</label><input type="password" id="password" name="password" class="form-control" placeholder="Confirm password"><br>
<button type="submit" class="btn btn-primary">Submit</button>
</div>
</table>
</form>
</center>
</body>
</html>
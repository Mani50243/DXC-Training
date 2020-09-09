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
<table border="1">
<tr><td>sname</td><td>sid</td><td>DOB</td></tr>
<c:forEach items="${sci}" var="st">
<tr><td><c:out value="${st.getSname()}"/></td>
<td><c:out value="${st.getSid()}"/></td>
<td><c:out value="${st.getDOB()}"/></td></tr><br>
</c:forEach>
</table>

</body>
</html>
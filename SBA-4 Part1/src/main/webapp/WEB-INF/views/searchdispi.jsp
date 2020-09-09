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
<c:choose>
<c:when test="${stti==null}"><h1>No Record found</h1></c:when>
<c:otherwise>
<table>
<tr><td>sname</td><td>sid</td><td>DOB</td></tr>
<tr><td><c:out value="${stti.getSname()}"/></td>
<td><c:out value="${stti.getSid()}"/></td>
<td><c:out value="${stti.getDOB()}"/></td></tr>
</table>
</c:otherwise>
</c:choose>
</body>
</html>
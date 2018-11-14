<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td><c:out value="ID"></c:out></td>
<td><c:out value="NAME"></c:out></td>
<td><c:out value="FEES"></c:out></td>
<td><c:out value="EXPERIENCE"></c:out></td>

<td><c:out value="QUALIFICATION"></c:out></td>
<td><c:out value="GENDER"></c:out></td>

</tr>

<c:forEach items="${sessionScope.DOCTORS}" var="d">


<tr>
<td><c:out value="${d.id}"></c:out></td>
<td><c:out value="${d.name}"></c:out></td>
<td><c:out value="${d.fees}"></c:out></td>
<td><c:out value="${d.experience}"></c:out></td>

<td><c:out value="${d.qualification}"></c:out></td>
<td><c:out value="${d.gender}"></c:out></td>

</tr>



</c:forEach>
</table>
<a href="input.html">repeat</a>

</body>
</html>
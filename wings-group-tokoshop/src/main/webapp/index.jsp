<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Tokoshop</title>
<jsp:include page="/WEB-INF/jsp/bootstrap/head.jsp" />
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/bootstrap/navbar.jsp" />
	<jsp:include page="/WEB-INF/jsp/template/footer.jsp" />
	<%
		response.sendRedirect("index/landing");
	%>
</body>
</html>
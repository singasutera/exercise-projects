<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="wingsgroup.tokoshop.model.*"%>
<%@page import="wingsgroup.tokoshop.dto.*"%>
<%@page import="wingsgroup.tokoshop.service.*"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html>
<html>
<head>
<title>${p.productName}</title>
<jsp:include page="bootstrap/head.jsp" />
</head>
<body>
	<jsp:include page="bootstrap/navbar.jsp" />
	<div class="container">
		<div class="card mb-3" style="max-width: 540px; margin: 20px">
			<div class="row g-0">
				<div class="col-md-4">
					<img
						src="${pageContext.request.contextPath}/resources/img/${p.image}"
						class="img-fluid rounded-start" alt="Maaf, gambar belum tersedia">
				</div>
				<div class="col-md-8">
					<div class="card-body">
						<h5 class="card-title">${p.productName}</h5>
						<p class="card-text">
							<s>Harga Asli</s>
						</p>
						<p class="card-text">
							<f:formatNumber type="currency" currencyCode="${p.currency}">${p.price}</f:formatNumber>
						</p>
						<p class="card-text">Dimension : ${p.dimension}</p>
						<p class="card-text">Price Unit : ${p.unit}</p>
						<div class="mt-3 d-flex justify-content-between">
							<a class="btn btn-dark" href="${pageContext.request.contextPath}/index/landing">Back to Home</a>
							<a class="btn btn-primary" href="#">BUY</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="template/footer.jsp" />
</body>
</html>
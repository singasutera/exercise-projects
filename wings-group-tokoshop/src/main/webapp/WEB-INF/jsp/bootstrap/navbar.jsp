<%@page import="wingsgroup.tokoshop.model.*"%>
<%@page import="wingsgroup.tokoshop.dto.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%
LoginDto loginDto = (LoginDto) request.getSession().getAttribute("loginOK");
%>

<nav class="navbar navbar-expand-lg bg-light">
	<div class="container">
		<a class="navbar-brand" href="index.jsp">Tokoshop</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto">
				<li class="nav-item"><a class="nav-link disabled">${message}</a></li>
				<%
				if (loginDto != null) {
				%>
				<li class="nav-item"><a class="nav-link disabled">Welcome, ${username}!</a></li>
				<%
				}
				%>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="checkout.jsp">Cart</a>
				</li>
				<%
				if (loginDto != null) {
				%>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/index/logout">Logout</a></li>
				<%
				} else {
				%>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/user/login">Login</a></li>
				<%
				}
				%>
			</ul>
		</div>
	</div>
</nav>
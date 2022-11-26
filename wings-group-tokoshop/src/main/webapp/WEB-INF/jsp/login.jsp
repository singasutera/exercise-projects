<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page import="wingsgroup.tokoshop.model.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
Login login = (Login) session.getAttribute("userattr");
%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<jsp:include page="template/header.jsp" />
<jsp:include page="template/topbar.jsp" />
</head>
<body>

	<div class="container">
		<!-- container -->
		<div class="card w-50 mx-auto my-5">
			<!-- card width 50, x centered, y margin 5-->
			<div class="card-header text-center">
				LOGIN
				<div class="card-body">
					<form:form action="${pageContext.request.contextPath}/user/checkLogin"
						method="POST" modelAttribute="userattr">

						<div class="form-group">
							<input type="text" class="form-control" name="username"
							 placeholder="Username" required>
						</div>
						<div class="form-group">
							<input type="password" class="form-control" name="password"
								 placeholder="Password" required>
						</div>

						<div class="text-center">
							<button type="submit" class="btn btn-primary">LOGIN</button>
						</div>

					</form:form>
					<div class="text-center">${message}</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="template/footer.jsp" />
</body>
<!-- <script> -->
<!-- 	$(document).ready(function() { -->
<!-- 		$('#showPassword').click(function() { -->
<!-- 			if ($(this).is(':checked')) { -->
<!-- 				$('#password').attr('type', 'text'); -->
<!-- 			} else { -->
<!-- 				$('#password').attr('type', 'password'); -->
<!-- 			} -->
<!-- 		}); -->
<!-- 	}); -->
<!-- </script> -->
</html>
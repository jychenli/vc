<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" import="java.util.Date"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet"
	href="${ctxStatic}/bootstrap-3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${ctxStatic}/common/css/style.css?d=<%=new Date().getTime()%>">
</head>
<body>

	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
				<p>Add products</p>
			</div>
		</div>
	</section>

	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Please sign in</h3>
					</div>
					<div class="panel-body">
						<c:if test="${not empty error}">
							<div class="alert alert-danger">
								<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"></spring:message><br />
							</div>
						</c:if>
						<form action="<c:url value="/user/login"></c:url>" method="post">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="User Name"
										name='username' type="text">
								</div>

								<div class="form-group">
									<input class="form-control" placeholder="Password" name='password' type="password" value="">
								</div>
								<div class="form-group">
									<input class="form-control width-55 inline" id="captcha" /><img src="${pageContext.request.contextPath}/sys/jCaptcha.jpg" width="120px" height="34px"/>
								</div>

								<input class="btn btn-lg btn-success btn-block" type="submit" value="Login">

							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
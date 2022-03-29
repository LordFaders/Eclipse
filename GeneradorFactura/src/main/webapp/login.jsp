<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Login</title>
</head>
<body>


	<div class="container ">
		<div class="row">
			<div class="col-8 justify-content-center">
				<img
					src="https://blog.desafiolatam.com/wp-content/uploads/2019/02/desafio-latam-logo-orizontal.png"
					alt="logo"
					style="width: 200px; height: 45px; margin-top: 5%; margin-left: 10%;">
			</div>
			<div class="col-4 lh-1 mt-5">
				<p class="text mb-1 fw-bold text-end">Generador Factura 2019</p>
				<p class="text mb-1 fw-bold text-end">Competition Part Ltda.</p>
				<p class="text mb-1 text-end">Año 2022 Marzo JC.</p>
			</div>
		</div>
		<div class="container">

			<c:if test="${msgError != null}">
				<div class="alert alert-danger" role="alert">
					<c:out value="${msgError}"></c:out>
				</div>
			</c:if>

			<h2 class="text mt-5 mb-3">Formulario de Ingreso</h2>
			<form action="procesaLogin" method="post">
				<label for="login" class="form-label">Login:</label> <input
					type="text" class="form-control" name="login" id="login"
					placeholder="Ingresa login"><br> <label for="password"
					class="form-label">Password:</label> <input type="password"
					class="form-control" name="password" id="password"
					placeholder="Ingresar password"><br> <br>
				<button type="submit" class="btn btn-primary mb-3">Login</button>
			</form>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>
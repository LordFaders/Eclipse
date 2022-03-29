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
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Servlets</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			∫
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/ZZJavaG6Servlet">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="registro">Usuario</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="login">Logout</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container mt-5">
		<div class="row"></div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Marca</th>
					<th scope="col">Modelo</th>
					<th scope="col">Color</th>
					<th scope="col">Velocidad</th>
					<th scope="col">Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="auto" items="${listaAutos}">
				<tr>
					<th scope="row"><c:out value="${auto.id}"></c:out></th>
					<td><c:out value="${auto.marca}"></c:out></td>
					<td><c:out value="${auto.modelo}"></c:out></td>
					<td><c:out value="${auto.color}"></c:out></td>
					<td><c:out value="${auto.velocidad}"></c:out></td>
					<td>
					<a class="btn btn-outline-primary" href="#" role="button">Editar</a>
					<a class="btn btn-outline-danger" href="auto?accion=eliminar&id=<c:out value="${auto.id}"></c:out>" role="button">Eliminar</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.desafioLatam.modeloDTO.Producto"%>
<%@ page import="com.desafioLatam.modeloDTO.Categoria"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="image/png"
	href="https://cdn-icons.flaticon.com/png/512/2667/premium/2667674.png?token=exp=1648529893~hmac=3d354c881586bcdeb1212dd28415855c">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
	<style>
	body{background-image: url("https://images.pexels.com/photos/311039/pexels-photo-311039.jpeg");
	}
	</style>
<title>Listar Producto</title>
</head>

<%
List<Producto> productos;
// capturamos informacion que viene desde el request
productos = (List) request.getAttribute("productos");
List<Categoria> categorias;
categorias = (List) request.getAttribute("categorias");
%>

<body class="main">
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid ">
			<a class="navbar-brand fw-bold" href="# "> <img
				src="https://images.pexels.com/photos/5217783/pexels-photo-5217783.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
				alt=" " width="30 " height="24 "
				class="d-inline-block align-text-top "> Artículos de Limpieza
			</a>
			<div class="collapse navbar-collapse " id="navbarSupportedContent ">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0 ">

					<li class="nav-item fw-bold"><a class="nav-link active"
						href="agregarProducto">Agregar</a></li>

					<li class="nav-item fw-bold"><a class="nav-link active"
						href="listarProducto">Listar</a></li>
				</ul>
				<form class="d-flex ">
					<a class="btn btn-outline-light fw-bold"
						href="/SistemaDeArtículosDeLimpieza" role="button">HOME</a>
				</form>
			</div>
		</div>
	</nav>
	<div class="container col-8 text-primary" style="margin-top:5%">
	
	<c:if test="${msgOK != null}">
			<div class="alert alert-warning" role="alert">
				<c:out value="${msgOK}"></c:out>
			</div>
		</c:if>

		<c:if test="${msgError != null}">
			<div class="alert alert-danger" role="alert">
				<c:out value="${msgError}"></c:out>
			</div>
		</c:if>

		<div class="container mt-5 ">
			<h2 class="text text-center fw-bold">Listado de Productos</h2>
			<table class="table table-hover table-striped text-primary fw-bold">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">NOMBRE</th>
						<th scope="col">PRECIO</th>
						<th scope="col">DESCRIPCIÓN</th>
						<th scope="col">CATEGORÍA</th>
					</tr>
				</thead>
				<tbody>
					<%
					for (Producto dto : productos) {
					%>
					<tr>
						<td><%=dto.getId_producto()%></td>
						<td><%=dto.getNombre_producto()%></td>
						<td><%=dto.getPrecio_producto()%></td>
						<td><%=dto.getDescripcion_producto()%></td>
						<td><%=dto.getCategoria().getNombre_Categoria()%></td>
					
					<td><a class="btn btn-outline-primary fw-bold" href="editarProducto?id_producto=<%=dto.getId_producto()%>" role="button">Editar</a></td>
					<td><a class="btn btn-outline-danger fw-bold" href="eliminarProducto?id_producto=<%=dto.getId_producto()%>" role="button">Eliminar</a></td>
		
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</div>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js "
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p "
		crossorigin="anonymous "></script>
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>Editar Producto</title>
</head>

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
	<div class="container col-4 text-primary fw-bold" style="margin-top:10%">
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

		<form action="editarProducto" method="post">
			<h3 class="text fw-bold mb-4">Ingrese los nuevos datos del producto</h3>
			<div class="mb-3">
				<input type="hidden" class="form-control" id="id_producto"
					name="id_producto" value='<c:out value="${producto.id_producto}"></c:out>'> 
					<label
					for="nombre_producto" class="form-label">Nombre</label> <input
					type="text" class="form-control" id="nombre_producto"
					name="nombre_producto" value='<c:out value="${producto.nombre_producto}"></c:out>'>
			</div>
			<div class="mb-3">
				<label for="precio_producto" class="form-label">Precio</label> <input
					type="text" class="form-control" id="precio_producto"
					name="precio_producto" value="${producto.precio_producto}">
			</div>
			<div class="mb-3">
				<label for="descripcion_producto" class="form-label">Descripción</label>
				<input type="text" class="form-control" id="descripcion_producto"
					name="descripcion_producto" value="${producto.descripcion_producto}">
			</div>
			<label for="categoria" class="form-label">Categoría</label>
			<select class="form-select" name="categoria" id="categoria">
				<option selected value="0">Seleccione categoría de producto</option>
				<c:forEach items="${categorias}" var="categoria" >
	s			<c:if test="${categoria.getId_categoria() == producto.categoria.getId_categoria()}">
					<option selected value="${categoria.getId_categoria()}">${categoria.getNombre_Categoria()}</option>
				</c:if>
				<c:if test="${categoria.getId_categoria() != producto.categoria.getId_categoria()}">
					<option value="${categoria.getId_categoria()}">${categoria.getNombre_Categoria()}</option>
				</c:if>
				</c:forEach>
			</select>

			<button type="submit" class="btn btn-primary mt-3">Submit</button>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js "
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p "
		crossorigin="anonymous "></script>
	</script>
</body>
</html>
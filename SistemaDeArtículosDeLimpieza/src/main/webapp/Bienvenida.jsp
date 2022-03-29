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
<title>Bienvenida</title>
</head>

<body class="main" style="background-color: #84a562">
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid ">
			<a class="navbar-brand fw-bold" href="# "> <img
				src="https://images.pexels.com/photos/5217783/pexels-photo-5217783.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
				alt=" " width="30 " height="24 "
				class="d-inline-block align-text-top"> Artículos de Limpieza
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
	
	<div class="container ">

		<div class="image d-flex justify-content-center my-5">
			<img
				src="https://images.pexels.com/photos/5217783/pexels-photo-5217783.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
				alt="logo " style="width: 300px; height: 320px;"></img>
		</div>
		<div class="text mb-1 fw-bold text-center text-primary">
			<h1>Bienvenido al Sistema de Artículos de Limpieza</h1>
			<h3>Presione una opción en la barra de navegación para continuar.</h3>
		</div>
	</div>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js "
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p "
		crossorigin="anonymous "></script>
	</script>
</body>

</html>
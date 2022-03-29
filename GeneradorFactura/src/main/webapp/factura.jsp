<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
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
<title>Factura</title>
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
	</div>

	<form action="factura" method="post">
		<!--  <div class="container mt-5 pt-5">
			<div class="row g-3 ">
				<div class="col-md-4 ">
					<label class="form-label ">Nombre Completo</label> <input
						type="text" readonly class="form-control" name="nombre"
						value="${nombre}">
				</div>
				<div class="col-md-4 ">
					<label class="form-label">Empresa</label> <input type="text"
						readonly class="form-control" name="empresa"
						value="${empresa}">
				</div>
				<div class="col-md-4 ">
					<label class="form-label ">Rut</label> <input type="text" readonly
						class="form-control " name="rut" value="${rut}">
				</div>
				<div class="col-md-4 ">
					<label class="form-label ">Dirección</label> <input type="text" readonly
						class="form-control " name="direccion" value="${direccion}">
				</div>
				<div class="col-md-4 ">
					<label class="form-label ">Ciudad</label> <input type="text" readonly
						class="form-control " name="ciudad" value="${ciudad}">
				</div>
				<div class="col-md-4 ">
					<label class="form-label ">País</label> <input type="text" readonly
						class="form-control " name="pais" value="${ciudad}">
				</div>
			</div>
		</div>-->
		<div class="container mt-5">
			<div class="row">
				<div class="col-6">
					<div class="card" style="width: 18rem;">
						<ul class="list-group list-group-flush">
							<li class="list-group-item fw-bold">Información de Cliente</li>
							<li class="list-group-item">${nombre}</li>
							<li class="list-group-item">${empresa}</li>
							<li class="list-group-item">${ciudad},${pais}</li>
							<li class="list-group-item">${direccion}</li>
						</ul>
					</div>
				</div>

				<div class="col-6 d-flex justify-content-end">
					<div class="card" style="width: 18rem;">
						<ul class="list-group list-group-flush text-end">
							<li class="list-group-item fw-bold">Detalles de pago</li>
							<li class="list-group-item">NUM FACTURA: 1425782</li>
							<li class="list-group-item">ID FACTURA: ${rut}</li>
							<li class="list-group-item">TIPO PAGO: Dinero</li>
							<li class="list-group-item">EMPRESA: Importadora</li>
							<li class="list-group-item">${direccion}</li>
						</ul>
					</div>
				</div>
			</div>
		</div>


		<div class="container mt-5 ">

			<table class="table table-dark table-hover table-striped">
				<thead>
					<tr>
						<th scope="col">ITEM</th>
						<th scope="col">DESCRIPCION</th>
						<th scope="col">VALOR UNIDAD</th>
						<th scope="col">CANTIDAD</th>
						<th scope="col">VALOR TOTAL</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="producto" items="${listaProductos}">
						<tr>
							<td><c:out value="${producto.producto}"></c:out></td>
							<td><c:out value="${producto.descripcion}"></c:out></td>
							<td><fmt:formatNumber value="${producto.valorUnitario}"
									pattern="#,##0" /></td>
							<td><c:out value="${producto.cantidad}"></c:out></td>
							<td class="text-end">$ <fmt:formatNumber
									value="${producto.valorTotal}" pattern="#,##0" /></td>
						</tr>

					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="container d-flex justify-content-end">
			<div class="row"></div>
		</div>


		<div class="container mt-5">
			<footer class="footer bg-dark">
				<div class="row">
					<div class="col-6"></div>
					<div class="col-2">
						<div class="card text-center bg-dark text-white">
							<div class="card-body">
								<h6 class="card-title">VALOR TOTAL NETO</h6>
								<p class="card-text">$${valorNeto}</p>
							</div>
						</div>
					</div>
					<div class="col-2">
						<div class="card text-center bg-dark text-white">
							<div class="card-body">
								<h6 class="card-title">DESCUENTO</h6>
								<p class="card-text">10%</p>
							</div>
						</div>
					</div>
					<div class="col-2">
						<div class="card text-center bg-dark text-white">
							<div class="card-body">
								<h6 class="card-title">VALOR TOTAL</h6>
								<p class="card-text">$${valorTotal}</p>
							</div>
						</div>
					</div>
				</div>
			</footer>
		</div>
		<div class="container mt-3 pb-5">
		<div class="row ">
			<div class="col-md-12 text-right d-flex justify-content-center">
				<input type="button" class="btn btn-secondary" value="Página anterior"
					onClick="history.go(-1);">
			</div>
		</div>
		</div>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js "
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p "
		crossorigin="anonymous "></script>

</body>
</html>
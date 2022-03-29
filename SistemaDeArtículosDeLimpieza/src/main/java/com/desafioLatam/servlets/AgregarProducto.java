package com.desafioLatam.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafioLatam.facade.Facade;
import com.desafioLatam.modeloDTO.Categoria;
import com.desafioLatam.modeloDTO.Producto;

@WebServlet("/agregarProducto")
public class AgregarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Pasar parámetros al formulario
		Facade facade = new Facade();

		List<Categoria> categorias = facade.obtenerListaCategorias();

		request.setAttribute("categorias", categorias); // selector

		request.getRequestDispatcher("AgregarProducto.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Facade facade = new Facade();
		// capturando desde el formulario
		String nombre = request.getParameter("nombre_producto");
		String precio = request.getParameter("precio_producto");
		String descripcion = request.getParameter("descripcion_producto");
		String categoriaId = request.getParameter("id_categoria");

		if (categoriaId.equals("0") || nombre.equals("") || nombre == null || precio.equals("") || precio == null
				|| descripcion.equals("") || descripcion == null) {
			request.setAttribute("msgError", "Error, datos faltantes.");
		} else {
			Categoria categoria = new Categoria();
			categoria.setId_categoria(Integer.parseInt(categoriaId));
			Producto producto = new Producto(nombre, Integer.parseInt(precio), descripcion, categoria);

			// llamado al metodo en el Facade
			int resultado = facade.AgregarProductoDAO(producto);
			if (resultado == 1) {
				request.setAttribute("msgOK", "El nuevo producto se ha agregado correctamente.");
			} else {
				request.setAttribute("msgError", "Error al agregar el producto.");
			}
		}
		doGet(request, response);
	}

}

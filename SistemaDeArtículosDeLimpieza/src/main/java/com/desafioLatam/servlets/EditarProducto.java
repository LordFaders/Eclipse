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

@WebServlet("/editarProducto")
public class EditarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Pasar parámetros al formulario
		Facade facade = new Facade();
		String idProducto = request.getParameter("id_producto");

		Producto producto = facade.mostrarProducto(Integer.parseInt(idProducto));
		request.setAttribute("producto", producto);

		List<Categoria> categorias = facade.obtenerListaCategorias();

		request.setAttribute("categorias", categorias); // selector
		request.setAttribute("producto", producto);
		request.getRequestDispatcher("EditarProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// capturando desde el formulario
		Facade facade = new Facade();

		String idProducto = request.getParameter("id_producto");
		String nombre = request.getParameter("nombre_producto");
		String precio = request.getParameter("precio_producto");
		String descripcion = request.getParameter("descripcion_producto");
		String categoriaId = request.getParameter("categoria");

		Categoria categoria = new Categoria();
		categoria.setId_categoria(Integer.parseInt(categoriaId));

		Producto producto = new Producto(Integer.parseInt(idProducto), nombre, Integer.parseInt(precio), descripcion,
				categoria);

		if (nombre != null && precio != null && descripcion != null && categoria != null && !nombre.isEmpty()
				&& !precio.isEmpty() && !descripcion.isEmpty()) {

			// llamado al metodo en el Facade
			int resultado = facade.editarProducto(producto);
			if (resultado == 1) {
				request.setAttribute("msgOK",
						"El producto se ha modificado correctamente." + "Para editar otro producto vaya a Listar.");
			} else {
				request.setAttribute("msgError", "Error al modificar los datos el producto.");
			}
		}
		doGet(request, response);
	}

}

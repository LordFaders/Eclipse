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

@WebServlet("/listarProducto")
public class ListarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Producto> productos;
		List<Categoria> categorias;
		Facade facade = new Facade();

		productos = facade.obtenerListaProductos();
		request.setAttribute("productos", productos);

		categorias = facade.obtenerListaCategorias();
		request.setAttribute("categorias", categorias);

		// mandamos el request a la pagina jsp
		request.getRequestDispatcher("ListarProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

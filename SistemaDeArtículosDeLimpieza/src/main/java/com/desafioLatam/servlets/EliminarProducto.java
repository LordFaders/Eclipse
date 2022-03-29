package com.desafioLatam.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafioLatam.facade.Facade;

@WebServlet("/eliminarProducto")
public class EliminarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Capturar ID
		// LLamar al facade eliminar pasandole el id
		Facade facade = new Facade();
		String id = request.getParameter("id_producto");
		int resultado = facade.eliminarProducto(Integer.parseInt(id));

		if (resultado == 1) {// se elimino

			request.getRequestDispatcher("/listarProducto").forward(request, response);
			request.setAttribute("msgOK", "El producto se ha eliminado correctamente.");
		} else {
			request.setAttribute("msgError", "Error al modificar los datos el producto.");
		}
		request.getRequestDispatcher("ListarProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

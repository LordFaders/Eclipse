package com.desafiolatamServlets2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.Models.Producto;

@WebServlet("/calculadora")
public class CalculadoraVentas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		String sesionLogin = (String) sesion.getAttribute("Nombre");

		if (sesionLogin != null) {
			ArrayList<Producto> listaProductos = new ArrayList<Producto>();

			Producto producto1 = new Producto("Valvulas de titanio", "Válvulas de carrera", 1200000, "valvula");
			Producto producto2 = new Producto("Turbo Full Carrera", "Turbo de competición multimarca", 1700000,
					"turbo");
			Producto producto3 = new Producto("Kit de Freno Competición",
					"Juego de discos, balatas, caliper de competición", 760000, "frenos");
			Producto producto4 = new Producto("Sistema de refrigeración", "Sistema de enfriamiento motor Carrera",
					2300000, "refrigeracion");
			Producto producto5 = new Producto("Plumillas Limpia parabrisas estándar", "Plumillas para la lluvia", 10000,
					"plumillas");

			listaProductos.add(producto1);
			listaProductos.add(producto2);
			listaProductos.add(producto3);
			listaProductos.add(producto4);
			listaProductos.add(producto5);

			request.setAttribute("listaProductos", listaProductos);
			request.getRequestDispatcher("calculadora.jsp").forward(request, response);
		} else {
			request.setAttribute("msgError", "No puede acceder a la página");
			request.getRequestDispatcher("/login").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}

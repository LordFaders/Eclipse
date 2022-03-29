package com.desafiolatamServlets2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.Models.Producto;

@WebServlet("/factura")
public class Factura extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// capturar valores desde formulario
		String nombre = request.getParameter("nombre");
		String empresa = request.getParameter("empresa");
		String rut = request.getParameter("rut");
		String direccion = request.getParameter("direccion");
		String ciudad = request.getParameter("ciudad");
		String pais = request.getParameter("pais");

		// capturar la cantidad ingresada de cada producto
		Integer item01 = Integer.parseInt(request.getParameter("valvula"));
		Integer item02 = Integer.parseInt(request.getParameter("turbo"));
		Integer item03 = Integer.parseInt(request.getParameter("frenos"));
		Integer item04 = Integer.parseInt(request.getParameter("refrigeracion"));
		Integer item05 = Integer.parseInt(request.getParameter("plumillas"));
		
		//capturar valor unitario de cada producto
		Integer vu01 = Integer.parseInt(request.getParameter("valvulaVU"));
		Integer vu02 = Integer.parseInt(request.getParameter("turboVU"));
		Integer vu03 = Integer.parseInt(request.getParameter("frenosVU"));
		Integer vu04 = Integer.parseInt(request.getParameter("refrigeracionVU"));
		Integer vu05 = Integer.parseInt(request.getParameter("plumillasVU"));

		// validar
		if (nombre.equals("") || empresa.equals("") || rut.equals("") || direccion.equals("") || ciudad.equals("")
				|| pais.equals("") || nombre == null || empresa == null || rut == null || direccion == null
				|| ciudad == null || pais == null) {
			String msgError = "Faltan datos de cliente";

			request.setAttribute("msgerror", msgError);
			request.getRequestDispatcher("/formularioIngreso").forward(request, response);
		} else {
			Integer valorNeto = 0;
			Double descuento = 0.0;
			Integer valorTotal = 0;
			Integer valvulaVT = 0;
			Integer turboVT = 0;
			Integer frenosVT = 0;
			Integer refrigeracionVT = 0;
			Integer plumillasVT = 0;
			ArrayList<Producto> listaProductos = new ArrayList<Producto>();
			
			if (item01 > 0) {
				valvulaVT = vu01 * item01;
				Producto producto1 = new Producto("Valvulas de titanio" , "Válvulas de carrera", 1200000, valvulaVT, item01);
				listaProductos.add(producto1);
			}
			if (item02 > 0) {
				turboVT = vu02 * item02;
				Producto producto2 = new Producto("Turbo Full Carrera" , "Turbo de competición multimarca", 1700000, turboVT, item02);
				listaProductos.add(producto2);
			}
			if (item03 > 0) {
				frenosVT = vu03 * item03;
				Producto producto3 = new Producto("Kit de Freno Competición" , "Juego de discos, balatas, caliper de competición", 760000, frenosVT, item03);
				listaProductos.add(producto3);
			}
			if (item04 > 0) {
				refrigeracionVT = vu04 * item04;
				Producto producto4 = new Producto("Sistema de refrigeración",	"Sistema de enfriamiento motor Carrera", 2300000, refrigeracionVT, item04);
				listaProductos.add(producto4);
			}
			if (item05 > 0) {
				plumillasVT = vu05 * item05;
				Producto producto5 = new Producto("Plumillas Limpia parabrisas estándar",	"Plumillas para la lluvia", 10000, plumillasVT, item05);
				listaProductos.add(producto5);
			}
			valorNeto = valvulaVT + turboVT + frenosVT + refrigeracionVT + plumillasVT;
			
			if(valorNeto > 0) {
				descuento = valorNeto * 0.1;
				valorTotal = (int) (valorNeto - descuento);
			}
			
			request.setAttribute("nombre", nombre);
			request.setAttribute("empresa", empresa);
			request.setAttribute("rut", rut);
			request.setAttribute("direccion", direccion);
			request.setAttribute("ciudad", ciudad);
			request.setAttribute("pais", pais);
			request.setAttribute("listaProductos", listaProductos);
			request.setAttribute("valorNeto", valorNeto);
			request.setAttribute("valorTotal", valorTotal);
			
			//ServletContext listaProductos = getServletContext();
			//ArrayList<Producto> listaProductos = listaProductos.getInitParameter(producto, descripcion, valorUnitario);
			request.getRequestDispatcher("factura.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

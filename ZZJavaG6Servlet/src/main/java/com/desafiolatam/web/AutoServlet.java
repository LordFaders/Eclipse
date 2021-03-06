package com.desafiolatam.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.desafiolatam.daos.AutoDAOImpl;
import com.desafiolatam.models.Auto;

@WebServlet("/auto")
public class AutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

AutoDAOImpl autoDAOImpl;
	
    public AutoServlet() {
        super();
        autoDAOImpl = new AutoDAOImpl();//instancia global para toda la clase
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion = request.getParameter("accion");//capturando desde el formulario

		switch (accion) {
		case "editar":
			editar(request, response);
			break;
		case "eliminar":
			eliminar(request, response);
			break;
			
		default:
			break;
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void editar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//capturando desde el formulario
		String id = request.getParameter("id");
		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		String color = request.getParameter("color");
		String velocidad = request.getParameter("velocidad");
		
		//instancia de Auto
		Auto auto = new Auto(Integer.parseInt(id), marca, modelo, color, Float.parseFloat(velocidad));
		
		//llamado al metodo en el DAO
		//AutoDAOImpl autoDAOImpl = new AutoDAOImpl();
		int resultado = autoDAOImpl.actualizarAuto(auto);
		
		
		if(resultado == 1) {//se elimino
			request.getRequestDispatcher("/homeUsuario").forward(request, response);
		}else {//no se eliminĂ³
			//QuĂ© haremos?
		}
	}
	
	protected void eliminar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		int resultado = autoDAOImpl.eliminarAuto(Integer.parseInt(id));

		if(resultado == 1) {//se elimino
			request.getRequestDispatcher("/homeUsuario").forward(request, response);
		}else {//no se eliminĂ³
			//QuĂ© haremos?
		}
	}
}

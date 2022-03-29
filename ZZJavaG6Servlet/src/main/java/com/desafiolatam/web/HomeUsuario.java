package com.desafiolatam.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.daos.AutoDAOImpl;
import com.desafiolatam.models.Auto;


@WebServlet("/homeUsuario")
public class HomeUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//obtener variables de session
		String sessionEmail = (String)session.getAttribute("emailUsuario");
		Integer sessionId = (Integer)session.getAttribute("idUsuario");
		if(sessionEmail != null) {
			//obtener lista de autos
			AutoDAOImpl autoDAOImpl = new AutoDAOImpl();
			//llamado al métode para obtener base de datos
			ArrayList<Auto> listaAutos = autoDAOImpl.obtenerListaAutos();
			//pasar la lista al jsp
			request.setAttribute("listaAutos", listaAutos);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else {
			request.setAttribute("msgError", "Solo para usuarios registrados");
			request.getRequestDispatcher("/login").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

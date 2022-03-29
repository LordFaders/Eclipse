package com.desafiolatam.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//capturando parámetros
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				String correo = request.getParameter("correo");
				String password = request.getParameter("password");
				String genero = request.getParameter("genero");
		
				//llamando a un jsp
		request.getRequestDispatcher("registro.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

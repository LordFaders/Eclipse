package com.desafioLatam.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/procesaLogin")
public class ProcesaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String admin = "admin";
		String contrasena = "admin";
		String login = request.getParameter("usuario");
		String password = request.getParameter("password");

		// Validar los parámetros
		if (login.equals("") || login == null || password.equals("") || password == null) {

			request.setAttribute("msgError", "Datos faltantes, por favor verifique");
			request.getRequestDispatcher("/login").forward(request, response);
		} else {
			if (admin.equals(login) && contrasena.equals(password)) {
				HttpSession sesion = request.getSession(true);
				sesion.setAttribute("Nombre", login);

				Cookie cookie = new Cookie("nombre", admin);
				// cookie.setValue(password);
				cookie.setMaxAge(9000);
				cookie.setComment("Cookie nombre de usuario");
				response.addCookie(cookie);

				request.getRequestDispatcher("Bienvenida.jsp").forward(request, response);
			} else {
				request.setAttribute("msgError", "Datos incorrectos, por favor verifique");
				request.getRequestDispatcher("/login").forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

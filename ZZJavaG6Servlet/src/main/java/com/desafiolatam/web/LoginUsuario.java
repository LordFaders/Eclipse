package com.desafiolatam.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.desafiolatam.daos.UsuarioDAOImpl;
import com.desafiolatam.models.Usuario;

@WebServlet("/loginUsuario")
public class LoginUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String correo = request.getParameter("correo");
		String password = request.getParameter("password");
		//Validar los parámetros
		if (correo.isEmpty() || correo == null || password.equals("") || password == null) {

			request.setAttribute("msgError", "Datos faltantes, por favor verifique");
			request.getRequestDispatcher("/login").forward(request, response);
		} else {
			UsuarioDAOImpl usuarioDAOImpl = new UsuarioDAOImpl();
			Usuario usuario = usuarioDAOImpl.obtenerUsuarioEmail(correo);
			
			if(usuario != null) {
				//System.out.println(password + " " + usuario.getPassword());
				//usuario existe
				//comparar las passwords
				if(password.equals(usuario.getPassword())) {
					//SESSION guardar
					HttpSession session = request.getSession();
					session.setAttribute("emailUsuario", usuario.getEmail());
					session.setAttribute("idUsuario", usuario.getId());
					
					//Crear cookie
					Cookie cookie = new Cookie("Correo", usuario.getEmail());
					cookie.setMaxAge(9000);
					cookie.setComment("Cookie guardada con propositos educativos");
					response.addCookie(cookie);
					//Recuperar datos cookie:
					System.out.println("valor " + cookie.getValue());
					System.out.println("tiempo de duración " + cookie.getMaxAge());
					System.out.println("comentario " + cookie.getComment());
					
					request.getRequestDispatcher("/homeUsuario").forward(request, response);
				}else {
					request.setAttribute("msgError", "Datos incorrectos");
					request.getRequestDispatcher("/login").forward(request, response);
				}
				
			}else {
				//con ese correo no existe el usuario
				request.setAttribute("msgError", "Usuario no existe");
				request.getRequestDispatcher("/login").forward(request, response);
			}	
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

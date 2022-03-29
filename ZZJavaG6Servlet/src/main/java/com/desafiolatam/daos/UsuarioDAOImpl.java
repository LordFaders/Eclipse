package com.desafiolatam.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.desafiolatam.basedatos.BaseDatos;
import com.desafiolatam.models.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	BaseDatos conexionBD = new BaseDatos();// mysql
	Connection conexion = null;
	Statement stmt = null;
	ResultSet resultado = null;

	@Override
	public int crearUsuario(Usuario usuario) {
		int resultado = 0;
		String query = "INSERT INTO usuarios(nombre, apellido, correo, password, genero) " + "values ('"
				+ usuario.getNombre() + "','" + usuario.getApellido() + "','" + usuario.getEmail() + "','"
				+ usuario.getPassword() + "','" + usuario.getGenero() + "')";

		System.out.println("query: " + query);

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeUpdate(query); //int -> 1, 0 o true or false
			
			if(resultado == 1) {
				System.out.println("El registro se ha insertado correctamente");
			}else {
				System.out.println("Error al insertar los datos");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resultado;
	}

	@Override
	public Usuario obtenerUsuario(Integer id) {

		Usuario usuario = null;
		String query = "SELECT * FROM USUARIOS WHERE ID = " + id;

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeQuery(query);

			while (resultado.next()) {
				// recorrer para capturar los datos
				Integer usuarioId = resultado.getInt(1);// resultado.getInt("id");
				String nombre = resultado.getString(2);// resultado.getInt("nombre");
				String apellido = resultado.getString(3);
				String email = resultado.getString(4);
				String password = resultado.getString(5);
				int genero = resultado.getInt(6);

				// llenar el objeto
				usuario = new Usuario(usuarioId, nombre, apellido, email, password, genero);
			}

		} catch (Exception e) {

		}

		return usuario;
	}

	@Override
	public int actualizarUsuario(Usuario usuario) {
		int resultado = 0;
		String query = "UPDATE AUTOS SET nombre= '" + usuario.getNombre() + "', apellido= '" + usuario.getApellido() + "', email= '"
				+ usuario.getEmail() + "', " + "password= '" + usuario.getPassword() + "'," + "genero= '" + usuario.getGenero() + "' WHERE ID= " + usuario.getId();
		System.out.println("query actualizar: " + query);
		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeUpdate(query); // int -> 1, 0 o true or false

			if (resultado == 1) {
				System.out.println("El registro se ha actualizado correctamente");
			} else {
				System.out.println("Error al actualizar los datos");
			}

		} catch (Exception e) {
			
		}
		return resultado;

	}

	@Override
	public int eliminarUsuario(Integer id) {
		int resultado = 0;
		String query = "DELETE FROM USUARIOS WHERE ID = " + id;

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeUpdate(query); // int -> 1, 0 o true or false

			if (resultado == 1) {
				System.out.println("El registro se ha eliminado correctamente");
			} else {
				System.out.println("Error al eliminar los datos");
			}

		} catch (Exception e) {
			
		}
		return resultado;

	}

	@Override
	public ArrayList<Usuario> obtenerListaUsuarios() {
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		String query = "SELECT * FROM USUARIOS";

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeQuery(query);
			
			while (resultado.next()) {
				// recorrer para capturar los datos
				Integer usuarioId = resultado.getInt(1);// resultado.getInt("id");
				String nombre = resultado.getString(2);// resultado.getInt("nombre");
				String apellido = resultado.getString(3);
				String email = resultado.getString(4);
				String password = resultado.getString(5);
				int genero = resultado.getInt(6);

				// llenar el objeto
				Usuario usuario = new Usuario(usuarioId, nombre, apellido, email, password, genero);
				listaUsuarios.add(usuario);//llenando la lista
			}

		} catch (Exception e) {

		}

		return listaUsuarios;
	}

	@Override
	public Usuario obtenerUsuarioEmail(String email) {

		Usuario usuario = null;
		String query = "SELECT * FROM USUARIOS WHERE CORREO = '" + email + "'";

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeQuery(query);

			while (resultado.next()) {
				// recorrer para capturar los datos
				Integer usuarioId = resultado.getInt(1);// resultado.getInt("id");
				String nombre = resultado.getString(2);// resultado.getInt("nombre");
				String apellido = resultado.getString(3);
				String password = resultado.getString(4);
				email = resultado.getString(5);
				int genero = resultado.getInt(6);

				// llenar el objeto
				usuario = new Usuario(usuarioId, nombre, apellido, email, password, genero);
			}

		} catch (Exception e) {

		}

		return usuario;
	}

}

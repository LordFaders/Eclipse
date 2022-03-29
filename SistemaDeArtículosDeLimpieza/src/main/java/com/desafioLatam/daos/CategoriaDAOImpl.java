package com.desafioLatam.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.desafioLatam.conexion.BaseDatos;
import com.desafioLatam.modeloDTO.Categoria;

public class CategoriaDAOImpl implements CategoriaDAO {

	BaseDatos conexionBD = new BaseDatos();// mysql
	Connection conexion = null;
	Statement stmt = null;
	ResultSet resultado = null;

	@Override
	public ArrayList<Categoria> obtenerListaCategorias() {
		ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
		String query = "SELECT * FROM CATEGORIA";

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeQuery(query);

			while (resultado.next()) {
				// recorrer para capturar los datos
				int id_categoria = resultado.getInt(1);// resultado.getInt("id");
				String nombre_categoria = resultado.getString(2);// resultado.getInt("categoria");

				// llenar el objeto nuevo por cada registro
				Categoria categoria = new Categoria(id_categoria, nombre_categoria);

				listaCategorias.add(categoria);// llenando la lista
			}

		} catch (Exception e) {

		}
		return listaCategorias;
	}

}

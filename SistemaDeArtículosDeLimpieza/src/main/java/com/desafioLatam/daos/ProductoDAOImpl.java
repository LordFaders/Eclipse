package com.desafioLatam.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.desafioLatam.conexion.BaseDatos;
import com.desafioLatam.modeloDTO.Categoria;
import com.desafioLatam.modeloDTO.Producto;

public class ProductoDAOImpl implements ProductoDAO {

	BaseDatos conexionBD = new BaseDatos();// mysql
	Connection conexion = null;
	Statement stmt = null;
	ResultSet resultado = null;

	@Override
	public int agregarProducto(Producto producto) {

		int resultado = 0;
		String query = "INSERT INTO producto(nombre_producto, precio_producto, descripcion_producto, id_categoria) "
				+ "values ('" + producto.getNombre_producto() + "','" + producto.getPrecio_producto() + "','"
				+ producto.getDescripcion_producto() + "','" + producto.getCategoria().getId_categoria() + "')";

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeUpdate(query); // int -> 1, 0 o true or false

			if (resultado == 1) {
				System.out.println("El producto se ha insertado correctamente");
			} else {
				System.out.println("Error al insertar los datos");
			}

		} catch (Exception e) {

		}
		return resultado;
	}

	@Override
	public Producto mostrarProducto(int id_producto) {

		Producto producto = null;
		String query = "SELECT * FROM producto WHERE id_producto = " + id_producto;

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeQuery(query);

			while (resultado.next()) {
				// recorrer para capturar los datos
				int productoId = resultado.getInt(1);// resultado.getInt("id");
				String nombre = resultado.getString(2);// resultado.getInt("nombre");
				int precio = resultado.getInt(3);
				String descripcion = resultado.getString(4);
				int categoriaId = resultado.getInt(5);

				Categoria categoria = new Categoria();
				categoria.setId_categoria(categoriaId);
				// llenar el objeto
				producto = new Producto(productoId, nombre, precio, descripcion, categoria);
			}

		} catch (Exception e) {

		}
		return producto;
	}

	@Override
	public int editarProducto(Producto producto) {

		int resultado = 0;
		String query = "UPDATE PRODUCTO SET nombre_producto = '" + producto.getNombre_producto()
				+ "', precio_producto = '" + producto.getPrecio_producto() + "', descripcion_producto = '"
				+ producto.getDescripcion_producto() + "', " + "id_categoria= '"
				+ producto.getCategoria().getId_categoria() + "' WHERE id_producto= " + producto.getId_producto();

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeUpdate(query); // int -> 1, 0 o true or false

			if (resultado == 1) {
				System.out.println("El producto se ha actualizado correctamente");
			} else {
				System.out.println("Error al actualizar los datos del producto");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return resultado;
	}

	@Override
	public int eliminarProducto(int id_producto) {

		int resultado = 0;
		String query = "DELETE FROM PRODUCTO WHERE id_producto = " + id_producto;

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
	public ArrayList<Producto> obtenerListaProductos() {

		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		String query = "select producto.id_producto, producto.nombre_producto , producto.precio_producto , producto.descripcion_producto , categoria.id_categoria, categoria.nombre_categoria  "
				+ "from producto " + "inner join categoria on producto.id_categoria = categoria.id_categoria";

		try {
			conexion = conexionBD.datos();
			stmt = conexion.createStatement();
			resultado = stmt.executeQuery(query);

			while (resultado.next()) {

				// recorrer para capturar los datos
				int productoId = resultado.getInt(1);// resultado.getInt("id");
				String nombre = resultado.getString(2);// resultado.getInt("nombre");
				int precio = resultado.getInt(3);
				String descripcion = resultado.getString(4);
				int categoriaId = resultado.getInt(5);
				String nombreCategoria = resultado.getString(6);

				Categoria categoria = new Categoria(categoriaId, nombreCategoria);
				// llenar el objeto nuevo por cada registro
				Producto producto = new Producto(productoId, nombre, precio, descripcion, categoria);

				listaProductos.add(producto);// llenando la lista
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return listaProductos;
	}

}

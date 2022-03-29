package com.desafioLatam.facade;

import java.util.ArrayList;

import com.desafioLatam.daos.CategoriaDAOImpl;
import com.desafioLatam.daos.ProductoDAOImpl;
import com.desafioLatam.modeloDTO.Categoria;
import com.desafioLatam.modeloDTO.Producto;

public class Facade {

	public int AgregarProductoDAO(Producto producto) {
		ProductoDAOImpl dao = new ProductoDAOImpl();
		int agregar = dao.agregarProducto(producto);
		return agregar;
	}

	public Producto mostrarProducto(int id_producto) {
		ProductoDAOImpl dao = new ProductoDAOImpl();
		Producto mostrar = dao.mostrarProducto(id_producto);
		return mostrar;
	}

	public int editarProducto(Producto producto) {
		ProductoDAOImpl dao = new ProductoDAOImpl();
		int editar = dao.editarProducto(producto);
		return editar;
	}

	public int eliminarProducto(int id_producto) {
		ProductoDAOImpl dao = new ProductoDAOImpl();
		int eliminar = dao.eliminarProducto(id_producto);
		return eliminar;
	}

	public ArrayList<Producto> obtenerListaProductos() {
		ProductoDAOImpl dao = new ProductoDAOImpl();
		ArrayList<Producto> productos = dao.obtenerListaProductos();
		System.out.println("FACADE" + productos);
		return productos;
	}

	public ArrayList<Categoria> obtenerListaCategorias() {
		CategoriaDAOImpl dao = new CategoriaDAOImpl();
		ArrayList<Categoria> categorias = dao.obtenerListaCategorias();
		return categorias;
	}
}

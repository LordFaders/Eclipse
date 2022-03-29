package com.desafioLatam.daos;

import java.util.ArrayList;

import com.desafioLatam.modeloDTO.Producto;

public interface ProductoDAO {

	public int agregarProducto(Producto producto);

	public Producto mostrarProducto(int id_producto);

	public int editarProducto(Producto producto);

	public int eliminarProducto(int id_producto);

	public ArrayList<Producto> obtenerListaProductos();
}

package com.indianajeans.models;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

	private ArrayList<Producto> listaProductos;

	public ProductoServicio() {
		super();
		this.listaProductos = new ArrayList<Producto>();
	}

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "ProductoServicio [listaProductos=" + listaProductos + "]";
	}

	public void listarProductos() {

		for (Producto producto : listaProductos) {
			System.out.println("Datos del Producto:");
			System.out.println("Nombre articulo: " + producto.getArticulo());
			System.out.println("Código: " + producto.getCodigo());
			System.out.println("Marca: " + producto.getMarca());
			System.out.println("Color: " + producto.getColor());
			System.out.println("Descripción: " + producto.getDescripcion());
			System.out.println("Precio: " + producto.getPrecio());
			System.out.println("Talla: " + producto.getTalla()); 
			System.out.println("El producto ingresado es: " + producto);
			System.out.println();
			
		}
	}

	public void agregarProductos(Scanner sc) {

		System.out.println("Crear Producto");
		System.out.println("Ingresar nombre articulo:");
		String articulo = sc.nextLine();
		System.out.println("Ingresa precio:");
		String precio = sc.nextLine();
		System.out.println("Ingresa descripción:");
		String descripcion = sc.nextLine();
		System.out.println("Ingresa código:");
		String codigo = sc.nextLine();
		System.out.println("Ingresa talla:");
		String talla = sc.nextLine();
		System.out.println("Ingresa marca:");
		String marca = sc.nextLine();
		System.out.println("Ingresa color:");
		String color = sc.nextLine();

		Producto producto = new Producto();
		producto.setArticulo(articulo);
		producto.setCodigo(codigo);
		producto.setColor(color);
		producto.setDescripcion(descripcion);
		producto.setMarca(marca);
		producto.setPrecio(precio);
		producto.setTalla(talla);

		listaProductos.add(producto);
		System.out.println();
		
		
	}
}

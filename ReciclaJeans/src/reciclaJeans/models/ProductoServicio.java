package reciclaJeans.models;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

	private ArrayList<Producto> listaProductos;

	public ProductoServicio() {
		super();
		listaProductos = new ArrayList<Producto>();
	}

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = new ArrayList<Producto>();
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
			System.out.println("*** Datos del producto ***");
			System.out.println("Artículo: " + producto.getArticulo());
			System.out.println("Precio: " + producto.getPrecio());
			System.out.println("Descripción: " + producto.getDescripcion());
			System.out.println("Código: " + producto.getCodigo());
			System.out.println("Talla: " + producto.getTalla());
			System.out.println("Marca: " + producto.getMarca());
			System.out.println("Color: " + producto.getColor());
			System.out.println("---------------------------------------");

		}

	}

	public void editarDatos(Scanner sc) {

		System.out.println("Eligió editar datos");
		System.out.println();
		System.out.println("Digite 1 para comenzar la edición");
		System.out.println();
		System.out.println("Digite cualquier otro número para salir");
		System.out.println();
		int opcionEditar = sc.nextInt();
		sc.nextLine();

		if (opcionEditar == 1) {
			System.out.println("Ingrese el código del producto:");
			String codigo = sc.nextLine();

			System.out.println(getListaProductos());
			System.out.println(codigo);

			for (Producto productoAEditar : listaProductos) {
				if (productoAEditar.getCodigo().equals(codigo)) {
					System.out.println();

					System.out.println("1 Artículo: " + productoAEditar.getArticulo());
					System.out.println("2 Precio: " + productoAEditar.getPrecio());
					System.out.println("3 Descripción: " + productoAEditar.getDescripcion());
					System.out.println("4 Código: " + productoAEditar.getCodigo());
					System.out.println("5 Talla: " + productoAEditar.getTalla());
					System.out.println("6 Marca: " + productoAEditar.getMarca());
					System.out.println("7 Color: " + productoAEditar.getColor());

					System.out.println("Ingresa el número de la opción a editar:");
					int opcion = sc.nextInt();
					sc.nextLine();

					switch (opcion) {
					case 1:
						System.out.println("Ingrese el nuevo artículo");
						productoAEditar.setArticulo(sc.nextLine());
						break;
					case 2:
						System.out.println("Ingrese el nuevo precio");
						productoAEditar.setPrecio(sc.nextLine());
						break;
					case 3:
						System.out.println("Ingrese la nueva descripción");
						productoAEditar.setDescripcion(sc.nextLine());
						break;
					case 4:
						System.out.println("Ingrese el nuevo código");
						productoAEditar.setCodigo(sc.nextLine());
						break;
					case 5:
						System.out.println("Ingrese la nueva talla");
						productoAEditar.setTalla(sc.nextLine());
						break;
					case 6:
						System.out.println("Ingrese la nueva marca");
						productoAEditar.setMarca(sc.nextLine());
						break;
					case 7:
						System.out.println("Ingrese el nuevo color");
						productoAEditar.setColor(sc.nextLine());
						break;
					}

				}

			}
		}
	}
}

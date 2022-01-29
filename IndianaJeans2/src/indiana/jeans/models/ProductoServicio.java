package indiana.jeans.models;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {
	
	Scanner sc = new Scanner(System.in);

	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

	public ProductoServicio() {
		super();
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
		for (Producto productoListado : listaProductos) {
			System.out.println("Datos del producto: ");
			System.out.println("Nombre del articulo: " +productoListado.getArticulo());
			System.out.println("Codigo del articulo: " +productoListado.getCodigo());
			System.out.println("Marca del articulo: " +productoListado.getMarca());
			System.out.println("Color del articulo: " +productoListado.getColor());
			System.out.println("Descripcion del articulo: " +productoListado.getDescripcion());
			System.out.println("Precio  del articulo: " +productoListado.getPrecio());
			System.out.println("Talla del articulo: " +productoListado.getTalla());
			
			
		}
		
	}

	public void agregarProductos() {
		Producto productoIngresado = new Producto();
		
		System.out.println("Crear Producto");
		System.out.println("Ingresar nombre del articulo");
		productoIngresado.setArticulo(sc.nextLine());
		System.out.println("Ingresa precio del producto");
		productoIngresado.setPrecio(sc.nextLine());
		System.out.println("Ingresa descripcion del producto");
		productoIngresado.setDescripcion(sc.nextLine());
		System.out.println("Ingresa codigo del producto");
		productoIngresado.setCodigo(sc.nextLine());
		System.out.println("Ingresa talla del producto");
		productoIngresado.setTalla(sc.nextLine());
		System.out.println("Ingresa marca del producto");
		productoIngresado.setMarca(sc.nextLine());
		System.out.println("Ingresa color del producto");
		productoIngresado.setColor(sc.nextLine());
		
		
		listaProductos.add(productoIngresado);
		
		System.out.println("Sus productos fueron " +listaProductos);
		
		sc.nextLine();
		

	}

}

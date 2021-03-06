package reciclaJeans.general;

import java.util.Scanner;
import reciclaJeans.models.ProductoServicio;

public class Menu {

	public void menu1() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		ArchivoServicio archivoServicio = new ArchivoServicio();
		ProductoServicio productoServicio = new ProductoServicio();
		Utilidad utilidad = new Utilidad();
		
		System.out.println("Bienvenido al sistema de clientes");

		do {
			System.out.println("1 Listar Producto");
			System.out.println("2 Editar Datos");
			System.out.println("3 Importar Datos");
			System.out.println("4 Salir");
			System.out.println("Ingrese una opción:");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				productoServicio.listarProductos();
				utilidad.sleep();
				utilidad.limpieza();
				break;
			case 2:
				productoServicio.editarDatos(sc);
				// eliminé la utilidad en este caso para darle tiempo al usuario
				break;
			case 3:
				productoServicio.setListaProductos(archivoServicio.cargarDatos());
				utilidad.sleep();
				utilidad.limpieza();
				break;
			case 4:
				utilidad.sleep();
				System.out.println("Abandonando el sistema de clientes");
				utilidad.sleep();
				utilidad.limpieza();
				System.out.println("Acaba de salir del sistema");
				break;

			}

		} while (opcion >= 1 && opcion <= 3);
	}
}

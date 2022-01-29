package indiana.jeans;

import java.util.ArrayList;
import java.util.Scanner;

import indiana.jeans.models.ExportarTxt;
import indiana.jeans.models.Menu;
import indiana.jeans.models.Producto;
import indiana.jeans.models.ProductoServicio;
import indiana.jeans.models.Utilidad;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Menu menu = new Menu();
		Producto producto = new Producto();
		ExportarTxt exportador = new ExportarTxt();
		// Utilidad utilidad = new Utilidad();
		ProductoServicio productoServicio = new ProductoServicio();

		int opcion = 0;
		do {
			menu.menu1();
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				productoServicio.listarProductos();
				Utilidad.sleep2();
				Utilidad.limpiaPantalla();
				break;
			case 2:
				productoServicio.agregarProductos();

				break;
			case 3:
				exportador.exportar(productoServicio.getListaProductos());

				break;
			case 4:
				System.out.println("Abandonando el sistema de productos... \n Acaba de salir del sistema");
				break;

			default:
				break;
			}
		} while (opcion >= 1 && opcion <= 3);


	}

}

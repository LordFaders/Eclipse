package com.indianajeans.general;

import java.util.Scanner;
import com.indianajeans.models.ProductoServicio;

public class Menu {

	public void menu1() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		ProductoServicio productoServicio = new ProductoServicio();
		ExportarTxt exportador = new ExportarTxt();
		Utilidad utilidad = new Utilidad();
		do {
			System.out.println("1 Listar Producto");
			System.out.println("2 Agregar Producto");
			System.out.println("3 Exportar Datos");
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
				productoServicio.agregarProductos(sc);
				utilidad.sleep();
				utilidad.limpieza();
				break;
			case 3:
				exportador.exportar(productoServicio.getListaProductos());
				utilidad.sleep();
				utilidad.limpieza();
				break;
			case 4:
				utilidad.sleep();
				System.out.println("Saliendo del sistema de productos");
				utilidad.sleep();
				utilidad.limpieza();
				break;

			}

		} while (opcion >= 1 && opcion <= 3);
	}
}

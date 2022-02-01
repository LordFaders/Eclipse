package vista;

import java.util.Scanner;

import utilidad.Utilidad;

public abstract class MenuTemplate {

	protected Scanner scanner = new Scanner(System.in);

	public abstract void listarCliente();

	public abstract void agregarCliente();

	public abstract void editarCliente();

	public abstract void cargarDatos();

	public abstract void exportarDatos();

	public abstract void terminarPrograma();

	public final void iniciarMenu() {

		System.out.println("1. Listar Clientes\n" + "2. Agregar Cliente\n" + "3. Editar Cliente\n" + "4. Cargar Datos\n"
				+ "5. Exportar Datos\n" + "6. Salir\n");

		System.out.println("Ingrese una opción");
		String opcion = scanner.nextLine();

		switch (opcion) {
		case "1":
			listarCliente();
			break;
		case "2":
			agregarCliente();
			break;
		case "3":
			editarCliente();
			break;
		case "4":
			cargarDatos();
			break;
		case "5":
			exportarDatos();
			break;
		case "6":
			terminarPrograma();
			break;
		default:
			System.out.println("La opción ingresada no es válida.");

		}
		Utilidad.limpiarPantalla();
		iniciarMenu();

	}

}

package vista;

import modelo.Cliente;
import servicio.ArchivoServicio;
import servicio.ArchivoServicioImp;
import servicio.ClienteServicio;
import servicio.ClienteServicioImp;
import utilidad.Utilidad;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import modelo.CategoriaCliente;
import modelo.CategoriaEnum;

public class Menu extends MenuTemplate {

	private Utilidad utilidad;
	private ClienteServicio clienteServicio = new ClienteServicioImp();
	private ArchivoServicio archivoServicio = new ArchivoServicioImp();
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	@Override
	public void agregarCliente() {
		System.out.println("Ingrese el RUT del cliente");
		String rut = scanner.nextLine();
		System.out.println("Ingrese el nombre del cliente");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el apellido del cliente");
		String apellido = scanner.nextLine();
		System.out.println("Ingrese años como cliente");
		String anios = scanner.nextLine();

		Cliente cliente = new Cliente(rut, nombre, apellido, anios, CategoriaEnum.ACTIVO);

		clienteServicio.agregarCliente(cliente);
	}

	@Override
	public void listarCliente() {
		
		
		for (Cliente clientex : listaClientes) {
			System.out.println("------------Datos del Cliente------------");
			System.out.println();
			System.out.println("Nombre: " + cliente.
		}		
	};

	@Override
	public void editarCliente() {
		System.out.println("--------------Editar Cliente--------------");
		System.out.println("seleccione que desea hacer:");
		System.out.println("1.-Cambiar estado del cliente\n" + "2.-Editar los datos ingresados del cliente");
		System.out.println();
		System.out.println("Ingrese opción:");
		System.out.println("------------------------------------------");
		String opcion = scanner.nextLine();

		switch (opcion) {
		case "1":
			System.out.println("Ingrese RUT del cliente a editar:");
			String rut = scanner.nextLine();
			clienteServicio.cambiarEstadoCliente(rut);
			break;
		case "2":
			System.out.println("Ingrese RUT del cliente a editar:");
			String rut2 = scanner.nextLine();

		}

	}

	@Override
	public void cargarDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la ruta del archivo que desea importar:");
		System.out.println("Ejemplo: /Users/jaime/Desktop/clientes.csv");
		String ruta = sc.nextLine();

		clienteServicio.setListaClientes();

		System.out.println("Datos cargados correctamente");

	}

	@Override
	public void exportarDatos() {

		System.out.println("------------Exportar Datos------------");
		System.out.println("Seleccione el formato a exportar:");
		System.out.println("1. -Formato csv");
		System.out.println("2. -Formato txt");
		System.out.println();
		System.out.println("Ingrese una opción");
		String opcion = scanner.nextLine();

		switch (opcion) {
		case "1":
			System.out.println("Ingrese la ruta para exportar los datos:");
			System.out.println("Ejemplo: /Users/Usuario/Desktop/");
			String ruta = scanner.nextLine();
			archivoServicio.exportarDatosCsv(clienteServicio.listarCliente(), ruta);
			System.out.println("Datos de clientes exportados correctamente en formato csv.");
			break;
		case "2":
			System.out.println("Ingrese la ruta para exportar los datos:");
			System.out.println("Ejemplo: /Users/Usuario/Desktop/");
			String ruta2 = scanner.nextLine();
			archivoServicio.exportarDatosTxt(clienteServicio.listarCliente(), ruta2);
			System.out.println("Datos de clientes exportados correctamente en formato txt.");
			break;
		default:
			System.out.println("La opción ingresada no es válida.");
		}

	}

	@Override
	public void terminarPrograma() {
		// TODO Auto-generated method stub

	}

}

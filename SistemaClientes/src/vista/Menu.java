package vista;

import modelo.Cliente;
import servicio.ArchivoServicio;
import servicio.ArchivoServicioImp;
import servicio.ClienteServicio;
import servicio.ClienteServicioImp;
import utilidad.Utilidad;
import modelo.CategoriaCliente;
import modelo.CategoriaEnum;

public class Menu extends MenuTemplate {

	private Utilidad utilidad;
	private ClienteServicio clienteServicio = new ClienteServicioImp();
	private ArchivoServicio archivoServicio = new ArchivoServicioImp();
	// private ArchivoServicio archivoServicio;

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

		Cliente cliente = new Cliente(rut, nombre, apellido, anios, null);

		clienteServicio.agregarCliente(cliente);
	}

	@Override
	public void listarCliente() {
		clienteServicio.listarCliente().entrySet().forEach(entry -> {
			Cliente cliente = entry.getValue();
			System.out.println("------------Datos del Cliente------------");
			System.out.println();
			System.out.println("RUT: " + cliente.getRutCliente());
			System.out.println("Nombre: " + cliente.getNombreCliente());
			System.out.println("Apellido: " + cliente.getApellidoCliente());
			System.out.println("Años como cliente: " + cliente.getAniosCliente() + " años");
			System.out.println("Categoría del cliente: " + CategoriaEnum.ACTIVO);
			System.out.println();
			System.out.println("-----------------------------------------");

		});
	}

	@Override
	public void editarCliente() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cargarDatos() {
		// TODO Auto-generated method stub

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

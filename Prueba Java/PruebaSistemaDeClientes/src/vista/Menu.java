package vista;

import java.util.List;

import modelo.CategoriaEnum;
import modelo.Cliente;
import servicio.ClienteServicio;

public class Menu extends MenuTemplate {

	@Override
	public void listarCliente() {
	}

	@Override
	public void agregarCliente( ) {
		Cliente agregarCliente = new Cliente();
		System.out.println("Ingrese el RUT del cliente");
		String rut = scanner.nextLine();
		System.out.println("Ingrese el nombre del cliente");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el apellido del cliente");
		String apellido = scanner.nextLine();
		System.out.println("Ingrese años como cliente");
		String anios = scanner.nextLine();

		Cliente cliente = new Cliente(rut, nombre, apellido, anios, CategoriaEnum.ACTIVO);

	clienteServicio.
	}

	@Override
	public void editarCliente() {
	}

	@Override
	public void cargarDatos() {
	}

	@Override
	public void exportarDatos() {
	}

	@Override
	public void terminarPrograma() {

	}

}

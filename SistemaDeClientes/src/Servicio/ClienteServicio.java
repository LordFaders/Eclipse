package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.CategoriaEnum;
import modelo.Cliente;

public class ClienteServicio {

	private List<Cliente> listaClientes = new ArrayList<Cliente>();

	public ClienteServicio() {
		super();
	}

	public ClienteServicio(List<Cliente> listaClientes) {
		super();
		this.listaClientes = new ArrayList<Cliente>(listaClientes);
	}

	public void retornoListarClientes() {

		for (Cliente clienteTemporal : listaClientes) {

			System.out.println("------------  Datos del Cliente  ------------");
			System.out.println();

			System.out.println("RUT: " + clienteTemporal.getRutCliente());
			System.out.println("Nombre: " + clienteTemporal.getNombreCliente());
			System.out.println("Apellido: " + clienteTemporal.getApellidoCliente());
			System.out.println("Años como Cliente: " + clienteTemporal.getAniosCliente());
			System.out.println("Categoría: " + clienteTemporal.getCategoria());
			System.out.println();
			System.out.println("--------------------------------------------");
		}
	}

	public List<Cliente> agregarCliente(String rutCliente, String nombreCliente, String apellidoCliente,
			String aniosCliente, CategoriaEnum nombreCategoria) {

		Cliente clienteIngresado = new Cliente(rutCliente, nombreCliente, apellidoCliente, aniosCliente,
				CategoriaEnum.ACTIVO);

		if (clienteIngresado != null) {
			listaClientes.add(clienteIngresado);
		}
		System.out.println("Lista de clientes " + listaClientes);
		System.out.println();

		return listaClientes;

	}

	public void editarCliente(String runCliente, String nombreCliente, String apellidoCliente, String aniosCliente,
			CategoriaEnum Categoria) {

	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
}

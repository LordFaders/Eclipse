package servicio;

import java.util.HashMap;
import java.util.Map;

import modelo.CategoriaCliente;
import modelo.CategoriaEnum;
import modelo.Cliente;

public class ClienteServicioImp implements ClienteServicio {

	private Map<String, Cliente> listaClientes = new HashMap<>();

	@Override
	public void agregarCliente(Cliente cliente) {
		if (cliente != null) {
			listaClientes.put(cliente.getRutCliente(), cliente);
		}
	}

	@Override
	public void categoriaCliente(String rutCliente, CategoriaEnum categoriaEnum) {

		if (rutCliente != null) {
			categoriaCliente(rutCliente, CategoriaEnum.ACTIVO);
		} else {
			categoriaCliente(rutCliente, CategoriaEnum.INACTIVO);
		}

	}

	@Override
	public Map<String, Cliente> listarCliente() {
		return listaClientes;
	}

	@Override
	public void editarCliente() {
		// TODO Auto-generated method stub

	}

}

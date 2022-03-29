package servicio;

import java.util.List;

import modelo.Cliente;

public class ClienteServicioImp implements ClienteServicio {
	
	List<Cliente> listaClientes = new ArrayList<>

	@Override
	public void listarCliente(String ruta, List<Cliente> listaClientes) {
	}

	@Override
	public List<Cliente> agregarCliente(String rutCliente, String nombreCliente, String apellidoCliente, String aniosCliente, CategoriaEnum.ACTIVO){
		
	Cliente clienteNuevo = new Cliente(String rutCliente, String nombreCliente, String apellidoCliente, String aniosCliente, CategoriaEnum.ACTIVO); 
		if (cliente != null) {
			listaClientes.add(cliente);
		}

	}

	@Override
	public void editarCliente(String ruta, List<Cliente> listaClientes) {
	}

	@Override
	public void agregarCliente(String ruta, List<Cliente> listaClientes) {
		// TODO Auto-generated method stub
		
	}

}

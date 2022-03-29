package servicio;

import java.util.List;

import modelo.Cliente;

public interface ClienteServicio {

	void listarCliente(String ruta, List<Cliente> listaClientes);

	void agregarCliente(String ruta, List<Cliente> listaClientes);

	void editarCliente(String ruta, List<Cliente> listaClientes);

	

}

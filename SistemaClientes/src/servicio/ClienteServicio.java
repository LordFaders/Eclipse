package servicio;

import java.util.Map;

import modelo.CategoriaEnum;
import modelo.Cliente;

public interface ClienteServicio {

	public void agregarCliente(Cliente cliente);

	public Map<String, Cliente> listarCliente();

	public void editarCliente();  

	public void categoriaCliente(String rutCliente, CategoriaEnum categoriaEnum);

}

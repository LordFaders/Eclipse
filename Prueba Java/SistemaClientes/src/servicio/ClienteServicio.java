package servicio;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import modelo.CategoriaEnum;
import modelo.Cliente;

public interface ClienteServicio {

	void agregarCliente(Cliente cliente);

	ArrayList<Cliente> listarCliente();

	void categoriaCliente(String rutCliente, CategoriaEnum categoriaEnum);

	void setListaClientes();

	void cambiarEstadoCliente(String rut);

	void editarCliente(Cliente cliente);

	void cambiarEstadoCliente(Cliente cliente);

	

}

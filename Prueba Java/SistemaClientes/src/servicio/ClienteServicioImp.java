package servicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import modelo.CategoriaCliente;
import modelo.CategoriaEnum;
import modelo.Cliente;

public class ClienteServicioImp implements ClienteServicio {

	protected Scanner scanner = new Scanner(System.in);

	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	
	public ClienteServicioImp() {
		// TODO Auto-generated constructor stub
	}
	

	public ClienteServicioImp(Scanner scanner, ArrayList<Cliente> listaClientes) {
		super();
		this.scanner = scanner;
		this.listaClientes = listaClientes;
	}


	@Override

	public void agregarCliente(Cliente cliente) {
		if (cliente != null) {
			listaClientes.add(cliente);
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
	public ArrayList<Cliente> listarCliente() {
		return listaClientes;
	}

	@Override
	public void cambiarEstadoCliente(Cliente categoriaCliente) {

		//Map<String, Cliente> cambiarEstadoCliente = new HashMap<String, Cliente>();

		//Iterator clienteAEditar = listaClientes.keySet().iterator();
	//	while (clienteAEditar.hasNext()) {
			
			
		}
		System.out.println("-----Actualizando estado del CLiente-----");
		System.out.println("El estado actual es: " + CategoriaEnum.ACTIVO);
		System.out
				.println("1.-Cambiar el estado del Cliente a Inactivo\n" + "2.-Mantener el estado del Cliente Activo");
		System.out.println();
		System.out.println("Ingrese Opción");
		System.out.println("-----------------------------------------");
		String op = scanner.nextLine();

		switch (op) {
		case "1":
			
			System.out.println("Se ha cambiado el estado del Cliente a Inactivo.");
			break;
		case "2":
			System.out.println("El Cliente permanece Activo.");
			break;
		default:
			System.out.println("La opción ingresada no es válida.");

		}
		
		System.out.println("El RUT ingresado no existe en el sistema.");
		}
		

	@Override
	public void editarCliente(Cliente cliente) {

		}
	}
	}



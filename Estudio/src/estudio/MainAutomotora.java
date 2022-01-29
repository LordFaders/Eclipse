package estudio;

import java.util.ArrayList;

import Automotora.Models.Bus;
import Automotora.Models.Cliente;
import Automotora.Models.Taxi;
import Automotora.Models.Tienda;
import Automotora.Models.Vendedor;

public class MainAutomotora {

	public static void main(String[] args) {
		Taxi  taxi = new Taxi(600);
		int vuelto = taxi.pagarPasaje(5000);
		
		System.out.println("Su vuelto es: " + vuelto);
		
		
		System.out.println("********");
		
		Tienda tienda = new Tienda ();
		tienda.setStock(200);
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Jaime");
		cliente.setEdad(47);
		cliente.imprimeCliente();
		
		ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();
		Vendedor vendedor = new Vendedor("Gabriela Neruda 987");
		Vendedor vendedor2 = new Vendedor("Pablo Mistral 234");
		Vendedor vendedor3 = new Vendedor("Arturo Prat 689");
		listaVendedores.add(vendedor);
		listaVendedores.add(vendedor2);
		listaVendedores.add(vendedor3);
		
		tienda.setCliente(cliente);
		tienda.setVendedor(vendedor);
		
		System.out.println(tienda.toString());
		
		Bus  bus = new Bus(48);
		int asientosDisponibles = bus.asientosDisponibles(50);
		
		System.out.println("La cantidad de asientos disponibles es: " + asientosDisponibles);
		

	}
	}



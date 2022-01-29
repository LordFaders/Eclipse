package Automotora;

import Automotora.Models.Cliente;
import Automotora.Models.LibroVentas;
import Automotora.Models.Vehiculo;

public class Main {

	public static void main(String[] args) {

		System.out.println("Libro de Ventas");

		Vehiculo vehiculo1 = new Vehiculo();
		Cliente cliente1 = new Cliente();
		LibroVentas libroVentas1 = new LibroVentas();

		libroVentas1.setNombreVenta("venta1");
		vehiculo1.setPatente("PC6705");
		cliente1.setEdad(27);
		libroVentas1.setFechaVenta("20220114");

		libroVentas1.guardarVenta(cliente1, vehiculo1);
		

	}

}

package Automotora.Models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVentas {
	private String nombreVenta;
	private String fechaVenta;
	private Cliente cliente;
	private Vehiculo vehiculo;

	public LibroVentas() {
		super();
	}

	public LibroVentas(String nombreVenta, String fechaVenta, Cliente cliente, Vehiculo vehiculo) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
		this.cliente = cliente;
		this.vehiculo = vehiculo;
	}

	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "LibroVentas [nombreVenta=" + nombreVenta + ", fechaVenta=" + fechaVenta + ", cliente=" + cliente
				+ ", vehiculo=" + vehiculo + "]";
	}

	public void guardarVenta(Cliente cliente1, Vehiculo vehiculo1) {
		String fichero = "fichero";

		File directorio = new File("src/" + fichero);
		if (directorio.mkdirs()) {
			File archivo = new File("src/" + fichero + "/" + "libroDeVenta.txt");
			try {
				if (!archivo.exists()) {
					archivo.createNewFile();
					System.out.println("Archivo creado...");
				}

			} catch (IOException e) {
				System.out.println("Error en la creacion del archivo");
			}
			try {
				int fecha = Integer.parseInt(this.fechaVenta);
				FileWriter archivoWriter = new FileWriter(archivo);
				BufferedWriter buff = new BufferedWriter(archivoWriter);
				buff.write("La patente del vehículo es: " + vehiculo1.getPatente());
				buff.newLine();
				buff.write("La edad del cliente es: " + cliente1.getEdad());
				buff.newLine();
				buff.write("La fecha de venta es: " + fecha);
				buff.newLine();
				buff.write("El nombre del archivo es: " + this.nombreVenta);
				buff.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
}

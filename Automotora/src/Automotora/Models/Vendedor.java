package Automotora.Models;

public class Vendedor extends Persona {
	private String direccion;

	public Vendedor() {
		super();
	}

	public Vendedor(String rut, String nombre, int edad) {
		super(rut, nombre, edad);
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Vendedor(String direccion) {
		super();
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Vendedor [direccion=" + direccion + "]";
	}

}

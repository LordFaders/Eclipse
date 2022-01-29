package Automotora.Models;

public class Cliente extends Persona {
	private int edad;

	public Cliente() {
		super();
	}

	public Cliente(String rut, String nombre, int edad) {
		super(rut, nombre, edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Cliente(int edad) {
		super();
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + "]";
	}

	public void imprimeCliente() {
		System.out.println("edad" + this.edad);
		System.out.println("nombre " + getNombre());
	}

}

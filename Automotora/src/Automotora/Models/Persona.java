package Automotora.Models;

public class Persona {
	private String rut;
	private String nombre;
	private int edad;
	
	public Persona() {
		super();
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String rut, String nombre, int edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}

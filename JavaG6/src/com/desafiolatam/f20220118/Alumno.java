package com.desafiolatam.f20220118;

public class Alumno {

	private String nombre;
	private String Apellido;

	private Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		Apellido = apellido;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", Apellido=" + Apellido + "]";
	}

}

package com.desafiolatam.f20220118;

public class InstitutoEducativo {
	// atributo
	private static InstitutoEducativo ie;
	private String nombre;

	// constructor vacio privado
	private InstitutoEducativo() {

	}

	public static InstitutoEducativo getIe() {
		return ie;
	}

	public static void setIe(InstitutoEducativo ie) {
		InstitutoEducativo.ie = ie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// metodo
	public static InstitutoEducativo obtenerInstancia() {

		if (ie == null) {
			synchronized (InstitutoEducativo.class) {
				ie = new InstitutoEducativo();
				System.out.println("Instancia creada");
			}

		} else {
			System.out.println("La instancia ya existe");

		}
		return ie;
	}
}

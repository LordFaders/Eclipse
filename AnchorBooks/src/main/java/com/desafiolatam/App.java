package com.desafiolatam;

public class App {
	public static void main(String[] args) {

		System.out.println("Lista de libros:");
		System.out.println("----------------");
		ConsumirApi consumirApi = new ConsumirApi();
		consumirApi.obtenerListaDeLibros();

		System.out.println();

		System.out.println("Libros por autor y título:");
		System.out.println("--------------------------");
		consumirApi.librosAutorTitulo();

		System.out.println();

		System.out.println("Libros 3 y 8:");
		System.out.println("-------------");
		consumirApi.librosIndice();

		System.out.println();

		System.out.println("Detalle de libros:");
		System.out.println("------------------");
		consumirApi.detalleLibros();

		System.out.println();

		System.out.println("Autores anónimos:");
		System.out.println("-----------------");
		consumirApi.autoresAnonimos();

		System.out.println();

		System.out.println("Libros Disponibles para delivery:");
		System.out.println("---------------------------------");
		consumirApi.deliveryDisponibles();

	}
}

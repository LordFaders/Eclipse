package com.desafiolatam.f20220118;

public class Main {

	public static void main(String[] args) {
		
		InstitutoEducativo desafioLatam = InstitutoEducativo.obtenerInstancia();
		desafioLatam.setNombre("Desafio Latam");
		System.out.println(desafioLatam.getNombre());
		
		InstitutoEducativo desafioChile = InstitutoEducativo.obtenerInstancia();
		//desafioLatam.setNombre("Desafio Chile");
		System.out.println(desafioChile.getNombre());
		System.out.println(desafioLatam.getNombre());
	}

}

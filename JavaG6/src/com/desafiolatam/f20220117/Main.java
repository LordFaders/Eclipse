package com.desafiolatam.f20220117;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> listaClientes = new ArrayList<>();
		listaClientes.add("Juan");
		listaClientes.add("Susana");
		listaClientes.add("Ramiro");
		listaClientes.add("Susana");
		listaClientes.add("Cristina");
		listaClientes.add("Susana");
		
		System.out.println(listaClientes);
		
		System.out.println(listaClientes.get(3));
		
		System.out.println("*** for ***");
		for(int i = 0; i <listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i));
		}
		System.out.println("*** foreach ***");
		for(String cliente : listaClientes) {
			System.out.println(cliente);
		}
		
		System.out.println("*** for iterator ***");
		for(Iterator iterator = listaClientes.iterator(); iterator.hasNext();) {
			String cliente =  (String) iterator.next();
			System.out.println(cliente);
		}
		
		//metodos de búsqueda
		System.out.println(listaClientes.indexOf("Jaime")); // no está en la lista
		System.out.println(listaClientes.indexOf("Susana"));
		
		System.out.println(listaClientes.lastIndexOf("Susana"));

	}

}

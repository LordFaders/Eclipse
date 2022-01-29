package com.desafiolatam.f20220117;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		Cliente cliente0 = new Cliente("Jaime", "Tapia");
		Cliente cliente1 = new Cliente("Bárbara", "Bórquez");
		Cliente cliente2 = new Cliente("Nur", "Miquel");

		listaClientes.add(cliente0);
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);

		listaClientes.get(2);// obteniendo un objeto Cliente
		
		Cliente clienteVacio = new Cliente();
		listaClientes.add(clienteVacio);
		
		listaClientes.get(3).setNombre("Jaime");
		System.out.println("cliente vacio " + clienteVacio.getNombre());
		listaClientes.get(3).setApellido("Tapia");

		System.out.println("*** for ***");
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i).getNombre());
		}
		System.out.println("*** foreach ***");
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.getApellido());
		}

		System.out.println("*** for iterator ***");
		for (Iterator iterator = listaClientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			System.out.println(cliente.getApellido());

		}

		// metodos de búsqueda
		System.out.println();
		Cliente cliente3 = new Cliente("Nur", "Miquel");
		System.out.println(listaClientes.contains(cliente1));

		/**
		 * Iterator
		 **/
		System.out.println();
		//asignamos la lista creada anteriormente a un listIterator
		ListIterator<Cliente> clientesIterator = listaClientes.listIterator();
		
		System.out.println(clientesIterator.hasNext());//true: hay elemento
		System.out.println(clientesIterator.next());//accediendo al primer objeto

		System.out.println(clientesIterator.hasPrevious());
		System.out.println(clientesIterator.previous());
		
		//¿hay elementos en la lista?
		while (clientesIterator.hasNext()) {
			System.out.println(clientesIterator.next());
		}
		//¿hay elementos en la lista?
		while (clientesIterator.hasPrevious()) {
			System.out.println(clientesIterator.previous());
		}
	}
}

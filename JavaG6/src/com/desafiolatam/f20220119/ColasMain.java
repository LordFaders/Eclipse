package com.desafiolatam.f20220119;

import java.util.LinkedList;
import java.util.Queue;

public class ColasMain {

	public static void main(String[] args) {
		//Colas
		Queue<String> animales = new LinkedList<String>();
		animales.offer("Hasan");
		animales.offer("Mago");
		animales.offer("Galea");
		animales.offer("Jac");
		animales.offer("Tom");
		animales.offer("Zoe");
		animales.add("Tom");
		animales.add("Ayun");
		
		System.out.println("lista animales "+animales);
		System.out.println(animales.size());
		System.out.println();
		for (String mascota : animales) {
			System.out.println(mascota);
		}
		System.out.println();
		
		animales.offer("piti");//agrega al final
		String mascotaEliminada = animales.poll();//FIFO, elimina el primer elemento
		System.out.println(mascotaEliminada);
		System.out.println("lista animales "+animales);
		System.out.println();
		
		System.out.println(animales.element());//Mostrar el primer elemento de la cola
		System.out.println("lista animales "+animales);
		System.out.println();
		
		System.out.println(animales.peek());
		animales.remove("Tom");
		System.out.println("lista animales "+animales);
		
		System.out.println();
		animales.clear();
		System.out.println("lista animales 4 "+animales);//lista vacia
		
		System.out.println(animales.peek());//retorna null en caso de estar vacia o el primer elemento
		System.out.println("remove "+ animales.remove("Tom"));
		System.out.println("poll "+animales.poll());
		
	}
}

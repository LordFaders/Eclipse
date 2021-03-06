package mirando.El.Pasado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<String> marcas = new ArrayList<>();
		marcas.add("Viceroy");
		marcas.add("Free Cola");
		marcas.add("Compaq");
		marcas.add("NetScape");
		marcas.add("Pan Am");
		marcas.add("Ares");
		marcas.add("Napster");
		marcas.add("Nokia");
		marcas.add("BlackBerry");
		marcas.add("Saab");

		System.out.println("Arreglo original: \n" + marcas);
		System.out.println();

		marcas.add("Blockbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");

		System.out.println("Arreglo con marcas nuevas: \n" + marcas);
		System.out.println();

		System.out.println("Blokbaster está mal escrito.");
		marcas.set(10, "Blockbuster");
		System.out.println("Arreglo con ortografía corregida: \n" + marcas);
		System.out.println();

		System.out.println("Carrefour aún existe.");
		marcas.remove(11);
		System.out.println("Arreglo coregido: \n" + marcas);
		System.out.println();

		ArrayList<String> posiblesMarcas = new ArrayList<>();
		posiblesMarcas.add("PcFactory");
		posiblesMarcas.add("Renault");
		posiblesMarcas.add("BMW");
		posiblesMarcas.add("Dell");
		marcas.addAll(posiblesMarcas);

		System.out.println("Arreglo final: \n" + marcas);
		System.out.println();

		System.out.println("La cantidad de elementos del arreglo es: \n" + marcas.size());

	}

}

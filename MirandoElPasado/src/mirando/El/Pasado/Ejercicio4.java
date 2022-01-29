package mirando.El.Pasado;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {

	public static void main(String[] args) {

		Queue<String> juegos = new LinkedList<String>();
		juegos.offer("Tombo");
		juegos.offer("Congelado");
		juegos.offer("Quemaditas");
		juegos.offer("Cachipún");
		juegos.offer("Pillarse");

		System.out.println("Juegos: \n" + juegos);
		System.out.println();

		System.out.println("La cantidad de juegos es: \n" + juegos.size());

	}
}
package cl.desafiolatamf20211204;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		/*
		 * DO-While
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		boolean opcion = true;
		// do_while nos permite realizar a lo menos una acción
		/*
		 * do { System.out.println("hola clase"); opcion = false; }while(opcion);
		 * System.out.println("Fuera del Do-while");
		 */

		int edad = 0;
		boolean esMenor = false;
		do {
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();
			if (edad < 18) {
				esMenor = true;
			} else {
				esMenor = false;
			}
		} while (esMenor);

	}

}

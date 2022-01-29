package cl.desafiolatamf20211204;

import java.util.Scanner;

public class DoWhileMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*************************");
		System.out.println("*         MENU          *");
		System.out.println("*************************");
		System.out.println("* Seleccione una opcion *");
		System.out.println("*    1 .- SUMAR         *");
		System.out.println("*    2 .- RESTAR        *");
		System.out.println("*    3 .- MULTIPLICAR   *");
	 	System.out.println("*    4 .- DIVIDIR       *");
		System.out.println("*************************");

		int opcion = 0;
		do {
			System.out.println("* Seleccione una opción *");
			opcion = sc.nextInt();
		} while (opcion < 1 || opcion > 4);
		System.out.println("fuera del while");
		sc.close();

	} 

}

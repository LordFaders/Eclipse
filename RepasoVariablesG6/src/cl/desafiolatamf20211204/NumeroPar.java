package cl.desafiolatamf20211204;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Ingrese un numero par");
			numero = sc.nextInt();
		} while (numero % 2 != 0);
		System.out.println("Numero par");
	}

}
// % -> modulo o resto de la division    
//numero%2 != 0 -> impar
// numero%2 == 0 -> par
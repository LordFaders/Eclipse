package cl.desafiolatamf20220103;

import java.util.Scanner;

public class SumaArreglos2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int minimo = 0;
		int maximo = 0;

		do {
			System.out.println(" Por favor ingrese valor minimo");
			minimo = sc.nextInt();
			System.out.println(" Por favor ingrese valor maximo");
			maximo = sc.nextInt();

			if (maximo < minimo) {
				System.out.println("El numero maximo no puede ser menor que el numero :" + minimo);
			}
		} while (maximo < minimo);

		int[] numeros = { 4, 6, 687, 45, 977, 354, 1, 23, 5, 576, 741 };

		// variables acumuladoras
		int sumaTotal = 0;// variable = variable + algo

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] >= minimo && numeros[i] <= maximo && numeros[i]%2!=0 ) {
				sumaTotal = sumaTotal + numeros[i];
				
				// System.out.println("La suma de sus valores es: " +sumaTotal );

				// System.out.println(sumaTotal);
			}

			// System.out.println("suma Total " + sumaTotal);
		}
		// solicitar el inicio y fin del rango a consultar
		System.out.println("La suma de sus valores es: " + sumaTotal);
	}

}

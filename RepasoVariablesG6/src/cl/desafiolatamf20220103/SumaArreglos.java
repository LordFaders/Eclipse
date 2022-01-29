package cl.desafiolatamf20220103;

import java.util.Scanner;

public class SumaArreglos {

	public static void main(String[] args) {
	    // posiciones     0  1   2    3   4    5   6   7  8   9   10
		int[] numeros = { 4, 6, 687, 45, 977, 354, 1, 23, 5, 576, 741 };

		// variables acumuladoras
		int sumaTotal = 0;// variable = variable + algo;

		// sumaTotal = 1;
		for (int i = 0; i < numeros.length; i++) {
			// sumaTotal = 0 + 1;
			sumaTotal = sumaTotal + numeros[i];

		}
		System.out.println("suma total " + sumaTotal);
		
		//solicitar inicio y fin del rango a consultar
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese inicio del rango");
		int inicio = sc.nextInt();
		System.out.println("Ingrese fin del rango");
		int fin = sc.nextInt();
		int suma = 0;
		
		for (int i = 0; i > inicio && i < fin; i++) 
		int sumaTotal = 0;
		sumatotal = suma + numeros[i];	
		{
			System.out.println(sumaTotal);
		}
		
	}

}

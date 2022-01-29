package cl.desafiolatamf20220103;

import java.util.Arrays;
import java.util.Scanner;

public class SumaArreglos4 {

	public static void main(String[] args) {

		/*
		 * Tamaño arreglo 6; tamaño 6 Crear un array a partir de los datos ingresados
		 * por el usuario Buscar aquellor que estén en el rango solicitado al usuario
		 * los guarda en el otro array y los muestra.
		 * 
		 */

		int[] numeros = new int[6];
		int[] numeros2 = new int[6];

		int contador = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un dígito");
		int digito = sc.nextInt();
		numeros[0] = digito;
		System.out.println("Ingrese un dígito");
		digito = sc.nextInt();
		numeros[1] = digito;
		System.out.println("Ingrese un dígito");
		digito = sc.nextInt();
		numeros[2] = digito;
		System.out.println("Ingrese un dígito");
		digito = sc.nextInt();
		numeros[3] = digito;
		System.out.println("Ingrese un dígito");
		digito = sc.nextInt();
		numeros[4] = digito;
		System.out.println("Ingrese un dígito");
		digito = sc.nextInt();
		numeros[5] = digito;

		System.out.println("Ingrese rango de incio");
		int inicio = sc.nextInt();
		System.out.println("Ingrese rango final");
		int fin = sc.nextInt();

		for (int i = 0; i < 6; i++) {
			if (numeros[i] >= inicio && numeros[i] <= fin) {
				numeros2[contador] = numeros[i];
				contador++;
			}

		}
		System.out.println("Nuevo array: " + Arrays.toString(numeros2));

	}

}

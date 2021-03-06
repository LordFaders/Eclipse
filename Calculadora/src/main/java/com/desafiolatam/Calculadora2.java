package com.desafiolatam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora2 {
	
	//Esta clase es como había desarrollado originalmente el proyecto e Israel me comentó 
	//que era demasiado para los requerimientos del ejercicio y me sugirió que la enviase
	//de todas formas para ver las dos formas
	public Double sumar(Scanner sc) {

		Double numero1 = 0d;
		Double numero2 = 0d;
		Double resultado = 0d;

		try {
			do {
				System.out.println("Ingrese el primer númmero");
				numero1 = sc.nextDouble();
				System.out.println("Ingrese el segundo númmero");
				numero2 = sc.nextDouble();
			} while (numero1 == null || numero2 == null);
			resultado = numero1 + numero2;
		} catch (InputMismatchException ime) {
			System.out.println("Debe ingresar solo números. No se permiten letras ni caracteres especiales");
		} catch (NullPointerException npe) {
			resultado = 1d;
		}
		System.out.println("El resultado de la suma es: " + resultado);
		return resultado;
	}

	public Double restar(Scanner sc) {

		Double numero1 = 0d;
		Double numero2 = 0d;
		Double resultado = 0d;

		try {
			do {
				System.out.println("Ingrese el primer númmero");
				numero1 = sc.nextDouble();
				System.out.println("Ingrese el segundo númmero");
				numero2 = sc.nextDouble();
			} while (numero1 == null || numero2 == null);
			resultado = numero1 - numero2;
		} catch (InputMismatchException ime) {
			System.out.println("Debe ingresar solo números. No se permiten letras ni caracteres especiales");
		} catch (NullPointerException npe) {
			resultado = 1d;
		}
		System.out.println("El resultado de la resta es: " + resultado);
		return resultado;
	}

	

	public Double multiplicacion(Scanner sc) {

		Double numero1 = 0d;
		Double numero2 = 0d;
		Double resultado = 0d;

		try {
			do {
				System.out.println("Ingrese el primer númmero");
				numero1 = sc.nextDouble();
				System.out.println("Ingrese el segundo númmero");
				numero2 = sc.nextDouble();
			} while (numero1 == null || numero2 == null);
			resultado = numero1 * numero2;
		} catch (InputMismatchException ime) {
			System.out.println("Debe ingresar solo números. No se permiten letras ni caracteres especiales");
		} catch (NullPointerException npe) {
			resultado = 1d;
		}
		System.out.println("El resultado de la multiplicación es: " + resultado);
		return resultado;
	}

	public Double division(Scanner sc) {

		Double numero1 = 0d;
		Double numero2 = 0d;
		Double resultado = 0d;

		try {
			do {
				System.out.println("Ingrese el primer númmero");
				numero1 = sc.nextDouble();
			} while (numero1 == null || numero1 == 0);
			do {
				System.out.println("Ingrese el segundo númmero");
				numero2 = sc.nextDouble();
			}while (numero2 == null || numero2 == 0);
			resultado = numero1 / numero2;
		} catch (InputMismatchException ime) {
			System.out.println("Debe ingresar solo números. No se permiten letras ni caracteres especiales");
		} catch (NullPointerException npe) {
			resultado = 1d;
		}
		System.out.println("El resultado de la división es: " + resultado);
		return resultado;
	}

}
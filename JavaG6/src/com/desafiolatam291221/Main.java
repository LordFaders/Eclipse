package com.desafiolatam291221;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("¿Qué edad tienes?"); int edad = sc.nextInt(); if (edad >=
		 * 18) { System.out.println("Eres mayor de edad"); } else {
		 * System.out.println("Eres menor de edad");
		 * 
		 * } System.out.println("Ingrese numero"); int numero = sc.nextInt();
		 * sc.nextLine();
		 * 
		 * if (numero == 0) { System.out.println("El numero ingresado es cero"); } else
		 * { if (numero > 0) {
		 * System.out.println("El numero ingresado es mayor a cero"); } else {
		 * System.out.println("El numero es menor a cero"); } }
		 * 
		 * System.out.println("Ingrese una vocal"); String vocal = sc.nextLine();
		 * 
		 * if (vocal.equalsIgnoreCase("a")) {
		 * System.out.println("ingresaste la vocal A"); } else if
		 * (vocal.toLowerCase().equals("e")) {
		 * System.out.println("ingresaste la vocal e"); } else if
		 * (vocal.toUpperCase().equals("I")) {
		 * System.out.println("ingresaste la vocal i/I"); }else if
		 * (vocal.toUpperCase().equals("O")) {
		 * System.out.println("ingresaste la vocal o/O"); }else if
		 * (vocal.toUpperCase().equals("U")) {
		 * System.out.println("ingresaste la vocal u/U"); }
		 */

		/*
		 * System.out.println("Ingrese su password"); String password = sc.nextLine();
		 * 
		 * String palabra = "b"; //a b= -1; b a = 1; b B = 32
		 * 
		 * System.out.println(palabra.compareTo(password));
		 * if(palabra.compareTo(password)==0) { System.out.println("Palabras iguales");
		 * }else { System.out.println("palabras distintas"); }
		 */

		System.out.println("Ingrese texto 1");
		String texto1 = sc.nextLine();
		System.out.println("Ingrese texto 2");
		String texto2 = sc.nextLine();
		if (texto1.compareTo(texto2) == 0) {
			System.out.println("Textos iguales");
		} else {
			if (texto1.compareTo(texto2) > 0) {
				System.out.println(texto1 + " es mayor que " + texto2);
			} else {
				System.out.println(texto1 + " es menor que " + texto2);

			}
		}
	}

}

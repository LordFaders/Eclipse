package com.desafiolatamf20211230;

import java.util.Scanner;

public class DesafioOperacionesAritmeticas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese resistencia 1");
		float R1 = Math.abs(sc.nextFloat());
		System.out.println("Ingrese resistencia 2");
		float R2 = Math.abs(sc.nextFloat());
		System.out.println("Ingrese resistencia 3");
		float R3 = Math.abs(sc.nextFloat());

		float RT = Math.round((1 / ((1 / R1) + (1 / R2) + (1 / R3)) * 10) / 10f);

		System.out.println("La resistencia total es de " + RT);

	}

}

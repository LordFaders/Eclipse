package com.desafiolatamf20211230;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean esMenor = false;
		do {
			System.out.println("Ingrese su edad");
			int edad = sc.nextInt();
			if (edad < 18) {
				esMenor = true;
				System.out.println("Usted no puede usar este sistema");
			} else {
				esMenor = false;
			}
		} while (esMenor);

		System.out.println("Ingrese estatura");

		float estatura = sc.nextFloat();
		System.out.println("Ingrese peso");
		float peso = sc.nextFloat();

		float imc = (float) (peso / Math.pow(estatura, 2));
		System.out.println(imc);

		if (imc < 18.5) {
			System.out.println("Bajo peso");
			// 18.5 - 24.9
		} else if (imc >= 18.5 && imc < 25) {// [18.5, 25 [
			System.out.println("Normal");
		} else if (imc >= 25 && imc < 30) { // 25.0 29.9
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obeso");
		}

	}

}

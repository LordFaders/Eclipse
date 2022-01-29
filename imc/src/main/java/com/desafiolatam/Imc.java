package com.desafiolatam;

import java.util.Scanner;

public class Imc {

	
	// calculo indice masa corporal
	/*
	 * validarEdad(); Float estatura = obtenerEstatura(); Float kilos =
	 * obtenerKilos(); calcularIMC(kilos, estatura);
	 */

	public Integer validarEdad(Integer edad) {
		boolean esMenor = false;
		edad = 0;
		do {
			System.out.println("Ingrese su edad");
			// edad = sc.nextInt();
			edad = 18;
			if (edad < 18) {
				esMenor = true;
				System.out.println("Usted no puede usar esta sistema");
			} else {
				esMenor = false;
			}

		} while (esMenor);
		return edad;
	}

	public Float obtenerEstatura() {
		Float estatura = 0f;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("cuál es su estatura en metros?");
			
			try {
				estatura = sc.nextFloat();
				sc.nextLine();
			} catch (Exception e) {
				
			}
		} while (estatura < 0.5);
		return estatura;
	}

	public Float obtenerKilos(Float kilos) {
		kilos = 0f;
		do {
			System.out.println("Ingrese su peso en kilogramos.");
			// kilos = sc.nextFloat();
			kilos = 80f;
		} while (kilos < 1);
		return kilos;
	}

	public Float calcularIMC(Float kilos, Float estatura) {
		Float imc = 0f;
		if (kilos != null && kilos >= 1 && estatura != null && estatura >= 0.5f) {

			imc = kilos / (estatura * estatura);

			System.out.println("Su IMC es " + imc);
			if (imc < 18.5) {
				System.out.println("Bajo peso");
			} else if (imc >= 18.5 && imc < 25) {
				System.out.println("Normal");
			} else if (imc >= 25 && imc < 30) {
				System.out.println("Sobrepeso");
			} else {
				System.out.println("Obeso");
			}

		}
		return imc;
	}
}

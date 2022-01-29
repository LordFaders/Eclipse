package cl.desafiolatam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese resistencia 1");
		float R1 = sc.nextFloat();
		if (R1 <= 0) {
			System.out.println("Valor inválido, ingrese valor mayor a 0");
		} else {
			System.out.println("Ingrese resistencia 2");
		}
		float R2 = sc.nextFloat();
		if (R2 <= 0) {
			System.out.println("Valor inválido, ingrese valor mayor a 0");
		} else {
			System.out.println("Ingrese resistencia 3");
		}
		float R3 = sc.nextFloat();
		if (R3 <= 0) {
			System.out.println("Valor inválido, ingrese valor mayor a 0");
		}

		float RT = 1 / ((1 / R1) + (1 / R2) + (1 / R3));

		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println("La resistencia total es de " + df.format(RT));
	}

}

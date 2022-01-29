package cl.desafiolatam;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la primera fecha");
		String fecha1 = sc.nextLine();
		int dia1 = Integer.parseInt(fecha1.substring(0, 2));
		int mes1 = Integer.parseInt(fecha1.substring(3, 5));
		int año1 = Integer.parseInt(fecha1.substring(6, 10));

		System.out.println("Ingrese la segunda fecha");
		String fecha2 = sc.nextLine();
		int dia2 = Integer.parseInt(fecha2.substring(0, 2));
		int mes2 = Integer.parseInt(fecha2.substring(3, 5));
		int año2 = Integer.parseInt(fecha2.substring(6, 10));

		if (año1 < año2) {
			System.out.println("Persona 1 es mayor");
		} else if (año2 < año1) {
			System.out.println("Persona 2 es mayor");
		} else {
			if (mes1 < mes2) {
				System.out.println("Persona 1 es mayor");
			} else if (mes2 < mes1) {
				System.out.println("Persona 2 es mayor");
			} else {
				if (dia1 < dia2) {
					System.out.println("Persona 1 es mayor");
				} else if (dia2 < dia1) {
					System.out.println("Persona 2 es mayor");
				} else {
					System.out.println("Tienen la misma edad");
				}
			}

		}
	}
}

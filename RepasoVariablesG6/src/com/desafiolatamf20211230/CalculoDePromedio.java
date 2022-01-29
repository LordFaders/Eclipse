 package com.desafiolatamf20211230;

import java.util.Scanner;

public class CalculoDePromedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese asignatura");
		String asignatura = sc.nextLine();
		System.out.println("Ingrese docente");
		String docente = sc.nextLine();
		System.out.println("Ingrese nota 1");
		float nota1 = sc.nextFloat();
		System.out.println("Ingrese nota 2");
		float nota2 = sc.nextFloat();
		System.out.println("Ingrese nota 3");
		float nota3 = sc.nextFloat();
		
		System.out.println("************************");
		System.out.println("*Hoja de calificaciones*");
		System.out.println("************************");
		float promedio = Math.round(((nota1 + nota2 + nota3)/3)*10)/10f;
		
		if (promedio < 4) {
			System.out.println("Tu promedio es: " + promedio);
			System.out.println("Debe dar prueba de recuperación para rendir el examen final");
		}else if (promedio >= 4 && promedio < 5.5) {
			System.out.println("Tu promedio es: " + promedio);
			System.out.println("Debes rendir el examen final para aprobar");
		}else if (promedio >= 5.5) {
			System.out.println("Tu promedio es: " + promedio);
			System.out.println("Felicitaciones, te eximiste del examen y aprobaste");
		}

	}
}

package com.desafiolatam.f20220118;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {

		Set<Alumno> alumnoHashSet = new HashSet<Alumno>();

		Alumno alumno1 = new Alumno("Barbara", "Borquez");
		Alumno alumno2 = new Alumno("Gustavo", "Huerta");
		Alumno alumno3 = new Alumno("Nur", "Miquel");
		Alumno alumno4 = new Alumno("Berta", "Alvial");
		Alumno alumno5 = new Alumno("Barbara", "Borquez");

		// HashSet
		// Lista No ordenada, no permite la duplicidad de datos.
		Set<Alumno> alumnosHashSet = new HashSet<Alumno>();
		alumnoHashSet.add(alumno1);
		alumnoHashSet.add(alumno2);
		alumnoHashSet.add(alumno3);
		alumnoHashSet.add(alumno4);
		alumnoHashSet.add(alumno5);

		System.out.println(alumnoHashSet);
		System.out.println();

		// LinkedHashSet
		// Lista ordenada por orden de entrada
		Set<Alumno> alumnoLHS = new LinkedHashSet<Alumno>();
		alumnoLHS.add(alumno1);
		alumnoLHS.add(alumno2);
		alumnoLHS.add(alumno3);
		alumnoLHS.add(alumno4);
		alumnoLHS.add(alumno5);

		System.out.println(alumnoLHS);
		System.out.println();

	}

}

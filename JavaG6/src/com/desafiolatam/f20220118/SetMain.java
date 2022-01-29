package com.desafiolatam.f20220118;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {

		// HashSet
		// Lista No ordenada, no permite la duplicidad de datos.
		Set<String> alumnosHashSet = new HashSet<String>();
		alumnosHashSet.add("Barbara Borquez");
		alumnosHashSet.add("Nur Miquel");// repetida
		alumnosHashSet.add("Gustavo Huerta");
		alumnosHashSet.add("Nur Miquel");// repetida
		alumnosHashSet.add("Berta Alvial");
		alumnosHashSet.add("Jaime Tapia");
		alumnosHashSet.add("Nur Miquel");// repetida

		System.out.println(alumnosHashSet);
		System.out.println();

		// LinkedHashSet
		// Lista ordenada por orden de entrada
		Set<String> alumnosLHS = new LinkedHashSet<String>();
		alumnosLHS.add("Barbara Borquez");
		alumnosLHS.add("Nur Miquel");// repetida
		alumnosLHS.add("Gustavo Huerta");
		alumnosLHS.add("Nur Miquel");// repetida
		alumnosLHS.add("Berta Alvial");
		alumnosLHS.add("Jaime Tapia");
		alumnosLHS.add("Nur Miquel");// repetida

		System.out.println(alumnosLHS);
		System.out.println();

		// LinkedHashSet
		// Lista ordenada alfabéticamente
		Set<String> alumnosTree = new TreeSet<String>();
		alumnosTree.add("Barbara Borquez");
		alumnosTree.add("Nur Miquel");// repetida
		alumnosTree.add("Gustavo Huerta");
		alumnosTree.add("Nur Miquel");// repetida
		alumnosTree.add("Berta Alvial");
		alumnosTree.add("Jaime Tapia");
		alumnosTree.add("Nur Miquel");// repetida

		System.out.println(alumnosTree);
		System.out.println();

	}

}

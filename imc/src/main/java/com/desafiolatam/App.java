package com.desafiolatam;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Imc imc = new Imc();
		imc.validarEdad(18);
		imc.obtenerEstatura();
		imc.obtenerKilos(80f);
		imc.calcularIMC(80f, 1.80f);
	}
}

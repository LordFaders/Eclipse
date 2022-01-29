package com.desafiolatam;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Suma");
		System.out.println("----");
		calculadora.sumar(20d, 30d);
		System.out.println();
		
		System.out.println("Resta");
		System.out.println("-----");
		calculadora.restar(30d, 20d);
		System.out.println();
		
		System.out.println("Multiplicación");
		System.out.println("--------------");
		calculadora.multiplicacion(4d, 5d);
		System.out.println();
		
		System.out.println("División");
		System.out.println("--------");
		calculadora.division(20d, 5d);
		System.out.println();
	}
}

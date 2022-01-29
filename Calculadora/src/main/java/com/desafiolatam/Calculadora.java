package com.desafiolatam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public Double sumar(Double numero1, Double numero2) {
		Double resultado = 0d;
		if (numero1 != null && numero2 != null) {
			resultado = numero1 + numero2;
		}
		return resultado;
	}

	public Double restar(Double numero1, Double numero2) {
		Double resultado = 0d;
		if (numero1 != null || numero2 != null) {
			resultado = numero1 - numero2;
		}
		return resultado;
	}

	public Double multiplicacion(Double numero1, Double numero2) {
		Double resultado = 0d;
		if (numero1 != null || numero2 != null) {
			resultado = numero1 * numero2;
		}
		return resultado;
	}

	public Double division(Double numero1, Double numero2) {
		Double resultado = 0d;
			if(numero1 != null || numero1 != 0 && numero2 != null || numero2 != 0) {
			resultado = numero1 / numero2;
			}
		return resultado;
	}

}
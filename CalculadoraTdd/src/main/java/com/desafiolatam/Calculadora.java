package com.desafiolatam;

import java.util.InputMismatchException;

public class Calculadora {

	public Double sumar(Double numero1, Double numero2) {
		Double resultado = 0d;

		try {
			if (numero1 != null || numero2 != null)
				;
			resultado = numero1 + numero2;
		} catch (InputMismatchException ime) {
			System.out.println("Debe ingresar solo números. No se permiten letras ni caracteres especiales");
		} catch (NullPointerException npe) {
			resultado = 1d;
		}
		System.out.println("El resultado de la suma es: " + resultado);
		return resultado;

	}

	public Double restar(Double numero1, Double numero2) {
		Double resultado = 0d;

		try {
			if (numero1 != null || numero2 != null)
				;
			resultado = numero1 - numero2;
		} catch (InputMismatchException ime) {
			System.out.println("Debe ingresar solo números. No se permiten letras ni caracteres especiales");
		} catch (NullPointerException npe) {
			resultado = 1d;
		}
		System.out.println("El resultado de la resta es: " + resultado);
		return resultado;
	}

	public Double multiplicar(Double numero1, Double numero2) {
		Double resultado = 0d;

		try {
			if (numero1 != null || numero2 != null)
				;
			resultado = numero1 * numero2;
		} catch (InputMismatchException ime) {
			System.out.println("Debe ingresar solo números. No se permiten letras ni caracteres especiales");
		} catch (NullPointerException npe) {
			resultado = 1d;
		}
		System.out.println("El resultado de la multiplicación es: " + resultado);
		return resultado;
	}

	
	public Double dividir(Double numero1, Double numero2) {
		Double resultado = 0d;

		try {
			if (numero1 != null || numero1 != 0 && numero2 != null || numero2 != 0)
				;
			resultado = numero1 / numero2;
		} catch (InputMismatchException ime) {
			System.out.println("Debe ingresar solo números. No se permiten letras ni caracteres especiales");
		} catch (NullPointerException npe) {
			resultado = 1d;
		}
		System.out.println("El resultado de la división es: " + resultado);
		return resultado;
	}
}
package com.desafiolatam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void sumar() {

		Calculadora calculo = new Calculadora();
		Double resultado = calculo.sumar(20d, 30d);
		assertEquals(50, resultado);

	}

	@Test
	public void restar() {

		Calculadora calculo = new Calculadora();
		Double resultado = calculo.restar(30d, 20d);
		assertEquals(10, resultado);
	}

	@Test
	public void multiplicacion() {

		Calculadora calculo = new Calculadora();
		Double resultado = calculo.multiplicar(4d, 5d);
		assertEquals(20, resultado);
	}

	@Test
	public void division() {

		Calculadora calculo = new Calculadora();
		Double resultado = calculo.dividir(20d, 5d);
		assertEquals(4, resultado);
	}
}
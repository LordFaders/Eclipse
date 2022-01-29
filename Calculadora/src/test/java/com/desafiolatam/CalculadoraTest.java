package com.desafiolatam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculadoraTest {

	Scanner sc = new Scanner(System.in);
	
	private static Logger logger = Logger.getLogger("");

	@Test
	public void sumar() {
		logger.info("Calculadora");
		Calculadora calculo = new Calculadora();
		Double resultado = calculo.sumar(20d, 30d);
		assertEquals(50, resultado);
  	}

	@Test
	public void restar() {
		logger.info("Calculadora");
		Calculadora calculo = new Calculadora();
		Double resultado = calculo.restar(30d, 20d);
		assertEquals(10, resultado);
	}
	
	@Test
	public void multiplicacion() {
		logger.info("Calculadora");
		Calculadora calculo = new Calculadora();
		Double resultado = calculo.multiplicacion(4d, 5d);
		assertEquals(20, resultado);
	}
	
	@Test
	public void division() {
		logger.info("Calculadora");
		Calculadora calculo = new Calculadora();
		Double resultado = calculo.division(20d, 5d);
		assertEquals(4, resultado);
	}
}
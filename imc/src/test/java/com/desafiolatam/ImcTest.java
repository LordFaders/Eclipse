package com.desafiolatam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.logging.Logger;

import org.junit.Test;

public class ImcTest {

	private static Logger logger = Logger.getLogger("");

	@Test
	public void validarEdad() {

		logger.info("IMC");
		Imc calculo = new Imc();
		Integer resultado = calculo.validarEdad(18);
		// clases assert
		assertEquals(18, resultado);
	}

	@Test
	public void obtenerEstaura() {

		logger.info("IMC");
		Imc calculo = new Imc();
		Float resultado = calculo.obtenerEstatura();
		assertNotNull(resultado);

	}

	@Test
	public void obtenerKilos() {
		logger.info("IMC");
		Imc calculo = new Imc();
		Float resultado = calculo.obtenerKilos(80f);
		assertNotEquals(0, resultado);
	}

	@Test
	public void calcularIMCnotNull() {
		logger.info("IMC");
		Imc calculo = new Imc();
		Float resultado = calculo.calcularIMC(null, null);
		assertNotNull(resultado);
	}

	@Test
	public void calcularIMCnotEquals() {
		logger.info("IMC");
		Imc calculo = new Imc();
		Float resultado = calculo.calcularIMC(80f, 1.80f);
		assertNotEquals(0f, resultado);
	}

	@Test
	public void calcularIMCEquals() {
		logger.info("IMC");
		Imc calculo = new Imc();
		Float resultado = calculo.calcularIMC(80f, 1.80f);
		System.out.println(resultado);
		assertEquals(24.69136f, resultado);
	}
	@Test
	public void calcularIMC0() {
		logger.info("IMC");
		Imc calculo = new Imc();
		Float resultado = calculo.calcularIMC(0f, 0f);
		System.out.println(resultado);
		assertEquals(0f, resultado);
	}
}

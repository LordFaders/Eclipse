package com.desafiolatam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPitagoras {

	@Test
	public void validarPitagoras() {
		// c^2 = a^2 + b^2
		Pitagoras pitagoras = new Pitagoras ();
        Integer hipo = pitagoras.obtenerHipotenusa(3,4);
        System.out.println(hipo);
        assertEquals(5, hipo);

	}
}
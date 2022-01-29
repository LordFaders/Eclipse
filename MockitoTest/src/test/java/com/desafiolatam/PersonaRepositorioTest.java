package com.desafiolatam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import modelos.Persona;
import repositorios.PersonaRepositorio;

public class PersonaRepositorioTest {

	private PersonaRepositorio personaRepositorio = mock(PersonaRepositorio.class);

	@Test
	public void testCrearPersona() {
		Persona pepe = new Persona("1-2", "Pepe");
		when(personaRepositorio.crearPersona(pepe)).thenReturn("NOK");
		// String crearPersonaRes = personaRepositorio.crearPersona(pepe);
		// assertEquals("OK", crearPersonaRes);
		verify(personaRepositorio).crearPersona(pepe);

	}

	@Test
	public void testActualizarPersona() {
		Persona pepe = new Persona("1-2", "Pepe");

		when(personaRepositorio.eliminarPersona(pepe)).thenReturn("NOK");
		verify(personaRepositorio).crearPersona(pepe);

	}

	@Test
	public void testEliminarPersona() {
		Persona pepe = new Persona("1-2", "Pepe");
		String eliminar = personaRepositorio.eliminarPersona(pepe);
		when(personaRepositorio.eliminarPersona(pepe)).thenReturn("NOK");
		assertEquals("OK", eliminar);
		verify(personaRepositorio).eliminarPersona(pepe);
	}

	@Test
	public void testListarPersona() {
		Map<String, String> mapa = new HashMap<String, String>();

		when(personaRepositorio.listarPersonas()).thenReturn(mapa);
		Map<String, String> listar = personaRepositorio.listarPersonas();
		assertEquals(mapa, listar);

		verify(personaRepositorio).listarPersonas();
	}
}

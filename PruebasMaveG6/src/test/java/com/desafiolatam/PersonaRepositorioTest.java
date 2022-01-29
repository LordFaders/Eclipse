package com.desafiolatam;

import repositorios.PersonaRepositorio;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import modelos.Persona;

public class PersonaRepositorioTest {
	
	private PersonaRepositorio personaRepositorio = mock(PersonaRepositorio.class);
	
	@Test
	public void testCrearPersona() {
	Persona pepe = new Persona("1-2", "Pepe");
	when(personaRepositorio.crearPersona(pepe)).thenReturn("NOK");
	
	//String crearPersonaRes = personaRepositorio.crearPersona(pepe);
	
	//assertEquals("OK", crearPersonaRes);
	
	}
	}



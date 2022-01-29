package com.desafiolatam;

import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

@DisplayName("AppTest")
public class AppTest {

	public static Logger logger = Logger.getLogger("com.desafiolatam.AppTest");
	
	@BeforeAll
	public void metodoBeforeAll() {
		logger.info("metodoBeforeAll");
	}
	@BeforeEach
	public void metodoBeforeEach() {
		logger.info("metodoBeforeEach");
	}
	

	@Test
	@DisplayName("Metodo cacho")
	public void shouldAnswerWithTrue() {
		logger.info("Por fin se soluciono el cacho");
		assertTrue(true);
	}
	@AfterEach
	public void metodoAfterEach() {
		logger.info("metodoAfterEach");
	}
	@AfterAll
	public void metodoAfterAll() {
		logger.info("metodoAfterAll");
	}
}

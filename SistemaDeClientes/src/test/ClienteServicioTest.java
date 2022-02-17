package test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import Servicio.ClienteServicio;
import modelo.CategoriaEnum;
import modelo.Cliente;


public class ClienteServicioTest {
	
	private static Logger logger = Logger.getLogger("PruebaJavaBasico.src.test.ClienteServicioTest");
	ClienteServicio clienteServicio = new ClienteServicio();
	
	@Test
	public void AgregarClienteTest() {

		logger.info("Información test Agregar Cliente");
		List<Cliente> addClienteTest = clienteServicio.agregarCliente("17.162.856-5", "Iron", "Manjar", "1 año",
				CategoriaEnum.ACTIVO);
		assertTrue("El Test del método agregar cliente fue exitoso", addClienteTest.size() > 0);
	}

	@Test
	public void AgregarClienteNullTest() {

		logger.info("Información test Agregar Cliente");
		List<Cliente> clienteNull = clienteServicio.agregarCliente(null, null, null, null, CategoriaEnum.ACTIVO);
		 String rutNull = clienteNull.get(0).getRutCliente();
		assertNull(rutNull, null);
	}

	


}

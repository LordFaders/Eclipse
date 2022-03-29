package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Cliente;
import servicio.ClienteServicioImp;

public class ClienteServicioTest {
	
	private ClienteServicioImp servicio;
	
	@BeforeEach
	void setup() {
		servicio = new ClienteServicioImp();
	}
	
	@Test
	public void agregarCliente() {
		Cliente cliente = new Cliente ("134", "jaime", "tapia", "5", null);
		servicio.agregarCliente(cliente);
		Assertions.assertNotNull(servicio.listarCliente().get(cliente.getRutCliente()));
	}
	
}

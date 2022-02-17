package Servicio;

import java.util.List;

import modelo.Cliente;

public abstract class Exportador {
	
	public abstract void exportar(String directorio, String fileName, List<Cliente> listaClientes);

	public void cargarDatos(String ruta, String fileName1, List<Cliente> listaClientes) {
		
	}

}

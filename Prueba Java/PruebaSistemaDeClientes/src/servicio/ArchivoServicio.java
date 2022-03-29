package servicio;

import java.util.List;

import modelo.Cliente;

public interface ArchivoServicio {
	
	void cargarDatos(String ruta, List<Cliente> listaClientes); 

	void exportarDatosTxt(String ruta, List<Cliente> listaClientes);

	void exportarDatosCsv(String ruta, List<Cliente> listaClientes);

}

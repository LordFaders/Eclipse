package servicio;

import java.util.Map;

import modelo.Cliente;

public interface ArchivoServicio {
	
	void cargarDatos(String ruta);
	
	void exportarDatosCsv(Map<String, Cliente> clientes, String ruta);
	
	void exportarDatosTxt(Map<String, Cliente> clientes, String ruta);

}

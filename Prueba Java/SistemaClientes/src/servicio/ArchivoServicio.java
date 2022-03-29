package servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import modelo.Cliente;

public interface ArchivoServicio {

	void cargarDatos(String ruta, List<Cliente> listaClientes); 

	void exportarDatosTxt(String ruta, List<Cliente> listaClientes);

	void exportarDatosCsv(String ruta, List<Cliente> listaClientes);

}

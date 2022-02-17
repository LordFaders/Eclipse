package Servicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import modelo.CategoriaEnum;
import modelo.Cliente;

public class ArchivoServicio extends Exportador {

	@Override
	public void exportar(String directorio, String fileName, List<Cliente> listaClientes) {
	}

	@Override
	public void cargarDatos(String ruta, String fileName1, List<Cliente> listaClientes) {

		String ArchivoALeer = (ruta + fileName1);
		System.out.println("Ruta del Archivo a Leer " + ArchivoALeer);
		System.out.println();

		try {
			FileReader archivoReader = new FileReader(ArchivoALeer);
			BufferedReader archivoBuffered = new BufferedReader(archivoReader);

			String lineaArchivo = archivoBuffered.readLine();

			while (lineaArchivo != null) {
				String[] atributoCliente = lineaArchivo.split(",");

				Cliente clienteTemporal = new Cliente(atributoCliente[0], atributoCliente[1], atributoCliente[2],
						atributoCliente[3], CategoriaEnum.valueOf(atributoCliente[4].toUpperCase()));
				lineaArchivo = archivoBuffered.readLine();

				listaClientes.add(clienteTemporal);

			}

			archivoBuffered.close();
			System.out.println("Ingresé correctamente la información a tu lista de clientes");
			System.out.println("La nueva lista de clientes es " + listaClientes);
			System.out.println();

		} catch (FileNotFoundException fnfe) {
			System.out.println("No encontré el archivo :O");
		} catch (IOException ioe) {
			System.out.println("Error al ingresar los datos :|");
		}

	}

}

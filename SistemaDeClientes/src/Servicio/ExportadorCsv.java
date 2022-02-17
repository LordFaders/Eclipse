package Servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import modelo.Cliente;

public class ExportadorCsv extends Exportador {

	@Override
	public void exportar(String directorio, String fileName, List<Cliente> listaClientes) {

		System.out.println(directorio); 
		System.out.println(fileName); 
		System.out.println(listaClientes);
		
		File archivo = new File(directorio + "/" +fileName + ".csv");
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();

				FileWriter archivoWriter = new FileWriter(archivo);
				PrintWriter printWriter = new PrintWriter(archivoWriter);

				for (Cliente cliente : listaClientes) {
					String lineaCliente = cliente.getRutCliente() + "," + cliente.getNombreCliente() + ","
							+ cliente.getApellidoCliente() + "," + cliente.getAniosCliente() + ","
							+ cliente.getCategoria();
					printWriter.write(lineaCliente);
					printWriter.println();
				}
				printWriter.close();
			} catch (IOException e) {
				System.out.println("No pude crear el archivo");
			}
		}

	}
		
	}



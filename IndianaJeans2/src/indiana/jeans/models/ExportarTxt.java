package indiana.jeans.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportarTxt extends ExportadorTxt {
	
	@Override
	public void exportar(ArrayList<Producto> listaProductos) {

		File archivo = new File("src/home/desafioLatam/clientes.txt");
		try {
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);

			for (Producto productoEscrito : listaProductos) {
				bw.write(productoEscrito.toString());

			}
			System.out.println("Datos de clientes exportados correctamente en formato .txt");
			bw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
					
		//aca se ve el file, escribir e listado de porductor con for each 
		
	}



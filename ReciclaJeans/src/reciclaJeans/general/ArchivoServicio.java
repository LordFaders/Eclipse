package reciclaJeans.general;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import reciclaJeans.models.Producto;

public class ArchivoServicio {

	public ArrayList<Producto> cargarDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la ruta del archivo que desea importar:");
		System.out.println("Ejemplo: src/ProductosImportados.csv");
		String archivo = sc.nextLine();
		ArrayList<Producto> productosARetornar = new ArrayList<Producto>();

		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			String lineaArchivo = br.readLine();

			while (lineaArchivo != null) {

				String[] elementoProd = lineaArchivo.split(",");

				Producto productoTemp = new Producto(elementoProd[0], elementoProd[1], elementoProd[2], elementoProd[3],
						elementoProd[4], elementoProd[5], elementoProd[6]);
				productosARetornar.add(productoTemp);

				lineaArchivo = br.readLine();
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se encontrĂ³ el archivo en la ruta especificada");
		} catch (IOException e) {
			System.out.println("Error al cargar los datos");
		}
		System.out.println("Datos" + productosARetornar);
		System.out.println("Datos cargados correctamente");

		return productosARetornar;
	}

}

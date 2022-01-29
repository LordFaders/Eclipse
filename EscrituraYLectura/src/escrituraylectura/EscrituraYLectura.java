package escrituraylectura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EscrituraYLectura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String directorio = "src/escrituraylectura";
		String fichero = "fichero";
		String nombreFichero = directorio + "/" + fichero + ".txt";

		System.out.println("Ingrese texto a buscar");
		String nombreTexto = sc.nextLine();

		crearArchivo(directorio, fichero);
		escribirArchivo(directorio, fichero);
		buscarTexto(nombreFichero, nombreTexto);

	}

	public static void crearArchivo(String directorio, String fichero) {
		File archivo = new File(directorio + "/" + fichero + ".txt");

		try {
			if (!archivo.exists()) {
				archivo.createNewFile();
				System.out.println("Archivo creado...");
			}

		} catch (IOException e) {
			System.out.println("Error en la creacion del archivo");
		}

	}

	public static void escribirArchivo(String directorio, String fichero) {
		File archivo = new File(directorio + "/" + fichero + ".txt");
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Juan");
		lista.add("Daniel");
		lista.add("Juan");
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Camila");
		lista.add("Daniel");
		lista.add("Camila");

		FileWriter archivoWriter;
		try {
			archivoWriter = new FileWriter(archivo);
			BufferedWriter archivoBuff = new BufferedWriter(archivoWriter);

			for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
				String texto = (String) iterator.next();
				archivoBuff.write(texto);
				archivoBuff.newLine();
			}
			archivoBuff.close();
		} catch (IOException e) {
			System.out.println("Error en la escritura del archivo");
		}
	}

	public static void buscarTexto(String nombreFichero, String nombreTexto) {

		File fichero = new File(nombreFichero);
		if (fichero.exists()) {
			try {
				FileReader ficheroReader = new FileReader(fichero);
				BufferedReader bufferedReader = new BufferedReader(ficheroReader);

				String linea = bufferedReader.readLine();// Leyendo una línea del archivo
				int contador = 0;
				while (linea != null) {
					if (linea.equalsIgnoreCase(nombreTexto)) {
						contador++;
					}
					linea = bufferedReader.readLine();
				}

				System.out.println("Cantidad de repeticiones del texto -> " + contador);
				bufferedReader.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		} else {
			System.out.println("El fichero ingresado no existe");
		}

	}
}

package cl.desafiolatamf20220105;

import java.io.File;
import java.io.IOException;

public class Archivo {

	public static void main(String[] args) {
		//crearDirectorio();
		crearArchivo();
	}

	public static void crearDirectorio() {
		File directorio = new File("gato/miau");
		//exists-> validar la existencia del directorio
		if(!directorio.exists()) {// valido si no existe
			//mkdir crear directorio
			directorio.mkdirs();
		}
		System.out.println("ejecutado...");
	}
	
	public static void crearArchivo() {
		File archivo = new File("gato/miau/ejemplo.txt");
		
		try {
			if(!archivo.exists()) {//SI No existe el archivo
				archivo.createNewFile();//creo el archivo
			}
			
		} catch (IOException e) {
			System.out.println("Error en la creacion del archivo");
		}
		
		System.out.println("ejecutado...");
	}
}

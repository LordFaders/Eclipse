package cl.desafiolatamf20220105;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class creacionDirectorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre que desea darle a su carpeta: ");
		String carpeta= sc.nextLine();
		System.out.println("Ingrese el nombre que desea darle a su archivo: ");
		String archivo= sc.nextLine();
		
		crearCarpetaArchivo(carpeta, archivo);

	}

	private static void crearCarpetaArchivo(String nombreCarpeta, String nombreArchivo) {
		File directorio = new File("src/"+nombreCarpeta);
		if (directorio.mkdirs()) {//mkdirs crea la carpeta o directorio
			System.out.println("El directorio fue creado exitosamente!");
			File archivo = new File("src/"+nombreCarpeta+"/"+nombreArchivo+".txt");
			if (!archivo.exists()) {
				try {
					if(archivo.createNewFile()){//crea el archivo
						System.out.println("El archivo fue creado con éxito!");
						
					}else {
						System.out.println("El archivo no se pudo crear");
					}
				} catch (IOException e) {
					System.out.println("Error al crear el archivo "+e.getMessage());
					//e.printStackTrace();
				}

			} else {
				System.out.println("El archivo ya existe");
			}

		} else {
			System.out.println("El directorio no pudo ser creado");
		}

	}

}

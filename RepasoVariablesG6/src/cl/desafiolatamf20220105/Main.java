package cl.desafiolatamf20220105;

import java.io.File;

public class Main {
	
	public static void main(String[]args) {
		File directorio = new File("src/miCarpeta");
		if(directorio.mkdirs()) {
			System.out.println("El directorio fue creado exitosamente!");
		}else {
			System.out.println("El directorio no pudo ser creado");
		}
	}

}

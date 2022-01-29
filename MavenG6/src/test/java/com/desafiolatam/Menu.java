package com.desafiolatam;

import java.util.Scanner;

public class Menu {
	public void menu1() {
	Scanner sc = new Scanner(System.in);
	int opcion = 0;

	ConsumirApi consumirApi = new ConsumirApi();

	do
	{
		System.out.println("¿Que desea hacer con la publicación");
		System.out.println("1 Mostrar");
		System.out.println("2 Actualizar");
		System.out.println("3 Eliminar");
		System.out.println("4 Agregar");
		System.out.println("Ingrese una opción:");
		opcion = sc.nextInt();
		sc.nextLine();

		switch (opcion) {
		case 1:
			consumirApi.obtenerApi();
			break;
		case 2:
			consumirApi.metodoPut();
			break;
		case 3:
			consumirApi.metodoDelete();
			break;
		case 4:
			consumirApi.metodoPost();
			break;
		}

	}while(opcion>=1&&opcion<=3);
}
}
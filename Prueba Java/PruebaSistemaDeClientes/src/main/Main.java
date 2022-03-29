package main;

import vista.Menu;
import vista.MenuTemplate;
/*
		 * [X] Creación de objetos (Cliente, categoríaEnum)
		 * [X] Creación de menúTemplate (clase vista)
		 * [X] Creación de Menú (clase vista)
		 * [X] Creación de utilidad (limpiar pantalla, enviar mensaje)
		 * [ ] Creación de clienteServicio (agregarCliente, listarCliente, editar Cliente)
		 * [X] Creación de archivoServicio (importar y exportar datos)
		 */

public class Main {

	public static void main(String[] args) {

		MenuTemplate menu = new Menu();

		menu.iniciarMenu();

	}
}

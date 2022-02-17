package vista;

import java.io.File;
import java.util.Scanner;

import Servicio.ArchivoServicio;
import Servicio.ClienteServicio;
import Servicio.ExportadorCsv;
import Servicio.ExportadorTxt;
import modelo.CategoriaEnum;
import modelo.Cliente;
import utilidad.Utilidad;

public class Menu extends MenuTemplate {

	private ClienteServicio clienteServicio = new ClienteServicio();
	private Utilidad utilidad = new Utilidad();
	private ArchivoServicio archivoServicio = new ArchivoServicio();
	private ExportadorCsv exportadorCsv = new ExportadorCsv();
	private ExportadorTxt exportadorTxt = new ExportadorTxt();

	String fileName = "Clientes";
	String fileName1 = "DBClientes.csv";

	Scanner scanner = new Scanner(System.in);

	@Override
	public void listarCliente() {

		clienteServicio.retornoListarClientes();
		System.out.println("--------------------------------------------");
	}

	@Override
	public void agregarCliente() {
		System.out.println("------------  Crear Cliente  -------------");
		System.out.println();

		System.out.println("Ingrese el RUT: ");
		String rut = scanner.nextLine();

		while (rut.isEmpty()) {
			System.out.println("Ingrese correctamente el RUT");
			rut = scanner.nextLine();
		}

		System.out.println("Datos ingresados correctamente.");
		System.out.println();

		System.out.println("Ingrese el Nombre: ");
		String nombre = scanner.nextLine();

		while (nombre.isEmpty()) {
			System.out.println("Ingrese correctamente el Nombre");
			nombre = scanner.nextLine();
		}

		System.out.println("Datos ingresados correctamente.");
		System.out.println();

		System.out.println("Ingrese el Apellido del Cliente: ");
		String apellido = scanner.nextLine();

		while (apellido.isEmpty()) {
			System.out.println("Ingrese correctamente el Apellido");
			apellido = scanner.nextLine();
		}

		System.out.println("Datos ingresados correctamente.");
		System.out.println();

		System.out.println("Ingrese los años como Cliente: ");
		String anios = scanner.nextLine();

		while (anios.isEmpty()) {
			System.out.println("Ingrese correctamente los años que tiene como Cliente");
			anios = scanner.nextLine();
		}

		System.out.println("Datos ingresados correctamente");
		System.out.println();

		System.out.println();
		System.out.println("--------------------------------------------");

		System.out.println();

		clienteServicio.agregarCliente(rut, nombre, apellido, anios, CategoriaEnum.ACTIVO);

	}

	@Override
	public void editarCliente() {
		System.out.println("-------------------------- Editar Cliente ------------------------");
		System.out.println("----------------------- Seleccione qué hacer ---------------------");
		System.out.println();
		System.out.println("1.-Cambiar estado del cliente\n" + "2.-Editar los datos ingresados del cliente");
		System.out.println();
		System.out.println("Ingrese opción:");
		System.out.println("------------------------------------------------------------------");
		int opcion = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Ingresa el RUN del cliente a modificar:");
		String runEditar = scanner.nextLine();

		for (Cliente clienteAEditar : clienteServicio.getListaClientes()) {
			if (clienteAEditar.getRutCliente().equals(runEditar)) {

				if (opcion == 1) {
					System.out.println(" Actualizando estado del Cliente ");
					System.out.println();
					System.out.println("El estado actual del cliente : " + clienteAEditar.getNombreCliente() + " "
							+ clienteAEditar.getApellidoCliente() + " es " + clienteAEditar.getCategoria());
					System.out.println();
					System.out.println("1.- Si desea cambiar el estado del cliente a Inactivo");
					System.out.println("2.- Si deseas mantener el estado del cliente como  Activo");
					int Estado = scanner.nextInt();
					scanner.nextLine();
					System.out.println();

					if (Estado == 1) {
						clienteAEditar.setCategoria(CategoriaEnum.INACTIVO);
						System.out.println("La categoría del cliente " + clienteAEditar.getNombreCliente() + " "
								+ clienteAEditar.getApellidoCliente() + " se cambió a INACTIVO.");
					} else if (Estado == 2) {
						clienteAEditar.setCategoria(CategoriaEnum.ACTIVO);
						System.out.println("El cliente " + clienteAEditar.getNombreCliente() + " "
								+ clienteAEditar.getApellidoCliente() + " mantuvo su categoría de ACTIVO.");
					} else {
						System.out.println("La opción ingresada no es válida.");
						break;
					}

				} else if (opcion == 2) {
					System.out.println("Actualizando los datos del Cliente ");
					System.out.println();
					System.out.println("Los datos actuales del cliente son:");
					System.out.println("RUT: " + clienteAEditar.getRutCliente());
					System.out.println("Nombre: " + clienteAEditar.getNombreCliente());
					System.out.println("Apellido: " + clienteAEditar.getApellidoCliente());
					System.out.println("Años como cliente: " + clienteAEditar.getAniosCliente());
					System.out.println("-----------------------------------");
					System.out.println();
					System.out.println("Ingrese una opción");
					System.out.println("1.- Si desea cambiar el RUT");
					System.out.println("2.- Si desea cambiar el nombre");
					System.out.println("3.- Si desea cambiar el apellido");
					System.out.println("4.- Si desea cambiar los años que lleva como cliente");
					System.out.println();
					int opcionEditar = scanner.nextInt();
					scanner.nextLine();

					if (opcionEditar == 1) {

						System.out.println("Ingrese el nuevo RUT de " + clienteAEditar.getNombreCliente() + " "
								+ clienteAEditar.getApellidoCliente());
						String nuevoRUT = scanner.nextLine();

						while (nuevoRUT.isEmpty()) {
							System.out.println("Ingrese otra vez el nuevo RUT el nuevo rut de "
									+ clienteAEditar.getNombreCliente() + " " + clienteAEditar.getApellidoCliente());
							nuevoRUT = scanner.nextLine();
						}

						clienteAEditar.setRutCliente(nuevoRUT);

						System.out.println();
						System.out.println("Datos ingresados correctamente");
						System.out.println("Datos Actualizados:");
						System.out.println();
						System.out.println("RUT: " + clienteAEditar.getRutCliente());
						System.out.println("Nombre: " + clienteAEditar.getNombreCliente());
						System.out.println("Apellido: " + clienteAEditar.getApellidoCliente());
						System.out.println("Años como cliente : " + clienteAEditar.getAniosCliente());
						System.out.println();
						System.out.println("---------------------------------");

					} else if (opcionEditar == 2) {
						System.out.println("Ingrese el nuevo nombre del cliente:" + clienteAEditar.getNombreCliente()
								+ " " + clienteAEditar.getApellidoCliente());
						String nuevoNombre = scanner.nextLine();
						while (nuevoNombre.isEmpty()) {
							System.out.println("Ingrese otra vez el nuevo nombre del cliente "
									+ clienteAEditar.getNombreCliente() + " " + clienteAEditar.getApellidoCliente());
							nuevoNombre = scanner.nextLine();
						}

						clienteAEditar.setNombreCliente(nuevoNombre);

						System.out.println();
						System.out.println("Datos ingresados correctamente");
						System.out.println("Datos Actualizados:");
						System.out.println();
						System.out.println("RUT: " + clienteAEditar.getRutCliente());
						System.out.println("Nombre: " + clienteAEditar.getNombreCliente());
						System.out.println("Apellido: " + clienteAEditar.getApellidoCliente());
						System.out.println("Años como cliente : " + clienteAEditar.getAniosCliente());
						System.out.println();
						System.out.println("---------------------------------");

					} else if (opcionEditar == 3) {
						System.out.println("Ingrese el nuevo apellido del cliente " + clienteAEditar.getNombreCliente()
								+ " " + clienteAEditar.getApellidoCliente());
						String nuevoApellido = scanner.nextLine();

						while (nuevoApellido.isEmpty()) {
							System.out.println("Ingrese otra vez el nuevo Apellido del cliente "
									+ clienteAEditar.getNombreCliente() + " " + clienteAEditar.getApellidoCliente());
							nuevoApellido = scanner.nextLine();
						}

						clienteAEditar.setApellidoCliente(nuevoApellido);

						System.out.println();
						System.out.println("Datos ingresados correctamente");
						System.out.println("Datos Actualizados:");
						System.out.println();
						System.out.println("RUT: " + clienteAEditar.getRutCliente());
						System.out.println("Nombre: " + clienteAEditar.getNombreCliente());
						System.out.println("Apellido: " + clienteAEditar.getApellidoCliente());
						System.out.println("Años como cliente : " + clienteAEditar.getAniosCliente());
						System.out.println();
						System.out.println("---------------------------------");

					} else if (opcionEditar == 4) {
						System.out.println("Ingrese la nueva cantidad de años como cliente de "
								+ clienteAEditar.getNombreCliente() + " " + clienteAEditar.getApellidoCliente());
						String nuevoAnio = scanner.nextLine();
						while (nuevoAnio.isEmpty()) {
							System.out.println("Ingrese otra vez la nueva cantidad de años como cliente de "
									+ clienteAEditar.getNombreCliente() + " " + clienteAEditar.getApellidoCliente());
							nuevoAnio = scanner.nextLine();
						}

						clienteAEditar.setAniosCliente(nuevoAnio);

						System.out.println();
						System.out.println("Datos ingresados correctamente");
						System.out.println("Datos Actualizados:");
						System.out.println();
						System.out.println("RUT: " + clienteAEditar.getRutCliente());
						System.out.println("Nombre: " + clienteAEditar.getNombreCliente());
						System.out.println("Apellido: " + clienteAEditar.getApellidoCliente());
						System.out.println("Años como cliente : " + clienteAEditar.getAniosCliente());
						System.out.println();
						System.out.println("---------------------------------");

					} else {
						System.out.println("La opción ingresada no es válida.");
						System.out.println();
						break;
					}

				} else {
					System.out.println("Volviendo al menú Principal ;)");
					System.out.println();
					break;
				}

			}

		}
	}

	@Override
	public void importarDatos() {
		System.out.println("-------------------- Cargar Datos en Linux o Mac ------------------");
		System.out.println();
		System.out.println("El formato de la ruta donde se encuentra el archivo DBClientes.csv es:");
		System.out.println();
		System.out.println("/Users/jaime/eclipse-workspace/SistemaDeClientes/src/");
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		System.out.println("------------------------- Cargar Datos en Windows ----------------------");
		System.out.println();
		System.out.println("EL formato de la ruta donde se encuentra el archivo DBClientes.csv es:");
		System.out.println();
		System.out.println("C:\\usuario/jaime/eclipse-workspace/SistemaDeClientes/src/");
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Ingrese al ruta adecuada según su sistema operativo:");

		String ruta = scanner.nextLine();

		while (ruta == null || ruta.isEmpty() || ruta.contains(" ")) {
			System.out.println("El nombre de la ruta no puede se nulo, estar vacío o contener espacios en blanco");
			System.out.println();
			System.out.println("Ingresa una ruta válida donde se encuentre el archivo" + fileName1);
			ruta = scanner.nextLine();
		}

		archivoServicio.cargarDatos(ruta, fileName1, clienteServicio.getListaClientes());
	}

	@Override
	public void exportarDatos() {

		System.out.println("----------- Exportar Archivo de Datos de Clientes -----------");
		System.out.println("Seleccionar el formato a exportar:");
		System.out.println();
		System.out.println("1.- Formato csv");
		System.out.println("2.- Formato txt");
		System.out.println();
		int opcionFormato = scanner.nextInt();
		scanner.nextLine();

		System.out.println("------------ Para exportar Datos en Linux o Mac -----------");
		System.out.println("Ingrese la ruta donde desea exortar el archivo clientes.csv");
		System.out.println("home/usuario/desktop");
		System.out.println();
		System.out.println("--------------- Para exportar Datos Windows ---------------");
		System.out.println("Ingrese la ruta donde desea exortar el archivo clientes.txt");
		System.out.print("C:\\usuario/equipo/desktop"); // Los slash de la ruta están al revés pero el IDE marca error
														// porque los reconoce como operadores.
		System.out.println();
		System.out.println("Ingrese el nombre de la carpeta donde deseae exportar el archivo");
		String Carpeta = scanner.nextLine();

		while (Carpeta == null || Carpeta.isEmpty() || Carpeta.contains(" ")) {
			System.out.println("Ingrese un nombre válido para la carpeta");
			Carpeta = scanner.nextLine();
		}

		File directorio = new File("archivosExportados/" + Carpeta);

		if (!directorio.exists()) {
			directorio.mkdirs();
			System.out.println("Carpeta creada exitosamente en " + directorio.toString());

			if (opcionFormato == 1) {
				exportadorCsv.exportar(directorio.toString(), fileName, clienteServicio.getListaClientes());
			}

			if (opcionFormato == 2) {
				exportadorTxt.exportar(directorio.toString(), fileName, clienteServicio.getListaClientes());
			}
			System.out.println("El archivo fue exportado exitosamente.");
		}
	}

	@Override
	public void terminarPrograma() {
		
		utilidad.mensajes();
		utilidad.timer();
		utilidad.limpiarPantalla();

	}

}

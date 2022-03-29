package servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import modelo.CategoriaCliente;
import modelo.CategoriaEnum;
import modelo.Cliente;

public class ArchivoServicioImp implements ArchivoServicio {

	@Override
	public ArrayList<Cliente> cargarDatos(String ruta) {

		ArrayList<Cliente> cargarClientes = new ArrayList<Cliente>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));

			String linea;
			while ((linea = reader.readLine()) != null) {
				String[] datosCliente = linea.split(",");
				String rut = datosCliente[0];

				if (cargarClientes.contains(rut)) {
					Cliente cliente = cargarClientes.get(0);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cargarClientes;

	}

	@Override
	public void exportarDatosCsv(ArrayList<Cliente> clientes, String ruta) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(ruta + "clientes.csv"));

			for (Cliente cliente : clientes) {
				String listaCliente = (cliente.getRutCliente() + "," + cliente.getNombreCliente() + ","
						+ cliente.getApellidoCliente() + "," + cliente.getAniosCliente() + " años,"
						+ CategoriaEnum.ACTIVO + "\n");
				writer.write(listaCliente);
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void exportarDatosTxt(Map<String, Cliente> clientes, String ruta) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(ruta + "clientes.txt"));

			clientes.entrySet().forEach(entry -> {
				try {
					Cliente cliente = entry.getValue();
					writer.write(cliente.getRutCliente() + "," + cliente.getNombreCliente() + ","
							+ cliente.getApellidoCliente() + "," + cliente.getAniosCliente() + " años,"
							+ CategoriaEnum.ACTIVO + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void exportarDatosCsv(Map<String, Cliente> clientes, String ruta) {
		// TODO Auto-generated method stub

	}

}

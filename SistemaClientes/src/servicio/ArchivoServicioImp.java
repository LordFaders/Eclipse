package servicio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import modelo.Cliente;

public class ArchivoServicioImp implements ArchivoServicio {

	@Override
	public void cargarDatos(String ruta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exportarDatosCsv(Map<String, Cliente> clientes, String ruta) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(ruta + "clientes.csv"));

			clientes.entrySet().forEach(entry -> {
				try {
					Cliente cliente = entry.getValue();
					writer.write("Cliente: " + cliente.getRutCliente() + "-" + cliente.getNombreCliente() + "-"
							+ cliente.getApellidoCliente() + cliente.getAniosCliente() + "-" + cliente.getCategoria());
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
	public void exportarDatosTxt(Map<String, Cliente> clientes, String ruta) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(ruta + "clientes.txt"));

			clientes.entrySet().forEach(entry -> {
				try {
					Cliente cliente = entry.getValue();
					writer.write("Cliente: " + cliente.getRutCliente() + "-" + cliente.getNombreCliente() + "-"
							+ cliente.getApellidoCliente() + cliente.getAniosCliente() + "-" + cliente.getCategoria());
				} catch (IOException e) {

					e.printStackTrace();
				}
			});
			writer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

package Automotora.Models;

public class MiniBus extends Bus {
	private String tipoViaje;
	public String imprimeBus;

	public MiniBus() {
		super();

	}

	public MiniBus(Integer cantidadDeAsientos) {
		super(cantidadDeAsientos);

	}

	public MiniBus(String tipoViaje) {
		super();
		this.tipoViaje = tipoViaje;
	}

	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}

	@Override
	public String toString() {
		return "MiniBus [tipoViaje=" + tipoViaje + "]";
	}

	public String imprimeBus() {
		
		
		System.out.println("Tipo de viaje: " + tipoViaje);
		System.out.println("Cantidad de asientos: " + getCantidadDeAsientos());
		System.out.println("Color: " + getColor());
		System.out.println("Patente: " + getPatente());
		return imprimeBus;

	}

}

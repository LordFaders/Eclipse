package Automotora.Models;

public class Bus extends Vehiculo {
	private int cantidadDeAsientos;

	public Bus() {
		super();
	}

	public Integer getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(Integer cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	public Bus(Integer cantidadDeAsientos) {
		super();
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	@Override
	public String toString() {
		return "Bus [cantidadDeAsientos=" + cantidadDeAsientos + "]";
	}

	public int asientosDisponibles(int asientos) {

		int asientosDisponibles = 0;
		if (asientos == cantidadDeAsientos) {
		} else if (cantidadDeAsientos > asientos) {
			asientosDisponibles = cantidadDeAsientos - asientos;
		} else if (asientos > cantidadDeAsientos) {
			System.out.println("Cantidad de asientos exedida.");
		} else {
			asientosDisponibles = asientos;
		}
		return asientosDisponibles;
	}

}

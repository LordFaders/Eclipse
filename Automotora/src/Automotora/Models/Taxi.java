package Automotora.Models;

public class Taxi {
	private int valorPasaje;

	public Taxi() {
		super();
	}

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}

	public Taxi(int valorPasaje) {
		super();
		this.valorPasaje = valorPasaje;
	}

	@Override
	public String toString() {
		return "Taxi [valorPasaje=" + valorPasaje + ", toString()=" + super.toString() + "]";
	}

	public int pagarPasaje(int pasaje) {

		System.out.println("Dinero recibido: " + pasaje);
		int vuelto = 0;
		if (pasaje == valorPasaje) {
			System.out.println("Quedamos cuadrados");
		} else if (pasaje > valorPasaje) {
			vuelto = pasaje - valorPasaje;
		} else {
			System.out.println("Le falta dinero");
			vuelto = pasaje;
		}
		return vuelto;
	}
	
}


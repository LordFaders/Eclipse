package cl.desafiolatam.f20220111.models;

public class Auto extends VehiculoParticular {
	private int cantPax;

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String patente, String marca, String modelo, String motor, String color, float velocidad,
			int cantidadRuedas, String tiporueda) {
		super(patente, marca, modelo, motor, color, velocidad, cantidadRuedas, tiporueda);
		// TODO Auto-generated constructor stub
	}

	public Auto(String tipocarroceria) {
		super(tipocarroceria);
		// TODO Auto-generated constructor stub
	}

	public int getCantPax() {
		return cantPax;
	}

	public void setCantPax(int cantPax) {
		this.cantPax = cantPax;
	}

	public Auto(int cantPax) {
		super();
		this.cantPax = cantPax;
	}

	@Override
	public String toString() {
		return "Auto [cantPax=" + cantPax + ", getTipocarroceria()=" + getTipocarroceria() + ", toString()="
				+ super.toString() + ", getPatente()=" + getPatente() + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getMotor()=" + getMotor() + ", getColor()=" + getColor() + ", getVelocidad()="
				+ getVelocidad() + ", getCantidadRuedas()=" + getCantidadRuedas() + ", getTiporueda()=" + getTiporueda()
				+ "]";
	}

	
	
	}
	
	



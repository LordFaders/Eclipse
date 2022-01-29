package cl.desafiolatam.f20220111.models;

public class VehiculoCarga extends Vehiculo {
	
	private float toneladas;

	public VehiculoCarga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehiculoCarga(String patente, String marca, String modelo, String motor, String color, float velocidad,
			int cantidadRuedas, String tiporueda) {
		super(patente, marca, modelo, motor, color, velocidad, cantidadRuedas, tiporueda);
		// TODO Auto-generated constructor stub
	}

	public float getToneladas() {
		return toneladas;
	}

	public void setToneladas(float toneladas) {
		this.toneladas = toneladas;
	}

	public VehiculoCarga(float toneladas) {
		super();
		this.toneladas = toneladas;
	}

	@Override
	public String toString() {
		return "VehiculoCarga [toneladas=" + toneladas + ", getPatente()=" + getPatente() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getMotor()=" + getMotor() + ", getColor()=" + getColor()
				+ ", getVelocidad()=" + getVelocidad() + ", getCantidadRuedas()=" + getCantidadRuedas()
				+ ", getTiporueda()=" + getTiporueda() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	

}

package cl.desafiolatam.f20220111.models;

public class VehiculoParticular extends Vehiculo {
	
	private String tipocarroceria;

	public VehiculoParticular() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehiculoParticular(String patente, String marca, String modelo, String motor, String color, float velocidad,
			int cantidadRuedas, String tiporueda) {
		super(patente, marca, modelo, motor, color, velocidad, cantidadRuedas, tiporueda);
		// TODO Auto-generated constructor stub
	}

	public String getTipocarroceria() {
		return tipocarroceria;
	}

	public void setTipocarroceria(String tipocarroceria) {
		this.tipocarroceria = tipocarroceria;
	}

	public VehiculoParticular(String tipocarroceria) {
		super();
		this.tipocarroceria = tipocarroceria;
	}

	@Override
	public String toString() {
		return "VehiculoParticular [tipocarroceria=" + tipocarroceria + ", getPatente()=" + getPatente()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getMotor()=" + getMotor()
				+ ", getColor()=" + getColor() + ", getVelocidad()=" + getVelocidad() + ", getCantidadRuedas()="
				+ getCantidadRuedas() + ", getTiporueda()=" + getTiporueda() + ", toString()=" + super.toString() + "]";
	}

	
	

}

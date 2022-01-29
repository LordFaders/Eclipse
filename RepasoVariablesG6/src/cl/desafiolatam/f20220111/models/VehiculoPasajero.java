package cl.desafiolatam.f20220111.models;

public class VehiculoPasajero extends Vehiculo{
	
	private String cantidadDePasajeros;
	private String recorrido;
	public VehiculoPasajero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehiculoPasajero(String patente, String marca, String modelo, String motor, String color, float velocidad,
			int cantidadRuedas, String tiporueda) {
		super(patente, marca, modelo, motor, color, velocidad, cantidadRuedas, tiporueda);
		// TODO Auto-generated constructor stub
	}
	public String getCantidadDePasajeros() {
		return cantidadDePasajeros;
	}
	public void setCantidadDePasajeros(String cantidadDePasajeros) {
		this.cantidadDePasajeros = cantidadDePasajeros;
	}
	public String getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(String recorrido) {
		this.recorrido = recorrido;
	}
	public VehiculoPasajero(String cantidadDePasajeros, String recorrido) {
		super();
		this.cantidadDePasajeros = cantidadDePasajeros;
		this.recorrido = recorrido;
	}
	@Override
	public String toString() {
		return "VehiculoPasajero [cantidadDePasajeros=" + cantidadDePasajeros + ", recorrido=" + recorrido
				+ ", getPatente()=" + getPatente() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getMotor()=" + getMotor() + ", getColor()=" + getColor() + ", getVelocidad()=" + getVelocidad()
				+ ", getCantidadRuedas()=" + getCantidadRuedas() + ", getTiporueda()=" + getTiporueda()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	}

	


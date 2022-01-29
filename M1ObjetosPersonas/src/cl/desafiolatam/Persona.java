package cl.desafiolatam;

public class Persona {

	private String nombreCompleto;
	private String correo;
	private int edad;

	public Persona() {
	}

	public Persona(String nombreCompleto, String correo, int edad) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.correo = correo;
		this.edad = edad;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", correo=" + correo + ", edad=" + edad + "]";
	}

}

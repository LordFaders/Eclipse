package mirando.El.Pasado.models;

public class Invitados {

	private String nombre;

	public Invitados() {
	}

	public Invitados(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Invitados [nombre=" + nombre + "]";
	}

}

package cl.desafiolatam.f20220113.models;

public class Perro extends Animal {

	private String raza;

	public Perro() {
		super();
	}

	public Perro(String raza) {
		super();
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", toString()=" + super.toString() + "]";
	}

}

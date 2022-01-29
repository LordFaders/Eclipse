package cl.desafiolatam.f20220113.models;

public class Animal {
	
	private String sexo;
	
	public Animal() {
		super();
		
	}

	public Animal(String sexo) {
		super();
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void emitirSonido() {
		System.out.println("cuac cuac");
	}

	@Override
	public String toString() {
		return "Animal [sexo=" + sexo + "]";
	}

	
	
}

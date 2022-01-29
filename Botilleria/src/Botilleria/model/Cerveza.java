package Botilleria.model;

public class Cerveza {
	private int precio;
	private Botella botella;
	
	public Cerveza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cerveza(int precio, Botella botella) {
		super();
		this.precio = precio;
		this.botella = botella;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Botella getBotella() {
		return botella;
	}

	public void setBotella(Botella botella) {
		this.botella = botella;
	}

	@Override
	public String toString() {
		return "Cerveza [precio=" + precio + ", botella=" + botella + "]";
	}

	
	
	

}

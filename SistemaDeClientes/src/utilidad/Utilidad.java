package utilidad;

public class Utilidad {

	public void limpiarPantalla() {
		for (int i = 0; i < 10; i++) {
			System.err.println("\n");
		}
	}

	public void timer() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Interrupción inesperada");
			e.printStackTrace();
		}
	}

	public void mensajes() {

		System.out.println("Saliendo del sistema de clientes");

	}
}
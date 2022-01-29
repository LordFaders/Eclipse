package reciclaJeans.general;

public class Utilidad {

	public void sleep() {

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void limpieza() {
		for (int i = 0; i < 10; i++) {
			System.out.println("\n");
		}

	}
}
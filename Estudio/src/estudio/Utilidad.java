package estudio;

import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Utilidad {

	public void sleep() {

		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

		final Runnable runnable = new Runnable() {
			int countDownStarter = 5;

			public void run() {

				System.out.println(countDownStarter);
				countDownStarter--;

				if (countDownStarter < 0) {
					System.out.println("Se acabó el tiempo");
					scheduler.shutdown();
				}    
			}
		};

		scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);

	}

	public void limpieza() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}

	}
}
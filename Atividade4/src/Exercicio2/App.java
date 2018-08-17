package Exercicio2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto("Guarulhos");
		aeroporto.start();
		ExecutorService executorService = Executors.newFixedThreadPool(3);		
		
		Runnable runTan123 = ()->{
			try {
				Aviao tan123 = new Aviao("TAN 123", aeroporto);
				tan123.decolar();
				tan123.voar();
				tan123.aterrissar();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		};

		Runnable runOle111 = ()->{
			try {
				Aviao ole111 = new Aviao("OLÉ 111", aeroporto);
				ole111.decolar();
				ole111.voar();
				ole111.aterrissar();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		};
		
		Runnable runLinha222 = ()->{
			try {
				Aviao linha222 = new Aviao("Linha 222", aeroporto);
				linha222.decolar();
				linha222.voar();
				linha222.aterrissar();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		};
		
		executorService.submit(runTan123);
		executorService.submit(runOle111);
		executorService.submit(runLinha222);
		
		try {
			executorService.awaitTermination(20, TimeUnit.SECONDS);
			System.exit(0);
		} catch (Exception e2) {
			e2.printStackTrace();
			System.out.println(e2.getMessage());
		}
		

	}

}

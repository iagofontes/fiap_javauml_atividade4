package Exercicio1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threads {

	public static ArrayList<String> mensagens = 
			new ArrayList<>();
	public static Integer i = 0;
	public static LocalDateTime ldt;
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm:ss");
		
		popularMensagens();

		Runnable runMensagem = ()->{
			while(Threads.i < Threads.mensagens.size()) {
				try {
					System.out.println(mensagens.get(i));
					Threads.i++;
					TimeUnit.SECONDS.sleep(5);
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}
			
		};
		
		Runnable runTempo = ()->{
			while(true) {
				try {
					ldt = LocalDateTime.now();
					System.out.println(ldt.format(dtf));
					TimeUnit.SECONDS.sleep(3);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(runMensagem);
		executorService.submit(runTempo);

	}
	
	public static void popularMensagens() {
		
		mensagens.add("Primeira mensagem");
		mensagens.add("Segunda mensagem");
		mensagens.add("Terceira mensagem");
		mensagens.add("Quarta mensagem");
		mensagens.add("Quinta mensagem");
		mensagens.add("Sexta mensagem");
		
	}

}

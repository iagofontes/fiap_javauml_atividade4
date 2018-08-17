package Exercicio2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Aeroporto extends Thread {

	private String nome;
	private boolean pistaLiberada;
	
	public Aeroporto(String nome) {
		this.nome = nome;
		this.pistaLiberada = true;
	}
	
	public boolean aguardarPistaDisponivel() {
		try {
			while(!this.pistaLiberada) {
				TimeUnit.SECONDS.sleep(1);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public void alterarEstadoPista() {
		this.pistaLiberada = !this.pistaLiberada;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				TimeUnit.SECONDS.sleep(2);
				alterarEstadoPista();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}

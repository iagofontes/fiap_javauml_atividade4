package Exercicio2;

import java.util.concurrent.TimeUnit;

public class Aviao extends Thread {

	private String voo;
	private Aeroporto aeroporto;
	
	public Aviao(String nome, Aeroporto aero) {
		this.voo = nome;
		this.aeroporto = aero;
	}
	
	public void decolar() {
		if(this.aeroporto.aguardarPistaDisponivel()) {
			System.out.println("Decolagem de "+this.voo);
		} else {
			System.out.println("Problemas ao aguardar pista.");
		}
	}
	public void aterrissar() {
		if(this.aeroporto.aguardarPistaDisponivel()) {
			System.out.println("Aterrissagem de "+this.voo);
		} else {
			System.out.println("Problemas ao aguardar pista.");
		}		
	}
	public void voar() {
		try {
			System.out.println(this.voo+" está em voo.");
			TimeUnit.SECONDS.sleep(2);
			System.out.println(this.voo+" finalizou o voo.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public String getVoo() {
		return voo;
	}

	public void setVoo(String voo) {
		this.voo = voo;
	}

	public Aeroporto getAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(Aeroporto aeroporto) {
		this.aeroporto = aeroporto;
	}
	
}

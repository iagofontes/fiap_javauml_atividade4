package Exercicio3;

public class App {
	
	public static void main(String[]args) {
		
		for(Cores cor : Cores.values()) {
			System.out.println(cor);
		}
		System.out.println("=================");
		System.out.println("Codigo da cor Branca: "+Cores.Branco.recuperaCodigoCor());
		System.out.println("=================");
		
	}
	
}

package Exercicio3;

public enum Cores {
	
	Branco("Branco", 21),
	Preto("Preto", 22),
	Vermelho("Vermelho", 23),
	Amarelo("Amarelo", 24),
	Azul("Azul", 25);
	
	private Integer codigo;
	private String nome;
	
	Cores(String nomeCor, Integer codCor) {
		this.codigo = codCor;
		this.nome = nomeCor;
	}
	
	public String recuperaNomeCor() {
		return this.nome;
	}
	
	public Integer recuperaCodigoCor() {
		return this.codigo;
	}
	
	@Override
	public String toString() {
		return "Código: "+this.codigo+", Nome: "+this.nome;
	}
}

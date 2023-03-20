public class Cachorro {
	
	private double peso;
	private int idade;
	private boolean acao;
	private String nome;

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isAcao() {
		return acao;
	}
	public void setAcao(boolean acao) {
		this.acao = acao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void latir() {
    	acao = true;
        System.out.println("AU AU AU!");
}
    public void rolar() {
    	acao = true;
        System.out.println("Estou rolando.");
}
}


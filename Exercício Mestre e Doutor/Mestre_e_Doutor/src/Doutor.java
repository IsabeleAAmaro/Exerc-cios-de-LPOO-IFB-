public class Doutor extends Pessoa {
	private String pronome;

	@Override
	public void MostrarNome() {
		System.out.println(nome);
	}
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPronome() {
		return pronome;
	}

	public void setPronome(String pronome) {
		this.pronome = pronome;
	}
	
	
	
}

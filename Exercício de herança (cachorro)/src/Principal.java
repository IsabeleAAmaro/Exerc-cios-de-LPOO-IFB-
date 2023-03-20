public class Principal {
	public static void main(String[] args) {
		
		//No petshop Java, há diversos animais sendo vendidos, entre eles há alguns chihuahuas.
		//que são um raça de cachorros com a mesma características que outros cachorros porém com alguns diferenciais. 
		//Todo cachorro nesse petshop tem um nome dado pelos funcionários, peso, idade e ações,
		//os chihuahuas além disso tudo, tremem, correm mais rápido que os outros cachorros e bricam bastante.
		//Baseado nisso, crie uma superclasse Cachorro e subclasse Chihuahua 
		//e declare atributos e métodos baseados nas informações dadas no enunciado.
		
		Chihuahua C1 = new Chihuahua();
		
		C1.setNome("Cassandra");
		C1.setIdade(1);
		C1.setPeso(1.5);
		
		C1.brincar();
		C1.correr();
		C1.latir();
		C1.tremer();
		C1.rolar();
	}
}

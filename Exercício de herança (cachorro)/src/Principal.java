public class Principal {
	public static void main(String[] args) {
		
		//No petshop Java, h� diversos animais sendo vendidos, entre eles h� alguns chihuahuas.
		//que s�o um ra�a de cachorros com a mesma caracter�sticas que outros cachorros por�m com alguns diferenciais. 
		//Todo cachorro nesse petshop tem um nome dado pelos funcion�rios, peso, idade e a��es,
		//os chihuahuas al�m disso tudo, tremem, correm mais r�pido que os outros cachorros e bricam bastante.
		//Baseado nisso, crie uma superclasse Cachorro e subclasse Chihuahua 
		//e declare atributos e m�todos baseados nas informa��es dadas no enunciado.
		
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

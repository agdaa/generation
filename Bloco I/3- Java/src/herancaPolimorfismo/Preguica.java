package herancaPolimorfismo;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		// incluir random com sons diferentes
		System.out.println("Aaaaaaaaahhhhh");
	} 
	
	@Override
	public void subirEmArvore () {
		System.out.println("escalando lentamente a árvore");
	}

}

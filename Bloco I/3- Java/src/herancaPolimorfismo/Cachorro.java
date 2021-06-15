package herancaPolimorfismo;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		// incluir random com sons diferentes
		System.out.println("Au Au Au");
	} 
	
	@Override
	public void correr() {
		System.out.println("correndo");
	}
}

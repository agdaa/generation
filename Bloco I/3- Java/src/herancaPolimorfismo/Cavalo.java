package herancaPolimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		// incluir random com sons diferentes
		System.out.println("(Relincho)");
	} 
	
	@Override
	public void correr() {
		System.out.println("trotando");
	}
}

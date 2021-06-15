package herancaPolimorfismo;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		Cachorro twix = new Cachorro("Twix", 4);
		Cavalo pocoto = new Cavalo("Pocot�", 15);
		Preguica soninho = new Preguica("Soninho", 20);
		
		String cachorro, cavalo, preguica;
		boolean acertou=false;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n -- Tr�s animais conversam...\n");
		System.out.print(twix.getNome()+": ");
		twix.emitirSom();
		System.out.print(soninho.getNome()+": ");
		soninho.emitirSom();
		System.out.print(pocoto.getNome()+": ");
		pocoto.emitirSom();

		ler.nextLine();
		
		System.out.println(" -- E depois cada um vai para seu lado...\n");
		System.out.print(twix.getNome()+" ");
		twix.correr();
		System.out.print(soninho.getNome()+" ");
		soninho.subirEmArvore();
		System.out.print(pocoto.getNome()+" ");
		pocoto.correr();

		ler.nextLine();
		while (acertou==false) {
		
		System.out.println(" -- Quais s�o os animais?");
		System.out.print(twix.getNome()+" > ");
		cachorro = ler.next();
		System.out.print(soninho.getNome()+" > ");
		preguica = ler.next();
		System.out.print(pocoto.getNome()+" > ");
		cavalo = ler.next();
		
		if (cachorro.equalsIgnoreCase("cachorro") && 
				preguica.equalsIgnoreCase("pregui�a") &&
				cavalo.equalsIgnoreCase("cavalo")) {
			acertou = true;
			System.out.println("\n\tVoc� acertou!");
		} else {
			System.out.println("\n\tAlgo est� errado. Tente novamente.\n");
		}
		
		}
		
		
	}

}

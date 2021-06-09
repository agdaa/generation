package orientacaoObjeto;

import java.util.Scanner;

public class TestarClasses {
	
	public static void main(String[] args) {

		int opcao;
		
		Scanner entrada = new Scanner(System.in); 
		TestarClasses teste = new TestarClasses();

		System.out.print("\nSelecione qual classe deseja testar:" + "\n(ZERO para sair)" + "\n\t1) Cliente"
				+ "\n\t2) Avi�o" + "\n\t3) Produto Eletr�nico" + "\n\t4) Funcion�rio" + "\n\t5) Patinete"
				+ "\n\t6) Conta Banc�ria" + "\n\t7) Paciente" + "\n>");

		opcao = entrada.nextInt();

		while (opcao != 0) {

			switch (opcao) {
			case 1:
				teste.testaCliente();
				break;
			case 2:
				teste.testaAviao();
				break;
			case 3:
				System.out.println("Em constru��o...");
				break;
			case 4:
				System.out.println("Em constru��o...");
				break;
			case 5:
				System.out.println("Em constru��o...");
				break;
			case 6:
				System.out.println("Em constru��o...");
				break;
			case 7:
				System.out.println("Em constru��o...");
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}

			System.out.println("________________");
			System.out.print("\nSelecione qual classe deseja testar:" + "\n(ZERO para sair)" + "\n\t1) Cliente"
					+ "\n\t2) Avi�o" + "\n\t3) Produto Eletr�nico" + "\n\t4) Funcion�rio" + "\n\t5) Patinete"
					+ "\n\t6) Conta Banc�ria" + "\n\t7) Paciente" + "\n\n>");

			opcao = entrada.nextInt();

		}

		System.out.println("Tchau!");

	}

	public void testaCliente() {

		Cliente novoCliente = new Cliente(123, "Agda", "agda@email.com");
		System.out.println(novoCliente.getNome() + ": " + novoCliente.getEmail());
	}

	public void testaAviao() {
		// (String model, String cia, int ano, int hsV)
		Scanner entrada = new Scanner(System.in); 
		Aviao novoAviao = new Aviao("Boing 404", "Azul", 2009, 10000);

		System.out.println("\nModelo: " + novoAviao.getModelo() + "\nCompanhia Aerea: " + novoAviao.getCompanhia()
				+ "\nAno de Fabrica��o: " + novoAviao.getAno() + "\nHoras de V�o: " + novoAviao.getHorasVoo());
		
		System.out.print("\nLiberar o avi�o para v�os? (S/N) ");
		String resposta = entrada.next();
		if(resposta=="S") {
		novoAviao.liberaAviao();}
		else if(resposta=="N") {
			System.out.print("\nAvi�o n�o est� liberado para v�o.");
		}else {
			System.out.print("\nResposta inv�lida.");
		}
	}

}

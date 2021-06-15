package colllections;

import java.util.*;

/* 
 * Crie uma um programa para trabalhar com estoque de uma loja, 
 * o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, 
 * o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */

public class Estoque {
	// ArrayList<String> produtos = new ArrayList<String>();

	public static void main(String[] args) {

		List<String> produtos = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		String digitado, remover;
		int op;

		do {
			System.out.println("\n _______________________________");
			
			System.out.println("\n(1) Registrar produtos no estoque" + "\n(2) Mostrar todos os produtos"
					+ "\n(3) Remover um produto" + "\n(4) Atualizar um produto \n ZERO para sair");
			System.out.print("\n > ");

			try {
				op = entrada.nextInt();
			} catch (Exception excecao) {
				op = -1;
			}

			Estoque e = new Estoque();

			switch (op) {
			case 1:
				entrada.nextLine();
				System.out.println("\nDigite os produtos: (ZERO para encerrar) ");
				System.out.print("\n> ");
				digitado = entrada.next();

				while (!digitado.equals("0")) {

					produtos.add(digitado);

					System.out.print("> ");
					digitado = entrada.next();
				}
				break;
			case 2:
				entrada.nextLine();
				e.mostrarProdutos(produtos);
				break;
			case 3:
				entrada.nextLine();
				System.out.print("\nDigite produto para remover: \n>");
				e.removerProduto(produtos, entrada.next());
				break;
			case 4:
				entrada.nextLine();
				System.out.print("\nSubstituir produto: ");
				String atual = entrada.next();
				System.out.print(" por: ");
				String novo = entrada.next();
				e.atualizarProduto(produtos, atual, novo);
				break;
			case 0:
				entrada.nextLine();
				System.out.println("\nTchau!");
				break;
			default:
				entrada.nextLine();
				System.out.println("\nOpção inválida.");
				break;
			}
		} while (op != 0);

	}

	public void mostrarProdutos(List<String> produtos) {

		System.out.println("\nProdutos no estoque: ");
		for (String item : produtos) {
			System.out.print("\n" + (produtos.indexOf(item) + 1) + ") " + item);
		}
	}

	public void removerProduto(List<String> produtos, String p) {
		if (produtos.contains(p)) {
			produtos.remove(p);
		} else {
			System.out.println("\nProduto não existe.");
		}
	}

	public void atualizarProduto(List<String> produtos, String p, String n) {
		if (produtos.contains(p)) {
			produtos.remove(p);
			produtos.add(n);
		} else {
			System.out.println("\nProduto não existe.");
		}

	}

}

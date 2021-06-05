/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 */
package repeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		int num, somaMultTres = 0, contMultTres = 0, mediaMultTres;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira n�meros: \n(ZERO para sair)");

		System.out.print("> ");
		num = entrada.nextInt();

		do {
			if (num != 0) {
				if (num % 3 == 0) {
					somaMultTres = somaMultTres + num;
					contMultTres++;
				}
				System.out.print("> ");
				num = entrada.nextInt();
			}
		} while (num != 0);

		try {
			mediaMultTres = somaMultTres / contMultTres;
			System.out.println("\nM�dia dos multiplos de 3 inseridos: " + mediaMultTres);
		} catch (Exception e) {
			System.out.println("\nNenhum m�ltiplo de 3 foi inserido.");
		}

	}

}

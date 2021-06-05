/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */

package repeticao;

import java.util.Scanner;

public class Ex5 {
	
	public static void main (String[] args ) {
		int num, soma=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira n�meros: \n(ZERO para sair)\n");
		
		System.out.print("> ");
		num = entrada.nextInt();
		
		do {	
			if(num!=0) {
				soma = soma + num;
				System.out.print("> ");
				num = entrada.nextInt();
			}
						
		} while (num!=0);
		
		System.out.println("\nSoma dos n�meros inseridos: "+soma);
		
	}
}

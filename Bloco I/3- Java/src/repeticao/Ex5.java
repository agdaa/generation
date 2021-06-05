/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
 */

package repeticao;

import java.util.Scanner;

public class Ex5 {
	
	public static void main (String[] args ) {
		int num, soma=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira números: \n(ZERO para sair)\n");
		
		System.out.print("> ");
		num = entrada.nextInt();
		
		do {	
			if(num!=0) {
				soma = soma + num;
				System.out.print("> ");
				num = entrada.nextInt();
			}
						
		} while (num!=0);
		
		System.out.println("\nSoma dos números inseridos: "+soma);
		
	}
}

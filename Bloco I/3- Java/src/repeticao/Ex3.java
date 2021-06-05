/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

package repeticao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int idade = 0, cont21 = 0, cont50 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira idades:");
		
		while(idade != -99) {
			System.out.print("> ");
			idade = entrada.nextInt();
			if(idade<21 && idade>=0) {
				cont21++;
			} else if (idade>50) {
				cont50++;
			}
		}
		
		System.out.printf("\n%d pessoas com menos de 21 anos.\n%d pessoas com mais de 50 anos.", cont21, cont50);

	}

}

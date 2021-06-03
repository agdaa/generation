/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

package condicionais;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int num1, num2, num3, maior;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira 3 números: ");
		System.out.print("> ");
		num1 = entrada.nextInt();
		System.out.print("> ");
		num2 = entrada.nextInt();
		System.out.print("> ");
		num3 = entrada.nextInt();
		
		if (num1>num2 && num1>num3) {
			maior = num1;
		} else if (num2>num1 && num2>num3) {
			maior = num2;
		} else {
			maior = num3;
		}
		
		System.out.println("\n"+maior+" é o maior número.");

	}

}

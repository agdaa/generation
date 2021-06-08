/*
 * Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.
 */

package arrays;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		final int y = 6;
		int [] numeros, pares, impares;
		int somaPar = 0, qtdPar = 0, qtdImpar = 0;
		
		numeros = new int[y];
		pares = new int[y];
		impares = new int[y];
		
		Scanner entrada = new Scanner(System.in);
		
		for( int i : numeros) {
			numeros[i] = entrada.nextInt();
			
			if (numeros[i]%2==0) {
				somaPar = somaPar + numeros[i];
				pares[qtdPar] = numeros[i];
				qtdPar++;
			} else {
				impares[qtdImpar] = numeros[i];
				qtdImpar++;
			}
		}
		
		System.out.print("\nPares:");
			
		for (int x=0; x<qtdPar; x++) {
			System.out.print(" "+pares[x]);
		}
		
		System.out.println("\nSoma dos Pares: "+somaPar);
		
		
		System.out.print("\nÍmpares:");
		
		for (int x=0; x<qtdImpar; x++) {
			System.out.print(" "+impares[x]);
		}
		
		System.out.println("\nQuantidade de Ímpares: "+qtdImpar);

	}

}

/*
 * Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.
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
		
		
		System.out.print("\n�mpares:");
		
		for (int x=0; x<qtdImpar; x++) {
			System.out.print(" "+impares[x]);
		}
		
		System.out.println("\nQuantidade de �mpares: "+qtdImpar);

	}

}

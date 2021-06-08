/*
 * Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
 * O programa deve executar os seguintes passos:
 */
package arrays;

public class Ex1 {

	public static void main(String[] args) {
		
		//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		
		int[] A = {1,0,5,-2,-5,7};
		int soma = 0, x;
		
		/* (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições 
		A[0], A[1] e A[5] do vetor e mostre na tela esta soma.*/
		
		for (x=0; x<=A.length-1; x++) {
			
			if (x==0 || x==1 || x==5) {
				soma = soma + A[x];
			}
		}
		
		System.out.println("Soma: "+soma);
		
		//(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
		
		A[4] = 100;

		//(d) Mostre na tela cada valor do vetor A, um em cada linha.

		for (x=0; x<=A.length-1; x++) {
			System.out.println("A["+ x +"] = "+A[x]);
		}
	}
}
